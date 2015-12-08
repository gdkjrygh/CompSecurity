// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.analytics:
//            m, ao, AnalyticsReceiver, h, 
//            a, bb, bc, w, 
//            j, ab, u, ak, 
//            am, ap, AnalyticsService, v

final class an extends m
{

    private static final Object a = new Object();
    private static an s;
    private Context b;
    private u c;
    private volatile w d;
    private int e;
    private long f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;
    private boolean k;
    private boolean l;
    private v m;
    private Handler n;
    private boolean o;
    private am p;
    private boolean q;
    private boolean r;

    private an()
    {
        e = 1800;
        f = 0x8000000000000000L;
        g = true;
        j = false;
        k = true;
        l = true;
        m = new ao(this);
        q = false;
        r = false;
    }

    static long a(an an1, long l1)
    {
        an1.f = l1;
        return l1;
    }

    private void a(int i1, int j1)
    {
        int l1 = i1;
        int i2 = j1;
        if (!j)
        {
            int k1 = i1;
            if (i1 < 1800)
            {
                k1 = 1800;
            }
            l1 = k1;
            i2 = j1;
            if (j1 < 1800)
            {
                i2 = 1800;
                l1 = k1;
            }
        }
        f().setInexactRepeating(2, l1 * 1000, i2 * 1000, e());
    }

    static boolean a(an an1)
    {
        return an1.k;
    }

    static long b(an an1)
    {
        return an1.f;
    }

    static int c(an an1)
    {
        return an1.e;
    }

    public static an c()
    {
        if (s == null)
        {
            s = new an();
        }
        return s;
    }

    static Object d()
    {
        return a;
    }

    static boolean d(an an1)
    {
        return an1.q;
    }

    private PendingIntent e()
    {
        Intent intent = new Intent(b.getApplicationContext(), com/google/android/gms/analytics/AnalyticsReceiver);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(b, 0, intent, 0);
    }

    static Handler e(an an1)
    {
        return an1.n;
    }

    private AlarmManager f()
    {
        PendingIntent pendingintent = e();
        AlarmManager alarmmanager = (AlarmManager)b.getApplicationContext().getSystemService("alarm");
        alarmmanager.cancel(pendingintent);
        return alarmmanager;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        w w1 = null;
        if (d == null) goto _L2; else goto _L1
_L1:
        w1 = d;
_L8:
        if (w1 != null) goto _L4; else goto _L3
_L3:
        com.google.android.gms.analytics.h.c("Dispatch call queued. Dispatch will run once initialization is complete.");
        g = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (com.google.android.gms.analytics.a.a() != null)
        {
            w1 = com.google.android.gms.analytics.a.a().e();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        bb.a().a(bc.S);
        w1.a();
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final u a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (b == null)
        {
            b = context;
        }
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (b == null)
        {
            throw new IllegalStateException("Cant get a store unless we have a context");
        }
        break MISSING_BLOCK_LABEL_47;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        c = new j(m, b, new ab());
        c.a(r);
        if (i != null)
        {
            c.d().a(i);
            i = null;
        }
        boolean flag;
        if (n != null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        flag = o;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        f();
        context = b.getPackageManager().getReceiverInfo(new ComponentName(b, com/google/android/gms/analytics/AnalyticsReceiver), 2);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        if (!((ActivityInfo) (context)).enabled || e <= 0)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        a(e, e);
        com.google.android.gms.analytics.h.c("Using a receiver for local dispatch.");
        o = true;
_L1:
        if (p == null && l)
        {
            p = new am(this);
            context = p;
            Context context1 = b;
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context1.registerReceiver(context, intentfilter);
            intentfilter = new IntentFilter();
            intentfilter.addAction("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context1.getPackageName());
            context1.registerReceiver(context, intentfilter);
        }
        context = c;
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        com.google.android.gms.analytics.h.c("Receiver for local dispatch not registered. For more reliable analytics, please see http://goo.gl/8Rd3yj for instructions.");
        n = new Handler(b.getMainLooper(), new ap(this));
        if (e > 0)
        {
            n.sendMessageDelayed(n.obtainMessage(1, a), Math.min(60, e) * 1000);
        }
          goto _L1
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        g();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (n != null || o) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.h.c("Dispatch period set with null handler and no receiver. Dispatch will run once initialization is complete.");
        e = i1;
        AnalyticsService.a(i1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        bb.a().a(bc.T);
        if (!q && k && e > 0)
        {
            if (n != null)
            {
                n.removeMessages(1, a);
            }
            if (o)
            {
                f();
            }
        }
        e = i1;
        AnalyticsService.a(i1);
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!q && k)
        {
            if (n != null)
            {
                n.sendMessageDelayed(n.obtainMessage(1, a), Math.min(60, e) * 1000);
            }
            if (o)
            {
                a(i1, i1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    final void a(Context context, w w1)
    {
        this;
        JVM INSTR monitorenter ;
        Context context1 = b;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = context.getApplicationContext();
        if (d != null) goto _L1; else goto _L3
_L3:
        d = w1;
        if (g)
        {
            a();
            g = false;
        }
        if (!h) goto _L1; else goto _L4
_L4:
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        com.google.android.gms.analytics.h.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
        h = true;
_L5:
        h = false;
          goto _L1
        context;
        throw context;
        bb.a().a(bc.af);
        d.b();
          goto _L5
    }

    final void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(q, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        if (q != flag) goto _L2; else goto _L1
_L1:
        boolean flag2 = k;
        if (flag2 != flag1) goto _L2; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag && flag1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (e > 0)
        {
            if (n != null)
            {
                n.removeMessages(1, a);
            }
            if (o)
            {
                f();
            }
        }
        if (flag || !flag1)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (e > 0)
        {
            if (n != null)
            {
                n.sendMessageDelayed(n.obtainMessage(1, a), Math.min(60, e) * 1000);
            }
            if (o)
            {
                a(e, e);
            }
        }
        StringBuilder stringbuilder = new StringBuilder("PowerSaveMode ");
        Object obj;
        if (!flag && flag1)
        {
            obj = "terminated.";
        } else
        {
            obj = "initiated.";
        }
        com.google.android.gms.analytics.h.c(stringbuilder.append(((String) (obj))).toString());
        q = flag;
        k = flag1;
        if (true) goto _L3; else goto _L4
_L4:
        obj;
        throw obj;
    }

    final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!q && k && e > 0)
        {
            if (n != null)
            {
                n.removeMessages(1, a);
                f = 0x8000000000000000L;
                n.sendMessage(n.obtainMessage(1, a));
            }
            if (o)
            {
                a(0, e);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
