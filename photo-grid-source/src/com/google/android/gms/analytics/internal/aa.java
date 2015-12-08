// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.wg;
import com.google.android.gms.internal.wh;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ac, j, z, n, 
//            r, s, b, al, 
//            bd, ab, as, be, 
//            bh, bi, y, az

public class aa
{

    private static aa a;
    private final Context b;
    private final Context c;
    private final wg d = wh.d();
    private final az e = ac.b(this);
    private final j f;
    private final f g;
    private final s h;
    private final be i;
    private final r j;
    private final n k;
    private final com.google.android.gms.analytics.f l;
    private final as m;
    private final b n;
    private final al o;
    private final bd p;

    private aa(ac ac1)
    {
        Object obj = ac1.a();
        bl.a(obj, "Application context can't be null");
        bl.b(obj instanceof Application, "getApplicationContext didn't return the application");
        Object obj1 = ac1.b();
        bl.a(obj1);
        b = ((Context) (obj));
        c = ((Context) (obj1));
        obj1 = new j(this);
        ((j) (obj1)).C();
        f = ((j) (obj1));
        b b1;
        al al1;
        bd bd1;
        if (i.a)
        {
            e().d((new StringBuilder("Google Analytics ")).append(z.a).append(" is starting up.").toString());
        } else
        {
            e().d((new StringBuilder("Google Analytics ")).append(z.a).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        obj1 = com.google.android.gms.analytics.internal.ac.f(this);
        ((n) (obj1)).C();
        k = ((n) (obj1));
        obj1 = new r(this);
        ((r) (obj1)).C();
        j = ((r) (obj1));
        ac1 = new s(this, ac1);
        obj1 = ac.a(this);
        b1 = new b(this);
        al1 = new al(this);
        bd1 = new bd(this);
        obj = com.google.android.gms.c.f.a(((Context) (obj)));
        ((f) (obj)).a(new ab(this));
        g = ((f) (obj));
        obj = new com.google.android.gms.analytics.f(this);
        ((as) (obj1)).C();
        m = ((as) (obj1));
        b1.C();
        n = b1;
        al1.C();
        o = al1;
        bd1.C();
        p = bd1;
        obj1 = ac.e(this);
        ((be) (obj1)).C();
        i = ((be) (obj1));
        ac1.C();
        h = ac1;
        if (i.a)
        {
            e().b("Device AnalyticsService version", z.a);
        }
        ((com.google.android.gms.analytics.f) (obj)).a();
        l = ((com.google.android.gms.analytics.f) (obj));
        ac1.b();
    }

    public static aa a(Context context)
    {
        bl.a(context);
        if (a != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/analytics/internal/aa;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        wg wg1 = wh.d();
        l1 = wg1.b();
        context = new aa(new ac(context.getApplicationContext()));
        a = context;
        com.google.android.gms.analytics.f.c();
        l1 = wg1.b() - l1;
        l2 = ((Long)bh.Q.a()).longValue();
        if (l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        context.e().c("Slow initialization (ms)", Long.valueOf(l1), Long.valueOf(l2));
        com/google/android/gms/analytics/internal/aa;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/google/android/gms/analytics/internal/aa;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void a(y y1)
    {
        bl.a(y1, "Analytics service not created/initialized");
        bl.b(y1.A(), "Analytics service not initialized");
    }

    public static void r()
    {
        com.google.android.gms.c.f.d();
    }

    public final Context a()
    {
        return b;
    }

    public final Context b()
    {
        return c;
    }

    public final wg c()
    {
        return d;
    }

    public final az d()
    {
        return e;
    }

    public final j e()
    {
        a(f);
        return f;
    }

    public final j f()
    {
        return f;
    }

    public final f g()
    {
        bl.a(g);
        return g;
    }

    public final s h()
    {
        a(h);
        return h;
    }

    public final be i()
    {
        a(i);
        return i;
    }

    public final com.google.android.gms.analytics.f j()
    {
        bl.a(l);
        bl.b(l.b(), "Analytics instance not initialized");
        return l;
    }

    public final r k()
    {
        a(j);
        return j;
    }

    public final n l()
    {
        a(k);
        return k;
    }

    public final n m()
    {
        if (k == null || !k.A())
        {
            return null;
        } else
        {
            return k;
        }
    }

    public final b n()
    {
        a(n);
        return n;
    }

    public final as o()
    {
        a(m);
        return m;
    }

    public final al p()
    {
        a(o);
        return o;
    }

    public final bd q()
    {
        return p;
    }
}
