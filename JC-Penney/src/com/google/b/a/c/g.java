// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.c;

import com.google.b.b.a;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.b.a.c:
//            h, d

final class g
{

    static final g a;
    private final int b;
    private final h c;
    private final int d;
    private final int e;

    private g(h h1, int i, int j, int k)
    {
        c = h1;
        b = i;
        d = j;
        e = k;
    }

    int a()
    {
        return b;
    }

    g a(int i)
    {
        Object obj = c;
        int l = b;
        int k = e;
        if (b == 4 || b == 2)
        {
            int j = d.b[l][0];
            obj = ((h) (obj)).a(0xffff & j, j >> 16);
            k += j >> 16;
            l = 0;
        }
        byte byte0;
        if (d == 0 || d == 31)
        {
            byte0 = 18;
        } else
        if (d == 62)
        {
            byte0 = 9;
        } else
        {
            byte0 = 8;
        }
        obj = new g(((h) (obj)), l, d + 1, k + byte0);
        if (((g) (obj)).d == 2078)
        {
            return ((g) (obj)).b(i + 1);
        } else
        {
            return ((g) (obj));
        }
    }

    g a(int i, int j)
    {
        int k = e;
        h h1 = c;
        if (i != b)
        {
            int l = d.b[b][i];
            h1 = h1.a(0xffff & l, l >> 16);
            k += l >> 16;
        }
        byte byte0;
        if (i == 2)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        return new g(h1.a(j, byte0), i, 0, byte0 + k);
    }

    a a(byte abyte0[])
    {
        Object obj = new LinkedList();
        for (h h1 = b(abyte0.length).c; h1 != null; h1 = h1.a())
        {
            ((Deque) (obj)).addFirst(h1);
        }

        a a1 = new a();
        for (obj = ((Deque) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((h)((Iterator) (obj)).next()).a(a1, abyte0)) { }
        return a1;
    }

    boolean a(g g1)
    {
        int i;
label0:
        {
            int j = e + (d.b[b][g1.b] >> 16);
            i = j;
            if (g1.d <= 0)
            {
                break label0;
            }
            if (d != 0)
            {
                i = j;
                if (d <= g1.d)
                {
                    break label0;
                }
            }
            i = j + 10;
        }
        return i <= g1.e;
    }

    int b()
    {
        return d;
    }

    g b(int i)
    {
        if (d == 0)
        {
            return this;
        } else
        {
            return new g(c.b(i - d, d), b, 0, e);
        }
    }

    g b(int i, int j)
    {
        h h1 = c;
        byte byte0;
        if (b == 2)
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
        return new g(h1.a(d.c[b][i], byte0).a(j, 5), b, 0, byte0 + e + 5);
    }

    int c()
    {
        return e;
    }

    public String toString()
    {
        return String.format("%s bits=%d bytes=%d", new Object[] {
            com.google.b.a.c.d.a[b], Integer.valueOf(e), Integer.valueOf(d)
        });
    }

    static 
    {
        a = new g(com.google.b.a.c.h.a, 0, 0, 0);
    }
}
