// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ae, ao, RegularImmutableBiMap, 
//            EmptyImmutableBiMap, SingletonImmutableBiMap, ImmutableCollection, ImmutableSet

public abstract class ImmutableBiMap extends ImmutableMap
    implements ae
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];

    ImmutableBiMap()
    {
    }

    public static ao builder()
    {
        return new ao();
    }

    public static ImmutableBiMap copyOf(Map map)
    {
        if (map instanceof ImmutableBiMap)
        {
            ImmutableBiMap immutablebimap = (ImmutableBiMap)map;
            if (!immutablebimap.isPartialView())
            {
                return immutablebimap;
            }
        }
        map = (java.util.Map.Entry[])map.entrySet().toArray(a);
        switch (map.length)
        {
        default:
            return new RegularImmutableBiMap(map);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            map = map[0];
            break;
        }
        return of(map.getKey(), map.getValue());
    }

    public static ImmutableBiMap of()
    {
        return EmptyImmutableBiMap.INSTANCE;
    }

    public static ImmutableBiMap of(Object obj, Object obj1)
    {
        return new SingletonImmutableBiMap(obj, obj1);
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableBiMap(new ImmutableMapEntry.TerminalEntry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    public Object forcePut(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableBiMap inverse();

    public volatile ae inverse()
    {
        return inverse();
    }

    public volatile ImmutableCollection values()
    {
        return values();
    }

    public ImmutableSet values()
    {
        return inverse().keySet();
    }

    public volatile Collection values()
    {
        return values();
    }

    public volatile Set values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }


    private class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;

        Object readResolve()
        {
            return createMap(new ao());
        }

        SerializedForm()
        {
        }
    }

}
