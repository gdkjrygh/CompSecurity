// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;

import com.google.b.b.b;

// Referenced classes of package com.google.b.g.a:
//            e, f, g, h, 
//            i, j, k, l, 
//            d

abstract class c
{

    private static final c a[] = {
        new e(null), new f(null), new g(null), new h(null), new i(null), new j(null), new k(null), new l(null)
    };

    private c()
    {
    }

    c(d d)
    {
        this();
    }

    static c a(int i1)
    {
        if (i1 < 0 || i1 > 7)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a[i1];
        }
    }

    final void a(b b1, int i1)
    {
        for (int j1 = 0; j1 < i1; j1++)
        {
            for (int k1 = 0; k1 < i1; k1++)
            {
                if (a(j1, k1))
                {
                    b1.c(k1, j1);
                }
            }

        }

    }

    abstract boolean a(int i1, int j1);

}
