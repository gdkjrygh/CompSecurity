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
        downInit = k + i;
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
                new ResultPoint(f6 - 1.0F, 1.0F + f7), new ResultPoint(1.0F + f2, 1.0F + f3), new ResultPoint(f4 - 1.0F, f5 - 1.0F), new ResultPoint(1.0F + f, f1 - 1.0F)
            });
        } else
        {
            return (new ResultPoint[] {
                new ResultPoint(1.0F + f6, 1.0F + f7), new ResultPoint(1.0F + f2, f3 - 1.0F), new ResultPoint(f4 - 1.0F, 1.0F + f5), new ResultPoint(f - 1.0F, f1 - 1.0F)
            });
        }
    }

    private boolean containsBlackPoint(int i, int j, int k, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (i > j) goto _L4; else goto _L3
_L3:
        if (!image.get(i, k)) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        do
        {
            if (i > j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (image.get(k, i))
            {
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return false;
        if (true) goto _L1; else goto _L7
_L7:
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
        int k;
        int i1;
        int j1;
        int k1;
        boolean flag;
        int k2;
        boolean flag1;
        i1 = leftInit;
        k1 = rightInit;
        k = upInit;
        j1 = downInit;
        flag1 = false;
        k2 = 1;
        flag = false;
_L1:
        ResultPoint resultpoint2;
        int i;
        int l;
        int l1;
        int i2;
        int j2;
        j2 = j1;
        l1 = i1;
        l = k1;
        i = ((flag1) ? 1 : 0);
        i2 = k;
        if (k2 != 0)
        {
            i = 0;
            boolean flag2 = true;
            l = k1;
            k1 = i;
            do
            {
                if (!flag2 || l >= width)
                {
                    break;
                }
                boolean flag6 = containsBlackPoint(k, j1, l, false);
                flag2 = flag6;
                if (flag6)
                {
                    l++;
                    k1 = 1;
                    flag2 = flag6;
                }
            } while (true);
            ResultPoint resultpoint;
            if (l >= width)
            {
                i = 1;
                i2 = k;
                l1 = i1;
                j2 = j1;
            } else
            {
                boolean flag3 = true;
                i = j1;
                do
                {
                    if (!flag3 || i >= height)
                    {
                        break;
                    }
                    boolean flag7 = containsBlackPoint(i1, l, i, true);
                    flag3 = flag7;
                    if (flag7)
                    {
                        i++;
                        k1 = 1;
                        flag3 = flag7;
                    }
                } while (true);
                if (i >= height)
                {
                    j1 = 1;
                    j2 = i;
                    l1 = i1;
                    i = j1;
                    i2 = k;
                } else
                {
                    boolean flag4 = true;
                    l1 = i1;
                    do
                    {
                        if (!flag4 || l1 < 0)
                        {
                            break;
                        }
                        boolean flag8 = containsBlackPoint(k, i, l1, false);
                        flag4 = flag8;
                        if (flag8)
                        {
                            l1--;
                            k1 = 1;
                            flag4 = flag8;
                        }
                    } while (true);
                    if (l1 < 0)
                    {
                        i1 = 1;
                        j2 = i;
                        i = i1;
                        i2 = k;
                    } else
                    {
label0:
                        {
                            boolean flag5 = true;
                            i2 = k;
                            j2 = k1;
                            do
                            {
                                if (!flag5 || i2 < 0)
                                {
                                    break;
                                }
                                boolean flag9 = containsBlackPoint(l1, l, i2, true);
                                flag5 = flag9;
                                if (flag9)
                                {
                                    i2--;
                                    j2 = 1;
                                    flag5 = flag9;
                                }
                            } while (true);
                            if (i2 >= 0)
                            {
                                break label0;
                            }
                            k = 1;
                            j2 = i;
                            i = k;
                        }
                    }
                }
            }
        }
_L3:
        if (i != 0 || !flag)
        {
            break MISSING_BLOCK_LABEL_711;
        }
        k = l - l1;
        resultpoint = null;
        i = 1;
_L2:
        resultpoint2 = resultpoint;
        if (i < k)
        {
            resultpoint = getBlackPointOnSegment(l1, j2 - i, l1 + i, j2);
            if (resultpoint == null)
            {
                break MISSING_BLOCK_LABEL_513;
            }
            resultpoint2 = resultpoint;
        }
        if (resultpoint2 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        break MISSING_BLOCK_LABEL_522;
        k2 = j2;
        j1 = i;
        i1 = l1;
        k1 = l;
        k = i2;
        if (j2 != 0)
        {
            flag = true;
            k2 = j2;
            j1 = i;
            i1 = l1;
            k1 = l;
            k = i2;
        }
          goto _L1
        i++;
          goto _L2
        ResultPoint resultpoint1 = null;
        int j = 1;
        ResultPoint resultpoint3;
label1:
        do
        {
label2:
            {
                resultpoint3 = resultpoint1;
                if (j < k)
                {
                    resultpoint1 = getBlackPointOnSegment(l1, i2 + j, l1 + j, i2);
                    if (resultpoint1 == null)
                    {
                        break label2;
                    }
                    resultpoint3 = resultpoint1;
                }
                if (resultpoint3 == null)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                break label1;
            }
            j++;
        } while (true);
        resultpoint1 = null;
        j = 1;
        ResultPoint resultpoint4;
label3:
        do
        {
label4:
            {
                resultpoint4 = resultpoint1;
                if (j < k)
                {
                    resultpoint1 = getBlackPointOnSegment(l, i2 + j, l - j, i2);
                    if (resultpoint1 == null)
                    {
                        break label4;
                    }
                    resultpoint4 = resultpoint1;
                }
                if (resultpoint4 == null)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                break label3;
            }
            j++;
        } while (true);
        resultpoint1 = null;
        j = 1;
        do
        {
label5:
            {
                if (j < k)
                {
                    resultpoint1 = getBlackPointOnSegment(l, j2 - j, l - j, j2);
                    if (resultpoint1 == null)
                    {
                        break label5;
                    }
                }
                if (resultpoint1 == null)
                {
                    throw NotFoundException.getNotFoundInstance();
                } else
                {
                    return centerEdges(resultpoint1, resultpoint2, resultpoint4, resultpoint3);
                }
            }
            j++;
        } while (true);
          goto _L1
        throw NotFoundException.getNotFoundInstance();
          goto _L3
    }
}
