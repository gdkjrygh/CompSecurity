// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            GenericMapMaker, MapMakerInternalMap, ImmutableEntry

public final class MapMaker extends GenericMapMaker
{
    static final class NullConcurrentMap extends AbstractMap
        implements Serializable, ConcurrentMap
    {

        private final RemovalCause removalCause;
        private final RemovalListener removalListener;

        private void notifyRemoval(Object obj, Object obj1)
        {
            new RemovalNotification(obj, obj1, removalCause);
            obj = removalListener;
        }

        public final boolean containsKey(Object obj)
        {
            return false;
        }

        public final boolean containsValue(Object obj)
        {
            return false;
        }

        public final Set entrySet()
        {
            return Collections.emptySet();
        }

        public final Object get(Object obj)
        {
            return null;
        }

        public final Object put(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            notifyRemoval(obj, obj1);
            return null;
        }

        public final Object putIfAbsent(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public final Object remove(Object obj)
        {
            return null;
        }

        public final boolean remove(Object obj, Object obj1)
        {
            return false;
        }

        public final Object replace(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            return null;
        }

        public final boolean replace(Object obj, Object obj1, Object obj2)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj2);
            return false;
        }

        NullConcurrentMap(MapMaker mapmaker)
        {
            removalListener = mapmaker.getRemovalListener();
            removalCause = mapmaker.nullRemovalCause;
        }
    }

    static abstract class RemovalCause extends Enum
    {

        private static final RemovalCause $VALUES[];
        public static final RemovalCause COLLECTED;
        public static final RemovalCause EXPIRED;
        public static final RemovalCause EXPLICIT;
        public static final RemovalCause REPLACED;
        public static final RemovalCause SIZE;

        public static RemovalCause valueOf(String s)
        {
            return (RemovalCause)Enum.valueOf(com/google/common/collect/MapMaker$RemovalCause, s);
        }

        public static RemovalCause[] values()
        {
            return (RemovalCause[])$VALUES.clone();
        }

        static 
        {
            EXPLICIT = new RemovalCause("EXPLICIT", 0) {

            };
            REPLACED = new RemovalCause("REPLACED", 1) {

            };
            COLLECTED = new RemovalCause("COLLECTED", 2) {

            };
            EXPIRED = new RemovalCause("EXPIRED", 3) {

            };
            SIZE = new RemovalCause("SIZE", 4) {

            };
            $VALUES = (new RemovalCause[] {
                EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
            });
        }

        private RemovalCause(String s, int i)
        {
            super(s, i);
        }

    }

    static interface RemovalListener
    {
    }

    static final class RemovalNotification extends ImmutableEntry
    {

        private final RemovalCause cause;

        RemovalNotification(Object obj, Object obj1, RemovalCause removalcause)
        {
            super(obj, obj1);
            cause = removalcause;
        }
    }


    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    MapMakerInternalMap.Strength keyStrength;
    int maximumSize;
    RemovalCause nullRemovalCause;
    Ticker ticker;
    boolean useCustomMap;
    MapMakerInternalMap.Strength valueStrength;

    public MapMaker()
    {
        initialCapacity = -1;
        concurrencyLevel = -1;
        maximumSize = -1;
        expireAfterWriteNanos = -1L;
        expireAfterAccessNanos = -1L;
    }

    final int getConcurrencyLevel()
    {
        if (concurrencyLevel == -1)
        {
            return 4;
        } else
        {
            return concurrencyLevel;
        }
    }

    final long getExpireAfterAccessNanos()
    {
        if (expireAfterAccessNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterAccessNanos;
        }
    }

    final long getExpireAfterWriteNanos()
    {
        if (expireAfterWriteNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterWriteNanos;
        }
    }

    final int getInitialCapacity()
    {
        if (initialCapacity == -1)
        {
            return 16;
        } else
        {
            return initialCapacity;
        }
    }

    final Equivalence getKeyEquivalence()
    {
        return (Equivalence)Objects.firstNonNull(keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    final MapMakerInternalMap.Strength getKeyStrength()
    {
        return (MapMakerInternalMap.Strength)Objects.firstNonNull(keyStrength, MapMakerInternalMap.Strength.STRONG);
    }

    final Ticker getTicker()
    {
        return (Ticker)Objects.firstNonNull(ticker, Ticker.systemTicker());
    }

    final MapMakerInternalMap.Strength getValueStrength()
    {
        return (MapMakerInternalMap.Strength)Objects.firstNonNull(valueStrength, MapMakerInternalMap.Strength.STRONG);
    }

    public final ConcurrentMap makeMap()
    {
        if (!useCustomMap)
        {
            return new ConcurrentHashMap(getInitialCapacity(), 0.75F, getConcurrencyLevel());
        }
        Object obj;
        if (nullRemovalCause == null)
        {
            obj = new MapMakerInternalMap(this);
        } else
        {
            obj = new NullConcurrentMap(this);
        }
        return (ConcurrentMap)obj;
    }

    public final String toString()
    {
        com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (initialCapacity != -1)
        {
            tostringhelper.add("initialCapacity", initialCapacity);
        }
        if (concurrencyLevel != -1)
        {
            tostringhelper.add("concurrencyLevel", concurrencyLevel);
        }
        if (maximumSize != -1)
        {
            tostringhelper.add("maximumSize", maximumSize);
        }
        if (expireAfterWriteNanos != -1L)
        {
            tostringhelper.add("expireAfterWrite", (new StringBuilder()).append(expireAfterWriteNanos).append("ns").toString());
        }
        if (expireAfterAccessNanos != -1L)
        {
            tostringhelper.add("expireAfterAccess", (new StringBuilder()).append(expireAfterAccessNanos).append("ns").toString());
        }
        if (keyStrength != null)
        {
            tostringhelper.add("keyStrength", Ascii.toLowerCase(keyStrength.toString()));
        }
        if (valueStrength != null)
        {
            tostringhelper.add("valueStrength", Ascii.toLowerCase(valueStrength.toString()));
        }
        if (keyEquivalence != null)
        {
            tostringhelper.addValue("keyEquivalence");
        }
        if (removalListener != null)
        {
            tostringhelper.addValue("removalListener");
        }
        return tostringhelper.toString();
    }
}
