// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.soundcloud.android.crop:
//            CropImageActivity

class this._cls0
    implements Runnable
{

    final CropImageActivity this$0;

    public void run()
    {
        final CountDownLatch latch = new CountDownLatch(1);
        class _cls1
            implements Runnable
        {

            final CropImageActivity._cls4 this$1;
            final CountDownLatch val$latch;

            public void run()
            {
                if (CropImageActivity.access$100(this$0).getScale() == 1.0F)
                {
                    CropImageActivity.access$100(this$0).center();
                }
                latch.countDown();
            }

            _cls1()
            {
                this$1 = CropImageActivity._cls4.this;
                latch = countdownlatch;
                super();
            }
        }

        CropImageActivity.access$200(CropImageActivity.this).post(new _cls1());
        try
        {
            latch.await();
        }
        catch (InterruptedException interruptedexception)
        {
            throw new RuntimeException(interruptedexception);
        }
        (new opper(CropImageActivity.this, null)).crop();
    }

    opper()
    {
        this$0 = CropImageActivity.this;
        super();
    }
}
