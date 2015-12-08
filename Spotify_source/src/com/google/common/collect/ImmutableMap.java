// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuj;
import cur;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableMap, ImmutableSortedMap, ImmutableEnumMap, ImmutableBiMap, 
//            ImmutableMapKeySet, ImmutableCollection, Maps, ImmutableMapValues, 
//            ImmutableSet

public abstract class ImmutableMap
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient ImmutableSet b;
    private transient ImmutableSet c;
    private transient ImmutableCollection d;

    ImmutableMap()
    {
    }

    public static ImmutableMap a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            c(obj, obj1), c(obj2, obj3), c(obj4, obj5)
        });
    }

    public static ImmutableMap a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableMap(new ImmutableMapEntry.TerminalEntry[] {
            c(obj, obj1), c(obj2, obj3), c(obj4, obj5), c(obj6, obj7), c(obj8, obj9)
        });
    }

    public static ImmutableMap a(Map map)
    {
        if ((map instanceof ImmutableMap) && !(map instanceof ImmutableSortedMap))
        {
            ImmutableMap immutablemap = (ImmutableMap)map;
            if (!immutablemap.e())
            {
                return immutablemap;
            }
        } else
        if (map instanceof EnumMap)
        {
            map = new EnumMap((EnumMap)map);
            java.util.Map.Entry entry;
            for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); cuj.a(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            return ImmutableEnumMap.a(map);
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new RegularImmutableMap(map);

        case 0: // '\0'
            return ImmutableBiMap.g();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return ImmutableBiMap.a(map.getKey(), map.getValue());
    }

    static void a(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
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

    public static ImmutableMap b(Object obj, Object obj1)
    {
        return ImmutableBiMap.a(obj, obj1);
    }

    public static ImmutableMapEntry.TerminalEntry c(Object obj, Object obj1)
    {
        cuj.a(obj, obj1);
        return new ImmutableMapEntry.TerminalEntry(obj, obj1);
    }

    public static ImmutableMap h()
    {
        return ImmutableBiMap.g();
    }

    public static cur i()
    {
        return new cur();
    }

    ImmutableSet a()
    {
        return new ImmutableMapKeySet(this);
    }

    public ImmutableSet b()
    {
        ImmutableSet immutableset1 = b;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = c();
            b = immutableset;
        }
        return immutableset;
    }

    abstract ImmutableSet c();

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
        return f().contains(obj);
    }

    public ImmutableSet d()
    {
        ImmutableSet immutableset1 = c;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = a();
            c = immutableset;
        }
        return immutableset;
    }

    abstract boolean e();

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return Maps.a(this, obj);
    }

    public ImmutableCollection f()
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

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return d();
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

    public Collection values()
    {
        return f();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object keys[];
        private final Object values[];

        final Object a(cur cur1)
        {
            for (int j = 0; j < keys.length; j++)
            {
                cur1.a(keys[j], values[j]);
            }

            return cur1.a();
        }

        Object readResolve()
        {
            return a(new cur());
        }

        SerializedForm()
        {
            keys = new Object[size()];
            values = new Object[size()];
            immutablemap = b().iterator();
            for (int j = 0; hasNext(); j++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)next();
                keys[j] = entry.getKey();
                values[j] = entry.getValue();
            }

        }
    }

}
