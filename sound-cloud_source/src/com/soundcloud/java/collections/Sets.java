// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.functions.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// Referenced classes of package com.soundcloud.java.collections:
//            CollectPreconditions, FilteredSet, FilteredNavigableSet, FilteredSortedSet, 
//            MoreCollections, Iterators, Iterables

public final class Sets
{

    private Sets()
    {
    }

    static int capacity(int i)
    {
        if (i < 3)
        {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static boolean equalsImpl(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    public static NavigableSet filter(NavigableSet navigableset, Predicate predicate)
    {
        if (navigableset instanceof FilteredSet)
        {
            navigableset = (FilteredSet)navigableset;
            predicate = Predicates.and(((FilteredSet) (navigableset)).predicate, predicate);
            return new FilteredNavigableSet((NavigableSet)((FilteredSet) (navigableset)).unfiltered, predicate);
        } else
        {
            return new FilteredNavigableSet((NavigableSet)Preconditions.checkNotNull(navigableset), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    public static Set filter(Set set, Predicate predicate)
    {
        if (set instanceof SortedSet)
        {
            return filter((SortedSet)set, predicate);
        }
        if (set instanceof FilteredSet)
        {
            set = (FilteredSet)set;
            predicate = Predicates.and(((FilteredSet) (set)).predicate, predicate);
            return new FilteredSet((Set)((FilteredSet) (set)).unfiltered, predicate);
        } else
        {
            return new FilteredSet((Set)Preconditions.checkNotNull(set), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    public static SortedSet filter(SortedSet sortedset, Predicate predicate)
    {
        if (sortedset instanceof NavigableSet)
        {
            return filter((NavigableSet)sortedset, predicate);
        } else
        {
            return filterSortedIgnoreNavigable(sortedset, predicate);
        }
    }

    static SortedSet filterSortedIgnoreNavigable(SortedSet sortedset, Predicate predicate)
    {
        if (sortedset instanceof FilteredSet)
        {
            sortedset = (FilteredSet)sortedset;
            predicate = Predicates.and(((FilteredSet) (sortedset)).predicate, predicate);
            return new FilteredSortedSet((SortedSet)((FilteredSet) (sortedset)).unfiltered, predicate);
        } else
        {
            return new FilteredSortedSet((SortedSet)Preconditions.checkNotNull(sortedset), (Predicate)Preconditions.checkNotNull(predicate));
        }
    }

    static int hashCodeImpl(Set set)
    {
        int i = 0;
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            Object obj = set.next();
            if (obj != null)
            {
                i += obj.hashCode();
            }
        } while (true);
        return i;
    }

    public static HashSet newHashSet(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new HashSet(MoreCollections.cast(iterable));
        } else
        {
            return newHashSet(iterable.iterator());
        }
    }

    public static HashSet newHashSet(Iterator iterator)
    {
        HashSet hashset = new HashSet();
        Iterators.addAll(hashset, iterator);
        return hashset;
    }

    public static transient HashSet newHashSet(Object aobj[])
    {
        HashSet hashset = newHashSetWithExpectedSize(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    public static HashSet newHashSetWithExpectedSize(int i)
    {
        return new HashSet(capacity(i));
    }

    public static TreeSet newTreeSet(Iterable iterable)
    {
        TreeSet treeset = new TreeSet();
        Iterables.addAll(treeset, iterable);
        return treeset;
    }
}
