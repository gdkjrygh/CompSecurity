// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bt;
import android.app.AlertDialog;
import android.view.View;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import hm;
import jo;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a
    implements android.view.on.PhoneVerificationFragment._cls4
{

    private PhoneVerificationFragment a;

    public final void onClick(View view)
    {
        PhoneVerificationFragment.s(a).show();
        RegistrationAnalytics registrationanalytics = a.c;
        if (!PhoneVerificationFragment.t(a))
        {
            view = PhoneVerificationFragment.u(a);
        } else
        {
            view = null;
        }
        if (Bt.B() || RegistrationAnalytics.b())
        {
            jo jo1 = new jo();
            jo1.country = view;
            registrationanalytics.mBlizzardEventLogger.a(jo1);
        }
    }

    (PhoneVerificationFragment phoneverificationfragment)
    {
        a = phoneverificationfragment;
        super();
    }
}
