// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageRenderer

class this._cls0
    implements Runnable
{

    final GPUImageRenderer this$0;

    public void run()
    {
        if (GPUImageRenderer.access$400(GPUImageRenderer.this) != -1)
        {
            GLES20.glDeleteTextures(1, new int[] {
                GPUImageRenderer.access$400(GPUImageRenderer.this)
            }, 0);
            GPUImageRenderer.access$402(GPUImageRenderer.this, -1);
        }
    }

    ()
    {
        this$0 = GPUImageRenderer.this;
        super();
    }
}
