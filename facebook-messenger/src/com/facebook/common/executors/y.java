// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.common.executors:
//            w, x

class y
    implements Runnable
{

    final w a;

    private y(w w1)
    {
        a = w1;
        super();
    }

    y(w w1, x x)
    {
        this(w1);
    }

    public void run()
    {
        Object obj = w.a(a);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        ((Runnable) (obj)).run();
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!a.a())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        w.a(a, false);
_L2:
        return;
        w.b(a).execute(this);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!a.a())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        w.a(a, false);
_L4:
        throw exception;
        w.b(a).execute(this);
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
