// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.c.b:
//            bc, bi

private static final class b
    implements Set
{

    private final bi a;
    private final Set b;

    public final boolean add(Object obj)
    {
        a.d();
        return b.add(obj);
    }

    public final boolean addAll(Collection collection)
    {
        a.d();
        return b.addAll(collection);
    }

    public final void clear()
    {
        a.d();
        b.clear();
    }

    public final boolean contains(Object obj)
    {
        return b.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return b.containsAll(collection);
    }

    public final boolean equals(Object obj)
    {
        return b.equals(obj);
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final boolean isEmpty()
    {
        return b.isEmpty();
    }

    public final Iterator iterator()
    {
        return new <init>(a, b.iterator());
    }

    public final boolean remove(Object obj)
    {
        a.d();
        return b.remove(obj);
    }

    public final boolean removeAll(Collection collection)
    {
        a.d();
        return b.removeAll(collection);
    }

    public final boolean retainAll(Collection collection)
    {
        a.d();
        return b.retainAll(collection);
    }

    public final int size()
    {
        return b.size();
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

    (bi bi1, Set set)
    {
        a = bi1;
        b = set;
    }
}
