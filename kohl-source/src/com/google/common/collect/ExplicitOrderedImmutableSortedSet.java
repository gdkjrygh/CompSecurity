// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ExplicitOrdering, ImmutableMap, ImmutableSet, 
//            ImmutableSortedAsList, RegularImmutableList, Iterators, Platform, 
//            ObjectArrays, ImmutableList, UnmodifiableIterator

final class ExplicitOrderedImmutableSortedSet extends ImmutableSortedSet
{
    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return ImmutableSortedSet.withExplicitOrder(Arrays.asList(elements));
        }

        public SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }


    private final Object elements[];
    private final int fromIndex;
    private final int toIndex;

    ExplicitOrderedImmutableSortedSet(Object aobj[], Comparator comparator)
    {
        this(aobj, comparator, 0, aobj.length);
    }

    ExplicitOrderedImmutableSortedSet(Object aobj[], Comparator comparator, int i, int j)
    {
        super(comparator);
        elements = aobj;
        fromIndex = i;
        toIndex = j;
    }

    static ImmutableSortedSet create(List list)
    {
        list = new ExplicitOrdering(list);
        if (((ExplicitOrdering) (list)).rankMap.isEmpty())
        {
            return emptySet(list);
        } else
        {
            return new ExplicitOrderedImmutableSortedSet(((ExplicitOrdering) (list)).rankMap.keySet().toArray(), list);
        }
    }

    private ImmutableSortedSet createSubset(int i, int j)
    {
        if (i < j)
        {
            return new ExplicitOrderedImmutableSortedSet(elements, comparator, i, j);
        } else
        {
            return emptySet(comparator);
        }
    }

    private int findSubsetIndex(Object obj)
    {
        obj = (Integer)rankMap().get(obj);
        if (obj == null)
        {
            throw new ClassCastException();
        }
        if (((Integer) (obj)).intValue() <= fromIndex)
        {
            return fromIndex;
        }
        if (((Integer) (obj)).intValue() >= toIndex)
        {
            return toIndex;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    private ImmutableMap rankMap()
    {
        return ((ExplicitOrdering)comparator()).rankMap;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public boolean contains(Object obj)
    {
        obj = (Integer)rankMap().get(obj);
        return obj != null && ((Integer) (obj)).intValue() >= fromIndex && ((Integer) (obj)).intValue() < toIndex;
    }

    ImmutableList createAsList()
    {
        return new ImmutableSortedAsList(this, new RegularImmutableList(elements, fromIndex, size()));
    }

    public Object first()
    {
        return elements[fromIndex];
    }

    public int hashCode()
    {
        int j = 0;
        for (int i = fromIndex; i < toIndex; i++)
        {
            j += elements[i].hashCode();
        }

        return j;
    }

    ImmutableSortedSet headSetImpl(Object obj)
    {
        return createSubset(fromIndex, findSubsetIndex(obj));
    }

    int indexOf(Object obj)
    {
        obj = (Integer)rankMap().get(obj);
        if (obj != null && ((Integer) (obj)).intValue() >= fromIndex && ((Integer) (obj)).intValue() < toIndex)
        {
            return ((Integer) (obj)).intValue() - fromIndex;
        } else
        {
            return -1;
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return fromIndex != 0 || toIndex != elements.length;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.forArray(elements, fromIndex, size());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Object last()
    {
        return elements[toIndex - 1];
    }

    public int size()
    {
        return toIndex - fromIndex;
    }

    ImmutableSortedSet subSetImpl(Object obj, Object obj1)
    {
        return createSubset(findSubsetIndex(obj), findSubsetIndex(obj1));
    }

    ImmutableSortedSet tailSetImpl(Object obj)
    {
        return createSubset(findSubsetIndex(obj), toIndex);
    }

    public Object[] toArray()
    {
        Object aobj[] = new Object[size()];
        Platform.unsafeArrayCopy(elements, fromIndex, aobj, 0, size());
        return aobj;
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        Platform.unsafeArrayCopy(elements, fromIndex, aobj1, 0, i);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }
}
