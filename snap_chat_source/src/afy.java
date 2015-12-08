// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.inject.Provider;

public final class afy
    implements Provider
{

    private static final Object a = new Object();
    private static boolean d;
    private final afw b;
    private volatile Object c;

    private afy(afw afw1)
    {
        c = a;
        if (!d && afw1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = afw1;
            return;
        }
    }

    public static Provider a(afw afw1)
    {
        if (afw1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return new afy(afw1);
        }
    }

    public final Object get()
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
        if (!afy.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }
}
