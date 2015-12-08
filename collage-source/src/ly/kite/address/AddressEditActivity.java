// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import java.util.Locale;
import ly.kite.journey.AKiteActivity;

// Referenced classes of package ly.kite.address:
//            Address, Country

public class AddressEditActivity extends AKiteActivity
    implements android.view.View.OnClickListener
{

    public static final String EXTRA_ADDRESS = "ly.kite.EXTRA_ADDRESS";
    private Address address;
    private EditText mAddressCityEditText;
    private EditText mAddressCountyEditText;
    private EditText mAddressLine1EditText;
    private EditText mAddressLine2EditText;
    private EditText mAddressPostcodeEditText;
    private Button mProceedButton;
    private EditText mRecipientNameEditText;

    public AddressEditActivity()
    {
    }

    public void onClick(View view)
    {
        if (view == mProceedButton)
        {
            onSaveClicked();
        }
    }

    public void onCreate(final Bundle countries)
    {
        super.onCreate(countries);
        setContentView(ly.kite.R.layout.screen_address_edit);
        mRecipientNameEditText = (EditText)findViewById(ly.kite.R.id.edit_text_recipient_name);
        mAddressLine1EditText = (EditText)findViewById(ly.kite.R.id.edit_text_address_line1);
        mAddressLine2EditText = (EditText)findViewById(ly.kite.R.id.edit_text_address_line2);
        mAddressCityEditText = (EditText)findViewById(ly.kite.R.id.edit_text_address_city);
        mAddressCountyEditText = (EditText)findViewById(ly.kite.R.id.edit_text_address_county);
        mAddressPostcodeEditText = (EditText)findViewById(ly.kite.R.id.edit_text_address_postcode);
        mProceedButton = (Button)findViewById(ly.kite.R.id.proceed_overlay_button);
        address = (Address)getIntent().getParcelableExtra("ly.kite.EXTRA_ADDRESS");
        Spinner spinner;
        int i;
        if (address != null)
        {
            setTitle(ly.kite.R.string.title_activity_address_edit);
        } else
        {
            setTitle(ly.kite.R.string.manual_add_address);
            address = new Address();
            address.setCountry(Country.getInstance(Locale.getDefault()));
        }
        mRecipientNameEditText.setText(address.getRecipientName());
        mAddressLine1EditText.setText(address.getLine1());
        mAddressLine2EditText.setText(address.getLine2());
        mAddressCityEditText.setText(address.getCity());
        mAddressCountyEditText.setText(address.getStateOrCounty());
        mAddressPostcodeEditText.setText(address.getZipOrPostalCode());
        countries = Country.values();
        i = address.getCountry().ordinal();
        spinner = (Spinner)findViewById(ly.kite.R.id.spinner_country);
        spinner.setAdapter(new ArrayAdapter(this, 0x1090009, countries));
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final AddressEditActivity this$0;
            final Country val$countries[];

            public void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                if (l >= 0L && l < (long)countries.length)
                {
                    adapterview = countries[(int)l];
                    address.setCountry(adapterview);
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = AddressEditActivity.this;
                countries = acountry;
                super();
            }
        });
        spinner.setSelection(i);
        mProceedButton.setText(ly.kite.R.string.address_edit_proceed_button_text);
        getWindow().setSoftInputMode(3);
        mProceedButton.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(ly.kite.R.menu.address_edit, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == ly.kite.R.id.action_save)
        {
            onSaveClicked();
            return true;
        }
        if (i == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onSaveClicked()
    {
        Object obj = mRecipientNameEditText.getText().toString();
        if (((String) (obj)).trim().length() == 0)
        {
            displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, ly.kite.R.string.alert_dialog_message_no_recipient, ly.kite.R.string.OK, null, 0, null);
            return;
        }
        String s = mAddressLine1EditText.getText().toString();
        if (s.trim().length() == 0)
        {
            displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, ly.kite.R.string.alert_dialog_message_no_line1, ly.kite.R.string.OK, null, 0, null);
            return;
        }
        String s1 = mAddressPostcodeEditText.getText().toString();
        if (s1.trim().length() == 0)
        {
            displayModalDialog(ly.kite.R.string.alert_dialog_title_oops, ly.kite.R.string.alert_dialog_message_no_postal_code, ly.kite.R.string.OK, null, 0, null);
            return;
        } else
        {
            address.setRecipientName(((String) (obj)));
            address.setLine1(s);
            address.setLine2(mAddressLine2EditText.getText().toString());
            address.setCity(mAddressCityEditText.getText().toString());
            address.setStateOrCounty(mAddressCountyEditText.getText().toString());
            address.setZipOrPostalCode(s1);
            obj = new Intent();
            ((Intent) (obj)).putExtra("ly.kite.EXTRA_ADDRESS", address);
            setResult(-1, ((Intent) (obj)));
            finish();
            return;
        }
    }

}
