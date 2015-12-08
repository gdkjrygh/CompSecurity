// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

final class alv
{

    boolean a;
    final CountDownLatch b;

    private alv()
    {
        a = false;
        b = new CountDownLatch(1);
    }

    alv(byte byte0)
    {
        this();
    }

    final void a(boolean flag)
    {
        a = flag;
        b.countDown();
    }
}
