package yash.example.quote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textQuot;
    Button buttonQuot;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textQuot = findViewById(R.id.textViewNextQuote);
        buttonQuot = findViewById(R.id.buttonNextQuote);

        buttonQuot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayQuote();
            }
        });
        displayQuote();
    }
    public void displayQuote(){
        //random number between 1 and 10(both inclusive)
        int randNum = random.nextInt((10+1)-1) + 1;
        String randQuote = "";

        switch (randNum){
            case 1 :
                randQuote = getString(R.string.quote1);
                break;
            case 2 :
                randQuote = getString(R.string.quote2);
                break;
            case 3 :
                randQuote = getString(R.string.quote3);
                break;
            case 4 :
                randQuote = getString(R.string.quote4);
                break;
            case 5 :
                randQuote = getString(R.string.quote5);
                break;
            case 6 :
                randQuote = getString(R.string.quote6);
                break;
            case 7 :
                randQuote = getString(R.string.quote7);
                break;
            case 8 :
                randQuote = getString(R.string.quote8);
                break;
            case 9 :
                randQuote = getString(R.string.quote9);
                break;
            case 10 :
                randQuote = getString(R.string.quote10);
                break;

        }

        textQuot.setText(randQuote);
    }
}
