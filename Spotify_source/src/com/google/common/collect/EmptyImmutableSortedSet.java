// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuw;
import cva;
import cvh;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList

class EmptyImmutableSortedSet extends ImmutableSortedSet
{

    EmptyImmutableSortedSet(Comparator comparator)
    {
        super(comparator);
    }

    final int a(Object obj)
    {
        return -1;
    }

    final int a(Object aobj[], int i)
    {
        return i;
    }

    final ImmutableSortedSet a(Object obj, boolean flag)
    {
        return this;
    }

    final ImmutableSortedSet a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return this;
    }

    public final cvh a()
    {
        return cuw.a();
    }

    public final ImmutableList b()
    {
        return ImmutableList.d();
    }

    final ImmutableSortedSet b(Object obj, boolean flag)
    {
        return this;
    }

    public final cvh c()
    {
        return cuw.a();
    }

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    final ImmutableSortedSet d()
    {
        return new EmptyImmutableSortedSet(cva.a(a).a());
    }

    public Iterator descendingIterator()
    {
        return cuw.a();
    }

    final boolean e()
    {
        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object first()
    {
        throw new NoSuchElementException();
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Iterator iterator()
    {
        return cuw.a();
    }

    public Object last()
    {
        throw new NoSuchElementException();
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "[]";
    }
}
