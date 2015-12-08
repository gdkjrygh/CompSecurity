// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList, ImmutableSortedAsList, UnmodifiableIterator

final class RegularImmutableSortedSet extends ImmutableSortedSet
{

    private final transient ImmutableList elements;

    RegularImmutableSortedSet(ImmutableList immutablelist, Comparator comparator)
    {
        super(comparator);
        elements = immutablelist;
        boolean flag;
        if (!immutablelist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    private int binarySearch(Object obj)
    {
        Comparator comparator = this.comparator;
        return Collections.binarySearch(elements, obj, comparator);
    }

    private ImmutableSortedSet createSubset(int i, int j)
    {
        if (i < j)
        {
            return new RegularImmutableSortedSet(elements.subList(i, j), comparator);
        } else
        {
            return emptySet(comparator);
        }
    }

    private int findSubsetIndex(Object obj)
    {
        int i = binarySearch(obj);
        if (i >= 0)
        {
            return i;
        } else
        {
            return -i - 1;
        }
    }

    public boolean contains(Object obj)
    {
        if (obj != null)
        {
            int i;
            try
            {
                i = binarySearch(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            if (i >= 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        boolean flag1 = true;
        if (hasSameComparator(collection, comparator()) && collection.size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(collection);
_L6:
        return flag;
_L2:
        UnmodifiableIterator unmodifiableiterator;
        Iterator iterator1;
        unmodifiableiterator = iterator();
        iterator1 = collection.iterator();
        collection = ((Collection) (iterator1.next()));
_L3:
        int i;
        try
        {
            if (!unmodifiableiterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_116;
            }
            i = unsafeCompare(unmodifiableiterator.next(), collection);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        if (i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!iterator1.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (iterator1.next()));
          goto _L3
        continue; /* Loop/switch isn't completed */
        if (i <= 0) goto _L3; else goto _L4
_L4:
        return false;
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    ImmutableList createAsList()
    {
        return new ImmutableSortedAsList(this, elements);
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            return false;
        }
        obj = (Set)obj;
        if (size() != ((Set) (obj)).size())
        {
            return false;
        }
        if (!hasSameComparator(((Iterable) (obj)), comparator))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((Set) (obj)).iterator();
        UnmodifiableIterator unmodifiableiterator = iterator();
_L5:
        if (!unmodifiableiterator.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = unmodifiableiterator.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        try
        {
            i = unsafeCompare(obj1, obj2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (i == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    public Object first()
    {
        return elements.get(0);
    }

    ImmutableSortedSet headSetImpl(Object obj)
    {
        return createSubset(0, findSubsetIndex(obj));
    }

    int indexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = binarySearch(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return -1;
        }
        if (i < 0 || !elements.get(i).equals(obj))
        {
            i = -1;
        }
        return i;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isPartialView()
    {
        return elements.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return elements.iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public Object last()
    {
        return elements.get(size() - 1);
    }

    public int size()
    {
        return elements.size();
    }

    ImmutableSortedSet subSetImpl(Object obj, Object obj1)
    {
        return createSubset(findSubsetIndex(obj), findSubsetIndex(obj1));
    }

    ImmutableSortedSet tailSetImpl(Object obj)
    {
        return createSubset(findSubsetIndex(obj), size());
    }

    public Object[] toArray()
    {
        return elements.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return elements.toArray(aobj);
    }
}
