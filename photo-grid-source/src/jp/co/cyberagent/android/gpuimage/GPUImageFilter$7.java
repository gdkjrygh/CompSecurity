// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.graphics.PointF;
import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

class val.location
    implements Runnable
{

    final GPUImageFilter this$0;
    final int val$location;
    final PointF val$point;

    public void run()
    {
        float f = val$point.x;
        float f1 = val$point.y;
        GLES20.glUniform2fv(val$location, 1, new float[] {
            f, f1
        }, 0);
    }

    ()
    {
        this$0 = final_gpuimagefilter;
        val$point = pointf;
        val$location = I.this;
        super();
    }
}
