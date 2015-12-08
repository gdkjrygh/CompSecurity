// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.ay.l;
import com.google.android.m4b.maps.ay.s;
import com.google.android.m4b.maps.y.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.ai:
//            d, b, a

public class c
    implements b.a, l, Runnable
{
    final class a extends BroadcastReceiver
    {

        volatile boolean a;
        private c b;

        public final void onReceive(Context context, Intent intent)
        {
            if (c.a(context) && a)
            {
                c.a(b).a(b);
                context.unregisterReceiver(this);
                a = false;
            }
        }

        a()
        {
            b = c.this;
            super();
        }
    }


    private static long a;
    private static long b;
    private static final String c = com/google/android/m4b/maps/ai/c.getSimpleName();
    private static long d;
    private static long e;
    private static long f;
    private final Context g;
    private final String h;
    private final k i;
    private final ScheduledExecutorService j;
    private Future k;
    private final Random l;
    private int m;
    private long n;
    private final d o;
    private com.google.android.m4b.maps.ai.a p;
    private final Set q = new HashSet();
    private final b r;

    private c(Context context, String s1, k k1, Random random, ScheduledExecutorService scheduledexecutorservice, d d1, b b1)
    {
        g = context;
        h = s1;
        i = k1;
        l = random;
        j = scheduledexecutorservice;
        o = d1;
        r = b1;
    }

    static b a(c c1)
    {
        return c1.r;
    }

    public static c a(Context context, String s1, ScheduledExecutorService scheduledexecutorservice, String s2)
    {
        k k1 = new k();
        Random random = new Random();
        String s3 = s.a(context, s1);
        return new c(context, s3, k1, random, scheduledexecutorservice, new d(context), new b(context, s3, s1, s2));
    }

    private void a(long l1)
    {
        if (k != null)
        {
            k.cancel(true);
        }
        if (l1 == 0L)
        {
            k = null;
            run();
            return;
        } else
        {
            k = j.schedule(this, l1, TimeUnit.MILLISECONDS);
            return;
        }
    }

    private void a(String s1, long l1, long l2)
    {
        m = 0;
        l2 -= a;
        if (l2 > 0L)
        {
            String s2 = c;
            long l3 = l2 / 1000L;
            Log.i(s2, (new StringBuilder(56)).append("Scheduling next attempt in ").append(l3).append(" seconds.").toString());
            a(l2);
        }
        this;
        JVM INSTR monitorenter ;
        p = new com.google.android.m4b.maps.ai.a(s1, l1);
        this;
        JVM INSTR monitorexit ;
        f();
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static boolean a(Context context)
    {
        return b(context);
    }

    private static boolean b(Context context)
    {
        if (context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0)
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            return context != null && context.isConnected();
        } else
        {
            return true;
        }
    }

    private boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ai.a a1 = p;
        boolean flag;
        if (a1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        Set set = q;
        set;
        JVM INSTR monitorenter ;
        Iterator iterator = q.iterator();
_L2:
        com.google.android.m4b.maps.ay.l.a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_55;
            }
            a1 = (com.google.android.m4b.maps.ay.l.a)iterator.next();
        } while (a1 == null);
        a1.a(this);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        set;
        JVM INSTR monitorexit ;
        throw exception;
        q.clear();
        set;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        double d1 = l.nextDouble();
        double d2 = f;
        a(Math.min(e, (long)(d1 * d2 + (double)d * Math.pow(1.6000000000000001D, m))));
        m = m + 1;
    }

    public final void a(com.google.android.m4b.maps.ay.l.a a1)
    {
        com.google.android.m4b.maps.y.j.a(a1, "callback");
        if (!e()) goto _L2; else goto _L1
_L1:
        a1.a(this);
_L4:
        return;
_L2:
        boolean flag;
        synchronized (q)
        {
            flag = q.isEmpty();
            q.add(a1);
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        a(0L);
        return;
        a1;
        set;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void a(String s1, long l1)
    {
        n = -1L;
        long l2 = com.google.android.m4b.maps.ay.k.b() + l1;
        a(s1, l2, l1);
        o.a(h, s1, l2);
    }

    public final void b()
    {
        if (k != null)
        {
            k.cancel(true);
        }
    }

    public final String c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e()) goto _L2; else goto _L1
_L1:
        String s1 = p.a;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
    {
        Log.i(c, "Token rejected");
        this;
        JVM INSTR monitorenter ;
        long l1;
        p = null;
        l1 = com.google.android.m4b.maps.ay.k.b();
        if (l1 >= n + b)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        n = l1;
        this;
        JVM INSTR monitorexit ;
        o.a();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ai.a a1 = o.a(h);
        if (a1 == null) goto _L2; else goto _L1
_L1:
        String s1;
        long l1;
        long l2;
        s1 = a1.a;
        l1 = a1.b;
        l2 = l1 - com.google.android.m4b.maps.ay.k.b();
        if (l2 > a) goto _L4; else goto _L3
_L3:
        Log.i(c, "Saved token has expired. Fetching a new one.");
        d();
_L2:
        if (!b(g))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        r.a(this);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Log.i(c, (new StringBuilder(60)).append("Token loaded from file. Expires in: ").append(l2).append(" ms.").toString());
        a(s1, l1, l2);
          goto _L5
        Exception exception;
        exception;
        throw exception;
        Log.i(c, "Waiting for active network connection to fetch a new auth token.");
        a a2 = new a();
        Context context = g;
        com.google.android.m4b.maps.ay.c.d();
        a2.a = true;
        context.registerReceiver(a2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          goto _L5
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(5L);
        b = TimeUnit.MINUTES.toMillis(1L);
        d = TimeUnit.SECONDS.toMillis(10L);
        e = TimeUnit.HOURS.toMillis(1L);
        f = TimeUnit.SECONDS.toMillis(5L);
    }
}
