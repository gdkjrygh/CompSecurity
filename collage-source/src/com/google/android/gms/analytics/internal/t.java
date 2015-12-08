// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            u, g, af, s, 
//            j, o, ab, a, 
//            y, ai, aj, p, 
//            am, r

public class t
{

    private static t a;
    private final Context b;
    private final Context c;
    private final ix d;
    private final af e;
    private final g f;
    private final zzof g;
    private final p h;
    private final aj i;
    private final o j;
    private final j k;
    private final c l;
    private final ab m;
    private final a n;
    private final y o;
    private final ai p;

    protected t(u u1)
    {
        Object obj = u1.a();
        z.a(obj, "Application context can't be null");
        z.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = u1.b();
        z.a(obj1);
        b = ((Context) (obj));
        c = ((Context) (obj1));
        d = u1.h(this);
        e = u1.g(this);
        obj1 = u1.f(this);
        ((g) (obj1)).E();
        f = ((g) (obj1));
        ab ab1;
        a a1;
        y y1;
        ai ai1;
        if (e().a())
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(s.a).append(" is starting up.").toString());
        } else
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(s.a).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = u1.q(this);
        ((j) (obj1)).E();
        k = ((j) (obj1));
        obj1 = u1.e(this);
        ((o) (obj1)).E();
        j = ((o) (obj1));
        obj1 = u1.l(this);
        ab1 = u1.d(this);
        a1 = u1.c(this);
        y1 = u1.b(this);
        ai1 = u1.a(this);
        obj = u1.a(((Context) (obj)));
        ((zzof) (obj)).a(a());
        g = ((zzof) (obj));
        obj = u1.i(this);
        ab1.E();
        m = ab1;
        a1.E();
        n = a1;
        y1.E();
        o = y1;
        ai1.E();
        p = ai1;
        u1 = u1.p(this);
        u1.E();
        i = u1;
        ((p) (obj1)).E();
        h = ((p) (obj1));
        if (e().a())
        {
            f().b("Device AnalyticsService version", s.a);
        }
        ((c) (obj)).a();
        l = ((c) (obj));
        ((p) (obj1)).b();
    }

    public static t a(Context context)
    {
        z.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/t;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        ix ix1 = iy.d();
        l1 = ix1.b();
        context = new t(new u(context.getApplicationContext()));
        a = context;
        com.google.android.gms.analytics.c.d();
        l1 = ix1.b() - l1;
        l2 = ((Long)am.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.f().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/t;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/analytics/internal/t;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(r r1)
    {
        z.a(r1, "Analytics service not created/initialized");
        z.b(r1.C(), "Analytics service not initialized");
    }

    protected Thread.UncaughtExceptionHandler a()
    {
        return new Thread.UncaughtExceptionHandler() {

            final t a;

            public void uncaughtException(Thread thread, Throwable throwable)
            {
                thread = a.g();
                if (thread != null)
                {
                    thread.e("Job execution failed", throwable);
                }
            }

            
            {
                a = t.this;
                super();
            }
        };
    }

    public Context b()
    {
        return b;
    }

    public Context c()
    {
        return c;
    }

    public ix d()
    {
        return d;
    }

    public af e()
    {
        return e;
    }

    public g f()
    {
        a(f);
        return f;
    }

    public g g()
    {
        return f;
    }

    public zzof h()
    {
        z.a(g);
        return g;
    }

    public p i()
    {
        a(h);
        return h;
    }

    public aj j()
    {
        a(i);
        return i;
    }

    public c k()
    {
        z.a(l);
        z.b(l.c(), "Analytics instance not initialized");
        return l;
    }

    public o l()
    {
        a(j);
        return j;
    }

    public j m()
    {
        a(k);
        return k;
    }

    public j n()
    {
        if (k == null || !k.C())
        {
            return null;
        } else
        {
            return k;
        }
    }

    public a o()
    {
        a(n);
        return n;
    }

    public ab p()
    {
        a(m);
        return m;
    }

    public y q()
    {
        a(o);
        return o;
    }

    public ai r()
    {
        return p;
    }

    public void s()
    {
        zzof.d();
    }
}
