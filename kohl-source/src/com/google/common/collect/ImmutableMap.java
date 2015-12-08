// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedMap, SingletonImmutableMap, RegularImmutableMap, Maps, 
//            EmptyImmutableMap, ImmutableSet, ImmutableCollection, Lists, 
//            Iterables

public abstract class ImmutableMap
    implements Map, Serializable
{
    public static class Builder
    {

        final ArrayList entries = Lists.newArrayList();

        private static ImmutableMap fromEntryList(List list)
        {
            switch (list.size())
            {
            default:
                return new RegularImmutableMap((java.util.Map.Entry[])list.toArray(new java.util.Map.Entry[list.size()]));

            case 0: // '\0'
                return ImmutableMap.of();

            case 1: // '\001'
                return new SingletonImmutableMap((java.util.Map.Entry)Iterables.getOnlyElement(list));
            }
        }

        public ImmutableMap build()
        {
            return fromEntryList(entries);
        }

        public Builder put(Object obj, Object obj1)
        {
            entries.add(ImmutableMap.entryOf(obj, obj1));
            return this;
        }

        public Builder putAll(Map map)
        {
            entries.ensureCapacity(entries.size() + map.size());
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            return this;
        }

        public Builder()
        {
        }
    }

    static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object keys[];
        private final Object values[];

        Object createMap(Builder builder1)
        {
            for (int i = 0; i < keys.length; i++)
            {
                builder1.put(keys[i], values[i]);
            }

            return builder1.build();
        }

        Object readResolve()
        {
            return createMap(new Builder());
        }

        SerializedForm(ImmutableMap immutablemap)
        {
            keys = new Object[immutablemap.size()];
            values = new Object[immutablemap.size()];
            int i = 0;
            for (immutablemap = immutablemap.entrySet().iterator(); immutablemap.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)immutablemap.next();
                keys[i] = entry.getKey();
                values[i] = entry.getValue();
                i++;
            }

        }
    }


    ImmutableMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
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
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(new java.util.Map.Entry[0]);
        switch (map.length)
        {
        default:
            for (int i = 0; i < map.length; i++)
            {
                map[i] = entryOf(map[i].getKey(), map[i].getValue());
            }

            break;

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableMap(entryOf(map[0].getKey(), map[0].getValue()));
        }
        return new RegularImmutableMap(map);
    }

    static java.util.Map.Entry entryOf(Object obj, Object obj1)
    {
        return Maps.immutableEntry(Preconditions.checkNotNull(obj, "null key"), Preconditions.checkNotNull(obj1, "null value"));
    }

    public static ImmutableMap of()
    {
        return EmptyImmutableMap.INSTANCE;
    }

    public static ImmutableMap of(Object obj, Object obj1)
    {
        return new SingletonImmutableMap(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1));
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public abstract boolean containsValue(Object obj);

    public abstract ImmutableSet entrySet();

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
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

    public abstract ImmutableSet keySet();

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

    public abstract ImmutableCollection values();

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }
}
