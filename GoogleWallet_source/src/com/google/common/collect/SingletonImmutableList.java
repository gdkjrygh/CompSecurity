// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, UnmodifiableIterator

final class SingletonImmutableList extends ImmutableList
{

    final transient Object element;

    SingletonImmutableList(Object obj)
    {
        element = Preconditions.checkNotNull(obj);
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
            if (obj instanceof List)
            {
                if (((List) (obj = (List)obj)).size() != 1 || !element.equals(((List) (obj)).get(0)))
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

    public final Object get(int i)
    {
        Preconditions.checkElementIndex(i, 1);
        return element;
    }

    public final int hashCode()
    {
        return element.hashCode() + 31;
    }

    public final int indexOf(Object obj)
    {
        return !element.equals(obj) ? -1 : 0;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final UnmodifiableIterator iterator()
    {
        return Iterators.singletonIterator(element);
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }

    public final ImmutableList reverse()
    {
        return this;
    }

    public final int size()
    {
        return 1;
    }

    public final ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = ImmutableList.of();
        }
        return ((ImmutableList) (obj));
    }

    public final volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    public final String toString()
    {
        String s = element.toString();
        return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
    }
}
