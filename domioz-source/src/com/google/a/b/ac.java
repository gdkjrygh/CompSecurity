// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;
import java.util.NavigableSet;

// Referenced classes of package com.google.a.b:
//            bg, cn, di

final class ac extends bg
{

    private final bg c;

    ac(bg bg1)
    {
        super(cn.a(bg1.comparator()).a());
        c = bg1;
    }

    final bg a(Object obj, boolean flag)
    {
        return c.d(obj, flag).h_();
    }

    final bg a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return c.b(obj1, flag1, obj, flag).h_();
    }

    public final di a()
    {
        return c.c();
    }

    final bg b(Object obj, boolean flag)
    {
        return c.c(obj, flag).h_();
    }

    public final di c()
    {
        return c.a();
    }

    public final Object ceiling(Object obj)
    {
        return c.floor(obj);
    }

    final bg d()
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

    public final bg h_()
    {
        return c;
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
