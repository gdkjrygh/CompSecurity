// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, CustomConcurrentHashMap, ComputationException

private class <init>
    implements <init>
{

     computedReference;
    final ComputingConcurrentHashMap this$0;

    public void clear()
    {
        setValueReference(new (null));
    }

    Object compute(Object obj, int i)
    {
        Object obj1;
        try
        {
            obj1 = computingFunction.apply(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            setValueReference(new rence(((ComputationException) (obj)).getCause()));
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            setValueReference(new rence(((Throwable) (obj))));
            throw new ComputationException(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            obj = (new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString();
            setValueReference(new rence(((String) (obj))));
            throw new NullPointerException(((String) (obj)));
        } else
        {
            setValueReference(new (obj1));
            segmentFor(i).(obj, i, obj1, true);
            return obj1;
        }
    }

    public  copyFor( )
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return true;
    }

    public void notifyValueReclaimed()
    {
    }

    void setValueReference( )
    {
        this;
        JVM INSTR monitorenter ;
        if (computedReference == CustomConcurrentHashMap.UNSET)
        {
            computedReference = ;
            notifyAll();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        ;
        this;
        JVM INSTR monitorexit ;
        throw ;
    }

    public Object waitForValue()
        throws InterruptedException
    {
        if (computedReference != CustomConcurrentHashMap.UNSET) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (computedReference == CustomConcurrentHashMap.UNSET)
        {
            wait();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return computedReference.();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private rence()
    {
        this$0 = ComputingConcurrentHashMap.this;
        super();
        computedReference = CustomConcurrentHashMap.unset();
    }

    computedReference(computedReference computedreference)
    {
        this();
    }
}
