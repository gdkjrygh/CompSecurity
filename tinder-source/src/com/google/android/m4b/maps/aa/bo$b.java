// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bo

static final class b extends AbstractSet
    implements Serializable, Set
{

    private static final long serialVersionUID = 0L;
    private final Map a;
    private transient Set b;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        b = a.keySet();
    }

    public final boolean add(Object obj)
    {
        return a.put(obj, Boolean.TRUE) == null;
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return b.containsAll(collection);
    }

    public final boolean equals(Object obj)
    {
        return this == obj || b.equals(obj);
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return b.iterator();
    }

    public final boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    public final boolean removeAll(Collection collection)
    {
        return b.removeAll(collection);
    }

    public final boolean retainAll(Collection collection)
    {
        return b.retainAll(collection);
    }

    public final int size()
    {
        return a.size();
    }

    public final Object[] toArray()
    {
        return b.toArray();
    }

    public final Object[] toArray(Object aobj[])
    {
        return b.toArray(aobj);
    }

    public final String toString()
    {
        return b.toString();
    }

    (Map map)
    {
        j.a(map.isEmpty(), "Map is non-empty");
        a = map;
        b = map.keySet();
    }
}
