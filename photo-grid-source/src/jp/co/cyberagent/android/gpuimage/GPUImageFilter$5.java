// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilter

class val.arrayValue
    implements Runnable
{

    final GPUImageFilter this$0;
    final float val$arrayValue[];
    final int val$location;

    public void run()
    {
        GLES20.glUniform4fv(val$location, 1, FloatBuffer.wrap(val$arrayValue));
    }

    ()
    {
        this$0 = final_gpuimagefilter;
        val$location = i;
        val$arrayValue = _5B_F.this;
        super();
    }
}
