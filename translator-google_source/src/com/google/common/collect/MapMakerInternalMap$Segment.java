// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.u;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap, ca, cd, cj, 
//            cr

class expirationQueue extends ReentrantLock
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
            enqueueNotification(cj1, IT);
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

    void enqueueNotification(cj cj1, alue alue)
    {
        enqueueNotification(cj1.getKey(), cj1.getHash(), cj1.getValueReference().get(), alue);
    }

    void enqueueNotification(Object obj, int i, Object obj1, enqueueNotification enqueuenotification)
    {
        if (map.removalNotificationQueue != MapMakerInternalMap.DISCARDING_QUEUE)
        {
            obj = new (obj, obj1, enqueuenotification);
            map.removalNotificationQueue.offer(obj);
        }
    }

    boolean evictEntries()
    {
        if (map.evictsBySize() && count >= maxSegmentSize)
        {
            drainRecencyQueue();
            cj cj1 = (cj)evictionQueue.remove();
            if (!removeEntry(cj1, cj1.getHash(), removeEntry))
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
            if (!removeEntry(cj1, cj1.getHash(), D))
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
        enqueueNotification(obj, i, obj4, TED);
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
        enqueueNotification(obj, i, obj4, ED);
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
        enqueueNotification(cj2.getKey(), i, cj2.getValueReference().get(), TED);
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
        enqueueNotification(obj, i, cr1.get(), TED);
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
        obj = IT;
_L1:
        modCount = modCount + 1;
        enqueueNotification(obj1, i, obj2, ((enqueueNotification) (obj)));
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
            obj = TED;
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
        obj = IT;
_L1:
        modCount = modCount + 1;
        enqueueNotification(obj2, i, obj3, ((enqueueNotification) (obj)));
        obj1 = removeFromChain(cj2, cj1);
        i = count;
        atomicreferencearray.set(j, obj1);
        count = i - 1;
        obj1 = IT;
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
            obj = TED;
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
        enqueueNotification(cj1, TED);
        evictionQueue.remove(cj1);
        expirationQueue.remove(cj1);
    }

    boolean removeEntry(cj cj1, int i, expirationQueue expirationqueue)
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
                enqueueNotification(cj2.getKey(), i, cj2.getValueReference().get(), expirationqueue);
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
            enqueueNotification(obj2, i, obj3, TED);
            obj = removeFromChain(cj2, cj1);
            i = count;
            atomicreferencearray.set(j, obj);
            count = i - 1;
        }
        unlock();
        postWriteCleanup();
        return null;
        modCount = modCount + 1;
        enqueueNotification(obj, i, obj3, ED);
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
            enqueueNotification(obj3, i, obj4, TED);
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
        enqueueNotification(obj, i, obj4, ED);
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

    (MapMakerInternalMap mapmakerinternalmap, int i, int j)
    {
        Object obj1 = null;
        super();
        map = mapmakerinternalmap;
        maxSegmentSize = j;
        initTable(newEntryArray(i));
        Object obj;
        if (mapmakerinternalmap.usesKeyReferences())
        {
            obj = new ReferenceQueue();
        } else
        {
            obj = null;
        }
        keyReferenceQueue = ((ReferenceQueue) (obj));
        obj = obj1;
        if (mapmakerinternalmap.usesValueReferences())
        {
            obj = new ReferenceQueue();
        }
        valueReferenceQueue = ((ReferenceQueue) (obj));
        if (mapmakerinternalmap.evictsBySize() || mapmakerinternalmap.expiresAfterAccess())
        {
            obj = new ConcurrentLinkedQueue();
        } else
        {
            obj = MapMakerInternalMap.discardingQueue();
        }
        recencyQueue = ((Queue) (obj));
        if (mapmakerinternalmap.evictsBySize())
        {
            obj = new ca();
        } else
        {
            obj = MapMakerInternalMap.discardingQueue();
        }
        evictionQueue = ((Queue) (obj));
        if (mapmakerinternalmap.expires())
        {
            mapmakerinternalmap = new cd();
        } else
        {
            mapmakerinternalmap = MapMakerInternalMap.discardingQueue();
        }
        expirationQueue = mapmakerinternalmap;
    }
}
