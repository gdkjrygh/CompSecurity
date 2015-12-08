// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.analytics:
//            aj

class u extends BroadcastReceiver
{

    static final String yR = com/google/android/gms/analytics/u.getName();
    private final aj yS;

    u(aj aj1)
    {
        yS = aj1;
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
            context = yS;
            if (!flag1)
            {
                flag = true;
            }
            context.C(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(yR))
        {
            yS.ey();
            return;
        }
    }

    public void z(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentfilter);
        intentfilter = new IntentFilter();
        intentfilter.addAction("com.google.analytics.RADIO_POWERED");
        intentfilter.addCategory(context.getPackageName());
        context.registerReceiver(this, intentfilter);
    }

}
