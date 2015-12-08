// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageRenderer, OpenGlUtils, GPUImageFilter

class val.recycle
    implements Runnable
{

    final GPUImageRenderer this$0;
    final Bitmap val$bitmap;
    final boolean val$recycle;

    public void run()
    {
        GPUImageRenderer.access$1102(GPUImageRenderer.this, 0);
        GPUImageRenderer.access$402(GPUImageRenderer.this, OpenGlUtils.loadTexture(val$bitmap, GPUImageRenderer.access$400(GPUImageRenderer.this), val$recycle));
        GPUImageFilter.mSrcThumbnailTexId = GPUImageRenderer.access$400(GPUImageRenderer.this);
        GPUImageRenderer.access$002(GPUImageRenderer.this, val$bitmap.getWidth());
        GPUImageRenderer.access$102(GPUImageRenderer.this, val$bitmap.getHeight());
        GPUImageRenderer.access$500(GPUImageRenderer.this);
    }

    ()
    {
        this$0 = final_gpuimagerenderer;
        val$bitmap = bitmap1;
        val$recycle = Z.this;
        super();
    }
}
