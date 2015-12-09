// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.os.Handler;

// Referenced classes of package com.fitbit.onboarding.landing:
//            LandingActivity, b, a

class a
    implements Runnable
{

    final LandingActivity a;

    public void run()
    {
        LandingActivity.h(a).b();
        LandingActivity.i(a).b();
        LandingActivity.g(a).postDelayed(LandingActivity.j(a), 3000L);
    }

    (LandingActivity landingactivity)
    {
        a = landingactivity;
        super();
    }
}
