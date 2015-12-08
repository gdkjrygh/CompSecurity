// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Lazy;
import javax.inject.Provider;

public final class DoubleCheckLazy
    implements Lazy
{

    static final boolean $assertionsDisabled;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private final Provider provider;

    private DoubleCheckLazy(Provider provider1)
    {
        instance = UNINITIALIZED;
        if (!$assertionsDisabled && provider1 == null)
        {
            throw new AssertionError();
        } else
        {
            provider = provider1;
            return;
        }
    }

    public static Lazy create(Provider provider1)
    {
        if (provider1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return new DoubleCheckLazy(provider1);
        }
    }

    public Object get()
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
            obj = provider.get();
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
        if (!dagger/internal/DoubleCheckLazy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
