// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import p.u.a;
import p.u.b;

// Referenced classes of package p.s:
//            c

private static class a
    implements g.Object
{

    private final p.u.b a;
    private volatile a b;

    public a a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = a.a();
        }
        if (b == null)
        {
            b = new b();
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

    public (p.u. )
    {
        a = ;
    }
}
