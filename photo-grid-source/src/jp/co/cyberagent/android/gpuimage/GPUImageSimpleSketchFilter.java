// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilterGroup, GPUImageGrayscaleFilter, GPUImageColorInvertFilter, GPUImageMinBlurFilter, 
//            GPUImageColorGrayDodgeBlendFilter

public class GPUImageSimpleSketchFilter extends GPUImageFilterGroup
{

    public GPUImageSimpleSketchFilter()
    {
        super(null);
        createFilters(-1, -1);
    }

    public GPUImageSimpleSketchFilter(int i, int j)
    {
        super(null);
        createFilters(i, j);
    }

    public float blurSize(int i, int j)
    {
        float f = 1.0F;
        if (i == -1 || j == -1)
        {
            return 4F;
        }
        float f1 = (4F * (float)Math.min(i, j)) / 640F;
        if (f1 >= 1.0F)
        {
            f = f1;
        }
        (new StringBuilder("width*height=")).append(i).append("*").append(j).append(", blurSize = ").append(f);
        return f;
    }

    public void createFilters(int i, int j)
    {
        addFilter(new GPUImageGrayscaleFilter());
        addFilter(new GPUImageColorInvertFilter());
        addFilter(new GPUImageMinBlurFilter(blurSize(i, j)));
        addFilter(new GPUImageColorGrayDodgeBlendFilter());
    }

    public void setPencilSize(float f)
    {
    }
}
