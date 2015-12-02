// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.a:
//            cn, bh, ic, cm, 
//            dd, bj

final class bg extends cn
{

    bg(bj bj1, int i, int j)
    {
        super(bj1, i, j);
    }

    Object a(Object obj, int i, cm cm1, bh bh1)
    {
        System.nanoTime();
        cm1;
        JVM INSTR monitorenter ;
        Object obj1 = bh1.a(obj, i);
        long l = System.nanoTime();
        Object obj2;
        long l1;
        l1 = l;
        obj2 = obj1;
        cm1;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        l1 = l;
        cm1 = ((cm) (obj1));
        if (a(obj, i, obj1, true) == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        l1 = l;
        cm1 = ((cm) (obj1));
        a(obj, i, obj1, ic.REPLACED);
        if (l == 0L)
        {
            System.nanoTime();
        }
        if (obj1 == null)
        {
            b(obj, i, bh1);
        }
        return obj1;
        Exception exception;
        exception;
        obj1 = null;
        l = 0L;
_L4:
        l1 = l;
        obj2 = obj1;
        cm1;
        JVM INSTR monitorexit ;
        l1 = l;
        cm1 = ((cm) (obj1));
        throw exception;
        exception;
        obj1 = cm1;
        cm1 = exception;
_L2:
        if (l1 == 0L)
        {
            System.nanoTime();
        }
        if (obj1 == null)
        {
            b(obj, i, bh1);
        }
        throw cm1;
        cm1;
        obj1 = null;
        l1 = 0L;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        l = 0L;
        continue; /* Loop/switch isn't completed */
        exception;
        l = l1;
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    Object a(Object obj, int i, Function function)
    {
_L19:
        Object obj2 = a(obj, i);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Object obj1 = f(((cm) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a(((cm) (obj2)));
        n();
        return obj1;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        obj1 = obj2;
        if (((cm) (obj2)).getValueReference().b()) goto _L3; else goto _L2
_L2:
        lock();
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        o();
        j = b;
        atomicreferencearray = e;
        k = i & atomicreferencearray.length() - 1;
        obj2 = (cm)atomicreferencearray.get(k);
        obj1 = obj2;
_L16:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_491;
        }
        Object obj3 = ((cm) (obj1)).getKey();
        if (((cm) (obj1)).getHash() != i || obj3 == null) goto _L5; else goto _L4
_L4:
        if (!a.f.equivalent(obj, obj3)) goto _L5; else goto _L6
_L6:
        if (!((cm) (obj1)).getValueReference().b()) goto _L8; else goto _L7
_L7:
        j = 0;
_L14:
        if (j == 0) goto _L10; else goto _L9
_L9:
        obj3 = new bh(function);
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        obj1 = a(obj, i, ((cm) (obj2)));
        ((cm) (obj1)).setValueReference(((dd) (obj3)));
        atomicreferencearray.set(k, obj1);
        obj2 = obj3;
_L17:
        unlock();
        p();
        if (j == 0) goto _L3; else goto _L13
_L13:
        obj = a(obj, i, ((cm) (obj1)), ((bh) (obj2)));
        n();
        return obj;
_L8:
        Object obj4 = ((cm) (obj1)).getValueReference().get();
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        a(obj3, i, obj4, ic.COLLECTED);
_L15:
        this.k.remove(obj1);
        l.remove(obj1);
        b = j - 1;
        j = 1;
          goto _L14
        if (!a.b() || !a.c(((cm) (obj1))))
        {
            break MISSING_BLOCK_LABEL_380;
        }
        a(obj3, i, obj4, ic.EXPIRED);
          goto _L15
        obj;
        unlock();
        p();
        throw obj;
        obj;
        n();
        throw obj;
        b(((cm) (obj1)));
        unlock();
        p();
        n();
        return obj4;
_L5:
        obj1 = ((cm) (obj1)).getNext();
          goto _L16
_L12:
        ((cm) (obj1)).setValueReference(((dd) (obj3)));
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
        Preconditions.checkState(flag, "Recursive computation");
        obj2 = ((cm) (obj1)).getValueReference().c();
        if (obj2 == null) goto _L19; else goto _L18
_L18:
        a(((cm) (obj1)));
        n();
        return obj2;
_L10:
        obj2 = null;
          goto _L17
        j = 1;
          goto _L14
    }
}
