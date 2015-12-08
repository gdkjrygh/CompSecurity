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
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.common.value.ConstantValues;
import com.kohls.mcommerce.opal.wallet.asynctask.UpdateLoyaltyProfileTask;
import com.kohls.mcommerce.opal.wallet.manager.DataActionListener;
import com.kohls.mcommerce.opal.wallet.manager.ListenerManager;
import com.kohls.mcommerce.opal.wallet.rest.containers.Address;
import com.kohls.mcommerce.opal.wallet.rest.containers.ProfileData;
import com.kohls.mcommerce.opal.wallet.util.Constants;
import com.kohls.mcommerce.opal.wallet.util.DisplayErrorDialog;
import com.kohls.mcommerce.opal.wallet.util.OmnitureMeasurement;

public class EditRewardsAddressActivity extends Activity
    implements DataActionListener
{

    private ProfileData mAddressData;
    private Address mPOAddressData;
    private Address mUSAddressData;

    public EditRewardsAddressActivity()
    {
    }

    private void displayErrorDialog(String s)
    {
        Intent intent = (new Intent(getApplicationContext(), com/kohls/mcommerce/opal/wallet/util/DisplayErrorDialog)).setFlags(0x10020000);
        intent.putExtra("ServerError", s);
        startActivity(intent);
    }

    private int getSelectionIdx(String as[], String s)
    {
        for (int i = 0; i < as.length; i++)
        {
            if (as[i].equalsIgnoreCase(s))
            {
                return i;
            }
        }

        return as.length - 1;
    }

    private boolean isAddrFieldEmpty(String s)
    {
        return !TextUtils.isEmpty(s) && s.equalsIgnoreCase(" ");
    }

    private boolean isDefultView()
    {
        mAddressData = (ProfileData)getIntent().getSerializableExtra("address_data");
        if (mAddressData != null && mAddressData.getAddress() != null && (mAddressData.getAddress().getCity().equals(Constants.poType[1]) || mAddressData.getAddress().getCity().equals(Constants.poType[2]) || mAddressData.getAddress().getCity().equals(Constants.poType[3])))
        {
            mPOAddressData = mAddressData.getAddress();
            return false;
        } else
        {
            mUSAddressData = mAddressData.getAddress();
            return true;
        }
    }

    private void populatePOData()
    {
        mPOAddressData.setAddr1(((EditText)findViewById(0x7f0d0054)).getText().toString());
        mPOAddressData.setAddr2(((EditText)findViewById(0x7f0d0055)).getText().toString());
        mPOAddressData.setPostalCode(((EditText)findViewById(0x7f0d0058)).getText().toString());
        if (((Spinner)findViewById(0x7f0d0056)).getSelectedItem() != null)
        {
            mPOAddressData.setCity(Constants.poType[((Spinner)findViewById(0x7f0d0056)).getSelectedItemPosition()]);
        }
        if (((Spinner)findViewById(0x7f0d0057)).getSelectedItem() != null)
        {
            mPOAddressData.setState(Constants.stateCode[((Spinner)findViewById(0x7f0d0057)).getSelectedItemPosition()]);
        }
    }

    private void populateUSData()
    {
        mUSAddressData.setAddr1(((EditText)findViewById(0x7f0d004e)).getText().toString());
        mUSAddressData.setAddr2(((EditText)findViewById(0x7f0d004f)).getText().toString());
        mUSAddressData.setCity(((EditText)findViewById(0x7f0d0050)).getText().toString());
        mUSAddressData.setPostalCode(((EditText)findViewById(0x7f0d0052)).getText().toString());
        if (((Spinner)findViewById(0x7f0d0051)).getSelectedItem() != null)
        {
            mUSAddressData.setState(ConstantValues.STATES_CODE[((Spinner)findViewById(0x7f0d0051)).getSelectedItemPosition()]);
        }
    }

    private boolean savePOAddress(ProfileData profiledata)
    {
        Address address = new Address();
        String s = ((EditText)findViewById(0x7f0d0054)).getText().toString();
        if (!TextUtils.isEmpty(s))
        {
            address.setAddr1(s);
            s = ((EditText)findViewById(0x7f0d0055)).getText().toString();
            if (!TextUtils.isEmpty(s))
            {
                address.setAddr2(s);
            }
            s = Constants.poType[((Spinner)findViewById(0x7f0d0056)).getSelectedItemPosition()];
            if (!TextUtils.isEmpty(s))
            {
                address.setCity(s);
                s = Constants.stateCode[((Spinner)findViewById(0x7f0d0057)).getSelectedItemPosition()];
                if (!TextUtils.isEmpty(s))
                {
                    address.setState(s);
                    s = ((TextView)findViewById(0x7f0d0058)).getText().toString();
                    if (!TextUtils.isEmpty(s) && s.length() == 5)
                    {
                        profiledata.setPostalCode(s);
                        profiledata.setAddress(address);
                        return true;
                    } else
                    {
                        displayErrorDialog("Some information is missing or invalid.");
                        return false;
                    }
                } else
                {
                    displayErrorDialog("Some information is missing or invalid.");
                    return false;
                }
            } else
            {
                displayErrorDialog("Some information is missing or invalid.");
                return false;
            }
        } else
        {
            displayErrorDialog("Some information is missing or invalid.");
            return false;
        }
    }

    private boolean saveUSAddress(ProfileData profiledata)
    {
        Address address = new Address();
        String s = ((EditText)findViewById(0x7f0d004e)).getText().toString();
        if (!TextUtils.isEmpty(s))
        {
            address.setAddr1(s);
            s = ((EditText)findViewById(0x7f0d004f)).getText().toString();
            if (!TextUtils.isEmpty(s))
            {
                address.setAddr2(s);
            }
            s = ((EditText)findViewById(0x7f0d0050)).getText().toString();
            if (!TextUtils.isEmpty(s))
            {
                address.setCity(s);
                s = ((Spinner)findViewById(0x7f0d0051)).getSelectedItem().toString();
                if (!TextUtils.isEmpty(s) && !s.equalsIgnoreCase(ConstantValues.STATES_CODE[ConstantValues.STATES_CODE.length - 1]))
                {
                    address.setState(ConstantValues.STATES_CODE[((Spinner)findViewById(0x7f0d0051)).getSelectedItemPosition()]);
                    String s1 = ((EditText)findViewById(0x7f0d0052)).getText().toString();
                    if (!TextUtils.isEmpty(s1) && s1.length() == 5)
                    {
                        profiledata.setPostalCode(s1);
                        address.setPostalCode(s1);
                        profiledata.setAddress(address);
                        return true;
                    } else
                    {
                        displayErrorDialog("Some information is missing or invalid.");
                        return false;
                    }
                } else
                {
                    displayErrorDialog("Some information is missing or invalid.");
                    return false;
                }
            } else
            {
                displayErrorDialog("Some information is missing or invalid.");
                return false;
            }
        } else
        {
            displayErrorDialog("Some information is missing or invalid.");
            return false;
        }
    }

    private void setDataForPOView()
    {
        if (mPOAddressData != null)
        {
            ((EditText)findViewById(0x7f0d0054)).setText(mPOAddressData.getAddr1());
            ((EditText)findViewById(0x7f0d0055)).setText(mPOAddressData.getAddr2());
            ((Spinner)findViewById(0x7f0d0057)).setSelection(getSelectionIdx(Constants.stateCode, mPOAddressData.getState()));
            ((Spinner)findViewById(0x7f0d0056)).setSelection(getSelectionIdx(Constants.poType, mPOAddressData.getCity()));
            ((EditText)findViewById(0x7f0d0058)).setText(mPOAddressData.getPostalCode());
        }
    }

    private void setDataForUSView()
    {
        if (mUSAddressData != null)
        {
            if (!isAddrFieldEmpty(mUSAddressData.getAddr1()))
            {
                ((EditText)findViewById(0x7f0d004e)).setText(mUSAddressData.getAddr1());
            }
            if (!isAddrFieldEmpty(mAddressData.getAddress().getAddr2()))
            {
                ((EditText)findViewById(0x7f0d004f)).setText(mUSAddressData.getAddr2());
            }
            if (!isAddrFieldEmpty(mAddressData.getAddress().getCity()))
            {
                ((EditText)findViewById(0x7f0d0050)).setText(mUSAddressData.getCity());
            }
            if (!isAddrFieldEmpty(mAddressData.getAddress().getPostalCode()))
            {
                ((EditText)findViewById(0x7f0d0052)).setText(mUSAddressData.getPostalCode());
            }
            ((Spinner)findViewById(0x7f0d0051)).setSelection(getSelectionIdx(ConstantValues.STATES_CODE, mUSAddressData.getState()));
        }
    }

    private void setupAccountView()
    {
        findViewById(0x7f0d004d).setVisibility(0);
        findViewById(0x7f0d0053).setVisibility(8);
        Spinner spinner = (Spinner)findViewById(0x7f0d0051);
        final EditText cityEditTxt = (EditText)findViewById(0x7f0d0050);
        ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x109000a, ConstantValues.STATES);
        arrayadapter.setDropDownViewResource(0x7f030106);
        spinner.setAdapter(arrayadapter);
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final EditRewardsAddressActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        cityEditTxt.setOnTouchListener(new android.view.View.OnTouchListener() {

            final EditRewardsAddressActivity this$0;
            final EditText val$cityEditTxt;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    cityEditTxt.setFocusable(true);
                    cityEditTxt.setFocusableInTouchMode(true);
                    ((InputMethodManager)getSystemService("input_method")).showSoftInput(cityEditTxt, 0);
                }
                return false;
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                cityEditTxt = edittext;
                super();
            }
        });
        setDataForUSView();
    }

    private void setupPOView()
    {
        findViewById(0x7f0d004d).setVisibility(8);
        findViewById(0x7f0d0053).setVisibility(0);
        Object obj = (EditText)findViewById(0x7f0d0058);
        ((EditText) (obj)).setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final EditRewardsAddressActivity this$0;

            public void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    findViewById(0x7f0d004a).setVisibility(8);
                    return;
                } else
                {
                    findViewById(0x7f0d004a).setVisibility(0);
                    return;
                }
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        ((EditText) (obj)).setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final EditRewardsAddressActivity this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    findViewById(0x7f0d004a).setVisibility(0);
                }
                return false;
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        Object obj1 = (Spinner)findViewById(0x7f0d0056);
        obj = (Spinner)findViewById(0x7f0d0057);
        ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x109000a, getResources().getStringArray(0x7f0a0012));
        arrayadapter.setDropDownViewResource(0x7f030106);
        ((Spinner) (obj1)).setAdapter(arrayadapter);
        ((Spinner) (obj1)).setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final EditRewardsAddressActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        obj1 = new ArrayAdapter(this, 0x109000a, getResources().getStringArray(0x7f0a001b));
        ((ArrayAdapter) (obj1)).setDropDownViewResource(0x7f030106);
        ((Spinner) (obj)).setAdapter(((android.widget.SpinnerAdapter) (obj1)));
        ((Spinner) (obj)).setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final EditRewardsAddressActivity this$0;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            public void onNothingSelected(AdapterView adapterview)
            {
                ((TextView)adapterview.getChildAt(0)).setTextAppearance(EditRewardsAddressActivity.this, 0x7f0f001e);
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        setDataForPOView();
    }

    private void showPOView()
    {
        ((RelativeLayout)findViewById(0x7f0d0053)).setVisibility(0);
        ((RadioGroup)findViewById(0x7f0d004a)).setVisibility(0);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
    }

    private void showProgressView()
    {
        ((RelativeLayout)findViewById(0x7f0d0053)).setVisibility(8);
        ((RelativeLayout)findViewById(0x7f0d004d)).setVisibility(8);
        ((RadioGroup)findViewById(0x7f0d004a)).setVisibility(8);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(0);
    }

    private void showUSView()
    {
        ((RelativeLayout)findViewById(0x7f0d004d)).setVisibility(0);
        ((RadioGroup)findViewById(0x7f0d004a)).setVisibility(0);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
    }

    public void onActionPerformed(Object obj)
    {
        ListenerManager.getInstance().unRegisterListener("updateloyaltydata", this);
        obj = new Bundle();
        ((Bundle) (obj)).putSerializable("address_data", mAddressData);
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
        setContentView(0x7f03000d);
        ((ProgressBar)findViewById(0x7f0d0118)).setVisibility(8);
        bundle = (RadioGroup)findViewById(0x7f0d004a);
        getWindow().setSoftInputMode(3);
        ListenerManager.getInstance().registerListener(this, "updateloyaltydata");
        mPOAddressData = new Address();
        mUSAddressData = new Address();
        bundle.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            final EditRewardsAddressActivity this$0;

            public void onCheckedChanged(RadioGroup radiogroup, int i)
            {
                if (i == 0x7f0d004b)
                {
                    populatePOData();
                    setupAccountView();
                } else
                if (i == 0x7f0d004c)
                {
                    populateUSData();
                    setupPOView();
                    return;
                }
            }

            
            {
                this$0 = EditRewardsAddressActivity.this;
                super();
            }
        });
        if (isDefultView())
        {
            bundle.check(0x7f0d004b);
        } else
        {
            bundle.check(0x7f0d004c);
        }
        setUpActionBar();
        OmnitureMeasurement.getInstance().setEditRewardsAddressEvents();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100004, menu);
        return true;
    }

    protected void onDestroy()
    {
        ListenerManager.getInstance().unRegisterListener("updateloyaltydata", this);
        super.onDestroy();
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
            menuitem = KohlsPhoneApplication.getInstance().getAuthenticationUtils().getLoyaltyIDFromPref();
            if (!TextUtils.isEmpty(menuitem))
            {
                mAddressData.setLoyaltyId(menuitem);
            }
            i = ((RadioGroup)findViewById(0x7f0d004a)).getCheckedRadioButtonId();
            if (i == 0x7f0d004b)
            {
                if (!saveUSAddress(mAddressData))
                {
                    showUSView();
                    return false;
                }
            } else
            if (i == 0x7f0d004c && !savePOAddress(mAddressData))
            {
                showPOView();
                return false;
            }
            (new UpdateLoyaltyProfileTask(getApplicationContext())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ProfileData[] {
                mAddressData
            });
            findViewById(0x7f0d06f5).setEnabled(false);
            findViewById(0x7f0d06f5).setClickable(false);
            return true;
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




}
