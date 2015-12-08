// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc.a;

import java.util.Queue;

// Referenced classes of package com.cm.kinfoc.a:
//            a, d

final class b extends Thread
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
_L2:
        Queue queue = com.cm.kinfoc.a.a.a(a);
        queue;
        JVM INSTR monitorenter ;
        boolean flag = com.cm.kinfoc.a.a.a(a).isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        com.cm.kinfoc.a.a.a(a).wait(com.cm.kinfoc.a.a.b(a));
        if (!com.cm.kinfoc.a.a.a(a).isEmpty())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        com.cm.kinfoc.a.a.c(a);
        queue;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.cm.kinfoc.a.a.c(a);
        queue;
        JVM INSTR monitorexit ;
        return;
        obj;
        queue;
        JVM INSTR monitorexit ;
        throw obj;
        Object obj1 = com.cm.kinfoc.a.a.a(a).poll();
        queue;
        JVM INSTR monitorexit ;
        if (com.cm.kinfoc.a.a.d(a) != null)
        {
            com.cm.kinfoc.a.a.d(a).a(obj1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
