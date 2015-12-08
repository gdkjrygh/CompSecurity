// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.d;

import com.google.b.b.b;
import com.google.b.d.a.c;
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
    private final c b = new c();

    public a()
    {
    }

    private static b a(b b1)
    {
        int ai[] = b1.c();
        if (ai == null)
        {
            throw m.a();
        }
        int k = ai[0];
        int l = ai[1];
        int i1 = ai[2];
        int j1 = ai[3];
        b b2 = new b(30, 33);
        for (int i = 0; i < 33; i++)
        {
            int k1 = (i * j1 + j1 / 2) / 33;
            for (int j = 0; j < 30; j++)
            {
                if (b1.a((j * i1 + i1 / 2 + ((i & 1) * i1) / 2) / 30 + k, l + k1))
                {
                    b2.b(j, i);
                }
            }

        }

        return b2;
    }

    public q a(com.google.b.c c1, Map map)
    {
        if (map != null && map.containsKey(e.b))
        {
            c1 = a(c1.c());
            c1 = b.a(c1, map);
            map = a;
            map = new q(c1.b(), c1.a(), map, com.google.b.a.j);
            c1 = c1.d();
            if (c1 != null)
            {
                map.a(r.d, c1);
            }
            return map;
        } else
        {
            throw m.a();
        }
    }

    public void a()
    {
    }

}
