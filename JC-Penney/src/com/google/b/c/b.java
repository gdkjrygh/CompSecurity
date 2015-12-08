// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c;

import com.google.b.a;
import com.google.b.c.c.e;
import com.google.b.c.c.i;
import com.google.b.c.c.j;
import com.google.b.c.c.k;
import com.google.b.c.c.l;
import com.google.b.f;
import com.google.b.g;
import com.google.b.u;
import java.util.Map;

public final class b
    implements u
{

    public b()
    {
    }

    private static com.google.b.b.b a(e e1, k k1)
    {
        int l2 = k1.d();
        int i3 = k1.e();
        com.google.b.g.c.b b1 = new com.google.b.g.c.b(k1.f(), k1.g());
        int j1 = 0;
        int i1 = 0;
        while (j1 < i3) 
        {
            int l1;
            int j2;
            if (j1 % k1.c == 0)
            {
                l1 = 0;
                int i2 = 0;
                while (l1 < k1.f()) 
                {
                    boolean flag;
                    if (l1 % 2 == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    b1.a(i2, i1, flag);
                    i2++;
                    l1++;
                }
                l1 = i1 + 1;
            } else
            {
                l1 = i1;
            }
            j2 = 0;
            i1 = 0;
            while (j2 < l2) 
            {
                int k2 = i1;
                if (j2 % k1.b == 0)
                {
                    b1.a(i1, l1, true);
                    k2 = i1 + 1;
                }
                b1.a(k2, l1, e1.a(j2, j1));
                i1 = k2 + 1;
                if (j2 % k1.b == k1.b - 1)
                {
                    boolean flag1;
                    if (j1 % 2 == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    b1.a(i1, l1, flag1);
                    i1++;
                }
                j2++;
            }
            j2 = l1 + 1;
            if (j1 % k1.c == k1.c - 1)
            {
                i1 = 0;
                l1 = 0;
                for (; i1 < k1.f(); i1++)
                {
                    b1.a(l1, j2, true);
                    l1++;
                }

                i1 = j2 + 1;
            } else
            {
                i1 = j2;
            }
            j1++;
        }
        return a(b1);
    }

    private static com.google.b.b.b a(com.google.b.g.c.b b1)
    {
        int k1 = b1.b();
        int l1 = b1.a();
        com.google.b.b.b b2 = new com.google.b.b.b(k1, l1);
        b2.a();
        for (int i1 = 0; i1 < k1; i1++)
        {
            for (int j1 = 0; j1 < l1; j1++)
            {
                if (b1.a(i1, j1) == 1)
                {
                    b2.b(i1, j1);
                }
            }

        }

        return b2;
    }

    public com.google.b.b.b a(String s, a a1, int i1, int j1, Map map)
    {
        Object obj;
        Object obj1;
        a a2;
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (a1 != a.f)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode DATA_MATRIX, but got ").append(a1).toString());
        }
        if (i1 < 0 || j1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested dimensions are too small: ").append(i1).append('x').append(j1).toString());
        }
        a1 = l.a;
        obj = new f(i1, j1);
        a2 = a1;
        obj1 = obj;
        if (map == null) goto _L2; else goto _L1
_L1:
        obj1 = (l)map.get(g.c);
        if (obj1 != null)
        {
            a1 = ((a) (obj1));
        }
        obj1 = (f)map.get(g.d);
        if (obj1 != null)
        {
            obj = obj1;
        }
        map = (f)map.get(g.e);
        a2 = a1;
        obj1 = obj;
        if (map == null) goto _L2; else goto _L3
_L3:
        a2 = a1;
        a1 = map;
_L5:
        s = j.a(s, a2, ((f) (obj)), a1);
        a1 = k.a(s.length(), a2, ((f) (obj)), a1, true);
        s = new e(i.a(s, a1), a1.d(), a1.e());
        s.a();
        return a(((e) (s)), ((k) (a1)));
_L2:
        a1 = null;
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
