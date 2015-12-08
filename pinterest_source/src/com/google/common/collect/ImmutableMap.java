// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, RegularImmutableMap, CollectPreconditions, ImmutableEnumMap, 
//            ImmutableSetMultimap, ImmutableBiMap, ImmutableCollection, ImmutableMapKeySet, 
//            Maps, ImmutableSet, ImmutableMapValues

public abstract class ImmutableMap
    implements Serializable, Map
{

    private static final java.util.Map.Entry EMPTY_ENTRY_ARRAY[] = new java.util.Map.Entry[0];
    private transient ImmutableSet entrySet;
    private transient ImmutableSet keySet;
    private transient ImmutableSetMultimap multimapView;
    private transient ImmutableCollection values;

    ImmutableMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static void checkNoConflict(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            s = String.valueOf(String.valueOf(s));
            entry = String.valueOf(String.valueOf(entry));
            entry1 = String.valueOf(String.valueOf(entry1));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 34 + entry.length() + entry1.length())).append("Multiple entries with same ").append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    public static ImmutableMap copyOf(Map map)
    {
        if ((map instanceof ImmutableMap) && !(map instanceof ImmutableSortedMap))
        {
            ImmutableMap immutablemap = (ImmutableMap)map;
            if (!immutablemap.isPartialView())
            {
                return immutablemap;
            }
        } else
        if (map instanceof EnumMap)
        {
            return copyOfEnumMapUnsafe(map);
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(EMPTY_ENTRY_ARRAY);
        switch (map.length)
        {
        default:
            return new RegularImmutableMap(map);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return of(map.getKey(), map.getValue());
    }

    private static ImmutableMap copyOfEnumMap(Map map)
    {
        map = new EnumMap(map);
        java.util.Map.Entry entry;
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); CollectPreconditions.checkEntryNotNull(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return ImmutableEnumMap.asImmutable(map);
    }

    private static ImmutableMap copyOfEnumMapUnsafe(Map map)
    {
        return copyOfEnumMap((EnumMap)map);
    }

    private ImmutableSetMultimap createMultimapView()
    {
        ImmutableMap immutablemap = viewMapValuesAsSingletonSets();
        return new ImmutableSetMultimap(immutablemap, immutablemap.size(), null);
    }

    static ImmutableMapEntry.TerminalEntry entryOf(Object obj, Object obj1)
    {
        CollectPreconditions.checkEntryNotNull(obj, obj1);
        return new ImmutableMapEntry.TerminalEntry(obj, obj1);
    }

    public static ImmutableMap of()
    {
        return ImmutableBiMap.of();
    }

    public static ImmutableMap of(Object obj, Object obj1)
    {
        return ImmutableBiMap.of(obj, obj1);
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    private ImmutableMap viewMapValuesAsSingletonSets()
    {
        return new MapViewOfValuesAsSingletonSets();
    }

    public ImmutableSetMultimap asMultimap()
    {
        ImmutableSetMultimap immutablesetmultimap1 = multimapView;
        ImmutableSetMultimap immutablesetmultimap = immutablesetmultimap1;
        if (immutablesetmultimap1 == null)
        {
            immutablesetmultimap = createMultimapView();
            multimapView = immutablesetmultimap;
        }
        return immutablesetmultimap;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    abstract ImmutableSet createEntrySet();

    ImmutableSet createKeySet()
    {
        return new ImmutableMapKeySet(this);
    }

    public ImmutableSet entrySet()
    {
        ImmutableSet immutableset1 = entrySet;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createEntrySet();
            entrySet = immutableset;
        }
        return immutableset;
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return Maps.equalsImpl(this, obj);
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return entrySet().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    abstract boolean isPartialView();

    public ImmutableSet keySet()
    {
        ImmutableSet immutableset1 = keySet;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createKeySet();
            keySet = immutableset;
        }
        return immutableset;
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return Maps.toStringImpl(this);
    }

    public ImmutableCollection values()
    {
        ImmutableCollection immutablecollection = values;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new ImmutableMapValues(this);
            values = ((ImmutableCollection) (obj));
        }
        return ((ImmutableCollection) (obj));
    }

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }


    /* member class not found */
    class Builder {}


    /* member class not found */
    class MapViewOfValuesAsSingletonSets {}


    /* member class not found */
    class SerializedForm {}

}
