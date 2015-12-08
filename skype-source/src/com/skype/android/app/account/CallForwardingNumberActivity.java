// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.CallForwarding;
import com.skype.android.widget.AccessibleEditText;
import java.util.Locale;
import java.util.logging.Logger;

public class CallForwardingNumberActivity extends SkypeActivity
    implements TextWatcher
{

    private static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    Button countryCodeButton;
    TextView countryPrefixText;
    AccessibleEditText editText;
    private com.skype.SkyLib.GetISOCountryInfo_Result isoInfo;
    SkyLib lib;

    public CallForwardingNumberActivity()
    {
    }

    private int getPrefixNumberFromString(String s)
    {
        return Integer.parseInt(s.replace('+', ' ').trim());
    }

    private void initilizeContent(Intent intent)
    {
        boolean flag = intent.getBooleanExtra("edit_num", false);
        String s1;
        int i;
        if (flag)
        {
            i = 0x7f080249;
        } else
        {
            i = 0x7f08022b;
        }
        actionBarCustomizer.setTitle(i);
        if (flag)
        {
            i = 0x7f08005a;
        } else
        {
            i = 0x7f080057;
        }
        setTitle(i);
        s1 = intent.getStringExtra("phone_num");
        if (s1 != null)
        {
            String s = lib.getISOCountryCodebyPhoneNo(s1);
            intent = s;
            if (TextUtils.isEmpty(s))
            {
                intent = account.getCountryProp();
            }
            i = 0;
            do
            {
label0:
                {
                    if (i < isoInfo.m_countryCodeList.length)
                    {
                        if (!intent.equals(isoInfo.m_countryCodeList[i]))
                        {
                            break label0;
                        }
                        intent = s1.substring(String.valueOf(isoInfo.m_countryPrefixList[i]).length() + 1);
                        updateSelectedCountry(isoInfo.m_countryCodeList[i]);
                        editText.setText(intent);
                        editText.setSelection(intent.length());
                    }
                    return;
                }
                i++;
            } while (true);
        } else
        {
            updateSelectedCountry(account.getCountryProp());
            return;
        }
    }

    private void initilzeLayout()
    {
        editText.addTextChangedListener(this);
        countryCodeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CallForwardingNumberActivity this$0;

            public final void onClick(View view)
            {
                view = new Intent(CallForwardingNumberActivity.this, com/skype/android/app/dialer/SelectCountryActivity);
                startActivityForResult(view, 1);
            }

            
            {
                this$0 = CallForwardingNumberActivity.this;
                super();
            }
        });
    }

    private void saveAndClose()
    {
        Object obj = editText.getText().toString().trim();
        int i = getPrefixNumberFromString(countryPrefixText.getText().toString());
        obj = lib.normalizePSTNWithCountry(((String) (obj)), i);
        if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return != com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            log.info((new StringBuilder("Invalid phone number - unable to normalize for reason: ")).append(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return).toString());
            return;
        }
        obj = ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_normalized;
        CallForwarding callforwarding = new CallForwarding(lib, account);
        if (getIntent().getBooleanExtra("edit_num", false))
        {
            callforwarding.a(callforwarding.a(getIntent().getStringExtra("phone_num")), ((String) (obj)));
        } else
        {
            callforwarding.a(new com.skype.android.util.CallForwarding.Number(((String) (obj))));
        }
        setResult(-1, new Intent());
        finish();
    }

    private void updateContentDescription(String s)
    {
        countryPrefixText.setContentDescription(s);
        editText.setContentDescription(s);
    }

    private void updateSelectedCountry(String s)
    {
        Locale locale = getResources().getConfiguration().locale;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = locale.getCountry();
        }
        String s3 = (new StringBuilder()).append(Locale.US.getDisplayCountry(locale)).append(" (+1)").toString();
        String s4 = "+1";
        int i = 0;
        do
        {
label0:
            {
                String s2 = s3;
                s = s4;
                if (i < isoInfo.m_countryCodeList.length)
                {
                    if (!s1.equalsIgnoreCase(isoInfo.m_countryCodeList[i]))
                    {
                        break label0;
                    }
                    int j = isoInfo.m_countryPrefixList[i];
                    s = (new StringBuilder("+")).append(j).toString();
                    s2 = (new StringBuilder()).append(isoInfo.m_countryNameList[i]).append(" (").append(s).append(")").toString();
                }
                countryCodeButton.setText(s2);
                countryPrefixText.setText(s);
                updateContentDescription((new StringBuilder()).append(s).append(editText.getText().toString()).toString());
                return;
            }
            i++;
        } while (true);
    }

    public void afterTextChanged(Editable editable)
    {
        supportInvalidateOptionsMenu();
        updateContentDescription((new StringBuilder()).append(countryPrefixText.getText()).append(editable.toString()).toString());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && intent != null && intent.hasExtra("country_list_item"))
        {
            i = intent.getIntExtra("country_list_item", 0);
            updateSelectedCountry(isoInfo.m_countryCodeList[i]);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        isoInfo = lib.getISOCountryInfo();
        initilzeLayout();
        initilizeContent(getIntent());
        if (TextUtils.isEmpty(editText.getText()))
        {
            updateContentDescription((new StringBuilder()).append(countryPrefixText.getText()).append(editText.getHint().toString()).toString());
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001a, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756475: 
            saveAndClose();
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        Object obj = editText.getText().toString().trim();
        int i = getPrefixNumberFromString(countryPrefixText.getText().toString());
        obj = lib.normalizePSTNWithCountry(((String) (obj)), i);
        menu = menu.findItem(0x7f1005bb);
        boolean flag;
        if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menu.setEnabled(flag);
        return true;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
