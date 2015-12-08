// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package bo.app:
//            ha, hn, ib

final class fu extends ha
{

    private final ha c;

    fu(ha ha1)
    {
        super(hn.a(ha1.comparator()).a());
        c = ha1;
    }

    final ha a(Object obj, boolean flag)
    {
        return c.d(obj, flag).a_();
    }

    final ha a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).a_();
    }

    public final ib a()
    {
        return c.c();
    }

    public final ha a_()
    {
        return c;
    }

    final ha b(Object obj, boolean flag)
    {
        return c.c(obj, flag).a_();
    }

    public final ib c()
    {
        return c.a();
    }

    public final Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    final ha d()
    {
        throw new AssertionError("should never be called");
    }

    public final Iterator descendingIterator()
    {
        return c.a();
    }

    public final volatile NavigableSet descendingSet()
    {
        return c;
    }

    final boolean e()
    {
        return c.e();
    }

    public final Object floor(Object obj)
    {
        return c.ceiling(obj);
    }

    public final Object higher(Object obj)
    {
        return c.lower(obj);
    }

    public final Iterator iterator()
    {
        return c.c();
    }

    public final Object lower(Object obj)
    {
        return c.higher(obj);
    }

    public final int size()
    {
        return c.size();
    }
}
