// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class aki
{

    aif a;
    public BlockingQueue b;
    private akh c;

    public aki(aif aif1)
    {
        b = new LinkedBlockingQueue();
        c = new akh(TimeUnit.MILLISECONDS, b);
        a = aif1;
    }

    public final boolean a(Runnable runnable, boolean flag)
    {
        if (a.N) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (flag) goto _L4; else goto _L3
_L3:
        runnable.run();
_L5:
        return true;
        runnable;
        if (ajr.a)
        {
            ajn.b(getClass(), "Unexpected error: ");
            ajn.a(runnable);
        }
        if (true) goto _L5; else goto _L4
_L4:
        c.execute(new akj(this, runnable));
        return true;
        runnable;
        if (ajr.a)
        {
            ajn.b(getClass(), "Unable to queue a task: ");
            ajn.a(runnable);
            return false;
        }
        continue; /* Loop/switch isn't completed */
        runnable;
        if (ajr.a)
        {
            ajn.b(getClass(), "Unexpected error: ");
            ajn.a(runnable);
            return false;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
