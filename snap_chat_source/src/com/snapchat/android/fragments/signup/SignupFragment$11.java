// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.View;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import jq;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.view.Listener
{

    private SignupFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            view = SignupFragment.b(a);
            jq jq1 = new jq();
            ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jq1);
            return;
        } else
        {
            SignupFragment.b(a, false);
            return;
        }
    }

    gger(SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
