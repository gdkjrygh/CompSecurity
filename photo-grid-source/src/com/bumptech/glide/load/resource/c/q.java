// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.b.e;
import com.bumptech.glide.i.h;
import java.util.Queue;

final class q
{

    private final Queue a = h.a(0);

    q()
    {
    }

    public final e a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        e e2 = (e)a.poll();
        e e1;
        e1 = e2;
        if (e2 != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        e1 = new e();
        abyte0 = e1.a(abyte0);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        throw abyte0;
    }

    public final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        e1.a();
        a.offer(e1);
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }
}
