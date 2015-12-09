// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package a.a:
//            fq, ge, gs

final class ek extends fq
{

    private final fq c;

    ek(fq fq1)
    {
        super(ge.a(fq1.comparator()).a());
        c = fq1;
    }

    final fq a(Object obj, boolean flag)
    {
        return c.d(obj, flag).b();
    }

    final fq a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).b();
    }

    public final gs a()
    {
        return c.a_();
    }

    public final gs a_()
    {
        return c.a();
    }

    public final fq b()
    {
        return c;
    }

    final fq b(Object obj, boolean flag)
    {
        return c.c(obj, flag).b();
    }

    public final Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    final fq d()
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
        return c.a_();
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
