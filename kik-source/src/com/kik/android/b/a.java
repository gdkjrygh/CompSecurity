// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import com.kik.g.ao;
import com.kik.g.ar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.android.b:
//            c, b

public final class a extends ao
{

    private static ScheduledExecutorService a = Executors.newScheduledThreadPool(1);
    private static final b b = org.c.c.a("KikWakeLock");
    private static AtomicInteger c = new AtomicInteger();
    private android.os.PowerManager.WakeLock d;
    private android.net.wifi.WifiManager.WifiLock e;
    private final String f;
    private final ConnectivityManager g;
    private final AtomicBoolean h;
    private PowerManager i;
    private Context j;
    private final BroadcastReceiver k;

    private a(Context context, String s)
    {
        h = new AtomicBoolean(false);
        k = new com.kik.android.b.c(this);
        f = s;
        j = context;
        i = (PowerManager)context.getSystemService("power");
        d = i.newWakeLock(1, s);
        if (d != null)
        {
            d.setReferenceCounted(false);
        }
        e = ((WifiManager)context.getSystemService("wifi")).createWifiLock(3, s);
        if (e != null)
        {
            e.setReferenceCounted(false);
        }
        g = (ConnectivityManager)context.getSystemService("connectivity");
    }

    public a(Context context, String s, byte byte0)
    {
        this(context, s);
    }

    static void a(a a1, boolean flag)
    {
        a1.a(true, flag);
    }

    private void a(boolean flag, boolean flag1)
    {
        boolean flag2;
        flag2 = true;
        NetworkInfo networkinfo;
        if (flag && !flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = h.getAndSet(flag);
        if (flag1 || !flag) goto _L2; else goto _L1
_L1:
        c.incrementAndGet();
        if (e == null) goto _L4; else goto _L3
_L3:
        if (g == null) goto _L6; else goto _L5
_L5:
        networkinfo = g.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected() || networkinfo.getType() != 1) goto _L6; else goto _L7
_L7:
        if (flag2)
        {
            e.acquire();
        }
_L4:
        if (d != null)
        {
            d.acquire();
        }
_L9:
        return;
_L6:
        flag2 = false;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!flag1 || flag) goto _L9; else goto _L8
_L8:
        c.decrementAndGet();
        if (e != null && e.isHeld())
        {
            e.release();
        }
        if (d == null || !d.isHeld()) goto _L9; else goto _L10
_L10:
        d.release();
        return;
        if (true) goto _L7; else goto _L11
_L11:
    }

    static b c()
    {
        return b;
    }

    public final ar a(long l)
    {
        ar ar = f();
        a.schedule(new com.kik.android.b.b(this, ar), l, TimeUnit.MILLISECONDS);
        return ar;
    }

    protected final void a()
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        j.getApplicationContext().registerReceiver(k, intentfilter);
        a(true, i.isScreenOn());
        super.a();
    }

    protected final void b()
    {
        super.b();
        j.getApplicationContext().unregisterReceiver(k);
        a(false, i.isScreenOn());
    }

}
