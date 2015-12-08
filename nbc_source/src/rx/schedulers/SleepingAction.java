// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.schedulers;

import rx.functions.Action0;

class SleepingAction
    implements Action0
{

    private final long execTime;
    private final rx.Scheduler.Worker innerScheduler;
    private final Action0 underlying;

    public SleepingAction(Action0 action0, rx.Scheduler.Worker worker, long l)
    {
        underlying = action0;
        innerScheduler = worker;
        execTime = l;
    }

    public void call()
    {
        if (!innerScheduler.isUnsubscribed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (execTime <= innerScheduler.now())
        {
            continue; /* Loop/switch isn't completed */
        }
        long l = execTime - innerScheduler.now();
        if (l <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedexception);
        }
        if (innerScheduler.isUnsubscribed()) goto _L1; else goto _L3
_L3:
        underlying.call();
        return;
    }
}
