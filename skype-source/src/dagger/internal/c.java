// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.a;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory

public final class c
    implements a, Provider
{

    static final boolean a;
    private static final Object b = new Object();
    private final Factory c;
    private volatile Object d;

    private c(Factory factory)
    {
        d = b;
        if (!a && factory == null)
        {
            throw new AssertionError();
        } else
        {
            c = factory;
            return;
        }
    }

    public static Provider a(Factory factory)
    {
        if (factory == null)
        {
            throw new NullPointerException();
        } else
        {
            return new c(factory);
        }
    }

    public final Object get()
    {
        Object obj;
        obj = d;
        if (obj != b)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = d;
        obj = obj1;
        if (obj1 == b)
        {
            obj = c.get();
            d = obj;
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
        if (!dagger/internal/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
