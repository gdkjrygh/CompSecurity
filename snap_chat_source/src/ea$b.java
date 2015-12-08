// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

static final class b extends ea
{

    private final transient ea b;

    private int b(int i)
    {
        return size() - 1 - i;
    }

    public final ea a(int i, int j)
    {
        dv.a(i, j, size());
        return b.a(size() - j, size() - i).g();
    }

    public final boolean contains(Object obj)
    {
        return b.contains(obj);
    }

    final boolean e()
    {
        return b.e();
    }

    public final ea g()
    {
        return b;
    }

    public final Object get(int i)
    {
        dv.a(i, size());
        return b.get(b(i));
    }

    public final int indexOf(Object obj)
    {
        int i = b.lastIndexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public final Iterator iterator()
    {
        return super.a();
    }

    public final int lastIndexOf(Object obj)
    {
        int i = b.indexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public final ListIterator listIterator()
    {
        return a(0);
    }

    public final ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public final int size()
    {
        return b.size();
    }

    public final List subList(int i, int j)
    {
        return a(i, j);
    }

    >(ea ea1)
    {
        b = ea1;
    }
}
