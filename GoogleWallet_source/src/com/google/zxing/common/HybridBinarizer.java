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

    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminancesource)
    {
        super(luminancesource);
    }

    private static int[][] calculateBlackPoints(byte abyte0[], int i, int j, int k, int l)
    {
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            j, i
        });
        for (int k3 = 0; k3 < j; k3++)
        {
            int i1 = k3 << 3;
            int k1 = l - 8;
            int l3 = i1;
            if (i1 > k1)
            {
                l3 = k1;
            }
            for (int i4 = 0; i4 < i; i4++)
            {
                int l1 = i4 << 3;
                int j2 = k - 8;
                int j1 = l1;
                if (l1 > j2)
                {
                    j1 = j2;
                }
                l1 = 0;
                int k4 = 255;
                int j4 = 0;
                j2 = 0;
                int l2 = l3 * k + j1;
                j1 = l1;
                l1 = l2;
                while (j2 < 8) 
                {
                    for (int i3 = 0; i3 < 8;)
                    {
                        int l4 = abyte0[l1 + i3] & 0xff;
                        int j5 = j1 + l4;
                        j1 = k4;
                        if (l4 < k4)
                        {
                            j1 = l4;
                        }
                        k4 = j4;
                        if (l4 > j4)
                        {
                            k4 = l4;
                        }
                        i3++;
                        j4 = k4;
                        k4 = j1;
                        j1 = j5;
                    }

                    int i5 = l1;
                    int j3 = j1;
                    int k5 = j2;
                    if (j4 - k4 > 24)
                    {
                        j2++;
                        j3 = l1 + k;
                        l1 = j2;
                        j2 = j1;
                        j1 = j3;
                        do
                        {
                            i5 = j1;
                            j3 = j2;
                            k5 = l1;
                            if (l1 >= 8)
                            {
                                break;
                            }
                            for (j3 = 0; j3 < 8; j3++)
                            {
                                j2 += abyte0[j1 + j3] & 0xff;
                            }

                            l1++;
                            j1 += k;
                        } while (true);
                    }
                    j2 = k5 + 1;
                    l1 = i5 + k;
                    j1 = j3;
                }
                j1 >>= 6;
                if (j4 - k4 <= 24)
                {
                    int i2 = k4 >> 1;
                    j1 = i2;
                    if (k3 > 0)
                    {
                        j1 = i2;
                        if (i4 > 0)
                        {
                            int k2 = ai[k3 - 1][i4] + ai[k3][i4 - 1] * 2 + ai[k3 - 1][i4 - 1] >> 2;
                            j1 = i2;
                            if (k4 < k2)
                            {
                                j1 = k2;
                            }
                        }
                    }
                }
                ai[k3][i4] = j1;
            }

        }

        return ai;
    }

    private static void calculateThresholdForBlock(byte abyte0[], int i, int j, int k, int l, int ai[][], BitMatrix bitmatrix)
    {
        for (int i1 = 0; i1 < j; i1++)
        {
            int k1 = i1 << 3;
            int i2 = l - 8;
            int j1 = k1;
            if (k1 > i2)
            {
                j1 = i2;
            }
            for (int l1 = 0; l1 < i; l1++)
            {
                int k2 = l1 << 3;
                int i3 = k - 8;
                int j2 = k2;
                if (k2 > i3)
                {
                    j2 = i3;
                }
                int j3 = cap(l1, 2, i - 3);
                int k3 = cap(i1, 2, j - 3);
                i3 = 0;
                for (int l2 = -2; l2 <= 2; l2++)
                {
                    int ai1[] = ai[k3 + l2];
                    i3 += ai1[j3 - 2] + ai1[j3 - 1] + ai1[j3] + ai1[j3 + 1] + ai1[j3 + 2];
                }

                thresholdBlock(abyte0, j2, j1, i3 / 25, k, bitmatrix);
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
        int j1 = 0;
        for (int i1 = j * l + i; j1 < 8; i1 += l)
        {
            for (int k1 = 0; k1 < 8; k1++)
            {
                if ((abyte0[i1 + k1] & 0xff) <= k)
                {
                    bitmatrix.set(i + k1, j + j1);
                }
            }

            j1++;
        }

    }

    public final Binarizer createBinarizer(LuminanceSource luminancesource)
    {
        return new HybridBinarizer(luminancesource);
    }

    public final BitMatrix getBlackMatrix()
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
