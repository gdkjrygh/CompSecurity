// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap, AbstractLinkedIterator

class expirationQueue extends ReentrantLock
{
    class EvictionQueue extends AbstractQueue
    {

        final CustomConcurrentHashMap.ReferenceEntry head = new _cls1();
        final CustomConcurrentHashMap.Segment this$1;

        public void clear()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry1;
            for (CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextEvictable(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextEvictable();
                CustomConcurrentHashMap.nullifyEvictable(referenceentry);
            }

            head.setNextEvictable(head);
            head.setPreviousEvictable(head);
        }

        public boolean contains(Object obj)
        {
            return ((CustomConcurrentHashMap.ReferenceEntry)obj).getNextEvictable() != CustomConcurrentHashMap.NullEntry.INSTANCE;
        }

        public boolean isEmpty()
        {
            return head.getNextEvictable() == head;
        }

        public Iterator iterator()
        {
            return new AbstractLinkedIterator(peek()) {

                final EvictionQueue this$2;

                protected CustomConcurrentHashMap.ReferenceEntry computeNext(CustomConcurrentHashMap.ReferenceEntry referenceentry)
                {
                    CustomConcurrentHashMap.ReferenceEntry referenceentry1 = referenceentry.getNextEvictable();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected volatile Object computeNext(Object obj)
                {
                    return computeNext((CustomConcurrentHashMap.ReferenceEntry)obj);
                }

            
            {
                this$2 = EvictionQueue.this;
                super(referenceentry);
            }
            };
        }

        public boolean offer(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            CustomConcurrentHashMap.connectEvictables(referenceentry.getPreviousEvictable(), referenceentry.getNextEvictable());
            CustomConcurrentHashMap.connectEvictables(head.getPreviousEvictable(), referenceentry);
            CustomConcurrentHashMap.connectEvictables(referenceentry, head);
            return true;
        }

        public volatile boolean offer(Object obj)
        {
            return offer((CustomConcurrentHashMap.ReferenceEntry)obj);
        }

        public CustomConcurrentHashMap.ReferenceEntry peek()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry1 = head.getNextEvictable();
            CustomConcurrentHashMap.ReferenceEntry referenceentry = referenceentry1;
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

        public CustomConcurrentHashMap.ReferenceEntry poll()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextEvictable();
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
            obj = (CustomConcurrentHashMap.ReferenceEntry)obj;
            CustomConcurrentHashMap.ReferenceEntry referenceentry = ((CustomConcurrentHashMap.ReferenceEntry) (obj)).getPreviousEvictable();
            CustomConcurrentHashMap.ReferenceEntry referenceentry1 = ((CustomConcurrentHashMap.ReferenceEntry) (obj)).getNextEvictable();
            CustomConcurrentHashMap.connectEvictables(referenceentry, referenceentry1);
            CustomConcurrentHashMap.nullifyEvictable(((CustomConcurrentHashMap.ReferenceEntry) (obj)));
            return referenceentry1 != CustomConcurrentHashMap.NullEntry.INSTANCE;
        }

        public int size()
        {
            int i = 0;
            for (CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextEvictable(); referenceentry != head; referenceentry = referenceentry.getNextEvictable())
            {
                i++;
            }

            return i;
        }

        EvictionQueue()
        {
            this$1 = CustomConcurrentHashMap.Segment.this;
            super();
        }
    }

    class ExpirationQueue extends AbstractQueue
    {

        final CustomConcurrentHashMap.ReferenceEntry head = new _cls1();
        final CustomConcurrentHashMap.Segment this$1;

        public void clear()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry1;
            for (CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextExpirable(); referenceentry != head; referenceentry = referenceentry1)
            {
                referenceentry1 = referenceentry.getNextExpirable();
                CustomConcurrentHashMap.nullifyExpirable(referenceentry);
            }

            head.setNextExpirable(head);
            head.setPreviousExpirable(head);
        }

        public boolean contains(Object obj)
        {
            return ((CustomConcurrentHashMap.ReferenceEntry)obj).getNextExpirable() != CustomConcurrentHashMap.NullEntry.INSTANCE;
        }

        public boolean isEmpty()
        {
            return head.getNextExpirable() == head;
        }

