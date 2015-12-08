// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g;

import com.google.b.b.b;
import com.google.b.b.g;
import com.google.b.c;
import com.google.b.e;
import com.google.b.g.a.n;
import com.google.b.g.a.r;
import com.google.b.m;
import com.google.b.o;
import com.google.b.q;
import com.google.b.s;
import java.util.Map;

public class a
    implements o
{

    private static final s a[] = new s[0];
    private final n b = new n();

    public a()
    {
    }

    private static float a(int ai[], b b1)
    {
        int l = b1.g();
        int i1 = b1.f();
        int j = ai[0];
        int i = ai[1];
        boolean flag = true;
        int k = 0;
        do
        {
label0:
            {
label1:
                {
                    if (j < i1 && i < l)
                    {
                        if (flag == b1.a(j, i))
                        {
                            break label0;
                        }
                        k++;
                        if (k != 5)
                        {
                            break label1;
                        }
                    }
                    if (j == i1 || i == l)
                    {
                        throw m.a();
                    } else
                    {
                        return (float)(j - ai[0]) / 7F;
                    }
                }
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            j++;
            i++;
        } while (true);
    }

    private static b a(b b1)
    {
        int ai[] = b1.d();
        int ai1[] = b1.e();
        if (ai == null || ai1 == null)
        {
            throw m.a();
        }
        float f = a(ai, b1);
        int j2 = ai[1];
        int l = ai1[1];
        int k = ai[0];
        int j = ai1[0];
        if (k >= j || j2 >= l)
        {
            throw m.a();
        }
        int i = j;
        if (l - j2 != j - k)
        {
            i = (l - j2) + k;
        }
        int j1 = Math.round((float)((i - k) + 1) / f);
        int k1 = Math.round((float)((l - j2) + 1) / f);
        if (j1 <= 0 || k1 <= 0)
        {
            throw m.a();
        }
        if (k1 != j1)
        {
            throw m.a();
        }
        int l1 = (int)(f / 2.0F);
        j = j2 + l1;
        k += l1;
        i = ((int)((float)(j1 - 1) * f) + k) - i;
        b b2;
        if (i > 0)
        {
            if (i > l1)
            {
                throw m.a();
            }
            i = k - i;
        } else
        {
            i = k;
        }
        k = ((int)((float)(k1 - 1) * f) + j) - l;
        if (k > 0)
        {
            if (k > l1)
            {
                throw m.a();
            }
            j -= k;
        }
        b2 = new b(j1, k1);
        for (k = 0; k < k1; k++)
        {
            int i2 = (int)((float)k * f);
            for (int i1 = 0; i1 < j1; i1++)
            {
                if (b1.a((int)((float)i1 * f) + i, j + i2))
                {
                    b2.b(i1, k);
                }
            }

        }

        return b2;
    }

    public final q a(c c1, Map map)
    {
        Object obj;
        if (map != null && map.containsKey(e.b))
        {
            c1 = a(c1.c());
            c1 = b.a(c1, map);
            map = a;
        } else
        {
            g g1 = (new com.google.b.g.b.c(c1.c())).a(map);
            c1 = b.a(g1.d(), map);
            map = g1.e();
        }
        if (c1.e() instanceof r)
        {
            ((r)c1.e()).a(map);
        }
        map = new q(c1.b(), c1.a(), map, com.google.b.a.l);
        obj = c1.c();
        if (obj != null)
        {
            map.a(com.google.b.r.c, obj);
        }
        obj = c1.d();
        if (obj != null)
        {
            map.a(com.google.b.r.d, obj);
        }
        if (c1.f())
        {
            map.a(com.google.b.r.j, Integer.valueOf(c1.h()));
            map.a(com.google.b.r.k, Integer.valueOf(c1.g()));
        }
        return map;
    }

    public void a()
    {
    }

}
