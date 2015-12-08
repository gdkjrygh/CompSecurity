// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import dagger.Lazy;

// Referenced classes of package dagger.a:
//            j, b

final class k
    implements Lazy
{

    final j a;
    private volatile Object b;

    k(j j1)
    {
        a = j1;
        super();
        b = j.a();
    }

    public final Object a()
    {
        if (b != j.a()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b == j.a())
        {
            b = j.a(a).get();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
