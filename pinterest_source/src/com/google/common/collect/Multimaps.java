// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, Multimap, SetMultimap, SortedSetMultimap, 
//            FilteredMultimap, FilteredEntryMultimap, FilteredSetMultimap, FilteredEntrySetMultimap, 
//            FilteredKeyListMultimap, FilteredKeyMultimap, Maps, FilteredKeySetMultimap, 
//            ImmutableListMultimap, Synchronized, ImmutableMultimap, ImmutableSetMultimap

public final class Multimaps
{

    private Multimaps()
    {
    }

    public static Map asMap(ListMultimap listmultimap)
    {
        return listmultimap.asMap();
    }

    public static Map asMap(Multimap multimap)
    {
        return multimap.asMap();
    }

    public static Map asMap(SetMultimap setmultimap)
    {
        return setmultimap.asMap();
    }

    public static Map asMap(SortedSetMultimap sortedsetmultimap)
    {
        return sortedsetmultimap.asMap();
    }

    static boolean equalsImpl(Multimap multimap, Object obj)
    {
        if (obj == multimap)
        {
            return true;
        }
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return multimap.asMap().equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public static Multimap filterEntries(Multimap multimap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (multimap instanceof SetMultimap)
        {
            return filterEntries((SetMultimap)multimap, predicate);
        }
        if (multimap instanceof FilteredMultimap)
        {
            return filterFiltered((FilteredMultimap)multimap, predicate);
        } else
        {
            return new FilteredEntryMultimap((Multimap)Preconditions.checkNotNull(multimap), predicate);
        }
    }

    public static SetMultimap filterEntries(SetMultimap setmultimap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (setmultimap instanceof FilteredSetMultimap)
        {
            return filterFiltered((FilteredSetMultimap)setmultimap, predicate);
        } else
        {
            return new FilteredEntrySetMultimap((SetMultimap)Preconditions.checkNotNull(setmultimap), predicate);
        }
    }

    private static Multimap filterFiltered(FilteredMultimap filteredmultimap, Predicate predicate)
    {
        predicate = Predicates.and(filteredmultimap.entryPredicate(), predicate);
        return new FilteredEntryMultimap(filteredmultimap.unfiltered(), predicate);
    }

    private static SetMultimap filterFiltered(FilteredSetMultimap filteredsetmultimap, Predicate predicate)
    {
        predicate = Predicates.and(filteredsetmultimap.entryPredicate(), predicate);
        return new FilteredEntrySetMultimap(filteredsetmultimap.unfiltered(), predicate);
    }

    public static ListMultimap filterKeys(ListMultimap listmultimap, Predicate predicate)
    {
        if (listmultimap instanceof FilteredKeyListMultimap)
        {
            listmultimap = (FilteredKeyListMultimap)listmultimap;
            return new FilteredKeyListMultimap(listmultimap.unfiltered(), Predicates.and(((FilteredKeyListMultimap) (listmultimap)).keyPredicate, predicate));
        } else
        {
            return new FilteredKeyListMultimap(listmultimap, predicate);
        }
    }

    public static Multimap filterKeys(Multimap multimap, Predicate predicate)
    {
        if (multimap instanceof SetMultimap)
        {
            return filterKeys((SetMultimap)multimap, predicate);
        }
        if (multimap instanceof ListMultimap)
        {
            return filterKeys((ListMultimap)multimap, predicate);
        }
        if (multimap instanceof FilteredKeyMultimap)
        {
            multimap = (FilteredKeyMultimap)multimap;
            return new FilteredKeyMultimap(((FilteredKeyMultimap) (multimap)).unfiltered, Predicates.and(((FilteredKeyMultimap) (multimap)).keyPredicate, predicate));
        }
        if (multimap instanceof FilteredMultimap)
        {
            return filterFiltered((FilteredMultimap)multimap, Maps.keyPredicateOnEntries(predicate));
        } else
        {
            return new FilteredKeyMultimap(multimap, predicate);
        }
    }

    public static SetMultimap filterKeys(SetMultimap setmultimap, Predicate predicate)
    {
        if (setmultimap instanceof FilteredKeySetMultimap)
        {
            setmultimap = (FilteredKeySetMultimap)setmultimap;
            return new FilteredKeySetMultimap(setmultimap.unfiltered(), Predicates.and(((FilteredKeySetMultimap) (setmultimap)).keyPredicate, predicate));
        }
        if (setmultimap instanceof FilteredSetMultimap)
        {
            return filterFiltered((FilteredSetMultimap)setmultimap, Maps.keyPredicateOnEntries(predicate));
        } else
        {
            return new FilteredKeySetMultimap(setmultimap, predicate);
        }
    }

    public static Multimap filterValues(Multimap multimap, Predicate predicate)
    {
        return filterEntries(multimap, Maps.valuePredicateOnEntries(predicate));
    }

    public static SetMultimap filterValues(SetMultimap setmultimap, Predicate predicate)
    {
        return filterEntries(setmultimap, Maps.valuePredicateOnEntries(predicate));
    }

    public static SetMultimap forMap(Map map)
    {
        return new MapMultimap(map);
    }

    public static ImmutableListMultimap index(Iterable iterable, Function function)
    {
        return index(iterable.iterator(), function);
    }

    public static ImmutableListMultimap index(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        Object obj;
        for (; iterator.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterator.next();
            Preconditions.checkNotNull(obj, iterator);
        }

        return builder.build();
    }

    public static Multimap invertFrom(Multimap multimap, Multimap multimap1)
    {
        Preconditions.checkNotNull(multimap1);
        java.util.Map.Entry entry;
        for (multimap = multimap.entries().iterator(); multimap.hasNext(); multimap1.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)multimap.next();
        }

        return multimap1;
    }

