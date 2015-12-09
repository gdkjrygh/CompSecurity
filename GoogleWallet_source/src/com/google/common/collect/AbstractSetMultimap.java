// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMapBasedMultimap, SetMultimap, ImmutableSet

abstract class AbstractSetMultimap extends AbstractMapBasedMultimap
    implements SetMultimap
{

    protected AbstractSetMultimap(Map map)
    {
        super(map);
    }

    private static Set createUnmodifiableEmptyCollection()
    {
        return ImmutableSet.of();
    }

    public Map asMap()
    {
        return super.asMap();
    }

    volatile Collection createCollection()
    {
        return createCollection();
    }

    abstract Set createCollection();

    final volatile Collection createUnmodifiableEmptyCollection()
    {
        return createUnmodifiableEmptyCollection();
    }

    public final volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return (Set)super.entries();
    }

    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(Object obj)
    {
        return (Set)super.get(obj);
    }

    public boolean put(Object obj, Object obj1)
    {
        return super.put(obj, obj1);
    }

    public final volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        return (Set)super.removeAll(obj);
    }
}
