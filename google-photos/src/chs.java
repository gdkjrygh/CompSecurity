// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

final class chs
    implements Runnable
{

    private chq a;

    chs(chq chq1)
    {
        a = chq1;
        super();
    }

    public final void run()
    {
        chq.a(a);
        chq.b(a).countDown();
        return;
        Exception exception;
        exception;
        chq.b(a).countDown();
        throw exception;
    }
}
