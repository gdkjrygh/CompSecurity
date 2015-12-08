// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList, dl, eg, 
//            bl, dx, ImmutableSortedAsList, Ordering, 
//            SortedLists, ej

final class RegularImmutableSortedSet extends ImmutableSortedSet
{

    private final transient ImmutableList a;

    RegularImmutableSortedSet(ImmutableList immutablelist, Comparator comparator)
    {
        super(comparator);
        a = immutablelist;
        boolean flag;
        if (!immutablelist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
    }

    public final Object ceiling(Object obj)
    {
        int i = tailIndex(obj, true);
        if (i == size())
        {
            return null;
        } else
        {
            return a.get(i);
        }
    }

    public final boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            int i;
            try
            {
                i = Collections.binarySearch(a, obj, unsafeComparator());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (i >= 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean containsAll(Collection collection)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = collection;
        if (collection instanceof dl)
        {
            obj = ((dl)collection).elementSet();
        }
        if (eg.a(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        dx dx1;
        dx1 = bl.e(iterator());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int i;
        if (!dx1.hasNext())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        i = unsafeCompare(dx1.a(), collection);
        if (i < 0)
        {
            try
            {
                dx1.next();
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
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (((Iterator) (obj)).next()));
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        if (i <= 0) goto _L4; else goto _L5
_L5:
        return false;
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final int copyIntoArray(Object aobj[], int i)
    {
        return a.copyIntoArray(aobj, i);
    }

    final ImmutableList createAsList()
    {
        return new ImmutableSortedAsList(this, a);
    }

    final ImmutableSortedSet createDescendingSet()
    {
        return new RegularImmutableSortedSet(a.reverse(), Ordering.from(comparator).reverse());
    }

    public final ej descendingIterator()
    {
        return a.reverse().iterator();
    }

    public final volatile Iterator descendingIterator()
    {
        return descendingIterator();
    }

    public final boolean equals(Object obj)
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
        if (!eg.a(comparator, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((Set) (obj)).iterator();
        ej ej = iterator();
_L5:
        if (!ej.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = ej.next();
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

    public final Object first()
    {
        return a.get(0);
    }

    public final Object floor(Object obj)
    {
        int i = headIndex(obj, true) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return a.get(i);
        }
    }

    final ImmutableSortedSet getSubSet(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i < j)
        {
            return new RegularImmutableSortedSet(a.subList(i, j), comparator);
        } else
        {
            return emptySet(comparator);
        }
    }

    final int headIndex(Object obj, boolean flag)
    {
        ImmutableList immutablelist = a;
        Object obj1 = p.a(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_PRESENT;
        }
        return SortedLists.a(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
    }

    final ImmutableSortedSet headSetImpl(Object obj, boolean flag)
    {
        return getSubSet(0, headIndex(obj, flag));
    }

    public final Object higher(Object obj)
    {
        int i = tailIndex(obj, false);
        if (i == size())
        {
            return null;
        } else
        {
            return a.get(i);
        }
    }

    final int indexOf(Object obj)
    {
        if (obj != null)
        {
            int i;
            try
            {
                i = SortedLists.a(a, obj, unsafeComparator(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.INVERTED_INSERTION_INDEX);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1;
            }
            if (i >= 0)
            {
                return i;
            }
        }
        return -1;
    }

    public final boolean isEmpty()
    {
        return false;
    }

    final boolean isPartialView()
    {
        return a.isPartialView();
    }

    public final ej iterator()
    {
        return a.iterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final Object last()
    {
        return a.get(size() - 1);
    }

    public final Object lower(Object obj)
    {
        int i = headIndex(obj, false) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return a.get(i);
        }
    }

    public final int size()
    {
        return a.size();
    }

    final ImmutableSortedSet subSetImpl(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return tailSetImpl(obj, flag).headSetImpl(obj1, flag1);
    }

    final int tailIndex(Object obj, boolean flag)
    {
        ImmutableList immutablelist = a;
        Object obj1 = p.a(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_PRESENT;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.FIRST_AFTER;
        }
        return SortedLists.a(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
    }

    final ImmutableSortedSet tailSetImpl(Object obj, boolean flag)
    {
        return getSubSet(tailIndex(obj, flag), size());
    }

    final Comparator unsafeComparator()
    {
        return comparator;
    }
}
