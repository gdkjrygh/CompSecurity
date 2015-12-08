// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLSurfaceView;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageView

class this._cls0
    implements Runnable
{

    final GPUImageView this$0;

    public void run()
    {
        GPUImageView.access$000(GPUImageView.this).requestLayout();
    }

    ()
    {
        this$0 = GPUImageView.this;
        super();
    }
}
