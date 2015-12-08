// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            ConcurrentInitializer, ConcurrentException

public abstract class AtomicSafeInitializer
    implements ConcurrentInitializer
{

    private final AtomicReference factory = new AtomicReference();
    private final AtomicReference reference = new AtomicReference();

    public AtomicSafeInitializer()
    {
    }

    public final Object get()
        throws ConcurrentException
    {
        Object obj;
        do
        {
            obj = reference.get();
            if (obj != null)
            {
                break;
            }
            if (factory.compareAndSet(null, this))
            {
                reference.set(initialize());
            }
        } while (true);
        return obj;
    }

    protected abstract Object initialize()
        throws ConcurrentException;
}
