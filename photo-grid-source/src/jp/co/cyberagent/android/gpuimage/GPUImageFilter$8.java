// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

class val.matrix
    implements Runnable
{

    final GPUImageFilter this$0;
    final int val$location;
    final float val$matrix[];

    public void run()
    {
        GLES20.glUniformMatrix3fv(val$location, 1, false, val$matrix, 0);
    }

    ()
    {
        this$0 = final_gpuimagefilter;
        val$location = i;
        val$matrix = _5B_F.this;
        super();
    }
}
