// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.engine.a.c;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.c.e;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a, b

public class f
    implements g
{

    private final g a;
    private final g b;

    public f(c c, g g1)
    {
        this(g1, ((g) (new e(g1, c))));
    }

    f(g g1, g g2)
    {
        a = g1;
        b = g2;
    }

    public j a(j j1, int i, int k)
    {
        j j2 = ((a)j1.b()).b();
        j j4 = ((a)j1.b()).c();
        Object obj;
        if (j2 != null && a != null)
        {
            j4 = a.a(j2, i, k);
            obj = j1;
            if (!j2.equals(j4))
            {
                obj = new b(new a(j4, ((a)j1.b()).c()));
            }
        } else
        {
            obj = j1;
            if (j4 != null)
            {
                obj = j1;
                if (b != null)
                {
                    j j3 = b.a(j4, i, k);
                    obj = j1;
                    if (!j4.equals(j3))
                    {
                        return new b(new a(((a)j1.b()).b(), j3));
                    }
                }
            }
        }
        return ((j) (obj));
    }

    public String a()
    {
        return a.a();
    }
}
