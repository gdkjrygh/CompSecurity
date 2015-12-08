// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            t, g, r, j, 
//            n, o, a, x, 
//            ah, aa, ai, al, 
//            q, ae

public class s
{

    private static s a;
    private final Context b;
    private final Context c;
    private final io d = ip.d();
    private final ae e = t.b(this);
    private final com.google.android.gms.analytics.internal.g f;
    private final je g;
    private final o h;
    private final ai i;
    private final n j;
    private final j k;
    private final c l;
    private final aa m;
    private final a n;
    private final x o;
    private final ah p;

    private s(t t1)
    {
        Object obj = t1.a();
        y.a(obj, "Application context can't be null");
        y.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = t1.b();
        y.a(obj1);
        b = ((Context) (obj));
        c = ((Context) (obj1));
        obj1 = new com.google.android.gms.analytics.internal.g(this);
        ((com.google.android.gms.analytics.internal.g) (obj1)).C();
        f = ((com.google.android.gms.analytics.internal.g) (obj1));
        a a1;
        x x1;
        ah ah1;
        if (g.a)
        {
            e().e((new StringBuilder("Google Analytics ")).append(r.a).append(" is starting up.").toString());
        } else
        {
            e().e((new StringBuilder("Google Analytics ")).append(r.a).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        obj1 = t.f(this);
        ((j) (obj1)).C();
        k = ((j) (obj1));
        obj1 = new n(this);
        ((n) (obj1)).C();
        j = ((n) (obj1));
        t1 = new o(this, t1);
        obj1 = t.a(this);
        a1 = new a(this);
        x1 = new x(this);
        ah1 = new ah(this);
        obj = je.a(((Context) (obj)));
        ((je) (obj)).a(new Thread.UncaughtExceptionHandler() {

            final s a;

            public final void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = a.f();
                if (thread != null)
                {
                    thread.e("Job execution failed", throwable);
                }
            }

            
            {
                a = s.this;
                super();
            }
        });
        g = ((je) (obj));
        obj = new c(this);
        ((aa) (obj1)).C();
        m = ((aa) (obj1));
        a1.C();
        n = a1;
        x1.C();
        o = x1;
        ah1.C();
        p = ah1;
        obj1 = t.e(this);
        ((ai) (obj1)).C();
        i = ((ai) (obj1));
        t1.C();
        h = t1;
        if (g.a)
        {
            e().b("Device AnalyticsService version", r.a);
        }
        ((c) (obj)).a();
        l = ((c) (obj));
        t1.b();
    }

    public static s a(Context context)
    {
        y.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/s;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        io io1 = ip.d();
        l1 = io1.b();
        context = new s(new t(context.getApplicationContext()));
        a = context;
        com.google.android.gms.analytics.c.c();
        l1 = io1.b() - l1;
        l2 = ((Long)al.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        context.e().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/s;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/analytics/internal/s;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(q q1)
    {
        y.a(q1, "Analytics service not created/initialized");
        y.b(q1.A(), "Analytics service not initialized");
    }

    public static void r()
    {
        je.d();
    }

    public final Context a()
    {
        return b;
    }

    public final Context b()
    {
        return c;
    }

    public final io c()
    {
        return d;
    }

    public final ae d()
    {
        return e;
    }

    public final com.google.android.gms.analytics.internal.g e()
    {
        a(f);
        return f;
    }

    public final com.google.android.gms.analytics.internal.g f()
    {
        return f;
    }

    public final je g()
    {
        y.a(g);
        return g;
    }

    public final o h()
    {
        a(h);
        return h;
    }

    public final ai i()
    {
        a(i);
        return i;
    }

    public final c j()
    {
        y.a(l);
        y.b(l.b(), "Analytics instance not initialized");
        return l;
    }

    public final n k()
    {
        a(j);
        return j;
    }

    public final j l()
    {
        a(k);
        return k;
    }

    public final j m()
    {
        if (k == null || !k.A())
        {
            return null;
        } else
        {
            return k;
        }
    }

    public final a n()
    {
        a(n);
        return n;
    }

    public final aa o()
    {
        a(m);
        return m;
    }

    public final x p()
    {
        a(o);
        return o;
    }

    public final ah q()
    {
        return p;
    }
}
