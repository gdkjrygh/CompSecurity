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
import com.pinterest.activity.signin.dialog.SignupConfirmDialog;
import com.pinterest.activity.signin.dialog.SignupDialogView;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

public class StepFiveGenderFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 5;
    View _customGender;
    PEditText _customGenderEt;
    View _femaleBt;
    private String _gender;
    View _maleBt;
    View _otherBt;
    ProgressBar _progressBar;
    TextView _skipTv;
    TextView _stepNumber;

    public StepFiveGenderFragment()
    {
    }

    private void doSignUp()
    {
        com.pinterest.api.remote.AccountApi.SignupParams signupparams;
        AnalyticsApi.a("multistep_signup_step_5_complete");
        Bundle bundle = getArguments();
        signupparams = new com.pinterest.api.remote.AccountApi.SignupParams();
        signupparams.c = bundle.getString("com.pinterest.EXTRA_EMAIL");
        signupparams.d = bundle.getString("com.pinterest.EXTRA_PHONE_NUMBER");
        signupparams.v = bundle.getString("com.pinterest.EXTRA_ACCESS_TOKEN");
        signupparams.e = bundle.getString("com.pinterest.EXTRA_PASSWORD");
        signupparams.q = bundle.getString("com.pinterest.EXTRA_FIRST_NAME");
        signupparams.r = bundle.getString("com.pinterest.EXTRA_LAST_NAME");
        signupparams.w = bundle.getInt("com.pinterest.EXTRA_BIRTHDAY");
        signupparams.s = _gender;
        signupparams.b = "";
        if (_gender != "unspecified") goto _L2; else goto _L1
_L1:
        String s = _customGenderEt.getText().toString();
        if (!StringUtils.isEmpty(s))
        {
            signupparams.t = s;
        }
_L4:
        SignupDialogView.lastFirstnameInput = signupparams.q;
        SignupDialogView.lastLastnameInput = signupparams.r;
        SignupDialogView.lastEmailInput = signupparams.c;
        SignupDialogView.lastPasswordInput = signupparams.e;
        SignupConfirmDialog signupconfirmdialog = new SignupConfirmDialog();
        signupconfirmdialog.setSignupParams(signupparams);
        signupconfirmdialog.setActivity(getActivity());
        signupconfirmdialog.doEmailSignup();
        return;
_L2:
        if (_gender == "female")
        {
            SignupDialogView.lastGenderIput = 0x7f0f0167;
        } else
        if (_gender == "male")
        {
            SignupDialogView.lastGenderIput = 0x7f0f0166;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void selectGenderButton(View view)
    {
        boolean flag = true;
        _femaleBt.setSelected(false);
        _maleBt.setSelected(false);
        _otherBt.setSelected(false);
        view.setSelected(true);
        View view1 = _customGender;
        if (view != _otherBt)
        {
            flag = false;
        }
        ViewHelper.setVisibility(view1, flag);
    }

    private void setUpCustomGenderField()
    {
        SignupFormUtils.setUpField(_customGenderEt, new _cls1());
    }

    void onButtonClick(View view)
    {
        switch (view.getId())
        {
        case 2131690178: 
        case 2131690179: 
        case 2131690180: 
        default:
            return;

        case 2131690174: 
            _gender = "unspecified";
            _skipTv.setVisibility(4);
            doSignUp();
            return;

        case 2131690181: 
            doSignUp();
            return;

        case 2131690175: 
            selectGenderButton(_femaleBt);
            _gender = "female";
            return;

        case 2131690176: 
            selectGenderButton(_maleBt);
            _gender = "male";
            return;

        case 2131690177: 
            selectGenderButton(_otherBt);
            _gender = "unspecified";
            setUpCustomGenderField();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030106;
        _gender = "unspecified";
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        if (Experiments.i())
        {
            _stepNumber.setText(0x7f07056a);
            _progressBar.setMax(_progressBar.getMax() - 1);
            _progressBar.setProgress(4);
            return;
        } else
        {
            _stepNumber.setText(0x7f070568);
            _progressBar.setProgress(5);
            return;
        }
    }


    private class _cls1
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepFiveGenderFragment this$0;

        public void callback()
        {
            doSignUp();
        }

        _cls1()
        {
            this$0 = StepFiveGenderFragment.this;
            super();
        }
    }

}
