// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepOneEmailFragment

public class MultiStepSignupFragment extends BaseFragment
{

    Button _emailBt;
    View _gplusBt;

    public MultiStepSignupFragment()
    {
    }

    void onButtonClick(View view)
    {
        UnauthHelper.onClick(view, getActivity());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03017f;
    }

    void onEmailClick(View view)
    {
        AnalyticsApi.a("email_signup_click");
        if (getActivity() != null)
        {
            FragmentHelper.replaceFragment(getActivity(), new StepOneEmailFragment(), true, com.pinterest.activity.FragmentHelper.Animation.FADE);
        }
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
    }
}
