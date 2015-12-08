// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package p.aq:
//            b

class p
    implements Runnable
{

    final b a;

    p(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        while (a.ap() || a.z.get() <= 0) 
        {
            return;
        }
        a.z.getAndDecrement();
        a.z();
    }
}
