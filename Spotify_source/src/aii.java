// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

final class aii
    implements Runnable
{

    private aif a;

    aii(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
        while (a.s() || a.t.get() <= 0) 
        {
            return;
        }
        a.t.getAndDecrement();
        a.e();
    }
}
