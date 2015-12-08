// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import com.bumptech.glide.b.a;
import com.bumptech.glide.b.b;
import com.bumptech.glide.i.h;
import java.util.Queue;

final class p
{

    private final Queue a = h.a(0);

    p()
    {
    }

    public final a a(b b)
    {
        this;
        JVM INSTR monitorenter ;
        a a2 = (a)a.poll();
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        a1 = new a(b);
        this;
        JVM INSTR monitorexit ;
        return a1;
        b;
        throw b;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        a1.g();
        a.offer(a1);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }
}
