// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import c.g;
import c.o;
import com.c.a.A;
import com.c.a.C;
import com.c.a.a;
import com.c.a.i;
import com.c.a.q;
import com.c.a.t;
import com.c.a.w;
import com.c.a.x;
import java.io.IOException;
import java.net.URL;
import java.util.List;

// Referenced classes of package com.c.a.a.a:
//            h, u

public final class c
    implements com.c.a.ject
{

    final h a;
    private final int b;
    private final w c;
    private int d;

    public final A a(w w1)
        throws IOException
    {
        d = d + 1;
        if (b > 0)
        {
            q q1 = (q)a.b.i.get(b - 1);
            a a1 = com.c.a.a.a.h.a(a).b.a;
            if (!w1.a().getHost().equals(a1.b) || com.c.a.a.i.a(w1.a()) != a1.c)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must retain the same host and port").toString());
            }
            if (d > 1)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q1).append(" must call proceed() exactly once").toString());
            }
        }
        if (b < a.b.i.size())
        {
            w1 = new <init>(a, b + 1, w1);
            q q2 = (q)a.b.i.get(b);
            A a2 = q2.a();
            if (((b) (w1)).d != 1)
            {
                throw new IllegalStateException((new StringBuilder("network interceptor ")).append(q2).append(" must call proceed() exactly once").toString());
            } else
            {
                return a2;
            }
        }
        h.b(a).a(w1);
        if (a.c() && w1.d != null)
        {
            g g1 = o.a(h.b(a).a(w1, w1.d.contentLength()));
            w1.d.writeTo(g1);
            g1.close();
        }
        return h.c(a);
    }

    public ion(h h1, int j, w w1)
    {
        a = h1;
        super();
        b = j;
        c = w1;
    }
}
