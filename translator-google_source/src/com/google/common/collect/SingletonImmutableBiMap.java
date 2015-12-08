// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableBiMap, af, Maps, ImmutableSet, 
//            ae

final class SingletonImmutableBiMap extends ImmutableBiMap
{

    transient ImmutableBiMap inverse;
    final transient Object singleKey;
    final transient Object singleValue;

    SingletonImmutableBiMap(Object obj, Object obj1)
    {
        af.a(obj, obj1);
        singleKey = obj;
        singleValue = obj1;
    }

    private SingletonImmutableBiMap(Object obj, Object obj1, ImmutableBiMap immutablebimap)
    {
        singleKey = obj;
        singleValue = obj1;
        inverse = immutablebimap;
    }

    SingletonImmutableBiMap(java.util.Map.Entry entry)
    {
        this(entry.getKey(), entry.getValue());
    }

    public final boolean containsKey(Object obj)
    {
        return singleKey.equals(obj);
    }

    public final boolean containsValue(Object obj)
    {
        return singleValue.equals(obj);
    }

    final ImmutableSet createEntrySet()
    {
        return ImmutableSet.of(Maps.a(singleKey, singleValue));
    }

    final ImmutableSet createKeySet()
    {
        return ImmutableSet.of(singleKey);
    }

    public final Object get(Object obj)
    {
        if (singleKey.equals(obj))
        {
            return singleValue;
        } else
        {
            return null;
        }
    }

    public final ImmutableBiMap inverse()
    {
        ImmutableBiMap immutablebimap = inverse;
        Object obj = immutablebimap;
        if (immutablebimap == null)
        {
            obj = new SingletonImmutableBiMap(singleValue, singleKey, this);
            inverse = ((ImmutableBiMap) (obj));
        }
        return ((ImmutableBiMap) (obj));
    }

    public final volatile ae inverse()
    {
        return inverse();
    }

    final boolean isPartialView()
    {
        return false;
    }

    public final int size()
    {
        return 1;
    }
}
