// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class afv
    implements afo
{

    private static final Object a = new Object();
    private static boolean d;
    private final Provider b;
    private volatile Object c;

    private afv(Provider provider)
    {
        c = a;
        if (!d && provider == null)
        {
            throw new AssertionError();
        } else
        {
            b = provider;
            return;
        }
    }

    public static afo a(Provider provider)
    {
        if (provider == null)
        {
            throw new NullPointerException();
        } else
        {
            return new afv(provider);
        }
    }

    public final Object a()
    {
        Object obj;
        obj = c;
        if (obj != a)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = c;
        obj = obj1;
        if (obj1 == a)
        {
            obj = b.get();
            c = obj;
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
        if (!afv.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
