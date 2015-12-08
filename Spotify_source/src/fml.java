// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class fml extends fni
{

    private final Context b;
    private BroadcastReceiver c;

    public fml(fnj fnj1)
    {
        super("BatteryChargingState");
        b = fnj1.a;
        c = new BroadcastReceiver() {

            private fml a;

            public final void onReceive(Context context, Intent intent)
            {
                int i = intent.getIntExtra("status", -1);
                boolean flag;
                if (i == 2 || i == 5)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    a.J_();
                    return;
                } else
                {
                    a.c();
                    return;
                }
            }

            
            {
                a = fml.this;
                super();
            }
        };
        b.registerReceiver(c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    protected final void a()
    {
        b.unregisterReceiver(c);
    }
}
