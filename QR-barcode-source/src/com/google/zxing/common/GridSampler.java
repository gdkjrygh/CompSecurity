// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.NotFoundException;

// Referenced classes of package com.google.zxing.common:
//            DefaultGridSampler, BitMatrix, PerspectiveTransform

public abstract class GridSampler
{

    private static GridSampler gridSampler = new DefaultGridSampler();

    public GridSampler()
    {
    }

    protected static void checkAndNudgePoints(BitMatrix bitmatrix, float af[])
        throws NotFoundException
    {
        int k = bitmatrix.getWidth();
        int l = bitmatrix.getHeight();
        int j = 0;
        int i = 1;
        while (j < af.length && i != 0) 
        {
            i = (int)af[j];
            int i1 = (int)af[j + 1];
            if (i < -1 || i > k || i1 < -1 || i1 > l)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i == -1)
            {
                af[j] = 0.0F;
                i = 1;
            } else
            if (i == k)
            {
                af[j] = k - 1;
                i = 1;
            } else
            {
                i = 0;
            }
            if (i1 == -1)
            {
                af[j + 1] = 0.0F;
                i = 1;
            } else
            if (i1 == l)
            {
                af[j + 1] = l - 1;
                i = 1;
            }
            j += 2;
        }
        j = af.length - 2;
        i = 1;
        while (j >= 0 && i != 0) 
        {
            i = (int)af[j];
            i1 = (int)af[j + 1];
            if (i < -1 || i > k || i1 < -1 || i1 > l)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i == -1)
            {
                af[j] = 0.0F;
                i = 1;
            } else
            if (i == k)
            {
                af[j] = k - 1;
                i = 1;
            } else
            {
                i = 0;
            }
            if (i1 == -1)
            {
                af[j + 1] = 0.0F;
                i = 1;
            } else
            if (i1 == l)
            {
                af[j + 1] = l - 1;
                i = 1;
            }
            j -= 2;
        }
    }

    public static GridSampler getInstance()
    {
        return gridSampler;
    }

    public static void setGridSampler(GridSampler gridsampler)
    {
        gridSampler = gridsampler;
    }

    public abstract BitMatrix sampleGrid(BitMatrix bitmatrix, int i, int j, float f, float f1, float f2, float f3, 
            float f4, float f5, float f6, float f7, float f8, float f9, float f10, 
            float f11, float f12, float f13, float f14, float f15)
        throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix bitmatrix, int i, int j, PerspectiveTransform perspectivetransform)
        throws NotFoundException;

}
