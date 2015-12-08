// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

class val.intValue
    implements Runnable
{

    final GPUImageFilter this$0;
    final int val$intValue;
    final int val$location;

    public void run()
    {
        GLES20.glUniform1i(val$location, val$intValue);
    }

    ()
    {
        this$0 = final_gpuimagefilter;
        val$location = i;
        val$intValue = I.this;
        super();
    }
}
