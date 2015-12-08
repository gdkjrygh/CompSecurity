// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.analytics:
//            af

class q extends BroadcastReceiver
{

    static final String tR = com/google/android/gms/analytics/q.getName();
    private final af tS;

    q(af af1)
    {
        tS = af1;
    }

    public static void w(Context context)
    {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(tR, true);
        context.sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
            context = tS;
            if (!flag1)
            {
                flag = true;
            }
            context.t(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(tR))
        {
            tS.cI();
            return;
        }
    }

    public void v(Context context)
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
