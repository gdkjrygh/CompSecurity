// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.asynctask.UpdateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;

public class EditRewardsPhoneActivity extends Activity
    implements DataActionListener
{

    private boolean mDelPressed;
    ProfileData mProfileData;

    public EditRewardsPhoneActivity()
    {
        mDelPressed = false;
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
        ((Spinner)findViewById(0x7f0d0059)).setVisibility(0);
        ((EditText)findViewById(0x7f0d005a)).setVisibility(0);
    }

    private void showProgressView()
    {
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(0);
        ((Spinner)findViewById(0x7f0d0059)).setVisibility(8);
        ((EditText)findViewById(0x7f0d005a)).setVisibility(8);
    }

    public void onActionPerformed(Object obj)
    {
        ListenerManager.getInstance().unRegisterListener("updateloyaltydata", this);
        obj = new Bundle();
        ((Bundle) (obj)).putSerializable("address_data", mProfileData);
        Intent intent = new Intent();
        intent.putExtras(((Bundle) (obj)));
        setResult(-1, intent);
        finish();
    }

    public void onBackPressed()
    {
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03000e);
        final EditText phoneEditTxt = (EditText)findViewById(0x7f0d005a);
        bundle = (Spinner)findViewById(0x7f0d0059);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
        mProfileData = (ProfileData)getIntent().getSerializableExtra("address_data");
        if (mProfileData != null)
        {
            String s = mProfileData.getPhoneNumber();
            if (!TextUtils.isEmpty(s))
            {
                phoneEditTxt.setText((new StringBuilder()).append("(").append(s.substring(0, 3)).append(")").append(s.substring(3, 6)).append("-").append(s.substring(6)).toString());
                phoneEditTxt.setSelection(phoneEditTxt.getText().toString().length(), phoneEditTxt.getText().toString().length());
            }
        }
        phoneEditTxt.addTextChangedListener(new TextWatcher() {

            final EditRewardsPhoneActivity this$0;
            final EditText val$phoneEditTxt;

            public void afterTextChanged(Editable editable)
            {
                mDelPressed = false;
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (phoneEditTxt.getText().length() == 0)
                {
                    mDelPressed = false;
                }
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                charsequence = phoneEditTxt.getText().toString();
                i = phoneEditTxt.getText().length();
                if (!mDelPressed)
                {
                    if (i == 1)
                    {
                        phoneEditTxt.setText((new StringBuilder()).append("(").append(charsequence).toString());
                    }
                    if (i == 4)
                    {
                        phoneEditTxt.setText((new StringBuilder()).append(charsequence).append(")").toString());
                    }
                    if (i == 8)
                    {
                        phoneEditTxt.setText((new StringBuilder()).append(charsequence).append("-").toString());
                    }
                    phoneEditTxt.setSelection(phoneEditTxt.getText().toString().length(), phoneEditTxt.getText().toString().length());
                }
            }

            
            {
                this$0 = EditRewardsPhoneActivity.this;
                phoneEditTxt = edittext;
                super();
            }
        });
        phoneEditTxt.setOnKeyListener(new android.view.View.OnKeyListener() {

            final EditRewardsPhoneActivity this$0;

            public boolean onKey(View view, int i, KeyEvent keyevent)
            {
                switch (i)
                {
                default:
                    mDelPressed = false;
                    return false;

                case 67: // 'C'
                    mDelPressed = true;
                    break;
                }
                return false;
            }

            
            {
                this$0 = EditRewardsPhoneActivity.this;
                super();
            }
        });
        phoneEditTxt = new ArrayAdapter(this, 0x109000a, getResources().getStringArray(0x7f0a0011));
        phoneEditTxt.setDropDownViewResource(0x7f030106);
        bundle.setAdapter(phoneEditTxt);
        phoneEditTxt = mProfileData.getPhoneNumberType();
        if (!TextUtils.isEmpty(phoneEditTxt))
        {
            if (phoneEditTxt.equalsIgnoreCase(getResources().getStringArray(0x7f0a0011)[1]))
            {
                bundle.setSelection(1);
            } else
            {
                bundle.setSelection(0);
            }
        }
        bundle.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final EditRewardsPhoneActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsPhoneActivity.this, 0x7f0f001e);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsPhoneActivity.this, 0x7f0f001e);
            }

            
            {
                this$0 = EditRewardsPhoneActivity.this;
                super();
            }
        });
        OmnitureMeasurement.getInstance().setEditRewardsPhoneEvents();
        setUpActionBar();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100004, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x7f0d06f5)
        {
            menuitem = getCurrentFocus();
            if (menuitem != null)
            {
                ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(menuitem.getWindowToken(), 0);
            }
            showProgressView();
            menuitem = ((EditText)findViewById(0x7f0d005a)).getText().toString();
            if (TextUtils.isEmpty(menuitem) || menuitem.equalsIgnoreCase(((EditText)findViewById(0x7f0d005a)).getHint().toString()))
            {
                hideprogressView();
                displayErrorDialog("Some information is missing or invalid.");
                return false;
            }
            if (!TextUtils.isEmpty(menuitem) && menuitem.length() < 13)
            {
                hideprogressView();
                displayErrorDialog("Please use the correct format for your phone number.");
                return false;
            }
            menuitem = (new StringBuilder()).append(menuitem.substring(1, 4)).append(menuitem.substring(5, 8)).append(menuitem.substring(9)).toString();
            if (!TextUtils.isDigitsOnly(menuitem))
            {
                hideprogressView();
                displayErrorDialog("Some information is missing or invalid.");
                return false;
            } else
            {
                mProfileData.setPhoneNumberType(((Spinner)findViewById(0x7f0d0059)).getSelectedItem().toString());
                mProfileData.setPhoneNumber(menuitem);
                ListenerManager.getInstance().registerListener(this, "updateloyaltydata");
                (new UpdateLoyaltyProfileTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
                    mProfileData
                });
                findViewById(0x7f0d06f5).setEnabled(false);
                findViewById(0x7f0d06f5).setClickable(false);
                return true;
            }
        }
        if (i == 0x102002c)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeButtonEnabled(true);
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }



/*
    static boolean access$002(EditRewardsPhoneActivity editrewardsphoneactivity, boolean flag)
    {
        editrewardsphoneactivity.mDelPressed = flag;
        return flag;
    }

*/
}
