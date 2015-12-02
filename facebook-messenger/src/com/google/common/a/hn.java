// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            gw, hm

class hn
    implements ListIterator
{

    int a;
    hm b;
    hm c;
    hm d;
    final gw e;

    hn(gw gw1)
    {
        e = gw1;
        super();
        b = gw.a(gw1);
    }

    hn(gw gw1, int i)
    {
        e = gw1;
        super();
        int j = gw1.d();
        Preconditions.checkPositionIndex(i, j);
        if (i >= j / 2)
        {
            d = gw.b(gw1);
            a = j;
            for (; i < j; i++)
            {
                b();
            }

        } else
        {
            b = gw.a(gw1);
            for (; i > 0; i--)
            {
                a();
            }

        }
        c = null;
    }

    public hm a()
    {
        gw.e(b);
        hm hm1 = b;
        c = hm1;
        d = hm1;
        b = b.c;
        a = a + 1;
        return c;
    }

    public void a(hm hm1)
    {
        throw new UnsupportedOperationException();
    }

    public void add(Object obj)
    {
        b((hm)obj);
    }

    public hm b()
    {
        gw.e(d);
        hm hm1 = d;
        c = hm1;
        b = hm1;
        d = d.d;
        a = a - 1;
        return c;
    }

    public void b(hm hm1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext()
    {
        return b != null;
    }

    public boolean hasPrevious()
    {
        return d != null;
    }

    public Object next()
    {
        return a();
    }

    public int nextIndex()
    {
        return a;
    }

    public Object previous()
    {
        return b();
    }

    public int previousIndex()
    {
        return a - 1;
    }

    public void remove()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (c != b)
        {
            d = c.d;
            a = a - 1;
        } else
        {
            b = c.c;
        }
        gw.a(e, c);
        c = null;
    }

    public void set(Object obj)
    {
        a((hm)obj);
    }
}
