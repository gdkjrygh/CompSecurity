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
                if (i % 2 == 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                l = l << 1 | (long)k;
                j++;
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

        float f2 = 3.402823E+38F;
        k = -1;
        int j = 0;
label0:
        do
        {
            if (j < RATIOS_TABLE.length)
            {
                float f = 0.0F;
                ai = RATIOS_TABLE[j];
                int l = 0;
                do
                {
label1:
                    {
                        float f1 = f;
                        if (l < 8)
                        {
                            f1 = ai[l] - af[l];
                            f += f1 * f1;
                            if (f < f2)
                            {
                                break label1;
                            }
                            f1 = f;
                        }
                        f = f2;
                        if (f1 < f2)
                        {
                            f = f1;
                            k = PDF417Common.SYMBOL_TABLE[j];
                        }
                        j++;
                        f2 = f;
                        continue label0;
                    }
                    l++;
                } while (true);
            }
            return k;
        } while (true);
    }

    private static int getDecodedCodewordValue(int ai[])
    {
        int j = getBitValue(ai);
        int i = j;
        if (PDF417Common.getCodeword(j) == -1)
        {
            i = -1;
        }
        return i;
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
        float f = PDF417Common.getBitCountSum(ai);
        int ai1[] = new int[8];
        int j = 0;
        int k = 0;
        for (int i = 0; i < 17;)
        {
            float f1 = f / 34F;
            float f2 = ((float)i * f) / 17F;
            int i1 = j;
            int l = k;
            if ((float)(ai[j] + k) <= f1 + f2)
            {
                l = k + ai[j];
                i1 = j + 1;
            }
            ai1[i1] = ai1[i1] + 1;
            i++;
            j = i1;
            k = l;
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
            int l = i1 & 1;
            for (int k = 0; k < 8; k++)
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
