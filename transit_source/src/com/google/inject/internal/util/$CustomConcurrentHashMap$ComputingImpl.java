// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap, $Function

static class computer extends computer
{

    static final long serialVersionUID = 0L;
    final $Function computer;
    final egy computingStrategy;

    public Object get(Object obj)
    {
        computer computer1;
        int i;
        if (obj == null)
        {
            throw new NullPointerException("key");
        }
        i = hash(obj);
        computer1 = segmentFor(i);
_L7:
        Object obj1;
        Object obj2;
        obj1 = computer1.etEntry(obj, i);
        obj2 = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = false;
        computer1.ock();
        obj2 = computer1.etEntry(obj, i);
        obj1 = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        flag = true;
        int j = computer1.ount;
        if (j > computer1.hreshold)
        {
            computer1.xpand();
        }
        obj2 = computer1.able;
        int k = i & ((AtomicReferenceArray) (obj2)).length() - 1;
        obj1 = ((AtomicReferenceArray) (obj2)).get(k);
        computer1.odCount = computer1.odCount + 1;
        obj1 = computingStrategy.newEntry(obj, i, obj1);
        ((AtomicReferenceArray) (obj2)).set(k, obj1);
        computer1.ount = j + 1;
        computer1.nlock();
        obj2 = obj1;
        if (!flag) goto _L2; else goto _L3
_L3:
        obj2 = computingStrategy.compute(obj, obj1, computer);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        throw new NullPointerException("compute() returned null unexpectedly");
        obj;
        if (true)
        {
            computer1.emoveEntry(obj1, i);
        }
        throw obj;
        obj;
        computer1.nlock();
        throw obj;
        obj = obj2;
        if (false)
        {
            computer1.emoveEntry(obj1, i);
            obj = obj2;
        }
_L4:
        return obj;
_L2:
        flag = false;
_L5:
        obj1 = computingStrategy.waitForValue(obj2);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        computer1.emoveEntry(obj2, i);
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        continue; /* Loop/switch isn't completed */
        obj = obj1;
        if (flag)
        {
            Thread.currentThread().interrupt();
            return obj1;
        }
          goto _L4
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
          goto _L5
        obj;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw obj;
        if (true) goto _L7; else goto _L6
_L6:
    }

    egy(egy egy, egy egy1, $Function $function)
    {
        super(egy, egy1);
        computingStrategy = egy;
        computer = $function;
    }
}
