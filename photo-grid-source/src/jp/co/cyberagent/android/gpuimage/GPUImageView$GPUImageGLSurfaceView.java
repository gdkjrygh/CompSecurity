// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageView

class this._cls0 extends GLSurfaceView
{

    final GPUImageView this$0;

    protected void onMeasure(int i, int j)
    {
        if (mForceSize != null)
        {
            super.onMeasure(android.view.ForceSize(mForceSize._fld0, 0x40000000), android.view.ize.width(mForceSize._fld0, 0x40000000));
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public (Context context)
    {
        this$0 = GPUImageView.this;
        super(context);
    }

    public this._cls0(Context context, AttributeSet attributeset)
    {
        this$0 = GPUImageView.this;
        super(context, attributeset);
    }
}
