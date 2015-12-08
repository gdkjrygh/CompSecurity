// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.n;

public class am
{

    private static am a = null;
    private BroadcastReceiver b;

    private am()
    {
        b = new BroadcastReceiver() {

            final am a;

            public void onReceive(Context context, Intent intent)
            {
                if ("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(intent.getAction()))
                {
                    a.a(context, false);
                }
            }

            
            {
                a = am.this;
                super();
            }
        };
        LocalBroadcastManager localbroadcastmanager = LocalBroadcastManager.getInstance(FitBitApplication.a());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        localbroadcastmanager.registerReceiver(b, intentfilter);
    }

    public static am a()
    {
        com/fitbit/util/am;
        JVM INSTR monitorenter ;
        am am1;
        if (a == null)
        {
            a = new am();
        }
        am1 = a;
        com/fitbit/util/am;
        JVM INSTR monitorexit ;
        return am1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Context context, boolean flag)
    {
        if (context != null)
        {
            context.startService(n.a(context, flag));
        }
    }

}
