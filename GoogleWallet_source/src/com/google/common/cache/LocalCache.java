// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import com.google.common.base.Ticker;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.Iterators;
import com.google.common.primitives.Ints;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
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
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.cache:
//            CacheBuilder, RemovalNotification, CacheLoader, RemovalListener, 
//            Weigher, LoadingCache, Cache, RemovalCause

class LocalCache extends AbstractMap
    implements ConcurrentMap
{
    abstract class AbstractCacheSet extends AbstractSet
    {

        final ConcurrentMap map;
        final LocalCache this$0;

        public void clear()
        {
            map.clear();
        }

        public boolean isEmpty()
        {
            return map.isEmpty();
        }

        public int size()
        {
            return map.size();
        }

        AbstractCacheSet(ConcurrentMap concurrentmap)
        {
            this$0 = LocalCache.this;
            super();
            map = concurrentmap;
        }
    }

    static abstract class AbstractReferenceEntry
        implements ReferenceEntry
    {

        public long getAccessTime()
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

        public ReferenceEntry getNextInAccessQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextInWriteQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousInAccessQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousInWriteQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public long getWriteTime()
        {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setWriteTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        AbstractReferenceEntry()
        {
        }
    }

    static final class AccessQueue extends AbstractQueue
    {

        final ReferenceEntry head = new _cls1();

        private boolean offer(ReferenceEntry referenceentry)
        {
            LocalCache.connectAccessOrder(referenceentry.getPreviousInAccessQueue(), referenceentry.getNextInAccessQueue());
            LocalCache.connectAccessOrder(head.getPreviousInAccessQueue(), referenceentry);
            LocalCache.connectAccessOrder(referenceentry, head);
            return true;
        }

        private ReferenceEntry peek()
        {
            ReferenceEntry referenceentry1 = head.getNextInAccessQueue();
            ReferenceEntry referenceentry = referenceentry1;
            if (referenceentry1 == head)
            {
                referenceentry = null;
            }
            return referenceentry;
        }

        private ReferenceEntry poll()
        {
            ReferenceEntry referenceentry = head.getNextInAccessQueue();
            if (referenceentry == head)
            {
                return null;
            } else
            {
                remove(referenceentry);
                return referenceentry;
            }
        }

        public final void clear()
        {
            ReferenceEntry referenceentry1;
            for (ReferenceEntry referenceentry = head.getNextInAccessQueue(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextInAccessQueue();
                LocalCache.nullifyAccessOrder(referenceentry);
            }

            head.setNextInAccessQueue(head);
            head.setPreviousInAccessQueue(head);
        }

        public final boolean contains(Object obj)
        {
            return ((ReferenceEntry)obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty()
        {
            return head.getNextInAccessQueue() == head;
        }

        public final Iterator iterator()
        {
            return new AbstractSequentialIterator(peek()) {

                final AccessQueue this$0;

                private ReferenceEntry computeNext(ReferenceEntry referenceentry)
                {
                    ReferenceEntry referenceentry1 = referenceentry.getNextInAccessQueue();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected final volatile Object computeNext(Object obj)
                {
                    return computeNext((ReferenceEntry)obj);
                }

            
            {
                this$0 = AccessQueue.this;
                super(referenceentry);
            }
            };
        }

        public final volatile boolean offer(Object obj)
        {
            return offer((ReferenceEntry)obj);
        }

        public final volatile Object peek()
        {
            return peek();
        }

        public final volatile Object poll()
        {
            return poll();
        }

        public final boolean remove(Object obj)
        {
            obj = (ReferenceEntry)obj;
            ReferenceEntry referenceentry = ((ReferenceEntry) (obj)).getPreviousInAccessQueue();
            ReferenceEntry referenceentry1 = ((ReferenceEntry) (obj)).getNextInAccessQueue();
            LocalCache.connectAccessOrder(referenceentry, referenceentry1);
            LocalCache.nullifyAccessOrder(((ReferenceEntry) (obj)));
            return referenceentry1 != NullEntry.INSTANCE;
        }

        public final int size()
        {
            int i = 0;
            for (ReferenceEntry referenceentry = head.getNextInAccessQueue(); referenceentry != head; referenceentry = referenceentry.getNextInAccessQueue())
            {
                i++;
            }

            return i;
        }

        AccessQueue()
        {
        }
    }

    static abstract class EntryFactory extends Enum
    {

        private static final EntryFactory $VALUES[];
        public static final EntryFactory STRONG;
        public static final EntryFactory STRONG_ACCESS;
        public static final EntryFactory STRONG_ACCESS_WRITE;
        public static final EntryFactory STRONG_WRITE;
        public static final EntryFactory WEAK;
        public static final EntryFactory WEAK_ACCESS;
        public static final EntryFactory WEAK_ACCESS_WRITE;
        public static final EntryFactory WEAK_WRITE;
        static final EntryFactory factories[];

        static void copyAccessEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            referenceentry1.setAccessTime(referenceentry.getAccessTime());
            LocalCache.connectAccessOrder(referenceentry.getPreviousInAccessQueue(), referenceentry1);
            LocalCache.connectAccessOrder(referenceentry1, referenceentry.getNextInAccessQueue());
            LocalCache.nullifyAccessOrder(referenceentry);
        }

        static void copyWriteEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            referenceentry1.setWriteTime(referenceentry.getWriteTime());
            LocalCache.connectWriteOrder(referenceentry.getPreviousInWriteQueue(), referenceentry1);
            LocalCache.connectWriteOrder(referenceentry1, referenceentry.getNextInWriteQueue());
            LocalCache.nullifyWriteOrder(referenceentry);
        }

        static EntryFactory getFactory(Strength strength, boolean flag, boolean flag1)
        {
            byte byte1 = 0;
            byte byte0;
            boolean flag2;
            if (strength == Strength.WEAK)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte1 = 2;
            }
            return factories[flag2 | byte0 | byte1];
        }

        public static EntryFactory valueOf(String s)
        {
            return (EntryFactory)Enum.valueOf(com/google/common/cache/LocalCache$EntryFactory, s);
        }

        public static EntryFactory[] values()
        {
            return (EntryFactory[])$VALUES.clone();
        }

        ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            return newEntry(segment, referenceentry.getKey(), referenceentry.getHash(), referenceentry1);
        }

        abstract ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry);

        static 
        {
            STRONG = new EntryFactory("STRONG", 0) {

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongEntry(obj, i, referenceentry);
                }

            };
            STRONG_ACCESS = new EntryFactory("STRONG_ACCESS", 1) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyAccessEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongAccessEntry(obj, i, referenceentry);
                }

            };
            STRONG_WRITE = new EntryFactory("STRONG_WRITE", 2) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyWriteEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongWriteEntry(obj, i, referenceentry);
                }

            };
            STRONG_ACCESS_WRITE = new EntryFactory("STRONG_ACCESS_WRITE", 3) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyAccessEntry(referenceentry, segment);
                    copyWriteEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new StrongAccessWriteEntry(obj, i, referenceentry);
                }

            };
            WEAK = new EntryFactory("WEAK", 4) {

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakEntry(segment.keyReferenceQueue, obj, i, referenceentry);
                }

            };
            WEAK_ACCESS = new EntryFactory("WEAK_ACCESS", 5) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyAccessEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakAccessEntry(segment.keyReferenceQueue, obj, i, referenceentry);
                }

            };
            WEAK_WRITE = new EntryFactory("WEAK_WRITE", 6) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyWriteEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakWriteEntry(segment.keyReferenceQueue, obj, i, referenceentry);
                }

            };
            WEAK_ACCESS_WRITE = new EntryFactory("WEAK_ACCESS_WRITE", 7) {

                final ReferenceEntry copyEntry(Segment segment, ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
                {
                    segment = super.copyEntry(segment, referenceentry, referenceentry1);
                    copyAccessEntry(referenceentry, segment);
                    copyWriteEntry(referenceentry, segment);
                    return segment;
                }

                final ReferenceEntry newEntry(Segment segment, Object obj, int i, ReferenceEntry referenceentry)
                {
                    return new WeakAccessWriteEntry(segment.keyReferenceQueue, obj, i, referenceentry);
                }

            };
            $VALUES = (new EntryFactory[] {
                STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE
            });
            factories = (new EntryFactory[] {
                STRONG, STRONG_ACCESS, STRONG_WRITE, STRONG_ACCESS_WRITE, WEAK, WEAK_ACCESS, WEAK_WRITE, WEAK_ACCESS_WRITE
            });
        }

        private EntryFactory(String s, int i)
        {
            super(s, i);
        }

    }

    final class EntryIterator extends HashIterator
    {

        final LocalCache this$0;

        private java.util.Map.Entry next()
        {
            return nextEntry();
        }

        public final volatile Object next()
        {
            return next();
        }

        EntryIterator()
        {
            this$0 = LocalCache.this;
            super();
        }
    }

    final class EntrySet extends AbstractCacheSet
    {

        final LocalCache this$0;

        public final boolean contains(Object obj)
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

        public final Iterator iterator()
        {
            return new EntryIterator();
        }

        public final boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                if (obj1 != null && LocalCache.this.remove(obj1, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return true;
                }
            }
            return false;
        }

        EntrySet(ConcurrentMap concurrentmap)
        {
            this$0 = LocalCache.this;
            super(concurrentmap);
        }
    }

    abstract class HashIterator
        implements Iterator
    {

        Segment currentSegment;
        AtomicReferenceArray currentTable;
        WriteThroughEntry lastReturned;
        ReferenceEntry nextEntry;
        WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex;
        final LocalCache this$0;

        private void advance()
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
                    currentSegment = asegment[i];
                    if (currentSegment.count != 0)
                    {
                        currentTable = currentSegment.table;
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

        private boolean advanceTo(ReferenceEntry referenceentry)
        {
            Object obj;
            long l = ticker.read();
            obj = referenceentry.getKey();
            referenceentry = ((ReferenceEntry) (getLiveValue(referenceentry, l)));
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            nextExternal = new WriteThroughEntry(obj, referenceentry);
            currentSegment.postReadCleanup();
            return true;
            currentSegment.postReadCleanup();
            return false;
            referenceentry;
            currentSegment.postReadCleanup();
            throw referenceentry;
        }

        private boolean nextInChain()
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

        private boolean nextInTable()
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

        public boolean hasNext()
        {
            return nextExternal != null;
        }

        final WriteThroughEntry nextEntry()
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
            LocalCache.this.remove(lastReturned.getKey());
            lastReturned = null;
        }

        HashIterator()
        {
            this$0 = LocalCache.this;
            super();
            nextSegmentIndex = segments.length - 1;
            nextTableIndex = -1;
            advance();
        }
    }

    final class KeyIterator extends HashIterator
    {

        final LocalCache this$0;

        public final Object next()
        {
            return nextEntry().getKey();
        }

        KeyIterator()
        {
            this$0 = LocalCache.this;
            super();
        }
    }

    final class KeySet extends AbstractCacheSet
    {

        final LocalCache this$0;

        public final boolean contains(Object obj)
        {
            return map.containsKey(obj);
        }

        public final Iterator iterator()
        {
            return new KeyIterator();
        }

        public final boolean remove(Object obj)
        {
            return map.remove(obj) != null;
        }

        KeySet(ConcurrentMap concurrentmap)
        {
            this$0 = LocalCache.this;
            super(concurrentmap);
        }
    }

    static final class LoadingValueReference
        implements ValueReference
    {

        final SettableFuture futureValue;
        volatile ValueReference oldValue;
        final Stopwatch stopwatch;

        private static ListenableFuture fullyFailedFuture(Throwable throwable)
        {
            return Futures.immediateFailedFuture(throwable);
        }

        public final ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return this;
        }

        public final long elapsedNanos()
        {
            return stopwatch.elapsed(TimeUnit.NANOSECONDS);
        }

        public final Object get()
        {
            return oldValue.get();
        }

        public final ReferenceEntry getEntry()
        {
            return null;
        }

        public final ValueReference getOldValue()
        {
            return oldValue;
        }

        public final int getWeight()
        {
            return oldValue.getWeight();
        }

        public final boolean isActive()
        {
            return oldValue.isActive();
        }

        public final boolean isLoading()
        {
            return true;
        }

        public final ListenableFuture loadFuture(Object obj, CacheLoader cacheloader)
        {
            Object obj1;
            stopwatch.start();
            obj1 = oldValue.get();
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            obj = cacheloader.load(obj);
            if (set(obj))
            {
                return futureValue;
            } else
            {
                return Futures.immediateFuture(obj);
            }
            obj = cacheloader.reload(obj, obj1);
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            return Futures.immediateFuture(null);
            obj = Futures.transform(((ListenableFuture) (obj)), new Function() {

                final LoadingValueReference this$0;

                public final Object apply(Object obj)
                {
                    set(obj);
                    return obj;
                }

            
            {
                this$0 = LoadingValueReference.this;
                super();
            }
            });
            return ((ListenableFuture) (obj));
            obj;
            if (obj instanceof InterruptedException)
            {
                Thread.currentThread().interrupt();
            }
            if (setException(((Throwable) (obj))))
            {
                return futureValue;
            } else
            {
                return fullyFailedFuture(((Throwable) (obj)));
            }
        }

        public final void notifyNewValue(Object obj)
        {
            if (obj != null)
            {
                set(obj);
                return;
            } else
            {
                oldValue = LocalCache.unset();
                return;
            }
        }

        public final boolean set(Object obj)
        {
            return futureValue.set(obj);
        }

        public final boolean setException(Throwable throwable)
        {
            return futureValue.setException(throwable);
        }

        public final Object waitForValue()
            throws ExecutionException
        {
            return Uninterruptibles.getUninterruptibly(futureValue);
        }

        public LoadingValueReference()
        {
            this(LocalCache.unset());
        }

        public LoadingValueReference(ValueReference valuereference)
        {
            futureValue = SettableFuture.create();
            stopwatch = Stopwatch.createUnstarted();
            oldValue = valuereference;
        }
    }

    static final class LocalLoadingCache extends LocalManualCache
        implements LoadingCache
    {

        private Object getUnchecked(Object obj)
        {
            try
            {
                obj = get(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new UncheckedExecutionException(((ExecutionException) (obj)).getCause());
            }
            return obj;
        }

        public final Object apply(Object obj)
        {
            return getUnchecked(obj);
        }

        public final Object get(Object obj)
            throws ExecutionException
        {
            return localCache.getOrLoad(obj);
        }

        LocalLoadingCache(CacheBuilder cachebuilder, CacheLoader cacheloader)
        {
            super(new LocalCache(cachebuilder, (CacheLoader)Preconditions.checkNotNull(cacheloader)));
        }
    }

    static class LocalManualCache
        implements Cache, Serializable
    {

        final LocalCache localCache;

        public final ConcurrentMap asMap()
        {
            return localCache;
        }

        public final Object get(Object obj, Callable callable)
            throws ExecutionException
        {
            Preconditions.checkNotNull(callable);
            return localCache.get(obj, callable. new CacheLoader() {

                final LocalManualCache this$0;
                final Callable val$valueLoader;

                public final Object load(Object obj)
                    throws Exception
                {
                    return valueLoader.call();
                }

            
            {
                this$0 = final_localmanualcache;
                valueLoader = Callable.this;
                super();
            }
            });
        }

        public final Object getIfPresent(Object obj)
        {
            return localCache.getIfPresent(obj);
        }

        public final void invalidate(Object obj)
        {
            Preconditions.checkNotNull(obj);
            localCache.remove(obj);
        }

        public final void invalidateAll()
        {
            localCache.clear();
        }

        public final void put(Object obj, Object obj1)
        {
            localCache.put(obj, obj1);
        }

        LocalManualCache(CacheBuilder cachebuilder)
        {
            this(new LocalCache(cachebuilder, null));
        }

        private LocalManualCache(LocalCache localcache)
        {
            localCache = localcache;
        }

    }

    static final class NullEntry extends Enum
        implements ReferenceEntry
    {

        private static final NullEntry $VALUES[];
        public static final NullEntry INSTANCE;

        public static NullEntry valueOf(String s)
        {
            return (NullEntry)Enum.valueOf(com/google/common/cache/LocalCache$NullEntry, s);
        }

        public static NullEntry[] values()
        {
            return (NullEntry[])$VALUES.clone();
        }

        public final long getAccessTime()
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

        public final ReferenceEntry getNext()
        {
            return null;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return this;
        }

        public final ReferenceEntry getNextInWriteQueue()
        {
            return this;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return this;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return this;
        }

        public final ValueReference getValueReference()
        {
            return null;
        }

        public final long getWriteTime()
        {
            return 0L;
        }

        public final void setAccessTime(long l)
        {
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
        }

        public final void setValueReference(ValueReference valuereference)
        {
        }

        public final void setWriteTime(long l)
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

    static interface ReferenceEntry
    {

        public abstract long getAccessTime();

        public abstract int getHash();

        public abstract Object getKey();

        public abstract ReferenceEntry getNext();

        public abstract ReferenceEntry getNextInAccessQueue();

        public abstract ReferenceEntry getNextInWriteQueue();

        public abstract ReferenceEntry getPreviousInAccessQueue();

        public abstract ReferenceEntry getPreviousInWriteQueue();

        public abstract ValueReference getValueReference();

        public abstract long getWriteTime();

        public abstract void setAccessTime(long l);

        public abstract void setNextInAccessQueue(ReferenceEntry referenceentry);

        public abstract void setNextInWriteQueue(ReferenceEntry referenceentry);

        public abstract void setPreviousInAccessQueue(ReferenceEntry referenceentry);

        public abstract void setPreviousInWriteQueue(ReferenceEntry referenceentry);

        public abstract void setValueReference(ValueReference valuereference);

        public abstract void setWriteTime(long l);
    }

    static final class Segment extends ReentrantLock
    {

        final Queue accessQueue;
        volatile int count;
        final ReferenceQueue keyReferenceQueue;
        final LocalCache map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue recencyQueue;
        final AbstractCache.StatsCounter statsCounter;
        volatile AtomicReferenceArray table;
        int threshold;
        int totalWeight;
        final ReferenceQueue valueReferenceQueue;
        final Queue writeQueue;

        private void cleanUp()
        {
            runLockedCleanup(map.ticker.read());
            runUnlockedCleanup();
        }

        private void clearKeyReferenceQueue()
        {
            while (keyReferenceQueue.poll() != null) ;
        }

        private void clearReferenceQueues()
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

        private void clearValueReferenceQueue()
        {
            while (valueReferenceQueue.poll() != null) ;
        }

        private ReferenceEntry copyEntry(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            if (referenceentry.getKey() != null)
            {
                ValueReference valuereference = referenceentry.getValueReference();
                Object obj = valuereference.get();
                if (obj != null || !valuereference.isActive())
                {
                    referenceentry = map.entryFactory.copyEntry(this, referenceentry, referenceentry1);
                    referenceentry.setValueReference(valuereference.copyFor(valueReferenceQueue, obj, referenceentry));
                    return referenceentry;
                }
            }
            return null;
        }

        private void drainKeyReferenceQueue()
        {
            int i = 0;
            int j;
            do
            {
                Object obj = keyReferenceQueue.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (ReferenceEntry)obj;
                map.reclaimKey(((ReferenceEntry) (obj)));
                j = i + 1;
                i = j;
            } while (j != 16);
        }

        private void drainRecencyQueue()
        {
            do
            {
                ReferenceEntry referenceentry = (ReferenceEntry)recencyQueue.poll();
                if (referenceentry == null)
                {
                    break;
                }
                if (accessQueue.contains(referenceentry))
                {
                    accessQueue.add(referenceentry);
                }
            } while (true);
        }

        private void drainReferenceQueues()
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

        private void drainValueReferenceQueue()
        {
            int i = 0;
            int j;
            do
            {
                Object obj = valueReferenceQueue.poll();
                if (obj == null)
                {
                    break;
                }
                obj = (ValueReference)obj;
                map.reclaimValue(((ValueReference) (obj)));
                j = i + 1;
                i = j;
            } while (j != 16);
        }

        private void enqueueNotification(ReferenceEntry referenceentry, RemovalCause removalcause)
        {
            enqueueNotification(referenceentry.getKey(), referenceentry.getHash(), referenceentry.getValueReference(), removalcause);
        }

        private void enqueueNotification(Object obj, int i, ValueReference valuereference, RemovalCause removalcause)
        {
            totalWeight = totalWeight - valuereference.getWeight();
            if (removalcause.wasEvicted())
            {
                statsCounter.recordEviction();
            }
            if (map.removalNotificationQueue != LocalCache.DISCARDING_QUEUE)
            {
                obj = new RemovalNotification(obj, valuereference.get(), removalcause);
                map.removalNotificationQueue.offer(obj);
            }
        }

        private void evictEntries()
        {
            if (map.evictsBySize()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            drainRecencyQueue();
            ReferenceEntry referenceentry;
            do
            {
                if ((long)totalWeight <= maxSegmentWeight)
                {
                    continue; /* Loop/switch isn't completed */
                }
                referenceentry = getNextEvictable();
            } while (removeEntry(referenceentry, referenceentry.getHash(), RemovalCause.SIZE));
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            throw new AssertionError();
        }

        private void expand()
        {
            AtomicReferenceArray atomicreferencearray;
            AtomicReferenceArray atomicreferencearray1;
            int i;
            int j;
            int k1;
            int l1;
            atomicreferencearray = table;
            k1 = atomicreferencearray.length();
            if (k1 >= 0x40000000)
            {
                return;
            }
            i = count;
            atomicreferencearray1 = newEntryArray(k1 << 1);
            threshold = (atomicreferencearray1.length() * 3) / 4;
            l1 = atomicreferencearray1.length() - 1;
            j = 0;
_L2:
            ReferenceEntry referenceentry;
            ReferenceEntry referenceentry1;
            int k;
            if (j >= k1)
            {
                break MISSING_BLOCK_LABEL_265;
            }
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            k = i;
            if (referenceentry1 != null)
            {
                referenceentry = referenceentry1.getNext();
                k = referenceentry1.getHash() & l1;
                if (referenceentry != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                atomicreferencearray1.set(k, referenceentry1);
                k = i;
            }
_L4:
            j++;
            i = k;
            if (true) goto _L2; else goto _L1
_L1:
            ReferenceEntry referenceentry3;
            referenceentry3 = referenceentry1;
            while (referenceentry != null) 
            {
                int j1 = referenceentry.getHash() & l1;
                int i1 = k;
                if (j1 != k)
                {
                    i1 = j1;
                    referenceentry3 = referenceentry;
                }
                referenceentry = referenceentry.getNext();
                k = i1;
            }
            atomicreferencearray1.set(k, referenceentry3);
            referenceentry = referenceentry1;
_L5:
            k = i;
            if (referenceentry == referenceentry3) goto _L4; else goto _L3
_L3:
            int l = referenceentry.getHash() & l1;
            ReferenceEntry referenceentry2 = copyEntry(referenceentry, (ReferenceEntry)atomicreferencearray1.get(l));
            if (referenceentry2 != null)
            {
                atomicreferencearray1.set(l, referenceentry2);
            } else
            {
                removeCollectedEntry(referenceentry);
                i--;
            }
            referenceentry = referenceentry.getNext();
              goto _L5
              goto _L4
            table = atomicreferencearray1;
            count = i;
            return;
        }

        private void expireEntries(long l)
        {
            drainRecencyQueue();
            do
            {
                ReferenceEntry referenceentry = (ReferenceEntry)writeQueue.peek();
                if (referenceentry != null && map.isExpired(referenceentry, l))
                {
                    if (!removeEntry(referenceentry, referenceentry.getHash(), RemovalCause.EXPIRED))
                    {
                        throw new AssertionError();
                    }
                } else
                {
                    do
                    {
                        ReferenceEntry referenceentry1 = (ReferenceEntry)accessQueue.peek();
                        if (referenceentry1 != null && map.isExpired(referenceentry1, l))
                        {
                            if (!removeEntry(referenceentry1, referenceentry1.getHash(), RemovalCause.EXPIRED))
                            {
                                throw new AssertionError();
                            }
                        } else
                        {
                            return;
                        }
                    } while (true);
                }
            } while (true);
        }

        private ReferenceEntry getEntry(Object obj, int i)
        {
            ReferenceEntry referenceentry = getFirst(i);
_L2:
            Object obj1;
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            if (referenceentry.getHash() == i)
            {
                obj1 = referenceentry.getKey();
                if (obj1 != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                tryDrainReferenceQueues();
            }
_L4:
            referenceentry = referenceentry.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            if (!map.keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
            return referenceentry;
            return null;
        }

        private ReferenceEntry getFirst(int i)
        {
            AtomicReferenceArray atomicreferencearray = table;
            return (ReferenceEntry)atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
        }

        private ReferenceEntry getLiveEntry(Object obj, int i, long l)
        {
            ReferenceEntry referenceentry = getEntry(obj, i);
            if (referenceentry == null)
            {
                obj = null;
            } else
            {
                obj = referenceentry;
                if (map.isExpired(referenceentry, l))
                {
                    tryExpireEntries(l);
                    return null;
                }
            }
            return ((ReferenceEntry) (obj));
        }

        private ReferenceEntry getNextEvictable()
        {
            for (Iterator iterator = accessQueue.iterator(); iterator.hasNext();)
            {
                ReferenceEntry referenceentry = (ReferenceEntry)iterator.next();
                if (referenceentry.getValueReference().getWeight() > 0)
                {
                    return referenceentry;
                }
            }

            throw new AssertionError();
        }

        private void initTable(AtomicReferenceArray atomicreferencearray)
        {
            threshold = (atomicreferencearray.length() * 3) / 4;
            if (!map.customWeigher() && (long)threshold == maxSegmentWeight)
            {
                threshold = threshold + 1;
            }
            table = atomicreferencearray;
        }

        private LoadingValueReference insertLoadingValueReference(Object obj, int i, boolean flag)
        {
            lock();
            ReferenceEntry referenceentry;
            AtomicReferenceArray atomicreferencearray;
            int j;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry = (ReferenceEntry)atomicreferencearray.get(j);
            Object obj1 = referenceentry;
_L1:
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_210;
            }
            Object obj2 = ((ReferenceEntry) (obj1)).getKey();
            if (((ReferenceEntry) (obj1)).getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_198;
            }
            if (!map.keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_198;
            }
            obj = ((ReferenceEntry) (obj1)).getValueReference();
            if (((ValueReference) (obj)).isLoading())
            {
                break MISSING_BLOCK_LABEL_151;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            long l1;
            long l2;
            l1 = ((ReferenceEntry) (obj1)).getWriteTime();
            l2 = map.refreshNanos;
            if (l - l1 >= l2)
            {
                break MISSING_BLOCK_LABEL_161;
            }
            unlock();
            postWriteCleanup();
            return null;
            modCount = modCount + 1;
            obj = new LoadingValueReference(((ValueReference) (obj)));
            ((ReferenceEntry) (obj1)).setValueReference(((ValueReference) (obj)));
            unlock();
            postWriteCleanup();
            return ((LoadingValueReference) (obj));
            obj1 = ((ReferenceEntry) (obj1)).getNext();
              goto _L1
            modCount = modCount + 1;
            obj1 = new LoadingValueReference();
            obj = newEntry(obj, i, referenceentry);
            ((ReferenceEntry) (obj)).setValueReference(((ValueReference) (obj1)));
            atomicreferencearray.set(j, obj);
            unlock();
            postWriteCleanup();
            return ((LoadingValueReference) (obj1));
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        private ListenableFuture loadAsync(final Object key, final int hash, final LoadingValueReference loadingValueReference, CacheLoader cacheloader)
        {
            cacheloader = loadingValueReference.loadFuture(key, cacheloader);
            cacheloader.addListener(cacheloader. new Runnable() {

                final Segment this$0;
                final int val$hash;
                final Object val$key;
                final ListenableFuture val$loadingFuture;
                final LoadingValueReference val$loadingValueReference;

                public final void run()
                {
                    try
                    {
                        getAndRecordStats(key, hash, loadingValueReference, loadingFuture);
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        LocalCache.logger.log(Level.WARNING, "Exception thrown during refresh", throwable);
                        loadingValueReference.setException(throwable);
                        return;
                    }
                }

            
            {
                this$0 = final_segment;
                key = obj;
                hash = i;
                loadingValueReference = loadingvaluereference;
                loadingFuture = ListenableFuture.this;
                super();
            }
            }, LocalCache.sameThreadExecutor);
            return cacheloader;
        }

        private Object loadSync(Object obj, int i, LoadingValueReference loadingvaluereference, CacheLoader cacheloader)
            throws ExecutionException
        {
            return getAndRecordStats(obj, i, loadingvaluereference, loadingvaluereference.loadFuture(obj, cacheloader));
        }

        private Object lockedGetOrLoad(Object obj, int i, CacheLoader cacheloader)
            throws ExecutionException
        {
            LoadingValueReference loadingvaluereference;
            Object obj1;
            boolean flag1;
            obj1 = null;
            loadingvaluereference = null;
            flag1 = true;
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            int k;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
            k = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L17:
            ValueReference valuereference;
            boolean flag;
            flag = flag1;
            valuereference = ((ValueReference) (obj1));
            if (referenceentry == null) goto _L2; else goto _L1
_L1:
            Object obj2 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj2 == null) goto _L4; else goto _L3
_L3:
            if (!map.keyEquivalence.equivalent(obj, obj2)) goto _L4; else goto _L5
_L5:
            valuereference = referenceentry.getValueReference();
            if (!valuereference.isLoading()) goto _L7; else goto _L6
_L6:
            flag = false;
_L2:
            obj1 = referenceentry;
            if (!flag) goto _L9; else goto _L8
_L8:
            loadingvaluereference = new LoadingValueReference();
            if (referenceentry != null) goto _L11; else goto _L10
_L10:
            obj1 = newEntry(obj, i, referenceentry1);
            ((ReferenceEntry) (obj1)).setValueReference(loadingvaluereference);
            atomicreferencearray.set(j, obj1);
_L9:
            unlock();
            postWriteCleanup();
            if (!flag) goto _L13; else goto _L12
_L12:
            obj1;
            JVM INSTR monitorenter ;
            obj = loadSync(obj, i, loadingvaluereference, cacheloader);
            obj1;
            JVM INSTR monitorexit ;
            statsCounter.recordMisses(1);
            return obj;
_L7:
            obj1 = valuereference.get();
            if (obj1 != null) goto _L15; else goto _L14
_L14:
            enqueueNotification(obj2, i, valuereference, RemovalCause.COLLECTED);
_L16:
            writeQueue.remove(referenceentry);
            accessQueue.remove(referenceentry);
            count = k - 1;
            flag = flag1;
              goto _L2
            obj;
_L18:
            unlock();
            postWriteCleanup();
            throw obj;
_L15:
label0:
            {
                if (!map.isExpired(referenceentry, l))
                {
                    break label0;
                }
                enqueueNotification(obj2, i, valuereference, RemovalCause.EXPIRED);
            }
              goto _L16
            recordLockedRead(referenceentry, l);
            statsCounter.recordHits(1);
            unlock();
            postWriteCleanup();
            return obj1;
_L4:
            referenceentry = referenceentry.getNext();
              goto _L17
_L11:
            referenceentry.setValueReference(loadingvaluereference);
            obj1 = referenceentry;
              goto _L9
            obj;
            obj1;
            JVM INSTR monitorexit ;
            throw obj;
            obj;
            statsCounter.recordMisses(1);
            throw obj;
_L13:
            return waitForLoadingValue(((ReferenceEntry) (obj1)), obj, valuereference);
            obj;
              goto _L18
        }

        private ReferenceEntry newEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            return map.entryFactory.newEntry(this, Preconditions.checkNotNull(obj), i, referenceentry);
        }

        private static AtomicReferenceArray newEntryArray(int i)
        {
            return new AtomicReferenceArray(i);
        }

        private void postWriteCleanup()
        {
            runUnlockedCleanup();
        }

        private void preWriteCleanup(long l)
        {
            runLockedCleanup(l);
        }

        private void recordLockedRead(ReferenceEntry referenceentry, long l)
        {
            if (map.recordsAccess())
            {
                referenceentry.setAccessTime(l);
            }
            accessQueue.add(referenceentry);
        }

        private void recordRead(ReferenceEntry referenceentry, long l)
        {
            if (map.recordsAccess())
            {
                referenceentry.setAccessTime(l);
            }
            recencyQueue.add(referenceentry);
        }

        private void recordWrite(ReferenceEntry referenceentry, int i, long l)
        {
            drainRecencyQueue();
            totalWeight = totalWeight + i;
            if (map.recordsAccess())
            {
                referenceentry.setAccessTime(l);
            }
            if (map.recordsWrite())
            {
                referenceentry.setWriteTime(l);
            }
            accessQueue.add(referenceentry);
            writeQueue.add(referenceentry);
        }

        private Object refresh(Object obj, int i, CacheLoader cacheloader, boolean flag)
        {
            LoadingValueReference loadingvaluereference = insertLoadingValueReference(obj, i, flag);
            if (loadingvaluereference != null)
            {
                if (((ListenableFuture) (obj = loadAsync(obj, i, loadingvaluereference, cacheloader))).isDone())
                {
                    try
                    {
                        obj = Uninterruptibles.getUninterruptibly(((java.util.concurrent.Future) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        return null;
                    }
                    return obj;
                }
            }
            return null;
        }

        private void removeCollectedEntry(ReferenceEntry referenceentry)
        {
            enqueueNotification(referenceentry, RemovalCause.COLLECTED);
            writeQueue.remove(referenceentry);
            accessQueue.remove(referenceentry);
        }

        private boolean removeEntry(ReferenceEntry referenceentry, int i, RemovalCause removalcause)
        {
            int j = count;
            AtomicReferenceArray atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            ReferenceEntry referenceentry2 = (ReferenceEntry)atomicreferencearray.get(j);
            for (ReferenceEntry referenceentry1 = referenceentry2; referenceentry1 != null; referenceentry1 = referenceentry1.getNext())
            {
                if (referenceentry1 == referenceentry)
                {
                    modCount = modCount + 1;
                    referenceentry = removeValueFromChain(referenceentry2, referenceentry1, referenceentry1.getKey(), i, referenceentry1.getValueReference(), removalcause);
                    i = count;
                    atomicreferencearray.set(j, referenceentry);
                    count = i - 1;
                    return true;
                }
            }

            return false;
        }

        private ReferenceEntry removeEntryFromChain(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
        {
            int i = count;
            ReferenceEntry referenceentry2 = referenceentry1.getNext();
            while (referenceentry != referenceentry1) 
            {
                ReferenceEntry referenceentry3 = copyEntry(referenceentry, referenceentry2);
                if (referenceentry3 != null)
                {
                    referenceentry2 = referenceentry3;
                } else
                {
                    removeCollectedEntry(referenceentry);
                    i--;
                }
                referenceentry = referenceentry.getNext();
            }
            count = i;
            return referenceentry2;
        }

        private boolean removeLoadingValue(Object obj, int i, LoadingValueReference loadingvaluereference)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
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
                break MISSING_BLOCK_LABEL_161;
            }
            if (!map.keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_161;
            }
            if (referenceentry.getValueReference() != loadingvaluereference)
            {
                break MISSING_BLOCK_LABEL_151;
            }
            if (!loadingvaluereference.isActive()) goto _L2; else goto _L1
_L1:
            referenceentry.setValueReference(loadingvaluereference.getOldValue());
_L4:
            unlock();
            postWriteCleanup();
            return true;
_L2:
            atomicreferencearray.set(j, removeEntryFromChain(referenceentry1, referenceentry));
            if (true) goto _L4; else goto _L3
_L3:
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
            unlock();
            postWriteCleanup();
            return false;
            referenceentry = referenceentry.getNext();
            if (true) goto _L6; else goto _L5
_L5:
            unlock();
            postWriteCleanup();
            return false;
        }

        private ReferenceEntry removeValueFromChain(ReferenceEntry referenceentry, ReferenceEntry referenceentry1, Object obj, int i, ValueReference valuereference, RemovalCause removalcause)
        {
            enqueueNotification(obj, i, valuereference, removalcause);
            writeQueue.remove(referenceentry1);
            accessQueue.remove(referenceentry1);
            if (valuereference.isLoading())
            {
                valuereference.notifyNewValue(null);
                return referenceentry;
            } else
            {
                return removeEntryFromChain(referenceentry, referenceentry1);
            }
        }

        private void runLockedCleanup(long l)
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_28;
            }
            drainReferenceQueues();
            expireEntries(l);
            readCount.set(0);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        private void runUnlockedCleanup()
        {
            if (!isHeldByCurrentThread())
            {
                map.processPendingNotifications();
            }
        }

        private Object scheduleRefresh(ReferenceEntry referenceentry, Object obj, int i, Object obj1, long l, CacheLoader cacheloader)
        {
            if (map.refreshes() && l - referenceentry.getWriteTime() > map.refreshNanos && !referenceentry.getValueReference().isLoading())
            {
                referenceentry = ((ReferenceEntry) (refresh(obj, i, cacheloader, true)));
                if (referenceentry != null)
                {
                    return referenceentry;
                }
            }
            return obj1;
        }

        private void setValue(ReferenceEntry referenceentry, Object obj, Object obj1, long l)
        {
            ValueReference valuereference = referenceentry.getValueReference();
            int i = map.weigher.weigh(obj, obj1);
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Weights must be non-negative");
            referenceentry.setValueReference(map.valueStrength.referenceValue(this, referenceentry, obj1, i));
            recordWrite(referenceentry, i, l);
            valuereference.notifyNewValue(obj1);
        }

        private boolean storeLoadedValue(Object obj, int i, LoadingValueReference loadingvaluereference, Object obj1)
        {
            lock();
            int k;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
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
            obj3 = (ReferenceEntry)((AtomicReferenceArray) (obj4)).get(k);
            Object obj2 = obj3;
_L4:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_297;
            }
            Object obj5 = ((ReferenceEntry) (obj2)).getKey();
            if (((ReferenceEntry) (obj2)).getHash() != i || obj5 == null)
            {
                break MISSING_BLOCK_LABEL_285;
            }
            if (!map.keyEquivalence.equivalent(obj, obj5))
            {
                break MISSING_BLOCK_LABEL_285;
            }
            obj3 = ((ReferenceEntry) (obj2)).getValueReference();
            obj4 = ((ValueReference) (obj3)).get();
            if (loadingvaluereference == obj3)
            {
                break MISSING_BLOCK_LABEL_171;
            }
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            if (obj3 == LocalCache.UNSET)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            modCount = modCount + 1;
            k = j;
            if (!loadingvaluereference.isActive()) goto _L2; else goto _L1
_L1:
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_248;
            }
            obj3 = RemovalCause.COLLECTED;
_L3:
            enqueueNotification(obj, i, loadingvaluereference, ((RemovalCause) (obj3)));
            k = j - 1;
_L2:
            setValue(((ReferenceEntry) (obj2)), obj, obj1, l);
            count = k;
            evictEntries();
            unlock();
            postWriteCleanup();
            return true;
            obj3 = RemovalCause.REPLACED;
              goto _L3
            enqueueNotification(obj, i, new WeightedStrongValueReference(obj1, 0), RemovalCause.REPLACED);
            unlock();
            postWriteCleanup();
            return false;
            obj2 = ((ReferenceEntry) (obj2)).getNext();
              goto _L4
            modCount = modCount + 1;
            loadingvaluereference = newEntry(obj, i, ((ReferenceEntry) (obj3)));
            setValue(loadingvaluereference, obj, obj1, l);
            ((AtomicReferenceArray) (obj4)).set(k, loadingvaluereference);
            count = j;
            evictEntries();
            unlock();
            postWriteCleanup();
            return true;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        private void tryDrainReferenceQueues()
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

        private void tryExpireEntries(long l)
        {
            if (!tryLock())
            {
                break MISSING_BLOCK_LABEL_16;
            }
            expireEntries(l);
            unlock();
            return;
            Exception exception;
            exception;
            unlock();
            throw exception;
        }

        private Object waitForLoadingValue(ReferenceEntry referenceentry, Object obj, ValueReference valuereference)
            throws ExecutionException
        {
            if (!valuereference.isLoading())
            {
                throw new AssertionError();
            }
            boolean flag;
            if (!Thread.holdsLock(referenceentry))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Recursive load of: %s", new Object[] {
                obj
            });
            valuereference = ((ValueReference) (valuereference.waitForValue()));
            if (valuereference != null)
            {
                break MISSING_BLOCK_LABEL_104;
            }
            throw new CacheLoader.InvalidCacheLoadException((new StringBuilder("CacheLoader returned null for key ")).append(obj).append(".").toString());
            referenceentry;
            statsCounter.recordMisses(1);
            throw referenceentry;
            recordRead(referenceentry, map.ticker.read());
            statsCounter.recordMisses(1);
            return valuereference;
        }

        final void clear()
        {
            if (count == 0) goto _L2; else goto _L1
_L1:
            lock();
            AtomicReferenceArray atomicreferencearray = table;
            int i = 0;
_L7:
            ReferenceEntry referenceentry;
            if (i >= atomicreferencearray.length())
            {
                break MISSING_BLOCK_LABEL_164;
            }
            referenceentry = (ReferenceEntry)atomicreferencearray.get(i);
_L4:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (referenceentry.getValueReference().isActive())
            {
                enqueueNotification(referenceentry, RemovalCause.EXPLICIT);
            }
            referenceentry = referenceentry.getNext();
            if (true) goto _L4; else goto _L3
_L5:
            Exception exception;
            for (; i >= atomicreferencearray.length(); i = 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }

            atomicreferencearray.set(i, null);
            i++;
              goto _L5
            clearReferenceQueues();
            writeQueue.clear();
            accessQueue.clear();
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

        final boolean containsKey(Object obj, int i)
        {
            boolean flag = false;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            obj = getLiveEntry(obj, i, map.ticker.read());
            if (obj == null)
            {
                postReadCleanup();
                return false;
            }
            obj = ((ReferenceEntry) (obj)).getValueReference().get();
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

        final Object get(Object obj, int i)
        {
            long l;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            l = map.ticker.read();
            obj = getLiveEntry(obj, i, l);
            if (obj == null)
            {
                postReadCleanup();
                return null;
            }
            Object obj1 = ((ReferenceEntry) (obj)).getValueReference().get();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            recordRead(((ReferenceEntry) (obj)), l);
            obj = scheduleRefresh(((ReferenceEntry) (obj)), ((ReferenceEntry) (obj)).getKey(), i, obj1, l, map.defaultLoader);
            postReadCleanup();
            return obj;
            tryDrainReferenceQueues();
            postReadCleanup();
            return null;
            obj;
            postReadCleanup();
            throw obj;
        }

        final Object get(Object obj, int i, CacheLoader cacheloader)
            throws ExecutionException
        {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(cacheloader);
            ReferenceEntry referenceentry;
            if (count == 0)
            {
                break MISSING_BLOCK_LABEL_130;
            }
            referenceentry = getEntry(obj, i);
            if (referenceentry == null)
            {
                break MISSING_BLOCK_LABEL_130;
            }
            Object obj1;
            long l;
            l = map.ticker.read();
            obj1 = getLiveValue(referenceentry, l);
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            recordRead(referenceentry, l);
            statsCounter.recordHits(1);
            obj = scheduleRefresh(referenceentry, obj, i, obj1, l, cacheloader);
            postReadCleanup();
            return obj;
            ValueReference valuereference = referenceentry.getValueReference();
            if (!valuereference.isLoading())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            obj = waitForLoadingValue(referenceentry, obj, valuereference);
            postReadCleanup();
            return obj;
            obj = lockedGetOrLoad(obj, i, cacheloader);
            postReadCleanup();
            return obj;
            obj;
            cacheloader = ((ExecutionException) (obj)).getCause();
            if (cacheloader instanceof Error)
            {
                throw new ExecutionError((Error)cacheloader);
            }
            break MISSING_BLOCK_LABEL_176;
            obj;
            postReadCleanup();
            throw obj;
            if (cacheloader instanceof RuntimeException)
            {
                throw new UncheckedExecutionException(cacheloader);
            } else
            {
                throw obj;
            }
        }

        final Object getAndRecordStats(Object obj, int i, LoadingValueReference loadingvaluereference, ListenableFuture listenablefuture)
            throws ExecutionException
        {
            ListenableFuture listenablefuture1 = null;
            listenablefuture = ((ListenableFuture) (Uninterruptibles.getUninterruptibly(listenablefuture)));
            if (listenablefuture != null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            listenablefuture1 = listenablefuture;
            throw new CacheLoader.InvalidCacheLoadException((new StringBuilder("CacheLoader returned null for key ")).append(obj).append(".").toString());
            listenablefuture;
            if (listenablefuture1 == null)
            {
                statsCounter.recordLoadException(loadingvaluereference.elapsedNanos());
                removeLoadingValue(obj, i, loadingvaluereference);
            }
            throw listenablefuture;
            listenablefuture1 = listenablefuture;
            statsCounter.recordLoadSuccess(loadingvaluereference.elapsedNanos());
            listenablefuture1 = listenablefuture;
            storeLoadedValue(obj, i, loadingvaluereference, listenablefuture);
            if (listenablefuture == null)
            {
                statsCounter.recordLoadException(loadingvaluereference.elapsedNanos());
                removeLoadingValue(obj, i, loadingvaluereference);
            }
            return listenablefuture;
        }

        final Object getLiveValue(ReferenceEntry referenceentry, long l)
        {
            Object obj;
            if (referenceentry.getKey() == null)
            {
                tryDrainReferenceQueues();
                obj = null;
            } else
            {
                obj = referenceentry.getValueReference().get();
                if (obj == null)
                {
                    tryDrainReferenceQueues();
                    return null;
                }
                if (map.isExpired(referenceentry, l))
                {
                    tryExpireEntries(l);
                    return null;
                }
            }
            return obj;
        }

        final void postReadCleanup()
        {
            if ((readCount.incrementAndGet() & 0x3f) == 0)
            {
                cleanUp();
            }
        }

        final Object put(Object obj, int i, Object obj1, boolean flag)
        {
            lock();
            Object obj3;
            Object obj4;
            int k;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
            if (count + 1 > threshold)
            {
                expand();
                int j = count;
            }
            obj4 = table;
            k = i & ((AtomicReferenceArray) (obj4)).length() - 1;
            obj3 = (ReferenceEntry)((AtomicReferenceArray) (obj4)).get(k);
            Object obj2 = obj3;
_L2:
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_314;
            }
            Object obj5 = ((ReferenceEntry) (obj2)).getKey();
            if (((ReferenceEntry) (obj2)).getHash() != i || obj5 == null)
            {
                break MISSING_BLOCK_LABEL_302;
            }
            if (!map.keyEquivalence.equivalent(obj, obj5))
            {
                break MISSING_BLOCK_LABEL_302;
            }
            obj3 = ((ReferenceEntry) (obj2)).getValueReference();
            obj4 = ((ValueReference) (obj3)).get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_232;
            }
            modCount = modCount + 1;
            if (!((ValueReference) (obj3)).isActive())
            {
                break MISSING_BLOCK_LABEL_212;
            }
            enqueueNotification(obj, i, ((ValueReference) (obj3)), RemovalCause.COLLECTED);
            setValue(((ReferenceEntry) (obj2)), obj, obj1, l);
            i = count;
_L1:
            count = i;
            evictEntries();
            unlock();
            postWriteCleanup();
            return null;
            setValue(((ReferenceEntry) (obj2)), obj, obj1, l);
            i = count + 1;
              goto _L1
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            recordLockedRead(((ReferenceEntry) (obj2)), l);
            unlock();
            postWriteCleanup();
            return obj4;
            modCount = modCount + 1;
            enqueueNotification(obj, i, ((ValueReference) (obj3)), RemovalCause.REPLACED);
            setValue(((ReferenceEntry) (obj2)), obj, obj1, l);
            evictEntries();
            unlock();
            postWriteCleanup();
            return obj4;
            obj2 = ((ReferenceEntry) (obj2)).getNext();
              goto _L2
            modCount = modCount + 1;
            ReferenceEntry referenceentry = newEntry(obj, i, ((ReferenceEntry) (obj3)));
            setValue(referenceentry, obj, obj1, l);
            ((AtomicReferenceArray) (obj4)).set(k, referenceentry);
            count = count + 1;
            evictEntries();
            unlock();
            postWriteCleanup();
            return null;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        final boolean reclaimKey(ReferenceEntry referenceentry, int i)
        {
            lock();
            ReferenceEntry referenceentry2;
            AtomicReferenceArray atomicreferencearray;
            int j;
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry2 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry1 = referenceentry2;
_L2:
            if (referenceentry1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (referenceentry1 != referenceentry)
            {
                break MISSING_BLOCK_LABEL_115;
            }
            modCount = modCount + 1;
            referenceentry = removeValueFromChain(referenceentry2, referenceentry1, referenceentry1.getKey(), i, referenceentry1.getValueReference(), RemovalCause.COLLECTED);
            i = count;
            atomicreferencearray.set(j, referenceentry);
            count = i - 1;
            unlock();
            postWriteCleanup();
            return true;
            referenceentry1 = referenceentry1.getNext();
            if (true) goto _L2; else goto _L1
_L1:
            unlock();
            postWriteCleanup();
            return false;
            referenceentry;
            unlock();
            postWriteCleanup();
            throw referenceentry;
        }

        final boolean reclaimValue(Object obj, int i, ValueReference valuereference)
        {
            boolean flag;
            flag = false;
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L12:
            if (referenceentry == null) goto _L2; else goto _L1
_L1:
            Object obj1 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj1 == null) goto _L4; else goto _L3
_L3:
            if (!map.keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L5
_L5:
            if (referenceentry.getValueReference() != valuereference) goto _L7; else goto _L6
_L6:
            modCount = modCount + 1;
            obj = removeValueFromChain(referenceentry1, referenceentry, obj1, i, valuereference, RemovalCause.COLLECTED);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            flag = true;
_L9:
            return flag;
_L7:
            unlock();
            if (isHeldByCurrentThread()) goto _L9; else goto _L8
_L8:
            postWriteCleanup();
            return false;
_L4:
            referenceentry = referenceentry.getNext();
            continue; /* Loop/switch isn't completed */
_L2:
            unlock();
            if (isHeldByCurrentThread()) goto _L9; else goto _L10
_L10:
            postWriteCleanup();
            return false;
            obj;
            unlock();
            if (!isHeldByCurrentThread())
            {
                postWriteCleanup();
            }
            throw obj;
            if (true) goto _L12; else goto _L11
_L11:
        }

        final Object remove(Object obj, int i)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup(map.ticker.read());
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L3:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj1 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj1 == null)
            {
                break MISSING_BLOCK_LABEL_207;
            }
            Object obj2;
            ValueReference valuereference;
            if (!map.keyEquivalence.equivalent(obj, obj1))
            {
                break MISSING_BLOCK_LABEL_207;
            }
            valuereference = referenceentry.getValueReference();
            obj2 = valuereference.get();
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_180;
            }
            obj = RemovalCause.EXPLICIT;
_L1:
            modCount = modCount + 1;
            obj = removeValueFromChain(referenceentry1, referenceentry, obj1, i, valuereference, ((RemovalCause) (obj)));
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
            unlock();
            postWriteCleanup();
            return obj2;
label0:
            {
                if (!valuereference.isActive())
                {
                    break label0;
                }
                obj = RemovalCause.COLLECTED;
            }
              goto _L1
            unlock();
            postWriteCleanup();
            return null;
            referenceentry = referenceentry.getNext();
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

        final boolean remove(Object obj, int i, Object obj1)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            preWriteCleanup(map.ticker.read());
            j = count;
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L5:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            ValueReference valuereference;
            if (!map.keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_244;
            }
            valuereference = referenceentry.getValueReference();
            obj = valuereference.get();
            if (!map.valueEquivalence.equivalent(obj1, obj)) goto _L2; else goto _L1
_L1:
            obj = RemovalCause.EXPLICIT;
_L3:
            modCount = modCount + 1;
            obj1 = removeValueFromChain(referenceentry1, referenceentry, obj2, i, valuereference, ((RemovalCause) (obj)));
            i = count;
            atomicreferencearray.set(j, obj1);
            count = i - 1;
            obj1 = RemovalCause.EXPLICIT;
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
_L2:
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_228;
            }
            if (!valuereference.isActive())
            {
                break MISSING_BLOCK_LABEL_228;
            }
            obj = RemovalCause.COLLECTED;
              goto _L3
            unlock();
            postWriteCleanup();
            return false;
            referenceentry = referenceentry.getNext();
            if (true) goto _L5; else goto _L4
_L4:
            unlock();
            postWriteCleanup();
            return false;
            obj;
            unlock();
            postWriteCleanup();
            throw obj;
        }

        final Object replace(Object obj, int i, Object obj1)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj2 == null)
            {
                break MISSING_BLOCK_LABEL_243;
            }
            ValueReference valuereference;
            Object obj3;
            if (!map.keyEquivalence.equivalent(obj, obj2))
            {
                break MISSING_BLOCK_LABEL_243;
            }
            valuereference = referenceentry.getValueReference();
            obj3 = valuereference.get();
            if (obj3 != null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            if (valuereference.isActive())
            {
                int k = count;
                modCount = modCount + 1;
                obj = removeValueFromChain(referenceentry1, referenceentry, obj2, i, valuereference, RemovalCause.COLLECTED);
                i = count;
                atomicreferencearray.set(j, obj);
                count = i - 1;
            }
            unlock();
            postWriteCleanup();
            return null;
            modCount = modCount + 1;
            enqueueNotification(obj, i, valuereference, RemovalCause.REPLACED);
            setValue(referenceentry, obj, obj1, l);
            evictEntries();
            unlock();
            postWriteCleanup();
            return obj3;
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

        final boolean replace(Object obj, int i, Object obj1, Object obj2)
        {
            lock();
            ReferenceEntry referenceentry1;
            AtomicReferenceArray atomicreferencearray;
            int j;
            long l;
            l = map.ticker.read();
            preWriteCleanup(l);
            atomicreferencearray = table;
            j = i & atomicreferencearray.length() - 1;
            referenceentry1 = (ReferenceEntry)atomicreferencearray.get(j);
            ReferenceEntry referenceentry = referenceentry1;
_L2:
            if (referenceentry == null)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj3 = referenceentry.getKey();
            if (referenceentry.getHash() != i || obj3 == null)
            {
                break MISSING_BLOCK_LABEL_277;
            }
            ValueReference valuereference;
            Object obj4;
            if (!map.keyEquivalence.equivalent(obj, obj3))
            {
                break MISSING_BLOCK_LABEL_277;
            }
            valuereference = referenceentry.getValueReference();
            obj4 = valuereference.get();
            if (obj4 != null)
            {
                break MISSING_BLOCK_LABEL_197;
            }
            if (valuereference.isActive())
            {
                int k = count;
                modCount = modCount + 1;
                obj = removeValueFromChain(referenceentry1, referenceentry, obj3, i, valuereference, RemovalCause.COLLECTED);
                i = count;
                atomicreferencearray.set(j, obj);
                count = i - 1;
            }
            unlock();
            postWriteCleanup();
            return false;
            if (!map.valueEquivalence.equivalent(obj1, obj4))
            {
                break MISSING_BLOCK_LABEL_259;
            }
            modCount = modCount + 1;
            enqueueNotification(obj, i, valuereference, RemovalCause.REPLACED);
            setValue(referenceentry, obj, obj2, l);
            evictEntries();
            unlock();
            postWriteCleanup();
            return true;
            recordLockedRead(referenceentry, l);
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

        Segment(LocalCache localcache, int i, long l, AbstractCache.StatsCounter statscounter)
        {
            Object obj = null;
            super();
            map = localcache;
            maxSegmentWeight = l;
            statsCounter = (AbstractCache.StatsCounter)Preconditions.checkNotNull(statscounter);
            initTable(newEntryArray(i));
            if (localcache.usesKeyReferences())
            {
                statscounter = new ReferenceQueue();
            } else
            {
                statscounter = null;
            }
            keyReferenceQueue = statscounter;
            statscounter = obj;
            if (localcache.usesValueReferences())
            {
                statscounter = new ReferenceQueue();
            }
            valueReferenceQueue = statscounter;
            if (localcache.usesAccessQueue())
            {
                statscounter = new ConcurrentLinkedQueue();
            } else
            {
                statscounter = LocalCache.discardingQueue();
            }
            recencyQueue = statscounter;
            if (localcache.usesWriteQueue())
            {
                statscounter = new WriteQueue();
            } else
            {
                statscounter = LocalCache.discardingQueue();
            }
            writeQueue = statscounter;
            if (localcache.usesAccessQueue())
            {
                localcache = new AccessQueue();
            } else
            {
                localcache = LocalCache.discardingQueue();
            }
            accessQueue = localcache;
        }
    }

    static class SoftValueReference extends SoftReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return new SoftValueReference(referencequeue, obj, referenceentry);
        }

        public final ReferenceEntry getEntry()
        {
            return entry;
        }

        public int getWeight()
        {
            return 1;
        }

        public final boolean isActive()
        {
            return true;
        }

        public final boolean isLoading()
        {
            return false;
        }

        public final void notifyNewValue(Object obj)
        {
        }

        public final Object waitForValue()
        {
            return get();
        }

        SoftValueReference(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            super(obj, referencequeue);
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
            return (Strength)Enum.valueOf(com/google/common/cache/LocalCache$Strength, s);
        }

        public static Strength[] values()
        {
            return (Strength[])$VALUES.clone();
        }

        abstract Equivalence defaultEquivalence();

        abstract ValueReference referenceValue(Segment segment, ReferenceEntry referenceentry, Object obj, int i);

        static 
        {
            STRONG = new Strength("STRONG", 0) {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.equals();
                }

                final ValueReference referenceValue(Segment segment, ReferenceEntry referenceentry, Object obj, int i)
                {
                    if (i == 1)
                    {
                        return new StrongValueReference(obj);
                    } else
                    {
                        return new WeightedStrongValueReference(obj, i);
                    }
                }

            };
            SOFT = new Strength("SOFT", 1) {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.identity();
                }

                final ValueReference referenceValue(Segment segment, ReferenceEntry referenceentry, Object obj, int i)
                {
                    if (i == 1)
                    {
                        return new SoftValueReference(segment.valueReferenceQueue, obj, referenceentry);
                    } else
                    {
                        return new WeightedSoftValueReference(segment.valueReferenceQueue, obj, referenceentry, i);
                    }
                }

            };
            WEAK = new Strength("WEAK", 2) {

                final Equivalence defaultEquivalence()
                {
                    return Equivalence.identity();
                }

                final ValueReference referenceValue(Segment segment, ReferenceEntry referenceentry, Object obj, int i)
                {
                    if (i == 1)
                    {
                        return new WeakValueReference(segment.valueReferenceQueue, obj, referenceentry);
                    } else
                    {
                        return new WeightedWeakValueReference(segment.valueReferenceQueue, obj, referenceentry, i);
                    }
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

    static final class StrongAccessEntry extends StrongEntry
    {

        volatile long accessTime;
        ReferenceEntry nextAccess;
        ReferenceEntry previousAccess;

        public final long getAccessTime()
        {
            return accessTime;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public final void setAccessTime(long l)
        {
            accessTime = l;
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

        StrongAccessEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, i, referenceentry);
            accessTime = 0x7fffffffffffffffL;
            nextAccess = LocalCache.nullEntry();
            previousAccess = LocalCache.nullEntry();
        }
    }

    static final class StrongAccessWriteEntry extends StrongEntry
    {

        volatile long accessTime;
        ReferenceEntry nextAccess;
        ReferenceEntry nextWrite;
        ReferenceEntry previousAccess;
        ReferenceEntry previousWrite;
        volatile long writeTime;

        public final long getAccessTime()
        {
            return accessTime;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public final ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public final long getWriteTime()
        {
            return writeTime;
        }

        public final void setAccessTime(long l)
        {
            accessTime = l;
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public final void setWriteTime(long l)
        {
            writeTime = l;
        }

        StrongAccessWriteEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, i, referenceentry);
            accessTime = 0x7fffffffffffffffL;
            nextAccess = LocalCache.nullEntry();
            previousAccess = LocalCache.nullEntry();
            writeTime = 0x7fffffffffffffffL;
            nextWrite = LocalCache.nullEntry();
            previousWrite = LocalCache.nullEntry();
        }
    }

    static class StrongEntry extends AbstractReferenceEntry
    {

        final int hash;
        final Object key;
        final ReferenceEntry next;
        volatile ValueReference valueReference;

        public final int getHash()
        {
            return hash;
        }

        public final Object getKey()
        {
            return key;
        }

        public final ReferenceEntry getNext()
        {
            return next;
        }

        public final ValueReference getValueReference()
        {
            return valueReference;
        }

        public final void setValueReference(ValueReference valuereference)
        {
            valueReference = valuereference;
        }

        StrongEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            valueReference = LocalCache.unset();
            key = obj;
            hash = i;
            next = referenceentry;
        }
    }

    static class StrongValueReference
        implements ValueReference
    {

        final Object referent;

        public final ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return this;
        }

        public Object get()
        {
            return referent;
        }

        public final ReferenceEntry getEntry()
        {
            return null;
        }

        public int getWeight()
        {
            return 1;
        }

        public final boolean isActive()
        {
            return true;
        }

        public final boolean isLoading()
        {
            return false;
        }

        public final void notifyNewValue(Object obj)
        {
        }

        public final Object waitForValue()
        {
            return get();
        }

        StrongValueReference(Object obj)
        {
            referent = obj;
        }
    }

    static final class StrongWriteEntry extends StrongEntry
    {

        ReferenceEntry nextWrite;
        ReferenceEntry previousWrite;
        volatile long writeTime;

        public final ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public final long getWriteTime()
        {
            return writeTime;
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public final void setWriteTime(long l)
        {
            writeTime = l;
        }

        StrongWriteEntry(Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, i, referenceentry);
            writeTime = 0x7fffffffffffffffL;
            nextWrite = LocalCache.nullEntry();
            previousWrite = LocalCache.nullEntry();
        }
    }

    final class ValueIterator extends HashIterator
    {

        final LocalCache this$0;

        public final Object next()
        {
            return nextEntry().getValue();
        }

        ValueIterator()
        {
            this$0 = LocalCache.this;
            super();
        }
    }

    static interface ValueReference
    {

        public abstract ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry);

        public abstract Object get();

        public abstract ReferenceEntry getEntry();

        public abstract int getWeight();

        public abstract boolean isActive();

        public abstract boolean isLoading();

        public abstract void notifyNewValue(Object obj);

        public abstract Object waitForValue()
            throws ExecutionException;
    }

    final class Values extends AbstractCollection
    {

        private final ConcurrentMap map;
        final LocalCache this$0;

        public final void clear()
        {
            map.clear();
        }

        public final boolean contains(Object obj)
        {
            return map.containsValue(obj);
        }

        public final boolean isEmpty()
        {
            return map.isEmpty();
        }

        public final Iterator iterator()
        {
            return new ValueIterator();
        }

        public final int size()
        {
            return map.size();
        }

        Values(ConcurrentMap concurrentmap)
        {
            this$0 = LocalCache.this;
            super();
            map = concurrentmap;
        }
    }

    static final class WeakAccessEntry extends WeakEntry
    {

        volatile long accessTime;
        ReferenceEntry nextAccess;
        ReferenceEntry previousAccess;

        public final long getAccessTime()
        {
            return accessTime;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public final void setAccessTime(long l)
        {
            accessTime = l;
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

        WeakAccessEntry(ReferenceQueue referencequeue, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(referencequeue, obj, i, referenceentry);
            accessTime = 0x7fffffffffffffffL;
            nextAccess = LocalCache.nullEntry();
            previousAccess = LocalCache.nullEntry();
        }
    }

    static final class WeakAccessWriteEntry extends WeakEntry
    {

        volatile long accessTime;
        ReferenceEntry nextAccess;
        ReferenceEntry nextWrite;
        ReferenceEntry previousAccess;
        ReferenceEntry previousWrite;
        volatile long writeTime;

        public final long getAccessTime()
        {
            return accessTime;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public final ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public final long getWriteTime()
        {
            return writeTime;
        }

        public final void setAccessTime(long l)
        {
            accessTime = l;
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public final void setWriteTime(long l)
        {
            writeTime = l;
        }

        WeakAccessWriteEntry(ReferenceQueue referencequeue, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(referencequeue, obj, i, referenceentry);
            accessTime = 0x7fffffffffffffffL;
            nextAccess = LocalCache.nullEntry();
            previousAccess = LocalCache.nullEntry();
            writeTime = 0x7fffffffffffffffL;
            nextWrite = LocalCache.nullEntry();
            previousWrite = LocalCache.nullEntry();
        }
    }

    static class WeakEntry extends WeakReference
        implements ReferenceEntry
    {

        final int hash;
        final ReferenceEntry next;
        volatile ValueReference valueReference;

        public long getAccessTime()
        {
            throw new UnsupportedOperationException();
        }

        public final int getHash()
        {
            return hash;
        }

        public final Object getKey()
        {
            return get();
        }

        public final ReferenceEntry getNext()
        {
            return next;
        }

        public ReferenceEntry getNextInAccessQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getNextInWriteQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousInAccessQueue()
        {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry getPreviousInWriteQueue()
        {
            throw new UnsupportedOperationException();
        }

        public final ValueReference getValueReference()
        {
            return valueReference;
        }

        public long getWriteTime()
        {
            throw new UnsupportedOperationException();
        }

        public void setAccessTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public final void setValueReference(ValueReference valuereference)
        {
            valueReference = valuereference;
        }

        public void setWriteTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        WeakEntry(ReferenceQueue referencequeue, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(obj, referencequeue);
            valueReference = LocalCache.unset();
            hash = i;
            next = referenceentry;
        }
    }

    static class WeakValueReference extends WeakReference
        implements ValueReference
    {

        final ReferenceEntry entry;

        public ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return new WeakValueReference(referencequeue, obj, referenceentry);
        }

        public final ReferenceEntry getEntry()
        {
            return entry;
        }

        public int getWeight()
        {
            return 1;
        }

        public final boolean isActive()
        {
            return true;
        }

        public final boolean isLoading()
        {
            return false;
        }

        public final void notifyNewValue(Object obj)
        {
        }

        public final Object waitForValue()
        {
            return get();
        }

        WeakValueReference(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            super(obj, referencequeue);
            entry = referenceentry;
        }
    }

    static final class WeakWriteEntry extends WeakEntry
    {

        ReferenceEntry nextWrite;
        ReferenceEntry previousWrite;
        volatile long writeTime;

        public final ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public final long getWriteTime()
        {
            return writeTime;
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public final void setWriteTime(long l)
        {
            writeTime = l;
        }

        WeakWriteEntry(ReferenceQueue referencequeue, Object obj, int i, ReferenceEntry referenceentry)
        {
            super(referencequeue, obj, i, referenceentry);
            writeTime = 0x7fffffffffffffffL;
            nextWrite = LocalCache.nullEntry();
            previousWrite = LocalCache.nullEntry();
        }
    }

    static final class WeightedSoftValueReference extends SoftValueReference
    {

        final int weight;

        public final ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return new WeightedSoftValueReference(referencequeue, obj, referenceentry, weight);
        }

        public final int getWeight()
        {
            return weight;
        }

        WeightedSoftValueReference(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry, int i)
        {
            super(referencequeue, obj, referenceentry);
            weight = i;
        }
    }

    static final class WeightedStrongValueReference extends StrongValueReference
    {

        final int weight;

        public final int getWeight()
        {
            return weight;
        }

        WeightedStrongValueReference(Object obj, int i)
        {
            super(obj);
            weight = i;
        }
    }

    static final class WeightedWeakValueReference extends WeakValueReference
    {

        final int weight;

        public final ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return new WeightedWeakValueReference(referencequeue, obj, referenceentry, weight);
        }

        public final int getWeight()
        {
            return weight;
        }

        WeightedWeakValueReference(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry, int i)
        {
            super(referencequeue, obj, referenceentry);
            weight = i;
        }
    }

    static final class WriteQueue extends AbstractQueue
    {

        final ReferenceEntry head = new _cls1();

        private boolean offer(ReferenceEntry referenceentry)
        {
            LocalCache.connectWriteOrder(referenceentry.getPreviousInWriteQueue(), referenceentry.getNextInWriteQueue());
            LocalCache.connectWriteOrder(head.getPreviousInWriteQueue(), referenceentry);
            LocalCache.connectWriteOrder(referenceentry, head);
            return true;
        }

        private ReferenceEntry peek()
        {
            ReferenceEntry referenceentry1 = head.getNextInWriteQueue();
            ReferenceEntry referenceentry = referenceentry1;
            if (referenceentry1 == head)
            {
                referenceentry = null;
            }
            return referenceentry;
        }

        private ReferenceEntry poll()
        {
            ReferenceEntry referenceentry = head.getNextInWriteQueue();
            if (referenceentry == head)
            {
                return null;
            } else
            {
                remove(referenceentry);
                return referenceentry;
            }
        }

        public final void clear()
        {
            ReferenceEntry referenceentry1;
            for (ReferenceEntry referenceentry = head.getNextInWriteQueue(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextInWriteQueue();
                LocalCache.nullifyWriteOrder(referenceentry);
            }

            head.setNextInWriteQueue(head);
            head.setPreviousInWriteQueue(head);
        }

        public final boolean contains(Object obj)
        {
            return ((ReferenceEntry)obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        public final boolean isEmpty()
        {
            return head.getNextInWriteQueue() == head;
        }

        public final Iterator iterator()
        {
            return new AbstractSequentialIterator(peek()) {

                final WriteQueue this$0;

                private ReferenceEntry computeNext(ReferenceEntry referenceentry)
                {
                    ReferenceEntry referenceentry1 = referenceentry.getNextInWriteQueue();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected final volatile Object computeNext(Object obj)
                {
                    return computeNext((ReferenceEntry)obj);
                }

            
            {
                this$0 = WriteQueue.this;
                super(referenceentry);
            }
            };
        }

        public final volatile boolean offer(Object obj)
        {
            return offer((ReferenceEntry)obj);
        }

        public final volatile Object peek()
        {
            return peek();
        }

        public final volatile Object poll()
        {
            return poll();
        }

        public final boolean remove(Object obj)
        {
            obj = (ReferenceEntry)obj;
            ReferenceEntry referenceentry = ((ReferenceEntry) (obj)).getPreviousInWriteQueue();
            ReferenceEntry referenceentry1 = ((ReferenceEntry) (obj)).getNextInWriteQueue();
            LocalCache.connectWriteOrder(referenceentry, referenceentry1);
            LocalCache.nullifyWriteOrder(((ReferenceEntry) (obj)));
            return referenceentry1 != NullEntry.INSTANCE;
        }

        public final int size()
        {
            int i = 0;
            for (ReferenceEntry referenceentry = head.getNextInWriteQueue(); referenceentry != head; referenceentry = referenceentry.getNextInWriteQueue())
            {
                i++;
            }

            return i;
        }

        WriteQueue()
        {
        }
    }

    final class WriteThroughEntry
        implements java.util.Map.Entry
    {

        final Object key;
        final LocalCache this$0;
        Object value;

        public final boolean equals(Object obj)
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

        public final Object getKey()
        {
            return key;
        }

        public final Object getValue()
        {
            return value;
        }

        public final int hashCode()
        {
            return key.hashCode() ^ value.hashCode();
        }

        public final Object setValue(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
        }

        WriteThroughEntry(Object obj, Object obj1)
        {
            this$0 = LocalCache.this;
            super();
            key = obj;
            value = obj1;
        }
    }


    static final Queue DISCARDING_QUEUE = new AbstractQueue() {

        public final Iterator iterator()
        {
            return Iterators.emptyIterator();
        }

        public final boolean offer(Object obj)
        {
            return true;
        }

        public final Object peek()
        {
            return null;
        }

        public final Object poll()
        {
            return null;
        }

        public final int size()
        {
            return 0;
        }

    };
    static final ValueReference UNSET = new ValueReference() {

        public final ValueReference copyFor(ReferenceQueue referencequeue, Object obj, ReferenceEntry referenceentry)
        {
            return this;
        }

        public final Object get()
        {
            return null;
        }

        public final ReferenceEntry getEntry()
        {
            return null;
        }

        public final int getWeight()
        {
            return 0;
        }

        public final boolean isActive()
        {
            return false;
        }

        public final boolean isLoading()
        {
            return false;
        }

        public final void notifyNewValue(Object obj)
        {
        }

        public final Object waitForValue()
        {
            return null;
        }

    };
    static final Logger logger = Logger.getLogger(com/google/common/cache/LocalCache.getName());
    static final ListeningExecutorService sameThreadExecutor = MoreExecutors.sameThreadExecutor();
    final int concurrencyLevel;
    final CacheLoader defaultLoader;
    final EntryFactory entryFactory;
    Set entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final AbstractCache.StatsCounter globalStatsCounter;
    final Equivalence keyEquivalence;
    Set keySet;
    final Strength keyStrength;
    final long maxWeight;
    final long refreshNanos;
    final RemovalListener removalListener;
    final Queue removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final Segment segments[];
    final Ticker ticker;
    final Equivalence valueEquivalence;
    final Strength valueStrength;
    Collection values;
    final Weigher weigher;

    LocalCache(CacheBuilder cachebuilder, CacheLoader cacheloader)
    {
        concurrencyLevel = Math.min(cachebuilder.getConcurrencyLevel(), 0x10000);
        keyStrength = cachebuilder.getKeyStrength();
        valueStrength = cachebuilder.getValueStrength();
        keyEquivalence = cachebuilder.getKeyEquivalence();
        valueEquivalence = cachebuilder.getValueEquivalence();
        maxWeight = cachebuilder.getMaximumWeight();
        weigher = cachebuilder.getWeigher();
        expireAfterAccessNanos = cachebuilder.getExpireAfterAccessNanos();
        expireAfterWriteNanos = cachebuilder.getExpireAfterWriteNanos();
        refreshNanos = cachebuilder.getRefreshNanos();
        removalListener = cachebuilder.getRemovalListener();
        Object obj;
        int i;
        int j;
        int i1;
        if (removalListener == CacheBuilder.NullListener.INSTANCE)
        {
            obj = discardingQueue();
        } else
        {
            obj = new ConcurrentLinkedQueue();
        }
        removalNotificationQueue = ((Queue) (obj));
        ticker = cachebuilder.getTicker(recordsTime());
        entryFactory = EntryFactory.getFactory(keyStrength, usesAccessEntries(), usesWriteEntries());
        globalStatsCounter = (AbstractCache.StatsCounter)cachebuilder.getStatsCounterSupplier().get();
        defaultLoader = cacheloader;
        j = Math.min(cachebuilder.getInitialCapacity(), 0x40000000);
        i = j;
        if (evictsBySize())
        {
            i = j;
            if (!customWeigher())
            {
                i = Math.min(j, (int)maxWeight);
            }
        }
        i1 = 0;
        for (j = 1; j < concurrencyLevel && (!evictsBySize() || (long)(j * 20) <= maxWeight); j <<= 1)
        {
            i1++;
        }

        segmentShift = 32 - i1;
        segmentMask = j - 1;
        segments = newSegmentArray(j);
        int j1 = i / j;
        i1 = j1;
        if (j1 * j < i)
        {
            i1 = j1 + 1;
        }
        for (i = 1; i < i1; i <<= 1) { }
        if (evictsBySize())
        {
            long l1 = maxWeight / (long)j + 1L;
            long l3 = maxWeight;
            long l4 = j;
            for (int k = 0; k < segments.length;)
            {
                long l2 = l1;
                if ((long)k == l3 % l4)
                {
                    l2 = l1 - 1L;
                }
                segments[k] = createSegment(i, l2, (AbstractCache.StatsCounter)cachebuilder.getStatsCounterSupplier().get());
                k++;
                l1 = l2;
            }

        } else
        {
            for (int l = 0; l < segments.length; l++)
            {
                segments[l] = createSegment(i, -1L, (AbstractCache.StatsCounter)cachebuilder.getStatsCounterSupplier().get());
            }

        }
    }

    static void connectAccessOrder(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextInAccessQueue(referenceentry1);
        referenceentry1.setPreviousInAccessQueue(referenceentry);
    }

    static void connectWriteOrder(ReferenceEntry referenceentry, ReferenceEntry referenceentry1)
    {
        referenceentry.setNextInWriteQueue(referenceentry1);
        referenceentry1.setPreviousInWriteQueue(referenceentry);
    }

    private Segment createSegment(int i, long l, AbstractCache.StatsCounter statscounter)
    {
        return new Segment(this, i, l, statscounter);
    }

    static Queue discardingQueue()
    {
        return DISCARDING_QUEUE;
    }

    private boolean expiresAfterAccess()
    {
        return expireAfterAccessNanos > 0L;
    }

    private boolean expiresAfterWrite()
    {
        return expireAfterWriteNanos > 0L;
    }

    private int hash(Object obj)
    {
        return rehash(keyEquivalence.hash(obj));
    }

    private long longSize()
    {
        Segment asegment[] = segments;
        long l = 0L;
        for (int i = 0; i < asegment.length; i++)
        {
            l += asegment[i].count;
        }

        return l;
    }

    private static Segment[] newSegmentArray(int i)
    {
        return new Segment[i];
    }

    static ReferenceEntry nullEntry()
    {
        return NullEntry.INSTANCE;
    }

    static void nullifyAccessOrder(ReferenceEntry referenceentry)
    {
        ReferenceEntry referenceentry1 = nullEntry();
        referenceentry.setNextInAccessQueue(referenceentry1);
        referenceentry.setPreviousInAccessQueue(referenceentry1);
    }

    static void nullifyWriteOrder(ReferenceEntry referenceentry)
    {
        ReferenceEntry referenceentry1 = nullEntry();
        referenceentry.setNextInWriteQueue(referenceentry1);
        referenceentry.setPreviousInWriteQueue(referenceentry1);
    }

    private boolean recordsTime()
    {
        return recordsWrite() || recordsAccess();
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

    private Segment segmentFor(int i)
    {
        return segments[i >>> segmentShift & segmentMask];
    }

    static ValueReference unset()
    {
        return UNSET;
    }

    private boolean usesAccessEntries()
    {
        return usesAccessQueue() || recordsAccess();
    }

    private boolean usesWriteEntries()
    {
        return usesWriteQueue() || recordsWrite();
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
        long l3 = ticker.read();
        Segment asegment[] = segments;
        long l2 = -1L;
        int i = 0;
        do
        {
            if (i >= 3)
            {
                break;
            }
            long l1 = 0L;
            int i1 = asegment.length;
            for (int j = 0; j < i1; j++)
            {
                Segment segment = asegment[j];
                int k = segment.count;
                AtomicReferenceArray atomicreferencearray = segment.table;
                for (int l = 0; l < atomicreferencearray.length(); l++)
                {
                    for (ReferenceEntry referenceentry = (ReferenceEntry)atomicreferencearray.get(l); referenceentry != null; referenceentry = referenceentry.getNext())
                    {
                        Object obj1 = segment.getLiveValue(referenceentry, l3);
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

    final boolean customWeigher()
    {
        return weigher != CacheBuilder.OneWeigher.INSTANCE;
    }

    public Set entrySet()
    {
        Set set = entrySet;
        if (set != null)
        {
            return set;
        } else
        {
            EntrySet entryset = new EntrySet(this);
            entrySet = entryset;
            return entryset;
        }
    }

    final boolean evictsBySize()
    {
        return maxWeight >= 0L;
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

    final Object get(Object obj, CacheLoader cacheloader)
        throws ExecutionException
    {
        int i = hash(Preconditions.checkNotNull(obj));
        return segmentFor(i).get(obj, i, cacheloader);
    }

    public final Object getIfPresent(Object obj)
    {
        int i = hash(Preconditions.checkNotNull(obj));
        obj = segmentFor(i).get(obj, i);
        if (obj == null)
        {
            globalStatsCounter.recordMisses(1);
            return obj;
        } else
        {
            globalStatsCounter.recordHits(1);
            return obj;
        }
    }

    final Object getLiveValue(ReferenceEntry referenceentry, long l)
    {
        Object obj;
        if (referenceentry.getKey() == null)
        {
            obj = null;
        } else
        {
            obj = referenceentry.getValueReference().get();
            if (obj == null)
            {
                return null;
            }
            if (isExpired(referenceentry, l))
            {
                return null;
            }
        }
        return obj;
    }

    final Object getOrLoad(Object obj)
        throws ExecutionException
    {
        return get(obj, defaultLoader);
    }

    public boolean isEmpty()
    {
        Segment asegment[];
        int i;
        long l;
        l = 0L;
        asegment = segments;
        i = 0;
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

    final boolean isExpired(ReferenceEntry referenceentry, long l)
    {
        Preconditions.checkNotNull(referenceentry);
        while (expiresAfterAccess() && l - referenceentry.getAccessTime() >= expireAfterAccessNanos || expiresAfterWrite() && l - referenceentry.getWriteTime() >= expireAfterWriteNanos) 
        {
            return true;
        }
        return false;
    }

    public Set keySet()
    {
        Set set = keySet;
        if (set != null)
        {
            return set;
        } else
        {
            KeySet keyset = new KeySet(this);
            keySet = keyset;
            return keyset;
        }
    }

    final void processPendingNotifications()
    {
        RemovalListener removallistener;
        while ((RemovalNotification)removalNotificationQueue.poll() != null) 
        {
            try
            {
                removallistener = removalListener;
            }
            catch (Throwable throwable)
            {
                logger.log(Level.WARNING, "Exception thrown by removal listener", throwable);
            }
        }
    }

    public Object put(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
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
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        int i = hash(obj);
        return segmentFor(i).put(obj, i, obj1, true);
    }

    final void reclaimKey(ReferenceEntry referenceentry)
    {
        int i = referenceentry.getHash();
        segmentFor(i).reclaimKey(referenceentry, i);
    }

    final void reclaimValue(ValueReference valuereference)
    {
        ReferenceEntry referenceentry = valuereference.getEntry();
        int i = referenceentry.getHash();
        segmentFor(i).reclaimValue(referenceentry.getKey(), i, valuereference);
    }

    final boolean recordsAccess()
    {
        return expiresAfterAccess();
    }

    final boolean recordsWrite()
    {
        return expiresAfterWrite() || refreshes();
    }

    final boolean refreshes()
    {
        return refreshNanos > 0L;
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
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        int i = hash(obj);
        return segmentFor(i).replace(obj, i, obj1);
    }

    public boolean replace(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        if (obj1 == null)
        {
            return false;
        } else
        {
            int i = hash(obj);
            return segmentFor(i).replace(obj, i, obj1, obj2);
        }
    }

    public int size()
    {
        return Ints.saturatedCast(longSize());
    }

    final boolean usesAccessQueue()
    {
        return expiresAfterAccess() || evictsBySize();
    }

    final boolean usesKeyReferences()
    {
        return keyStrength != Strength.STRONG;
    }

    final boolean usesValueReferences()
    {
        return valueStrength != Strength.STRONG;
    }

    final boolean usesWriteQueue()
    {
        return expiresAfterWrite();
    }

    public Collection values()
    {
        Collection collection = values;
        if (collection != null)
        {
            return collection;
        } else
        {
            Values values1 = new Values(this);
            values = values1;
            return values1;
        }
    }


    // Unreferenced inner class com/google/common/cache/LocalCache$AccessQueue$1

/* anonymous class */
    final class AccessQueue._cls1 extends AbstractReferenceEntry
    {

        ReferenceEntry nextAccess;
        ReferenceEntry previousAccess;
        final AccessQueue this$0;

        public final long getAccessTime()
        {
            return 0x7fffffffffffffffL;
        }

        public final ReferenceEntry getNextInAccessQueue()
        {
            return nextAccess;
        }

        public final ReferenceEntry getPreviousInAccessQueue()
        {
            return previousAccess;
        }

        public final void setAccessTime(long l)
        {
        }

        public final void setNextInAccessQueue(ReferenceEntry referenceentry)
        {
            nextAccess = referenceentry;
        }

        public final void setPreviousInAccessQueue(ReferenceEntry referenceentry)
        {
            previousAccess = referenceentry;
        }

            
            {
                this$0 = AccessQueue.this;
                super();
                nextAccess = this;
                previousAccess = this;
            }
    }


    // Unreferenced inner class com/google/common/cache/LocalCache$WriteQueue$1

/* anonymous class */
    final class WriteQueue._cls1 extends AbstractReferenceEntry
    {

        ReferenceEntry nextWrite;
        ReferenceEntry previousWrite;
        final WriteQueue this$0;

        public final ReferenceEntry getNextInWriteQueue()
        {
            return nextWrite;
        }

        public final ReferenceEntry getPreviousInWriteQueue()
        {
            return previousWrite;
        }

        public final long getWriteTime()
        {
            return 0x7fffffffffffffffL;
        }

        public final void setNextInWriteQueue(ReferenceEntry referenceentry)
        {
            nextWrite = referenceentry;
        }

        public final void setPreviousInWriteQueue(ReferenceEntry referenceentry)
        {
            previousWrite = referenceentry;
        }

        public final void setWriteTime(long l)
        {
        }

            
            {
                this$0 = WriteQueue.this;
                super();
                nextWrite = this;
                previousWrite = this;
            }
    }

}
