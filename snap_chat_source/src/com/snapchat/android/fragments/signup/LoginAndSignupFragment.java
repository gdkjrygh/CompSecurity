// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Bt;
import Ei;
import Iq;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.snapchat.android.SnapchatCameraBackgroundActivity;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.fragment.SnapchatFragment;
import jG;
import jH;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            LoginFragment, SignupFragment

public class LoginAndSignupFragment extends SnapchatFragment
{

    private FragmentActivity a;
    private final Ei b;
    private final RegistrationAnalytics c;
    private int d;
    private int e;

    public LoginAndSignupFragment()
    {
        this(Ei.a(), RegistrationAnalytics.a());
    }

    private LoginAndSignupFragment(Ei ei, RegistrationAnalytics registrationanalytics)
    {
        b = ei;
        c = registrationanalytics;
    }

    static boolean a(LoginAndSignupFragment loginandsignupfragment)
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(loginandsignupfragment.a);
        if (i != 0)
        {
            GooglePlayServicesUtil.getErrorDialog(i, loginandsignupfragment.a, 0).show();
            return false;
        } else
        {
            return true;
        }
    }

    static WindowConfiguration b(LoginAndSignupFragment loginandsignupfragment)
    {
        return ((SnapchatFragment) (loginandsignupfragment)).mWindowConfiguration;
    }

    static WindowConfiguration c(LoginAndSignupFragment loginandsignupfragment)
    {
        return ((SnapchatFragment) (loginandsignupfragment)).mWindowConfiguration;
    }

    static RegistrationAnalytics d(LoginAndSignupFragment loginandsignupfragment)
    {
        return loginandsignupfragment.c;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = getActivity();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04009c, null);
        layoutinflater = d(0x7f0d032f);
        bundle = d(0x7f0d0330);
        a.getAssets();
        Iq.a(layoutinflater);
        a.getAssets();
        Iq.a(bundle);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private ViewGroup a;
            private LoginAndSignupFragment b;

            public final void onClick(View view)
            {
                if (!LoginAndSignupFragment.a(b))
                {
                    return;
                } else
                {
                    b.a(a.getId(), new LoginFragment(LoginAndSignupFragment.b(b)), com/snapchat/android/fragments/signup/LoginFragment.getSimpleName());
                    return;
                }
            }

            
            {
                b = LoginAndSignupFragment.this;
                a = viewgroup;
                super();
            }
        });
        bundle.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            private ViewGroup a;
            private LoginAndSignupFragment b;

            public final void onClick(View view)
            {
                if (!LoginAndSignupFragment.a(b))
                {
                    return;
                } else
                {
                    b.a(a.getId(), new SignupFragment(LoginAndSignupFragment.c(b)), com/snapchat/android/fragments/signup/SignupFragment.getSimpleName());
                    Bt.e(true);
                    view = LoginAndSignupFragment.d(b);
                    jG jg = new jG();
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jg);
                    return;
                }
            }

            
            {
                b = LoginAndSignupFragment.this;
                a = viewgroup;
                super();
            }
        });
        layoutinflater = getResources();
        e = layoutinflater.getColor(0x7f0c0033);
        d = layoutinflater.getColor(0x7f0c007c);
        layoutinflater = c;
        viewgroup = new jH();
        ((RegistrationAnalytics) (layoutinflater)).mBlizzardEventLogger.a(viewgroup);
        return mFragmentLayout;
    }

    public void onDetach()
    {
        super.onDetach();
        a = null;
    }

    public void onResume()
    {
        super.onResume();
        if (a instanceof SnapchatCameraBackgroundActivity)
        {
            ((SnapchatCameraBackgroundActivity)a).a(e);
        }
    }

    public void onStart()
    {
        super.onStart();
        Ei ei = b;
        FragmentActivity fragmentactivity = getActivity();
        Intent intent = ei.c(fragmentactivity);
        intent.putExtra("op_code", 1021);
        ei.a(fragmentactivity, intent);
    }

    public void onStop()
    {
        super.onStop();
        if (a instanceof SnapchatCameraBackgroundActivity)
        {
            ((SnapchatCameraBackgroundActivity)a).a(d);
        }
    }
}
