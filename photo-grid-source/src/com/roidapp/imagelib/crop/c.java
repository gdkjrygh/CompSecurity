// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Bitmap;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.roidapp.imagelib.crop:
//            b, a, CropImageView

final class c
    implements Runnable
{

    final Bitmap a;
    final CountDownLatch b;
    final b c;

    c(b b1, Bitmap bitmap, CountDownLatch countdownlatch)
    {
        c = b1;
        a = bitmap;
        b = countdownlatch;
        super();
    }

    public final void run()
    {
        if (a != com.roidapp.imagelib.crop.a.a(c.a) && a != null)
        {
            com.roidapp.imagelib.crop.a.b(c.a).a(a);
            com.roidapp.imagelib.crop.a.a(c.a).recycle();
            com.roidapp.imagelib.crop.a.a(c.a, a);
        }
        if (com.roidapp.imagelib.crop.a.b(c.a).b() == 1.0F)
        {
            com.roidapp.imagelib.crop.a.b(c.a).a();
        }
        b.countDown();
    }
}
