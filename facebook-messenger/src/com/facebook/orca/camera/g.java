// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.os.Handler;
import com.facebook.orca.camera.a.c;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.facebook.orca.camera:
//            CropImage, h

class g
    implements Runnable
{

    final CropImage a;

    g(CropImage cropimage)
    {
        a = cropimage;
        super();
    }

    public void run()
    {
        CountDownLatch countdownlatch = new CountDownLatch(1);
        android.graphics.Bitmap bitmap;
        if (CropImage.b(a) != null)
        {
            bitmap = CropImage.b(a).a(-1, 0x100000);
        } else
        {
            bitmap = com.facebook.orca.camera.CropImage.c(a);
        }
        CropImage.e(a).post(new h(this, bitmap, countdownlatch));
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
