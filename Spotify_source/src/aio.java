// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

final class aio
    implements Runnable
{

    private aif a;

    aio(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
        while (a.s() || a.u.get() <= 0) 
        {
            return;
        }
        a.u.getAndDecrement();
        a.e();
    }
}
