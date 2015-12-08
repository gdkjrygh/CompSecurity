// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.as:
//            c

public class a
{

    protected final LinkedList a = new LinkedList();
    protected int b;
    public Object c;
    public int d;
    private final c e;
    private final int f;
    private final int g;
    private final int h;
    private int i;

    public a(int j, int k, c c1)
    {
        h = k;
        f = 1 << k;
        g = f - 1;
        e = c1;
        i = d(j);
        a();
    }

    private int d(int j)
    {
        int l = h;
        int k;
        if ((g & j) != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        return k + (j >> l);
    }

    public final Object a(int j)
    {
        if (j > i)
        {
            int k = i;
            throw new IndexOutOfBoundsException((new StringBuilder(59)).append("Index out of bound : ").append(j).append("(index) > ").append(k).append("(size)").toString());
        }
        for (; j >= a.size(); a.add(e.b())) { }
        return a.get(j);
    }

    public final void a()
    {
        b = 0;
        d = 0;
        c = a(0);
    }

    public final void a(Object obj, int j)
    {
        a();
        for (int k = 0; k < j;)
        {
            int l = f;
            if (f + k > j)
            {
                l = j - k;
            }
            System.arraycopy(obj, k, a(b), 0, l);
            k += l;
            if (l == f)
            {
                b = b + 1;
                d = 0;
            } else
            {
                d = l;
            }
        }

    }

    public final int b()
    {
        return a.size() << h;
    }

    public final void b(int j)
    {
        if (j >= f)
        {
            j = g & j;
            b = b + 1;
            if (b != i)
            {
                Object obj = c;
                c = a(b);
                if (j != 0)
                {
                    System.arraycopy(obj, f, c, 0, j);
                }
            }
            d = j;
            return;
        } else
        {
            d = j;
            return;
        }
    }

    public final void c()
    {
        c c1;
        Object obj;
        c1 = e;
        obj = a;
        LinkedList linkedlist = c1.b;
        linkedlist;
        JVM INSTR monitorenter ;
        Object obj1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c1.b.add(new SoftReference(obj1)))
        {
            obj1 = ((Iterator) (obj)).next();
            if (c1.b.size() == c1.a)
            {
                c1.b.removeFirst();
            }
        }

        break MISSING_BLOCK_LABEL_88;
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        linkedlist;
        JVM INSTR monitorexit ;
        a.clear();
        return;
    }

    public final void c(int j)
    {
        i = Math.max(d(j), i);
    }
}
