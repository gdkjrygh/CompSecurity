// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.android.slyce.crop:
//            CropImageActivity, p, k

class j
    implements Runnable
{

    final CropImageActivity a;

    j(CropImageActivity cropimageactivity)
    {
        a = cropimageactivity;
        super();
    }

    public void run()
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        android.graphics.Bitmap bitmap;
        if (CropImageActivity.e(a) != null)
        {
            bitmap = CropImageActivity.e(a).a(-1, 0x100000);
        } else
        {
            bitmap = CropImageActivity.b(a);
        }
        CropImageActivity.f(a).post(new k(this, bitmap, countdownlatch));
        try
        {
            countdownlatch.await();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        a.d.run();
    }
}
