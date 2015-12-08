// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageRenderer, GPUImageFilter

class val.filter
    implements Runnable
{

    final GPUImageRenderer this$0;
    final GPUImageFilter val$filter;

    public void run()
    {
        GPUImageFilter gpuimagefilter = GPUImageRenderer.access$800(GPUImageRenderer.this);
        GPUImageRenderer.access$802(GPUImageRenderer.this, val$filter);
        if (gpuimagefilter != null)
        {
            gpuimagefilter.destroy();
        }
        GPUImageRenderer.access$800(GPUImageRenderer.this).init();
        GLES20.glUseProgram(GPUImageRenderer.access$800(GPUImageRenderer.this).getProgram());
        GPUImageRenderer.access$800(GPUImageRenderer.this).onOutputSizeChanged(GPUImageRenderer.access$900(GPUImageRenderer.this), GPUImageRenderer.access$1000(GPUImageRenderer.this));
    }

    ()
    {
        this$0 = final_gpuimagerenderer;
        val$filter = GPUImageFilter.this;
        super();
    }
}
