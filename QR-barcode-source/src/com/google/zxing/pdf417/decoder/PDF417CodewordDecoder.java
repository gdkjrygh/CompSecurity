// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

final class PDF417CodewordDecoder
{

    private static final float RATIOS_TABLE[][];

    private PDF417CodewordDecoder()
    {
    }

    private static int getBitValue(int ai[])
    {
        long l = 0L;
        for (int i = 0; i < ai.length; i++)
        {
            int j = 0;
            while (j < ai[i]) 
            {
                int k;
                long l1;
                if (i % 2 == 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                l1 = k;
                j++;
                l = l << 1 | l1;
            }
        }

        return (int)l;
    }

    private static int getClosestDecodedValue(int ai[])
    {
        int k = PDF417Common.getBitCountSum(ai);
        float af[] = new float[8];
        for (int i = 0; i < af.length; i++)
        {
            af[i] = (float)ai[i] / (float)k;
        }

        float f1 = 3.402823E+38F;
        k = -1;
        for (int j = 0; j < RATIOS_TABLE.length;)
        {
            float f = 0.0F;
            for (int l = 0; l < 8;)
            {
                float f2 = RATIOS_TABLE[j][l] - af[l];
                l++;
                f = f2 * f2 + f;
            }

            float f3 = f1;
            if (f < f1)
            {
                k = PDF417Common.SYMBOL_TABLE[j];
                f3 = f;
            }
            j++;
            f1 = f3;
        }

        return k;
    }

    private static int getDecodedCodewordValue(int ai[])
    {
        int i = getBitValue(ai);
        if (PDF417Common.getCodeword(i) == -1)
        {
            return -1;
        } else
        {
            return i;
        }
    }

    static int getDecodedValue(int ai[])
    {
        int i = getDecodedCodewordValue(sampleBitCounts(ai));
        if (i != -1)
        {
            return i;
        } else
        {
            return getClosestDecodedValue(ai);
        }
    }

    private static int[] sampleBitCounts(int ai[])
    {
        int l = 0;
        float f = PDF417Common.getBitCountSum(ai);
        int ai1[] = new int[8];
        int i = 0;
        int k;
        for (int j = 0; i < 17; j = k)
        {
            float f1 = f / 34F;
            float f2 = ((float)i * f) / 17F;
            int i1 = l;
            k = j;
            if ((float)(ai[j] + l) <= f1 + f2)
            {
                i1 = l + ai[j];
                k = j + 1;
            }
            ai1[k] = ai1[k] + 1;
            i++;
            l = i1;
        }

        return ai1;
    }

    static 
    {
        int i = PDF417Common.SYMBOL_TABLE.length;
        RATIOS_TABLE = (float[][])Array.newInstance(Float.TYPE, new int[] {
            i, 8
        });
        for (int j = 0; j < PDF417Common.SYMBOL_TABLE.length; j++)
        {
            int i1 = PDF417Common.SYMBOL_TABLE[j];
            int k = 0;
            int l = i1 & 1;
            for (; k < 8; k++)
            {
                float f = 0.0F;
                for (; (i1 & 1) == l; i1 >>= 1)
                {
                    f++;
                }

                l = i1 & 1;
                RATIOS_TABLE[j][8 - k - 1] = f / 17F;
            }

        }

    }
}
