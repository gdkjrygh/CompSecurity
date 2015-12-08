// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.AccountApi;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepTwoLoginFragment, StepThreeFullNameFragment, StepTwoPasswordFragment, StepOnePhoneFragment

public class StepOneEmailFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 1;
    PEditText _emailEt;
    ProgressBar _progressBar;
    TextView _stepNumber;
    TextView _useNumber;
    BaseApiResponseHandler onEmailExistsCheck;

    public StepOneEmailFragment()
    {
        onEmailExistsCheck = new _cls3();
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
        if (Experiments.i())
        {
            obj = new StepThreeFullNameFragment();
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

    private void setUpEmailField()
    {
        try
        {
            String s = Device.getDefaultEmailAddress();
            if (StringUtils.isNotEmpty(s))
            {
                _emailEt.setText(s);
            }
        }
        catch (Exception exception)
        {
            PLog.error(exception, "Could not read email address", new Object[0]);
        }
        SignupFormUtils.setUpField(_emailEt, new _cls2());
    }

    private void verifyEmailAndContinue()
    {
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
        if (Experiments.e())
        {
            getActivity().getWindow().setSoftInputMode(16);
            _useNumber.setVisibility(0);
        }
    }

    void onButtonClick(View view)
    {
        verifyEmailAndContinue();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030108;
    }

    void onPhoneClick(View view)
    {
        AnalyticsApi.a("multistep_signup_use_phone");
        if (getActivity() != null)
        {
            FragmentHelper.replaceFragment(getActivity(), new StepOnePhoneFragment(), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpEmailField();
        _actionBar.setNavigationOnClickListener(new _cls1());
        if (Experiments.i())
        {
            _stepNumber.setText(0x7f07056c);
            _progressBar.setMax(_progressBar.getMax() - 1);
        } else
        {
            _stepNumber.setText(0x7f07056b);
        }
        _progressBar.setProgress(1);
    }




    private class _cls3 extends BaseApiResponseHandler
    {

        final StepOneEmailFragment this$0;

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

        _cls3()
        {
            this$0 = StepOneEmailFragment.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepOneEmailFragment this$0;

        public void callback()
        {
            verifyEmailAndContinue();
        }

        _cls2()
        {
            this$0 = StepOneEmailFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final StepOneEmailFragment this$0;

        public void onClick(View view)
        {
            pressBackButton();
            Device.hideSoftKeyboard(_emailEt);
        }

        _cls1()
        {
            this$0 = StepOneEmailFragment.this;
            super();
        }
    }

}
