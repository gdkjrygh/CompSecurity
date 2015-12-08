// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.CountDownLatch;

final class dxp
    implements lzu
{

    private dxo a;

    dxp(dxo dxo1)
    {
        a = dxo1;
        super();
    }

    public final void a(lzh lzh1)
    {
        dxo.a(a).countDown();
        if (dxo.b(a).a())
        {
            noy.a("error code: ", Integer.valueOf(lzh1.a()));
        }
    }
}
