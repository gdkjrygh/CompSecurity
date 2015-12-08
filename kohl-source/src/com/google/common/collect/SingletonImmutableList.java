// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, ObjectArrays, UnmodifiableIterator, 
//            UnmodifiableListIterator

final class SingletonImmutableList extends ImmutableList
{

    final transient Object element;

    SingletonImmutableList(Object obj)
    {
        element = Preconditions.checkNotNull(obj);
    }

    public boolean contains(Object obj)
    {
        return element.equals(obj);
    }

    public boolean equals(Object obj)
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

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, 1);
        return element;
    }

    public int hashCode()
    {
        return element.hashCode() + 31;
    }

    public int indexOf(Object obj)
    {
        return !element.equals(obj) ? -1 : 0;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.singletonIterator(element);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int lastIndexOf(Object obj)
    {
        return !element.equals(obj) ? -1 : 0;
    }

    public UnmodifiableListIterator listIterator(final int start)
    {
        Preconditions.checkPositionIndex(start, 1);
        return new UnmodifiableListIterator() {

            boolean hasNext;
            final SingletonImmutableList this$0;
            final int val$start;

            public boolean hasNext()
            {
                return hasNext;
            }

            public boolean hasPrevious()
            {
                return !hasNext;
            }

            public Object next()
            {
                if (!hasNext)
                {
                    throw new NoSuchElementException();
                } else
                {
                    hasNext = false;
                    return element;
                }
            }

            public int nextIndex()
            {
                return !hasNext ? 1 : 0;
            }

            public Object previous()
            {
                if (hasNext)
                {
                    throw new NoSuchElementException();
                } else
                {
                    hasNext = true;
                    return element;
                }
            }

            public int previousIndex()
            {
                return !hasNext ? 0 : -1;
            }

            
            {
                this$0 = SingletonImmutableList.this;
                start = i;
                super();
                boolean flag;
                if (start == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                hasNext = flag;
            }
        };
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public ImmutableList reverse()
    {
        return this;
    }

    public int size()
    {
        return 1;
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, 1);
        Object obj = this;
        if (i == j)
        {
            obj = ImmutableList.of();
        }
        return ((ImmutableList) (obj));
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
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
        Object aobj1[] = ObjectArrays.newArray(aobj, 1);
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
}
