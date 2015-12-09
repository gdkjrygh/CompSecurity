// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package p.aq:
//            b

class g
    implements Runnable
{

    final b a;

    g(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        while (a.ap() || a.y.get() <= 0) 
        {
            return;
        }
        a.y.getAndDecrement();
        a.z();
    }
}
