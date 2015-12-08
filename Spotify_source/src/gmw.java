// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

public final class gmw extends anq
{

    private final gmx a;
    private final CountDownLatch b = new CountDownLatch(1);

    public gmw(gmx gmx1)
    {
        ctz.a(gmx1);
        a = gmx1;
    }

    protected final Object e()
    {
        return g();
    }

    protected final Void g()
    {
        Void void1 = super.g();
        b.countDown();
        if (d() != null)
        {
            a.a();
        }
        return void1;
    }
}
