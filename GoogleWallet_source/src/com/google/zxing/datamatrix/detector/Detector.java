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
    static final class ResultPointsAndTransitions
    {

        private final ResultPoint from;
        private final ResultPoint to;
        private final int transitions;

        final ResultPoint getFrom()
        {
            return from;
        }

        final ResultPoint getTo()
        {
            return to;
        }

        public final int getTransitions()
        {
            return transitions;
        }

        public final String toString()
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

    static final class ResultPointsAndTransitionsComparator
        implements Serializable, Comparator
    {

        private static int compare(ResultPointsAndTransitions resultpointsandtransitions, ResultPointsAndTransitions resultpointsandtransitions1)
        {
            return resultpointsandtransitions.getTransitions() - resultpointsandtransitions1.getTransitions();
        }

        public final volatile int compare(Object obj, Object obj1)
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
        resultpoint4 = new ResultPoint(resultpoint3.getX() + f * f1, resultpoint3.getY() + f * f2);
        f = (float)distance(resultpoint, resultpoint2) / (float)i;
        i = distance(resultpoint1, resultpoint3);
        f1 = (resultpoint3.getX() - resultpoint1.getX()) / (float)i;
        f2 = (resultpoint3.getY() - resultpoint1.getY()) / (float)i;
        resultpoint = new ResultPoint(resultpoint3.getX() + f * f1, resultpoint3.getY() + f * f2);
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
        if (Math.abs(transitionsBetween(resultpoint2, resultpoint4).getTransitions() - transitionsBetween(resultpoint1, resultpoint4).getTransitions()) <= Math.abs(transitionsBetween(resultpoint2, resultpoint).getTransitions() - transitionsBetween(resultpoint1, resultpoint).getTransitions()))
        {
            return resultpoint4;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private ResultPoint correctTopRightRectangular(ResultPoint resultpoint, ResultPoint resultpoint1, ResultPoint resultpoint2, ResultPoint resultpoint3, int i, int j)
    {
        ResultPoint resultpoint4;
        float f = (float)distance(resultpoint, resultpoint1) / (float)i;
        int k = distance(resultpoint2, resultpoint3);
        float f1 = (resultpoint3.getX() - resultpoint2.getX()) / (float)k;
        float f2 = (resultpoint3.getY() - resultpoint2.getY()) / (float)k;
        resultpoint4 = new ResultPoint(resultpoint3.getX() + f * f1, resultpoint3.getY() + f * f2);
        f = (float)distance(resultpoint, resultpoint2) / (float)j;
        k = distance(resultpoint1, resultpoint3);
        f1 = (resultpoint3.getX() - resultpoint1.getX()) / (float)k;
        f2 = (resultpoint3.getY() - resultpoint1.getY()) / (float)k;
        resultpoint = new ResultPoint(resultpoint3.getX() + f * f1, resultpoint3.getY() + f * f2);
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
        int k1 = (int)resultpoint.getX();
        int l1 = (int)resultpoint.getY();
        int k = (int)resultpoint1.getX();
        int l = (int)resultpoint1.getY();
        BitMatrix bitmatrix;
        int i;
        int j;
        boolean flag;
        int i1;
        int j1;
        int i2;
        int j2;
        int k2;
        int l2;
        boolean flag1;
        if (Math.abs(l - l1) > Math.abs(k - k1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = k1;
        i = l1;
        j1 = k;
        i1 = l;
        if (flag)
        {
            j = l1;
            i = k1;
            i1 = k;
            j1 = l;
        }
        k2 = Math.abs(j1 - j);
        l2 = Math.abs(i1 - i);
        i2 = -k2 >> 1;
        if (i < i1)
        {
            k1 = 1;
        } else
        {
            k1 = -1;
        }
        if (j < j1)
        {
            l1 = 1;
        } else
        {
            l1 = -1;
        }
        j2 = 0;
        bitmatrix = image;
        if (flag)
        {
            k = i;
        } else
        {
            k = j;
        }
        if (flag)
        {
            l = j;
        } else
        {
            l = i;
        }
        flag1 = bitmatrix.get(k, l);
        k = j;
        j = i;
        i = k;
        k = j2;
        do
        {
            j2 = k;
            if (i == j1)
            {
                break;
            }
            BitMatrix bitmatrix1 = image;
            boolean flag2;
            boolean flag3;
            if (flag)
            {
                l = j;
            } else
            {
                l = i;
            }
            if (flag)
            {
                j2 = i;
            } else
            {
                j2 = j;
            }
            flag3 = bitmatrix1.get(l, j2);
            flag2 = flag1;
            l = k;
            if (flag3 != flag1)
            {
                l = k + 1;
                flag2 = flag3;
            }
            i2 += l2;
            k = i2;
            j2 = j;
            if (i2 > 0)
            {
                j2 = l;
                if (j == i1)
                {
                    break;
                }
                j2 = j + k1;
                k = i2 - k2;
            }
            i += l1;
            i2 = k;
            flag1 = flag2;
            k = l;
            j = j2;
        } while (true);
        return new ResultPointsAndTransitions(resultpoint, resultpoint1, j2);
    }

    public final DetectorResult detect()
        throws NotFoundException
    {
        ResultPoint aresultpoint[] = rectangleDetector.detect();
        ResultPoint resultpoint4 = aresultpoint[0];
        ResultPoint resultpoint5 = aresultpoint[1];
        ResultPoint resultpoint6 = aresultpoint[2];
        ResultPoint resultpoint7 = aresultpoint[3];
        Object obj1 = new ArrayList(4);
        ((List) (obj1)).add(transitionsBetween(resultpoint4, resultpoint5));
        ((List) (obj1)).add(transitionsBetween(resultpoint4, resultpoint6));
        ((List) (obj1)).add(transitionsBetween(resultpoint5, resultpoint7));
        ((List) (obj1)).add(transitionsBetween(resultpoint6, resultpoint7));
        Collections.sort(((List) (obj1)), new ResultPointsAndTransitionsComparator());
        Object obj = (ResultPointsAndTransitions)((List) (obj1)).get(0);
        obj1 = (ResultPointsAndTransitions)((List) (obj1)).get(1);
        HashMap hashmap = new HashMap();
        increment(hashmap, ((ResultPointsAndTransitions) (obj)).getFrom());
        increment(hashmap, ((ResultPointsAndTransitions) (obj)).getTo());
        increment(hashmap, ((ResultPointsAndTransitions) (obj1)).getFrom());
        increment(hashmap, ((ResultPointsAndTransitions) (obj1)).getTo());
        obj1 = null;
        ResultPoint resultpoint3 = null;
        ResultPoint resultpoint = null;
        for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            obj = (ResultPoint)entry.getKey();
            if (((Integer)entry.getValue()).intValue() == 2)
            {
                resultpoint3 = ((ResultPoint) (obj));
            } else
            if (obj1 == null)
            {
                obj1 = obj;
            } else
            {
                resultpoint = ((ResultPoint) (obj));
            }
        }

        if (obj1 == null || resultpoint3 == null || resultpoint == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        obj = new ResultPoint[3];
        obj[0] = ((ResultPoint) (obj1));
        obj[1] = resultpoint3;
        obj[2] = resultpoint;
        ResultPoint.orderBestPatterns(((ResultPoint []) (obj)));
        resultpoint3 = obj[0];
        ResultPoint resultpoint8 = obj[1];
        ResultPoint resultpoint9 = obj[2];
        int i;
        int j;
        int i1;
        if (!hashmap.containsKey(resultpoint4))
        {
            obj = resultpoint4;
        } else
        if (!hashmap.containsKey(resultpoint5))
        {
            obj = resultpoint5;
        } else
        if (!hashmap.containsKey(resultpoint6))
        {
            obj = resultpoint6;
        } else
        {
            obj = resultpoint7;
        }
        i1 = transitionsBetween(resultpoint9, ((ResultPoint) (obj))).getTransitions();
        j = transitionsBetween(resultpoint3, ((ResultPoint) (obj))).getTransitions();
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
            ResultPoint resultpoint1 = correctTopRightRectangular(resultpoint8, resultpoint3, resultpoint9, ((ResultPoint) (obj)), i1, i);
            obj1 = resultpoint1;
            if (resultpoint1 == null)
            {
                obj1 = obj;
            }
            int k = transitionsBetween(resultpoint9, ((ResultPoint) (obj1))).getTransitions();
            i1 = transitionsBetween(resultpoint3, ((ResultPoint) (obj1))).getTransitions();
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
            obj = sampleGrid(image, resultpoint9, resultpoint8, resultpoint3, ((ResultPoint) (obj1)), i, k);
        } else
        {
            ResultPoint resultpoint2 = correctTopRight(resultpoint8, resultpoint3, resultpoint9, ((ResultPoint) (obj)), Math.min(i, i1));
            obj1 = resultpoint2;
            if (resultpoint2 == null)
            {
                obj1 = obj;
            }
            int l = Math.max(transitionsBetween(resultpoint9, ((ResultPoint) (obj1))).getTransitions(), transitionsBetween(resultpoint3, ((ResultPoint) (obj1))).getTransitions()) + 1;
            i = l;
            if ((l & 1) == 1)
            {
                i = l + 1;
            }
            obj = sampleGrid(image, resultpoint9, resultpoint8, resultpoint3, ((ResultPoint) (obj1)), i, i);
        }
        return new DetectorResult(((BitMatrix) (obj)), new ResultPoint[] {
            resultpoint9, resultpoint8, resultpoint3, obj1
        });
    }
}
