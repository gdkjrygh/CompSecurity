// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

final class bjm
    implements Runnable
{

    private CountDownLatch a;
    private CountDownLatch b;
    private bjl c;

    bjm(bjl bjl1, CountDownLatch countdownlatch, CountDownLatch countdownlatch1)
    {
        c = bjl1;
        a = countdownlatch;
        b = countdownlatch1;
        super();
    }

    public final void run()
    {
        dee.a(bjl.a(c));
        a.countDown();
        try
        {
            b.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
        }
    }
}
