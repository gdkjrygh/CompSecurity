// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

final class dxq
    implements lzt
{

    private dxo a;

    dxq(dxo dxo1)
    {
        a = dxo1;
        super();
    }

    public final void a()
    {
        dxo.a(a).countDown();
    }

    public final void a(int i)
    {
        dxo.a(a).countDown();
        if (dxo.b(a).a())
        {
            noy.a("cause", Integer.valueOf(i));
        }
    }
}
