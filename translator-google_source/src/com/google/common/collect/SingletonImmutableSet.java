// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, bl, ej

final class SingletonImmutableSet extends ImmutableSet
{

    private transient int a;
    final transient Object element;

    SingletonImmutableSet(Object obj)
    {
        element = p.a(obj);
    }

    SingletonImmutableSet(Object obj, int i)
    {
        element = obj;
        a = i;
    }

    public final boolean contains(Object obj)
    {
        return element.equals(obj);
    }

    final int copyIntoArray(Object aobj[], int i)
    {
        aobj[i] = element;
        return i + 1;
    }

    public final boolean equals(Object obj)
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
        int j = a;
        int i = j;
        if (j == 0)
        {
            i = element.hashCode();
            a = i;
        }
        return i;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    final boolean isHashCodeFast()
    {
        return a != 0;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final ej iterator()
    {
        return bl.a(element);
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return 1;
    }

    public final String toString()
    {
        String s = element.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
