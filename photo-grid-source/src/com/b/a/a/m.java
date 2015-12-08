// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.j;
import a.a.a.a.a.c.a.c;
import a.a.a.a.a.c.a.e;
import a.a.a.a.a.d.b;
import a.a.a.a.a.d.l;
import a.a.a.a.f;
import a.a.a.a.p;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.b.a.a:
//            w, o, k, u, 
//            q, p, t, r, 
//            x, y, z, n, 
//            aa

final class m extends b
    implements w
{

    final aa a;
    n b;
    l c;
    j d;
    boolean e;
    boolean f;
    private final p l;
    private final a.a.a.a.a.e.m m;

    public m(p p1, Context context, ScheduledExecutorService scheduledexecutorservice, t t1, a.a.a.a.a.e.m m1, aa aa)
    {
        super(context, scheduledexecutorservice, t1);
        b = new o();
        d = new j();
        e = true;
        f = true;
        l = p1;
        m = m1;
        a = aa;
    }

    public final l a()
    {
        return c;
    }

    public final void a(a.a.a.a.a.g.b b1, String s)
    {
        c = new k(new u(l, s, b1.a, m, j.a(g)), new q(new e(new com.b.a.a.p(new c()), new a.a.a.a.a.c.a.b(5))));
        ((t)h).a(b1);
        e = b1.f;
        a.a.a.a.f.d();
        StringBuilder stringbuilder = new StringBuilder("Custom event tracking ");
        if (e)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        stringbuilder.append(s);
        f = b1.g;
        a.a.a.a.f.d();
        stringbuilder = new StringBuilder("Predefined event tracking ");
        if (f)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        stringbuilder.append(s);
        if (b1.h > 1)
        {
            a.a.a.a.f.d();
            b = new r(b1.h);
        }
        a(b1.b);
    }

    public final void a(y y1)
    {
        y1 = new x(a, y1.b, y1.a, y1.c, y1.d, y1.e, y1.f, y1.g, (byte)0);
        if (!e && z.k.equals(((x) (y1)).c))
        {
            a.a.a.a.f.d();
            (new StringBuilder("Custom events tracking disabled - skipping event: ")).append(y1);
            return;
        }
        if (!f && com.b.a.a.z.l.equals(((x) (y1)).c))
        {
            a.a.a.a.f.d();
            (new StringBuilder("Predefined events tracking disabled - skipping event: ")).append(y1);
            return;
        }
        if (b.a(y1))
        {
            a.a.a.a.f.d();
            (new StringBuilder("Skipping filtered event: ")).append(y1);
            return;
        } else
        {
            a(y1);
            return;
        }
    }
}
