// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, BiMap, EmptyImmutableBiMap, SingletonImmutableBiMap, 
//            ImmutableSet, ImmutableCollection, RegularImmutableBiMap

public abstract class ImmutableBiMap extends ImmutableMap
    implements BiMap
{
    public static final class Builder extends ImmutableMap.Builder
    {

        public final ImmutableBiMap build()
        {
            switch (size)
            {
            default:
                return new RegularImmutableBiMap(size, entries);

            case 0: // '\0'
                return ImmutableBiMap.of();

            case 1: // '\001'
                return ImmutableBiMap.of(entries[0].getKey(), entries[0].getValue());
            }
        }

        public final volatile ImmutableMap build()
        {
            return build();
        }

        public final Builder put(Object obj, Object obj1)
        {
            super.put(obj, obj1);
            return this;
        }

        public final volatile ImmutableMap.Builder put(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Builder()
        {
        }
    }


    private static final java.util.Map.Entry EMPTY_ENTRY_ARRAY[] = new java.util.Map.Entry[0];

    ImmutableBiMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableBiMap of()
    {
        return EmptyImmutableBiMap.INSTANCE;
    }

    public static ImmutableBiMap of(Object obj, Object obj1)
    {
        return new SingletonImmutableBiMap(obj, obj1);
    }

    private ImmutableSet values()
    {
        return inverse().keySet();
    }

    public abstract ImmutableBiMap inverse();

    public final volatile ImmutableCollection values()
    {
        return values();
    }

    public volatile Collection values()
    {
        return values();
    }

}
