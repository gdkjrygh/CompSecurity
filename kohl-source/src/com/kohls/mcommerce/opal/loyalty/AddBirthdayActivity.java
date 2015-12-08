// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.kohls.mcommerce.opal.wallet.asynctask.UpdateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;
import java.util.Calendar;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            RewardsAddressActivity

public class AddBirthdayActivity extends Activity
    implements DataActionListener
{

    private EditText birthdayEditTxt;
    private int day;
    private int month;
    private android.app.DatePickerDialog.OnDateSetListener pickerListener;
    private int year;

    public AddBirthdayActivity()
    {
        pickerListener = new android.app.DatePickerDialog.OnDateSetListener() {

            final AddBirthdayActivity this$0;

            public void onDateSet(DatePicker datepicker, int i, int j, int k)
            {
                year = i;
                month = j;
                day = k;
                birthdayEditTxt.setText(DateUtils.prepareBirthDate((new StringBuilder()).append(year).append("-").append(month + 1).append("-").append(day).toString()));
            }

            
            {
                this$0 = AddBirthdayActivity.this;
                super();
            }
        };
    }

    private void displayErrorDialog(String s)
    {
        Intent intent = (new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x10020000);
        intent.putExtra("ServerError", s);
        startActivity(intent);
    }

    private void hideprogressView()
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
        ((EditText)findViewById(0x7f0d0031)).setVisibility(0);
    }

    private void showProgressView()
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(0);
        ((EditText)findViewById(0x7f0d0031)).setVisibility(8);
    }

    public void onActionPerformed(Object obj)
    {
        ListenerManager.getInstance().unRegisterListener("updateloyaltydata", this);
        startActivity(new Intent(this, com/kohls/mcommerce/opal/loyalty/RewardsAddressActivity));
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000a);
        hideprogressView();
        bundle = Calendar.getInstance();
        year = bundle.get(1);
        month = bundle.get(2);
        day = bundle.get(5);
        birthdayEditTxt = (EditText)findViewById(0x7f0d0031);
        birthdayEditTxt.setOnClickListener(new android.view.View.OnClickListener() {

            final AddBirthdayActivity this$0;

            public void onClick(View view)
            {
                (new DatePickerDialog(AddBirthdayActivity.this, pickerListener, year, month, day)).show();
            }

            
            {
                this$0 = AddBirthdayActivity.this;
                super();
            }
        });
        OmnitureMeasurement.getInstance().setRewardsBirthdayEvents();
        setUpActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100004, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d06f5)
        {
            menuitem = getCurrentFocus();
            if (menuitem != null)
            {
                ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(menuitem.getWindowToken(), 0);
            }
            showProgressView();
            menuitem = ((EditText)findViewById(0x7f0d0031)).getText().toString();
            if (TextUtils.isEmpty(menuitem) || menuitem.equalsIgnoreCase(((EditText)findViewById(0x7f0d0031)).getHint().toString()))
            {
                hideprogressView();
                displayErrorDialog("Some information is missing or invalid.");
                return false;
            } else
            {
                menuitem = new ProfileData();
                menuitem.setBirthday((new StringBuilder()).append(year).append("-").append(month + 1).append("-").append(day).toString());
                ListenerManager.getInstance().registerListener(this, "updateloyaltydata");
                (new UpdateLoyaltyProfileTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
                    menuitem
                });
                findViewById(0x7f0d06f5).setEnabled(false);
                findViewById(0x7f0d06f5).setClickable(false);
                return true;
            }
        } else
        {
            onBackPressed();
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }




/*
    static int access$102(AddBirthdayActivity addbirthdayactivity, int i)
    {
        addbirthdayactivity.year = i;
        return i;
    }

*/



/*
    static int access$202(AddBirthdayActivity addbirthdayactivity, int i)
    {
        addbirthdayactivity.month = i;
        return i;
    }

*/



/*
    static int access$302(AddBirthdayActivity addbirthdayactivity, int i)
    {
        addbirthdayactivity.day = i;
        return i;
    }

*/

}
