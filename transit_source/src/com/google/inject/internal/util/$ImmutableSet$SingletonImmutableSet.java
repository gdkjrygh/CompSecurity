// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableSet, $Iterators, $ObjectArrays, $UnmodifiableIterator

private static final class hashCode extends $ImmutableSet
{

    final Object element;
    final int hashCode;

    public boolean contains(Object obj)
    {
        return element.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Set)
            {
                if (((Set) (obj = (Set)obj)).size() != 1 || !element.equals(((Set) (obj)).iterator().next()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return hashCode;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isHashCodeFast()
    {
        return true;
    }

    public $UnmodifiableIterator iterator()
    {
        return $Iterators.singletonIterator(element);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return 1;
    }

    public Object[] toArray()
    {
        return (new Object[] {
            element
        });
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length != 0) goto _L2; else goto _L1
_L1:
        Object aobj1[] = $ObjectArrays.newArray(aobj, 1);
_L4:
        aobj1[0] = element;
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > 1)
        {
            aobj[1] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        String s = element.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }

    I(Object obj, int i)
    {
        element = obj;
        hashCode = i;
    }
}
