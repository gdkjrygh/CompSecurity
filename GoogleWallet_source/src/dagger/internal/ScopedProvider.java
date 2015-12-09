// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Factory;
import javax.inject.Provider;

public final class ScopedProvider
    implements Provider
{

    static final boolean $assertionsDisabled;
    private static final Object UNINITIALIZED = new Object();
    private final Factory factory;
    private volatile Object instance;

    public final Object get()
    {
        Object obj;
        obj = instance;
        if (obj != UNINITIALIZED)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = instance;
        obj = obj1;
        if (obj1 == UNINITIALIZED)
        {
            obj = factory.get();
            instance = obj;
        }
        this;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        return obj;
    }

    static 
    {
        boolean flag;
        if (!dagger/internal/ScopedProvider.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