    public static ListMultimap newListMultimap(Map map, Supplier supplier)
    {
        return new CustomListMultimap(map, supplier);
    }

    public static Multimap newMultimap(Map map, Supplier supplier)
    {
        return new CustomMultimap(map, supplier);
    }

    public static SetMultimap newSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSetMultimap(map, supplier);
    }

    public static SortedSetMultimap newSortedSetMultimap(Map map, Supplier supplier)
    {
        return new CustomSortedSetMultimap(map, supplier);
    }

    public static ListMultimap synchronizedListMultimap(ListMultimap listmultimap)
    {
        return Synchronized.listMultimap(listmultimap, null);
    }

    public static Multimap synchronizedMultimap(Multimap multimap)
    {
        return Synchronized.multimap(multimap, null);
    }

    public static SetMultimap synchronizedSetMultimap(SetMultimap setmultimap)
    {
        return Synchronized.setMultimap(setmultimap, null);
    }

    public static SortedSetMultimap synchronizedSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        return Synchronized.sortedSetMultimap(sortedsetmultimap, null);
    }

    public static ListMultimap transformEntries(ListMultimap listmultimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesListMultimap(listmultimap, entrytransformer);
    }

    public static Multimap transformEntries(Multimap multimap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesMultimap(multimap, entrytransformer);
    }

    public static ListMultimap transformValues(ListMultimap listmultimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(listmultimap, Maps.asEntryTransformer(function));
    }

    public static Multimap transformValues(Multimap multimap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, Maps.asEntryTransformer(function));
    }

    private static Collection unmodifiableEntries(Collection collection)
    {
        if (collection instanceof Set)
        {
            return Maps.unmodifiableEntrySet((Set)collection);
        } else
        {
            return new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
        }
    }

    public static ListMultimap unmodifiableListMultimap(ImmutableListMultimap immutablelistmultimap)
    {
        return (ListMultimap)Preconditions.checkNotNull(immutablelistmultimap);
    }

    public static ListMultimap unmodifiableListMultimap(ListMultimap listmultimap)
    {
        if ((listmultimap instanceof UnmodifiableListMultimap) || (listmultimap instanceof ImmutableListMultimap))
        {
            return listmultimap;
        } else
        {
            return new UnmodifiableListMultimap(listmultimap);
        }
    }

    public static Multimap unmodifiableMultimap(ImmutableMultimap immutablemultimap)
    {
        return (Multimap)Preconditions.checkNotNull(immutablemultimap);
    }

    public static Multimap unmodifiableMultimap(Multimap multimap)
    {
        if ((multimap instanceof UnmodifiableMultimap) || (multimap instanceof ImmutableMultimap))
        {
            return multimap;
        } else
        {
            return new UnmodifiableMultimap(multimap);
        }
    }

    public static SetMultimap unmodifiableSetMultimap(ImmutableSetMultimap immutablesetmultimap)
    {
        return (SetMultimap)Preconditions.checkNotNull(immutablesetmultimap);
    }

    public static SetMultimap unmodifiableSetMultimap(SetMultimap setmultimap)
    {
        if ((setmultimap instanceof UnmodifiableSetMultimap) || (setmultimap instanceof ImmutableSetMultimap))
        {
            return setmultimap;
        } else
        {
            return new UnmodifiableSetMultimap(setmultimap);
        }
    }

    public static SortedSetMultimap unmodifiableSortedSetMultimap(SortedSetMultimap sortedsetmultimap)
    {
        if (sortedsetmultimap instanceof UnmodifiableSortedSetMultimap)
        {
            return sortedsetmultimap;
        } else
        {
            return new UnmodifiableSortedSetMultimap(sortedsetmultimap);
        }
    }

    private static Collection unmodifiableValueCollection(Collection collection)
    {
        if (collection instanceof SortedSet)
        {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set)
        {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List)
        {
            return Collections.unmodifiableList((List)collection);
        } else
        {
            return Collections.unmodifiableCollection(collection);
        }
    }



    /* member class not found */
    class MapMultimap {}


    /* member class not found */
    class CustomListMultimap {}


    /* member class not found */
    class CustomMultimap {}


    /* member class not found */
    class CustomSetMultimap {}


    /* member class not found */
    class CustomSortedSetMultimap {}


    /* member class not found */
    class TransformedEntriesListMultimap {}


    /* member class not found */
    class TransformedEntriesMultimap {}


    /* member class not found */
    class UnmodifiableListMultimap {}


    /* member class not found */
    class UnmodifiableMultimap {}


    /* member class not found */
    class UnmodifiableSetMultimap {}


    /* member class not found */
    class UnmodifiableSortedSetMultimap {}

}
