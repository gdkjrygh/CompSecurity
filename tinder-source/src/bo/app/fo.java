// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package bo.app:
//            gu, hh, hv

final class fo extends gu
{

    private final gu c;

    fo(gu gu1)
    {
        super(hh.a(gu1.comparator()).a());
        c = gu1;
    }

    final gu a(Object obj, boolean flag)
    {
        return c.d(obj, flag).a_();
    }

    final gu a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).a_();
    }

    public final hv a()
    {
        return c.c();
    }

    public final gu a_()
    {
        return c;
    }

    final gu b(Object obj, boolean flag)
    {
        return c.c(obj, flag).a_();
    }

    public final hv c()
    {
        return c.a();
    }

    public final Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    final gu d()
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
