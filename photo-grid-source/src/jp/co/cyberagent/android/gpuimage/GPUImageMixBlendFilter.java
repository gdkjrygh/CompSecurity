// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoInputFilter

public class GPUImageMixBlendFilter extends GPUImageTwoInputFilter
{

    private float mMix;
    private int mMixLocation;

    public GPUImageMixBlendFilter(String s)
    {
        this(s, 0.5F);
    }

    public GPUImageMixBlendFilter(String s, float f)
    {
        super(s);
        mMix = f;
    }

    public void onInit()
    {
        super.onInit();
        mMixLocation = GLES20.glGetUniformLocation(getProgram(), "mixturePercent");
    }

    public void onInitialized()
    {
        super.onInitialized();
        setMix(mMix);
    }

    public void setMix(float f)
    {
        mMix = f;
        setFloat(mMixLocation, mMix);
    }
}
