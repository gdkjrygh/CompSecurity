// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.android.slyce.a.c.d:
//            c, e, d

public final class f
    implements c
{

    long a[];
    private int b;

    public f()
    {
        a = new long[1];
    }

    private f(e e1)
    {
        a = (new long[] {
            e1.a, 0L
        });
    }

    f(e e1, d d1)
    {
        this(e1);
    }

    private void e(int i)
    {
        long al[] = new long[i];
        if (a != null)
        {
            System.arraycopy(a, 0, al, 0, a.length);
        }
        a = al;
    }

    private int f(int i)
    {
        i = (b + i) / 64;
        if (i > a.length - 1)
        {
            e(i + 1);
        }
        return i;
    }

    private int g(int i)
    {
        return (b + i) % 64;
    }

    private static int h(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException(String.format("input must be a positive number: %s", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            return i;
        }
    }

    public void a()
    {
        Arrays.fill(a, 0L);
    }

    public void a(int i)
    {
        h(i);
        int j = f(i);
        long al[] = a;
        al[j] = al[j] | 1L << g(i);
    }

    List b()
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        int j = a.length;
        for (int k = b; i < j * 64 - k; i++)
        {
            if (c(i))
            {
                arraylist.add(Integer.valueOf(i));
            }
        }

        return arraylist;
    }

    public void b(int i)
    {
        h(i);
        int j = f(i);
        long al[] = a;
        al[j] = al[j] ^ 1L << g(i);
    }

    public boolean c(int i)
    {
        h(i);
        int j = f(i);
        return (a[j] & 1L << g(i)) != 0L;
    }

    public void d(int i)
    {
        b = b - h(i);
        if (b < 0)
        {
            i = b / -64 + 1;
            long al[] = new long[a.length + i];
            System.arraycopy(a, 0, al, i, a.length);
            a = al;
            b = b % 64 + 64;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("{");
        List list = b();
        int i = 0;
        for (int j = list.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(list.get(i));
        }

        return stringbuilder.append('}').toString();
    }
}
