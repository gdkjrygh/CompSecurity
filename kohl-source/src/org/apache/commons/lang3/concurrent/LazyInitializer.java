// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;


// Referenced classes of package org.apache.commons.lang3.concurrent:
//            ConcurrentInitializer, ConcurrentException

public abstract class LazyInitializer
    implements ConcurrentInitializer
{

    private volatile Object object;

    public LazyInitializer()
    {
    }

    public Object get()
        throws ConcurrentException
    {
        Object obj;
        obj = object;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = object;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj = initialize();
        object = obj;
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return obj;
    }

    protected abstract Object initialize()
        throws ConcurrentException;
}
