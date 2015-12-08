// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.c.a.c;
import b.a.a.a.a.c.a.e;
import b.a.a.a.a.d.b;
import b.a.a.a.a.d.k;
import b.a.a.a.a.e.g;
import b.a.a.a.d;
import b.a.a.a.l;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.a.a.a:
//            A, s, n, y, 
//            u, t, x, v, 
//            B, r, C

final class q extends b
    implements A
{

    final C a;
    r b;
    k c;
    h d;
    boolean e;
    boolean f;
    private final l l;
    private final g m;

    public q(l l1, Context context, ScheduledExecutorService scheduledexecutorservice, x x1, g g, C c1)
    {
        super(context, scheduledexecutorservice, x1);
        b = new s();
        d = new h();
        e = true;
        f = true;
        l = l1;
        m = g;
        a = c1;
    }

    public final k a()
    {
        return c;
    }

    public final void a(b.a.a.a.a.g.b b1, String s1)
    {
        c = new n(new y(l, s1, b1.a, m, h.a(g)), new u(new e(new t(new c()), new b.a.a.a.a.c.a.b(5))));
        ((x)h).a = b1;
        e = b1.f;
        b.a.a.a.d.a();
        StringBuilder stringbuilder = new StringBuilder("Custom event tracking ");
        if (e)
        {
            s1 = "enabled";
        } else
        {
            s1 = "disabled";
        }
        stringbuilder.append(s1);
        f = b1.g;
        b.a.a.a.d.a();
        stringbuilder = new StringBuilder("Predefined event tracking ");
        if (f)
        {
            s1 = "enabled";
        } else
        {
            s1 = "disabled";
        }
        stringbuilder.append(s1);
        if (b1.h > 1)
        {
            b.a.a.a.d.a();
            b = new v(b1.h);
        }
        super.k = b1.b;
        a(0L, super.k);
    }

    public final void a(B.a a1)
    {
        boolean flag = false;
        a1 = new B(a, a1.b, a1.a, a1.c, a1.d, a1.e, a1.f, a1.g, (byte)0);
        if (!e && com.a.a.a.B.b.k.equals(((B) (a1)).c))
        {
            b.a.a.a.d.a();
            (new StringBuilder("Custom events tracking disabled - skipping event: ")).append(a1);
        } else
        {
            if (!f && com.a.a.a.B.b.l.equals(((B) (a1)).c))
            {
                b.a.a.a.d.a();
                (new StringBuilder("Predefined events tracking disabled - skipping event: ")).append(a1);
                return;
            }
            if (b.a(a1))
            {
                b.a.a.a.d.a();
                (new StringBuilder("Skipping filtered event: ")).append(a1);
                return;
            }
            Context context = super.g;
            a1.toString();
            j.e(context);
            try
            {
                super.h.a(a1);
            }
            // Misplaced declaration of an exception variable
            catch (B.a a1)
            {
                j.f(super.g);
            }
            if (super.k != -1)
            {
                flag = true;
            }
            if (flag)
            {
                a(super.k, super.k);
                return;
            }
        }
    }
}
