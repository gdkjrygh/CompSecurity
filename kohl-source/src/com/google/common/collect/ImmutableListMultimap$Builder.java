// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            ImmutableListMultimap, ImmutableMultimap, Multimap

public static final class  extends 
{

    public ImmutableListMultimap build()
    {
        return (ImmutableListMultimap)super.d();
    }

    public volatile ImmutableMultimap build()
    {
        return build();
    }

    public build orderKeysBy(Comparator comparator)
    {
        super.rKeysBy(comparator);
        return this;
    }

    public volatile rKeysBy orderKeysBy(Comparator comparator)
    {
        return orderKeysBy(comparator);
    }

    public orderKeysBy orderValuesBy(Comparator comparator)
    {
        super.rValuesBy(comparator);
        return this;
    }

    public volatile rValuesBy orderValuesBy(Comparator comparator)
    {
        return orderValuesBy(comparator);
    }

    public orderValuesBy put(Object obj, Object obj1)
    {
        super.orderValuesBy(obj, obj1);
        return this;
    }

    public volatile orderValuesBy put(Object obj, Object obj1)
    {
        return put(obj, obj1);
    }

    public put putAll(Multimap multimap)
    {
        super.ll(multimap);
        return this;
    }

    public ll putAll(Object obj, Iterable iterable)
    {
        super.ll(obj, iterable);
        return this;
    }

    public transient ll putAll(Object obj, Object aobj[])
    {
        super.ll(obj, aobj);
        return this;
    }

    public volatile ll putAll(Multimap multimap)
    {
        return putAll(multimap);
    }

    public volatile putAll putAll(Object obj, Iterable iterable)
    {
        return putAll(obj, iterable);
    }

    public volatile putAll putAll(Object obj, Object aobj[])
    {
        return putAll(obj, aobj);
    }

    public ()
    {
    }
}
