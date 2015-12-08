// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.enums.PaywallPerk;
import com.tinder.model.Paywall;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements com.tinder.c.ts.bd._cls2
{

    final bd a;

    public final void a()
    {
        ((Paywall)a.getActivity()).launchPlusSubscriptionPaywall(4, PaywallPerk.SUPER_LIKE);
    }

    rk(bd bd1)
    {
        a = bd1;
        super();
    }
}
