// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.android.slyce.crop:
//            j, CropImageActivity, CropImageView

class k
    implements Runnable
{

    final Bitmap a;
    final CountDownLatch b;
    final j c;

    k(j j1, Bitmap bitmap, CountDownLatch countdownlatch)
    {
        c = j1;
        a = bitmap;
        b = countdownlatch;
        super();
    }

    public void run()
    {
        if (a != CropImageActivity.b(c.a) && a != null)
        {
            CropImageActivity.c(c.a).a(a, true);
            CropImageActivity.b(c.a).recycle();
            CropImageActivity.a(c.a, a);
        }
        if (CropImageActivity.c(c.a).a() == 1.0F)
        {
            CropImageActivity.c(c.a).a(true, true);
        }
        b.countDown();
    }
}
