// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Detector
{
    private static final class ResultPointsAndTransitions
    {

        private final ResultPoint from;
        private final ResultPoint to;
        private final int transitions;

        ResultPoint getFrom()
        {
            return from;
        }

        ResultPoint getTo()
        {
            return to;
        }

        public int getTransitions()
        {
            return transitions;
        }

        public String toString()
        {
            return (new StringBuilder()).append(from).append("/").append(to).append('/').append(transitions).toString();
        }

        private ResultPointsAndTransitions(ResultPoint resultpoint, ResultPoint resultpoint1, int i)
        {
            from = resultpoint;
            to = resultpoint1;
            transitions = i;
        }

    }

    private static final class ResultPointsAndTransitionsComparator
        implements Comparator, Serializable
    {

        public int compare(ResultPointsAndTransitions resultpointsandtransitions, ResultPointsAndTransitions resultpointsandtransitions1)
        {
            return resultpointsandtransitions.getTransitions() - resultpointsandtransitions1.getTransitions();
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ResultPointsAndTransitions)obj, (ResultPointsAndTransitions)obj1);
        }

        private ResultPointsAndTransitionsComparator()
        {
        }

    }


    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitmatrix)
        throws NotFoundException
    {
        image = bitmatrix;
        rectangleDetector = new WhiteRectangleDetector(bitmatrix);
    }

    private ResultPoint correctTopRight(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i)
    {
        ResultPoint resultpoint4;
        float f = (float)distance(resultpoint, resultpoint1) / (float)i;
        int j = distance(resultpoint2, resultpoint3);
        float f1 = (resultpoint3.getX() - resultpoint2.getX()) / (float)j;
        float f2 = (resultpoint3.getY() - resultpoint2.getY()) / (float)j;
        resultpoint4 = new ResultPoint(f1 * f + resultpoint3.getX(), f * f2 + resultpoint3.getY());
        f = (float)distance(resultpoint, resultpoint2) / (float)i;
        i = distance(resultpoint1, resultpoint3);
        f1 = (resultpoint3.getX() - resultpoint1.getX()) / (float)i;
        f2 = (resultpoint3.getY() - resultpoint1.getY()) / (float)i;
        resultpoint3 = new ResultPoint(f1 * f + resultpoint3.getX(), f * f2 + resultpoint3.getY());
        if (isValid(resultpoint4)) goto _L2; else goto _L1
_L1:
        if (!isValid(resultpoint3)) goto _L4; else goto _L3
_L3:
        resultpoint = resultpoint3;
_L6:
        return resultpoint;
_L4:
        return null;
_L2:
        resultpoint = resultpoint4;
        if (isValid(resultpoint3))
        {
            resultpoint = resultpoint4;
            if (Math.abs(transitionsBetween(resultpoint2, resultpoint4).getTransitions() - transitionsBetween(resultpoint1, resultpoint4).getTransitions()) > Math.abs(transitionsBetween(resultpoint2, resultpoint3).getTransitions() - transitionsBetween(resultpoint1, resultpoint3).getTransitions()))
            {
                return resultpoint3;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private ResultPoint correctTopRightRectangular(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i, int j)
    {
        ResultPoint resultpoint4;
        float f = (float)distance(resultpoint, resultpoint1) / (float)i;
        int k = distance(resultpoint2, resultpoint3);
        float f1 = (resultpoint3.getX() - resultpoint2.getX()) / (float)k;
        float f2 = (resultpoint3.getY() - resultpoint2.getY()) / (float)k;
        resultpoint4 = new ResultPoint(f1 * f + resultpoint3.getX(), f * f2 + resultpoint3.getY());
        f = (float)distance(resultpoint, resultpoint2) / (float)j;
        k = distance(resultpoint1, resultpoint3);
        f1 = (resultpoint3.getX() - resultpoint1.getX()) / (float)k;
        f2 = (resultpoint3.getY() - resultpoint1.getY()) / (float)k;
        resultpoint = new ResultPoint(f1 * f + resultpoint3.getX(), f * f2 + resultpoint3.getY());
        if (isValid(resultpoint4)) goto _L2; else goto _L1
_L1:
        if (!isValid(resultpoint)) goto _L4; else goto _L3
_L3:
        return resultpoint;
_L4:
        return null;
_L2:
        if (!isValid(resultpoint))
        {
            return resultpoint4;
        }
        if (Math.abs(i - transitionsBetween(resultpoint2, resultpoint4).getTransitions()) + Math.abs(j - transitionsBetween(resultpoint1, resultpoint4).getTransitions()) <= Math.abs(i - transitionsBetween(resultpoint2, resultpoint).getTransitions()) + Math.abs(j - transitionsBetween(resultpoint1, resultpoint).getTransitions()))
        {
            return resultpoint4;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static int distance(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        return MathUtils.round(ResultPoint.distance(resultpoint, resultpoint1));
    }

    private static void increment(Map map, ResultPoint resultpoint)
    {
        Integer integer = (Integer)map.get(resultpoint);
        int i;
        if (integer == null)
        {
            i = 1;
        } else
        {
            i = integer.intValue() + 1;
        }
        map.put(resultpoint, Integer.valueOf(i));
    }

    private boolean isValid(ResultPoint resultpoint)
    {
        return resultpoint.getX() >= 0.0F && resultpoint.getX() < (float)image.getWidth() && resultpoint.getY() > 0.0F && resultpoint.getY() < (float)image.getHeight();
    }

    private static BitMatrix sampleGrid(BitMatrix bitmatrix, ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i, int j)
        throws NotFoundException
    {
        return GridSampler.getInstance().sampleGrid(bitmatrix, i, j, 0.5F, 0.5F, (float)i - 0.5F, 0.5F, (float)i - 0.5F, (float)j - 0.5F, 0.5F, (float)j - 0.5F, resultpoint.getX(), resultpoint.getY(), resultpoint3.getX(), resultpoint3.getY(), resultpoint2.getX(), resultpoint2.getY(), resultpoint1.getX(), resultpoint1.getY());
    }

    private ResultPointsAndTransitions transitionsBetween(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        int j = (int)resultpoint.getX();
        int i = (int)resultpoint.getY();
        int k1 = (int)resultpoint1.getX();
        int l1 = (int)resultpoint1.getY();
        BitMatrix bitmatrix;
        int k;
        int i1;
        boolean flag;
        byte byte0;
        byte byte1;
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (Math.abs(l1 - i) > Math.abs(k1 - j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int l = k1;
            k1 = l1;
            int j1 = j;
            l1 = l;
            j = i;
            i = j1;
        }
        k2 = Math.abs(l1 - i);
        l2 = Math.abs(k1 - j);
        i2 = -k2;
        if (j < k1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (i < l1)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        j2 = 0;
        bitmatrix = image;
        if (flag)
        {
            k = j;
        } else
        {
            k = i;
        }
        if (flag)
        {
            i1 = i;
        } else
        {
            i1 = j;
        }
        flag1 = bitmatrix.get(k, i1);
        i2 >>= 1;
        k = j2;
        if (i == l1) goto _L2; else goto _L1
_L1:
        bitmatrix = image;
        if (flag)
        {
            i1 = j;
        } else
        {
            i1 = i;
        }
        if (flag)
        {
            j2 = i;
        } else
        {
            j2 = j;
        }
        flag3 = bitmatrix.get(i1, j2);
        i1 = k;
        flag2 = flag1;
        if (flag3 != flag1)
        {
            i1 = k + 1;
            flag2 = flag3;
        }
        j2 = i2 + l2;
        k = j2;
        i2 = j;
        if (j2 <= 0) goto _L4; else goto _L3
_L3:
        if (j != k1) goto _L6; else goto _L5
_L5:
        return new ResultPointsAndTransitions(resultpoint, resultpoint1, i1);
_L6:
        i2 = j + byte0;
        k = j2 - k2;
_L4:
        i += byte1;
        j2 = k;
        j = i2;
        k = i1;
        flag1 = flag2;
        i2 = j2;
        break MISSING_BLOCK_LABEL_146;
_L2:
        i1 = k;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public DetectorResult detect()
        throws NotFoundException
    {
        ResultPoint aresultpoint[] = rectangleDetector.detect();
        ResultPoint resultpoint5 = aresultpoint[0];
        ResultPoint resultpoint6 = aresultpoint[1];
        ResultPoint resultpoint7 = aresultpoint[2];
        ResultPoint resultpoint8 = aresultpoint[3];
        Object obj1 = new ArrayList(4);
        ((List) (obj1)).add(transitionsBetween(resultpoint5, resultpoint6));
        ((List) (obj1)).add(transitionsBetween(resultpoint5, resultpoint7));
        ((List) (obj1)).add(transitionsBetween(resultpoint6, resultpoint8));
        ((List) (obj1)).add(transitionsBetween(resultpoint7, resultpoint8));
        Collections.sort(((List) (obj1)), new ResultPointsAndTransitionsComparator());
        Object obj = (ResultPointsAndTransitions)((List) (obj1)).get(0);
        obj1 = (ResultPointsAndTransitions)((List) (obj1)).get(1);
        HashMap hashmap = new HashMap();
        increment(hashmap, ((ResultPointsAndTransitions) (obj)).getFrom());
        increment(hashmap, ((ResultPointsAndTransitions) (obj)).getTo());
        increment(hashmap, ((ResultPointsAndTransitions) (obj1)).getFrom());
        increment(hashmap, ((ResultPointsAndTransitions) (obj1)).getTo());
        obj1 = null;
        ResultPoint resultpoint = null;
        obj = null;
        Object obj2 = hashmap.entrySet().iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
            ResultPoint resultpoint3 = (ResultPoint)entry.getKey();
            if (((Integer)entry.getValue()).intValue() == 2)
            {
                resultpoint = ((ResultPoint) (obj1));
                obj1 = resultpoint3;
            } else
            if (obj1 == null)
            {
                obj1 = resultpoint;
                resultpoint = resultpoint3;
            } else
            {
                obj = resultpoint;
                resultpoint = ((ResultPoint) (obj1));
                obj1 = obj;
                obj = resultpoint3;
            }
            resultpoint3 = resultpoint;
            resultpoint = ((ResultPoint) (obj1));
            obj1 = resultpoint3;
        }
        if (obj1 == null || resultpoint == null || obj == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint aresultpoint1[] = new ResultPoint[3];
        aresultpoint1[0] = ((ResultPoint) (obj1));
        aresultpoint1[1] = resultpoint;
        aresultpoint1[2] = ((ResultPoint) (obj));
        ResultPoint.orderBestPatterns(aresultpoint1);
        ResultPoint resultpoint4 = aresultpoint1[0];
        obj2 = aresultpoint1[1];
        ResultPoint resultpoint9 = aresultpoint1[2];
        int i;
        int j;
        int i1;
        if (!hashmap.containsKey(resultpoint5))
        {
            obj = resultpoint5;
        } else
        if (!hashmap.containsKey(resultpoint6))
        {
            obj = resultpoint6;
        } else
        if (!hashmap.containsKey(resultpoint7))
        {
            obj = resultpoint7;
        } else
        {
            obj = resultpoint8;
        }
        i1 = transitionsBetween(resultpoint9, ((ResultPoint) (obj))).getTransitions();
        j = transitionsBetween(resultpoint4, ((ResultPoint) (obj))).getTransitions();
        i = i1;
        if ((i1 & 1) == 1)
        {
            i = i1 + 1;
        }
        i1 = i + 2;
        i = j;
        if ((j & 1) == 1)
        {
            i = j + 1;
        }
        i += 2;
        if (i1 * 4 >= i * 7 || i * 4 >= i1 * 7)
        {
            ResultPoint resultpoint1 = correctTopRightRectangular(((ResultPoint) (obj2)), resultpoint4, resultpoint9, ((ResultPoint) (obj)), i1, i);
            obj1 = resultpoint1;
            if (resultpoint1 == null)
            {
                obj1 = obj;
            }
            int k = transitionsBetween(resultpoint9, ((ResultPoint) (obj1))).getTransitions();
            i1 = transitionsBetween(resultpoint4, ((ResultPoint) (obj1))).getTransitions();
            i = k;
            if ((k & 1) == 1)
            {
                i = k + 1;
            }
            k = i1;
            if ((i1 & 1) == 1)
            {
                k = i1 + 1;
            }
            obj = sampleGrid(image, resultpoint9, ((ResultPoint) (obj2)), resultpoint4, ((ResultPoint) (obj1)), i, k);
        } else
        {
            ResultPoint resultpoint2 = correctTopRight(((ResultPoint) (obj2)), resultpoint4, resultpoint9, ((ResultPoint) (obj)), Math.min(i, i1));
            obj1 = resultpoint2;
            if (resultpoint2 == null)
            {
                obj1 = obj;
            }
            int l = Math.max(transitionsBetween(resultpoint9, ((ResultPoint) (obj1))).getTransitions(), transitionsBetween(resultpoint4, ((ResultPoint) (obj1))).getTransitions()) + 1;
            i = l;
            if ((l & 1) == 1)
            {
                i = l + 1;
            }
            obj = sampleGrid(image, resultpoint9, ((ResultPoint) (obj2)), resultpoint4, ((ResultPoint) (obj1)), i, i);
        }
        return new DetectorResult(((BitMatrix) (obj)), new ResultPoint[] {
            resultpoint9, obj2, resultpoint4, obj1
        });
    }
}
