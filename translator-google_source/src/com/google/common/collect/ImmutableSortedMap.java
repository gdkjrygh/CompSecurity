// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMapFauxverideShim, Ordering, EmptyImmutableSortedMap, ImmutableSortedSet, 
//            RegularImmutableSortedMap, RegularImmutableSortedSet, ImmutableList, au, 
//            bi, Maps, ImmutableCollection, ImmutableSet

public abstract class ImmutableSortedMap extends ImmutableSortedMapFauxverideShim
    implements NavigableMap
{

    private static final Comparator a;
    private static final ImmutableSortedMap b;
    private static final long serialVersionUID = 0L;
    private transient ImmutableSortedMap c;

    ImmutableSortedMap()
    {
    }

    ImmutableSortedMap(ImmutableSortedMap immutablesortedmap)
    {
        c = immutablesortedmap;
    }

    private static ImmutableSortedMap a(Map map, Comparator comparator1)
    {
        boolean flag;
        if (map instanceof SortedMap)
        {
            Object obj = ((SortedMap)map).comparator();
            if (obj == null)
            {
                if (comparator1 == a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = comparator1.equals(obj);
            }
        } else
        {
            flag = false;
        }
        if (flag && (map instanceof ImmutableSortedMap))
        {
            obj = (ImmutableSortedMap)map;
            if (!((ImmutableSortedMap) (obj)).isPartialView())
            {
                return ((ImmutableSortedMap) (obj));
            }
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[0]);
        return fromEntries(comparator1, flag, map.length, map);
    }

    public static ImmutableSortedMap copyOf(Map map)
    {
        return a(map, Ordering.natural());
    }

    public static ImmutableSortedMap copyOf(Map map, Comparator comparator1)
    {
        return a(map, (Comparator)p.a(comparator1));
    }

    public static ImmutableSortedMap copyOfSorted(SortedMap sortedmap)
    {
        Comparator comparator2 = sortedmap.comparator();
        Comparator comparator1 = comparator2;
        if (comparator2 == null)
        {
            comparator1 = a;
        }
        return a(sortedmap, comparator1);
    }

    static ImmutableSortedMap emptyMap(Comparator comparator1)
    {
        if (Ordering.natural().equals(comparator1))
        {
            return of();
        } else
        {
            return new EmptyImmutableSortedMap(comparator1);
        }
    }

    static ImmutableSortedMap from(ImmutableSortedSet immutablesortedset, ImmutableList immutablelist)
    {
        if (immutablesortedset.isEmpty())
        {
            return emptyMap(immutablesortedset.comparator());
        } else
        {
            return new RegularImmutableSortedMap((RegularImmutableSortedSet)immutablesortedset, immutablelist);
        }
    }

    static transient ImmutableSortedMap fromEntries(Comparator comparator1, boolean flag, int i, java.util.Map.Entry aentry[])
    {
        for (int j = 0; j < i; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            aentry[j] = entryOf(entry.getKey(), entry.getValue());
        }

        if (!flag)
        {
            Arrays.sort(aentry, 0, i, Ordering.from(comparator1).onKeys());
            int k = 1;
            while (k < i) 
            {
                if (comparator1.compare(aentry[k - 1].getKey(), aentry[k].getKey()) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                checkNoConflict(flag, "key", aentry[k - 1], aentry[k]);
                k++;
            }
        }
        return fromSortedEntries(comparator1, i, aentry);
    }

    static ImmutableSortedMap fromSortedEntries(Comparator comparator1, int i, java.util.Map.Entry aentry[])
    {
        if (i == 0)
        {
            return emptyMap(comparator1);
        }
        au au1 = ImmutableList.builder();
        au au2 = ImmutableList.builder();
        for (int j = 0; j < i; j++)
        {
            java.util.Map.Entry entry = aentry[j];
            au1.c(entry.getKey());
            au2.c(entry.getValue());
        }

        return new RegularImmutableSortedMap(new RegularImmutableSortedSet(au1.a(), comparator1), au2.a());
    }

    public static bi naturalOrder()
    {
        return new bi(Ordering.natural());
    }

    public static ImmutableSortedMap of()
    {
        return b;
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj)
    {
        return from(ImmutableSortedSet.of(comparable), ImmutableList.of(obj));
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1)
    {
        return fromEntries(Ordering.natural(), false, 2, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2)
    {
        return fromEntries(Ordering.natural(), false, 3, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3)
    {
        return fromEntries(Ordering.natural(), false, 4, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2), entryOf(comparable3, obj3)
        });
    }

    public static ImmutableSortedMap of(Comparable comparable, Object obj, Comparable comparable1, Object obj1, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, 
            Comparable comparable4, Object obj4)
    {
        return fromEntries(Ordering.natural(), false, 5, new java.util.Map.Entry[] {
            entryOf(comparable, obj), entryOf(comparable1, obj1), entryOf(comparable2, obj2), entryOf(comparable3, obj3), entryOf(comparable4, obj4)
        });
    }

    public static bi orderedBy(Comparator comparator1)
    {
        return new bi(comparator1);
    }

    public static bi reverseOrder()
    {
        return new bi(Ordering.natural().reverse());
    }

    public java.util.Map.Entry ceilingEntry(Object obj)
    {
        return tailMap(obj, true).firstEntry();
    }

    public Object ceilingKey(Object obj)
    {
        return Maps.a(ceilingEntry(obj));
    }

    public Comparator comparator()
    {
        return keySet().comparator();
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    abstract ImmutableSortedMap createDescendingMap();

    public ImmutableSortedSet descendingKeySet()
    {
        return keySet().descendingSet();
    }

    public volatile NavigableSet descendingKeySet()
    {
        return descendingKeySet();
    }

    public ImmutableSortedMap descendingMap()
    {
        ImmutableSortedMap immutablesortedmap1 = c;
        ImmutableSortedMap immutablesortedmap = immutablesortedmap1;
        if (immutablesortedmap1 == null)
        {
            immutablesortedmap = createDescendingMap();
            c = immutablesortedmap;
        }
        return immutablesortedmap;
    }

    public volatile NavigableMap descendingMap()
    {
        return descendingMap();
    }

    public ImmutableSet entrySet()
    {
        return super.entrySet();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public java.util.Map.Entry firstEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)entrySet().asList().get(0);
        }
    }

    public Object firstKey()
    {
        return keySet().first();
    }

    public java.util.Map.Entry floorEntry(Object obj)
    {
        return headMap(obj, true).lastEntry();
    }

    public Object floorKey(Object obj)
    {
        return Maps.a(floorEntry(obj));
    }

    public ImmutableSortedMap headMap(Object obj)
    {
        return headMap(obj, false);
    }

    public abstract ImmutableSortedMap headMap(Object obj, boolean flag);

    public volatile NavigableMap headMap(Object obj, boolean flag)
    {
        return headMap(obj, flag);
    }

    public volatile SortedMap headMap(Object obj)
    {
        return headMap(obj);
    }

    public java.util.Map.Entry higherEntry(Object obj)
    {
        return tailMap(obj, false).firstEntry();
    }

    public Object higherKey(Object obj)
    {
        return Maps.a(higherEntry(obj));
    }

    boolean isPartialView()
    {
        return keySet().isPartialView() || values().isPartialView();
    }

    public volatile ImmutableSet keySet()
    {
        return keySet();
    }

    public abstract ImmutableSortedSet keySet();

    public volatile Set keySet()
    {
        return keySet();
    }

    public java.util.Map.Entry lastEntry()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return (java.util.Map.Entry)entrySet().asList().get(size() - 1);
        }
    }

    public Object lastKey()
    {
        return keySet().last();
    }

    public java.util.Map.Entry lowerEntry(Object obj)
    {
        return headMap(obj, false).lastEntry();
    }

    public Object lowerKey(Object obj)
    {
        return Maps.a(lowerEntry(obj));
    }

    public ImmutableSortedSet navigableKeySet()
    {
        return keySet();
    }

    public volatile NavigableSet navigableKeySet()
    {
        return navigableKeySet();
    }

    public final java.util.Map.Entry pollFirstEntry()
    {
        throw new UnsupportedOperationException();
    }

    public final java.util.Map.Entry pollLastEntry()
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return values().size();
    }

    public ImmutableSortedMap subMap(Object obj, Object obj1)
    {
        return subMap(obj, true, obj1, false);
    }

    public ImmutableSortedMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        p.a(obj);
        p.a(obj1);
        boolean flag2;
        if (comparator().compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        p.a(flag2, "expected fromKey <= toKey but %s > %s", new Object[] {
            obj, obj1
        });
        return headMap(obj1, flag1).tailMap(obj, flag);
    }

    public volatile NavigableMap subMap(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return subMap(obj, flag, obj1, flag1);
    }

    public volatile SortedMap subMap(Object obj, Object obj1)
    {
        return subMap(obj, obj1);
    }

    public ImmutableSortedMap tailMap(Object obj)
    {
        return tailMap(obj, true);
    }

    public abstract ImmutableSortedMap tailMap(Object obj, boolean flag);

    public volatile NavigableMap tailMap(Object obj, boolean flag)
    {
        return tailMap(obj, flag);
    }

    public volatile SortedMap tailMap(Object obj)
    {
        return tailMap(obj);
    }

    public abstract ImmutableCollection values();

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }

    static 
    {
        a = Ordering.natural();
        b = new EmptyImmutableSortedMap(a);
    }

    private class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;
        private final Comparator comparator;

        Object readResolve()
        {
            return createMap(new bi(comparator));
        }

        SerializedForm()
        {
            comparator = ImmutableSortedMap.this.comparator();
        }
    }

}
