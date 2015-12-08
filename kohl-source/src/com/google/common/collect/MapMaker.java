// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            GenericMapMaker, MapEvictionListener, ComputingConcurrentHashMap, CustomConcurrentHashMap, 
//            ForwardingConcurrentMap, ComputationException

public final class MapMaker extends GenericMapMaker
{
    static interface Cache
        extends Function
    {

        public abstract ConcurrentMap asMap();
    }

    static class ComputingMapAdapter extends ForwardingConcurrentMap
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Cache cache;

        protected volatile Object _mthdelegate()
        {
            return _mthdelegate();
        }

        protected volatile Map _mthdelegate()
        {
            return _mthdelegate();
        }

        protected ConcurrentMap _mthdelegate()
        {
            return cache.asMap();
        }

        public Object get(Object obj)
        {
            return cache.apply(obj);
        }

        ComputingMapAdapter(Cache cache1)
        {
            cache = cache1;
        }
    }

    static final class NullComputingConcurrentMap extends NullConcurrentMap
        implements Cache
    {

        private static final long serialVersionUID = 0L;
        final Function computingFunction;

        private Object compute(Object obj)
        {
            Preconditions.checkNotNull(obj);
            try
            {
                obj = computingFunction.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ComputationException(((Throwable) (obj)));
            }
            return obj;
        }

        public Object apply(Object obj)
        {
            Object obj1 = compute(obj);
            Preconditions.checkNotNull(obj1, (new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString());
            evictionListener.onEviction(obj, obj1);
            return obj1;
        }

        public ConcurrentMap asMap()
        {
            return this;
        }

        NullComputingConcurrentMap(MapMaker mapmaker, Function function)
        {
            super(mapmaker);
            computingFunction = (Function)Preconditions.checkNotNull(function);
        }
    }

    static class NullConcurrentMap extends AbstractMap
        implements ConcurrentMap, Serializable
    {

        private static final long serialVersionUID = 0L;
        final MapEvictionListener evictionListener;

        public boolean containsKey(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return false;
        }

        public boolean containsValue(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return false;
        }

        public Set entrySet()
        {
            return Collections.emptySet();
        }

        public Object get(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return null;
        }

        public Object put(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            evictionListener.onEviction(obj, obj1);
            return null;
        }

        public Object putIfAbsent(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Object remove(Object obj)
        {
            Preconditions.checkNotNull(obj);
            return null;
        }

        public boolean remove(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            return false;
        }

        public Object replace(Object obj, Object obj1)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            return null;
        }

        public boolean replace(Object obj, Object obj1, Object obj2)
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj1);
            Preconditions.checkNotNull(obj2);
            return false;
        }

        NullConcurrentMap(MapMaker mapmaker)
        {
            evictionListener = mapmaker.getEvictionListener();
        }
    }

    static final class NullListener extends Enum
        implements MapEvictionListener
    {

        private static final NullListener $VALUES[];
        public static final NullListener INSTANCE;

        public static NullListener valueOf(String s)
        {
            return (NullListener)Enum.valueOf(com/google/common/collect/MapMaker$NullListener, s);
        }

        public static NullListener[] values()
        {
            return (NullListener[])$VALUES.clone();
        }

        public void onEviction(Object obj, Object obj1)
        {
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


    static final Executor DEFAULT_CLEANUP_EXECUTOR = new Executor() {

        public void execute(Runnable runnable)
        {
            runnable.run();
        }

    };
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final Ticker DEFAULT_TICKER = new Ticker() {

        public long read()
        {
            return System.nanoTime();
        }

    };
    static final int UNSET_INT = -1;
    Executor cleanupExecutor;
    int concurrencyLevel;
    long expireAfterAccessNanos;
    long expireAfterWriteNanos;
    int initialCapacity;
    Equivalence keyEquivalence;
    CustomConcurrentHashMap.Strength keyStrength;
    int maximumSize;
    Ticker ticker;
    boolean useCustomMap;
    boolean useNullMap;
    Equivalence valueEquivalence;
    CustomConcurrentHashMap.Strength valueStrength;

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

    public volatile GenericMapMaker concurrencyLevel(int i)
    {
        return concurrencyLevel(i);
    }

    public MapMaker concurrencyLevel(int i)
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

    public GenericMapMaker evictionListener(MapEvictionListener mapevictionlistener)
    {
        boolean flag;
        if (evictionListener == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        super.evictionListener = (MapEvictionListener)Preconditions.checkNotNull(mapevictionlistener);
        useCustomMap = true;
        return this;
    }

    public volatile GenericMapMaker expiration(long l, TimeUnit timeunit)
    {
        return expiration(l, timeunit);
    }

    public MapMaker expiration(long l, TimeUnit timeunit)
    {
        return expireAfterWrite(l, timeunit);
    }

    public volatile GenericMapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        return expireAfterAccess(l, timeunit);
    }

    public MapMaker expireAfterAccess(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterAccessNanos = timeunit.toNanos(l);
        boolean flag1 = useNullMap;
        boolean flag;
        if (l == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        useNullMap = flag | flag1;
        useCustomMap = true;
        return this;
    }

    public volatile GenericMapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        return expireAfterWrite(l, timeunit);
    }

    public MapMaker expireAfterWrite(long l, TimeUnit timeunit)
    {
        checkExpiration(l, timeunit);
        expireAfterWriteNanos = timeunit.toNanos(l);
        boolean flag1 = useNullMap;
        boolean flag;
        if (l == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        useNullMap = flag | flag1;
        useCustomMap = true;
        return this;
    }

    Executor getCleanupExecutor()
    {
        return (Executor)Objects.firstNonNull(cleanupExecutor, DEFAULT_CLEANUP_EXECUTOR);
    }

    int getConcurrencyLevel()
    {
        if (concurrencyLevel == -1)
        {
            return 4;
        } else
        {
            return concurrencyLevel;
        }
    }

    MapEvictionListener getEvictionListener()
    {
        if (evictionListener == null)
        {
            return NullListener.INSTANCE;
        } else
        {
            return evictionListener;
        }
    }

    long getExpireAfterAccessNanos()
    {
        if (expireAfterAccessNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterAccessNanos;
        }
    }

    long getExpireAfterWriteNanos()
    {
        if (expireAfterWriteNanos == -1L)
        {
            return 0L;
        } else
        {
            return expireAfterWriteNanos;
        }
    }

    int getInitialCapacity()
    {
        if (initialCapacity == -1)
        {
            return 16;
        } else
        {
            return initialCapacity;
        }
    }

    Equivalence getKeyEquivalence()
    {
        return (Equivalence)Objects.firstNonNull(keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    CustomConcurrentHashMap.Strength getKeyStrength()
    {
        return (CustomConcurrentHashMap.Strength)Objects.firstNonNull(keyStrength, CustomConcurrentHashMap.Strength.STRONG);
    }

    Ticker getTicker()
    {
        return (Ticker)Objects.firstNonNull(ticker, DEFAULT_TICKER);
    }

    Equivalence getValueEquivalence()
    {
        return (Equivalence)Objects.firstNonNull(valueEquivalence, getValueStrength().defaultEquivalence());
    }

    CustomConcurrentHashMap.Strength getValueStrength()
    {
        return (CustomConcurrentHashMap.Strength)Objects.firstNonNull(valueStrength, CustomConcurrentHashMap.Strength.STRONG);
    }

    public volatile GenericMapMaker initialCapacity(int i)
    {
        return initialCapacity(i);
    }

    public MapMaker initialCapacity(int i)
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

    Cache makeCache(Function function)
    {
        if (useNullMap)
        {
            return new NullComputingConcurrentMap(this, function);
        } else
        {
            return new ComputingConcurrentHashMap(this, function);
        }
    }

    public ConcurrentMap makeComputingMap(Function function)
    {
        return new ComputingMapAdapter(makeCache(function));
    }

    public ConcurrentMap makeMap()
    {
        if (!useCustomMap)
        {
            return new ConcurrentHashMap(getInitialCapacity(), 0.75F, getConcurrencyLevel());
        }
        if (useNullMap)
        {
            return new NullConcurrentMap(this);
        } else
        {
            return new CustomConcurrentHashMap(this);
        }
    }

    public volatile GenericMapMaker maximumSize(int i)
    {
        return maximumSize(i);
    }

    public MapMaker maximumSize(int i)
    {
        boolean flag = true;
        boolean flag1;
        if (maximumSize == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "maximum size was already set to %s", new Object[] {
            Integer.valueOf(maximumSize)
        });
        if (i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "maximum size must not be negative");
        maximumSize = i;
        useCustomMap = true;
        flag1 = useNullMap;
        if (maximumSize == 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        useNullMap = flag1 | i;
        return this;
    }

    MapMaker privateKeyEquivalence(Equivalence equivalence)
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

    MapMaker privateValueEquivalence(Equivalence equivalence)
    {
        boolean flag;
        if (valueEquivalence == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "value equivalence was already set to %s", new Object[] {
            valueEquivalence
        });
        valueEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        useCustomMap = true;
        return this;
    }

    MapMaker setKeyStrength(CustomConcurrentHashMap.Strength strength)
    {
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
        keyStrength = (CustomConcurrentHashMap.Strength)Preconditions.checkNotNull(strength);
        if (strength != CustomConcurrentHashMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    MapMaker setValueStrength(CustomConcurrentHashMap.Strength strength)
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
        valueStrength = (CustomConcurrentHashMap.Strength)Preconditions.checkNotNull(strength);
        if (strength != CustomConcurrentHashMap.Strength.STRONG)
        {
            useCustomMap = true;
        }
        return this;
    }

    public volatile GenericMapMaker softKeys()
    {
        return softKeys();
    }

    public MapMaker softKeys()
    {
        return setKeyStrength(CustomConcurrentHashMap.Strength.SOFT);
    }

    public volatile GenericMapMaker softValues()
    {
        return softValues();
    }

    public MapMaker softValues()
    {
        return setValueStrength(CustomConcurrentHashMap.Strength.SOFT);
    }

    public String toString()
    {
        com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
        if (initialCapacity != -1)
        {
            tostringhelper.add("initialCapacity", Integer.valueOf(initialCapacity));
        }
        if (concurrencyLevel != -1)
        {
            tostringhelper.add("concurrencyLevel", Integer.valueOf(concurrencyLevel));
        }
        if (maximumSize != -1)
        {
            tostringhelper.add("maximumSize", Integer.valueOf(maximumSize));
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
        if (evictionListener != null)
        {
            tostringhelper.addValue("evictionListener");
        }
        if (cleanupExecutor != null)
        {
            tostringhelper.addValue("cleanupExecutor");
        }
        return tostringhelper.toString();
    }

    public volatile GenericMapMaker weakKeys()
    {
        return weakKeys();
    }

    public MapMaker weakKeys()
    {
        return setKeyStrength(CustomConcurrentHashMap.Strength.WEAK);
    }

    public volatile GenericMapMaker weakValues()
    {
        return weakValues();
    }

    public MapMaker weakValues()
    {
        return setValueStrength(CustomConcurrentHashMap.Strength.WEAK);
    }

}
