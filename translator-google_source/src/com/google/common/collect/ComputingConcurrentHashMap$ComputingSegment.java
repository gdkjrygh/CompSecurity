// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.d;
import com.google.common.base.p;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            aj, cj, cr, MapMakerInternalMap

final class  extends 
{

    final Object compute(Object obj, int i, cj cj1, aj aj1)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        System.nanoTime();
        cj1;
        JVM INSTR monitorenter ;
        obj1 = aj1.a(obj);
        obj2 = obj1;
        long l = System.nanoTime();
        long l1;
        obj2 = obj1;
        l1 = l;
        cj1;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        cj1 = ((cj) (obj1));
        l1 = l;
        if (put(obj, i, obj1, true) == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        cj1 = ((cj) (obj1));
        l1 = l;
        enqueueNotification(obj, i, obj1, enqueueNotification);
        if (l == 0L)
        {
            System.nanoTime();
        }
        if (obj1 == null)
        {
            clearValue(obj, i, aj1);
        }
        return obj1;
        Exception exception;
        exception;
        l = 0L;
        obj1 = obj2;
_L4:
        obj2 = obj1;
        l1 = l;
        cj1;
        JVM INSTR monitorexit ;
        cj1 = ((cj) (obj1));
        l1 = l;
        throw exception;
        obj2;
        obj1 = cj1;
        cj1 = ((cj) (obj2));
_L2:
        if (l1 == 0L)
        {
            System.nanoTime();
        }
        if (obj1 == null)
        {
            clearValue(obj, i, aj1);
        }
        throw cj1;
        cj1;
        l1 = 0L;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj1 = obj2;
        l = l1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    final Object getOrCompute(Object obj, int i, d d)
    {
_L19:
        Object obj2 = getEntry(obj, i);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Object obj1 = getLiveValue(((cj) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        recordRead(((cj) (obj2)));
        postReadCleanup();
        return obj1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (((cj) (obj2)).getValueReference().b()) goto _L3; else goto _L2
_L2:
        lock();
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        preWriteCleanup();
        j = count;
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj2 = (cj)atomicreferencearray.get(k);
        obj1 = obj2;
_L16:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        Object obj3 = ((cj) (obj1)).getKey();
        if (((cj) (obj1)).getHash() != i || obj3 == null) goto _L5; else goto _L4
_L4:
        if (!map.keyEquivalence.equivalent(obj, obj3)) goto _L5; else goto _L6
_L6:
        if (!((cj) (obj1)).getValueReference().b()) goto _L8; else goto _L7
_L7:
        j = 0;
_L14:
        if (j == 0) goto _L10; else goto _L9
_L9:
        obj3 = new aj(d);
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        obj1 = newEntry(obj, i, ((cj) (obj2)));
        ((cj) (obj1)).setValueReference(((cr) (obj3)));
        atomicreferencearray.set(k, obj1);
        obj2 = obj3;
_L17:
        unlock();
        postWriteCleanup();
        if (j == 0) goto _L3; else goto _L13
_L13:
        obj = compute(obj, i, ((cj) (obj1)), ((aj) (obj2)));
        postReadCleanup();
        return obj;
_L8:
        Object obj4 = ((cj) (obj1)).getValueReference().get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        enqueueNotification(obj3, i, obj4, enqueueNotification);
_L15:
        evictionQueue.remove(obj1);
        expirationQueue.remove(obj1);
        count = j - 1;
        j = 1;
          goto _L14
        if (!map.expires() || !map.isExpired(((cj) (obj1))))
        {
            break MISSING_BLOCK_LABEL_380;
        }
        enqueueNotification(obj3, i, obj4, enqueueNotification);
          goto _L15
        obj;
        unlock();
        postWriteCleanup();
        throw obj;
        obj;
        postReadCleanup();
        throw obj;
        recordLockedRead(((cj) (obj1)));
        unlock();
        postWriteCleanup();
        postReadCleanup();
        return obj4;
_L5:
        obj1 = ((cj) (obj1)).getNext();
          goto _L16
_L12:
        ((cj) (obj1)).setValueReference(((cr) (obj3)));
        obj2 = obj3;
          goto _L17
_L3:
        boolean flag;
        if (!Thread.holdsLock(obj1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Recursive computation");
        obj2 = ((cj) (obj1)).getValueReference().c();
        if (obj2 == null) goto _L19; else goto _L18
_L18:
        recordRead(((cj) (obj1)));
        postReadCleanup();
        return obj2;
_L10:
        obj2 = null;
          goto _L17
        j = 1;
          goto _L14
    }

    (MapMakerInternalMap mapmakerinternalmap, int i, int j)
    {
        super(mapmakerinternalmap, i, j);
    }
}
