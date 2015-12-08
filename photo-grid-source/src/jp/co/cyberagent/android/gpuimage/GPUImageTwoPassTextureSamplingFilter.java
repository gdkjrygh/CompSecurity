// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import android.opengl.GLES20;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageTwoPassFilter, GPUImageFilter

public class GPUImageTwoPassTextureSamplingFilter extends GPUImageTwoPassFilter
{

    public GPUImageTwoPassTextureSamplingFilter(String s, String s1, String s2, String s3)
    {
        super(s, s1, s2, s3);
    }

    public float getHorizontalTexelOffsetRatio()
    {
        return 1.0F;
    }

    public float getVerticalTexelOffsetRatio()
    {
        return 1.0F;
    }

    protected void initTexelOffsets()
    {
        float f = getHorizontalTexelOffsetRatio();
        GPUImageFilter gpuimagefilter = (GPUImageFilter)mFilters.get(0);
        int i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        int j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        gpuimagefilter.setFloat(i, f / (float)mOutputWidth);
        gpuimagefilter.setFloat(j, 0.0F);
        f = getVerticalTexelOffsetRatio();
        gpuimagefilter = (GPUImageFilter)mFilters.get(1);
        i = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelWidthOffset");
        j = GLES20.glGetUniformLocation(gpuimagefilter.getProgram(), "texelHeightOffset");
        gpuimagefilter.setFloat(i, 0.0F);
        gpuimagefilter.setFloat(j, f / (float)mOutputHeight);
    }

    public void onInit()
    {
        super.onInit();
        initTexelOffsets();
    }

    public void onOutputSizeChanged(int i, int j)
    {
        super.onOutputSizeChanged(i, j);
        initTexelOffsets();
    }
}
