// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class Detector
{
    static final class Point
    {

        private final int x;
        private final int y;

        int getX()
        {
            return x;
        }

        int getY()
        {
            return y;
        }

        ResultPoint toResultPoint()
        {
            return new ResultPoint(getX(), getY());
        }

        public String toString()
        {
            return (new StringBuilder()).append("<").append(x).append(' ').append(y).append('>').toString();
        }

        Point(int i, int j)
        {
            x = i;
            y = j;
        }
    }


    private static final int EXPECTED_CORNER_BITS[] = {
        3808, 476, 2107, 1799
    };
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    public Detector(BitMatrix bitmatrix)
    {
        image = bitmatrix;
    }

    private static float distance(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        return MathUtils.distance(resultpoint.getX(), resultpoint.getY(), resultpoint1.getX(), resultpoint1.getY());
    }

    private static float distance(Point point, Point point1)
    {
        return MathUtils.distance(point.getX(), point.getY(), point1.getX(), point1.getY());
    }

    private static ResultPoint[] expandSquare(ResultPoint aresultpoint[], float f, float f1)
    {
        f = f1 / (2.0F * f);
        f1 = aresultpoint[0].getX() - aresultpoint[2].getX();
        float f2 = aresultpoint[0].getY() - aresultpoint[2].getY();
        float f3 = (aresultpoint[0].getX() + aresultpoint[2].getX()) / 2.0F;
        float f4 = (aresultpoint[0].getY() + aresultpoint[2].getY()) / 2.0F;
        ResultPoint resultpoint = new ResultPoint(f * f1 + f3, f * f2 + f4);
        ResultPoint resultpoint1 = new ResultPoint(f3 - f * f1, f4 - f * f2);
        f1 = aresultpoint[1].getX() - aresultpoint[3].getX();
        f2 = aresultpoint[1].getY() - aresultpoint[3].getY();
        f3 = (aresultpoint[1].getX() + aresultpoint[3].getX()) / 2.0F;
        f4 = (aresultpoint[1].getY() + aresultpoint[3].getY()) / 2.0F;
        return (new ResultPoint[] {
            resultpoint, new ResultPoint(f * f1 + f3, f * f2 + f4), resultpoint1, new ResultPoint(f3 - f * f1, f4 - f * f2)
        });
    }

    private void extractParameters(ResultPoint aresultpoint[])
        throws NotFoundException
    {
        if (!isValid(aresultpoint[0]) || !isValid(aresultpoint[1]) || !isValid(aresultpoint[2]) || !isValid(aresultpoint[3]))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = nbCenterLayers * 2;
        int ai[] = new int[4];
        ai[0] = sampleLine(aresultpoint[0], aresultpoint[1], i);
        ai[1] = sampleLine(aresultpoint[1], aresultpoint[2], i);
        ai[2] = sampleLine(aresultpoint[2], aresultpoint[3], i);
        ai[3] = sampleLine(aresultpoint[3], aresultpoint[0], i);
        shift = getRotation(ai, i);
        long l = 0L;
        i = 0;
        while (i < 4) 
        {
            int j = ai[(shift + i) % 4];
            if (compact)
            {
                l = (l << 7) + (long)(j >> 1 & 0x7f);
            } else
            {
                l = (l << 10) + (long)((j >> 2 & 0x3e0) + (j >> 1 & 0x1f));
            }
            i++;
        }
        i = getCorrectedParameterData(l, compact);
        if (compact)
        {
            nbLayers = (i >> 6) + 1;
            nbDataBlocks = (i & 0x3f) + 1;
            return;
        } else
        {
            nbLayers = (i >> 11) + 1;
            nbDataBlocks = (i & 0x7ff) + 1;
            return;
        }
    }

    private ResultPoint[] getBullsEyeCorners(Point point)
        throws NotFoundException
    {
        Object obj2 = point;
        Object obj1 = point;
        Object obj = point;
        boolean flag = true;
        nbCenterLayers = 1;
label0:
        do
        {
            Point point1;
            Point point2;
            Point point3;
            Point point4;
label1:
            {
                if (nbCenterLayers < 9)
                {
                    point4 = getFirstDifferent(((Point) (obj2)), flag, 1, -1);
                    point3 = getFirstDifferent(((Point) (obj1)), flag, 1, 1);
                    point2 = getFirstDifferent(((Point) (obj)), flag, -1, 1);
                    point1 = getFirstDifferent(point, flag, -1, -1);
                    if (nbCenterLayers <= 2)
                    {
                        break label1;
                    }
                    float f = (distance(point1, point4) * (float)nbCenterLayers) / (distance(point, ((Point) (obj2))) * (float)(nbCenterLayers + 2));
                    if ((double)f >= 0.75D && (double)f <= 1.25D && isWhiteOrBlackRectangle(point4, point3, point2, point1))
                    {
                        break label1;
                    }
                }
                if (nbCenterLayers != 5 && nbCenterLayers != 7)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                break label0;
            }
            obj2 = point4;
            obj1 = point3;
            obj = point2;
            point = point1;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            nbCenterLayers = nbCenterLayers + 1;
        } while (true);
        float f1;
        float f2;
        if (nbCenterLayers == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        compact = flag;
        obj2 = new ResultPoint((float)((Point) (obj2)).getX() + 0.5F, (float)((Point) (obj2)).getY() - 0.5F);
        obj1 = new ResultPoint((float)((Point) (obj1)).getX() + 0.5F, (float)((Point) (obj1)).getY() + 0.5F);
        obj = new ResultPoint((float)((Point) (obj)).getX() - 0.5F, (float)((Point) (obj)).getY() + 0.5F);
        point = new ResultPoint((float)point.getX() - 0.5F, (float)point.getY() - 0.5F);
        f1 = nbCenterLayers * 2 - 3;
        f2 = nbCenterLayers * 2;
        return expandSquare(new ResultPoint[] {
            obj2, obj1, obj, point
        }, f1, f2);
    }

    private int getColor(Point point, Point point1)
    {
        float f2 = distance(point, point1);
        float f3 = (float)(point1.getX() - point.getX()) / f2;
        float f4 = (float)(point1.getY() - point.getY()) / f2;
        int j = 0;
        float f1 = point.getX();
        float f = point.getY();
        boolean flag1 = image.get(point.getX(), point.getY());
        for (int i = 0; (float)i < f2;)
        {
            f1 += f3;
            f += f4;
            int k = j;
            if (image.get(MathUtils.round(f1), MathUtils.round(f)) != flag1)
            {
                k = j + 1;
            }
            i++;
            j = k;
        }

        f = (float)j / f2;
        if (f > 0.1F && f < 0.9F)
        {
            return 0;
        }
        boolean flag;
        if (f <= 0.1F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag != flag1 ? -1 : 1;
    }

    private static int getCorrectedParameterData(long l, boolean flag)
        throws NotFoundException
    {
        int ai[];
        byte byte0;
        byte byte1;
        if (flag)
        {
            byte1 = 7;
            byte0 = 2;
        } else
        {
            byte1 = 10;
            byte0 = 4;
        }
        ai = new int[byte1];
        for (int j = byte1 - 1; j >= 0; j--)
        {
            ai[j] = (int)l & 0xf;
            l >>= 4;
        }

        int k;
        try
        {
            (new ReedSolomonDecoder(GenericGF.AZTEC_PARAM)).decode(ai, byte1 - byte0);
        }
        catch (ReedSolomonException reedsolomonexception)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        k = 0;
        for (int i = 0; i < byte0; i++)
        {
            k = (k << 4) + ai[i];
        }

        return k;
    }

    private int getDimension()
    {
        if (compact)
        {
            return nbLayers * 4 + 11;
        }
        if (nbLayers <= 4)
        {
            return nbLayers * 4 + 15;
        } else
        {
            return nbLayers * 4 + ((nbLayers - 4) / 8 + 1) * 2 + 15;
        }
    }

    private Point getFirstDifferent(Point point, boolean flag, int i, int j)
    {
        int l = point.getX() + i;
        int k;
        for (k = point.getY() + j; isValid(l, k) && image.get(l, k) == flag; k += j)
        {
            l += i;
        }

        int i1 = l - i;
        l = k - j;
        for (k = i1; isValid(k, l) && image.get(k, l) == flag; k += i) { }
        k -= i;
        for (i = l; isValid(k, i) && image.get(k, i) == flag; i += j) { }
        return new Point(k, i - j);
    }

    private Point getMatrixCenter()
    {
        ResultPoint aresultpoint[] = (new WhiteRectangleDetector(image)).detect();
        ResultPoint resultpoint;
        ResultPoint resultpoint1;
        ResultPoint resultpoint2;
        Object obj;
        resultpoint = aresultpoint[0];
        resultpoint1 = aresultpoint[1];
        resultpoint2 = aresultpoint[2];
        obj = aresultpoint[3];
_L1:
        int i;
        int j;
        i = MathUtils.round((resultpoint.getX() + ((ResultPoint) (obj)).getX() + resultpoint1.getX() + resultpoint2.getX()) / 4F);
        j = MathUtils.round((resultpoint.getY() + ((ResultPoint) (obj)).getY() + resultpoint1.getY() + resultpoint2.getY()) / 4F);
        obj = (new WhiteRectangleDetector(image, 15, i, j)).detect();
        resultpoint = obj[0];
        resultpoint1 = obj[1];
        resultpoint2 = obj[2];
        obj = obj[3];
_L2:
        return new Point(MathUtils.round((resultpoint.getX() + ((ResultPoint) (obj)).getX() + resultpoint1.getX() + resultpoint2.getX()) / 4F), MathUtils.round((resultpoint.getY() + ((ResultPoint) (obj)).getY() + resultpoint1.getY() + resultpoint2.getY()) / 4F));
        NotFoundException notfoundexception;
        notfoundexception;
        i = image.getWidth() / 2;
        j = image.getHeight() / 2;
        notfoundexception = getFirstDifferent(new Point(i + 7, j - 7), false, 1, -1).toResultPoint();
        resultpoint1 = getFirstDifferent(new Point(i + 7, j + 7), false, 1, 1).toResultPoint();
        resultpoint2 = getFirstDifferent(new Point(i - 7, j + 7), false, -1, 1).toResultPoint();
        obj = getFirstDifferent(new Point(i - 7, j - 7), false, -1, -1).toResultPoint();
          goto _L1
        notfoundexception;
        notfoundexception = getFirstDifferent(new Point(i + 7, j - 7), false, 1, -1).toResultPoint();
        resultpoint1 = getFirstDifferent(new Point(i + 7, j + 7), false, 1, 1).toResultPoint();
        resultpoint2 = getFirstDifferent(new Point(i - 7, j + 7), false, -1, 1).toResultPoint();
        obj = getFirstDifferent(new Point(i - 7, j - 7), false, -1, -1).toResultPoint();
          goto _L2
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint aresultpoint[])
    {
        return expandSquare(aresultpoint, nbCenterLayers * 2, getDimension());
    }

    private static int getRotation(int ai[], int i)
        throws NotFoundException
    {
        int j = 0;
        int l = ai.length;
        for (int k = 0; k < l; k++)
        {
            int i1 = ai[k];
            j = (j << 3) + (((i1 >> i - 2) << 1) + (i1 & 1));
        }

        for (i = 0; i < 4; i++)
        {
            if (Integer.bitCount(EXPECTED_CORNER_BITS[i] ^ ((j & 1) << 11) + (j >> 1)) <= 2)
            {
                return i;
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private boolean isValid(int i, int j)
    {
        return i >= 0 && i < image.getWidth() && j > 0 && j < image.getHeight();
    }

    private boolean isValid(ResultPoint resultpoint)
    {
        return isValid(MathUtils.round(resultpoint.getX()), MathUtils.round(resultpoint.getY()));
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point1, Point point2, Point point3)
    {
        point = new Point(point.getX() - 3, point.getY() + 3);
        point1 = new Point(point1.getX() - 3, point1.getY() - 3);
        point2 = new Point(point2.getX() + 3, point2.getY() - 3);
        point3 = new Point(point3.getX() + 3, point3.getY() + 3);
        for (int i = getColor(point3, point); i == 0 || getColor(point, point1) != i || getColor(point1, point2) != i || getColor(point2, point3) != i;)
        {
            return false;
        }

        return true;
    }

    private BitMatrix sampleGrid(BitMatrix bitmatrix, ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3)
        throws NotFoundException
    {
        GridSampler gridsampler = GridSampler.getInstance();
        int i = getDimension();
        float f = (float)i / 2.0F - (float)nbCenterLayers;
        float f1 = (float)i / 2.0F + (float)nbCenterLayers;
        return gridsampler.sampleGrid(bitmatrix, i, i, f, f, f1, f, f1, f1, f, f1, resultpoint.getX(), resultpoint.getY(), resultpoint1.getX(), resultpoint1.getY(), resultpoint2.getX(), resultpoint2.getY(), resultpoint3.getX(), resultpoint3.getY());
    }

    private int sampleLine(ResultPoint resultpoint, ResultPoint resultpoint1, int i)
    {
        int k = 0;
        float f3 = distance(resultpoint, resultpoint1);
        float f4 = f3 / (float)i;
        float f = resultpoint.getX();
        float f1 = resultpoint.getY();
        float f2 = ((resultpoint1.getX() - resultpoint.getX()) * f4) / f3;
        f3 = ((resultpoint1.getY() - resultpoint.getY()) * f4) / f3;
        for (int j = 0; j < i;)
        {
            int l = k;
            if (image.get(MathUtils.round((float)j * f2 + f), MathUtils.round((float)j * f3 + f1)))
            {
                l = k | 1 << i - j - 1;
            }
            j++;
            k = l;
        }

        return k;
    }

    public AztecDetectorResult detect()
        throws NotFoundException
    {
        return detect(false);
    }

    public AztecDetectorResult detect(boolean flag)
        throws NotFoundException
    {
        ResultPoint aresultpoint[] = getBullsEyeCorners(getMatrixCenter());
        if (flag)
        {
            ResultPoint resultpoint = aresultpoint[0];
            aresultpoint[0] = aresultpoint[2];
            aresultpoint[2] = resultpoint;
        }
        extractParameters(aresultpoint);
        return new AztecDetectorResult(sampleGrid(image, aresultpoint[shift % 4], aresultpoint[(shift + 1) % 4], aresultpoint[(shift + 2) % 4], aresultpoint[(shift + 3) % 4]), getMatrixCornerPoints(aresultpoint), compact, nbDataBlocks, nbLayers);
    }

}
