// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

// Referenced classes of package com.google.zxing.common:
//            GlobalHistogramBinarizer, BitMatrix

public final class HybridBinarizer extends GlobalHistogramBinarizer
{

    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminancesource)
    {
        super(luminancesource);
    }

    private static int[][] calculateBlackPoints(byte abyte0[], int i, int j, int k, int l)
    {
        int ai[][];
        int i3;
        ai = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, i
        });
        i3 = 0;
_L5:
        if (i3 >= j) goto _L2; else goto _L1
_L1:
        int j3;
        int k3;
        j3 = i3 << 3;
        int i1 = l - 8;
        if (j3 > i1)
        {
            j3 = i1;
        }
        k3 = 0;
_L4:
        int j1;
        int l1;
        if (k3 >= i)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = k3 << 3;
        int k1 = k - 8;
        if (j1 > k1)
        {
            j1 = k1;
        }
        boolean flag = false;
        l1 = 255;
        k1 = 0;
        int i2 = 0;
        int j2 = j3 * k + j1;
        j1 = ((flag) ? 1 : 0);
        int i4;
        for (; i2 < 8; i2 = i4 + 1)
        {
            for (int k2 = 0; k2 < 8;)
            {
                int l3 = abyte0[j2 + k2] & 0xff;
                if (l3 < l1)
                {
                    l1 = l3;
                }
                if (l3 > k1)
                {
                    k1 = l3;
                }
                k2++;
                j1 += l3;
            }

            int l2;
            int j4;
            if (k1 - l1 > 24)
            {
                l2 = j2 + k;
                j2 = i2 + 1;
                i2 = l2;
                do
                {
                    j4 = i2;
                    i4 = j2;
                    l2 = j1;
                    if (j2 >= 8)
                    {
                        break;
                    }
                    for (l2 = 0; l2 < 8; l2++)
                    {
                        j1 += abyte0[i2 + l2] & 0xff;
                    }

                    j2++;
                    i2 += k;
                } while (true);
            } else
            {
                l2 = j1;
                i4 = i2;
                j4 = j2;
            }
            j2 = j4 + k;
            j1 = l2;
        }

        j1 >>= 6;
        if (k1 - l1 <= 24)
        {
            if (i3 <= 0 || k3 <= 0)
            {
                break MISSING_BLOCK_LABEL_413;
            }
            j1 = ai[i3 - 1][k3] + ai[i3][k3 - 1] * 2 + ai[i3 - 1][k3 - 1] >> 2;
            if (l1 >= j1)
            {
                break MISSING_BLOCK_LABEL_413;
            }
        }
_L6:
        ai[i3][k3] = j1;
        k3++;
        if (true) goto _L4; else goto _L3
_L3:
        i3++;
          goto _L5
_L2:
        return ai;
        j1 = l1 >> 1;
          goto _L6
    }

    private static void calculateThresholdForBlock(byte abyte0[], int i, int j, int k, int l, int ai[][], BitMatrix bitmatrix)
    {
        for (int i1 = 0; i1 < j; i1++)
        {
            int j1 = i1 << 3;
            int k1 = l - 8;
            if (j1 > k1)
            {
                j1 = k1;
            }
            for (int l1 = 0; l1 < i; l1++)
            {
                int i2 = l1 << 3;
                int j2 = k - 8;
                if (i2 > j2)
                {
                    i2 = j2;
                }
                int i3 = cap(l1, 2, i - 3);
                int j3 = cap(i1, 2, j - 3);
                int l2 = 0;
                for (int k2 = -2; k2 <= 2; k2++)
                {
                    int ai1[] = ai[j3 + k2];
                    int k3 = ai1[i3 - 2];
                    int l3 = ai1[i3 - 1];
                    int i4 = ai1[i3];
                    int j4 = ai1[i3 + 1];
                    l2 += ai1[i3 + 2] + (k3 + l3 + i4 + j4);
                }

                thresholdBlock(abyte0, i2, j1, l2 / 25, k, bitmatrix);
            }

        }

    }

    private static int cap(int i, int j, int k)
    {
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    private static void thresholdBlock(byte abyte0[], int i, int j, int k, int l, BitMatrix bitmatrix)
    {
        int i1 = j * l + i;
        for (int j1 = 0; j1 < 8;)
        {
            for (int k1 = 0; k1 < 8; k1++)
            {
                if ((abyte0[i1 + k1] & 0xff) <= k)
                {
                    bitmatrix.set(i + k1, j + j1);
                }
            }

            j1++;
            i1 += l;
        }

    }

    public Binarizer createBinarizer(LuminanceSource luminancesource)
    {
        return new HybridBinarizer(luminancesource);
    }

    public BitMatrix getBlackMatrix()
        throws NotFoundException
    {
        if (matrix != null)
        {
            return matrix;
        }
        LuminanceSource luminancesource = getLuminanceSource();
        int l = luminancesource.getWidth();
        int i1 = luminancesource.getHeight();
        if (l >= 40 && i1 >= 40)
        {
            byte abyte0[] = luminancesource.getMatrix();
            int j = l >> 3;
            int i = j;
            if ((l & 7) != 0)
            {
                i = j + 1;
            }
            int k = i1 >> 3;
            j = k;
            if ((i1 & 7) != 0)
            {
                j = k + 1;
            }
            int ai[][] = calculateBlackPoints(abyte0, i, j, l, i1);
            BitMatrix bitmatrix = new BitMatrix(l, i1);
            calculateThresholdForBlock(abyte0, i, j, l, i1, ai, bitmatrix);
            matrix = bitmatrix;
        } else
        {
            matrix = super.getBlackMatrix();
        }
        return matrix;
    }
}
