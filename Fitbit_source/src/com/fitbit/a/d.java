// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.FitBitApplication;
import com.fitbit.pedometer.service.a;
import com.fitbit.pedometer.service.b;
import com.fitbit.util.c;
import com.fitbit.util.p;
import java.util.TimeZone;

public final class d
{

    private static final String a = "SystemEventsController";
    private final BroadcastReceiver b = new BroadcastReceiver() {

        final d a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.pedometer.service.b.a();
            com.fitbit.widget.b.b(context);
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction()))
            {
                com.fitbit.widget.b.a(context);
                if (p.l())
                {
                    com.fitbit.pedometer.service.a.a(false);
                }
            }
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final BroadcastReceiver c = new BroadcastReceiver() {

        final d a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.e.a.a("SystemEventsController", "Timezone changed broadcast %s", new Object[] {
                TimeZone.getDefault()
            });
            com.fitbit.util.c.a(context);
        }

            
            {
                a = d.this;
                super();
            }
    };
    private final BroadcastReceiver d = new BroadcastReceiver() {

        final d a;

        public void onReceive(Context context, Intent intent)
        {
            com.fitbit.e.a.a("SystemEventsController", "Locale changed broadcast %s", new Object[] {
                TimeZone.getDefault()
            });
            com.fitbit.util.c.c(context);
        }

            
            {
                a = d.this;
                super();
            }
    };

    public d()
    {
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        FitBitApplication.a().registerReceiver(b, intentfilter);
        FitBitApplication.a().registerReceiver(c, new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        FitBitApplication.a().registerReceiver(d, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }
}