        public Iterator iterator()
        {
            return new AbstractLinkedIterator(peek()) {

                final ExpirationQueue this$2;

                protected CustomConcurrentHashMap.ReferenceEntry computeNext(CustomConcurrentHashMap.ReferenceEntry referenceentry)
                {
                    CustomConcurrentHashMap.ReferenceEntry referenceentry1 = referenceentry.getNextExpirable();
                    referenceentry = referenceentry1;
                    if (referenceentry1 == head)
                    {
                        referenceentry = null;
                    }
                    return referenceentry;
                }

                protected volatile Object computeNext(Object obj)
                {
                    return computeNext((CustomConcurrentHashMap.ReferenceEntry)obj);
                }

            
            {
                this$2 = ExpirationQueue.this;
                super(referenceentry);
            }
            };
        }

        public boolean offer(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            CustomConcurrentHashMap.connectExpirables(referenceentry.getPreviousExpirable(), referenceentry.getNextExpirable());
            CustomConcurrentHashMap.connectExpirables(head.getPreviousExpirable(), referenceentry);
            CustomConcurrentHashMap.connectExpirables(referenceentry, head);
            return true;
        }

        public volatile boolean offer(Object obj)
        {
            return offer((CustomConcurrentHashMap.ReferenceEntry)obj);
        }

        public CustomConcurrentHashMap.ReferenceEntry peek()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry1 = head.getNextExpirable();
            CustomConcurrentHashMap.ReferenceEntry referenceentry = referenceentry1;
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

        public CustomConcurrentHashMap.ReferenceEntry poll()
        {
            CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextExpirable();
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
            obj = (CustomConcurrentHashMap.ReferenceEntry)obj;
            CustomConcurrentHashMap.ReferenceEntry referenceentry = ((CustomConcurrentHashMap.ReferenceEntry) (obj)).getPreviousExpirable();
            CustomConcurrentHashMap.ReferenceEntry referenceentry1 = ((CustomConcurrentHashMap.ReferenceEntry) (obj)).getNextExpirable();
            CustomConcurrentHashMap.connectExpirables(referenceentry, referenceentry1);
            CustomConcurrentHashMap.nullifyExpirable(((CustomConcurrentHashMap.ReferenceEntry) (obj)));
            return referenceentry1 != CustomConcurrentHashMap.NullEntry.INSTANCE;
        }

        public int size()
        {
            int i = 0;
            for (CustomConcurrentHashMap.ReferenceEntry referenceentry = head.getNextExpirable(); referenceentry != head; referenceentry = referenceentry.getNextExpirable())
            {
                i++;
            }

            return i;
        }

