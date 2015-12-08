// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.PhoneNumberSignupUtils;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.actionbar.PhoneNumberSpinnerAdapter;
import com.pinterest.ui.text.PEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepOneSMSFragment

public class StepOnePhoneFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 1;
    Spinner _countrySpinner;
    PEditText _phoneEt;
    TextView _phoneTerms;
    ProgressBar _progressBar;
    TextView _stepNumber;
    TextView _useEmail;

    public StepOnePhoneFragment()
    {
    }

    private void goToNextStep(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_PHONE_NUMBER", s);
        s = new StepOneSMSFragment();
        s.setArguments(bundle);
        FragmentHelper.replaceFragment(getActivity(), s, true, com.pinterest.activity.FragmentHelper.Animation.FADE);
    }

    private void onInvalidNumber(String s)
    {
        _phoneEt.setBackgroundResource(0x7f020219);
        _phoneEt.requestFocus();
        _phoneEt.setSelection(s.length());
        int i;
        if (StringUtils.isEmpty(s))
        {
            i = 0x7f07027b;
        } else
        {
            i = 0x7f070543;
        }
        Application.showToast(i);
    }

    private List populateCountries()
    {
        ArrayList arraylist = new ArrayList();
        String s = Locale.getDefault().getCountry();
        if (!StringUtils.isEmpty(s))
        {
            arraylist.add(s);
        }
        Iterator iterator = PhoneNumberSignupUtils.getSupportedCountries().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (!s1.equals(s))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    private void setUpPhoneField()
    {
        SignupFormUtils.setUpField(_phoneEt, new _cls2());
        _phoneEt.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
    }

    private void verifyPhoneAndContinue()
    {
        String s = _phoneEt.getText().toString();
        if (StringUtils.isEmpty(s))
        {
            onInvalidNumber(s);
            return;
        }
        Object obj1 = _countrySpinner.getSelectedItem().toString();
        Object obj = PhoneNumberUtil.getInstance();
        try
        {
            obj1 = ((PhoneNumberUtil) (obj)).parse(s, ((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            PLog.error(((Throwable) (obj)), "Number could not be parsed", new Object[0]);
            onInvalidNumber(s);
            return;
        }
        if (!((PhoneNumberUtil) (obj)).isValidNumber(((com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) (obj1))))
        {
            onInvalidNumber(s);
            return;
        } else
        {
            AnalyticsApi.a("multistep_signup_phone_valid");
            goToNextStep(((PhoneNumberUtil) (obj)).format(((com.google.i18n.phonenumbers.Phonenumber.PhoneNumber) (obj1)), com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164));
            return;
        }
    }

    public boolean onBackPressed()
    {
        com.facebook.accountsalpha.AccountsAlpha.Logger.logDidDismissPhoneUI(Experiments.a("android_phone_number_signup", false));
        return super.onBackPressed();
    }

    void onButtonClick(View view)
    {
        verifyPhoneAndContinue();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030109;
    }

    void onEmailClick(View view)
    {
        pressBackButton();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpPhoneField();
        _actionBar.setNavigationOnClickListener(new _cls1());
        _stepNumber.setText(0x7f07056b);
        _progressBar.setProgress(1);
        view = populateCountries();
        view = new PhoneNumberSpinnerAdapter(getContext(), 0x1090008, view);
        _countrySpinner.setAdapter(view);
        if (Experiments.f())
        {
            _phoneTerms.setText(0x7f070639);
        }
        com.facebook.accountsalpha.AccountsAlpha.Logger.logDidPresentPhoneUI(Experiments.a("android_phone_number_signup", false));
    }



    private class _cls2
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepOnePhoneFragment this$0;

        public void callback()
        {
            verifyPhoneAndContinue();
        }

        _cls2()
        {
            this$0 = StepOnePhoneFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StepOnePhoneFragment this$0;

        public void onClick(View view)
        {
            pressBackButton();
            Device.hideSoftKeyboard(_phoneEt);
        }

        _cls1()
        {
            this$0 = StepOnePhoneFragment.this;
            super();
        }
    }

}
