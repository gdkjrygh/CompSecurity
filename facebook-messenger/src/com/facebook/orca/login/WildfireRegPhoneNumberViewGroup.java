// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.content.Context;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android_src.d.a;
import com.facebook.auth.login.m;
import com.facebook.debug.log.l;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.ab;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.o;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.facebook.orca.login:
//            i, k, l, m, 
//            n, j

public class WildfireRegPhoneNumberViewGroup extends m
    implements com.facebook.orca.login.i
{

    public static final String LOGO1_RESOURCE = "orca:authparam:logo1";
    public static final String LOGO2_RESOURCE = "orca:authparam:logo2";
    private static final l WTF_WILDFIRE_SIGNUP_CC_SELECTOR_SELECTED_NOTHING = new l();
    private ArrayAdapter mCountryCodeListAdapter;
    private final Spinner mCountryCodeSpinner;
    private final InputMethodManager mInputMethodManager;
    private final Button mNextButton;
    private a mPhoneNumberFormattingTextWatcher;
    private final EditText mPhoneNumberText;
    private final PhoneNumberUtil mPhoneNumberUtil;
    private final ab mProgressIndicator;

    public WildfireRegPhoneNumberViewGroup(Context context, j j1)
    {
        super(context, j1);
        context = getInjector();
        mPhoneNumberUtil = (PhoneNumberUtil)context.a(com/facebook/phonenumbers/PhoneNumberUtil);
        mInputMethodManager = (InputMethodManager)context.a(android/view/inputmethod/InputMethodManager);
        setContentView(k.orca_wildfire_reg_phone);
        mCountryCodeSpinner = (Spinner)getView(i.country_code_spinner);
        mPhoneNumberText = (EditText)getView(i.phone_number);
        mNextButton = (Button)getView(i.next);
        mProgressIndicator = new aa(getContext(), o.wildfire_reg_request_sms_progress);
        mCountryCodeSpinner.setOnItemSelectedListener(new com.facebook.orca.login.k(this));
        mNextButton.setOnClickListener(new com.facebook.orca.login.l(this));
        mPhoneNumberText.setOnEditorActionListener(new com.facebook.orca.login.m(this));
        context = Locale.getDefault().getLanguage();
        j1 = Locale.getISOCountries();
        n an[] = new n[j1.length];
        for (int i1 = 0; i1 < j1.length; i1++)
        {
            an[i1] = new n(this, j1[i1], (new StringBuilder()).append("+").append(mPhoneNumberUtil.getCountryCodeForRegion(j1[i1])).toString(), (new Locale(context, j1[i1])).getDisplayCountry());
        }

        Arrays.sort(an);
        mCountryCodeListAdapter = new ArrayAdapter(getContext(), k.orca_wildfire_reg_phone_spinner, i.country_code_text, an);
        mCountryCodeSpinner.setAdapter(mCountryCodeListAdapter);
        context = (ImageView)getView(i.name_logo1);
        j1 = (ImageView)getView(i.name_logo2);
        int k1 = getResource("orca:authparam:logo1", 0);
        int l1 = getResource("orca:authparam:logo2", 0);
        if (k1 != 0)
        {
            context.setImageResource(k1);
        }
        if (l1 != 0)
        {
            j1.setImageResource(l1);
        }
    }

    public static Bundle createParameterBundle(int i1, int j1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("orca:authparam:logo1", i1);
        bundle.putInt("orca:authparam:logo2", j1);
        return bundle;
    }

    private n getSelectedCountryCode()
    {
        return (n)mCountryCodeSpinner.getSelectedItem();
    }

    private void onCountryCodeChanged()
    {
        n n1 = getSelectedCountryCode();
        ((j)control).a(n1.a);
        boolean flag;
        if (mPhoneNumberFormattingTextWatcher != null)
        {
            flag = true;
            mPhoneNumberText.removeTextChangedListener(mPhoneNumberFormattingTextWatcher);
        } else
        {
            flag = false;
        }
        mPhoneNumberFormattingTextWatcher = new a(n1.a);
        mPhoneNumberText.addTextChangedListener(mPhoneNumberFormattingTextWatcher);
        if (flag)
        {
            mPhoneNumberText.setTextKeepState(mPhoneNumberText.getText());
        }
    }

    private void onNextClick()
    {
        String s = mPhoneNumberText.getText().toString();
        if (s.length() <= 0)
        {
            return;
        } else
        {
            mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            ((j)control).b(s, getSelectedCountryCode().a);
            return;
        }
    }

    public void beginShowingProgress()
    {
        mProgressIndicator.a();
    }

    public void setCountryCode(String s)
    {
        for (int i1 = 0; i1 < mCountryCodeListAdapter.getCount(); i1++)
        {
            if (s.equalsIgnoreCase(((n)mCountryCodeListAdapter.getItem(i1)).a))
            {
                mCountryCodeSpinner.setSelection(i1);
            }
        }

    }

    public void stopShowingProgress()
    {
        mProgressIndicator.b();
    }




}
