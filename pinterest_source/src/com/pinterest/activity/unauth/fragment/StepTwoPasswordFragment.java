// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepThreeFullNameFragment, MultiStepSignupFragment

public class StepTwoPasswordFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 2;
    PEditText _passwordEt;
    ProgressBar _progressBar;
    TextView _stepNumber;

    public StepTwoPasswordFragment()
    {
    }

    private void setUpPasswordField()
    {
        SignupFormUtils.setUpField(_passwordEt, new _cls1());
        Device.showSoftKeyboard(_passwordEt);
    }

    private void verifyPasswordAndContinue()
    {
        Object obj = _passwordEt.getText().toString();
        if (!SignupFormUtils.isPasswordValid(((String) (obj))))
        {
            _passwordEt.setBackgroundResource(0x7f020219);
            _passwordEt.requestFocus();
            _passwordEt.setSelection(((String) (obj)).length());
            Application.showToast(0x7f070541);
        } else
        {
            AnalyticsApi.a("multistep_signup_step_2_complete");
            Bundle bundle = getArguments();
            bundle.putString("com.pinterest.EXTRA_PASSWORD", ((String) (obj)));
            obj = new StepThreeFullNameFragment();
            ((StepThreeFullNameFragment) (obj)).setArguments(bundle);
            if (getActivity() != null)
            {
                FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
                return;
            }
        }
    }

    public boolean onBackPressed()
    {
        if (getArguments().containsKey("com.pinterest.EXTRA_PHONE_NUMBER"))
        {
            getActivity().getSupportFragmentManager().popBackStack(null, 1);
            FragmentHelper.replaceFragment(getActivity(), new MultiStepSignupFragment(), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
            return true;
        } else
        {
            return false;
        }
    }

    void onButtonClick(View view)
    {
        verifyPasswordAndContinue();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03010d;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpPasswordField();
        _stepNumber.setText(0x7f07056f);
        _progressBar.setProgress(2);
    }


    private class _cls1
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepTwoPasswordFragment this$0;

        public void callback()
        {
            verifyPasswordAndContinue();
        }

        _cls1()
        {
            this$0 = StepTwoPasswordFragment.this;
            super();
        }
    }

}
