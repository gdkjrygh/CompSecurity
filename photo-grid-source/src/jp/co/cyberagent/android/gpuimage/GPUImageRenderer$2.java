// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import java.io.IOException;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageRenderer

class val.camera
    implements Runnable
{

    final GPUImageRenderer this$0;
    final Camera val$camera;

    public void run()
    {
        int ai[] = new int[1];
        GLES20.glGenTextures(1, ai, 0);
        GPUImageRenderer.access$602(GPUImageRenderer.this, new SurfaceTexture(ai[0]));
        try
        {
            val$camera.setPreviewTexture(GPUImageRenderer.access$600(GPUImageRenderer.this));
            val$camera.setPreviewCallback(GPUImageRenderer.this);
            val$camera.startPreview();
            GPUImageRenderer.access$702(GPUImageRenderer.this, val$camera.getParameters());
            return;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    ()
    {
        this$0 = final_gpuimagerenderer;
        val$camera = Camera.this;
        super();
    }
}
