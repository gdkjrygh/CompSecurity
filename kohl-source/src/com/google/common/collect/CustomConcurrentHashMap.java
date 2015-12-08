// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;
import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.base.FinalizableSoftReference;
import com.google.common.base.FinalizableWeakReference;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.collect:
//            MapMaker, MapEvictionListener, ForwardingConcurrentMap, AbstractLinkedIterator, 
//            AbstractMapEntry, Iterators

class CustomConcurrentHashMap extends AbstractMap
    implements ConcurrentMap, Serializable
{
    static abstract class AbstractSerializationProxy extends ForwardingConcurrentMap
        implements Serializable
    {

        private static final long serialVersionUID = 2L;
        final int concurrencyLevel;
        transient ConcurrentMap _flddelegate;
        final MapEvictionListener evictionListener;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence keyEquivalence;
        final Strength keyStrength;
        final int maximumSize;
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
            throws IOException, ClassNotFoundException
        {
            do
            {
                Object obj = objectinputstream.readObject();
                if (obj == null)
                {
                    return;
                }
                Object obj1 = objectinputstream.readObject();
                _flddelegate.put(obj, obj1);
            } while (true);
        }

        MapMaker readMapMaker(ObjectInputStream objectinputstream)
            throws IOException
        {
            int i = objectinputstream.readInt();
            objectinputstream = (new MapMaker()).initialCapacity(i).setKeyStrength(keyStrength).setValueStrength(valueStrength).privateKeyEquivalence(keyEquivalence).privateValueEquivalence(valueEquivalence).concurrencyLevel(concurrencyLevel);
            objectinputstream.evictionListener(evictionListener);
            if (expireAfterWriteNanos > 0L)
            {
                objectinputstream.expireAfterWrite(expireAfterWriteNanos, TimeUnit.NANOSECONDS);
            }
            if (expireAfterAccessNanos > 0L)
            {
                objectinputstream.expireAfterAccess(expireAfterAccessNanos, TimeUnit.NANOSECONDS);
            }
            if (maximumSize != -1)
            {
                objectinputstream.maximumSize(maximumSize);
            }
            return objectinputstream;
        }

        void writeMapTo(ObjectOutputStream objectoutputstream)
            throws IOException
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

        AbstractSerializationProxy(Strength strength, Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, MapEvictionListener mapevictionlistener, ConcurrentMap concurrentmap)
        {
            keyStrength = strength;
            valueStrength = strength1;
            keyEquivalence = equivalence;
            valueEquivalence = equivalence1;
            expireAfterWriteNanos = l;
            expireAfterAccessNanos = l1;
            maximumSize = i;
            concurrencyLevel = j;
            evictionListener = mapevictionlistener;
            _flddelegate = concurrentmap;
        }
    }

    static abstract class EntryFactory extends Enum
    {

        private static final EntryFactory $VALUES[];
        static final int EVICTABLE_MASK = 2;
        static final int EXPIRABLE_MASK = 1;
        public static final EntryFactory SOFT;
        public static final EntryFactory SOFT_EVICTABLE;
        public static final EntryFactory SOFT_EXPIRABLE;
        public static final EntryFactory SOFT_EXPIRABLE_EVICTABLE;
        public static final EntryFactory STRONG;
        public static final EntryFactory STRONG_EVICTABLE;
        public static final EntryFactory STRONG_EXPIRABLE;
        public static final EntryFactory STRONG_EXPIRABLE_EVICTABLE;
        public static final EntryFactory WEAK;
        public static final EntryFactory WEAK_EVICTABLE;
        public static final EntryFactory WEAK_EXPIRABLE;
        public static final EntryFactory WEAK_EXPIRABLE_EVICTABLE;
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
            return factories[strength.ordinal()][flag2 | byte0];
        }

        public static EntryFactory valueOf(String s)
        {
            return (EntryFactory)Enum.valueOf(com/google/common/collect/CustomConcurrentHashMap$EntryFactory, s);
        }

        public static EntryFactory[] values()
        {
            return (EntryFactory[])$VALUES.clone();
        }

        ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            return newEntry(customconcurrenthashmap, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
        }

        void copyEvictableEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            CustomConcurrentHashMap.connectEvictables(referenceentry.getPreviousEvictable(), referenceentry1);
            CustomConcurrentHashMap.connectEvictables(referenceentry1, referenceentry.getNextEvictable());
            CustomConcurrentHashMap.nullifyEvictable(referenceentry);
        }

        void copyExpirableEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            referenceentry1.setExpirationTime(referenceentry.getExpirationTime());
            CustomConcurrentHashMap.connectExpirables(referenceentry.getPreviousExpirable(), referenceentry1);
            CustomConcurrentHashMap.connectExpirables(referenceentry1, referenceentry.getNextExpirable());
            CustomConcurrentHashMap.nullifyExpirable(referenceentry);
        }

        abstract ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry);

        static 
        {
            STRONG = new EntryFactory("STRONG", 0) {

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            STRONG_EXPIRABLE = new EntryFactory("STRONG_EXPIRABLE", 1) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            STRONG_EVICTABLE = new EntryFactory("STRONG_EVICTABLE", 2) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            STRONG_EXPIRABLE_EVICTABLE = new EntryFactory("STRONG_EXPIRABLE_EVICTABLE", 3) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            SOFT = new EntryFactory("SOFT", 4) {

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new SoftEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            SOFT_EXPIRABLE = new EntryFactory("SOFT_EXPIRABLE", 5) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new SoftExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            SOFT_EVICTABLE = new EntryFactory("SOFT_EVICTABLE", 6) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new SoftEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            SOFT_EXPIRABLE_EVICTABLE = new EntryFactory("SOFT_EXPIRABLE_EVICTABLE", 7) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new SoftExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            WEAK = new EntryFactory("WEAK", 8) {

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            WEAK_EXPIRABLE = new EntryFactory("WEAK_EXPIRABLE", 9) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakExpirableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            WEAK_EVICTABLE = new EntryFactory("WEAK_EVICTABLE", 10) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            WEAK_EXPIRABLE_EVICTABLE = new EntryFactory("WEAK_EXPIRABLE_EVICTABLE", 11) {

                ReferenceEntry copyEntry(CustomConcurrentHashMap customconcurrenthashmap, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    customconcurrenthashmap = super.copyEntry(customconcurrenthashmap, referenceentry, referenceentry1);
                    copyExpirableEntry(referenceentry, customconcurrenthashmap);
                    copyEvictableEntry(referenceentry, customconcurrenthashmap);
                    return customconcurrenthashmap;
                }

                ReferenceEntry newEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakExpirableEvictableEntry(customconcurrenthashmap, obj, i, referenceentry);
                }

            };
            $VALUES = (new EntryFactory[] {
                STRONG, STRONG_EXPIRABLE, STRONG_EVICTABLE, STRONG_EXPIRABLE_EVICTABLE, SOFT, SOFT_EXPIRABLE, SOFT_EVICTABLE, SOFT_EXPIRABLE_EVICTABLE, WEAK, WEAK_EXPIRABLE, 
                WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
            });
            EntryFactory entryfactory = STRONG;
            EntryFactory entryfactory1 = STRONG_EXPIRABLE;
            EntryFactory entryfactory2 = STRONG_EVICTABLE;
            EntryFactory entryfactory3 = STRONG_EXPIRABLE_EVICTABLE;
            EntryFactory entryfactory4 = SOFT;
            EntryFactory entryfactory5 = SOFT_EXPIRABLE;
            EntryFactory entryfactory6 = SOFT_EVICTABLE;
            EntryFactory entryfactory7 = SOFT_EXPIRABLE_EVICTABLE;
            EntryFactory aentryfactory[] = {
                WEAK, WEAK_EXPIRABLE, WEAK_EVICTABLE, WEAK_EXPIRABLE_EVICTABLE
            };
            factories = (new EntryFactory[][] {
                new EntryFactory[] {
                    entryfactory, entryfactory1, entryfactory2, entryfactory3
                }, new EntryFactory[] {
                    entryfactory4, entryfactory5, entryfactory6, entryfactory7
                }, aentryfactory
            });
        }

        private EntryFactory(String s, int i)
        {
            super(s, i);
        }

    }

    final class EntryIterator extends HashIterator
        implements Iterator
    {

        final CustomConcurrentHashMap this$0;

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return nextEntry();
        }

        EntryIterator()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    final class EntrySet extends AbstractSet
    {

        final CustomConcurrentHashMap this$0;

        public void clear()
        {
            CustomConcurrentHashMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null)
                {
                    obj1 = get(obj1);
                    if (obj1 != null && valueEquivalence.equivalent(((java.util.Map.Entry) (obj)).getValue(), obj1))
                    {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean isEmpty()
        {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new EntryIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && CustomConcurrentHashMap.this.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return CustomConcurrentHashMap.this.size();
        }

        EntrySet()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    abstract class HashIterator
    {

        AtomicReferenceArray currentTable;
        WriteThroughEntry lastReturned;
        ReferenceEntry nextEntry;
        WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final CustomConcurrentHashMap this$0;

        final void advance()
        {
            nextExternal = null;
            break MISSING_BLOCK_LABEL_5;
            if (!nextInChain() && !nextInTable())
            {
                while (nextSegmentIndex >= 0) 
                {
                    Segment asegment[] = segments;
                    int i = nextSegmentIndex;
                    nextSegmentIndex = i - 1;
                    Segment segment = asegment[i];
                    if (segment.count != 0)
                    {
                        currentTable = segment.table;
                        nextTableIndex = currentTable.length() - 1;
                        if (nextInTable())
                        {
                            return;
                        }
                    }
                }
            }
            return;
        }

        boolean advanceTo(ReferenceEntry referenceentry)
        {
            Object obj = referenceentry.getKey();
            Object obj1 = referenceentry.getValueReference().get();
            if (obj != null && obj1 != null && (!expires() || !isExpired(referenceentry)))
            {
                nextExternal = new WriteThroughEntry(obj, obj1);
                return true;
            } else
            {
                return false;
            }
        }

        public boolean hasNext()
        {
            return nextExternal != null;
        }

        WriteThroughEntry nextEntry()
        {
            if (nextExternal == null)
            {
                throw new NoSuchElementException();
            } else
            {
                lastReturned = nextExternal;
                advance();
                return lastReturned;
            }
        }

        boolean nextInChain()
        {
            if (nextEntry != null)
            {
                for (nextEntry = nextEntry.getNext(); nextEntry != null; nextEntry = nextEntry.getNext())
                {
                    if (advanceTo(nextEntry))
                    {
                        return true;
                    }
                }

            }
            return false;
        }

        boolean nextInTable()
        {
            while (nextTableIndex >= 0) 
            {
                Object obj = currentTable;
                int i = nextTableIndex;
                nextTableIndex = i - 1;
                obj = (ReferenceEntry)((AtomicReferenceArray) (obj)).get(i);
                nextEntry = ((ReferenceEntry) (obj));
                if (obj != null && (advanceTo(nextEntry) || nextInChain()))
                {
                    return true;
                }
            }
            return false;
        }

        public void remove()
        {
            boolean flag;
            if (lastReturned != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            CustomConcurrentHashMap.this.remove(lastReturned.getKey());
            lastReturned = null;
        }

        HashIterator()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
            nextSegmentIndex = segments.length - 1;
            nextTableIndex = -1;
            advance();
        }
    }

    final class KeyIterator extends HashIterator
        implements Iterator
    {

        final CustomConcurrentHashMap this$0;

        public Object next()
        {
            return nextEntry().getKey();
        }

        KeyIterator()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    final class KeySet extends AbstractSet
    {

        final CustomConcurrentHashMap this$0;

        public void clear()
        {
            CustomConcurrentHashMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public boolean isEmpty()
        {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new KeyIterator();
        }

        public boolean remove(Object obj)
        {
            return CustomConcurrentHashMap.this.remove(obj) != null;
        }

        public int size()
        {
            return CustomConcurrentHashMap.this.size();
        }

        KeySet()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    private static final class NullEntry extends Enum
        implements ReferenceEntry
    {

        private static final NullEntry $VALUES[];
        public static final NullEntry INSTANCE;

        public static NullEntry valueOf(String s)
        {
            return (NullEntry)Enum.valueOf(com/google/common/collect/CustomConcurrentHashMap$NullEntry, s);
        }

        public static NullEntry[] values()
        {
            return (NullEntry[])$VALUES.clone();
        }

        public long getExpirationTime()
        {
            return 0L;
        }

        public int getHash()
        {
            return 0;
        }

        public Object getKey()
        {
            return null;
        }

        public ReferenceEntry getNext()
        {
            return null;
        }

        public ReferenceEntry getNextEvictable()
        {
            return this;
        }

        public ReferenceEntry getNextExpirable()
        {
            return this;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return this;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return this;
        }

        public ValueReference getValueReference()
        {
            return null;
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
        }

        public void setExpirationTime(long l)
        {
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
        }

        public void setValueReference(ValueReference valuereference)
        {
        }

        static 
        {
            INSTANCE = new NullEntry("INSTANCE", 0);
            $VALUES = (new NullEntry[] {
                INSTANCE
            });
        }

        private NullEntry(String s, int i)
        {
            super(s, i);
        }
    }

    private static class QueueHolder
    {

        static final FinalizableReferenceQueue queue = new FinalizableReferenceQueue();


        private QueueHolder()
        {
        }
    }

    static interface ReferenceEntry
    {

        public abstract long getExpirationTime();

        public abstract int getHash();

        public abstract Object getKey();

        public abstract ReferenceEntry getNext();

        public abstract ReferenceEntry getNextEvictable();

        public abstract ReferenceEntry getNextExpirable();

        public abstract ReferenceEntry getPreviousEvictable();

        public abstract ReferenceEntry getPreviousExpirable();

        public abstract ValueReference getValueReference();

        public abstract void notifyKeyReclaimed();

        public abstract void notifyValueReclaimed(ValueReference valuereference);

        public abstract void setExpirationTime(long l);

        public abstract void setNextEvictable(ReferenceEntry referenceentry);

        public abstract void setNextExpirable(ReferenceEntry referenceentry);

        public abstract void setPreviousEvictable(ReferenceEntry referenceentry);

        public abstract void setPreviousExpirable(ReferenceEntry referenceentry);

        public abstract void setValueReference(ValueReference valuereference);
    }

    class Segment extends ReentrantLock
    {

        final Queue cleanupQueue = new ConcurrentLinkedQueue();
        final Runnable cleanupRunnable = new _cls1();
        volatile int count;
        final Queue evictionQueue;
        final Queue expirationQueue;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue recencyQueue;
        volatile AtomicReferenceArray table;
        final CustomConcurrentHashMap this$0;
        int threshold;

        void clear()
        {
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            lock();
            AtomicReferenceArray atomicreferencearray = table;
            int i = 0;
_L2:
            if (i >= atomicreferencearray.length())
            {
                break; /* Loop/switch isn't completed */
            }
            atomicreferencearray.set(i, null);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            evictionQueue.clear();
            expirationQueue.clear();
            readCount.set(0);
            modCount = modCount + 1;
            count = 0;
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        boolean clearValue(Object obj, int i, ValueReference valuereference)
        {
            lock();
            ReferenceEntry referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            if (!keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_88;
            }
            if (referenceentry.getValueReference() != valuereference)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            enqueueCleanup(referenceentry);
            unlock();
            return true;
            unlock();
            return false;
            referenceentry = referenceentry.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        boolean containsKey(Object obj, int i)
        {
            ReferenceEntry referenceentry;
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            referenceentry = getFirst(i);
_L2:
            flag = flag1;
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            if (referenceentry.getHash() == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            referenceentry = referenceentry.getNext();
            Object obj1;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj1 = referenceentry.getKey()) == null || !keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (getLiveValue(referenceentry) != null)
            {
                flag = true;
            }
            return flag;
        }

        boolean containsValue(Object obj)
        {
            AtomicReferenceArray atomicreferencearray;
            int i;
            int j;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            atomicreferencearray = table;
            j = atomicreferencearray.length();
            i = 0;
_L8:
            if (i >= j) goto _L2; else goto _L1
_L1:
            ReferenceEntry referenceentry = (ReferenceEntry)atomicreferencearray.get(i);
_L5:
            Object obj1;
            if (referenceentry == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = getLiveValue(referenceentry);
              goto _L3
_L7:
            referenceentry = referenceentry.getNext();
            if (true) goto _L5; else goto _L4
_L4:
            continue; /* Loop/switch isn't completed */
_L3:
            if (obj1 == null || !valueEquivalence.equivalent(obj, obj1)) goto _L7; else goto _L6
_L6:
            return true;
            i++;
              goto _L8
_L2:
            return false;
        }

        void drainRecencyQueue()
        {
            do
            {
                ReferenceEntry referenceentry = (ReferenceEntry)recencyQueue.poll();
                if (referenceentry == null)
                {
                    break;
                }
                if (evictionQueue.contains(referenceentry))
                {
                    evictionQueue.add(referenceentry);
                }
                if (expiresAfterAccess() && expirationQueue.contains(referenceentry))
                {
                    expirationQueue.add(referenceentry);
                }
            } while (true);
        }

        void enqueueCleanup(ReferenceEntry referenceentry)
        {
            referenceentry.setValueReference(CustomConcurrentHashMap.unset());
            cleanupQueue.offer(referenceentry);
            evictionQueue.remove(referenceentry);
            expirationQueue.remove(referenceentry);
        }

        boolean evictEntries()
        {
            if (evictsBySize() && count >= maxSegmentSize)
            {
                drainRecencyQueue();
                ReferenceEntry referenceentry = (ReferenceEntry)evictionQueue.remove();
                if (!unsetEntry(referenceentry, referenceentry.getHash()))
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
            AtomicReferenceArray atomicreferencearray = table;
            int j1 = atomicreferencearray.length();
            if (j1 >= 0x40000000)
            {
                return;
            }
            AtomicReferenceArray atomicreferencearray1 = newEntryArray(j1 << 1);
            threshold = (atomicreferencearray1.length() * 3) / 4;
            int k1 = atomicreferencearray1.length() - 1;
            int i = 0;
            while (i < j1) 
            {
                ReferenceEntry referenceentry1 = (ReferenceEntry)atomicreferencearray.get(i);
                if (referenceentry1 != null)
                {
                    ReferenceEntry referenceentry = referenceentry1.getNext();
                    int j = referenceentry1.getHash() & k1;
                    if (referenceentry == null)
                    {
                        atomicreferencearray1.set(j, referenceentry1);
                    } else
                    {
                        ReferenceEntry referenceentry3 = referenceentry1;
                        while (referenceentry != null) 
                        {
                            int i1 = referenceentry.getHash() & k1;
                            int l = j;
                            if (i1 != j)
                            {
                                l = i1;
                                referenceentry3 = referenceentry;
                            }
                            referenceentry = referenceentry.getNext();
                            j = l;
                        }
                        atomicreferencearray1.set(j, referenceentry3);
                        referenceentry = referenceentry1;
                        while (referenceentry != referenceentry3) 
                        {
                            if (isCollected(referenceentry))
                            {
                                unsetLiveEntry(referenceentry, referenceentry.getHash());
                            } else
                            {
                                int k = referenceentry.getHash() & k1;
                                ReferenceEntry referenceentry2 = (ReferenceEntry)atomicreferencearray1.get(k);
                                atomicreferencearray1.set(k, copyEntry(referenceentry, referenceentry2));
                            }
                            referenceentry = referenceentry.getNext();
                        }
                    }
                }
                i++;
            }
            table = atomicreferencearray1;
        }

        void expireEntries()
        {
            drainRecencyQueue();
            if (!expirationQueue.isEmpty()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            long l = ticker.read();
            do
            {
                ReferenceEntry referenceentry = (ReferenceEntry)expirationQueue.peek();
                if (referenceentry == null || !isExpired(referenceentry, l))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!unsetEntry(referenceentry, referenceentry.getHash()))
                {
                    throw new AssertionError();
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        Object get(Object obj, int i)
        {
            ReferenceEntry referenceentry;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            if (referenceentry.getHash() == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            referenceentry = referenceentry.getNext();
            Object obj1;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj1 = referenceentry.getKey()) == null) goto _L4; else goto _L3
_L3:
            if (!keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L5
_L5:
            obj = getLiveValue(referenceentry);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            recordRead(referenceentry);
            postReadCleanup();
            return obj;
            postReadCleanup();
            return null;
            obj;
            postReadCleanup();
            throw obj;
        }

        ReferenceEntry getEntry(Object obj, int i)
        {
            ReferenceEntry referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            if (referenceentry.getHash() == i)
            {
                break; /* Loop/switch isn't completed */
            }
_L4:
            referenceentry = referenceentry.getNext();
            Object obj1;
            if (true) goto _L2; else goto _L1
_L1:
            if ((obj1 = referenceentry.getKey()) == null || !keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
            return referenceentry;
            return null;
        }

        ReferenceEntry getFirst(int i)
        {
            AtomicReferenceArray atomicreferencearray = table;
            return (ReferenceEntry)atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
        }

        Object getLiveValue(ReferenceEntry referenceentry)
        {
            Object obj;
            if (referenceentry.getKey() == null)
            {
                obj = null;
            } else
            {
                Object obj1 = referenceentry.getValueReference().get();
                if (obj1 == null)
                {
                    return null;
                }
                obj = obj1;
                if (expires())
                {
                    obj = obj1;
                    if (isExpired(referenceentry))
                    {
                        tryExpireEntries();
                        return null;
                    }
                }
            }
            return obj;
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

        AtomicReferenceArray newEntryArray(int i)
        {
            return new AtomicReferenceArray(i);
        }

        void postReadCleanup()
        {
            if ((readCount.incrementAndGet() & 0x3f) == 0)
            {
                if (isInlineCleanup())
                {
                    runCleanup();
                } else
                if (!isHeldByCurrentThread())
                {
                    cleanupExecutor.execute(cleanupRunnable);
                    return;
                }
            }
        }

        void postWriteCleanup()
        {
            if (!isInlineCleanup()) goto _L2; else goto _L1
_L1:
            if (!isHeldByCurrentThread()) goto _L4; else goto _L3
_L3:
            runLockedCleanup();
_L6:
            return;
_L4:
            runUnlockedCleanup();
            return;
_L2:
            if (!isHeldByCurrentThread())
            {
                cleanupExecutor.execute(cleanupRunnable);
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        void preWriteCleanup()
        {
            if (isInlineCleanup())
            {
                runLockedCleanup();
                return;
            } else
            {
                expireEntries();
                return;
            }
        }

        void processPendingCleanup()
        {
            AtomicReferenceArray atomicreferencearray = table;
            int i = 0;
label0:
            do
            {
                if (i < 16)
                {
                    ReferenceEntry referenceentry2 = (ReferenceEntry)cleanupQueue.poll();
                    if (referenceentry2 != null)
                    {
                        int j = referenceentry2.getHash() & atomicreferencearray.length() - 1;
                        ReferenceEntry referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
                        ReferenceEntry referenceentry = referenceentry1;
                        do
                        {
                            if (referenceentry == null)
                            {
                                continue label0;
                            }
                            if (referenceentry == referenceentry2)
                            {
                                if (isUnset(referenceentry))
                                {
                                    atomicreferencearray.set(j, removeFromChain(referenceentry1, referenceentry));
                                    i++;
                                }
                                continue label0;
                            }
                            referenceentry = referenceentry.getNext();
                        } while (true);
                    }
                }
                return;
            } while (true);
        }

        Object put(Object obj, int i, Object obj1, boolean flag)
        {
            Preconditions.checkNotNull(obj1);
            lock();
            int k;
            preWriteCleanup();
            k = count + 1;
            int j = k;
            Object obj2;
            AtomicReferenceArray atomicreferencearray;
            if (k > threshold)
            {
                expand();
                j = count + 1;
            }
            atomicreferencearray = table;
            k = i & atomicreferencearray.length() - 1;
            obj2 = (ReferenceEntry)atomicreferencearray.get(k);
            Object obj3 = obj2;
_L5:
            if (obj3 == null)
            {
                break MISSING_BLOCK_LABEL_231;
            }
            Object obj4 = ((ReferenceEntry) (obj3)).getKey();
            if (((ReferenceEntry) (obj3)).getHash() != i || obj4 == null)
            {
                break MISSING_BLOCK_LABEL_219;
            }
            if (!keyEquivalence.equivalent(obj, obj4))
            {
                break MISSING_BLOCK_LABEL_219;
            }
            obj = ((ReferenceEntry) (obj3)).getValueReference();
            obj2 = ((ValueReference) (obj)).get();
            if (obj2 != null) goto _L2; else goto _L1
_L1:
            modCount = modCount + 1;
            ((ValueReference) (obj)).notifyValueReclaimed();
            evictEntries();
            count = count + 1;
_L4:
            setValue(((ReferenceEntry) (obj3)), obj1);
            unlock();
            postWriteCleanup();
            return obj2;
_L2:
            if (!flag) goto _L4; else goto _L3
_L3:
            recordLockedRead(((ReferenceEntry) (obj3)));
            unlock();
            postWriteCleanup();
            return obj2;
            obj3 = ((ReferenceEntry) (obj3)).getNext();
              goto _L5
            if (evictEntries())
            {
                j = count + 1;
                obj2 = (ReferenceEntry)atomicreferencearray.get(k);
            }
            modCount = modCount + 1;
            obj = newEntry(obj, i, ((ReferenceEntry) (obj2)));
            setValue(((ReferenceEntry) (obj)), obj1);
            atomicreferencearray.set(k, obj);
            count = j;
            unlock();
            postWriteCleanup();
            return null;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        void recordExpirationTime(ReferenceEntry referenceentry, long l)
        {
            referenceentry.setExpirationTime(ticker.read() + l);
        }

        void recordLockedRead(ReferenceEntry referenceentry)
        {
            evictionQueue.add(referenceentry);
            if (expiresAfterAccess())
            {
                recordExpirationTime(referenceentry, expireAfterAccessNanos);
                expirationQueue.add(referenceentry);
            }
        }

        void recordRead(ReferenceEntry referenceentry)
        {
            if (expiresAfterAccess())
            {
                recordExpirationTime(referenceentry, expireAfterAccessNanos);
            }
            recencyQueue.add(referenceentry);
        }

        void recordWrite(ReferenceEntry referenceentry)
        {
            drainRecencyQueue();
            evictionQueue.add(referenceentry);
            if (expires())
            {
                long l;
                if (expiresAfterAccess())
                {
                    l = expireAfterAccessNanos;
                } else
                {
                    l = expireAfterWriteNanos;
                }
                recordExpirationTime(referenceentry, l);
                expirationQueue.add(referenceentry);
            }
        }

        Object remove(Object obj, int i)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L6:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_176;
            }
            if (!keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_176;
            }
            obj = referenceentry.getValueReference().get();
            if (obj != null) goto _L2; else goto _L1
_L1:
            unsetLiveEntry(referenceentry, i);
_L4:
            unlock();
            postWriteCleanup();
            return obj;
_L2:
            modCount = modCount + 1;
            referenceentry = removeFromChain(referenceentry1, referenceentry);
            i = count;
            atomicreferencearray.set(j, referenceentry);
            count = i - 1;
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
            referenceentry = referenceentry.getNext();
            if (true) goto _L6; else goto _L5
_L5:
            unlock();
            postWriteCleanup();
            return null;
        }

        boolean remove(Object obj, int i, Object obj1)
        {
            Preconditions.checkNotNull(obj1);
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup();
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L6:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_201;
            }
            if (!keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_201;
            }
            obj = referenceentry.getValueReference().get();
            if (obj != null) goto _L2; else goto _L1
_L1:
            unsetLiveEntry(referenceentry, i);
_L4:
            unlock();
            postWriteCleanup();
            return false;
_L2:
            if (!valueEquivalence.equivalent(obj1, obj)) goto _L4; else goto _L3
_L3:
            modCount = modCount + 1;
            obj = removeFromChain(referenceentry1, referenceentry);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
            unlock();
            postWriteCleanup();
            return true;
            referenceentry = referenceentry.getNext();
            if (true) goto _L6; else goto _L5
_L5:
            unlock();
            postWriteCleanup();
            return false;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        ReferenceEntry removeFromChain(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            evictionQueue.remove(referenceentry1);
            expirationQueue.remove(referenceentry1);
            ReferenceEntry referenceentry2 = referenceentry1.getNext();
            while (referenceentry != referenceentry1) 
            {
                if (isCollected(referenceentry))
                {
                    unsetLiveEntry(referenceentry, referenceentry.getHash());
                } else
                {
                    referenceentry2 = copyEntry(referenceentry, referenceentry2);
                }
                referenceentry = referenceentry.getNext();
            }
            return referenceentry2;
        }

        Object replace(Object obj, int i, Object obj1)
        {
            Preconditions.checkNotNull(obj1);
            lock();
            ReferenceEntry referenceentry;
            preWriteCleanup();
            referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_120;
            }
            if (!keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_120;
            }
            obj = referenceentry.getValueReference().get();
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_103;
            }
            unsetLiveEntry(referenceentry, i);
            unlock();
            postWriteCleanup();
            return null;
            setValue(referenceentry, obj1);
            unlock();
            postWriteCleanup();
            return obj;
            referenceentry = referenceentry.getNext();
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
            Preconditions.checkNotNull(obj1);
            Preconditions.checkNotNull(obj2);
            lock();
            ReferenceEntry referenceentry;
            preWriteCleanup();
            referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            if (!keyEquivalence.equivalent(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_160;
            }
            obj = referenceentry.getValueReference().get();
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_109;
            }
            unsetLiveEntry(referenceentry, i);
            unlock();
            postWriteCleanup();
            return false;
            if (!valueEquivalence.equivalent(obj1, obj))
            {
                break MISSING_BLOCK_LABEL_144;
            }
            setValue(referenceentry, obj2);
            unlock();
            postWriteCleanup();
            return true;
            recordLockedRead(referenceentry);
            unlock();
            postWriteCleanup();
            return false;
            referenceentry = referenceentry.getNext();
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
            lock();
            expireEntries();
            processPendingCleanup();
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
            processPendingNotifications();
        }

        void setValue(ReferenceEntry referenceentry, Object obj)
        {
            recordWrite(referenceentry);
            referenceentry.setValueReference(newValueReference(referenceentry, obj));
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

        boolean unsetEntry(ReferenceEntry referenceentry, int i)
        {
            for (ReferenceEntry referenceentry1 = getFirst(i); referenceentry1 != null; referenceentry1 = referenceentry1.getNext())
            {
                if (referenceentry1 == referenceentry)
                {
                    return unsetLiveEntry(referenceentry, i);
                }
            }

            return false;
        }

        boolean unsetKey(ReferenceEntry referenceentry, int i)
        {
            lock();
            Object obj;
            int j;
            j = count;
            obj = table;
            obj = (ReferenceEntry)((AtomicReferenceArray) (obj)).get(i & ((AtomicReferenceArray) (obj)).length() - 1);
_L2:
            if (obj == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (obj != referenceentry)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            modCount = modCount + 1;
            enqueueNotification(((ReferenceEntry) (obj)).getKey(), i, ((ReferenceEntry) (obj)).getValueReference());
            enqueueCleanup(((ReferenceEntry) (obj)));
            count = j - 1;
            unlock();
            return true;
            obj = ((ReferenceEntry) (obj)).getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            return false;
            referenceentry;
            unlock();
            throw referenceentry;
        }

        boolean unsetLiveEntry(ReferenceEntry referenceentry, int i)
        {
            if (!isUnset(referenceentry))
            {
                int j = count;
                modCount = modCount + 1;
                ValueReference valuereference = referenceentry.getValueReference();
                if (!valuereference.isComputingReference())
                {
                    Object obj = referenceentry.getKey();
                    enqueueNotification(obj, i, valuereference);
                    enqueueCleanup(referenceentry);
                    count = j - 1;
                    return true;
                }
            }
            return false;
        }

        boolean unsetValue(Object obj, int i, ValueReference valuereference)
        {
            lock();
            ReferenceEntry referenceentry;
            int j;
            j = count;
            referenceentry = getFirst(i);
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            if (!keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_122;
            }
            if (referenceentry.getValueReference() != valuereference)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            modCount = modCount + 1;
            enqueueNotification(obj, i, valuereference);
            enqueueCleanup(referenceentry);
            count = j - 1;
            unlock();
            return true;
            unlock();
            return false;
            referenceentry = referenceentry.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            return false;
            obj;
            unlock();
            throw obj;
        }

        Segment(int i, int j)
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
            maxSegmentSize = j;
            initTable(newEntryArray(i));
            Object obj;
            if (evictsBySize() || expiresAfterAccess())
            {
                obj = new ConcurrentLinkedQueue();
            } else
            {
                obj = CustomConcurrentHashMap.discardingQueue();
            }
            recencyQueue = ((Queue) (obj));
            if (evictsBySize())
            {
                obj = new EvictionQueue();
            } else
            {
                obj = CustomConcurrentHashMap.discardingQueue();
            }
            evictionQueue = ((Queue) (obj));
            if (expires())
            {
                customconcurrenthashmap = new ExpirationQueue();
            } else
            {
                customconcurrenthashmap = CustomConcurrentHashMap.discardingQueue();
            }
            expirationQueue = CustomConcurrentHashMap.this;
        }
    }

    class Segment.EvictionQueue extends AbstractQueue
    {

        final ReferenceEntry head = new _cls1();
        final Segment this$1;

        public void clear()
        {
            ReferenceEntry referenceentry1;
            for (ReferenceEntry referenceentry = head.getNextEvictable(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextEvictable();
                CustomConcurrentHashMap.nullifyEvictable(referenceentry);
            }

            head.setNextEvictable(head);
            head.setPreviousEvictable(head);
        }

        public boolean contains(Object obj)
        {
            return ((ReferenceEntry)obj).getNextEvictable() != NullEntry.INSTANCE;
        }

        public boolean isEmpty()
        {
            return head.getNextEvictable() == head;
        }

        public Iterator iterator()
        {
            return new AbstractLinkedIterator(peek()) {

                final Segment.EvictionQueue this$2;

                protected ReferenceEntry computeNext(ReferenceEntry referenceentry)
                {
                    ReferenceEntry referenceentry1 = referenceentry.getNextEvictable();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected volatile Object computeNext(Object obj)
                {
                    return computeNext((ReferenceEntry)obj);
                }

            
            {
                this$2 = Segment.EvictionQueue.this;
                super(referenceentry);
            }
            };
        }

        public boolean offer(ReferenceEntry referenceentry)
        {
            CustomConcurrentHashMap.connectEvictables(referenceentry.getPreviousEvictable(), referenceentry.getNextEvictable());
            CustomConcurrentHashMap.connectEvictables(head.getPreviousEvictable(), referenceentry);
            CustomConcurrentHashMap.connectEvictables(referenceentry, head);
            return true;
        }

        public volatile boolean offer(Object obj)
        {
            return offer((ReferenceEntry)obj);
        }

        public ReferenceEntry peek()
        {
            ReferenceEntry referenceentry1 = head.getNextEvictable();
            ReferenceEntry referenceentry = referenceentry1;
            if (referenceentry1 == head)
            {
                referenceentry = null;
            }
            return referenceentry;
        }

        public volatile Object peek()
        {
            return peek();
        }

        public ReferenceEntry poll()
        {
            ReferenceEntry referenceentry = head.getNextEvictable();
            if (referenceentry == head)
            {
                return null;
            } else
            {
                remove(referenceentry);
                return referenceentry;
            }
        }

        public volatile Object poll()
        {
            return poll();
        }

        public boolean remove(Object obj)
        {
            obj = (ReferenceEntry)obj;
            ReferenceEntry referenceentry = ((ReferenceEntry) (obj)).getPreviousEvictable();
            ReferenceEntry referenceentry1 = ((ReferenceEntry) (obj)).getNextEvictable();
            CustomConcurrentHashMap.connectEvictables(referenceentry, referenceentry1);
            CustomConcurrentHashMap.nullifyEvictable(((ReferenceEntry) (obj)));
            return referenceentry1 != NullEntry.INSTANCE;
        }

        public int size()
        {
            int i = 0;
            for (ReferenceEntry referenceentry = head.getNextEvictable(); referenceentry != head; referenceentry = referenceentry.getNextEvictable())
            {
                i++;
            }

            return i;
        }

        Segment.EvictionQueue()
        {
            this$1 = Segment.this;
            super();
        }
    }

    class Segment.ExpirationQueue extends AbstractQueue
    {

        final ReferenceEntry head = new _cls1();
        final Segment this$1;

        public void clear()
        {
            ReferenceEntry referenceentry1;
            for (ReferenceEntry referenceentry = head.getNextExpirable(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextExpirable();
                CustomConcurrentHashMap.nullifyExpirable(referenceentry);
            }

            head.setNextExpirable(head);
            head.setPreviousExpirable(head);
        }

        public boolean contains(Object obj)
        {
            return ((ReferenceEntry)obj).getNextExpirable() != NullEntry.INSTANCE;
        }

        public boolean isEmpty()
        {
            return head.getNextExpirable() == head;
        }

        public Iterator iterator()
        {
            return new AbstractLinkedIterator(peek()) {

                final Segment.ExpirationQueue this$2;

                protected ReferenceEntry computeNext(ReferenceEntry referenceentry)
                {
                    ReferenceEntry referenceentry1 = referenceentry.getNextExpirable();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected volatile Object computeNext(Object obj)
                {
                    return computeNext((ReferenceEntry)obj);
                }

            
            {
                this$2 = Segment.ExpirationQueue.this;
                super(referenceentry);
            }
            };
        }

        public boolean offer(ReferenceEntry referenceentry)
        {
            CustomConcurrentHashMap.connectExpirables(referenceentry.getPreviousExpirable(), referenceentry.getNextExpirable());
            CustomConcurrentHashMap.connectExpirables(head.getPreviousExpirable(), referenceentry);
            CustomConcurrentHashMap.connectExpirables(referenceentry, head);
            return true;
        }

        public volatile boolean offer(Object obj)
        {
            return offer((ReferenceEntry)obj);
        }

        public ReferenceEntry peek()
        {
            ReferenceEntry referenceentry1 = head.getNextExpirable();
            ReferenceEntry referenceentry = referenceentry1;
            if (referenceentry1 == head)
            {
                referenceentry = null;
            }
            return referenceentry;
        }

        public volatile Object peek()
        {
            return peek();
        }

        public ReferenceEntry poll()
        {
            ReferenceEntry referenceentry = head.getNextExpirable();
            if (referenceentry == head)
            {
                return null;
            } else
            {
                remove(referenceentry);
                return referenceentry;
            }
        }

        public volatile Object poll()
        {
            return poll();
        }

        public boolean remove(Object obj)
        {
            obj = (ReferenceEntry)obj;
            ReferenceEntry referenceentry = ((ReferenceEntry) (obj)).getPreviousExpirable();
            ReferenceEntry referenceentry1 = ((ReferenceEntry) (obj)).getNextExpirable();
            CustomConcurrentHashMap.connectExpirables(referenceentry, referenceentry1);
            CustomConcurrentHashMap.nullifyExpirable(((ReferenceEntry) (obj)));
            return referenceentry1 != NullEntry.INSTANCE;
        }

        public int size()
        {
            int i = 0;
            for (ReferenceEntry referenceentry = head.getNextExpirable(); referenceentry != head; referenceentry = referenceentry.getNextExpirable())
            {
                i++;
            }

            return i;
        }

        Segment.ExpirationQueue()
        {
            this$1 = Segment.this;
            super();
        }
    }

    private static class SerializationProxy extends AbstractSerializationProxy
    {

        private static final long serialVersionUID = 2L;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            objectinputstream.defaultReadObject();
            _flddelegate = readMapMaker(objectinputstream).makeMap();
            readEntries(objectinputstream);
        }

        private Object readResolve()
        {
            return _flddelegate;
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.defaultWriteObject();
            writeMapTo(objectoutputstream);
        }

        SerializationProxy(Strength strength, Strength strength1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, MapEvictionListener mapevictionlistener, ConcurrentMap concurrentmap)
        {
            super(strength, strength1, equivalence, equivalence1, l, l1, i, j, mapevictionlistener, concurrentmap);
        }
    }

    private static class SoftEntry extends FinalizableSoftReference
        implements ReferenceEntry
    {

        final int hash;
        final CustomConcurrentHashMap map;
        final ReferenceEntry next;
        volatile ValueReference valueReference;

        public void finalizeReferent()
        {
            notifyKeyReclaimed();
        }

        public long getExpirationTime()
        {
            throw new UnsupportedOperationException();
        }

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return get();
        }

        public ReferenceEntry getNext()
        {
            return next;
        }

        public ReferenceEntry getNextEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void notifyKeyReclaimed()
        {
            map.reclaimKey(this);
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
            map.reclaimValue(this, valuereference);
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference valuereference)
        {
            ValueReference valuereference1 = valueReference;
            valueReference = valuereference;
            valuereference1.clear();
        }

        SoftEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            valueReference = CustomConcurrentHashMap.unset();
            map = customconcurrenthashmap;
            hash = i;
            next = referenceentry;
        }
    }

    private static class SoftEvictableEntry extends SoftEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry previousEvictable;

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        SoftEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class SoftExpirableEntry extends SoftEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextExpirable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        SoftExpirableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class SoftExpirableEvictableEntry extends SoftEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry nextExpirable;
        ReferenceEntry previousEvictable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        SoftExpirableEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class SoftValueReference extends FinalizableSoftReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return new SoftValueReference(get(), referenceentry);
        }

        public void finalizeReferent()
        {
            entry.notifyValueReclaimed(this);
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
            finalizeReferent();
        }

        public Object waitForValue()
        {
            return get();
        }

        SoftValueReference(Object obj, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            entry = referenceentry;
        }
    }

    static abstract class Strength extends Enum
    {

        private static final Strength $VALUES[];
        public static final Strength SOFT;
        public static final Strength STRONG;
        public static final Strength WEAK;

        public static Strength valueOf(String s)
        {
            return (Strength)Enum.valueOf(com/google/common/collect/CustomConcurrentHashMap$Strength, s);
        }

        public static Strength[] values()
        {
            return (Strength[])$VALUES.clone();
        }

        abstract Equivalence defaultEquivalence();

        abstract ValueReference referenceValue(ReferenceEntry referenceentry, Object obj);

        static 
        {
            STRONG = new Strength("STRONG", 0) {

                Equivalence defaultEquivalence()
                {
                    return Equivalences.equals();
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new StrongValueReference(obj);
                }

            };
            SOFT = new Strength("SOFT", 1) {

                Equivalence defaultEquivalence()
                {
                    return Equivalences.identity();
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new SoftValueReference(obj, referenceentry);
                }

            };
            WEAK = new Strength("WEAK", 2) {

                Equivalence defaultEquivalence()
                {
                    return Equivalences.identity();
                }

                ValueReference referenceValue(ReferenceEntry referenceentry, Object obj)
                {
                    return new WeakValueReference(obj, referenceentry);
                }

            };
            $VALUES = (new Strength[] {
                STRONG, SOFT, WEAK
            });
        }

        private Strength(String s, int i)
        {
            super(s, i);
        }

    }

    private static class StrongEntry
        implements ReferenceEntry
    {

        final int hash;
        final Object key;
        final CustomConcurrentHashMap map;
        final ReferenceEntry next;
        volatile ValueReference valueReference;

        public long getExpirationTime()
        {
            throw new UnsupportedOperationException();
        }

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return key;
        }

        public ReferenceEntry getNext()
        {
            return next;
        }

        public ReferenceEntry getNextEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
            map.reclaimValue(this, valuereference);
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference valuereference)
        {
            ValueReference valuereference1 = valueReference;
            valueReference = valuereference;
            valuereference1.clear();
        }

        StrongEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            valueReference = CustomConcurrentHashMap.unset();
            map = customconcurrenthashmap;
            key = obj;
            hash = i;
            next = referenceentry;
        }
    }

    private static class StrongEvictableEntry extends StrongEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry previousEvictable;

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        StrongEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class StrongExpirableEntry extends StrongEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextExpirable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        StrongExpirableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class StrongExpirableEvictableEntry extends StrongEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry nextExpirable;
        ReferenceEntry previousEvictable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        StrongExpirableEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class StrongValueReference
        implements ValueReference
    {

        final Object referent;

        public void clear()
        {
        }

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return referent;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
        }

        public Object waitForValue()
        {
            return get();
        }

        StrongValueReference(Object obj)
        {
            referent = obj;
        }
    }

    final class ValueIterator extends HashIterator
        implements Iterator
    {

        final CustomConcurrentHashMap this$0;

        public Object next()
        {
            return nextEntry().getValue();
        }

        ValueIterator()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    static interface ValueReference
    {

        public abstract void clear();

        public abstract ValueReference copyFor(ReferenceEntry referenceentry);

        public abstract Object get();

        public abstract boolean isComputingReference();

        public abstract void notifyValueReclaimed();

        public abstract Object waitForValue()
            throws InterruptedException;
    }

    final class Values extends AbstractCollection
    {

        final CustomConcurrentHashMap this$0;

        public void clear()
        {
            CustomConcurrentHashMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsValue(obj);
        }

        public boolean isEmpty()
        {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public Iterator iterator()
        {
            return new ValueIterator();
        }

        public int size()
        {
            return CustomConcurrentHashMap.this.size();
        }

        Values()
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
        }
    }

    private static class WeakEntry extends FinalizableWeakReference
        implements ReferenceEntry
    {

        final int hash;
        final CustomConcurrentHashMap map;
        final ReferenceEntry next;
        volatile ValueReference valueReference;

        public void finalizeReferent()
        {
            notifyKeyReclaimed();
        }

        public long getExpirationTime()
        {
            throw new UnsupportedOperationException();
        }

        public int getHash()
        {
            return hash;
        }

        public Object getKey()
        {
            return get();
        }

        public ReferenceEntry getNext()
        {
            return next;
        }

        public ReferenceEntry getNextEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ValueReference getValueReference()
        {
            return valueReference;
        }

        public void notifyKeyReclaimed()
        {
            map.reclaimKey(this);
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
            map.reclaimValue(this, valuereference);
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference valuereference)
        {
            ValueReference valuereference1 = valueReference;
            valueReference = valuereference;
            valuereference1.clear();
        }

        WeakEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            valueReference = CustomConcurrentHashMap.unset();
            map = customconcurrenthashmap;
            hash = i;
            next = referenceentry;
        }
    }

    private static class WeakEvictableEntry extends WeakEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry previousEvictable;

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        WeakEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class WeakExpirableEntry extends WeakEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextExpirable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        WeakExpirableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class WeakExpirableEvictableEntry extends WeakEntry
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry nextExpirable;
        ReferenceEntry previousEvictable;
        ReferenceEntry previousExpirable;
        volatile long time;

        public long getExpirationTime()
        {
            return time;
        }

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public void setExpirationTime(long l)
        {
            time = l;
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        WeakExpirableEvictableEntry(CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(customconcurrenthashmap, obj, i, referenceentry);
            time = 0x7fffffffffffffffL;
            nextExpirable = CustomConcurrentHashMap.nullEntry();
            previousExpirable = CustomConcurrentHashMap.nullEntry();
            nextEvictable = CustomConcurrentHashMap.nullEntry();
            previousEvictable = CustomConcurrentHashMap.nullEntry();
        }
    }

    private static class WeakValueReference extends FinalizableWeakReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return new WeakValueReference(get(), referenceentry);
        }

        public void finalizeReferent()
        {
            entry.notifyValueReclaimed(this);
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
            finalizeReferent();
        }

        public Object waitForValue()
        {
            return get();
        }

        WeakValueReference(Object obj, ReferenceEntry referenceentry)
        {
            super(obj, QueueHolder.queue);
            entry = referenceentry;
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry
    {

        final Object key;
        final CustomConcurrentHashMap this$0;
        Object value;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                flag = flag1;
                if (key.equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    flag = flag1;
                    if (value.equals(((java.util.Map.Entry) (obj)).getValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public Object getKey()
        {
            return key;
        }

        public Object getValue()
        {
            return value;
        }

        public int hashCode()
        {
            return key.hashCode() ^ value.hashCode();
        }

        public Object setValue(Object obj)
        {
            Object obj1 = put(key, obj);
            value = obj;
            return obj1;
        }

        WriteThroughEntry(Object obj, Object obj1)
        {
            this$0 = CustomConcurrentHashMap.this;
            super();
            key = obj;
            value = obj1;
        }
    }


    static final int CLEANUP_MAX = 16;
    static final Queue DISCARDING_QUEUE = new AbstractQueue() {

        public Iterator iterator()
        {
            return Iterators.emptyIterator();
        }

        public boolean offer(ReferenceEntry referenceentry)
        {
            return true;
        }

        public volatile boolean offer(Object obj)
        {
            return offer((ReferenceEntry)obj);
        }

        public ReferenceEntry peek()
        {
            return null;
        }

        public volatile Object peek()
        {
            return peek();
        }

        public ReferenceEntry poll()
        {
            return null;
        }

        public volatile Object poll()
        {
            return poll();
        }

        public int size()
        {
            return 0;
        }

    };
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 0x40000000;
    static final int MAX_SEGMENTS = 0x10000;
    static final ValueReference UNSET = new ValueReference() {

        public void clear()
        {
        }

        public ValueReference copyFor(ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return null;
        }

        public boolean isComputingReference()
        {
            return false;
        }

        public void notifyValueReclaimed()
        {
        }

        public Object waitForValue()
        {
            return null;
        }

    };
    private static final long serialVersionUID = 4L;
    final Executor cleanupExecutor;
    final int concurrencyLevel;
    final transient EntryFactory entryFactory;
    Set entrySet;
    final MapEvictionListener evictionListener;
    final Queue evictionNotificationQueue;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence keyEquivalence;
    Set keySet;
    final Strength keyStrength;
    final int maximumSize;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient Segment segments[];
    final Ticker ticker;
    final Equivalence valueEquivalence;
    final Strength valueStrength;
    Collection values;

    CustomConcurrentHashMap(MapMaker mapmaker)
    {
        concurrencyLevel = Math.min(mapmaker.getConcurrencyLevel(), 0x10000);
        keyStrength = mapmaker.getKeyStrength();
        valueStrength = mapmaker.getValueStrength();
        keyEquivalence = mapmaker.getKeyEquivalence();
        valueEquivalence = mapmaker.getValueEquivalence();
        maximumSize = mapmaker.maximumSize;
        expireAfterAccessNanos = mapmaker.getExpireAfterAccessNanos();
        expireAfterWriteNanos = mapmaker.getExpireAfterWriteNanos();
        entryFactory = EntryFactory.getFactory(keyStrength, expires(), evictsBySize());
        cleanupExecutor = mapmaker.getCleanupExecutor();
        ticker = mapmaker.getTicker();
        evictionListener = mapmaker.getEvictionListener();
        Object obj;
        int i;
        int k;
        int l;
        if (evictionListener == MapMaker.NullListener.INSTANCE)
        {
            obj = discardingQueue();
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        evictionNotificationQueue = ((Queue) (obj));
        i = Math.min(mapmaker.getInitialCapacity(), 0x40000000);
        k = i;
        if (evictsBySize())
        {
            k = Math.min(i, maximumSize);
        }
        l = 0;
        for (i = 1; i < concurrencyLevel && (!evictsBySize() || i * 2 <= maximumSize); i <<= 1)
        {
            l++;
        }

        segmentShift = 32 - l;
        segmentMask = i - 1;
        segments = newSegmentArray(i);
        int j1 = k / i;
        l = j1;
        if (j1 * i < k)
        {
            l = j1 + 1;
        }
        for (k = 1; k < l; k <<= 1) { }
        if (evictsBySize())
        {
            int k1 = maximumSize / i + 1;
            int i2 = maximumSize;
            for (int i1 = 0; i1 < segments.length;)
            {
                int l1 = k1;
                if (i1 == i2 % i)
                {
                    l1 = k1 - 1;
                }
                segments[i1] = createSegment(k, l1);
                i1++;
                k1 = l1;
            }

        } else
        {
            for (int j = 0; j < segments.length; j++)
            {
                segments[j] = createSegment(k, -1);
            }

        }
    }

    static void connectEvictables(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextEvictable(referenceentry1);
        referenceentry1.setPreviousEvictable(referenceentry);
    }

    static void connectExpirables(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextExpirable(referenceentry1);
        referenceentry1.setPreviousExpirable(referenceentry);
    }

    static Queue discardingQueue()
    {
        return DISCARDING_QUEUE;
    }

    static ReferenceEntry nullEntry()
    {
        return NullEntry.INSTANCE;
    }

    static void nullifyEvictable(ReferenceEntry referenceentry)
    {
        ReferenceEntry referenceentry1 = nullEntry();
        referenceentry.setNextEvictable(referenceentry1);
        referenceentry.setPreviousEvictable(referenceentry1);
    }

    static void nullifyExpirable(ReferenceEntry referenceentry)
    {
        ReferenceEntry referenceentry1 = nullEntry();
        referenceentry.setNextExpirable(referenceentry1);
        referenceentry.setPreviousExpirable(referenceentry1);
    }

    private static int rehash(int i)
    {
        i += i << 15 ^ 0xffffcd7d;
        i ^= i >>> 10;
        i += i << 3;
        i ^= i >>> 6;
        i += (i << 2) + (i << 14);
        return i >>> 16 ^ i;
    }

    static ValueReference unset()
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
        int i = hash(obj);
        return segmentFor(i).containsKey(obj, i);
    }

    public boolean containsValue(Object obj)
    {
        Preconditions.checkNotNull(obj);
        Segment asegment[] = segments;
        for (int i = 0; i < asegment.length; i++)
        {
            int j = asegment[i].count;
            if (asegment[i].containsValue(obj))
            {
                return true;
            }
        }

        return false;
    }

    ReferenceEntry copyEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        ValueReference valuereference = referenceentry.getValueReference();
        referenceentry = entryFactory.copyEntry(this, referenceentry, referenceentry1);
        referenceentry.setValueReference(valuereference.copyFor(referenceentry));
        return referenceentry;
    }

    Segment createSegment(int i, int j)
    {
        return new Segment(i, j);
    }

    void enqueueNotification(Object obj, int i, ValueReference valuereference)
    {
        if (evictionNotificationQueue == DISCARDING_QUEUE)
        {
            return;
        } else
        {
            obj = newEntry(obj, i, null);
            ((ReferenceEntry) (obj)).setValueReference(valuereference.copyFor(((ReferenceEntry) (obj))));
            evictionNotificationQueue.offer(obj);
            return;
        }
    }

    public Set entrySet()
    {
        Set set = entrySet;
        if (set != null)
        {
            return set;
        } else
        {
            EntrySet entryset = new EntrySet();
            entrySet = entryset;
            return entryset;
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
        int i = hash(obj);
        return segmentFor(i).get(obj, i);
    }

    ReferenceEntry getEntry(Object obj)
    {
        int i = hash(obj);
        return segmentFor(i).getEntry(obj, i);
    }

    int hash(Object obj)
    {
        return rehash(keyEquivalence.hash(Preconditions.checkNotNull(obj)));
    }

    boolean isCollected(ReferenceEntry referenceentry)
    {
        if (referenceentry.getKey() != null)
        {
            referenceentry = referenceentry.getValueReference();
            if (referenceentry.isComputingReference())
            {
                return false;
            }
            if (referenceentry.get() != null)
            {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty()
    {
        Segment asegment[];
        int ai[];
        int i;
        int k;
        asegment = segments;
        ai = new int[asegment.length];
        k = 0;
        i = 0;
_L7:
        if (i >= asegment.length) goto _L2; else goto _L1
_L1:
        if (asegment[i].count == 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        int l = asegment[i].modCount;
        ai[i] = l;
        k += l;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
label0:
        {
            if (k == 0)
            {
                break label0;
            }
            int j = 0;
            do
            {
                if (j >= asegment.length)
                {
                    break label0;
                }
                if (asegment[j].count != 0 || ai[j] != asegment[j].modCount)
                {
                    break;
                }
                j++;
            } while (true);
        }
        if (true) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    boolean isExpired(ReferenceEntry referenceentry)
    {
        return isExpired(referenceentry, ticker.read());
    }

    boolean isExpired(ReferenceEntry referenceentry, long l)
    {
        return l - referenceentry.getExpirationTime() > 0L;
    }

    boolean isInlineCleanup()
    {
        return cleanupExecutor == MapMaker.DEFAULT_CLEANUP_EXECUTOR;
    }

    boolean isLive(ReferenceEntry referenceentry)
    {
        return segmentFor(referenceentry.getHash()).getLiveValue(referenceentry) != null;
    }

    boolean isUnset(ReferenceEntry referenceentry)
    {
        return isUnset(referenceentry.getValueReference());
    }

    boolean isUnset(ValueReference valuereference)
    {
        return valuereference == UNSET;
    }

    public Set keySet()
    {
        Set set = keySet;
        if (set != null)
        {
            return set;
        } else
        {
            KeySet keyset = new KeySet();
            keySet = keyset;
            return keyset;
        }
    }

    ReferenceEntry newEntry(Object obj, int i, ReferenceEntry referenceentry)
    {
        return entryFactory.newEntry(this, obj, i, referenceentry);
    }

    final Segment[] newSegmentArray(int i)
    {
        return (Segment[])(Segment[])Array.newInstance(com/google/common/collect/CustomConcurrentHashMap$Segment, i);
    }

    ValueReference newValueReference(ReferenceEntry referenceentry, Object obj)
    {
        return valueStrength.referenceValue(referenceentry, obj);
    }

    void processPendingNotifications()
    {
        do
        {
            ReferenceEntry referenceentry = (ReferenceEntry)evictionNotificationQueue.poll();
            if (referenceentry != null)
            {
                evictionListener.onEviction(referenceentry.getKey(), referenceentry.getValueReference().get());
            } else
            {
                return;
            }
        } while (true);
    }

    public Object put(Object obj, Object obj1)
    {
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
        int i = hash(obj);
        return segmentFor(i).put(obj, i, obj1, true);
    }

    void reclaimKey(ReferenceEntry referenceentry)
    {
        int i = referenceentry.getHash();
        segmentFor(i).unsetKey(referenceentry, i);
    }

    void reclaimValue(ReferenceEntry referenceentry, ValueReference valuereference)
    {
        int i = referenceentry.getHash();
        Segment segment = segmentFor(i);
        segment.unsetValue(referenceentry.getKey(), i, valuereference);
        if (!segment.isHeldByCurrentThread())
        {
            segment.postWriteCleanup();
        }
    }

    public Object remove(Object obj)
    {
        int i = hash(obj);
        return segmentFor(i).remove(obj, i);
    }

    public boolean remove(Object obj, Object obj1)
    {
        int i = hash(obj);
        return segmentFor(i).remove(obj, i, obj1);
    }

    public Object replace(Object obj, Object obj1)
    {
        int i = hash(obj);
        return segmentFor(i).replace(obj, i, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        int i = hash(obj);
        return segmentFor(i).replace(obj, i, obj1, obj2);
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

        return Ints.saturatedCast(l);
    }

    public Collection values()
    {
        Collection collection = values;
        if (collection != null)
        {
            return collection;
        } else
        {
            Values values1 = new Values();
            values = values1;
            return values1;
        }
    }

    Object writeReplace()
    {
        return new SerializationProxy(keyStrength, valueStrength, keyEquivalence, valueEquivalence, expireAfterWriteNanos, expireAfterAccessNanos, maximumSize, concurrencyLevel, evictionListener, this);
    }


    // Unreferenced inner class com/google/common/collect/CustomConcurrentHashMap$Segment$1

/* anonymous class */
    class Segment._cls1
        implements Runnable
    {

        final Segment this$1;

        public void run()
        {
            runCleanup();
        }

            
            {
                this$1 = Segment.this;
                super();
            }
    }


    // Unreferenced inner class com/google/common/collect/CustomConcurrentHashMap$Segment$EvictionQueue$1

/* anonymous class */
    class Segment.EvictionQueue._cls1
        implements ReferenceEntry
    {

        ReferenceEntry nextEvictable;
        ReferenceEntry previousEvictable;
        final Segment.EvictionQueue this$2;

        public long getExpirationTime()
        {
            throw new UnsupportedOperationException();
        }

        public int getHash()
        {
            throw new UnsupportedOperationException();
        }

        public Object getKey()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNext()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = Segment.EvictionQueue.this;
                super();
                nextEvictable = this;
                previousEvictable = this;
            }
    }


    // Unreferenced inner class com/google/common/collect/CustomConcurrentHashMap$Segment$ExpirationQueue$1

/* anonymous class */
    class Segment.ExpirationQueue._cls1
        implements ReferenceEntry
    {

        ReferenceEntry nextExpirable;
        ReferenceEntry previousExpirable;
        final Segment.ExpirationQueue this$2;

        public long getExpirationTime()
        {
            return 0x7fffffffffffffffL;
        }

        public int getHash()
        {
            throw new UnsupportedOperationException();
        }

        public Object getKey()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNext()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long l)
        {
        }

        public void setNextEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        public void setValueReference(ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = Segment.ExpirationQueue.this;
                super();
                nextExpirable = this;
                previousExpirable = this;
            }
    }

}
