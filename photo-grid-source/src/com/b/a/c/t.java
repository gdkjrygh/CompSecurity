// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.b.a.c:
//            h

final class t
{

    final h a;
    private boolean b;
    private final CountDownLatch c;

    private t(h h)
    {
        a = h;
        super();
        b = false;
        c = new CountDownLatch(1);
    }

    t(h h, byte byte0)
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
