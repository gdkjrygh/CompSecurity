// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ko extends AbstractSet
    implements Serializable, Set
{

    private final Map a;
    private transient Set b;

    ko(Map map)
    {
        Preconditions.checkArgument(map.isEmpty(), "Map is non-empty");
        a = map;
        b = map.keySet();
    }

    public boolean add(Object obj)
    {
        return a.put(obj, Boolean.TRUE) == null;
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return b.containsAll(collection);
    }

    public boolean equals(Object obj)
    {
        return this == obj || b.equals(obj);
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return b.iterator();
    }

    public boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    public boolean removeAll(Collection collection)
    {
        return b.removeAll(collection);
    }

    public boolean retainAll(Collection collection)
    {
        return b.retainAll(collection);
    }

    public int size()
    {
        return a.size();
    }

    public Object[] toArray()
    {
        return b.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return b.toArray(aobj);
    }

    public String toString()
    {
        return b.toString();
    }
}
