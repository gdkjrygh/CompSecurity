// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package jp.co.cyberagent.android.gpuimage:
//            GPUImageFilterGroup, GPUImageGrayscaleFilter, GPUImageColorInvertFilter, GPUImageBoxBlurFilter, 
//            GPUImageColorGrayDodgeBlendFilter

public class GPUImageSketchFilter extends GPUImageFilterGroup
{

    public GPUImageSketchFilter()
    {
        super(createFilters(-1, -1, false));
    }

    public GPUImageSketchFilter(int i, int j, boolean flag)
    {
        super(createFilters(i, j, flag));
    }

    private static float blurSize(int i, int j)
    {
        float f = 1.0F;
        if (i == -1 || j == -1)
        {
            return 2.0F;
        }
        float f1 = (2.0F * (float)Math.min(i, j)) / 640F;
        if (f1 >= 1.0F)
        {
            f = f1;
        }
        (new StringBuilder("width*height=")).append(i).append("*").append(j).append(", blurSize = ").append(f);
        return f;
    }

    private static List createFilters(int i, int j, boolean flag)
    {
        ArrayList arraylist = new ArrayList(4);
        arraylist.add(new GPUImageGrayscaleFilter());
        arraylist.add(new GPUImageColorInvertFilter());
        arraylist.add(new GPUImageBoxBlurFilter(blurSize(i, j)));
        arraylist.add(new GPUImageColorGrayDodgeBlendFilter(flag));
        return arraylist;
    }

    public void setPencilSize(float f)
    {
        ((GPUImageBoxBlurFilter)getFilters().get(2)).setBlurSize(f);
    }
}
