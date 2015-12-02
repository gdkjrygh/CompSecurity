// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.facebook.orca.camera:
//            g, CropImage, CropImageView

class h
    implements Runnable
{

    final Bitmap a;
    final CountDownLatch b;
    final g c;

    h(g g1, Bitmap bitmap, CountDownLatch countdownlatch)
    {
        c = g1;
        a = bitmap;
        b = countdownlatch;
        super();
    }

    public void run()
    {
        if (a != CropImage.c(c.a) && a != null)
        {
            CropImage.d(c.a).a(a, true);
            CropImage.c(c.a).recycle();
            CropImage.a(c.a, a);
        }
        if (CropImage.d(c.a).b() == 1.0F)
        {
            CropImage.d(c.a).a(true, true);
        }
        b.countDown();
    }
}
