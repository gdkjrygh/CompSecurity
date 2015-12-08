// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImage3x3ConvolutionFilter

public class GPUImageEmbossFilter extends GPUImage3x3ConvolutionFilter
{

    private float mIntensity;

    public GPUImageEmbossFilter()
    {
        this(1.0F);
    }

    public GPUImageEmbossFilter(float f)
    {
        mIntensity = f;
    }

    public float getIntensity()
    {
        return mIntensity;
    }

    public void onInit()
    {
        super.onInit();
        setIntensity(mIntensity);
    }

    public void setIntensity(float f)
    {
        mIntensity = f;
        setConvolutionKernel(new float[] {
            -2F * f, -f, 0.0F, -f, 1.0F, f, 0.0F, f, 2.0F * f
        });
    }
}
