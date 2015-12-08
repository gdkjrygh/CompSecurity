// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.activities.ActivityMain;
import com.tinder.enums.PaywallPerk;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements com.tinder.c.ts.bm._cls8
{

    final bm a;

    public final void a()
    {
        ((ActivityMain)a.getActivity()).launchPlusSubscriptionPaywall(4, PaywallPerk.SUPER_LIKE);
    }

    rk(bm bm1)
    {
        a = bm1;
        super();
    }
}
