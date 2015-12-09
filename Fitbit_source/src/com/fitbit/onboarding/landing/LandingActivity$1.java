// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import com.fitbit.ApplicationForegroundController;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.onboarding.landing:
//            LandingActivity

class a
    implements Runnable
{

    final LandingActivity a;

    public void run()
    {
        com.fitbit.e.a.a("LandingActivity", "Pedometer support check finished", new Object[0]);
        if (!com.fitbit.onboarding.landing.LandingActivity.a(a)) goto _L2; else goto _L1
_L1:
        if (ApplicationForegroundController.a().a(400L)) goto _L4; else goto _L3
_L3:
        a.finish();
_L5:
        return;
_L4:
        if (LandingActivity.b(a)) goto _L5; else goto _L2
_L2:
        LandingActivity.c(a);
        return;
    }

    (LandingActivity landingactivity)
    {
        a = landingactivity;
        super();
    }
}
