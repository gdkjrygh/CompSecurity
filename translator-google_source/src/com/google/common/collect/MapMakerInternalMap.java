// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.h;
import com.google.common.base.p;
import com.google.common.base.u;
import com.google.common.c.a;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.collect:
//            bv, bw, MapMaker, cj, 
//            bz, cr, ci, bu, 
//            cs

class MapMakerInternalMap extends AbstractMap
    implements Serializable, ConcurrentMap
{

    static final long CLEANUP_EXECUTOR_DELAY_SECS = 60L;
    static final int CONTAINS_VALUE_RETRIES = 3;
    static final Queue DISCARDING_QUEUE = new bw();
    static final int DRAIN_MAX = 16;
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 0x40000000;
    static final int MAX_SEGMENTS = 0x10000;
    static final cr UNSET = new bv();
    private static final Logger a = Logger.getLogger(com/google/common/collect/MapMakerInternalMap.getName());
    private static final long serialVersionUID = 5L;
    final int concurrencyLevel;
    final transient EntryFactory entryFactory;
    transient Set entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence keyEquivalence;
    transient Set keySet;
    final Strength keyStrength;
    final int maximumSize;
    final bu removalListener;
    final Queue removalNotificationQueue;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment segments[];
    final u ticker;
    final Equivalence valueEquivalence;
    final Strength valueStrength;
    transient Collection values;

    MapMakerInternalMap(MapMaker mapmaker)
    {
        long l2 = 0L;
        int j1 = 1;
        boolean flag1 = false;
        boolean flag = false;
        super();
        concurrencyLevel = Math.min(mapmaker.c(), 0x10000);
        keyStrength = mapmaker.d();
        valueStrength = (Strength)h.a(mapmaker.g, Strength.STRONG);
        keyEquivalence = (Equivalence)h.a(mapmaker.k, mapmaker.d().defaultEquivalence());
        valueEquivalence = valueStrength.defaultEquivalence();
        maximumSize = mapmaker.e;
        Object obj;
        int i;
        int j;
        int k;
        long l1;
        if (mapmaker.i == -1L)
        {
            l1 = 0L;
        } else
        {
            l1 = mapmaker.i;
        }
        expireAfterAccessNanos = l1;
        if (mapmaker.h == -1L)
        {
            l1 = l2;
        } else
        {
            l1 = mapmaker.h;
        }
        expireAfterWriteNanos = l1;
        entryFactory = EntryFactory.getFactory(keyStrength, expires(), evictsBySize());
        ticker = (u)h.a(mapmaker.l, u.b());
        removalListener = mapmaker.a();
        if (removalListener == GenericMapMaker.NullListener.INSTANCE)
        {
            obj = discardingQueue();
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        removalNotificationQueue = ((Queue) (obj));
        i = Math.min(mapmaker.b(), 0x40000000);
        j = i;
        if (evictsBySize())
        {
            j = Math.min(i, maximumSize);
        }
        i = 1;
        k = 0;
        for (; i < concurrencyLevel && (!evictsBySize() || i << 1 <= maximumSize); i <<= 1)
        {
            k++;
        }

        segmentShift = 32 - k;
        segmentMask = i - 1;
        segments = newSegmentArray(i);
        k = j / i;
        if (k * i < j)
        {
            k++;
            j = j1;
        } else
        {
            j = j1;
        }
        for (; j < k; j <<= 1) { }
        k = ((flag1) ? 1 : 0);
        if (evictsBySize())
        {
            int i1 = maximumSize / i + 1;
            j1 = maximumSize;
            k = ((flag) ? 1 : 0);
            for (int l = i1; k < segments.length; l = i1)
            {
                i1 = l;
                if (k == j1 % i)
                {
                    i1 = l - 1;
                }
                segments[k] = createSegment(j, i1);
                k++;
            }

        } else
        {
            for (; k < segments.length; k++)
            {
                segments[k] = createSegment(j, -1);
            }

        }
    }

    static void connectEvictables(cj cj1, cj cj2)
    {
        cj1.setNextEvictable(cj2);
        cj2.setPreviousEvictable(cj1);
    }

    static void connectExpirables(cj cj1, cj cj2)
    {
        cj1.setNextExpirable(cj2);
        cj2.setPreviousExpirable(cj1);
    }

    static Queue discardingQueue()
    {
        return DISCARDING_QUEUE;
    }

    static cj nullEntry()
    {
        return NullEntry.INSTANCE;
    }

    static void nullifyEvictable(cj cj1)
    {
        cj cj2 = nullEntry();
        cj1.setNextEvictable(cj2);
        cj1.setPreviousEvictable(cj2);
    }

    static void nullifyExpirable(cj cj1)
    {
        cj cj2 = nullEntry();
        cj1.setNextExpirable(cj2);
        cj1.setPreviousExpirable(cj2);
    }

    static int rehash(int i)
    {
        i = (i << 15 ^ 0xffffcd7d) + i;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i ^ i >>> 16;
    }

    static cr unset()
    {
        return UNSET;
    }

    public void clear()
    {
        Segment asegment[] = segments;
        int j = asegment.length;
        for (int i = 0; i < j; i++)
        {
            asegment[i].clear();
        }

    }

    public boolean containsKey(Object obj)
    {
        if (obj == null)
        {
            return false;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).containsKey(obj, i);
        }
    }

    public boolean containsValue(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        Segment asegment[] = segments;
        int i = 0;
        long l2 = -1L;
        do
        {
            if (i >= 3)
            {
                break;
            }
            int i1 = asegment.length;
            long l1 = 0L;
            for (int j = 0; j < i1; j++)
            {
                Segment segment = asegment[j];
                int k = segment.count;
                AtomicReferenceArray atomicreferencearray = segment.table;
                for (int l = 0; l < atomicreferencearray.length(); l++)
                {
                    for (cj cj1 = (cj)atomicreferencearray.get(l); cj1 != null; cj1 = cj1.getNext())
                    {
                        Object obj1 = segment.getLiveValue(cj1);
                        if (obj1 != null && valueEquivalence.equivalent(obj, obj1))
                        {
                            return true;
                        }
                    }

                }

                l1 += segment.modCount;
            }

            if (l1 == l2)
            {
                break;
            }
            i++;
            l2 = l1;
        } while (true);
        return false;
    }

    cj copyEntry(cj cj1, cj cj2)
    {
        return segmentFor(cj1.getHash()).copyEntry(cj1, cj2);
    }

    Segment createSegment(int i, int j)
    {
        return new Segment(i, j);
    }

    public Set entrySet()
    {
        Set set = entrySet;
        if (set != null)
        {
            return set;
        } else
        {
            bz bz1 = new bz(this);
            entrySet = bz1;
            return bz1;
        }
    }

    boolean evictsBySize()
    {
        return maximumSize != -1;
    }

    boolean expires()
    {
        return expiresAfterWrite() || expiresAfterAccess();
    }

    boolean expiresAfterAccess()
    {
        return expireAfterAccessNanos > 0L;
    }

    boolean expiresAfterWrite()
    {
        return expireAfterWriteNanos > 0L;
    }

    public Object get(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).get(obj, i);
        }
    }

    cj getEntry(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).getEntry(obj, i);
        }
    }

    Object getLiveValue(cj cj1)
    {
        Object obj;
        if (cj1.getKey() != null)
        {
            if ((obj = cj1.getValueReference().get()) != null && (!expires() || !isExpired(cj1)))
            {
                return obj;
            }
        }
        return null;
    }

    int hash(Object obj)
    {
        return rehash(keyEquivalence.hash(obj));
    }

    public boolean isEmpty()
    {
        Segment asegment[];
        int i;
        long l;
        asegment = segments;
        i = 0;
        l = 0L;
_L9:
        if (i >= asegment.length) goto _L2; else goto _L1
_L1:
        if (asegment[i].count == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        l += asegment[i].modCount;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (l == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L6:
        if (i >= asegment.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (asegment[i].count != 0) goto _L3; else goto _L5
_L5:
        l -= asegment[i].modCount;
        i++;
          goto _L6
        if (l != 0L) goto _L3; else goto _L7
_L7:
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    boolean isExpired(cj cj1)
    {
        return isExpired(cj1, ticker.a());
    }

    boolean isExpired(cj cj1, long l)
    {
        return l - cj1.getExpirationTime() > 0L;
    }

    boolean isLive(cj cj1)
    {
        return segmentFor(cj1.getHash()).getLiveValue(cj1) != null;
    }

    public Set keySet()
    {
        Set set = keySet;
        if (set != null)
        {
            return set;
        } else
        {
            ci ci1 = new ci(this);
            keySet = ci1;
            return ci1;
        }
    }

    cj newEntry(Object obj, int i, cj cj1)
    {
        return segmentFor(i).newEntry(obj, i, cj1);
    }

    final Segment[] newSegmentArray(int i)
    {
        return new Segment[i];
    }

    cr newValueReference(cj cj1, Object obj)
    {
        int i = cj1.getHash();
        return valueStrength.referenceValue(segmentFor(i), cj1, obj);
    }

    void processPendingNotifications()
    {
        do
        {
            MapMaker.RemovalNotification removalnotification = (MapMaker.RemovalNotification)removalNotificationQueue.poll();
            if (removalnotification != null)
            {
                try
                {
                    removalListener.onRemoval(removalnotification);
                }
                catch (Exception exception)
                {
                    a.log(Level.WARNING, "Exception thrown by removal listener", exception);
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public Object put(Object obj, Object obj1)
    {
        p.a(obj);
        p.a(obj1);
        int i = hash(obj);
        return segmentFor(i).put(obj, i, obj1, false);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Object putIfAbsent(Object obj, Object obj1)
    {
        p.a(obj);
        p.a(obj1);
        int i = hash(obj);
        return segmentFor(i).put(obj, i, obj1, true);
    }

    void reclaimKey(cj cj1)
    {
        int i = cj1.getHash();
        segmentFor(i).reclaimKey(cj1, i);
    }

    void reclaimValue(cr cr1)
    {
        cj cj1 = cr1.a();
        int i = cj1.getHash();
        segmentFor(i).reclaimValue(cj1.getKey(), i, cr1);
    }

    public Object remove(Object obj)
    {
        if (obj == null)
        {
            return null;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).remove(obj, i);
        }
    }

    public boolean remove(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).remove(obj, i, obj1);
        }
    }

    public Object replace(Object obj, Object obj1)
    {
        p.a(obj);
        p.a(obj1);
        int i = hash(obj);
        return segmentFor(i).replace(obj, i, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        p.a(obj);
        p.a(obj2);
        if (obj1 == null)
        {
            return false;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).replace(obj, i, obj1, obj2);
        }
    }

    Segment segmentFor(int i)
    {
        return segments[i >>> segmentShift & segmentMask];
    }

    public int size()
    {
        Segment asegment[] = segments;
        long l = 0L;
        for (int i = 0; i < asegment.length; i++)
        {
            l += asegment[i].count;
        }

        return com.google.common.c.a.a(l);
    }

    boolean usesKeyReferences()
    {
        return keyStrength != Strength.STRONG;
    }

    boolean usesValueReferences()
    {
        return valueStrength != Strength.STRONG;
    }

    public Collection values()
    {
        Collection collection = values;
        if (collection != null)
        {
            return collection;
        } else
        {
            cs cs1 = new cs(this);
            values = cs1;
            return cs1;
        }
    }

    Object writeReplace()
    {
        return new SerializationProxy(keyStrength, valueStrength, keyEquivalence, valueEquivalence, expireAfterWriteNanos, expireAfterAccessNanos, maximumSize, concurrencyLevel, removalListener, this);
    }


    private class Strength extends Enum
    {

        public static final Strength SOFT;
        public static final Strength STRONG;
        public static final Strength WEAK;
        private static final Strength a[];

        public static Strength valueOf(String s)
        {
            return (Strength)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$Strength, s);
        }

        public static Strength[] values()
        {
            return (Strength[])a.clone();
        }

        abstract Equivalence defaultEquivalence();

        abstract cr referenceValue(Segment segment, cj cj1, Object obj);

        static 
        {
            class _cls1 extends Strength
            {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.equals();
                }

                final cr referenceValue(Segment segment, cj cj1, Object obj)
                {
                    return new cp(obj);
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            STRONG = new _cls1("STRONG", 0);
            class _cls2 extends Strength
            {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.identity();
                }

                final cr referenceValue(Segment segment, cj cj1, Object obj)
                {
                    return new ck(segment.valueReferenceQueue, obj, cj1);
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            SOFT = new _cls2("SOFT", 1);
            class _cls3 extends Strength
            {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.identity();
                }

                final cr referenceValue(Segment segment, cj cj1, Object obj)
                {
                    return new cx(segment.valueReferenceQueue, obj, cj1);
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            WEAK = new _cls3("WEAK", 2);
            a = (new Strength[] {
                STRONG, SOFT, WEAK
            });
        }

        private Strength(String s, int i)
        {
            super(s, i);
        }

        Strength(String s, int i, bv bv1)
        {
            this(s, i);
        }
    }


    private class EntryFactory extends Enum
    {

        static final int EVICTABLE_MASK = 2;
        static final int EXPIRABLE_MASK = 1;
        public static final EntryFactory STRONG;
        public static final EntryFactory STRONG_EVICTABLE;
        public static final EntryFactory STRONG_EXPIRABLE;
        public static final EntryFactory STRONG_EXPIRABLE_EVICTABLE;
        public static final EntryFactory WEAK;
        public static final EntryFactory WEAK_EVICTABLE;
        public static final EntryFactory WEAK_EXPIRABLE;
        public static final EntryFactory WEAK_EXPIRABLE_EVICTABLE;
        private static final EntryFactory a[];
        static final EntryFactory factories[][];

        static EntryFactory getFactory(Strength strength, boolean flag, boolean flag1)
        {
            byte byte0 = 0;
            boolean flag2;
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte0 = 2;
            }
            return factories[strength.ordinal()][byte0 | flag2];
        }

        public static EntryFactory valueOf(String s)
        {
            return (EntryFactory)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$EntryFactory, s);
        }

        public static EntryFactory[] values()
        {
            return (EntryFactory[])a.clone();
        }

        cj copyEntry(Segment segment, cj cj1, cj cj2)
        {
            return newEntry(segment, cj1.getKey(), cj1.getHash(), cj2);
        }

        void copyEvictableEntry(cj cj1, cj cj2)
        {
            MapMakerInternalMap.connectEvictables(cj1.getPreviousEvictable(), cj2);
            MapMakerInternalMap.connectEvictables(cj2, cj1.getNextEvictable());
            MapMakerInternalMap.nullifyEvictable(cj1);
        }

        void copyExpirableEntry(cj cj1, cj cj2)
        {
            cj2.setExpirationTime(cj1.getExpirationTime());
            MapMakerInternalMap.connectExpirables(cj1.getPreviousExpirable(), cj2);
            MapMakerInternalMap.connectExpirables(cj2, cj1.getNextExpirable());
            MapMakerInternalMap.nullifyExpirable(cj1);
        }

        abstract cj newEntry(Segment segment, Object obj, int i, cj cj1);

        static 
        {
            class _cls1 extends EntryFactory
            {

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cl(obj, i, cj1);
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            STRONG = new _cls1("STRONG", 0);
            class _cls2 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyExpirableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cn(obj, i, cj1);
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            STRONG_EXPIRABLE = new _cls2("STRONG_EXPIRABLE", 1);
            class _cls3 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyEvictableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cm(obj, i, cj1);
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            STRONG_EVICTABLE = new _cls3("STRONG_EVICTABLE", 2);
            class _cls4 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyExpirableEntry(cj1, segment);
                    copyEvictableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new co(obj, i, cj1);
                }

                _cls4(String s, int i)
                {
                    super(s, i, null);
                }
            }

            STRONG_EXPIRABLE_EVICTABLE = new _cls4("STRONG_EXPIRABLE_EVICTABLE", 3);
            class _cls5 extends EntryFactory
            {

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new ct(segment.keyReferenceQueue, obj, i, cj1);
                }

                _cls5(String s, int i)
                {
                    super(s, i, null);
                }
            }

            WEAK = new _cls5("WEAK", 4);
            class _cls6 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyExpirableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cv(segment.keyReferenceQueue, obj, i, cj1);
                }

                _cls6(String s, int i)
                {
                    super(s, i, null);
                }
            }

            WEAK_EXPIRABLE = new _cls6("WEAK_EXPIRABLE", 5);
            class _cls7 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyEvictableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cu(segment.keyReferenceQueue, obj, i, cj1);
                }

                _cls7(String s, int i)
                {
                    super(s, i, null);
                }
            }

            WEAK_EVICTABLE = new _cls7("WEAK_EVICTABLE", 6);
            class _cls8 extends EntryFactory
            {

                final cj copyEntry(Segment segment, cj cj1, cj cj2)
                {
                    segment = copyEntry(segment, cj1, cj2);
                    copyExpirableEntry(cj1, segment);
                    copyEvictableEntry(cj1, segment);
                    return segment;
                }

                final cj newEntry(Segment segment, Object obj, int i, cj cj1)
                {
                    return new cw(segment.keyReferenceQueue, obj, i, cj1);
                }

                _cls8(String s, int i)
                {
                    super(s, i, null);
                }
            }

            WEAK_EXPIRABLE_EVICTABLE = new _cls8("WEAK_EXPIRABLE_EVICTABLE", 7);
            a = (new EntryFactory[] {
                STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
            });
            factories = (new EntryFactory[][] {
                new EntryFactory[] {
                    STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE
                }, new EntryFactory[0], new EntryFactory[] {
                    WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
                }
            });
        }

        private EntryFactory(String s, int i)
        {
            super(s, i);
        }

        EntryFactory(String s, int i, bv bv1)
        {
            this(s, i);
        }
    }


    private class NullEntry extends Enum
        implements cj
    {

        public static final NullEntry INSTANCE;
        private static final NullEntry a[];

        public static NullEntry valueOf(String s)
        {
            return (NullEntry)Enum.valueOf(com/google/common/collect/MapMakerInternalMap$NullEntry, s);
        }

        public static NullEntry[] values()
        {
            return (NullEntry[])a.clone();
        }

        public final long getExpirationTime()
        {
            return 0L;
        }

        public final int getHash()
        {
            return 0;
        }

        public final Object getKey()
        {
            return null;
        }

        public final cj getNext()
        {
            return null;
        }

        public final cj getNextEvictable()
        {
            return this;
        }

        public final cj getNextExpirable()
        {
            return this;
        }

        public final cj getPreviousEvictable()
        {
            return this;
        }

        public final cj getPreviousExpirable()
        {
            return this;
        }

        public final cr getValueReference()
        {
            return null;
        }

        public final void setExpirationTime(long l)
        {
        }

        public final void setNextEvictable(cj cj1)
        {
        }

        public final void setNextExpirable(cj cj1)
        {
        }

        public final void setPreviousEvictable(cj cj1)
        {
        }

        public final void setPreviousExpirable(cj cj1)
        {
        }

        public final void setValueReference(cr cr1)
        {
        }

        static 
        {
            INSTANCE = new NullEntry("INSTANCE");
            a = (new NullEntry[] {
                INSTANCE
            });
        }

        private NullEntry(String s)
        {
            super(s, 0);
        }
    }


    private class Segment extends ReentrantLock
    {

        volatile int count;
        final Queue evictionQueue;
        final Queue expirationQueue;
        final ReferenceQueue keyReferenceQueue;
        final MapMakerInternalMap map;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue recencyQueue;
        volatile AtomicReferenceArray table;
        int threshold;
        final ReferenceQueue valueReferenceQueue;

        void clear()
        {
            if (count == 0) goto _L2; else goto _L1
_L1:
            lock();
            AtomicReferenceArray atomicreferencearray;
            atomicreferencearray = table;
            if (map.removalNotificationQueue == MapMakerInternalMap.DISCARDING_QUEUE)
            {
                break MISSING_BLOCK_LABEL_177;
            }
            int i = 0;
_L7:
            cj cj1;
            if (i >= atomicreferencearray.length())
            {
                break MISSING_BLOCK_LABEL_177;
            }
            cj1 = (cj)atomicreferencearray.get(i);
_L4:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!cj1.getValueReference().b())
            {
                enqueueNotification(cj1, MapMaker.RemovalCause.EXPLICIT);
            }
            cj1 = cj1.getNext();
            if (true) goto _L4; else goto _L3
_L5:
            Exception exception;
            for (; i >= atomicreferencearray.length(); i = 0)
            {
                break MISSING_BLOCK_LABEL_105;
            }

            atomicreferencearray.set(i, null);
            i++;
              goto _L5
            clearReferenceQueues();
            evictionQueue.clear();
            expirationQueue.clear();
            readCount.set(0);
            modCount = modCount + 1;
            count = 0;
            unlock();
            postWriteCleanup();
_L2:
            return;
            exception;
            unlock();
            postWriteCleanup();
            throw exception;
_L3:
            i++;
            if (true) goto _L7; else goto _L6
_L6:
        }

        void clearKeyReferenceQueue()
        {
            while (keyReferenceQueue.poll() != null) ;
        }

        void clearReferenceQueues()
        {
            if (map.usesKeyReferences())
            {
                clearKeyReferenceQueue();
            }
            if (map.usesValueReferences())
            {
                clearValueReferenceQueue();
            }
        }

        boolean clearValue(Object obj, int i, cr cr1)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L2:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = cj1.getKey();
            if (cj1.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            if (!map.keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_129;
            }
            if (cj1.getValueReference() != cr1)
            {
                break MISSING_BLOCK_LABEL_119;
            }
            atomicreferencearray.set(j, removeFromChain(cj2, cj1));
            unlock();
            postWriteCleanup();
            return true;
            unlock();
            postWriteCleanup();
            return false;
            cj1 = cj1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            postWriteCleanup();
            return false;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        void clearValueReferenceQueue()
        {
            while (valueReferenceQueue.poll() != null) ;
        }

        boolean containsKey(Object obj, int i)
        {
            boolean flag = false;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            obj = getLiveEntry(obj, i);
            if (obj == null)
            {
                postReadCleanup();
                return false;
            }
            obj = ((cj) (obj)).getValueReference().get();
            if (obj != null)
            {
                flag = true;
            }
            postReadCleanup();
            return flag;
            postReadCleanup();
            return false;
            obj;
            postReadCleanup();
            throw obj;
        }

        boolean containsValue(Object obj)
        {
            AtomicReferenceArray atomicreferencearray;
            int j;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_99;
            }
            atomicreferencearray = table;
            j = atomicreferencearray.length();
            int i = 0;
_L5:
            if (i >= j) goto _L2; else goto _L1
_L1:
            cj cj1 = (cj)atomicreferencearray.get(i);
_L4:
            if (cj1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj1 = getLiveValue(cj1);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            boolean flag = map.valueEquivalence.equivalent(obj, obj1);
            if (flag)
            {
                postReadCleanup();
                return true;
            }
            cj1 = cj1.getNext();
            if (true) goto _L4; else goto _L3
_L3:
            i++;
              goto _L5
_L2:
            postReadCleanup();
            return false;
            obj;
            postReadCleanup();
            throw obj;
        }

        cj copyEntry(cj cj1, cj cj2)
        {
            if (cj1.getKey() != null)
            {
                cr cr1 = cj1.getValueReference();
                Object obj = cr1.get();
                if (obj != null || cr1.b())
                {
                    cj1 = map.entryFactory.copyEntry(this, cj1, cj2);
                    cj1.setValueReference(cr1.a(valueReferenceQueue, obj, cj1));
                    return cj1;
                }
            }
            return null;
        }

        void drainKeyReferenceQueue()
        {
            int i = 0;
            do
            {
                Object obj = keyReferenceQueue.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (cj)obj;
                map.reclaimKey(((cj) (obj)));
                i++;
            } while (i != 16);
        }

        void drainRecencyQueue()
        {
            do
            {
                cj cj1 = (cj)recencyQueue.poll();
                if (cj1 == null)
                {
                    break;
                }
                if (evictionQueue.contains(cj1))
                {
                    evictionQueue.add(cj1);
                }
                if (map.expiresAfterAccess() && expirationQueue.contains(cj1))
                {
                    expirationQueue.add(cj1);
                }
            } while (true);
        }

        void drainReferenceQueues()
        {
            if (map.usesKeyReferences())
            {
                drainKeyReferenceQueue();
            }
            if (map.usesValueReferences())
            {
                drainValueReferenceQueue();
            }
        }

        void drainValueReferenceQueue()
        {
            int i = 0;
            do
            {
                Object obj = valueReferenceQueue.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (cr)obj;
                map.reclaimValue(((cr) (obj)));
                i++;
            } while (i != 16);
        }

        void enqueueNotification(cj cj1, MapMaker.RemovalCause removalcause)
        {
            enqueueNotification(cj1.getKey(), cj1.getHash(), cj1.getValueReference().get(), removalcause);
        }

        void enqueueNotification(Object obj, int i, Object obj1, MapMaker.RemovalCause removalcause)
        {
            if (map.removalNotificationQueue != MapMakerInternalMap.DISCARDING_QUEUE)
            {
                obj = new MapMaker.RemovalNotification(obj, obj1, removalcause);
                map.removalNotificationQueue.offer(obj);
            }
        }

        boolean evictEntries()
        {
            if (map.evictsBySize() && count >= maxSegmentSize)
            {
                drainRecencyQueue();
                cj cj1 = (cj)evictionQueue.remove();
                if (!removeEntry(cj1, cj1.getHash(), MapMaker.RemovalCause.SIZE))
                {
                    throw new AssertionError();
                } else
                {
                    return true;
                }
            } else
            {
                return false;
            }
        }

        void expand()
        {
            AtomicReferenceArray atomicreferencearray;
            AtomicReferenceArray atomicreferencearray1;
            int i;
            int k;
            int i1;
            int j1;
            atomicreferencearray = table;
            i1 = atomicreferencearray.length();
            if (i1 >= 0x40000000)
            {
                return;
            }
            i = count;
            atomicreferencearray1 = newEntryArray(i1 << 1);
            threshold = (atomicreferencearray1.length() * 3) / 4;
            j1 = atomicreferencearray1.length() - 1;
            k = 0;
_L2:
            cj cj1;
            cj cj2;
            int j;
            if (k >= i1)
            {
                break MISSING_BLOCK_LABEL_258;
            }
            cj2 = (cj)atomicreferencearray.get(k);
            if (cj2 != null)
            {
                cj1 = cj2.getNext();
                j = cj2.getHash() & j1;
                if (cj1 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                atomicreferencearray1.set(j, cj2);
            }
_L4:
            k++;
            if (true) goto _L2; else goto _L1
_L1:
            cj cj4;
            cj4 = cj2;
            for (; cj1 != null; cj1 = cj1.getNext())
            {
                int l = cj1.getHash() & j1;
                if (l != j)
                {
                    cj4 = cj1;
                    j = l;
                }
            }

            atomicreferencearray1.set(j, cj4);
            cj1 = cj2;
            j = i;
_L5:
            i = j;
            if (cj1 == cj4) goto _L4; else goto _L3
_L3:
            i = cj1.getHash() & j1;
            cj cj3 = copyEntry(cj1, (cj)atomicreferencearray1.get(i));
            if (cj3 != null)
            {
                atomicreferencearray1.set(i, cj3);
                i = j;
            } else
            {
                removeCollectedEntry(cj1);
                i = j - 1;
            }
            cj1 = cj1.getNext();
            j = i;
              goto _L5
              goto _L4
            table = atomicreferencearray1;
            count = i;
            return;
        }

        void expireEntries()
        {
            drainRecencyQueue();
            if (!expirationQueue.isEmpty()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            long l = map.ticker.a();
            do
            {
                cj cj1 = (cj)expirationQueue.peek();
                if (cj1 == null || !map.isExpired(cj1, l))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!removeEntry(cj1, cj1.getHash(), MapMaker.RemovalCause.EXPIRED))
                {
                    throw new AssertionError();
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        Object get(Object obj, int i)
        {
            obj = getLiveEntry(obj, i);
            if (obj == null)
            {
                postReadCleanup();
                return null;
            }
            Object obj1 = ((cj) (obj)).getValueReference().get();
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            recordRead(((cj) (obj)));
_L4:
            postReadCleanup();
            return obj1;
_L2:
            tryDrainReferenceQueues();
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            postReadCleanup();
            throw obj;
        }

        cj getEntry(Object obj, int i)
        {
            cj cj1;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            cj1 = getFirst(i);
_L2:
            Object obj1;
            if (cj1 == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            if (cj1.getHash() == i)
            {
                obj1 = cj1.getKey();
                if (obj1 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                tryDrainReferenceQueues();
            }
_L4:
            cj1 = cj1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            if (!map.keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
            return cj1;
            return null;
        }

        cj getFirst(int i)
        {
            AtomicReferenceArray atomicreferencearray = table;
            return (cj)atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
        }

        cj getLiveEntry(Object obj, int i)
        {
            obj = getEntry(obj, i);
            if (obj == null)
            {
                return null;
            }
            if (map.expires() && map.isExpired(((cj) (obj))))
            {
                tryExpireEntries();
                return null;
            } else
            {
                return ((cj) (obj));
            }
        }

        Object getLiveValue(cj cj1)
        {
            if (cj1.getKey() == null)
            {
                tryDrainReferenceQueues();
                return null;
            }
            Object obj = cj1.getValueReference().get();
            if (obj == null)
            {
                tryDrainReferenceQueues();
                return null;
            }
            if (map.expires() && map.isExpired(cj1))
            {
                tryExpireEntries();
                return null;
            } else
            {
                return obj;
            }
        }

        void initTable(AtomicReferenceArray atomicreferencearray)
        {
            threshold = (atomicreferencearray.length() * 3) / 4;
            if (threshold == maxSegmentSize)
            {
                threshold = threshold + 1;
            }
            table = atomicreferencearray;
        }

        boolean isCollected(cr cr1)
        {
            while (cr1.b() || cr1.get() != null) 
            {
                return false;
            }
            return true;
        }

        cj newEntry(Object obj, int i, cj cj1)
        {
            return map.entryFactory.newEntry(this, obj, i, cj1);
        }

        AtomicReferenceArray newEntryArray(int i)
        {
            return new AtomicReferenceArray(i);
        }

        void postReadCleanup()
        {
            if ((readCount.incrementAndGet() & 0x3f) == 0)
            {
                runCleanup();
            }
        }

        void postWriteCleanup()
        {
            runUnlockedCleanup();
        }

        void preWriteCleanup()
        {
            runLockedCleanup();
        }

        Object put(Object obj, int i, Object obj1, boolean flag)
        {
            lock();
            int k;
            preWriteCleanup();
            k = count + 1;
            int j = k;
            Object obj3;
            Object obj4;
            if (k > threshold)
            {
                expand();
                j = count + 1;
            }
            obj4 = table;
            k = i & ((AtomicReferenceArray) (obj4)).length() - 1;
            obj3 = (cj)((AtomicReferenceArray) (obj4)).get(k);
            Object obj2 = obj3;
_L5:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_294;
            }
            Object obj5 = ((cj) (obj2)).getKey();
            if (((cj) (obj2)).getHash() != i || obj5 == null)
            {
                break MISSING_BLOCK_LABEL_282;
            }
            if (!map.keyEquivalence.equivalent(obj, obj5))
            {
                break MISSING_BLOCK_LABEL_282;
            }
            obj3 = ((cj) (obj2)).getValueReference();
            obj4 = ((cr) (obj3)).get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_221;
            }
            modCount = modCount + 1;
            setValue(((cj) (obj2)), obj1);
            if (((cr) (obj3)).b()) goto _L2; else goto _L1
_L1:
            enqueueNotification(obj, i, obj4, MapMaker.RemovalCause.COLLECTED);
            j = count;
_L4:
            count = j;
            unlock();
            postWriteCleanup();
            return null;
_L2:
            if (!evictEntries()) goto _L4; else goto _L3
_L3:
            j = count + 1;
              goto _L4
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            recordLockedRead(((cj) (obj2)));
            unlock();
            postWriteCleanup();
            return obj4;
            modCount = modCount + 1;
            enqueueNotification(obj, i, obj4, MapMaker.RemovalCause.REPLACED);
            setValue(((cj) (obj2)), obj1);
            unlock();
            postWriteCleanup();
            return obj4;
            obj2 = ((cj) (obj2)).getNext();
              goto _L5
            modCount = modCount + 1;
            obj = newEntry(obj, i, ((cj) (obj3)));
            setValue(((cj) (obj)), obj1);
            ((AtomicReferenceArray) (obj4)).set(k, obj);
            if (!evictEntries())
            {
                break MISSING_BLOCK_LABEL_367;
            }
            i = count + 1;
_L6:
            count = i;
            unlock();
            postWriteCleanup();
            return null;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
            i = j;
              goto _L6
        }

        boolean reclaimKey(cj cj1, int i)
        {
            lock();
            cj cj3;
            AtomicReferenceArray atomicreferencearray;
            int j;
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj3 = (cj)atomicreferencearray.get(j);
            cj cj2 = cj3;
_L2:
            if (cj2 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (cj2 != cj1)
            {
                break MISSING_BLOCK_LABEL_124;
            }
            modCount = modCount + 1;
            enqueueNotification(cj2.getKey(), i, cj2.getValueReference().get(), MapMaker.RemovalCause.COLLECTED);
            cj1 = removeFromChain(cj3, cj2);
            i = count;
            atomicreferencearray.set(j, cj1);
            count = i - 1;
            unlock();
            postWriteCleanup();
            return true;
            cj2 = cj2.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            postWriteCleanup();
            return false;
            cj1;
            unlock();
            postWriteCleanup();
            throw cj1;
        }

        boolean reclaimValue(Object obj, int i, cr cr1)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L2:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = cj1.getKey();
            if (cj1.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_188;
            }
            if (!map.keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_188;
            }
            if (cj1.getValueReference() != cr1)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            modCount = modCount + 1;
            enqueueNotification(obj, i, cr1.get(), MapMaker.RemovalCause.COLLECTED);
            obj = removeFromChain(cj2, cj1);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            return true;
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            return false;
            cj1 = cj1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            return false;
            obj;
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            throw obj;
        }

        void recordExpirationTime(cj cj1, long l)
        {
            cj1.setExpirationTime(map.ticker.a() + l);
        }

        void recordLockedRead(cj cj1)
        {
            evictionQueue.add(cj1);
            if (map.expiresAfterAccess())
            {
                recordExpirationTime(cj1, map.expireAfterAccessNanos);
                expirationQueue.add(cj1);
            }
        }

        void recordRead(cj cj1)
        {
            if (map.expiresAfterAccess())
            {
                recordExpirationTime(cj1, map.expireAfterAccessNanos);
            }
            recencyQueue.add(cj1);
        }

        void recordWrite(cj cj1)
        {
            drainRecencyQueue();
            evictionQueue.add(cj1);
            if (map.expires())
            {
                long l;
                if (map.expiresAfterAccess())
                {
                    l = map.expireAfterAccessNanos;
                } else
                {
                    l = map.expireAfterWriteNanos;
                }
                recordExpirationTime(cj1, l);
                expirationQueue.add(cj1);
            }
        }

        Object remove(Object obj, int i)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L3:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = cj1.getKey();
            if (cj1.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            Object obj2;
            if (!map.keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_197;
            }
            obj = cj1.getValueReference();
            obj2 = ((cr) (obj)).get();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_172;
            }
            obj = MapMaker.RemovalCause.EXPLICIT;
_L1:
            modCount = modCount + 1;
            enqueueNotification(obj1, i, obj2, ((MapMaker.RemovalCause) (obj)));
            obj = removeFromChain(cj2, cj1);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
            unlock();
            postWriteCleanup();
            return obj2;
label0:
            {
                if (!isCollected(((cr) (obj))))
                {
                    break label0;
                }
                obj = MapMaker.RemovalCause.COLLECTED;
            }
              goto _L1
            unlock();
            postWriteCleanup();
            return null;
            cj1 = cj1.getNext();
            if (true) goto _L3; else goto _L2
_L2:
            unlock();
            postWriteCleanup();
            return null;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        boolean remove(Object obj, int i, Object obj1)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L3:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = cj1.getKey();
            if (cj1.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_232;
            }
            Object obj3;
            if (!map.keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            obj = cj1.getValueReference();
            obj3 = ((cr) (obj)).get();
            if (!map.valueEquivalence.equivalent(obj1, obj3))
            {
                break MISSING_BLOCK_LABEL_201;
            }
            obj = MapMaker.RemovalCause.EXPLICIT;
_L1:
            modCount = modCount + 1;
            enqueueNotification(obj2, i, obj3, ((MapMaker.RemovalCause) (obj)));
            obj1 = removeFromChain(cj2, cj1);
            i = count;
            atomicreferencearray.set(j, obj1);
            count = i - 1;
            obj1 = MapMaker.RemovalCause.EXPLICIT;
            boolean flag;
            if (obj == obj1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            unlock();
            postWriteCleanup();
            return flag;
label0:
            {
                if (!isCollected(((cr) (obj))))
                {
                    break label0;
                }
                obj = MapMaker.RemovalCause.COLLECTED;
            }
              goto _L1
            unlock();
            postWriteCleanup();
            return false;
            cj1 = cj1.getNext();
            if (true) goto _L3; else goto _L2
_L2:
            unlock();
            postWriteCleanup();
            return false;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        void removeCollectedEntry(cj cj1)
        {
            enqueueNotification(cj1, MapMaker.RemovalCause.COLLECTED);
            evictionQueue.remove(cj1);
            expirationQueue.remove(cj1);
        }

        boolean removeEntry(cj cj1, int i, MapMaker.RemovalCause removalcause)
        {
            int j = count;
            AtomicReferenceArray atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj cj3 = (cj)atomicreferencearray.get(j);
            for (cj cj2 = cj3; cj2 != null; cj2 = cj2.getNext())
            {
                if (cj2 == cj1)
                {
                    modCount = modCount + 1;
                    enqueueNotification(cj2.getKey(), i, cj2.getValueReference().get(), removalcause);
                    cj1 = removeFromChain(cj3, cj2);
                    i = count;
                    atomicreferencearray.set(j, cj1);
                    count = i - 1;
                    return true;
                }
            }

            return false;
        }

        cj removeFromChain(cj cj1, cj cj2)
        {
            evictionQueue.remove(cj2);
            expirationQueue.remove(cj2);
            int i = count;
            cj cj4 = cj2.getNext();
            cj cj3 = cj1;
            cj1 = cj4;
            while (cj3 != cj2) 
            {
                cj cj5 = copyEntry(cj3, cj1);
                if (cj5 != null)
                {
                    cj1 = cj5;
                } else
                {
                    removeCollectedEntry(cj3);
                    i--;
                }
                cj3 = cj3.getNext();
            }
            count = i;
            return cj1;
        }

        Object replace(Object obj, int i, Object obj1)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L2:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = cj1.getKey();
            if (cj1.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_225;
            }
            cr cr1;
            Object obj3;
            if (!map.keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_225;
            }
            cr1 = cj1.getValueReference();
            obj3 = cr1.get();
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_186;
            }
            if (isCollected(cr1))
            {
                int k = count;
                modCount = modCount + 1;
                enqueueNotification(obj2, i, obj3, MapMaker.RemovalCause.COLLECTED);
                obj = removeFromChain(cj2, cj1);
                i = count;
                atomicreferencearray.set(j, obj);
                count = i - 1;
            }
            unlock();
            postWriteCleanup();
            return null;
            modCount = modCount + 1;
            enqueueNotification(obj, i, obj3, MapMaker.RemovalCause.REPLACED);
            setValue(cj1, obj1);
            unlock();
            postWriteCleanup();
            return obj3;
            cj1 = cj1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            postWriteCleanup();
            return null;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        boolean replace(Object obj, int i, Object obj1, Object obj2)
        {
            lock();
            cj cj2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            cj2 = (cj)atomicreferencearray.get(j);
            cj cj1 = cj2;
_L2:
            if (cj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = cj1.getKey();
            if (cj1.getHash() != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_257;
            }
            cr cr1;
            Object obj4;
            if (!map.keyEquivalence.equivalent(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_257;
            }
            cr1 = cj1.getValueReference();
            obj4 = cr1.get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_186;
            }
            if (isCollected(cr1))
            {
                int k = count;
                modCount = modCount + 1;
                enqueueNotification(obj3, i, obj4, MapMaker.RemovalCause.COLLECTED);
                obj = removeFromChain(cj2, cj1);
                i = count;
                atomicreferencearray.set(j, obj);
                count = i - 1;
            }
            unlock();
            postWriteCleanup();
            return false;
            if (!map.valueEquivalence.equivalent(obj1, obj4))
            {
                break MISSING_BLOCK_LABEL_241;
            }
            modCount = modCount + 1;
            enqueueNotification(obj, i, obj4, MapMaker.RemovalCause.REPLACED);
            setValue(cj1, obj2);
            unlock();
            postWriteCleanup();
            return true;
            recordLockedRead(cj1);
            unlock();
            postWriteCleanup();
            return false;
            cj1 = cj1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            postWriteCleanup();
            return false;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        void runCleanup()
        {
            runLockedCleanup();
            runUnlockedCleanup();
        }

        void runLockedCleanup()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_27;
            }
            drainReferenceQueues();
            expireEntries();
            readCount.set(0);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        void runUnlockedCleanup()
        {
            if (!isHeldByCurrentThread())
            {
                map.processPendingNotifications();
            }
        }

        void setValue(cj cj1, Object obj)
        {
            cj1.setValueReference(map.valueStrength.referenceValue(this, cj1, obj));
            recordWrite(cj1);
        }

        void tryDrainReferenceQueues()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_15;
            }
            drainReferenceQueues();
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        void tryExpireEntries()
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_15;
            }
            expireEntries();
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        Segment(int i, int j)
        {
            Object obj1 = null;
            super();
            map = MapMakerInternalMap.this;
            maxSegmentSize = j;
            initTable(newEntryArray(i));
            Object obj;
            if (usesKeyReferences())
            {
                obj = new ReferenceQueue();
            } else
            {
                obj = null;
            }
            keyReferenceQueue = ((ReferenceQueue) (obj));
            obj = obj1;
            if (usesValueReferences())
            {
                obj = new ReferenceQueue();
            }
            valueReferenceQueue = ((ReferenceQueue) (obj));
            if (evictsBySize() || expiresAfterAccess())
            {
                obj = new ConcurrentLinkedQueue();
            } else
            {
                obj = MapMakerInternalMap.discardingQueue();
            }
            recencyQueue = ((Queue) (obj));
            if (evictsBySize())
            {
                obj = new ca();
            } else
            {
                obj = MapMakerInternalMap.discardingQueue();
            }
            evictionQueue = ((Queue) (obj));
            if (expires())
            {
                mapmakerinternalmap = new cd();
            } else
            {
                mapmakerinternalmap = MapMakerInternalMap.discardingQueue();
            }
            expirationQueue = MapMakerInternalMap.this;
        }
    }


    private class SerializationProxy extends AbstractSerializationProxy
    {
        private class AbstractSerializationProxy extends ak
            implements Serializable
        {

            private static final long serialVersionUID = 3L;
            final int concurrencyLevel;
            transient ConcurrentMap _flddelegate;
            final long expireAfterAccessNanos;
            final long expireAfterWriteNanos;
            final Equivalence keyEquivalence;
            final Strength keyStrength;
            final int maximumSize;
            final bu removalListener;
            final Equivalence valueEquivalence;
            final Strength valueStrength;

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
                return _flddelegate;
            }

            void readEntries(ObjectInputStream objectinputstream)
            {
                do
                {
                    Object obj = objectinputstream.readObject();
                    if (obj != null)
                    {
                        Object obj1 = objectinputstream.readObject();
                        _flddelegate.put(obj, obj1);
                    } else
                    {
                        return;
                    }
                } while (true);
            }

            MapMaker readMapMaker(ObjectInputStream objectinputstream)
            {
                boolean flag1 = false;
                int i = objectinputstream.readInt();
                objectinputstream = new MapMaker();
                Object obj;
                boolean flag;
                if (((MapMaker) (objectinputstream)).c == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "initial capacity was already set to %s", new Object[] {
                    Integer.valueOf(((MapMaker) (objectinputstream)).c)
                });
                if (i >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.a(flag);
                objectinputstream.c = i;
                objectinputstream = objectinputstream.a(keyStrength);
                obj = valueStrength;
                if (((MapMaker) (objectinputstream)).g == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "Value strength was already set to %s", new Object[] {
                    ((MapMaker) (objectinputstream)).g
                });
                objectinputstream.g = (Strength)p.a(obj);
                if (obj != Strength.STRONG)
                {
                    objectinputstream.b = true;
                }
                obj = keyEquivalence;
                if (((MapMaker) (objectinputstream)).k == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "key equivalence was already set to %s", new Object[] {
                    ((MapMaker) (objectinputstream)).k
                });
                objectinputstream.k = (Equivalence)p.a(obj);
                objectinputstream.b = true;
                i = concurrencyLevel;
                if (((MapMaker) (objectinputstream)).d == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "concurrency level was already set to %s", new Object[] {
                    Integer.valueOf(((MapMaker) (objectinputstream)).d)
                });
                if (i > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.a(flag);
                objectinputstream.d = i;
                obj = removalListener;
                if (((MapMaker) (objectinputstream)).a == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag);
                objectinputstream.a = (bu)p.a(obj);
                objectinputstream.b = true;
                if (expireAfterWriteNanos > 0L)
                {
                    long l = expireAfterWriteNanos;
                    TimeUnit timeunit = TimeUnit.NANOSECONDS;
                    objectinputstream.a(l, timeunit);
                    objectinputstream.h = timeunit.toNanos(l);
                    if (l == 0L && ((MapMaker) (objectinputstream)).j == null)
                    {
                        objectinputstream.j = MapMaker.RemovalCause.EXPIRED;
                    }
                    objectinputstream.b = true;
                }
                if (expireAfterAccessNanos > 0L)
                {
                    long l1 = expireAfterAccessNanos;
                    TimeUnit timeunit1 = TimeUnit.NANOSECONDS;
                    objectinputstream.a(l1, timeunit1);
                    objectinputstream.i = timeunit1.toNanos(l1);
                    if (l1 == 0L && ((MapMaker) (objectinputstream)).j == null)
                    {
                        objectinputstream.j = MapMaker.RemovalCause.EXPIRED;
                    }
                    objectinputstream.b = true;
                }
                if (maximumSize != -1)
                {
                    int j = maximumSize;
                    if (((MapMaker) (objectinputstream)).e == -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    p.b(flag, "maximum size was already set to %s", new Object[] {
                        Integer.valueOf(((MapMaker) (objectinputstream)).e)
                    });
                    flag = flag1;
                    if (j >= 0)
                    {
                        flag = true;
                    }
                    p.a(flag, "maximum size must not be negative");
                    objectinputstream.e = j;
                    objectinputstream.b = true;
                    if (((MapMaker) (objectinputstream)).e == 0)
                    {
                        objectinputstream.j = MapMaker.RemovalCause.SIZE;
                    }
                }
                return objectinputstream;
            }

            void writeMapTo(ObjectOutputStream objectoutputstream)
            {
                objectoutputstream.writeInt(_flddelegate.size());
                java.util.Map.Entry entry;
                for (Iterator iterator = _flddelegate.entrySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                    objectoutputstream.writeObject(entry.getKey());
                }

                objectoutputstream.writeObject(null);
            }

            AbstractSerializationProxy(Strength strength, Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, bu bu1, ConcurrentMap concurrentmap)
            {
                keyStrength = strength;
                valueStrength = strength1;
                keyEquivalence = equivalence;
                valueEquivalence = equivalence1;
                expireAfterWriteNanos = l;
                expireAfterAccessNanos = l1;
                maximumSize = i;
                concurrencyLevel = j;
                removalListener = bu1;
                _flddelegate = concurrentmap;
            }
        }


        private static final long serialVersionUID = 3L;

        private void readObject(ObjectInputStream objectinputstream)
        {
            objectinputstream.defaultReadObject();
            Object obj = readMapMaker(objectinputstream);
            if (!((MapMaker) (obj)).b)
            {
                obj = new ConcurrentHashMap(((MapMaker) (obj)).b(), 0.75F, ((MapMaker) (obj)).c());
            } else
            {
                if (((MapMaker) (obj)).j == null)
                {
                    obj = new MapMakerInternalMap(((MapMaker) (obj)));
                } else
                {
                    obj = new MapMaker.NullConcurrentMap(((MapMaker) (obj)));
                }
                obj = (ConcurrentMap)obj;
            }
            _flddelegate = ((ConcurrentMap) (obj));
            readEntries(objectinputstream);
        }

        private Object readResolve()
        {
            return _flddelegate;
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
        {
            objectoutputstream.defaultWriteObject();
            writeMapTo(objectoutputstream);
        }

        SerializationProxy(Strength strength, Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, bu bu1, ConcurrentMap concurrentmap)
        {
            super(strength, strength1, equivalence, equivalence1, l, l1, i, j, bu1, concurrentmap);
        }
    }

}
