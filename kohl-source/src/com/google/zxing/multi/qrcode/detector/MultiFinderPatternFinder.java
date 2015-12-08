// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.detector.FinderPattern;
import com.google.zxing.qrcode.detector.FinderPatternFinder;
import com.google.zxing.qrcode.detector.FinderPatternInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

final class MultiFinderPatternFinder extends FinderPatternFinder
{
    private static final class ModuleSizeComparator
        implements Comparator, Serializable
    {

        public int compare(FinderPattern finderpattern, FinderPattern finderpattern1)
        {
            float f = finderpattern1.getEstimatedModuleSize() - finderpattern.getEstimatedModuleSize();
            if ((double)f < 0.0D)
            {
                return -1;
            }
            return (double)f <= 0.0D ? 0 : 1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((FinderPattern)obj, (FinderPattern)obj1);
        }

        private ModuleSizeComparator()
        {
        }

    }


    private static final float DIFF_MODSIZE_CUTOFF = 0.5F;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05F;
    private static final FinderPatternInfo EMPTY_RESULT_ARRAY[] = new FinderPatternInfo[0];
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180F;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9F;

    MultiFinderPatternFinder(BitMatrix bitmatrix)
    {
        super(bitmatrix);
    }

    MultiFinderPatternFinder(BitMatrix bitmatrix, ResultPointCallback resultpointcallback)
    {
        super(bitmatrix, resultpointcallback);
    }

    private FinderPattern[][] selectMutipleBestPatterns()
        throws NotFoundException
    {
        List list;
        ArrayList arraylist;
        int i;
        int l;
        list = getPossibleCenters();
        l = list.size();
        if (l < 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (l == 3)
        {
            return (new FinderPattern[][] {
                new FinderPattern[] {
                    (FinderPattern)list.get(0), (FinderPattern)list.get(1), (FinderPattern)list.get(2)
                }
            });
        }
        Collections.sort(list, new ModuleSizeComparator());
        arraylist = new ArrayList();
        i = 0;
_L2:
        FinderPattern finderpattern;
        if (i >= l - 2)
        {
            break MISSING_BLOCK_LABEL_510;
        }
        finderpattern = (FinderPattern)list.get(i);
        if (finderpattern != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int j = i + 1;
_L7:
        if (j >= l - 1) goto _L4; else goto _L3
_L3:
        FinderPattern finderpattern1 = (FinderPattern)list.get(j);
        if (finderpattern1 != null) goto _L6; else goto _L5
_L5:
        j++;
          goto _L7
_L6:
        float f = (finderpattern.getEstimatedModuleSize() - finderpattern1.getEstimatedModuleSize()) / Math.min(finderpattern.getEstimatedModuleSize(), finderpattern1.getEstimatedModuleSize());
        if (Math.abs(finderpattern.getEstimatedModuleSize() - finderpattern1.getEstimatedModuleSize()) > 0.5F && f >= 0.05F) goto _L4; else goto _L8
_L8:
        int k = j + 1;
_L12:
        if (k >= l) goto _L5; else goto _L9
_L9:
        Object obj = (FinderPattern)list.get(k);
        if (obj != null) goto _L11; else goto _L10
_L10:
        k++;
          goto _L12
_L11:
        f = (finderpattern1.getEstimatedModuleSize() - ((FinderPattern) (obj)).getEstimatedModuleSize()) / Math.min(finderpattern1.getEstimatedModuleSize(), ((FinderPattern) (obj)).getEstimatedModuleSize());
        if (Math.abs(finderpattern1.getEstimatedModuleSize() - ((FinderPattern) (obj)).getEstimatedModuleSize()) > 0.5F && f >= 0.05F) goto _L5; else goto _L13
_L13:
        FinderPattern afinderpattern[] = new FinderPattern[3];
        afinderpattern[0] = finderpattern;
        afinderpattern[1] = finderpattern1;
        afinderpattern[2] = ((FinderPattern) (obj));
        ResultPoint.orderBestPatterns(afinderpattern);
        obj = new FinderPatternInfo(afinderpattern);
        float f2 = ResultPoint.distance(((FinderPatternInfo) (obj)).getTopLeft(), ((FinderPatternInfo) (obj)).getBottomLeft());
        float f1 = ResultPoint.distance(((FinderPatternInfo) (obj)).getTopRight(), ((FinderPatternInfo) (obj)).getBottomLeft());
        float f3 = ResultPoint.distance(((FinderPatternInfo) (obj)).getTopLeft(), ((FinderPatternInfo) (obj)).getTopRight());
        float f4 = (f2 + f3) / (finderpattern.getEstimatedModuleSize() * 2.0F);
        if (f4 <= 180F && f4 >= 9F && Math.abs((f2 - f3) / Math.min(f2, f3)) < 0.1F)
        {
            f2 = (float)Math.sqrt(f2 * f2 + f3 * f3);
            if (Math.abs((f1 - f2) / Math.min(f1, f2)) < 0.1F)
            {
                arraylist.add(afinderpattern);
            }
        }
          goto _L10
        if (!arraylist.isEmpty())
        {
            return (FinderPattern[][])arraylist.toArray(new FinderPattern[arraylist.size()][]);
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public FinderPatternInfo[] findMulti(Map map)
        throws NotFoundException
    {
        int ai[];
        int i;
        int i1;
        int l1;
        int i2;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        map = getImage();
        l1 = map.getHeight();
        i2 = map.getWidth();
        i1 = (int)(((float)l1 / 228F) * 3F);
        if (i1 < 3 || i != 0)
        {
            i1 = 3;
        }
        ai = new int[5];
        for (int j1 = i1 - 1; j1 < l1; j1 += i1)
        {
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            ai[4] = 0;
            i = 0;
            int k1 = 0;
            while (k1 < i2) 
            {
                if (map.get(k1, j1))
                {
                    int k = i;
                    if ((i & 1) == 1)
                    {
                        k = i + 1;
                    }
                    ai[k] = ai[k] + 1;
                    i = k;
                } else
                if ((i & 1) == 0)
                {
                    if (i == 4)
                    {
                        if (foundPatternCross(ai) && handlePossibleCenter(ai, j1, k1))
                        {
                            i = 0;
                            ai[0] = 0;
                            ai[1] = 0;
                            ai[2] = 0;
                            ai[3] = 0;
                            ai[4] = 0;
                        } else
                        {
                            ai[0] = ai[2];
                            ai[1] = ai[3];
                            ai[2] = ai[4];
                            ai[3] = 1;
                            ai[4] = 0;
                            i = 3;
                        }
                    } else
                    {
                        i++;
                        ai[i] = ai[i] + 1;
                    }
                } else
                {
                    ai[i] = ai[i] + 1;
                }
                k1++;
            }
            if (foundPatternCross(ai))
            {
                handlePossibleCenter(ai, j1, i2);
            }
        }

        map = selectMutipleBestPatterns();
        ArrayList arraylist = new ArrayList();
        int l = map.length;
        for (int j = 0; j < l; j++)
        {
            ResultPoint aresultpoint[] = map[j];
            ResultPoint.orderBestPatterns(aresultpoint);
            arraylist.add(new FinderPatternInfo(aresultpoint));
        }

        if (arraylist.isEmpty())
        {
            return EMPTY_RESULT_ARRAY;
        } else
        {
            return (FinderPatternInfo[])arraylist.toArray(new FinderPatternInfo[arraylist.size()]);
        }
    }

}
