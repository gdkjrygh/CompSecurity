// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
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
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepFourAgeFragment

public class StepThreeFullNameFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 3;
    PEditText _nameEt;
    ProgressBar _progressBar;
    TextView _stepNumber;

    public StepThreeFullNameFragment()
    {
    }

    private void setUpNameField()
    {
        try
        {
            String s = Device.getDefaultDisplayName(getContext());
            if (!TextUtils.isEmpty(s))
            {
                _nameEt.setText(s);
            }
        }
        catch (Exception exception)
        {
            PLog.error(exception, "Could not read display name", new Object[0]);
        }
        SignupFormUtils.setUpField(_nameEt, new _cls1());
    }

    private void verifyNameAndContinue()
    {
        Object obj = _nameEt.getText().toString();
        if (!SignupFormUtils.isFullNameValid(((String) (obj))))
        {
            _nameEt.setBackgroundResource(0x7f020219);
            _nameEt.requestFocus();
            _nameEt.setSelection(((String) (obj)).length());
            Application.showToast(0x7f07053b);
        } else
        {
            AnalyticsApi.a("multistep_signup_step_3_complete");
            String as[] = ((String) (obj)).trim().split(" ");
            obj = "";
            String s = "";
            if (as.length > 0)
            {
                obj = as[0];
            }
            if (as.length > 1)
            {
                s = as[1];
            }
            Bundle bundle = getArguments();
            bundle.putString("com.pinterest.EXTRA_FIRST_NAME", ((String) (obj)));
            bundle.putString("com.pinterest.EXTRA_LAST_NAME", s);
            obj = new StepFourAgeFragment();
            ((StepFourAgeFragment) (obj)).setArguments(bundle);
            if (getActivity() != null)
            {
                FragmentHelper.replaceFragment(getActivity(), ((android.support.v4.app.Fragment) (obj)), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
                return;
            }
        }
    }

    void onButtonClick(View view)
    {
        verifyNameAndContinue();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03010b;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpNameField();
        if (Experiments.i())
        {
            _stepNumber.setText(0x7f070570);
            _progressBar.setMax(_progressBar.getMax() - 1);
            _progressBar.setProgress(2);
            return;
        } else
        {
            _stepNumber.setText(0x7f07056d);
            _progressBar.setProgress(3);
            return;
        }
    }


    private class _cls1
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepThreeFullNameFragment this$0;

        public void callback()
        {
            verifyNameAndContinue();
        }

        _cls1()
        {
            this$0 = StepThreeFullNameFragment.this;
            super();
        }
    }

}
