// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableSet, $Iterators, $UnmodifiableIterator

private static final class <init> extends $ImmutableSet
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
        if (obj instanceof Set)
        {
            return ((Set)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    boolean isHashCodeFast()
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

    public int size()
    {
        return 0;
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
    }

    ( )
    {
        this();
    }
}
