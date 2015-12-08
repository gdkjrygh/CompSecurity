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
import b.a.a.a.a.d.p;
import b.a.a.a.a.e.g;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.a.a.a:
//            p, h, a, b, 
//            n, j, i, m, 
//            k, q, g

final class f extends b
    implements com.a.a.a.p
{

    p a;
    com.a.a.a.g b;
    private final g h;

    public f(Context context, ScheduledExecutorService scheduledexecutorservice, m m1, g g1)
    {
        super(context, scheduledexecutorservice, m1);
        b = new com.a.a.a.h();
        h = g1;
    }

    public final p a()
    {
        return a;
    }

    public final void a(b.a.a.a.a.g.b b1, String s)
    {
        a a1 = com.a.a.a.a.c();
        String s1 = b1.a;
        g g1 = h;
        new h();
        a = new com.a.a.a.b(new n(a1, s, s1, g1, b.a.a.a.a.b.h.a(c)), new com.a.a.a.j(new e(new i(new c()), new b.a.a.a.a.c.a.b(5))));
        ((m)d).a(b1);
        a(b1.b);
        if (b1.g > 1)
        {
            b = new k(b1.g);
        }
    }

    public final void a(Object obj)
    {
        obj = (q)obj;
        if (b.a(((q) (obj))))
        {
            Context context = com.a.a.a.a.c().v();
            (new StringBuilder("skipping filtered event ")).append(obj);
            j.e(context);
            return;
        } else
        {
            super.a(obj);
            return;
        }
    }
}
