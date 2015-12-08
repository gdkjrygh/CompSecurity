// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.zxing.common.reedsolomon:
//            GenericGFPoly, GenericGF

public final class ReedSolomonEncoder
{

    private final List cachedGenerators = new ArrayList();
    private final GenericGF field;

    public ReedSolomonEncoder(GenericGF genericgf)
    {
        field = genericgf;
        cachedGenerators.add(new GenericGFPoly(genericgf, new int[] {
            1
        }));
    }

    private GenericGFPoly buildGenerator(int i)
    {
        if (i >= cachedGenerators.size())
        {
            GenericGFPoly genericgfpoly = (GenericGFPoly)cachedGenerators.get(cachedGenerators.size() - 1);
            for (int j = cachedGenerators.size(); j <= i; j++)
            {
                genericgfpoly = genericgfpoly.multiply(new GenericGFPoly(field, new int[] {
                    1, field.exp((j - 1) + field.getGeneratorBase())
                }));
                cachedGenerators.add(genericgfpoly);
            }

        }
        return (GenericGFPoly)cachedGenerators.get(i);
    }

    public void encode(int ai[], int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int j = ai.length - i;
        if (j <= 0)
        {
            throw new IllegalArgumentException("No data bytes provided");
        }
        GenericGFPoly genericgfpoly = buildGenerator(i);
        int ai2[] = new int[j];
        System.arraycopy(ai, 0, ai2, 0, j);
        int ai1[] = (new GenericGFPoly(field, ai2)).multiplyByMonomial(i, 1).divide(genericgfpoly)[1].getCoefficients();
        int k = i - ai1.length;
        for (i = 0; i < k; i++)
        {
            ai[j + i] = 0;
        }

        System.arraycopy(ai1, 0, ai, j + k, ai1.length);
    }
}
