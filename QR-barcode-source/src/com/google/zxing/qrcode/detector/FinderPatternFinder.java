// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.qrcode.detector:
//            FinderPattern, FinderPatternInfo

public class FinderPatternFinder
{
    private static final class CenterComparator
        implements Comparator, Serializable
    {

        private final float average;

        public int compare(FinderPattern finderpattern, FinderPattern finderpattern1)
        {
            if (finderpattern1.getCount() == finderpattern.getCount())
            {
                float f = Math.abs(finderpattern1.getEstimatedModuleSize() - average);
                float f1 = Math.abs(finderpattern.getEstimatedModuleSize() - average);
                if (f < f1)
                {
                    return 1;
                }
                return f != f1 ? -1 : 0;
            } else
            {
                return finderpattern1.getCount() - finderpattern.getCount();
            }
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((FinderPattern)obj, (FinderPattern)obj1);
        }

        private CenterComparator(float f)
        {
            average = f;
        }

    }

    private static final class FurthestFromAverageComparator
        implements Comparator, Serializable
    {

        private final float average;

        public int compare(FinderPattern finderpattern, FinderPattern finderpattern1)
        {
            float f = Math.abs(finderpattern1.getEstimatedModuleSize() - average);
            float f1 = Math.abs(finderpattern.getEstimatedModuleSize() - average);
            if (f < f1)
            {
                return -1;
            }
            return f != f1 ? 1 : 0;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((FinderPattern)obj, (FinderPattern)obj1);
        }

        private FurthestFromAverageComparator(float f)
        {
            average = f;
        }

    }


    private static final int CENTER_QUORUM = 2;
    private static final int INTEGER_MATH_SHIFT = 8;
    protected static final int MAX_MODULES = 57;
    protected static final int MIN_SKIP = 3;
    private final int crossCheckStateCount[];
    private boolean hasSkipped;
    private final BitMatrix image;
    private final List possibleCenters;
    private final ResultPointCallback resultPointCallback;

    public FinderPatternFinder(BitMatrix bitmatrix)
    {
        this(bitmatrix, null);
    }

    public FinderPatternFinder(BitMatrix bitmatrix, ResultPointCallback resultpointcallback)
    {
        image = bitmatrix;
        possibleCenters = new ArrayList();
        crossCheckStateCount = new int[5];
        resultPointCallback = resultpointcallback;
    }

    private static float centerFromEnd(int ai[], int i)
    {
        return (float)(i - ai[4] - ai[3]) - (float)ai[2] / 2.0F;
    }

