// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageView

class val.waiter
    implements Runnable
{

    final GPUImageView this$0;
    final int val$height;
    final int val$pixelMirroredArray[];
    final Semaphore val$waiter;
    final int val$width;

    public void run()
    {
        IntBuffer intbuffer = IntBuffer.allocate(val$width * val$height);
        GLES20.glReadPixels(0, 0, val$width, val$height, 6408, 5121, intbuffer);
        int ai[] = intbuffer.array();
        for (int i = 0; i < val$height; i++)
        {
            for (int j = 0; j < val$width; j++)
            {
                val$pixelMirroredArray[(val$height - i - 1) * val$width + j] = ai[val$width * i + j];
            }

        }

        val$waiter.release();
    }

    ()
    {
        this$0 = final_gpuimageview;
        val$width = i;
        val$height = j;
        val$pixelMirroredArray = ai;
        val$waiter = Semaphore.this;
        super();
    }
}
