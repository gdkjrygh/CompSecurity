// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ListIterator;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            gw, hm, jf

class ho
    implements ListIterator
{

    final Object a;
    int b;
    hm c;
    hm d;
    hm e;
    final gw f;

    ho(gw gw1, Object obj)
    {
        f = gw1;
        super();
        a = obj;
        c = (hm)gw.c(gw1).get(obj);
    }

    public ho(gw gw1, Object obj, int i)
    {
        f = gw1;
        super();
        int j = gw.d(gw1).a(obj);
        Preconditions.checkPositionIndex(i, j);
        if (i >= j / 2)
        {
            e = (hm)gw.e(gw1).get(obj);
            b = j;
            for (; i < j; i++)
            {
                previous();
            }

        } else
        {
            c = (hm)gw.c(gw1).get(obj);
            for (; i > 0; i--)
            {
                next();
            }

        }
        a = obj;
        d = null;
    }

    public void add(Object obj)
    {
        e = gw.a(f, a, obj, c);
        b = b + 1;
        d = null;
    }

    public boolean hasNext()
    {
        return c != null;
    }

    public boolean hasPrevious()
    {
        return e != null;
    }

    public Object next()
    {
        gw.e(c);
        hm hm1 = c;
        d = hm1;
        e = hm1;
        c = c.e;
        b = b + 1;
        return d.b;
    }

    public int nextIndex()
    {
        return b;
    }

    public Object previous()
    {
        gw.e(e);
        hm hm1 = e;
        d = hm1;
        c = hm1;
        e = e.f;
        b = b - 1;
        return d.b;
    }

    public int previousIndex()
    {
        return b - 1;
    }

    public void remove()
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (d != c)
        {
            e = d.f;
            b = b - 1;
        } else
        {
            c = d.e;
        }
        gw.a(f, d);
        d = null;
    }

    public void set(Object obj)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        d.b = obj;
    }
}
