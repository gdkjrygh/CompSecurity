// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.facebook.accountsalpha.AccountsAlpha;
import com.facebook.accountsalpha.PhoneLoginRequest;
import com.facebook.accountsalpha.PhoneLoginTracker;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

public class StepOneSMSFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 1;
    TextView _facebookTerms;
    PEditText _phoneEt;
    private PhoneLoginRequest _phoneLoginRequest;
    private PhoneLoginTracker _phoneLoginTracker;
    ProgressBar _progressBar;
    TextView _stepNumber;

    public StepOneSMSFragment()
    {
    }

    private void initLoginManager(Bundle bundle)
    {
        _phoneLoginTracker = new _cls3();
        AccountsAlpha.getLoginManager(bundle);
    }

    private void setUpPhoneField()
    {
        SignupFormUtils.setUpField(_phoneEt, new _cls2());
    }

    private void verifySMSAndContinue()
    {
        String s = _phoneEt.getText().toString();
        if (StringUtils.isEmpty(s))
        {
            _phoneEt.setBackgroundResource(0x7f020219);
            _phoneEt.requestFocus();
            _phoneEt.setSelection(0);
            Application.showToast(0x7f070277);
            return;
        } else
        {
            _phoneLoginRequest.setConfirmationCode(s);
            return;
        }
    }

    void onButtonClick(View view)
    {
        verifySMSAndContinue();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03010a;
    }

    public void onDestroy()
    {
        super.onDestroy();
        _phoneLoginTracker.stopTracking();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Events.post(new DialogEvent(new LoadingDialog(0x7f070512)));
        initLoginManager(bundle);
        AccountsAlpha.logInWithPhoneNumber(getArguments().getString("com.pinterest.EXTRA_PHONE_NUMBER"), Experiments.a("android_phone_number_signup", false));
        ViewHelper.setVisibility(_facebookTerms, Experiments.f());
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpPhoneField();
        _actionBar.setNavigationOnClickListener(new _cls1());
        _stepNumber.setText(0x7f07056b);
        _progressBar.setProgress(1);
        AnalyticsApi.a("multistep_signup_enter_sms");
    }




/*
    static PhoneLoginRequest access$202(StepOneSMSFragment steponesmsfragment, PhoneLoginRequest phoneloginrequest)
    {
        steponesmsfragment._phoneLoginRequest = phoneloginrequest;
        return phoneloginrequest;
    }

*/

    private class _cls3 extends PhoneLoginTracker
    {

        final StepOneSMSFragment this$0;

        protected void onCancel(PhoneLoginRequest phoneloginrequest)
        {
            PLog.log("User cancelled phone number signup", new Object[0]);
        }

        protected void onError(AccountsAlphaException accountsalphaexception)
        {
            Events.post(new DialogEvent(null));
            Application.showToast(accountsalphaexception.getLocalizedMessage());
            getActivity().onBackPressed();
        }

        protected void onStarted(PhoneLoginRequest phoneloginrequest)
        {
            Events.post(new DialogEvent(null));
            _phoneLoginRequest = phoneloginrequest;
        }

        protected void onSuccess(PhoneLoginRequest phoneloginrequest)
        {
            AnalyticsApi.a("multistep_signup_step_1_complete");
            Object obj = AccountsAlpha.getCurrentAccessToken().getToken();
            phoneloginrequest = getArguments();
            phoneloginrequest.putString("com.pinterest.EXTRA_ACCESS_TOKEN", ((String) (obj)));
            obj = new StepTwoPasswordFragment();
            ((StepTwoPasswordFragment) (obj)).setArguments(phoneloginrequest);
            FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
        }

        _cls3()
        {
            this$0 = StepOneSMSFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepOneSMSFragment this$0;

        public void callback()
        {
            verifySMSAndContinue();
        }

        _cls2()
        {
            this$0 = StepOneSMSFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StepOneSMSFragment this$0;

        public void onClick(View view)
        {
            pressBackButton();
            Device.hideSoftKeyboard(_phoneEt);
        }

        _cls1()
        {
            this$0 = StepOneSMSFragment.this;
            super();
        }
    }

}
