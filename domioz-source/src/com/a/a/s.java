// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.a.a:
//            h

final class s
{

    final h a;
    private boolean b;
    private final CountDownLatch c;

    private s(h h)
    {
        a = h;
        super();
        b = false;
        c = new CountDownLatch(1);
    }

    s(h h, byte byte0)
    {
        this(h);
    }

    final void a(boolean flag)
    {
        b = flag;
        c.countDown();
    }

    final boolean a()
    {
        return b;
    }

    final void b()
    {
        try
        {
            c.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
