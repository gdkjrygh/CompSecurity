// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmcm.adsdk.b.c.b;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            n

final class r extends BroadcastReceiver
{

    final n a;

    private r(n n1)
    {
        a = n1;
        super();
    }

    r(n n1, byte byte0)
    {
        this(n1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!"android.intent.action.SCREEN_ON".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        b.a("CMPicksNativeAd", "screen on");
        b.a("CMPicksNativeAd", (new StringBuilder("this ad has report show?:")).append(a.a).toString());
        if (a.a) goto _L4; else goto _L3
_L3:
        n.a(a);
_L6:
        return;
_L4:
        b.a("CMPicksNativeAd", "this ad has report to unregsiter screen receiver");
        com.cmcm.adsdk.nativead.n.b(a);
        return;
_L2:
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            b.a("CMPicksNativeAd", "screen off");
            n.c(a);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        {
            b.a("CMPicksNativeAd", "screen present");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
