// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            Maps, Ordering, SortedMapDifference

public final class SortedMaps
{
    private static class FilteredSortedMap extends Maps.FilteredEntryMap
        implements SortedMap
    {

        public Comparator comparator()
        {
            return sortedMap().comparator();
        }

        public Object firstKey()
        {
            return keySet().iterator().next();
        }

        public SortedMap headMap(Object obj)
        {
            return new FilteredSortedMap(sortedMap().headMap(obj), predicate);
        }

        public Object lastKey()
        {
            Object obj = sortedMap();
            do
            {
                obj = ((SortedMap) (obj)).lastKey();
                if (apply(obj, unfiltered.get(obj)))
                {
                    return obj;
                }
                obj = sortedMap().headMap(obj);
            } while (true);
        }

        SortedMap sortedMap()
        {
            return (SortedMap)unfiltered;
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return new FilteredSortedMap(sortedMap().subMap(obj, obj1), predicate);
        }

        public SortedMap tailMap(Object obj)
        {
            return new FilteredSortedMap(sortedMap().tailMap(obj), predicate);
        }

        FilteredSortedMap(SortedMap sortedmap, Predicate predicate)
        {
            super(sortedmap, predicate);
        }
    }

    static class SortedMapDifferenceImpl extends Maps.MapDifferenceImpl
        implements SortedMapDifference
    {

        public volatile Map entriesDiffering()
        {
            return entriesDiffering();
        }

        public SortedMap entriesDiffering()
        {
            return (SortedMap)super.entriesDiffering();
        }

        public volatile Map entriesInCommon()
        {
            return entriesInCommon();
        }

        public SortedMap entriesInCommon()
        {
            return (SortedMap)super.entriesInCommon();
        }

        public volatile Map entriesOnlyOnLeft()
        {
            return entriesOnlyOnLeft();
        }

        public SortedMap entriesOnlyOnLeft()
        {
            return (SortedMap)super.entriesOnlyOnLeft();
        }

        public volatile Map entriesOnlyOnRight()
        {
            return entriesOnlyOnRight();
        }

        public SortedMap entriesOnlyOnRight()
        {
            return (SortedMap)super.entriesOnlyOnRight();
        }

        SortedMapDifferenceImpl(boolean flag, SortedMap sortedmap, SortedMap sortedmap1, SortedMap sortedmap2, SortedMap sortedmap3)
        {
            super(flag, sortedmap, sortedmap1, sortedmap2, sortedmap3);
        }
    }

    static class TransformedEntriesSortedMap extends Maps.TransformedEntriesMap
        implements SortedMap
    {

        public Comparator comparator()
        {
            return fromMap().comparator();
        }

        public Object firstKey()
        {
            return fromMap().firstKey();
        }

        protected SortedMap fromMap()
        {
            return (SortedMap)fromMap;
        }

        public SortedMap headMap(Object obj)
        {
            return SortedMaps.transformEntries(fromMap().headMap(obj), transformer);
        }

        public Object lastKey()
        {
            return fromMap().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj1)
        {
            return SortedMaps.transformEntries(fromMap().subMap(obj, obj1), transformer);
        }

        public SortedMap tailMap(Object obj)
        {
            return SortedMaps.transformEntries(fromMap().tailMap(obj), transformer);
        }

        TransformedEntriesSortedMap(SortedMap sortedmap, Maps.EntryTransformer entrytransformer)
        {
            super(sortedmap, entrytransformer);
        }
    }


    private SortedMaps()
    {
    }

    public static SortedMapDifference difference(SortedMap sortedmap, Map map)
    {
        Object obj = orNaturalOrder(sortedmap.comparator());
        java.util.TreeMap treemap = Maps.newTreeMap(((Comparator) (obj)));
        java.util.TreeMap treemap1 = Maps.newTreeMap(((Comparator) (obj)));
        treemap1.putAll(map);
        java.util.TreeMap treemap2 = Maps.newTreeMap(((Comparator) (obj)));
        obj = Maps.newTreeMap(((Comparator) (obj)));
        boolean flag = true;
        for (sortedmap = sortedmap.entrySet().iterator(); sortedmap.hasNext();)
        {
            Object obj2 = (java.util.Map.Entry)sortedmap.next();
            Object obj1 = ((java.util.Map.Entry) (obj2)).getKey();
            obj2 = ((java.util.Map.Entry) (obj2)).getValue();
            if (map.containsKey(obj1))
            {
                Object obj3 = treemap1.remove(obj1);
                if (Objects.equal(obj2, obj3))
                {
                    treemap2.put(obj1, obj2);
                } else
                {
                    flag = false;
                    ((SortedMap) (obj)).put(obj1, new Maps.ValueDifferenceImpl(obj2, obj3));
                }
            } else
            {
                flag = false;
                treemap.put(obj1, obj2);
            }
        }

        boolean flag1;
        if (flag && treemap1.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return sortedMapDifference(flag1, treemap, treemap1, treemap2, ((SortedMap) (obj)));
    }

    public static SortedMap filterEntries(SortedMap sortedmap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (sortedmap instanceof FilteredSortedMap)
        {
            return filterFiltered((FilteredSortedMap)sortedmap, predicate);
        } else
        {
            return new FilteredSortedMap((SortedMap)Preconditions.checkNotNull(sortedmap), predicate);
        }
    }

    private static SortedMap filterFiltered(FilteredSortedMap filteredsortedmap, Predicate predicate)
    {
        predicate = Predicates.and(filteredsortedmap.predicate, predicate);
        return new FilteredSortedMap(filteredsortedmap.sortedMap(), predicate);
    }

    public static SortedMap filterKeys(SortedMap sortedmap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        return filterEntries(sortedmap, new Predicate(predicate) {

            final Predicate val$keyPredicate;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return keyPredicate.apply(entry.getKey());
            }

            
            {
                keyPredicate = predicate;
                super();
            }
        });
    }

    public static SortedMap filterValues(SortedMap sortedmap, Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        return filterEntries(sortedmap, new Predicate(predicate) {

            final Predicate val$valuePredicate;

            public volatile boolean apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public boolean apply(java.util.Map.Entry entry)
            {
                return valuePredicate.apply(entry.getValue());
            }

            
            {
                valuePredicate = predicate;
                super();
            }
        });
    }

    static Comparator orNaturalOrder(Comparator comparator)
    {
        if (comparator != null)
        {
            return comparator;
        } else
        {
            return Ordering.natural();
        }
    }

    private static SortedMapDifference sortedMapDifference(boolean flag, SortedMap sortedmap, SortedMap sortedmap1, SortedMap sortedmap2, SortedMap sortedmap3)
    {
        return new SortedMapDifferenceImpl(flag, Collections.unmodifiableSortedMap(sortedmap), Collections.unmodifiableSortedMap(sortedmap1), Collections.unmodifiableSortedMap(sortedmap2), Collections.unmodifiableSortedMap(sortedmap3));
    }

    public static SortedMap transformEntries(SortedMap sortedmap, Maps.EntryTransformer entrytransformer)
    {
        return new TransformedEntriesSortedMap(sortedmap, entrytransformer);
    }

    public static SortedMap transformValues(SortedMap sortedmap, Function function)
    {
        Preconditions.checkNotNull(function);
        return transformEntries(sortedmap, new Maps.EntryTransformer(function) {

            final Function val$function;

            public Object transformEntry(Object obj, Object obj1)
            {
                return function.apply(obj1);
            }

            
            {
                function = function1;
                super();
            }
        });
    }
}
