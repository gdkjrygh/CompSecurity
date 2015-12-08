// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, BiMap, RegularImmutableBiMap, ImmutableSet, 
//            ImmutableCollection

public abstract class ImmutableBiMap extends ImmutableMap
    implements BiMap
{
    public static final class Builder extends ImmutableMap.Builder
    {

        public ImmutableBiMap build()
        {
            ImmutableMap immutablemap = super.build();
            if (immutablemap.isEmpty())
            {
                return ImmutableBiMap.of();
            } else
            {
                return new RegularImmutableBiMap(immutablemap);
            }
        }

        public volatile ImmutableMap build()
        {
            return build();
        }

        public Builder put(Object obj, Object obj1)
        {
            super.put(obj, obj1);
            return this;
        }

        public volatile ImmutableMap.Builder put(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Builder putAll(Map map)
        {
            super.putAll(map);
            return this;
        }

        public volatile ImmutableMap.Builder putAll(Map map)
        {
            return putAll(map);
        }

        public Builder()
        {
        }
    }

    static class EmptyBiMap extends ImmutableBiMap
    {

        ImmutableMap _mthdelegate()
        {
            return ImmutableMap.of();
        }

        public volatile Set entrySet()
        {
            return entrySet();
        }

        public volatile BiMap inverse()
        {
            return inverse();
        }

        public ImmutableBiMap inverse()
        {
            return this;
        }

        boolean isPartialView()
        {
            return false;
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        Object readResolve()
        {
            return ImmutableBiMap.EMPTY_IMMUTABLE_BIMAP;
        }

        public volatile ImmutableCollection values()
        {
            return values();
        }

        public volatile Collection values()
        {
            return values();
        }

        public volatile Set values()
        {
            return values();
        }

        EmptyBiMap()
        {
        }
    }

    private static class SerializedForm extends ImmutableMap.SerializedForm
    {

        private static final long serialVersionUID = 0L;

        Object readResolve()
        {
            return createMap(new Builder());
        }

        SerializedForm(ImmutableBiMap immutablebimap)
        {
            super(immutablebimap);
        }
    }


    private static final ImmutableBiMap EMPTY_IMMUTABLE_BIMAP = new EmptyBiMap();

    ImmutableBiMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
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
        if (map.isEmpty())
        {
            return of();
        } else
        {
            return new RegularImmutableBiMap(ImmutableMap.copyOf(map));
        }
    }

    public static ImmutableBiMap of()
    {
        return EMPTY_IMMUTABLE_BIMAP;
    }

    public static ImmutableBiMap of(Object obj, Object obj1)
    {
        return new RegularImmutableBiMap(ImmutableMap.of(obj, obj1));
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableBiMap(ImmutableMap.of(obj, obj1, obj2, obj3));
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableBiMap(ImmutableMap.of(obj, obj1, obj2, obj3, obj4, obj5));
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableBiMap(ImmutableMap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7));
    }

    public static ImmutableBiMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableBiMap(ImmutableMap.of(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9));
    }

    public boolean containsKey(Object obj)
    {
        return _mthdelegate().containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return inverse().containsKey(obj);
    }

    abstract ImmutableMap _mthdelegate();

    public ImmutableSet entrySet()
    {
        return _mthdelegate().entrySet();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return obj == this || _mthdelegate().equals(obj);
    }

    public Object forcePut(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Object get(Object obj)
    {
        return _mthdelegate().get(obj);
    }

    public int hashCode()
    {
        return _mthdelegate().hashCode();
    }

    public volatile BiMap inverse()
    {
        return inverse();
    }

    public abstract ImmutableBiMap inverse();

    public boolean isEmpty()
    {
        return _mthdelegate().isEmpty();
    }

    public ImmutableSet keySet()
    {
        return _mthdelegate().keySet();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public int size()
    {
        return _mthdelegate().size();
    }

    public String toString()
    {
        return _mthdelegate().toString();
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
        return new SerializedForm(this);
    }


}
