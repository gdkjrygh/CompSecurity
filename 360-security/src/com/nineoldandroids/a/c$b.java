// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.nineoldandroids.a:
//            c, o, a

public class b
{

    final c a;
    private a b;

    public b a(long l)
    {
        o o1 = o.b(new float[] {
            0.0F, 1.0F
        });
        o1.d(l);
        b(o1);
        return this;
    }

    public b a(a a1)
    {
        b b2 = (b)c.b(a).get(a1);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = new <init>(a1);
            c.b(a).put(a1, b1);
            c.d(a).add(b1);
        }
        b1.a(new <init>(b, 0));
        return this;
    }

    public b b(a a1)
    {
        b b2 = (b)c.b(a).get(a1);
        b b1 = b2;
        if (b2 == null)
        {
            b1 = new <init>(a1);
            c.b(a).put(a1, b1);
            c.d(a).add(b1);
        }
        a1 = new <init>(b1, 1);
        b.a(a1);
        return this;
    }

    (c c1, a a1)
    {
        a = c1;
        super();
        b = (b)c.b(c1).get(a1);
        if (b == null)
        {
            b = new <init>(a1);
            c.b(c1).put(a1, b);
            c.d(c1).add(b);
        }
    }
}
