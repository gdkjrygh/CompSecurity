// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bt;
import android.view.View;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import jt;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a
    implements android.view.on.PhoneVerificationFragment._cls9
{

    private PhoneVerificationFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            PhoneVerificationFragment.b(a, com.snapchat.android.ui.window.rDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
            view = a.c;
            flag = PhoneVerificationFragment.h(a);
            if (Bt.B() || RegistrationAnalytics.b())
            {
                jt jt1 = new jt();
                jt1.autofill = Boolean.valueOf(flag);
                ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jt1);
            }
            return;
        } else
        {
            PhoneVerificationFragment.b(a, false);
            return;
        }
    }

    (PhoneVerificationFragment phoneverificationfragment)
    {
        a = phoneverificationfragment;
        super();
    }
}
