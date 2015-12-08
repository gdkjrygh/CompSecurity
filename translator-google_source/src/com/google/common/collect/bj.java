// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Comparator;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            bg, ImmutableSortedSet, ImmutableSet, ap, 
//            aq

public final class bj extends bg
{

    private final Comparator c;

    public bj(Comparator comparator)
    {
        c = (Comparator)p.a(comparator);
    }

    public final ImmutableSet a()
    {
        return b();
    }

    public final ap a(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final aq a(Iterator iterator)
    {
        super.b(iterator);
        return this;
    }

    public final aq a(Object aobj[])
    {
        super.b(aobj);
        return this;
    }

    public final ImmutableSortedSet b()
    {
        Object aobj[] = (Object[])a;
        ImmutableSortedSet immutablesortedset = ImmutableSortedSet.construct(c, b, aobj);
        b = immutablesortedset.size();
        return immutablesortedset;
    }

    public final aq b(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final bg b(Iterator iterator)
    {
        super.b(iterator);
        return this;
    }

    public final bg b(Object aobj[])
    {
        super.b(aobj);
        return this;
    }

    public final bg c(Object obj)
    {
        super.c(obj);
        return this;
    }

    public final bj c(Iterator iterator)
    {
        super.b(iterator);
        return this;
    }

    public final transient bj c(Object aobj[])
    {
        super.b(aobj);
        return this;
    }
}
