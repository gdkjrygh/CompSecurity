// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Bt;
import IJ;
import RK;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.util.debug.ReleaseManager;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            TwoFactorCodeVerificationFragment

final class a
    implements com.snapchat.android.api2.nFragment._cls1
{

    private TwoFactorCodeVerificationFragment a;

    public final void R_()
    {
        if (ReleaseManager.f())
        {
            throw new RuntimeException("Username required for two-factor authentication");
        } else
        {
            a.getActivity().onBackPressed();
            return;
        }
    }

    public final void a()
    {
    }

    public final void a(int i, String s)
    {
        a.b.setClickable(true);
        a.a.setEnabled(true);
        a.c.setVisibility(8);
        a.t();
        a.a(s);
    }

    public final void a(RK rk)
    {
        a.getActivity().onBackPressed();
    }

    public final void b(RK rk)
    {
        if (a.isAdded())
        {
            TwoFactorCodeVerificationFragment twofactorcodeverificationfragment = a;
            if (Bt.q() != null)
            {
                FragmentActivity fragmentactivity = twofactorcodeverificationfragment.getActivity();
                Intent intent = new Intent(fragmentactivity, com/snapchat/android/LandingPageActivity);
                intent.addFlags(0x4000000);
                intent.putExtra("recovery_code_used", IJ.a(rk.w()));
                twofactorcodeverificationfragment.startActivity(intent);
                fragmentactivity.finish();
                return;
            }
        }
    }

    public final void c()
    {
        if (ReleaseManager.f())
        {
            throw new RuntimeException("Verification required for two-factor authentication");
        } else
        {
            a.getActivity().onBackPressed();
            return;
        }
    }

    (TwoFactorCodeVerificationFragment twofactorcodeverificationfragment)
    {
        a = twofactorcodeverificationfragment;
        super();
    }
}
