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
//            aw, ImmutableSortedMap, af, ImmutableEnumMap, 
//            RegularImmutableMap, ImmutableBiMap, ImmutableSetMultimap, ImmutableCollection, 
//            ImmutableMapKeySet, Maps, ImmutableSet, ImmutableMapValues

public abstract class ImmutableMap
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient ImmutableSet b;
    private transient ImmutableSet c;
    private transient ImmutableCollection d;
    private transient ImmutableSetMultimap e;

    ImmutableMap()
    {
    }

    public static aw builder()
    {
        return new aw();
    }

    static void checkNoConflict(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
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
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); af.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            return ImmutableEnumMap.asImmutable(map);
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
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

    static ImmutableMapEntry.TerminalEntry entryOf(Object obj, Object obj1)
    {
        af.a(obj, obj1);
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

    public ImmutableSetMultimap asMultimap()
    {
        ImmutableSetMultimap immutablesetmultimap = e;
        Object obj = immutablesetmultimap;
        if (immutablesetmultimap == null)
        {
            obj = new MapViewOfValuesAsSingletonSets();
            obj = new ImmutableSetMultimap(((ImmutableMap) (obj)), ((ImmutableMap) (obj)).size(), null);
            e = ((ImmutableSetMultimap) (obj));
        }
        return ((ImmutableSetMultimap) (obj));
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
        ImmutableSet immutableset1 = b;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createEntrySet();
            b = immutableset;
        }
        return immutableset;
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return Maps.f(this, obj);
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
        ImmutableSet immutableset1 = c;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createKeySet();
            c = immutableset;
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
        return Maps.a(this);
    }

    public ImmutableCollection values()
    {
        ImmutableCollection immutablecollection = d;
        Object obj = immutablecollection;
        if (immutablecollection == null)
        {
            obj = new ImmutableMapValues(this);
            d = ((ImmutableCollection) (obj));
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


    private class MapViewOfValuesAsSingletonSets extends ImmutableMap
    {

        private final ImmutableMap _flddelegate;

        public final boolean containsKey(Object obj)
        {
            return _flddelegate.containsKey(obj);
        }

        final ImmutableSet createEntrySet()
        {
            class _cls1 extends ImmutableMapEntrySet
            {

                final MapViewOfValuesAsSingletonSets this$0;

                public ej iterator()
                {
                    return new ax(this, _flddelegate.entrySet().iterator());
                }

                public volatile Iterator iterator()
                {
                    return iterator();
                }

                ImmutableMap map()
                {
                    return MapViewOfValuesAsSingletonSets.this;
                }

                _cls1()
                {
                    this$0 = MapViewOfValuesAsSingletonSets.this;
                    super();
                }
            }

            return new _cls1();
        }

        public final volatile Set entrySet()
        {
            return entrySet();
        }

        public final ImmutableSet get(Object obj)
        {
            obj = _flddelegate.get(obj);
            if (obj == null)
            {
                return null;
            } else
            {
                return ImmutableSet.of(obj);
            }
        }

        public final volatile Object get(Object obj)
        {
            return get(obj);
        }

        final boolean isPartialView()
        {
            return false;
        }

        public final volatile Set keySet()
        {
            return keySet();
        }

        public final int size()
        {
            return _flddelegate.size();
        }

        public final volatile Collection values()
        {
            return values();
        }


        MapViewOfValuesAsSingletonSets()
        {
            _flddelegate = (ImmutableMap)p.a(ImmutableMap.this);
        }
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object keys[];
        private final Object values[];

        Object createMap(aw aw1)
        {
            for (int i = 0; i < keys.length; i++)
            {
                aw1.a(keys[i], values[i]);
            }

            return aw1.a();
        }

        Object readResolve()
        {
            return createMap(new aw());
        }

        SerializedForm()
        {
            keys = new Object[size()];
            values = new Object[size()];
            immutablemap = entrySet().iterator();
            for (int i = 0; hasNext(); i++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)next();
                keys[i] = entry.getKey();
                values[i] = entry.getValue();
            }

        }
    }

}