        ExpirationQueue()
        {
            this$1 = CustomConcurrentHashMap.Segment.this;
            super();
        }
    }


    final Queue cleanupQueue = new ConcurrentLinkedQueue();
    final Runnable cleanupRunnable = new Runnable() {

        final CustomConcurrentHashMap.Segment this$1;

        public void run()
        {
            runCleanup();
        }

            
            {
                this$1 = CustomConcurrentHashMap.Segment.this;
                super();
            }
    };
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

    boolean clearValue(Object obj, int i, erence erence)
    {
        lock();
        eEntry eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (!keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (eentry.getValueReference() != erence)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        enqueueCleanup(eentry);
        unlock();
        return true;
        unlock();
        return false;
        eentry = eentry.getNext();
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
        eEntry eentry;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        eentry = getFirst(i);
_L2:
        flag = flag1;
        if (eentry == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (eentry.getHash() == i)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        eentry = eentry.getNext();
        Object obj1;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj1 = eentry.getKey()) == null || !keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getLiveValue(eentry) != null)
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
        eEntry eentry = (eEntry)atomicreferencearray.get(i);
_L5:
        Object obj1;
        if (eentry == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = getLiveValue(eentry);
          goto _L3
_L7:
        eentry = eentry.getNext();
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
            eEntry eentry = (eEntry)recencyQueue.poll();
            if (eentry == null)
            {
                break;
            }
            if (evictionQueue.contains(eentry))
            {
                evictionQueue.add(eentry);
            }
            if (expiresAfterAccess() && expirationQueue.contains(eentry))
            {
                expirationQueue.add(eentry);
            }
        } while (true);
    }

    void enqueueCleanup(eEntry eentry)
    {
        eentry.setValueReference(CustomConcurrentHashMap.unset());
        cleanupQueue.offer(eentry);
        evictionQueue.remove(eentry);
        expirationQueue.remove(eentry);
    }

    boolean evictEntries()
    {
        if (evictsBySize() && count >= maxSegmentSize)
        {
            drainRecencyQueue();
            eEntry eentry = (eEntry)evictionQueue.remove();
            if (!unsetEntry(eentry, eentry.getHash()))
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
            eEntry eentry1 = (eEntry)atomicreferencearray.get(i);
            if (eentry1 != null)
            {
                eEntry eentry = eentry1.getNext();
                int j = eentry1.getHash() & k1;
                if (eentry == null)
                {
                    atomicreferencearray1.set(j, eentry1);
                } else
                {
                    eEntry eentry3 = eentry1;
                    while (eentry != null) 
                    {
                        int i1 = eentry.getHash() & k1;
                        int l = j;
                        if (i1 != j)
                        {
                            l = i1;
                            eentry3 = eentry;
                        }
                        eentry = eentry.getNext();
                        j = l;
                    }
                    atomicreferencearray1.set(j, eentry3);
                    eentry = eentry1;
                    while (eentry != eentry3) 
                    {
                        if (isCollected(eentry))
                        {
                            unsetLiveEntry(eentry, eentry.getHash());
                        } else
                        {
                            int k = eentry.getHash() & k1;
                            eEntry eentry2 = (eEntry)atomicreferencearray1.get(k);
                            atomicreferencearray1.set(k, copyEntry(eentry, eentry2));
                        }
                        eentry = eentry.getNext();
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
            eEntry eentry = (eEntry)expirationQueue.peek();
            if (eentry == null || !isExpired(eentry, l))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!unsetEntry(eentry, eentry.getHash()))
            {
                throw new AssertionError();
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    Object get(Object obj, int i)
    {
        eEntry eentry;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (eentry.getHash() == i)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        eentry = eentry.getNext();
        Object obj1;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj1 = eentry.getKey()) == null) goto _L4; else goto _L3
_L3:
        if (!keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L5
_L5:
        obj = getLiveValue(eentry);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        recordRead(eentry);
        postReadCleanup();
        return obj;
        postReadCleanup();
        return null;
        obj;
        postReadCleanup();
        throw obj;
    }

    eEntry getEntry(Object obj, int i)
    {
        eEntry eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (eentry.getHash() == i)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        eentry = eentry.getNext();
        Object obj1;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj1 = eentry.getKey()) == null || !keyEquivalence.equivalent(obj, obj1)) goto _L4; else goto _L3
_L3:
        return eentry;
        return null;
    }

    eEntry getFirst(int i)
    {
        AtomicReferenceArray atomicreferencearray = table;
        return (eEntry)atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
    }

    Object getLiveValue(eEntry eentry)
    {
        Object obj;
        if (eentry.getKey() == null)
        {
            obj = null;
        } else
        {
            Object obj1 = eentry.getValueReference().get();
            if (obj1 == null)
            {
                return null;
            }
            obj = obj1;
            if (expires())
            {
                obj = obj1;
                if (isExpired(eentry))
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
                eEntry eentry2 = (eEntry)cleanupQueue.poll();
                if (eentry2 != null)
                {
                    int j = eentry2.getHash() & atomicreferencearray.length() - 1;
                    eEntry eentry1 = (eEntry)atomicreferencearray.get(j);
                    eEntry eentry = eentry1;
                    do
                    {
                        if (eentry == null)
                        {
                            continue label0;
                        }
                        if (eentry == eentry2)
                        {
                            if (isUnset(eentry))
                            {
                                atomicreferencearray.set(j, removeFromChain(eentry1, eentry));
                                i++;
                            }
                            continue label0;
                        }
                        eentry = eentry.getNext();
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
        obj2 = (eEntry)atomicreferencearray.get(k);
        Object obj3 = obj2;
_L5:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        Object obj4 = ((eEntry) (obj3)).getKey();
        if (((eEntry) (obj3)).getHash() != i || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        if (!keyEquivalence.equivalent(obj, obj4))
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj = ((eEntry) (obj3)).getValueReference();
        obj2 = ((erence) (obj)).get();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        modCount = modCount + 1;
        ((erence) (obj)).notifyValueReclaimed();
        evictEntries();
        count = count + 1;
_L4:
        setValue(((eEntry) (obj3)), obj1);
        unlock();
        postWriteCleanup();
        return obj2;
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        recordLockedRead(((eEntry) (obj3)));
        unlock();
        postWriteCleanup();
        return obj2;
        obj3 = ((eEntry) (obj3)).getNext();
          goto _L5
        if (evictEntries())
        {
            j = count + 1;
            obj2 = (eEntry)atomicreferencearray.get(k);
        }
        modCount = modCount + 1;
        obj = newEntry(obj, i, ((eEntry) (obj2)));
        setValue(((eEntry) (obj)), obj1);
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

    void recordExpirationTime(eEntry eentry, long l)
    {
        eentry.setExpirationTime(ticker.read() + l);
    }

    void recordLockedRead(eEntry eentry)
    {
        evictionQueue.add(eentry);
        if (expiresAfterAccess())
        {
            recordExpirationTime(eentry, expireAfterAccessNanos);
            expirationQueue.add(eentry);
        }
    }

    void recordRead(eEntry eentry)
    {
        if (expiresAfterAccess())
        {
            recordExpirationTime(eentry, expireAfterAccessNanos);
        }
        recencyQueue.add(eentry);
    }

    void recordWrite(eEntry eentry)
    {
        drainRecencyQueue();
        evictionQueue.add(eentry);
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
            recordExpirationTime(eentry, l);
            expirationQueue.add(eentry);
        }
    }

    Object remove(Object obj, int i)
    {
        lock();
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L6:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (!keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        obj = eentry.getValueReference().get();
        if (obj != null) goto _L2; else goto _L1
_L1:
        unsetLiveEntry(eentry, i);
_L4:
        unlock();
        postWriteCleanup();
        return obj;
_L2:
        modCount = modCount + 1;
        eentry = removeFromChain(eentry1, eentry);
        i = count;
        atomicreferencearray.set(j, eentry);
        count = i - 1;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
        eentry = eentry.getNext();
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
        eEntry eentry1;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        j = count;
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        eentry1 = (eEntry)atomicreferencearray.get(j);
        eEntry eentry = eentry1;
_L6:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = eentry.getKey();
        if (eentry.getHash() != i || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        if (!keyEquivalence.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = eentry.getValueReference().get();
        if (obj != null) goto _L2; else goto _L1
_L1:
        unsetLiveEntry(eentry, i);
_L4:
        unlock();
        postWriteCleanup();
        return false;
_L2:
        if (!valueEquivalence.equivalent(obj1, obj)) goto _L4; else goto _L3
_L3:
        modCount = modCount + 1;
        obj = removeFromChain(eentry1, eentry);
        i = count;
        atomicreferencearray.set(j, obj);
        count = i - 1;
        unlock();
        postWriteCleanup();
        return true;
        eentry = eentry.getNext();
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

    eEntry removeFromChain(eEntry eentry, eEntry eentry1)
    {
        evictionQueue.remove(eentry1);
        expirationQueue.remove(eentry1);
        eEntry eentry2 = eentry1.getNext();
        while (eentry != eentry1) 
        {
            if (isCollected(eentry))
            {
                unsetLiveEntry(eentry, eentry.getHash());
            } else
            {
                eentry2 = copyEntry(eentry, eentry2);
            }
            eentry = eentry.getNext();
        }
        return eentry2;
    }

    Object replace(Object obj, int i, Object obj1)
    {
        Preconditions.checkNotNull(obj1);
        lock();
        eEntry eentry;
        preWriteCleanup();
        eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = eentry.getKey();
        if (eentry.getHash() != i || obj2 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        if (!keyEquivalence.equivalent(obj, obj2))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = eentry.getValueReference().get();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        unsetLiveEntry(eentry, i);
        unlock();
        postWriteCleanup();
        return null;
        setValue(eentry, obj1);
        unlock();
        postWriteCleanup();
        return obj;
        eentry = eentry.getNext();
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
        eEntry eentry;
        preWriteCleanup();
        eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = eentry.getKey();
        if (eentry.getHash() != i || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        if (!keyEquivalence.equivalent(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        obj = eentry.getValueReference().get();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        unsetLiveEntry(eentry, i);
        unlock();
        postWriteCleanup();
        return false;
        if (!valueEquivalence.equivalent(obj1, obj))
        {
            break MISSING_BLOCK_LABEL_144;
        }
        setValue(eentry, obj2);
        unlock();
        postWriteCleanup();
        return true;
        recordLockedRead(eentry);
        unlock();
        postWriteCleanup();
        return false;
        eentry = eentry.getNext();
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

    void setValue(eEntry eentry, Object obj)
    {
        recordWrite(eentry);
        eentry.setValueReference(newValueReference(eentry, obj));
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

    boolean unsetEntry(eEntry eentry, int i)
    {
        for (eEntry eentry1 = getFirst(i); eentry1 != null; eentry1 = eentry1.getNext())
        {
            if (eentry1 == eentry)
            {
                return unsetLiveEntry(eentry, i);
            }
        }

        return false;
    }

    boolean unsetKey(eEntry eentry, int i)
    {
        lock();
        Object obj;
        int j;
        j = count;
        obj = table;
        obj = (eEntry)((AtomicReferenceArray) (obj)).get(i & ((AtomicReferenceArray) (obj)).length() - 1);
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj != eentry)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        modCount = modCount + 1;
        enqueueNotification(((eEntry) (obj)).getKey(), i, ((eEntry) (obj)).getValueReference());
        enqueueCleanup(((eEntry) (obj)));
        count = j - 1;
        unlock();
        return true;
        obj = ((eEntry) (obj)).getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        return false;
        eentry;
        unlock();
        throw eentry;
    }

    boolean unsetLiveEntry(eEntry eentry, int i)
    {
        if (!isUnset(eentry))
        {
            int j = count;
            modCount = modCount + 1;
            erence erence = eentry.getValueReference();
            if (!erence.isComputingReference())
            {
                Object obj = eentry.getKey();
                enqueueNotification(obj, i, erence);
                enqueueCleanup(eentry);
                count = j - 1;
                return true;
            }
        }
        return false;
    }

    boolean unsetValue(Object obj, int i, erence erence)
    {
        lock();
        eEntry eentry;
        int j;
        j = count;
        eentry = getFirst(i);
_L2:
        if (eentry == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = eentry.getKey();
        if (eentry.getHash() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (!keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (eentry.getValueReference() != erence)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        modCount = modCount + 1;
        enqueueNotification(obj, i, erence);
        enqueueCleanup(eentry);
        count = j - 1;
        unlock();
        return true;
        unlock();
        return false;
        eentry = eentry.getNext();
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        return false;
        obj;
        unlock();
        throw obj;
    }

    EvictionQueue(int i, int j)
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

    // Unreferenced inner class com/google/common/collect/CustomConcurrentHashMap$Segment$EvictionQueue$1

/* anonymous class */
    class EvictionQueue._cls1
        implements CustomConcurrentHashMap.ReferenceEntry
    {

        CustomConcurrentHashMap.ReferenceEntry nextEvictable;
        CustomConcurrentHashMap.ReferenceEntry previousEvictable;
        final EvictionQueue this$2;

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

        public CustomConcurrentHashMap.ReferenceEntry getNext()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextEvictable()
        {
            return nextEvictable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousEvictable()
        {
            return previousEvictable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousExpirable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long l)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            nextEvictable = referenceentry;
        }

        public void setNextExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            previousEvictable = referenceentry;
        }

        public void setPreviousExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setValueReference(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = EvictionQueue.this;
                super();
                nextEvictable = this;
                previousEvictable = this;
            }
    }


    // Unreferenced inner class com/google/common/collect/CustomConcurrentHashMap$Segment$ExpirationQueue$1

/* anonymous class */
    class ExpirationQueue._cls1
        implements CustomConcurrentHashMap.ReferenceEntry
    {

        CustomConcurrentHashMap.ReferenceEntry nextExpirable;
        CustomConcurrentHashMap.ReferenceEntry previousExpirable;
        final ExpirationQueue this$2;

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

        public CustomConcurrentHashMap.ReferenceEntry getNext()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getNextExpirable()
        {
            return nextExpirable;
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousEvictable()
        {
            throw new UnsupportedOperationException();
        }

        public CustomConcurrentHashMap.ReferenceEntry getPreviousExpirable()
        {
            return previousExpirable;
        }

        public CustomConcurrentHashMap.ValueReference getValueReference()
        {
            throw new UnsupportedOperationException();
        }

        public void notifyKeyReclaimed()
        {
        }

        public void notifyValueReclaimed(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long l)
        {
        }

        public void setNextEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            nextExpirable = referenceentry;
        }

        public void setPreviousEvictable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(CustomConcurrentHashMap.ReferenceEntry referenceentry)
        {
            previousExpirable = referenceentry;
        }

        public void setValueReference(CustomConcurrentHashMap.ValueReference valuereference)
        {
            throw new UnsupportedOperationException();
        }

            
            {
                this$2 = ExpirationQueue.this;
                super();
                nextExpirable = this;
                previousExpirable = this;
            }
    }

}
