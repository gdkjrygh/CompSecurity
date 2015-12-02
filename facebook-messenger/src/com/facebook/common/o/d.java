// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.o;

import com.facebook.common.time.a;

// Referenced classes of package com.facebook.common.o:
//            c, a, e, b

public class d
{

    private Class a;
    private int b;
    private int c;
    private int d;
    private long e;
    private b f;
    private a g;
    private final e h;

    d(e e1, Class class1, a a1)
    {
        b = 16;
        c = 1024;
        d = 16;
        e = 60000L;
        h = e1;
        a = class1;
        g = a1;
    }

    public d(Class class1, a a1)
    {
        this(null, class1, a1);
    }

    public com.facebook.common.o.a a()
    {
        if (g == null)
        {
            throw new IllegalArgumentException("Must add a clock to the object pool builder");
        }
        b b1 = f;
        Object obj = b1;
        if (b1 == null)
        {
            obj = new c(a);
        }
        obj = new com.facebook.common.o.a(a, b, c, d, e, ((b) (obj)), g);
        if (h != null)
        {
            h.a(a, ((com.facebook.common.o.a) (obj)));
        }
        return ((com.facebook.common.o.a) (obj));
    }

    public d a(b b1)
    {
        f = b1;
        return this;
    }
}
