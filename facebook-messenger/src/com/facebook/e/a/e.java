// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e.a;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.base.activity.g;
import com.facebook.base.c;
import com.facebook.common.c.i;
import com.facebook.common.e.h;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.google.common.a.hy;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.e.a:
//            f, b, h, g, 
//            d, a

public class e
    implements c
{

    private static final Class a = com/facebook/e/a/e;
    private static final ae b;
    private static final ae c;
    private static final ae d;
    private static final ae e;
    private static final ae f;
    private final ConcurrentMap g = (new hy()).f().n();
    private final ConcurrentMap h = (new hy()).f().n();
    private final Runtime i;
    private final com.facebook.e.a.g j;
    private final com.facebook.e.a.h k;
    private final com.facebook.e.c l;
    private final d m;
    private final g n;
    private final WindowManager o;
    private final h p;
    private i q;
    private com.facebook.e.a.b r;
    private com.facebook.e.a.b s;
    private f t;
    private float u;

    public e(com.facebook.e.a.h h1, com.facebook.e.a.g g1, Runtime runtime, com.facebook.e.c c1, d d1, WindowManager windowmanager, g g2, 
            h h2)
    {
        k = h1;
        j = g1;
        i = runtime;
        l = c1;
        m = d1;
        n = g2;
        o = windowmanager;
        t = com.facebook.e.a.f.a();
        r = new com.facebook.e.a.b(t.b(), com.facebook.e.a.f.b(t), 0L, 0L);
        p = h2;
    }

    private com.facebook.e.a.b h()
    {
        return new com.facebook.e.a.b(m.a(c, 0L), m.a(d, 0L), m.a(e, 0L), m.a(f, 0L));
    }

    public void a()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        o.getDefaultDisplay().getMetrics(displaymetrics);
        float f1 = displaymetrics.heightPixels * displaymetrics.widthPixels;
        u = displaymetrics.density * f1 * 4F;
        try
        {
            m.c();
            r = h();
        }
        catch (InterruptedException interruptedexception)
        {
            com.facebook.debug.log.b.e(a, "mSharedPreferences.blockUntilInitialized() interrupted.", interruptedexception);
        }
        k.a(this);
    }

    void a(com.facebook.e.a.b b1)
    {
        this;
        JVM INSTR monitorenter ;
        m.b().a(c, b1.a()).a(d, b1.b()).a(e, b1.c()).a(f, b1.d()).a();
        this;
        JVM INSTR monitorexit ;
        return;
        b1;
        throw b1;
    }

    public void a(com.facebook.e.a.d d1)
    {
        g.put(d1, Integer.valueOf(1));
    }

    public boolean a(i i1)
    {
        long l2 = i1.a();
        long l1 = l2;
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            l1 = l2 - (long)(n.a() * (int)u);
        }
        return l1 < j.a();
    }

    public i b()
    {
        return new i(i);
    }

    void b(i i1)
    {
        q = i1;
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); ((com.facebook.e.a.d)iterator.next()).a(i1)) { }
        com.facebook.debug.log.b.b(a, i1.toString());
    }

    public com.facebook.e.a.b c()
    {
        f();
        return new com.facebook.e.a.b(r);
    }

    void c(i i1)
    {
        for (Iterator iterator = g.keySet().iterator(); iterator.hasNext(); ((com.facebook.e.a.d)iterator.next()).b(i1)) { }
    }

    void d()
    {
        i i1 = new i(i);
        if (i1.b != 0x7fffffffffffffffL)
        {
            boolean flag = a(i1);
            p.c("is_low_on_memory", Boolean.toString(flag));
            if (flag)
            {
                c(i1);
            }
            if (q == null || Math.abs(i1.a - q.a) > j.b())
            {
                b(i1);
            }
        }
    }

    void e()
    {
        f();
        if (s == null || r.e() - s.e() >= j.c())
        {
            g();
        }
    }

    void f()
    {
        this;
        JVM INSTR monitorenter ;
        f f2;
        f f1 = com.facebook.e.a.f.a();
        f2 = f1.a(t);
        t = f1;
        if (!l.b()) goto _L2; else goto _L1
_L1:
        r.a(f2.b());
        r.b(f2.c());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        r.c(f2.b());
        r.d(f2.c());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void g()
    {
        com.facebook.e.a.b b1 = new com.facebook.e.a.b(r);
        s = b1;
        a(b1);
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); ((a)iterator.next()).a(b1)) { }
        com.facebook.debug.log.b.b(a, b1.toString());
    }

    static 
    {
        b = (ae)aj.d.c("resource_manager/");
        c = (ae)b.c("data_wifi_received");
        d = (ae)b.c("data_wifi_sent");
        e = (ae)b.c("data_cell_received");
        f = (ae)b.c("data_cell_sent");
    }
}
