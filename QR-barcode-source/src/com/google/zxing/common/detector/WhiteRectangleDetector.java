// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing.common.detector:
//            MathUtils

public final class WhiteRectangleDetector
{

    private static final int CORR = 1;
    private static final int INIT_SIZE = 30;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitmatrix)
        throws NotFoundException
    {
        image = bitmatrix;
        height = bitmatrix.getHeight();
        width = bitmatrix.getWidth();
        leftInit = width - 30 >> 1;
        rightInit = width + 30 >> 1;
        upInit = height - 30 >> 1;
        downInit = height + 30 >> 1;
        if (upInit < 0 || leftInit < 0 || downInit >= height || rightInit >= width)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
    }

    public WhiteRectangleDetector(BitMatrix bitmatrix, int i, int j, int k)
        throws NotFoundException
    {
        image = bitmatrix;
        height = bitmatrix.getHeight();
        width = bitmatrix.getWidth();
        i >>= 1;
        leftInit = j - i;
        rightInit = j + i;
        upInit = k - i;
        downInit = i + k;
        if (upInit < 0 || leftInit < 0 || downInit >= height || rightInit >= width)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return;
        }
    }

    private ResultPoint[] centerEdges(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3)
    {
        float f = resultpoint.getX();
        float f1 = resultpoint.getY();
        float f2 = resultpoint1.getX();
        float f3 = resultpoint1.getY();
        float f4 = resultpoint2.getX();
        float f5 = resultpoint2.getY();
        float f6 = resultpoint3.getX();
        float f7 = resultpoint3.getY();
        if (f < (float)width / 2.0F)
        {
            return (new ResultPoint[] {
                new ResultPoint(f6 - 1.0F, f7 + 1.0F), new ResultPoint(f2 + 1.0F, f3 + 1.0F), new ResultPoint(f4 - 1.0F, f5 - 1.0F), new ResultPoint(f + 1.0F, f1 - 1.0F)
            });
        } else
        {
            return (new ResultPoint[] {
                new ResultPoint(f6 + 1.0F, f7 + 1.0F), new ResultPoint(f2 + 1.0F, f3 - 1.0F), new ResultPoint(f4 - 1.0F, f5 + 1.0F), new ResultPoint(f - 1.0F, f1 - 1.0F)
            });
        }
    }

    private boolean containsBlackPoint(int i, int j, int k, boolean flag)
    {
        int l = i;
        if (!flag) goto _L2; else goto _L1
_L1:
        for (; i <= j; i++)
        {
            if (image.get(i, k))
            {
                return true;
            }
        }

          goto _L3
_L4:
        l++;
_L2:
        if (l > j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (image.get(k, l))
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float f, float f1, float f2, float f3)
    {
        int j = MathUtils.round(MathUtils.distance(f, f1, f2, f3));
        f2 = (f2 - f) / (float)j;
        f3 = (f3 - f1) / (float)j;
        for (int i = 0; i < j; i++)
        {
            int k = MathUtils.round((float)i * f2 + f);
            int l = MathUtils.round((float)i * f3 + f1);
            if (image.get(k, l))
            {
                return new ResultPoint(k, l);
            }
        }

        return null;
    }

    public ResultPoint[] detect()
        throws NotFoundException
    {
        int i;
        int k;
        int j1;
        int l1;
        boolean flag2;
        int j2;
        boolean flag3;
        boolean flag4;
        flag4 = false;
        flag3 = true;
        k = leftInit;
        l1 = rightInit;
        i = upInit;
        j1 = downInit;
        flag2 = false;
        j2 = 1;
_L1:
        ResultPoint resultpoint;
        ResultPoint resultpoint1;
        int j;
        int l;
        int i1;
        if (j2 == 0)
        {
            break MISSING_BLOCK_LABEL_760;
        }
        boolean flag5 = true;
        l = 0;
        j = l1;
        do
        {
            if (!flag5 || j >= width)
            {
                break;
            }
            boolean flag9 = containsBlackPoint(i, j1, j, false);
            flag5 = flag9;
            if (flag9)
            {
                j++;
                l = 1;
                flag5 = flag9;
            }
        } while (true);
        if (j >= width)
        {
            l = 1;
            i1 = j;
            j = k;
            k = i;
            i = j1;
        } else
        {
            boolean flag6 = true;
            i1 = l;
            l = j1;
            do
            {
                if (!flag6 || l >= height)
                {
                    break;
                }
                boolean flag10 = containsBlackPoint(k, j, l, true);
                flag6 = flag10;
                if (flag10)
                {
                    l++;
                    i1 = 1;
                    flag6 = flag10;
                }
            } while (true);
            if (l >= height)
            {
                boolean flag = true;
                i1 = j;
                j1 = l;
                j = k;
                k = i;
                l = ((flag) ? 1 : 0);
                i = j1;
            } else
            {
                boolean flag7 = true;
                j1 = i1;
                i1 = k;
                do
                {
                    if (!flag7 || i1 < 0)
                    {
                        break;
                    }
                    boolean flag11 = containsBlackPoint(i, l, i1, false);
                    flag7 = flag11;
                    if (flag11)
                    {
                        i1--;
                        j1 = 1;
                        flag7 = flag11;
                    }
                } while (true);
                if (i1 < 0)
                {
                    boolean flag1 = true;
                    j1 = j;
                    k = l;
                    j = i1;
                    i1 = i;
                    l = ((flag1) ? 1 : 0);
                    i = k;
                    k = i1;
                    i1 = j1;
                } else
                {
label0:
                    {
                        boolean flag8 = true;
                        i2 = j1;
                        k1 = i;
                        do
                        {
                            if (!flag8 || k1 < 0)
                            {
                                break;
                            }
                            boolean flag12 = containsBlackPoint(i1, j, k1, true);
                            flag8 = flag12;
                            if (flag12)
                            {
                                k1--;
                                i2 = 1;
                                flag8 = flag12;
                            }
                        } while (true);
                        if (k1 >= 0)
                        {
                            break label0;
                        }
                        l1 = 1;
                        j1 = j;
                        i = l;
                        j = i1;
                        k = k1;
                        l = l1;
                        i1 = j1;
                    }
                }
            }
        }
_L5:
        if (l == 0 && flag2)
        {
            j1 = i1 - j;
            l = 1;
            resultpoint = null;
            break MISSING_BLOCK_LABEL_153;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j1 = l;
        i = k1;
        l1 = j;
        k = i1;
        j2 = i2;
        if (i2 != 0)
        {
            flag2 = true;
            j1 = l;
            i = k1;
            l1 = j;
            k = i1;
            j2 = i2;
        }
          goto _L1
        do
        {
            if (l >= j1)
            {
                break MISSING_BLOCK_LABEL_755;
            }
            resultpoint = getBlackPointOnSegment(j, i - l, j + l, i);
            int k1;
            int i2;
            if (resultpoint != null)
            {
                resultpoint1 = resultpoint;
                break MISSING_BLOCK_LABEL_189;
            }
            l++;
        } while (true);
_L2:
        if (resultpoint2 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = 1;
        resultpoint = null;
        ResultPoint resultpoint3;
        for (; j < j1; j++)
        {
            resultpoint = getBlackPointOnSegment(i1, k + j, i1 - j, k);
            if (resultpoint != null)
            {
                resultpoint3 = resultpoint;
                break MISSING_BLOCK_LABEL_655;
            }
        }

        resultpoint3 = resultpoint;
        if (resultpoint3 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        resultpoint = null;
        j = ((flag3) ? 1 : 0);
        do
        {
label1:
            {
                if (j < j1)
                {
                    resultpoint = getBlackPointOnSegment(i1, i - j, i1 - j, i);
                    if (resultpoint == null)
                    {
                        break label1;
                    }
                }
                if (resultpoint == null)
                {
                    throw NotFoundException.getNotFoundInstance();
                } else
                {
                    return centerEdges(resultpoint, resultpoint1, resultpoint3, resultpoint2);
                }
            }
            j++;
        } while (true);
_L4:
        if (resultpoint1 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        l = 1;
        resultpoint = null;
        ResultPoint resultpoint2;
        for (; l < j1; l++)
        {
            resultpoint = getBlackPointOnSegment(j, k + l, j + l, k);
            if (resultpoint != null)
            {
                resultpoint2 = resultpoint;
                break MISSING_BLOCK_LABEL_596;
            }
        }

        resultpoint2 = resultpoint;
          goto _L2
        resultpoint1 = resultpoint;
        if (true) goto _L4; else goto _L3
_L3:
        i1 = l1;
        j = k;
        k = i;
        l = ((flag4) ? 1 : 0);
        i = j1;
          goto _L5
    }
}
