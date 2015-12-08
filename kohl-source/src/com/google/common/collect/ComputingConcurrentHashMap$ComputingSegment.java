// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap

class this._cls0 extends this._cls0
{

    final ComputingConcurrentHashMap this$0;

    Object compute(Object obj, int i)
    {
_L3:
        Object obj5;
        Object obj7;
        Object obj8;
        obj5 = get(obj, i);
        if (obj5 != null)
        {
            return obj5;
        }
        obj8 = null;
        obj7 = null;
        lock();
        Object obj6;
        AtomicReferenceArray atomicreferencearray;
        int j;
        preWriteCleanup();
        atomicreferencearray = table;
        j = i & atomicreferencearray.length() - 1;
        obj6 = (table)atomicreferencearray.get(j);
        Object obj4 = obj6;
_L2:
        Object obj1;
        Object obj3;
        obj3 = obj8;
        obj1 = obj5;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj1 = ((table) (obj4)).y();
        if (((y) (obj4)).sh() != i || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        if (!keyEquivalence.equivalent(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_313;
        }
        obj1 = obj5;
        if (((sh) (obj4)).lueReference().putingReference())
        {
            break MISSING_BLOCK_LABEL_466;
        }
        obj1 = getLiveValue(((getLiveValue) (obj4)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        recordLockedRead(((recordLockedRead) (obj4)));
        unlock();
        postWriteCleanup();
        return obj1;
        unsetLiveEntry(((unsetLiveEntry) (obj4)), i);
        break MISSING_BLOCK_LABEL_466;
        Object obj2;
        erence erence;
        Exception exception;
        boolean flag;
        boolean flag1;
        for (; obj3 == null; obj3 = obj4)
        {
            break MISSING_BLOCK_LABEL_196;
        }

        erence = obj7;
        obj4 = obj3;
        if (!isUnset(((unsetLiveEntry) (obj3))))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        erence = new erence(ComputingConcurrentHashMap.this, null);
        obj4 = obj3;
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        obj4 = newEntry(obj, i, ((this._cls0) (obj6)));
        atomicreferencearray.set(j, obj4);
        ((this._cls0) (obj4)).lueReference(erence);
        unlock();
        postWriteCleanup();
        if (erence == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = obj1;
        obj4;
        JVM INSTR monitorenter ;
        obj6 = erence.compute(obj, i);
        obj1 = obj6;
        obj4;
        JVM INSTR monitorexit ;
        obj3 = obj6;
        Preconditions.checkNotNull(obj6, "compute() returned null unexpectedly");
        if (obj6 == null)
        {
            clearValue(obj, i, erence);
        }
        return obj6;
        obj4 = ((clearValue) (obj4)).xt();
        if (true) goto _L2; else goto _L1
        obj;
_L5:
        unlock();
        postWriteCleanup();
        throw obj;
        exception;
        obj4;
        JVM INSTR monitorexit ;
        obj3 = obj1;
        throw exception;
        obj2;
        if (obj3 == null)
        {
            clearValue(obj, i, erence);
        }
        throw obj2;
_L1:
        flag = false;
_L4:
        if (!Thread.holdsLock(obj4))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Recursive computation");
        obj2 = ((clearValue) (obj4)).lueReference().orValue();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        recordRead(((recordRead) (obj4)));
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj2;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
          goto _L3
        obj2;
        flag = true;
          goto _L4
        obj;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw obj;
        obj;
          goto _L5
    }

    erence(int i, int j)
    {
        this$0 = ComputingConcurrentHashMap.this;
        super(ComputingConcurrentHashMap.this, i, j);
    }
}
