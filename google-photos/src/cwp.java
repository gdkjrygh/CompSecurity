// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

public final class cwp
    implements cwn
{

    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static final IntentFilter b;
    private final BroadcastReceiver c = new cwq(this);
    private final Context d;
    private final PowerManager e;
    private final bnl f;
    private final noj g;
    private Runnable h;
    private boolean i;

    public cwp(Context context, PowerManager powermanager, bnl bnl1, noj noj1)
    {
        d = (Context)b.a(context, "context", null);
        e = (PowerManager)b.a(powermanager, "powerManager", null);
        f = (bnl)b.a(bnl1, "gservicesSettings", null);
        g = (noj)b.a(noj1, "movieMakerProvider", null);
    }

    static Runnable a(cwp cwp1)
    {
        return cwp1.h;
    }

    static IntentFilter f()
    {
        return b;
    }

    public final void a(Runnable runnable)
    {
        h = (Runnable)b.a(runnable, "runnable", null);
        if (!i)
        {
            i = true;
            d.registerReceiver(c, b);
        }
    }

    public final boolean a()
    {
        boolean flag = false;
        if (d.registerReceiver(null, a).getIntExtra("plugged", 0) == 0)
        {
            flag = true;
        }
        return lvd.a(d.getContentResolver(), "moviemaker:background_service_forced_power_disconnected_value", flag);
    }

    public final boolean b()
    {
        boolean flag = e.isScreenOn();
        return lvd.a(d.getContentResolver(), "moviemaker:background_service_forced_screen_on_value", flag);
    }

    public final boolean c()
    {
        boolean flag = false;
        Intent intent = d.registerReceiver(null, a);
        if ((intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", -1) < 15)
        {
            flag = true;
        }
        return lvd.a(d.getContentResolver(), "moviemaker:background_service_forced_battery_low_value", flag);
    }

    public final void d()
    {
        if (i)
        {
            i = false;
            d.unregisterReceiver(c);
            h = null;
        }
    }

    public final boolean e()
    {
        return g.a() && f.A_() || g.c();
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter();
        b = intentfilter;
        intentfilter.addAction("android.intent.action.BATTERY_LOW");
        b.addAction("android.intent.action.SCREEN_ON");
        b.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    }
}
