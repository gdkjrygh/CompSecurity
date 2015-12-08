// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import a.a.a;

// Referenced classes of package dagger.internal:
//            a

public final class b
    implements a
{

    static final boolean a;
    private static final Object b = new Object();
    private final dagger.internal.a c;
    private volatile Object d;

    private b(dagger.internal.a a1)
    {
        d = b;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = a1;
            return;
        }
    }

    public static a a(dagger.internal.a a1)
    {
        if (a1 == null)
        {
            throw new NullPointerException();
        } else
        {
            return new b(a1);
        }
    }

    public final Object a()
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
            obj = c.a();
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
