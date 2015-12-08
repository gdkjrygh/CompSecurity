// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crop;

import android.os.Handler;

// Referenced classes of package com.soundcloud.android.crop:
//            ImageViewTouchBase

class val.centerY
    implements Runnable
{

    final ImageViewTouchBase this$0;
    final float val$centerX;
    final float val$centerY;
    final float val$durationMs;
    final float val$incrementPerMs;
    final float val$oldScale;
    final long val$startTime;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f = Math.min(val$durationMs, l - val$startTime);
        float f1 = val$oldScale;
        float f2 = val$incrementPerMs;
        zoomTo(f1 + f2 * f, val$centerX, val$centerY);
        if (f < val$durationMs)
        {
            handler.post(this);
        }
    }

    ()
    {
        this$0 = final_imageviewtouchbase;
        val$durationMs = f;
        val$startTime = l;
        val$oldScale = f1;
        val$incrementPerMs = f2;
        val$centerX = f3;
        val$centerY = F.this;
        super();
    }
}
