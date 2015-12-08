// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.util.ArrayDeque;
import java.util.Deque;

// Referenced classes of package com.c.a:
//            e

public final class n
{

    private int a;
    private int b;
    private final Deque c = new ArrayDeque();
    private final Deque d = new ArrayDeque();
    private final Deque e = new ArrayDeque();

    public n()
    {
        a = 64;
        b = 5;
    }

    final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        e.add(e1);
        this;
        JVM INSTR monitorexit ;
        return;
        e1;
        throw e1;
    }

    final void b(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.remove(e1))
        {
            throw new AssertionError("Call wasn't in-flight!");
        }
        break MISSING_BLOCK_LABEL_30;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
        this;
        JVM INSTR monitorexit ;
    }
}