    private float crossCheckHorizontal(int i, int j, int k, int l)
    {
        BitMatrix bitmatrix = image;
        int k1 = bitmatrix.getWidth();
        int ai[] = getCrossCheckStateCount();
        int i1;
        for (i1 = i; i1 >= 0 && bitmatrix.get(i1, j); i1--)
        {
            ai[2] = ai[2] + 1;
        }

        int j1 = i1;
        if (i1 >= 0)
        {
            for (; j1 >= 0 && !bitmatrix.get(j1, j) && ai[1] <= k; j1--)
            {
                ai[1] = ai[1] + 1;
            }

            if (j1 >= 0 && ai[1] <= k)
            {
                for (; j1 >= 0 && bitmatrix.get(j1, j) && ai[0] <= k; j1--)
                {
                    ai[0] = ai[0] + 1;
                }

                if (ai[0] <= k)
                {
                    for (i++; i < k1 && bitmatrix.get(i, j); i++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (i != k1)
                    {
                        for (; i < k1 && !bitmatrix.get(i, j) && ai[3] < k; i++)
                        {
                            ai[3] = ai[3] + 1;
                        }

                        if (i != k1 && ai[3] < k)
                        {
                            for (; i < k1 && bitmatrix.get(i, j) && ai[4] < k; i++)
                            {
                                ai[4] = ai[4] + 1;
                            }

                            if (ai[4] < k && Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - l) * 5 < l && foundPatternCross(ai))
                            {
                                return centerFromEnd(ai, i);
                            }
                        }
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private float crossCheckVertical(int i, int j, int k, int l)
    {
        BitMatrix bitmatrix = image;
        int k1 = bitmatrix.getHeight();
        int ai[] = getCrossCheckStateCount();
        int i1;
        for (i1 = i; i1 >= 0 && bitmatrix.get(j, i1); i1--)
        {
            ai[2] = ai[2] + 1;
        }

        int j1 = i1;
        if (i1 >= 0)
        {
            for (; j1 >= 0 && !bitmatrix.get(j, j1) && ai[1] <= k; j1--)
            {
                ai[1] = ai[1] + 1;
            }

            if (j1 >= 0 && ai[1] <= k)
            {
                for (; j1 >= 0 && bitmatrix.get(j, j1) && ai[0] <= k; j1--)
                {
                    ai[0] = ai[0] + 1;
                }

                if (ai[0] <= k)
                {
                    for (i++; i < k1 && bitmatrix.get(j, i); i++)
                    {
                        ai[2] = ai[2] + 1;
                    }

                    if (i != k1)
                    {
                        for (; i < k1 && !bitmatrix.get(j, i) && ai[3] < k; i++)
                        {
                            ai[3] = ai[3] + 1;
                        }

                        if (i != k1 && ai[3] < k)
                        {
                            for (; i < k1 && bitmatrix.get(j, i) && ai[4] < k; i++)
                            {
                                ai[4] = ai[4] + 1;
                            }

                            if (ai[4] < k && Math.abs((ai[0] + ai[1] + ai[2] + ai[3] + ai[4]) - l) * 5 < l * 2 && foundPatternCross(ai))
                            {
                                return centerFromEnd(ai, i);
                            }
                        }
                    }
                }
            }
        }
        return (0.0F / 0.0F);
    }

    private int findRowSkip()
    {
        if (possibleCenters.size() <= 1)
        {
            return 0;
        }
        FinderPattern finderpattern = null;
        Iterator iterator = possibleCenters.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FinderPattern finderpattern1 = (FinderPattern)iterator.next();
            if (finderpattern1.getCount() >= 2)
            {
                if (finderpattern == null)
                {
                    finderpattern = finderpattern1;
                } else
                {
                    hasSkipped = true;
                    return (int)(Math.abs(finderpattern.getX() - finderpattern1.getX()) - Math.abs(finderpattern.getY() - finderpattern1.getY())) / 2;
                }
            }
        } while (true);
        return 0;
    }

    protected static boolean foundPatternCross(int ai[])
    {
        int i;
        int k;
        boolean flag;
        flag = true;
        i = 0;
        k = 0;
_L7:
        if (i >= 5) goto _L2; else goto _L1
_L1:
        int l = ai[i];
        if (l != 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        k += l;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (k < 7) goto _L3; else goto _L5
_L5:
        int j = (k << 8) / 7;
        k = j / 2;
        if (Math.abs(j - (ai[0] << 8)) >= k || Math.abs(j - (ai[1] << 8)) >= k || Math.abs(j * 3 - (ai[2] << 8)) >= k * 3 || Math.abs(j - (ai[3] << 8)) >= k || Math.abs(j - (ai[4] << 8)) >= k)
        {
            flag = false;
        }
        return flag;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int[] getCrossCheckStateCount()
    {
        crossCheckStateCount[0] = 0;
        crossCheckStateCount[1] = 0;
        crossCheckStateCount[2] = 0;
        crossCheckStateCount[3] = 0;
        crossCheckStateCount[4] = 0;
        return crossCheckStateCount;
    }

    private boolean haveMultiplyConfirmedCenters()
    {
        float f1 = 0.0F;
        int j = possibleCenters.size();
        Iterator iterator = possibleCenters.iterator();
        float f = 0.0F;
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            FinderPattern finderpattern = (FinderPattern)iterator.next();
            if (finderpattern.getCount() >= 2)
            {
                f = finderpattern.getEstimatedModuleSize() + f;
                i++;
            }
        } while (true);
        if (i >= 3)
        {
            float f2 = f / (float)j;
            for (Iterator iterator1 = possibleCenters.iterator(); iterator1.hasNext();)
            {
                f1 += Math.abs(((FinderPattern)iterator1.next()).getEstimatedModuleSize() - f2);
            }

            if (f1 <= 0.05F * f)
            {
                return true;
            }
        }
        return false;
    }

    private FinderPattern[] selectBestPatterns()
        throws NotFoundException
    {
        float f3 = 0.0F;
        int i = possibleCenters.size();
        if (i < 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (i > 3)
        {
            Iterator iterator = possibleCenters.iterator();
            float f = 0.0F;
            float f2 = 0.0F;
            while (iterator.hasNext()) 
            {
                float f4 = ((FinderPattern)iterator.next()).getEstimatedModuleSize();
                f2 += f4;
                f = f4 * f4 + f;
            }
            f2 /= i;
            f = (float)Math.sqrt(f / (float)i - f2 * f2);
            Collections.sort(possibleCenters, new FurthestFromAverageComparator(f2));
            f = Math.max(0.2F * f2, f);
            int k;
            for (int j = 0; j < possibleCenters.size() && possibleCenters.size() > 3; j = k + 1)
            {
                k = j;
                if (Math.abs(((FinderPattern)possibleCenters.get(j)).getEstimatedModuleSize() - f2) > f)
                {
                    possibleCenters.remove(j);
                    k = j - 1;
                }
            }

        }
        if (possibleCenters.size() > 3)
        {
            Iterator iterator1 = possibleCenters.iterator();
            float f1;
            for (f1 = f3; iterator1.hasNext(); f1 += ((FinderPattern)iterator1.next()).getEstimatedModuleSize()) { }
            f1 /= possibleCenters.size();
            Collections.sort(possibleCenters, new CenterComparator(f1));
            possibleCenters.subList(3, possibleCenters.size()).clear();
        }
        return (new FinderPattern[] {
            (FinderPattern)possibleCenters.get(0), (FinderPattern)possibleCenters.get(1), (FinderPattern)possibleCenters.get(2)
        });
    }

    final FinderPatternInfo find(Map map)
        throws NotFoundException
    {
        int i;
        int j;
        int k;
        int i1;
        int j1;
        boolean flag1;
        if (map != null && map.containsKey(DecodeHintType.TRY_HARDER))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i1 = image.getHeight();
        j1 = image.getWidth();
        j = (i1 * 3) / 228;
        if (j < 3 || i != 0)
        {
            i = 3;
        } else
        {
            i = j;
        }
        map = new int[5];
        k = i - 1;
        flag1 = false;
        while (k < i1 && !flag1) 
        {
            map[0] = 0;
            map[1] = 0;
            map[2] = 0;
            map[3] = 0;
            map[4] = 0;
            j = 0;
            boolean flag = false;
            byte byte0 = i;
            i = ((flag) ? 1 : 0);
            while (j < j1) 
            {
                if (image.get(j, k))
                {
                    int l = i;
                    if ((i & 1) == 1)
                    {
                        l = i + 1;
                    }
                    map[l] = map[l] + 1;
                    i = l;
                } else
                if ((i & 1) == 0)
                {
                    if (i == 4)
                    {
                        if (foundPatternCross(map))
                        {
                            if (handlePossibleCenter(map, k, j))
                            {
                                if (hasSkipped)
                                {
                                    flag1 = haveMultiplyConfirmedCenters();
                                } else
                                {
                                    i = findRowSkip();
                                    boolean flag2;
                                    if (i > map[2])
                                    {
                                        j = k + (i - map[2] - 2);
                                        i = j1 - 1;
                                    } else
                                    {
                                        i = j;
                                        j = k;
                                    }
                                    k = j;
                                    j = i;
                                }
                                map[0] = 0;
                                map[1] = 0;
                                map[2] = 0;
                                map[3] = 0;
                                map[4] = 0;
                                byte0 = 2;
                                i = 0;
                            } else
                            {
                                map[0] = map[2];
                                map[1] = map[3];
                                map[2] = map[4];
                                map[3] = 1;
                                map[4] = 0;
                                i = 3;
                            }
                        } else
                        {
                            map[0] = map[2];
                            map[1] = map[3];
                            map[2] = map[4];
                            map[3] = 1;
                            map[4] = 0;
                            i = 3;
                        }
                    } else
                    {
                        i++;
                        map[i] = map[i] + 1;
                    }
                } else
                {
                    map[i] = map[i] + 1;
                }
                j++;
            }
            flag2 = flag1;
            i = byte0;
            if (foundPatternCross(map))
            {
                flag2 = flag1;
                i = byte0;
                if (handlePossibleCenter(map, k, j1))
                {
                    j = map[0];
                    flag2 = flag1;
                    i = j;
                    if (hasSkipped)
                    {
                        flag2 = haveMultiplyConfirmedCenters();
                        i = j;
                    }
                }
            }
            k += i;
            flag1 = flag2;
        }
        map = selectBestPatterns();
        ResultPoint.orderBestPatterns(map);
        return new FinderPatternInfo(map);
    }

    protected final BitMatrix getImage()
    {
        return image;
    }

    protected final List getPossibleCenters()
    {
        return possibleCenters;
    }

    protected final boolean handlePossibleCenter(int ai[], int i, int j)
    {
        float f;
        float f1;
        boolean flag;
        int k;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag = false;
        k = ai[0] + ai[1] + ai[2] + ai[3] + ai[4];
        f1 = centerFromEnd(ai, j);
        f = crossCheckVertical(i, (int)f1, ai[2], k);
        flag1 = flag2;
        if (Float.isNaN(f)) goto _L2; else goto _L1
_L1:
        f1 = crossCheckHorizontal((int)f1, (int)f, ai[2], k);
        flag1 = flag2;
        if (Float.isNaN(f1)) goto _L2; else goto _L3
_L3:
        float f2;
        f2 = (float)k / 7F;
        i = 0;
_L9:
        j = ((flag) ? 1 : 0);
        if (i >= possibleCenters.size()) goto _L5; else goto _L4
_L4:
        ai = (FinderPattern)possibleCenters.get(i);
        if (!ai.aboutEquals(f2, f, f1)) goto _L7; else goto _L6
_L6:
        possibleCenters.set(i, ai.combineEstimate(f, f1, f2));
        j = 1;
_L5:
        if (j == 0)
        {
            ai = new FinderPattern(f1, f, f2);
            possibleCenters.add(ai);
            if (resultPointCallback != null)
            {
                resultPointCallback.foundPossibleResultPoint(ai);
            }
        }
        flag1 = true;
_L2:
        return flag1;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
