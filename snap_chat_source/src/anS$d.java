// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

final class 
    implements Executor
{

    private anS a;

    public final void execute(Runnable runnable)
    {
        Object obj1 = a.f;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        if (a.g == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = a.g;
        if (!((a) (obj)).b) goto _L2; else goto _L1
_L1:
        obj = anK.i(((b) (obj)).c);
_L4:
        if (obj != null)
        {
            ((Executor) (obj)).execute(runnable);
            return;
        } else
        {
            anK.c();
            return;
        }
_L2:
        obj = aov.a;
        continue; /* Loop/switch isn't completed */
        runnable;
        obj1;
        JVM INSTR monitorexit ;
        throw runnable;
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private (anS ans)
    {
        a = ans;
        super();
    }

    (anS ans, byte byte0)
    {
        this(ans);
    }
}
