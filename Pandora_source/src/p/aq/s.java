// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aq;

import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package p.aq:
//            b

class s
    implements Runnable
{

    final b a;

    s(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        if (a.ap())
        {
            return;
        } else
        {
            a.y.getAndIncrement();
            a.z();
            return;
        }
    }
}
