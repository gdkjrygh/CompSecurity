// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c;

import com.google.b.b.b;
import com.google.b.b.g;
import com.google.b.c;
import com.google.b.c.a.f;
import com.google.b.e;
import com.google.b.m;
import com.google.b.o;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.util.Map;

public final class a
    implements o
{

    private static final s a[] = new s[0];
    private final f b = new f();

    public a()
    {
    }

    private static int a(int ai[], b b1)
    {
        int j = b1.f();
        int i = ai[0];
        for (int k = ai[1]; i < j && b1.a(i, k); i++) { }
        if (i == j)
        {
            throw m.a();
        }
        i -= ai[0];
        if (i == 0)
        {
            throw m.a();
        } else
        {
            return i;
        }
    }

    private static b a(b b1)
    {
        int ai[] = b1.d();
        int ai1[] = b1.e();
        if (ai == null || ai1 == null)
        {
            throw m.a();
        }
        int l = a(ai, b1);
        int i1 = ai[1];
        int i = ai1[1];
        int j1 = ai[0];
        int k1 = ((ai1[0] - j1) + 1) / l;
        int l1 = ((i - i1) + 1) / l;
        if (k1 <= 0 || l1 <= 0)
        {
            throw m.a();
        }
        int i2 = l / 2;
        b b2 = new b(k1, l1);
        for (int j = 0; j < l1; j++)
        {
            for (int k = 0; k < k1; k++)
            {
                if (b1.a(k * l + (j1 + i2), i1 + i2 + j * l))
                {
                    b2.b(k, j);
                }
            }

        }

        return b2;
    }

    public q a(c c1, Map map)
    {
        java.util.List list;
        if (map != null && map.containsKey(e.b))
        {
            c1 = a(c1.c());
            c1 = b.a(c1);
            map = a;
        } else
        {
            map = (new com.google.b.c.b.a(c1.c())).a();
            c1 = b.a(map.d());
            map = map.e();
        }
        map = new q(c1.b(), c1.a(), map, com.google.b.a.f);
        list = c1.c();
        if (list != null)
        {
            map.a(r.c, list);
        }
        c1 = c1.d();
        if (c1 != null)
        {
            map.a(r.d, c1);
        }
        return map;
    }

    public void a()
    {
    }

}
