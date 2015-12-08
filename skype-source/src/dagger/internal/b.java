// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.a;
import javax.inject.Provider;

public final class b
    implements a
{

    static final boolean a;
    private static final Object b = new Object();
    private final Provider c;
    private volatile Object d;

    private b(Provider provider)
    {
        d = b;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static a a(Provider provider)
    {
        if (provider == null)
        {
            throw new NullPointerException();
        }
        if (provider instanceof a)
        {
            return (a)provider;
        } else
        {
            return new b(provider);
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
        if (!dagger/internal/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
