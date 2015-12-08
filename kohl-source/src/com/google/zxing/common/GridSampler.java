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
        int j = bitmatrix.getWidth();
        int k = bitmatrix.getHeight();
        boolean flag = true;
        int i = 0;
        do
        {
            if (i < af.length && flag)
            {
                int j1 = (int)af[i];
                int l = (int)af[i + 1];
                if (j1 < -1 || j1 > j || l < -1 || l > k)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag = false;
                if (j1 == -1)
                {
                    af[i] = 0.0F;
                    flag = true;
                } else
                if (j1 == j)
                {
                    af[i] = j - 1;
                    flag = true;
                }
                if (l == -1)
                {
                    af[i + 1] = 0.0F;
                    flag = true;
                } else
                if (l == k)
                {
                    af[i + 1] = k - 1;
                    flag = true;
                }
                i += 2;
                continue;
            }
            flag = true;
            i = af.length - 2;
            while (i >= 0 && flag) 
            {
                int k1 = (int)af[i];
                int i1 = (int)af[i + 1];
                if (k1 < -1 || k1 > j || i1 < -1 || i1 > k)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag = false;
                if (k1 == -1)
                {
                    af[i] = 0.0F;
                    flag = true;
                } else
                if (k1 == j)
                {
                    af[i] = j - 1;
                    flag = true;
                }
                if (i1 == -1)
                {
                    af[i + 1] = 0.0F;
                    flag = true;
                } else
                if (i1 == k)
                {
                    af[i + 1] = k - 1;
                    flag = true;
                }
                i -= 2;
            }
            return;
        } while (true);
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
