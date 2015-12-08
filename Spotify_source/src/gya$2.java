// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class c
    implements gye
{

    private CountDownLatch b;
    private int c;
    private gya d;

    public final void a()
    {
        b.countDown();
        if (b.getCount() == 0L)
        {
            gya.a(d).set(true);
            gya.b(d).a();
        }
    }

    public final void a(Exception exception)
    {
        gya.b(d).a(exception);
    }

    (gya gya1, int i)
    {
        d = gya1;
        c = i;
        super();
        b = new CountDownLatch(c);
    }
}
