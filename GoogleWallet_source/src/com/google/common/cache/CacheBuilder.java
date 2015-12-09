// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.cache:
//            CacheStats, RemovalListener, Weigher, Cache, 
//            CacheLoader, LoadingCache

public final class CacheBuilder
{
    static final class NullListener extends Enum
        implements RemovalListener
    {

        private static final NullListener $VALUES[];
        public static final NullListener INSTANCE;

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/cache/CacheBuilder$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])$VALUES.clone();
        }

        static 
        {
            INSTANCE = new NullListener("INSTANCE", 0);
            $VALUES = (new NullListener[] {
                INSTANCE
            });
        }

        private NullListener(String s, int i)
        {
            super(s, i);
        }
    }

    static final class OneWeigher extends Enum
        implements Weigher
    {

        private static final OneWeigher $VALUES[];
        public static final OneWeigher INSTANCE;

        public static OneWeigher valueOf(String s)
        {
            return (OneWeigher)Enum.valueOf(com/google/common/cache/CacheBuilder$OneWeigher, s);
        }

        public static OneWeigher[] values()
        {
            return (OneWeigher[])$VALUES.clone();
        }

        public final int weigh(Object obj, Object obj1)
        {
            return 1;
        }

        static 
        {
            INSTANCE = new OneWeigher("INSTANCE", 0);
            $VALUES = (new OneWeigher[] {
                INSTANCE
            });
        }

        private OneWeigher(String s, int i)
        {
            super(s, i);
        }
    }


    static final Supplier CACHE_STATS_COUNTER = new Supplier() {

        private static AbstractCache.StatsCounter get()
        {
            return new AbstractCache.SimpleStatsCounter();
        }

        public final volatile Object get()
        {
            return get();
        }

    };
    static final CacheStats EMPTY_STATS = new CacheStats(0L, 0L, 0L, 0L, 0L, 0L);
    static final Supplier NULL_STATS_COUNTER = Suppliers.ofInstance(new AbstractCache.StatsCounter() {

        public final void recordEviction()
        {
        }

        public final void recordHits(int i)
        {
        }

        public final void recordLoadException(long l)
        {
        }

        public final void recordLoadSuccess(long l)
        {
        }

        public final void recordMisses(int i)
        {
        }

    });
    static final Ticker NULL_TICKER = new Ticker() {

        public final long read()
        {
            return 0L;
        }

    };
    private static final Logger logger = Logger.getLogger(com/google/common/cache/CacheBuilder.getName());
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    LocalCache.Strength keyStrength;
    long maximumSize;
    long maximumWeight;
    long refreshNanos;
    RemovalListener removalListener;
    Supplier statsCounterSupplier;
    boolean strictParsing;
    Ticker ticker;
    Equivalence valueEquivalence;
    LocalCache.Strength valueStrength;
    Weigher weigher;

    CacheBuilder()
    {
        strictParsing = true;
        initialCapacity = -1;
        concurrencyLevel = -1;
        maximumSize = -1L;
        maximumWeight = -1L;
        expireAfterWriteNanos = -1L;
        expireAfterAccessNanos = -1L;
        refreshNanos = -1L;
        statsCounterSupplier = NULL_STATS_COUNTER;
    }

    private void checkNonLoadingCache()
    {
        boolean flag;
        if (refreshNanos == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "refreshAfterWrite requires a LoadingCache");
    }

    private void checkWeightWithWeigher()
    {
        boolean flag2 = true;
        boolean flag = true;
        if (weigher == null)
        {
            if (maximumWeight != -1L)
            {
                flag = false;
            }
            Preconditions.checkState(flag, "maximumWeight requires weigher");
        } else
        {
            if (strictParsing)
            {
                boolean flag1;
                if (maximumWeight != -1L)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "weigher requires maximumWeight");
                return;
            }
            if (maximumWeight == -1L)
            {
                logger.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                return;
            }
        }
    }

    public static CacheBuilder newBuilder()
    {
        return new CacheBuilder();
    }

    public final Cache build()
    {
        checkWeightWithWeigher();
        checkNonLoadingCache();
        return new LocalCache.LocalManualCache(this);
    }

    public final LoadingCache build(CacheLoader cacheloader)
    {
        checkWeightWithWeigher();
        return new LocalCache.LocalLoadingCache(this, cacheloader);
    }

    public final CacheBuilder expireAfterWrite(long l, TimeUnit timeunit)
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
        expireAfterWriteNanos = timeunit.toNanos(l);
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
        return (Equivalence)Objects.firstNonNull(keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    final LocalCache.Strength getKeyStrength()
    {
        return (LocalCache.Strength)Objects.firstNonNull(keyStrength, LocalCache.Strength.STRONG);
    }

    final long getMaximumWeight()
    {
        if (expireAfterWriteNanos == 0L || expireAfterAccessNanos == 0L)
        {
            return 0L;
        }
        if (weigher == null)
        {
            return maximumSize;
        } else
        {
            return maximumWeight;
        }
    }

    final long getRefreshNanos()
    {
        if (refreshNanos == -1L)
        {
            return 0L;
        } else
        {
            return refreshNanos;
        }
    }

    final RemovalListener getRemovalListener()
    {
        return (RemovalListener)Objects.firstNonNull(removalListener, NullListener.INSTANCE);
    }

    final Supplier getStatsCounterSupplier()
    {
        return statsCounterSupplier;
    }

    final Ticker getTicker(boolean flag)
    {
        if (ticker != null)
        {
            return ticker;
        }
        if (flag)
        {
            return Ticker.systemTicker();
        } else
        {
            return NULL_TICKER;
        }
    }

    final Equivalence getValueEquivalence()
    {
        return (Equivalence)Objects.firstNonNull(valueEquivalence, getValueStrength().defaultEquivalence());
    }

    final LocalCache.Strength getValueStrength()
    {
        return (LocalCache.Strength)Objects.firstNonNull(valueStrength, LocalCache.Strength.STRONG);
    }

    final Weigher getWeigher()
    {
        return (Weigher)Objects.firstNonNull(weigher, OneWeigher.INSTANCE);
    }

    public final CacheBuilder maximumSize(long l)
    {
        boolean flag1 = true;
        boolean flag;
        if (maximumSize == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size was already set to %s", new Object[] {
            Long.valueOf(maximumSize)
        });
        if (maximumWeight == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum weight was already set to %s", new Object[] {
            Long.valueOf(maximumWeight)
        });
        if (weigher == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "maximum size can not be combined with weigher");
        if (l >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "maximum size must not be negative");
        maximumSize = l;
        return this;
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
        if (maximumSize != -1L)
        {
            tostringhelper.add("maximumSize", maximumSize);
        }
        if (maximumWeight != -1L)
        {
            tostringhelper.add("maximumWeight", maximumWeight);
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
        if (valueEquivalence != null)
        {
            tostringhelper.addValue("valueEquivalence");
        }
        if (removalListener != null)
        {
            tostringhelper.addValue("removalListener");
        }
        return tostringhelper.toString();
    }

}
