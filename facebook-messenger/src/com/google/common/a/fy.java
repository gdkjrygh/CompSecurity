// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            ga, kv, jq, dr, 
//            kw, es, kh, fz, 
//            mh

public abstract class fy extends ga
    implements kv, SortedSet
{

    private static final Comparator b;
    private static final fy d;
    final transient Comparator a;

    fy(Comparator comparator1)
    {
        a = comparator1;
    }

    static int a(Comparator comparator1, Object obj, Object obj1)
    {
        return comparator1.compare(obj, obj1);
    }

    static fy a(Comparator comparator1)
    {
        if (b.equals(comparator1))
        {
            return g();
        } else
        {
            return new dr(comparator1);
        }
    }

    static fy a(Comparator comparator1, Iterator iterator1)
    {
        return b(comparator1, iterator1);
    }

    private static fy b(Comparator comparator1, Iterator iterator1)
    {
        iterator1 = es.a(kw.a(comparator1, iterator1));
        if (iterator1.isEmpty())
        {
            return a(comparator1);
        } else
        {
            return new kh(iterator1, comparator1);
        }
    }

    public static fz f()
    {
        return new fz(jq.b());
    }

    private static fy g()
    {
        return d;
    }

    abstract int a(Object obj);

    abstract fy a(Object obj, boolean flag);

    abstract fy a(Object obj, boolean flag, Object obj1, boolean flag1);

    int b(Object obj, Object obj1)
    {
        return a(a, obj, obj1);
    }

    abstract fy b(Object obj, boolean flag);

    fy b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkArgument(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public fy c(Object obj)
    {
        return c(obj, false);
    }

    public fy c(Object obj, Object obj1)
    {
        return b(obj, true, obj1, false);
    }

    fy c(Object obj, boolean flag)
    {
        return a(Preconditions.checkNotNull(obj), flag);
    }

    public Comparator comparator()
    {
        return a;
    }

    public fy d(Object obj)
    {
        return d(obj, true);
    }

    fy d(Object obj, boolean flag)
    {
        return b(Preconditions.checkNotNull(obj), flag);
    }

    public abstract mh h_();

    public SortedSet headSet(Object obj)
    {
        return c(obj);
    }

    public Iterator iterator()
    {
        return h_();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return c(obj, obj1);
    }

    public SortedSet tailSet(Object obj)
    {
        return d(obj);
    }

    static 
    {
        b = jq.b();
        d = new dr(b);
    }
}
