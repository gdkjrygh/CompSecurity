// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a;

import com.google.b.a.c.a;
import com.google.b.b.b;
import com.google.b.g;
import com.google.b.u;
import java.nio.charset.Charset;
import java.util.Map;

public final class c
    implements u
{

    private static final Charset a = Charset.forName("ISO-8859-1");

    public c()
    {
    }

    private static b a(a a1, int i, int j)
    {
        a1 = a1.a();
        if (a1 == null)
        {
            throw new IllegalStateException();
        }
        int k1 = a1.f();
        int l1 = a1.g();
        i = Math.max(i, k1);
        int k = Math.max(j, l1);
        int i2 = Math.min(i / k1, k / l1);
        int j1 = (i - k1 * i2) / 2;
        j = (k - l1 * i2) / 2;
        b b1 = new b(i, k);
        for (i = 0; i < l1; i++)
        {
            int l = j1;
            for (int i1 = 0; i1 < k1;)
            {
                if (a1.a(i1, i))
                {
                    b1.a(l, j, i2, i2);
                }
                i1++;
                l += i2;
            }

            j += i2;
        }

        return b1;
    }

    private static b a(String s, com.google.b.a a1, int i, int j, Charset charset, int k, int l)
    {
        if (a1 != com.google.b.a.a)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode AZTEC, but got ").append(a1).toString());
        } else
        {
            return a(com.google.b.a.c.c.a(s.getBytes(charset), k, l), i, j);
        }
    }

    public b a(String s, com.google.b.a a1, int i, int j, Map map)
    {
        Number number;
        Object obj;
        int k;
        int l;
        if (map == null)
        {
            obj = null;
        } else
        {
            obj = (String)map.get(g.b);
        }
        if (map == null)
        {
            number = null;
        } else
        {
            number = (Number)map.get(g.a);
        }
        if (map == null)
        {
            map = null;
        } else
        {
            map = (Number)map.get(g.j);
        }
        if (obj == null)
        {
            obj = a;
        } else
        {
            obj = Charset.forName(((String) (obj)));
        }
        if (number == null)
        {
            k = 33;
        } else
        {
            k = number.intValue();
        }
        if (map == null)
        {
            l = 0;
        } else
        {
            l = map.intValue();
        }
        return a(s, a1, i, j, ((Charset) (obj)), k, l);
    }

}
