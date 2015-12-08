// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

public final class MonochromeRectangleDetector
{

    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix bitmatrix)
    {
        image = bitmatrix;
    }

    private int[] blackWhiteRange(int i, int j, int k, int l, boolean flag)
    {
        int j1;
        int k1;
        k1 = k + l >> 1;
        j1 = k1;
_L7:
        int i1;
        do
        {
            i1 = j1;
            j1 = i1;
            if (i1 < k)
            {
                break;
            }
            if (flag ? image.get(i1, i) : image.get(i, i1))
            {
                j1 = i1 - 1;
            } else
            {
                break MISSING_BLOCK_LABEL_66;
            }
        } while (true);
          goto _L1
        j1 = i1;
_L5:
        int l1;
        l1 = j1 - 1;
        if (l1 < k)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        j1 = l1;
        if (!image.get(l1, i)) goto _L5; else goto _L4
_L4:
        if (l1 < k)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = l1;
        if (i1 - l1 <= j) goto _L7; else goto _L6
_L6:
        j1 = i1;
_L1:
        l1 = j1 + 1;
        i1 = k1;
_L12:
        k = i1;
        i1 = k;
        if (k >= l) goto _L9; else goto _L8
_L8:
        if (flag ? image.get(k, i) : image.get(i, k)) goto _L11; else goto _L10
_L11:
        i1 = k + 1;
          goto _L12
_L3:
        j1 = l1;
        if (!image.get(i, l1)) goto _L5; else goto _L4
_L10:
        i1 = k;
_L16:
        j1 = i1 + 1;
        if (j1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag) goto _L14; else goto _L13
_L13:
        i1 = j1;
        if (!image.get(j1, i)) goto _L16; else goto _L15
_L15:
        if (j1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (j1 - k <= j) goto _L12; else goto _L17
_L17:
        i1 = k;
_L9:
        i = i1 - 1;
        if (i > l1)
        {
            return (new int[] {
                l1, i
            });
        } else
        {
            return null;
        }
_L14:
        i1 = j1;
        if (!image.get(i, j1)) goto _L16; else goto _L15
    }

    private ResultPoint findCornerFromCenter(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
        throws NotFoundException
    {
        int ai1[] = null;
        int k2 = i1;
        for (int j2 = i; k2 < l1 && k2 >= k1 && j2 < l && j2 >= k;)
        {
            int ai[];
            if (j == 0)
            {
                ai = blackWhiteRange(k2, i2, k, l, true);
            } else
            {
                ai = blackWhiteRange(j2, i2, k1, l1, false);
            }
            if (ai == null)
            {
                if (ai1 == null)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (j == 0)
                {
                    j = k2 - j1;
                    if (ai1[0] < i)
                    {
                        if (ai1[1] > i)
                        {
                            float f;
                            if (j1 > 0)
                            {
                                f = ai1[0];
                            } else
                            {
                                f = ai1[1];
                            }
                            return new ResultPoint(f, j);
                        } else
                        {
                            return new ResultPoint(ai1[0], j);
                        }
                    } else
                    {
                        return new ResultPoint(ai1[1], j);
                    }
                }
                i = j2 - j;
                if (ai1[0] < i1)
                {
                    if (ai1[1] > i1)
                    {
                        float f2 = i;
                        float f1;
                        if (j < 0)
                        {
                            f1 = ai1[0];
                        } else
                        {
                            f1 = ai1[1];
                        }
                        return new ResultPoint(f2, f1);
                    } else
                    {
                        return new ResultPoint(i, ai1[0]);
                    }
                } else
                {
                    return new ResultPoint(i, ai1[1]);
                }
            }
            k2 += j1;
            j2 += j;
            ai1 = ai;
        }

        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect()
        throws NotFoundException
    {
        int j1 = image.getHeight();
        int k1 = image.getWidth();
        int i = j1 >> 1;
        int j = k1 >> 1;
        int k = Math.max(1, j1 / 256);
        int l1 = Math.max(1, k1 / 256);
        int l = (int)findCornerFromCenter(j, 0, 0, k1, i, -k, 0, j1, j >> 1).getY() - 1;
        ResultPoint resultpoint = findCornerFromCenter(j, -l1, 0, k1, i, 0, l, j1, i >> 1);
        int i1 = (int)resultpoint.getX() - 1;
        ResultPoint resultpoint1 = findCornerFromCenter(j, l1, i1, k1, i, 0, l, j1, i >> 1);
        k1 = (int)resultpoint1.getX() + 1;
        ResultPoint resultpoint2 = findCornerFromCenter(j, 0, i1, k1, i, k, l, j1, j >> 1);
        j1 = (int)resultpoint2.getY();
        return (new ResultPoint[] {
            findCornerFromCenter(j, 0, i1, k1, i, -k, l, j1 + 1, j >> 2), resultpoint, resultpoint1, resultpoint2
        });
    }
}
