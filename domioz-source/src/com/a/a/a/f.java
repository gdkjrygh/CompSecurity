// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.content.Context;
import b.a.a.a.a.b.j;
import b.a.a.a.a.c.a.c;
import b.a.a.a.a.c.a.e;
import b.a.a.a.a.d.b;
import b.a.a.a.a.d.q;
import b.a.a.a.a.e.m;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.a.a.a:
//            l, a, b, j, 
//            h, g, i

final class f extends b
    implements l
{

    q a;
    private final m g;

    public f(Context context, ScheduledExecutorService scheduledexecutorservice, i k, m m)
    {
        super(context, scheduledexecutorservice, k);
        g = m;
    }

    public final q a()
    {
        return a;
    }

    public final void a(b.a.a.a.a.g.b b1, String s)
    {
        a a1 = com.a.a.a.a.b();
        String s1 = b1.a;
        m m = g;
        new j();
        a = new com.a.a.a.b(new com.a.a.a.j(a1, s, s1, m, j.a(b)), new h(new e(new g(new c()), new b.a.a.a.a.c.a.b(5))));
        ((i)d).a(b1);
        a(b1.b);
    }
}
