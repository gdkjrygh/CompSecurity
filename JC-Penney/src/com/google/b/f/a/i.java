// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import java.util.Formatter;

// Referenced classes of package com.google.b.f.a:
//            c, d

class i
{

    private final c a;
    private final d b[];

    i(c c1)
    {
        a = new c(c1);
        b = new d[(c1.d() - c1.c()) + 1];
    }

    final c a()
    {
        return a;
    }

    final d a(int j)
    {
        d d1 = c(j);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        return d1;
_L2:
        int k = 1;
_L7:
        if (k >= 5) goto _L4; else goto _L3
_L3:
        d d2;
        int l = b(j) - k;
        if (l < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        d2 = b[l];
        d1 = d2;
        if (d2 != null) goto _L1; else goto _L5
_L5:
        int i1 = b(j) + k;
        if (i1 >= b.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        d2 = b[i1];
        d1 = d2;
        if (d2 != null) goto _L1; else goto _L6
_L6:
        k++;
          goto _L7
_L4:
        return null;
    }

    final void a(int j, d d1)
    {
        b[b(j)] = d1;
    }

    final int b(int j)
    {
        return j - a.c();
    }

    final d[] b()
    {
        return b;
    }

    final d c(int j)
    {
        return b[b(j)];
    }

    public String toString()
    {
        Formatter formatter = new Formatter();
        d ad[] = b;
        int j1 = ad.length;
        int k = 0;
        int j = 0;
        while (k < j1) 
        {
            d d1 = ad[k];
            if (d1 == null)
            {
                int l = j + 1;
                formatter.format("%3d:    |   %n", new Object[] {
                    Integer.valueOf(j)
                });
                j = l;
            } else
            {
                int i1 = j + 1;
                formatter.format("%3d: %3d|%3d%n", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(d1.h()), Integer.valueOf(d1.g())
                });
                j = i1;
            }
            k++;
        }
        String s = formatter.toString();
        formatter.close();
        return s;
    }
}
