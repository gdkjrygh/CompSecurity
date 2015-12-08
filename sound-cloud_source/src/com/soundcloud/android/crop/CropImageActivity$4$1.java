// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity, CropImageView

class val.latch
    implements Runnable
{

    final val.latch this$1;
    final CountDownLatch val$latch;

    public void run()
    {
        if (CropImageActivity.access$100(_fld0).getScale() == 1.0F)
        {
            CropImageActivity.access$100(_fld0).center();
        }
        val$latch.countDown();
    }

    ()
    {
        this$1 = final_;
        val$latch = CountDownLatch.this;
        super();
    }
}
