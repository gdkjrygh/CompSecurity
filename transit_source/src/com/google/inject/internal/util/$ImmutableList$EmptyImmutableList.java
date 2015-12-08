// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableList, $Preconditions, $Iterators, $UnmodifiableIterator

private static final class <init> extends $ImmutableList
{

    private static final Object EMPTY_ARRAY[] = new Object[0];

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        return collection.isEmpty();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof List)
        {
            return ((List)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object get(int i)
    {
        $Preconditions.checkElementIndex(i, 0);
        throw new AssertionError("unreachable");
    }

    public int hashCode()
    {
        return 1;
    }

    public int indexOf(Object obj)
    {
        return -1;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public $UnmodifiableIterator iterator()
    {
        return $Iterators.emptyIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return -1;
    }

    public ListIterator listIterator()
    {
        return $Iterators.emptyListIterator();
    }

    public ListIterator listIterator(int i)
    {
        $Preconditions.checkPositionIndex(i, 0);
        return $Iterators.emptyListIterator();
    }

    public int size()
    {
        return 0;
    }

    public $ImmutableList subList(int i, int j)
    {
        $Preconditions.checkPositionIndexes(i, j, 0);
        return this;
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    public Object[] toArray()
    {
        return EMPTY_ARRAY;
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    public String toString()
    {
        return "[]";
    }


    private ()
    {
        super(null);
    }

    ( )
    {
        this();
    }
}
