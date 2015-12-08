// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepTwoLoginFragment, StepTwoPasswordFragment

public class ContinueEmailSignupFragment extends BaseFragment
{

    View _emailBt;
    PEditText _emailEt;
    View _gplusBt;
    BaseApiResponseHandler onEmailExistsCheck;

    public ContinueEmailSignupFragment()
    {
        onEmailExistsCheck = new _cls2();
    }

    private void goToNextStep(boolean flag)
    {
        AnalyticsApi.a("multistep_signup_step_1_complete");
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_EMAIL", _emailEt.getText().toString());
        Object obj;
        if (flag)
        {
            obj = new StepTwoLoginFragment();
        } else
        {
            obj = new StepTwoPasswordFragment();
        }
        ((BaseFragment) (obj)).setArguments(bundle);
        if (getActivity() != null)
        {
            FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
        }
    }

    private void verifyEmailAndContinue()
    {
        AnalyticsApi.a("continue_email_click");
        String s = _emailEt.getText().toString();
        if (!SignupFormUtils.isEmailValid(s))
        {
            _emailEt.setBackgroundResource(0x7f020219);
            _emailEt.requestFocus();
            _emailEt.setSelection(s.length());
            int i;
            if (StringUtils.isEmpty(s))
            {
                i = 0x7f070279;
            } else
            {
                i = 0x7f070531;
            }
            Application.showToast(i);
            return;
        }
        Events.post(new DialogEvent(new LoadingDialog()));
        try
        {
            AccountApi.a(s, onEmailExistsCheck);
            return;
        }
        catch (Exception exception)
        {
            CrashReporting.a(exception);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        getActivity().getWindow().setSoftInputMode(16);
    }

    public void onButtonClick(View view)
    {
        UnauthHelper.onClick(view, getActivity());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03005a;
    }

    public void onEmailClick(View view)
    {
        verifyEmailAndContinue();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        AnalyticsApi.a("unauth_home");
        ViewHelper.setVisibility(_gplusBt, GooglePlayServices.isAvailable());
        if (Preferences.persisted().getBoolean("BLOCK_SIGNUP", false))
        {
            Application.showToast(0x7f07054a);
        }
        try
        {
            view = Device.getDefaultEmailAddress();
            if (StringUtils.isNotEmpty(view))
            {
                _emailEt.setText(view);
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view) { }
        _emailEt.setOnEditorActionListener(new _cls1());
    }



    private class _cls2 extends BaseApiResponseHandler
    {

        final ContinueEmailSignupFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Events.post(new DialogEvent(null));
            PLog.error(throwable, "Email check failed", new Object[0]);
            Application.showToast(0x7f070234);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            Events.post(new DialogEvent(null));
            apiresponse = (String)apiresponse.getData();
            goToNextStep(apiresponse.equals("true"));
        }

        _cls2()
        {
            this$0 = ContinueEmailSignupFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final ContinueEmailSignupFragment this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (keyevent != null && keyevent.getKeyCode() == 66)
            {
                verifyEmailAndContinue();
            }
            return false;
        }

        _cls1()
        {
            this$0 = ContinueEmailSignupFragment.this;
            super();
        }
    }

}
