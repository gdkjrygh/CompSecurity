// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, UnmodifiableListIterator, UnmodifiableIterator

final class EmptyImmutableList extends ImmutableList
{

    private static final Object EMPTY_ARRAY[] = new Object[0];
    static final EmptyImmutableList INSTANCE = new EmptyImmutableList();
    static final UnmodifiableListIterator ITERATOR = new UnmodifiableListIterator() {

        public boolean hasNext()
        {
            return false;
        }

        public boolean hasPrevious()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

        public int nextIndex()
        {
            return 0;
        }

        public Object previous()
        {
            throw new NoSuchElementException();
        }

        public int previousIndex()
        {
            return -1;
        }

    };
    private static final long serialVersionUID = 0L;

    private EmptyImmutableList()
    {
    }

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
        Preconditions.checkElementIndex(i, 0);
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

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.emptyIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return -1;
    }

    public UnmodifiableListIterator listIterator()
    {
        return ITERATOR;
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        Preconditions.checkPositionIndex(i, 0);
        return ITERATOR;
    }

    public volatile ListIterator listIterator()
    {
        return listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    Object readResolve()
    {
        return INSTANCE;
    }

    public ImmutableList reverse()
    {
        return this;
    }

    public int size()
    {
        return 0;
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, 0);
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

}
