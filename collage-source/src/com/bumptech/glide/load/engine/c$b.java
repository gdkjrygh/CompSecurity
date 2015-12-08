// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.b.a;
import com.bumptech.glide.load.engine.b.b;

// Referenced classes of package com.bumptech.glide.load.engine:
//            c

private static class a
    implements a
{

    private final com.bumptech.glide.load.engine.b.nit> a;
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

    public a(com.bumptech.glide.load.engine.b. )
    {
        a = ;
    }
}
