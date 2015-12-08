// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.NotFoundException;

// Referenced classes of package com.google.zxing.common:
//            GridSampler, PerspectiveTransform, BitMatrix

public final class DefaultGridSampler extends GridSampler
{

    public DefaultGridSampler()
    {
    }

    public BitMatrix sampleGrid(BitMatrix bitmatrix, int i, int j, float f, float f1, float f2, float f3, 
            float f4, float f5, float f6, float f7, float f8, float f9, float f10, 
            float f11, float f12, float f13, float f14, float f15)
        throws NotFoundException
    {
        return sampleGrid(bitmatrix, i, j, PerspectiveTransform.quadrilateralToQuadrilateral(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15));
    }

    public BitMatrix sampleGrid(BitMatrix bitmatrix, int i, int j, PerspectiveTransform perspectivetransform)
        throws NotFoundException
    {
        if (i <= 0 || j <= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        BitMatrix bitmatrix1 = new BitMatrix(i, j);
        float af[] = new float[i << 1];
        for (i = 0; i < j; i++)
        {
            int i1 = af.length;
            float f = i;
            for (int k = 0; k < i1; k += 2)
            {
                af[k] = (float)(k >> 1) + 0.5F;
                af[k + 1] = f + 0.5F;
            }

            perspectivetransform.transformPoints(af);
            checkAndNudgePoints(bitmatrix, af);
            int l = 0;
            while (l < i1) 
            {
                try
                {
                    if (bitmatrix.get((int)af[l], (int)af[l + 1]))
                    {
                        bitmatrix1.set(l >> 1, i);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (BitMatrix bitmatrix)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                l += 2;
            }
        }

        return bitmatrix1;
    }
}
