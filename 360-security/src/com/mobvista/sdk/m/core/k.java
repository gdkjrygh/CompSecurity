// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RelativeLayout;

// Referenced classes of package com.mobvista.sdk.m.core:
//            AdMobvistaAct

final class k extends BroadcastReceiver
{

    final AdMobvistaAct a;

    k(AdMobvistaAct admobvistaact)
    {
        a = admobvistaact;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        String s;
        int i;
        context = intent.getStringExtra("ORDER");
        s = intent.getStringExtra("RESULT");
        i = intent.getIntExtra("NUM", 0);
        if (!"MV_TOP_FINISH".equals(context)) goto _L2; else goto _L1
_L1:
        if (!"LOADED".equals(s) || i != 0) goto _L4; else goto _L3
_L3:
        AdMobvistaAct.c(a).setVisibility(8);
_L6:
        return;
_L4:
        AdMobvistaAct.d(a);
        return;
_L2:
        if ("MV_GAME_FINISH".equals(context))
        {
            if ("LOADED".equals(s) && i == 0)
            {
                AdMobvistaAct.e(a).setVisibility(8);
                return;
            } else
            {
                AdMobvistaAct.f(a);
                return;
            }
        }
        if ("MV_UTILITY_FINISH".equals(context))
        {
            if ("LOADED".equals(s) && i == 0)
            {
                AdMobvistaAct.g(a).setVisibility(8);
                return;
            } else
            {
                AdMobvistaAct.h(a);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
