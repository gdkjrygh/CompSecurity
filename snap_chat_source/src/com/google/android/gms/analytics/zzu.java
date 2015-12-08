// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

// Referenced classes of package com.google.android.gms.analytics:
//            zzaj

class zzu extends BroadcastReceiver
{

    static final String zzBO = com/google/android/gms/analytics/zzu.getName();
    private final zzaj zzBP;

    zzu(zzaj zzaj1)
    {
        zzBP = zzaj1;
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag1 = intent.getBooleanExtra("noConnectivity", false);
            context = zzBP;
            if (!flag1)
            {
                flag = true;
            }
            context.zzE(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(zzBO))
        {
            zzBP.zzfJ();
            return;
        }
    }

    public void zzD(Context context)
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
