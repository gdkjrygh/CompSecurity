// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cw

class bn extends BroadcastReceiver
{

    static final String tO = com/google/android/gms/tagmanager/bn.getName();
    private final cw agj;

    bn(cw cw1)
    {
        agj = cw1;
    }

    public static void t(Context context)
    {
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(tO, true);
        context.sendBroadcast(intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            Bundle bundle = intent.getExtras();
            context = Boolean.FALSE;
            if (bundle != null)
            {
                context = Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"));
            }
            intent = agj;
            boolean flag;
            if (!context.booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.t(flag);
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context) && !intent.hasExtra(tO))
        {
            agj.cD();
            return;
        }
    }

    public void s(Context context)
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
