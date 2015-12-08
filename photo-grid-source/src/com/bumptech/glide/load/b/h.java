// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import com.bumptech.glide.load.b.b.a;
import com.bumptech.glide.load.b.b.b;
import com.bumptech.glide.load.b.b.d;

// Referenced classes of package com.bumptech.glide.load.b:
//            b

final class h
    implements com.bumptech.glide.load.b.b
{

    private final b a;
    private volatile a b;

    public h(b b1)
    {
        a = b1;
    }

    public final a a()
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
            b = new d();
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
