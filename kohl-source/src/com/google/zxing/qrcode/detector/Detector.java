// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            FinderPatternFinder, AlignmentPatternFinder, FinderPatternInfo, FinderPattern, 
//            AlignmentPattern

public class Detector
{

    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitmatrix)
    {
        image = bitmatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        float f = sizeOfBlackWhiteBlackRunBothWays((int)resultpoint.getX(), (int)resultpoint.getY(), (int)resultpoint1.getX(), (int)resultpoint1.getY());
        float f1 = sizeOfBlackWhiteBlackRunBothWays((int)resultpoint1.getX(), (int)resultpoint1.getY(), (int)resultpoint.getX(), (int)resultpoint.getY());
        if (Float.isNaN(f))
        {
            return f1 / 7F;
        }
        if (Float.isNaN(f1))
        {
            return f / 7F;
        } else
        {
            return (f + f1) / 14F;
        }
    }

    private static int computeDimension(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, float f)
        throws NotFoundException
    {
        int i = (MathUtils.round(ResultPoint.distance(resultpoint, resultpoint1) / f) + MathUtils.round(ResultPoint.distance(resultpoint, resultpoint2) / f) >> 1) + 7;
        switch (i & 3)
        {
        case 1: // '\001'
        default:
            return i;

        case 0: // '\0'
            return i + 1;

        case 2: // '\002'
            return i - 1;

        case 3: // '\003'
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private static PerspectiveTransform createTransform(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i)
    {
        float f = (float)i - 3.5F;
        float f1;
        float f2;
        float f3;
        float f4;
        if (resultpoint3 != null)
        {
            f3 = resultpoint3.getX();
            f4 = resultpoint3.getY();
            f1 = f - 3F;
            f2 = f1;
        } else
        {
            f3 = (resultpoint1.getX() - resultpoint.getX()) + resultpoint2.getX();
            f4 = (resultpoint1.getY() - resultpoint.getY()) + resultpoint2.getY();
            f1 = f;
            f2 = f;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5F, 3.5F, f, 3.5F, f1, f2, 3.5F, f, resultpoint.getX(), resultpoint.getY(), resultpoint1.getX(), resultpoint1.getY(), f3, f4, resultpoint2.getX(), resultpoint2.getY());
    }

    private static BitMatrix sampleGrid(BitMatrix bitmatrix, PerspectiveTransform perspectivetransform, int i)
        throws NotFoundException
    {
        return GridSampler.getInstance().sampleGrid(bitmatrix, i, i, perspectivetransform);
    }

    private float sizeOfBlackWhiteBlackRun(int i, int j, int k, int l)
    {
        int i1;
        int j1;
        boolean flag;
        int k1;
        int l1;
        int i2;
        byte byte0;
        int j2;
        int i3;
        int j3;
        if (Math.abs(l - j) > Math.abs(k - i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = i;
        i1 = j;
        l1 = k;
        k1 = l;
        if (flag)
        {
            k1 = k;
            l1 = l;
            i1 = i;
            j1 = j;
        }
        i3 = Math.abs(l1 - j1);
        j3 = Math.abs(k1 - i1);
        j2 = -i3 >> 1;
        if (j1 < l1)
        {
            i2 = 1;
        } else
        {
            i2 = -1;
        }
        if (i1 < k1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        k = 0;
        i = j1;
        j = i1;
        do
        {
label0:
            {
label1:
                {
                    l = k;
                    int k2;
                    if (i != l1 + i2)
                    {
                        int l2;
                        boolean flag1;
                        if (flag)
                        {
                            k2 = j;
                        } else
                        {
                            k2 = i;
                        }
                        if (flag)
                        {
                            l2 = i;
                        } else
                        {
                            l2 = j;
                        }
                        if (k == 1)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        l = k;
                        if (flag1 == image.get(k2, l2))
                        {
                            if (k == 2)
                            {
                                return MathUtils.distance(i, j, j1, i1);
                            }
                            l = k + 1;
                        }
                        j2 += j3;
                        k = j2;
                        k2 = j;
                        if (j2 <= 0)
                        {
                            break label0;
                        }
                        if (j != k1)
                        {
                            break label1;
                        }
                    }
                    if (l == 2)
                    {
                        return MathUtils.distance(l1 + i2, k1, j1, i1);
                    } else
                    {
                        return (0.0F / 0.0F);
                    }
                }
                k2 = j + byte0;
                k = j2 - i3;
            }
            i += i2;
            j2 = k;
            k = l;
            j = k2;
        } while (true);
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i, int j, int k, int l)
    {
        float f1 = sizeOfBlackWhiteBlackRun(i, j, k, l);
        float f = 1.0F;
        int i1 = i - (k - i);
        if (i1 < 0)
        {
            f = (float)i / (float)(i - i1);
            k = 0;
        } else
        {
            k = i1;
            if (i1 >= image.getWidth())
            {
                f = (float)(image.getWidth() - 1 - i) / (float)(i1 - i);
                k = image.getWidth() - 1;
            }
        }
        i1 = (int)((float)j - (float)(l - j) * f);
        f = 1.0F;
        if (i1 < 0)
        {
            f = (float)j / (float)(j - i1);
            l = 0;
        } else
        {
            l = i1;
            if (i1 >= image.getHeight())
            {
                f = (float)(image.getHeight() - 1 - j) / (float)(i1 - j);
                l = image.getHeight() - 1;
            }
        }
        return (f1 + sizeOfBlackWhiteBlackRun(i, j, (int)((float)i + (float)(k - i) * f), l)) - 1.0F;
    }

    protected final float calculateModuleSize(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2)
    {
        return (calculateModuleSizeOneWay(resultpoint, resultpoint1) + calculateModuleSizeOneWay(resultpoint, resultpoint2)) / 2.0F;
    }

    public DetectorResult detect()
        throws NotFoundException, FormatException
    {
        return detect(null);
    }

    public final DetectorResult detect(Map map)
        throws NotFoundException, FormatException
    {
        ResultPointCallback resultpointcallback;
        if (map == null)
        {
            resultpointcallback = null;
        } else
        {
            resultpointcallback = (ResultPointCallback)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        resultPointCallback = resultpointcallback;
        return processFinderPatternInfo((new FinderPatternFinder(image, resultPointCallback)).find(map));
    }

    protected final AlignmentPattern findAlignmentInRegion(float f, int i, int j, float f1)
        throws NotFoundException
    {
        int l = (int)(f1 * f);
        int k = Math.max(0, i - l);
        i = Math.min(image.getWidth() - 1, i + l);
        if ((float)(i - k) < f * 3F)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i1 = Math.max(0, j - l);
        j = Math.min(image.getHeight() - 1, j + l);
        if ((float)(j - i1) < f * 3F)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return (new AlignmentPatternFinder(image, k, i1, i - k, j - i1, f, resultPointCallback)).find();
        }
    }

    protected final BitMatrix getImage()
    {
        return image;
    }

    protected final ResultPointCallback getResultPointCallback()
    {
        return resultPointCallback;
    }

    protected final DetectorResult processFinderPatternInfo(FinderPatternInfo finderpatterninfo)
        throws NotFoundException, FormatException
    {
        float f;
        Object obj;
        FinderPattern finderpattern;
        FinderPattern finderpattern1;
        FinderPattern finderpattern2;
        Version version;
        int i;
        int j;
        finderpattern = finderpatterninfo.getTopLeft();
        finderpattern1 = finderpatterninfo.getTopRight();
        finderpattern2 = finderpatterninfo.getBottomLeft();
        f = calculateModuleSize(finderpattern, finderpattern1, finderpattern2);
        if (f < 1.0F)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        j = computeDimension(finderpattern, finderpattern1, finderpattern2, f);
        version = Version.getProvisionalVersionForDimension(j);
        i = version.getDimensionForVersion();
        obj = null;
        finderpatterninfo = obj;
        if (version.getAlignmentPatternCenters().length <= 0) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        float f1 = finderpattern1.getX();
        float f3 = finderpattern.getX();
        float f4 = finderpattern2.getX();
        float f5 = finderpattern1.getY();
        float f6 = finderpattern.getY();
        float f7 = finderpattern2.getY();
        float f8 = 1.0F - 3F / (float)(i - 7);
        k = (int)(finderpattern.getX() + (((f1 - f3) + f4) - finderpattern.getX()) * f8);
        l = (int)(finderpattern.getY() + (((f5 - f6) + f7) - finderpattern.getY()) * f8);
        i = 4;
_L5:
        finderpatterninfo = obj;
        if (i > 16) goto _L2; else goto _L3
_L3:
        float f2 = i;
        finderpatterninfo = findAlignmentInRegion(f, k, l, f2);
_L2:
        PerspectiveTransform perspectivetransform = createTransform(finderpattern, finderpattern1, finderpattern2, finderpatterninfo, j);
        BitMatrix bitmatrix = sampleGrid(image, perspectivetransform, j);
        if (finderpatterninfo == null)
        {
            finderpatterninfo = new ResultPoint[3];
            finderpatterninfo[0] = finderpattern2;
            finderpatterninfo[1] = finderpattern;
            finderpatterninfo[2] = finderpattern1;
        } else
        {
            ResultPoint aresultpoint[] = new ResultPoint[4];
            aresultpoint[0] = finderpattern2;
            aresultpoint[1] = finderpattern;
            aresultpoint[2] = finderpattern1;
            aresultpoint[3] = finderpatterninfo;
            finderpatterninfo = aresultpoint;
        }
        return new DetectorResult(bitmatrix, finderpatterninfo);
        finderpatterninfo;
        i <<= 1;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
