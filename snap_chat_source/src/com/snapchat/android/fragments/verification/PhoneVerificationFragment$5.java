// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bt;
import Jo;
import android.view.View;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import jr;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

final class a
    implements android.view.on.PhoneVerificationFragment._cls5
{

    private PhoneVerificationFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            PhoneVerificationFragment.a(a, com.snapchat.android.ui.window.rDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
            Jo.h(a.getActivity());
            view = a.c;
            if (Bt.B() || RegistrationAnalytics.b())
            {
                jr jr1 = new jr();
                ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jr1);
            }
            return;
        } else
        {
            PhoneVerificationFragment.a(a, false);
            return;
        }
    }

    (PhoneVerificationFragment phoneverificationfragment)
    {
        a = phoneverificationfragment;
        super();
    }
}
