// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.analytics.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ad;
import com.google.android.gms.d.q;
import com.google.android.gms.d.r;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ad, j, bb, aa, 
//            n, s, au, b, 
//            am, bf, bg, t, 
//            bj, bk, z, ac

public class ab
{

    private static ab a;
    private final Context b;
    private final Context c;
    private final q d;
    private final bb e;
    private final j f;
    private final ad g;
    private final t h;
    private final bg i;
    private final s j;
    private final n k;
    private final f l;
    private final au m;
    private final b n;
    private final am o;
    private final bf p;

    protected ab(com.google.android.gms.analytics.internal.ad ad1)
    {
        Object obj = ad1.a();
        u.a(obj, "Application context can't be null");
        u.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = ad1.b();
        u.a(obj1);
        b = ((Context) (obj));
        c = ((Context) (obj1));
        d = ad1.h(this);
        e = ad1.g(this);
        obj1 = ad1.f(this);
        ((j) (obj1)).E();
        f = ((j) (obj1));
        au au1;
        b b1;
        am am1;
        bf bf1;
        if (e().a())
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(aa.a).append(" is starting up.").toString());
        } else
        {
            f().d((new StringBuilder()).append("Google Analytics ").append(aa.a).append(" is starting up. ").append("To enable debug logging on a device run:\n").append("  adb shell setprop log.tag.GAv4 DEBUG\n").append("  adb logcat -s GAv4").toString());
        }
        obj1 = ad1.q(this);
        ((n) (obj1)).E();
        k = ((n) (obj1));
        obj1 = ad1.e(this);
        ((s) (obj1)).E();
        j = ((s) (obj1));
        obj1 = ad1.l(this);
        au1 = ad1.d(this);
        b1 = ad1.c(this);
        am1 = ad1.b(this);
        bf1 = ad1.a(this);
        obj = ad1.a(((Context) (obj)));
        ((ad) (obj)).a(a());
        g = ((ad) (obj));
        obj = ad1.i(this);
        au1.E();
        m = au1;
        b1.E();
        n = b1;
        am1.E();
        o = am1;
        bf1.E();
        p = bf1;
        ad1 = ad1.p(this);
        ad1.E();
        i = ad1;
        ((t) (obj1)).E();
        h = ((t) (obj1));
        if (e().a())
        {
            f().b("Device AnalyticsService version", aa.a);
        }
        ((f) (obj)).a();
        l = ((f) (obj));
        ((t) (obj1)).b();
    }

    public static ab a(Context context)
    {
        u.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/ab;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        q q1 = com.google.android.gms.d.r.c();
        l1 = q1.b();
        context = new ab(new com.google.android.gms.analytics.internal.ad(context.getApplicationContext()));
        a = context;
        com.google.android.gms.analytics.f.d();
        l1 = q1.b() - l1;
        l2 = ((Long)bj.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        context.f().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/ab;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/analytics/internal/ab;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void a(z z1)
    {
        u.a(z1, "Analytics service not created/initialized");
        u.b(z1.C(), "Analytics service not initialized");
    }

    protected Thread.UncaughtExceptionHandler a()
    {
        return new ac(this);
    }

    public Context b()
    {
        return b;
    }

    public Context c()
    {
        return c;
    }

    public q d()
    {
        return d;
    }

    public bb e()
    {
        return e;
    }

    public j f()
    {
        a(f);
        return f;
    }

    public j g()
    {
        return f;
    }

    public ad h()
    {
        u.a(g);
        return g;
    }

    public t i()
    {
        a(h);
        return h;
    }

    public bg j()
    {
        a(i);
        return i;
    }

    public f k()
    {
        u.a(l);
        u.b(l.c(), "Analytics instance not initialized");
        return l;
    }

    public s l()
    {
        a(j);
        return j;
    }

    public n m()
    {
        a(k);
        return k;
    }

    public n n()
    {
        if (k == null || !k.C())
        {
            return null;
        } else
        {
            return k;
        }
    }

    public b o()
    {
        a(n);
        return n;
    }

    public au p()
    {
        a(m);
        return m;
    }

    public am q()
    {
        a(o);
        return o;
    }

    public bf r()
    {
        return p;
    }

    public void s()
    {
        ad.d();
    }
}
