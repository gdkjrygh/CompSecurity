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
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.ui.text.PEditText;
import java.util.Calendar;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepFiveGenderFragment, MultiStepSignupFragment

public class StepFourAgeFragment extends BaseFragment
{

    private static final int STEP_NUMBER = 4;
    PEditText _ageEt;
    ProgressBar _progressBar;
    TextView _stepNumber;

    public StepFourAgeFragment()
    {
    }

    private int getUnixBirthdate(int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendar.get(1) - i);
        return (int)(calendar.getTimeInMillis() / 1000L);
    }

    private void setUpAgeField()
    {
        SignupFormUtils.setUpField(_ageEt, new _cls1());
    }

    private void verifyAgeAndContinue()
    {
        int i;
        i = 0;
        String s = _ageEt.getText().toString();
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        catch (Exception exception)
        {
            PLog.error(exception, "Age entered should always be numeric.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        i = j;
_L7:
        if (i > 0 && StringUtils.isNumeric(s) && s.length() == 2) goto _L2; else goto _L1
_L1:
        _ageEt.setBackgroundResource(0x7f020219);
        _ageEt.requestFocus();
        _ageEt.setSelection(s.length());
        Application.showToast(0x7f07052a);
_L4:
        return;
_L2:
        Device.hideSoftKeyboard(_ageEt);
        if (i < 13)
        {
            break; /* Loop/switch isn't completed */
        }
        AnalyticsApi.a("multistep_signup_step_4_complete");
        Bundle bundle = getArguments();
        bundle.putInt("com.pinterest.EXTRA_BIRTHDAY", getUnixBirthdate(i));
        StepFiveGenderFragment stepfivegenderfragment = new StepFiveGenderFragment();
        stepfivegenderfragment.setArguments(bundle);
        if (getActivity() != null)
        {
            FragmentHelper.replaceFragment(getActivity(), stepfivegenderfragment, true, com.pinterest.activity.FragmentHelper.Animation.FADE);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Preferences.persisted().set("BLOCK_SIGNUP", true);
        if (getActivity() == null) goto _L4; else goto _L5
_L5:
        FragmentHelper.replaceFragment(getActivity(), new MultiStepSignupFragment(), true);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    void onButtonClick(View view)
    {
        if (view.getId() == 0x7f0f02be)
        {
            view = getArguments();
            StepFiveGenderFragment stepfivegenderfragment = new StepFiveGenderFragment();
            stepfivegenderfragment.setArguments(view);
            FragmentHelper.replaceFragment(getActivity(), stepfivegenderfragment, true, com.pinterest.activity.FragmentHelper.Animation.FADE);
            return;
        } else
        {
            verifyAgeAndContinue();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030107;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070528);
        _actionBar.getMenu().clear();
        setUpAgeField();
        if (Experiments.i())
        {
            _stepNumber.setText(0x7f07056e);
            _progressBar.setMax(_progressBar.getMax() - 1);
            _progressBar.setProgress(3);
            return;
        } else
        {
            _stepNumber.setText(0x7f070569);
            _progressBar.setProgress(4);
            return;
        }
    }


    private class _cls1
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepFourAgeFragment this$0;

        public void callback()
        {
            verifyAgeAndContinue();
        }

        _cls1()
        {
            this$0 = StepFourAgeFragment.this;
            super();
        }
    }

}
