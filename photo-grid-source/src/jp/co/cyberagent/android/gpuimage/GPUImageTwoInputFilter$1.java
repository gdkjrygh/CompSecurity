// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;
import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter, OpenGlUtils

class val.bitmap
    implements Runnable
{

    final GPUImageTwoInputFilter this$0;
    final Bitmap val$bitmap;

    public void run()
    {
        if (mFilterSourceTexture2 != -1 || val$bitmap == null || val$bitmap.isRecycled())
        {
            return;
        } else
        {
            GLES20.glActiveTexture(33987);
            mFilterSourceTexture2 = OpenGlUtils.loadTexture(val$bitmap, -1, true);
            return;
        }
    }

    ()
    {
        this$0 = final_gpuimagetwoinputfilter;
        val$bitmap = Bitmap.this;
        super();
    }
}
