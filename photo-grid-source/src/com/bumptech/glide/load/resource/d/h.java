// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.c.f;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a, b

public final class h
    implements g
{

    private final g a;
    private final g b;

    public h(e e, g g1)
    {
        this(g1, ((g) (new f(g1, e))));
    }

    private h(g g1, g g2)
    {
        a = g1;
        b = g2;
    }

    public final x a(x x1, int i, int j)
    {
        x x2 = ((a)x1.b()).b();
        x x4 = ((a)x1.b()).c();
        Object obj;
        if (x2 != null && a != null)
        {
            x4 = a.a(x2, i, j);
            obj = x1;
            if (!x2.equals(x4))
            {
                obj = new b(new a(x4, ((a)x1.b()).c()));
            }
        } else
        {
            obj = x1;
            if (x4 != null)
            {
                obj = x1;
                if (b != null)
                {
                    x x3 = b.a(x4, i, j);
                    obj = x1;
                    if (!x4.equals(x3))
                    {
                        return new b(new a(((a)x1.b()).b(), x3));
                    }
                }
            }
        }
        return ((x) (obj));
    }

    public final String a()
    {
        return a.a();
    }
}
