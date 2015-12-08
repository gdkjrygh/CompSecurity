// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.roidapp.imagelib.crop:
//            a, c

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        android.graphics.Bitmap bitmap = com.roidapp.imagelib.crop.a.a(a);
        com.roidapp.imagelib.crop.a.c(a).post(new c(this, bitmap, countdownlatch));
        try
        {
            countdownlatch.await();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        a.e.run();
    }
}
