// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class j extends BroadcastReceiver
{

    final AdMobvistaAct a;

    j(AdMobvistaAct admobvistaact)
    {
        a = admobvistaact;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ((new StringBuilder("LAODING_SHOW")).append(AdMobvistaAct.i(a)).toString().equals(intent.getAction()))
        {
            AdMobvistaAct.j(a);
        } else
        if ((new StringBuilder("LAODING_DISMISSS")).append(AdMobvistaAct.i(a)).toString().equals(intent.getAction()))
        {
            AdMobvistaAct.k(a);
            return;
        }
    }
}
