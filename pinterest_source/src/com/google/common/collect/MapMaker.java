// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            GenericMapMaker, MapMakerInternalMap

public final class MapMaker extends GenericMapMaker
{

    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = -1;
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

    private void checkExpiration(long l, TimeUnit timeunit)
    {
        boolean flag;
        if (expireAfterWriteNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(expireAfterWriteNanos)
        });
        if (expireAfterAccessNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(expireAfterAccessNanos)
        });
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l), timeunit
        });
    }

    public final volatile GenericMapMaker concurrencyLevel(int i)
    {
        return concurrencyLevel(i);
    }

    public final MapMaker concurrencyLevel(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (concurrencyLevel == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "concurrency level was already set to %s", new Object[] {
            Integer.valueOf(concurrencyLevel)
        });
        if (i > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        concurrencyLevel = i;
        return this;
    }

    final volatile GenericMapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        return expireAfterAccess(l, timeunit);
    }

    final MapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterAccessNanos = timeunit.toNanos(l);
        if (l == 0L && nullRemovalCause == null)
        {
            nullRemovalCause = RemovalCause.EXPIRED;
        }
        useCustomMap = true;
        return this;
    }

    final volatile GenericMapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        return expireAfterWrite(l, timeunit);
    }

    final MapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterWriteNanos = timeunit.toNanos(l);
        if (l == 0L && nullRemovalCause == null)
        {
            nullRemovalCause = RemovalCause.EXPIRED;
        }
        useCustomMap = true;
        return this;
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
        return (Equivalence)MoreObjects.firstNonNull(keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    final MapMakerInternalMap.Strength getKeyStrength()
    {
        return (MapMakerInternalMap.Strength)MoreObjects.firstNonNull(keyStrength, MapMakerInternalMap.Strength.STRONG);
    }

    final Ticker getTicker()
    {
        return (Ticker)MoreObjects.firstNonNull(ticker, Ticker.systemTicker());
    }

    final MapMakerInternalMap.Strength getValueStrength()
    {
        return (MapMakerInternalMap.Strength)MoreObjects.firstNonNull(valueStrength, MapMakerInternalMap.Strength.STRONG);
    }

    public final volatile GenericMapMaker initialCapacity(int i)
    {
        return initialCapacity(i);
    }

    public final MapMaker initialCapacity(int i)
    {
        boolean flag1 = true;
        boolean flag;
        if (initialCapacity == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "initial capacity was already set to %s", new Object[] {
            Integer.valueOf(initialCapacity)
        });
        if (i >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        initialCapacity = i;
        return this;
    }

    final volatile GenericMapMaker keyEquivalence(Equivalence equivalence)
    {
        return keyEquivalence(equivalence);
    }

    final MapMaker keyEquivalence(Equivalence equivalence)
    {
        boolean flag;
        if (keyEquivalence == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "key equivalence was already set to %s", new Object[] {
            keyEquivalence
        });
        keyEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        useCustomMap = true;
        return this;
    }

    final ConcurrentMap makeComputingMap(Function function)
    {
        if (nullRemovalCause == null)
        {
            function = new ComputingMapAdapter(function);
        } else
        {
            function = new NullComputingConcurrentMap(function);
        }
        return (ConcurrentMap)function;
    }

    final MapMakerInternalMap makeCustomMap()
    {
        return new MapMakerInternalMap(this);
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
            obj = new NullConcurrentMap();
        }
        return (ConcurrentMap)obj;
    }

    final volatile GenericMapMaker maximumSize(int i)
    {
        return maximumSize(i);
    }

    final MapMaker maximumSize(int i)
    {
        boolean flag1 = false;
        boolean flag;
        if (maximumSize == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Integer.valueOf(maximumSize)
        });
        flag = flag1;
        if (i >= 0)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "maximum size must not be negative");
        maximumSize = i;
        useCustomMap = true;
        if (maximumSize == 0)
        {
            nullRemovalCause = RemovalCause.SIZE;
        }
        return this;
    }

    final GenericMapMaker removalListener(RemovalListener removallistener)
    {
        boolean flag;
        if (removalListener == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        super.removalListener = (RemovalListener)Preconditions.checkNotNull(removallistener);
        useCustomMap = true;
        return this;
    }

    final MapMaker setKeyStrength(MapMakerInternalMap.Strength strength)
    {
        boolean flag1 = false;
        boolean flag;
        if (keyStrength == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Key strength was already set to %s", new Object[] {
            keyStrength
        });
        keyStrength = (MapMakerInternalMap.Strength)Preconditions.checkNotNull(strength);
        flag = flag1;
        if (keyStrength != MapMakerInternalMap.Strength.SOFT)
        {
            flag = true;
        }
        Preconditions.checkArgument(flag, "Soft keys are not supported");
        if (strength != MapMakerInternalMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    final MapMaker setValueStrength(MapMakerInternalMap.Strength strength)
    {
        boolean flag;
        if (valueStrength == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Value strength was already set to %s", new Object[] {
            valueStrength
        });
        valueStrength = (MapMakerInternalMap.Strength)Preconditions.checkNotNull(strength);
        if (strength != MapMakerInternalMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    public final volatile GenericMapMaker softValues()
    {
        return softValues();
    }

    public final MapMaker softValues()
    {
        return setValueStrength(MapMakerInternalMap.Strength.SOFT);
    }

    public final String toString()
    {
        com.google.common.base.MoreObjects.ToStringHelper tostringhelper = MoreObjects.toStringHelper(this);
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
            long l = expireAfterWriteNanos;
            tostringhelper.add("expireAfterWrite", (new StringBuilder(22)).append(l).append("ns").toString());
        }
        if (expireAfterAccessNanos != -1L)
        {
            long l1 = expireAfterAccessNanos;
            tostringhelper.add("expireAfterAccess", (new StringBuilder(22)).append(l1).append("ns").toString());
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

    public final volatile GenericMapMaker weakKeys()
    {
        return weakKeys();
    }

    public final MapMaker weakKeys()
    {
        return setKeyStrength(MapMakerInternalMap.Strength.WEAK);
    }

    public final volatile GenericMapMaker weakValues()
    {
        return weakValues();
    }

    public final MapMaker weakValues()
    {
        return setValueStrength(MapMakerInternalMap.Strength.WEAK);
    }

    /* member class not found */
    class RemovalCause {}


    /* member class not found */
    class ComputingMapAdapter {}


    /* member class not found */
    class NullComputingConcurrentMap {}


    /* member class not found */
    class NullConcurrentMap {}


    /* member class not found */
    class RemovalListener {}

}
