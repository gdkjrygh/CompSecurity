// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory

public final class ScopedProvider
    implements Provider
{

    static final boolean $assertionsDisabled;
    private static final Object UNINITIALIZED = new Object();
    private final Factory factory;
    private volatile Object instance;

    private ScopedProvider(Factory factory1)
    {
        instance = UNINITIALIZED;
        if (!$assertionsDisabled && factory1 == null)
        {
            throw new AssertionError();
        } else
        {
            factory = factory1;
            return;
        }
    }

    public static Provider create(Factory factory1)
    {
        if (factory1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return new ScopedProvider(factory1);
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
