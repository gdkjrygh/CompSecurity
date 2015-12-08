// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            ConcurrentInitializer, ConcurrentException

public abstract class AtomicInitializer
    implements ConcurrentInitializer
{

    private final AtomicReference reference = new AtomicReference();

    public AtomicInitializer()
    {
    }

    public Object get()
        throws ConcurrentException
    {
        Object obj1 = reference.get();
        Object obj = obj1;
        if (obj1 == null)
        {
            Object obj2 = initialize();
            obj = obj2;
            if (!reference.compareAndSet(null, obj2))
            {
                obj = reference.get();
            }
        }
        return obj;
    }

    protected abstract Object initialize()
        throws ConcurrentException;
}
