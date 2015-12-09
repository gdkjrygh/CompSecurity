// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

final class aih
    implements Runnable
{

    private aif a;

    aih(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
        if (a.s())
        {
            return;
        }
        if (a.z < 0)
        {
            a.z = 0;
        }
        a.u.getAndIncrement();
        a.e();
    }
}
