// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned.rss:
//            AbstractRSSReader, Pair, FinderPattern, RSSUtils, 
//            DataCharacter

public final class RSS14Reader extends AbstractRSSReader
{

    private static final int FINDER_PATTERNS[][];
    private static final int INSIDE_GSUM[] = {
        0, 336, 1036, 1516
    };
    private static final int INSIDE_ODD_TOTAL_SUBSET[] = {
        4, 20, 48, 81
    };
    private static final int INSIDE_ODD_WIDEST[] = {
        2, 4, 6, 8
    };
    private static final int OUTSIDE_EVEN_TOTAL_SUBSET[] = {
        1, 10, 34, 70, 126
    };
    private static final int OUTSIDE_GSUM[] = {
        0, 161, 961, 2015, 2715
    };
    private static final int OUTSIDE_ODD_WIDEST[] = {
        8, 6, 4, 3, 1
    };
    private final List possibleLeftPairs = new ArrayList();
    private final List possibleRightPairs = new ArrayList();

    public RSS14Reader()
    {
    }

    private static void addOrTally(Collection collection, Pair pair)
    {
        if (pair != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        Iterator iterator = collection.iterator();
        Pair pair1;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            pair1 = (Pair)iterator.next();
        } while (pair1.getValue() != pair.getValue());
        pair1.incrementCount();
        flag = true;
_L4:
        if (!flag)
        {
            collection.add(pair);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void adjustOddEvenCounts(boolean flag, int i)
        throws NotFoundException
    {
        int j;
        int k;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int j1;
        int k1;
        int l1;
        flag1 = false;
        flag4 = true;
        j1 = count(getOddCounts());
        k1 = count(getEvenCounts());
        l1 = (j1 + k1) - i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if ((j1 & 1) == i)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if ((k1 & 1) == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        if (j1 > 12)
        {
            k = 1;
            j = 0;
        } else
        if (j1 < 4)
        {
            k = 0;
            j = 1;
        } else
        {
            k = 0;
            j = 0;
        }
        if (k1 <= 12) goto _L4; else goto _L3
_L3:
        i = 0;
        flag1 = true;
_L7:
        if (l1 == 1)
        {
            if (flag2)
            {
                if (flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                k = i;
                i = 1;
                do
                {
                    if (j != 0)
                    {
                        if (i != 0)
                        {
                            throw NotFoundException.getNotFoundInstance();
                        }
                        increment(getOddCounts(), getOddRoundingErrors());
                    }
                    if (i != 0)
                    {
                        decrement(getOddCounts(), getOddRoundingErrors());
                    }
                    if (k != 0)
                    {
                        if (flag1)
                        {
                            throw NotFoundException.getNotFoundInstance();
                        }
                        increment(getEvenCounts(), getOddRoundingErrors());
                    }
                    if (flag1)
                    {
                        decrement(getEvenCounts(), getEvenRoundingErrors());
                    }
                    return;
                } while (true);
            } else
            {
                if (!flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag1 = true;
                l = k;
                k = i;
                i = l;
                continue;
            }
        } else
        {
            if (l1 == -1)
            {
                if (flag2)
                {
                    if (flag3)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    j = k;
                    l = 1;
                    k = i;
                    i = j;
                    j = l;
                } else
                {
                    if (!flag3)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    i = k;
                    k = ((flag4) ? 1 : 0);
                }
                continue;
            }
            if (l1 == 0)
            {
                if (flag2)
                {
                    if (!flag3)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (j1 < k1)
                    {
                        flag1 = true;
                        j = k;
                        l = 1;
                        k = i;
                        i = j;
                        j = l;
                    } else
                    {
                        i = 1;
                        k = ((flag4) ? 1 : 0);
                    }
                    continue;
                }
                if (flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else
            {
                throw NotFoundException.getNotFoundInstance();
            }
            l = k;
            k = i;
            i = l;
            continue;
        }
_L4:
        i1 = k;
        l = j;
        if (k1 < 4)
        {
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
          goto _L5
_L2:
        if (j1 > 11)
        {
            k = 1;
            j = 0;
        } else
        if (j1 < 5)
        {
            k = 0;
            j = 1;
        } else
        {
            k = 0;
            j = 0;
        }
        if (k1 > 10)
        {
            i = 0;
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
        i1 = k;
        l = j;
        if (k1 < 4)
        {
            i = 1;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        i = 0;
        k = i1;
        j = l;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean checkChecksum(Pair pair, Pair pair1)
    {
        int k = pair.getChecksumPortion();
        int l = pair1.getChecksumPortion();
        int j = pair.getFinderPattern().getValue() * 9 + pair1.getFinderPattern().getValue();
        int i = j;
        if (j > 72)
        {
            i = j - 1;
        }
        j = i;
        if (i > 8)
        {
            j = i - 1;
        }
        return (k + l * 16) % 79 == j;
    }

    private static Result constructResult(Pair pair, Pair pair1)
    {
        Object obj = String.valueOf(0x453af5L * (long)pair.getValue() + (long)pair1.getValue());
        Object obj1 = new StringBuilder(14);
        for (int i = 13 - ((String) (obj)).length(); i > 0; i--)
        {
            ((StringBuilder) (obj1)).append('0');
        }

        ((StringBuilder) (obj1)).append(((String) (obj)));
        int j = 0;
        int k = 0;
        for (; j < 13; j++)
        {
            int i1 = ((StringBuilder) (obj1)).charAt(j) - 48;
            int l = i1;
            if ((j & 1) == 0)
            {
                l = i1 * 3;
            }
            k += l;
        }

        k = 10 - k % 10;
        j = k;
        if (k == 10)
        {
            j = 0;
        }
        ((StringBuilder) (obj1)).append(j);
        ResultPoint aresultpoint1[] = pair.getFinderPattern().getResultPoints();
        ResultPoint aresultpoint[] = pair1.getFinderPattern().getResultPoints();
        pair = String.valueOf(((StringBuilder) (obj1)).toString());
        pair1 = aresultpoint1[0];
        obj1 = aresultpoint1[1];
        ResultPoint resultpoint = aresultpoint[0];
        aresultpoint = aresultpoint[1];
        BarcodeFormat barcodeformat = BarcodeFormat.RSS_14;
        return new Result(pair, null, new ResultPoint[] {
            pair1, obj1, resultpoint, aresultpoint
        }, barcodeformat);
    }

    private DataCharacter decodeDataCharacter(BitArray bitarray, FinderPattern finderpattern, boolean flag)
        throws NotFoundException
    {
        int ai[] = getDataCharacterCounters();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        ai[4] = 0;
        ai[5] = 0;
        ai[6] = 0;
        ai[7] = 0;
        float f;
        float af[];
        float af1[];
        int l;
        int i1;
        if (flag)
        {
            recordPatternInReverse(bitarray, finderpattern.getStartEnd()[0], ai);
        } else
        {
            recordPattern(bitarray, finderpattern.getStartEnd()[1] + 1, ai);
            l = 0;
            i = ai.length - 1;
            while (l < i) 
            {
                i1 = ai[l];
                ai[l] = ai[i];
                ai[i] = i1;
                l++;
                i--;
            }
        }
        if (flag)
        {
            l = 16;
        } else
        {
            l = 15;
        }
        f = (float)count(ai) / (float)l;
        bitarray = getOddCounts();
        finderpattern = getEvenCounts();
        af = getOddRoundingErrors();
        af1 = getEvenRoundingErrors();
        i1 = 0;
        while (i1 < ai.length) 
        {
            float f1 = (float)ai[i1] / f;
            int j1 = (int)(0.5F + f1);
            int i;
            if (j1 < 1)
            {
                i = 1;
            } else
            {
                i = j1;
                if (j1 > 8)
                {
                    i = 8;
                }
            }
            j1 = i1 >> 1;
            if ((i1 & 1) == 0)
            {
                bitarray[j1] = i;
                af[j1] = f1 - (float)i;
            } else
            {
                finderpattern[j1] = i;
                af1[j1] = f1 - (float)i;
            }
            i1++;
        }
        adjustOddEvenCounts(flag, l);
        i1 = bitarray.length - 1;
        l = 0;
        int j;
        int k1;
        for (j = 0; i1 >= 0; j = k1 + j)
        {
            int j2 = bitarray[i1];
            k1 = bitarray[i1];
            i1--;
            l = l * 9 + j2;
        }

        int k2 = 0;
        i1 = 0;
        for (int l1 = finderpattern.length - 1; l1 >= 0; l1--)
        {
            k2 = k2 * 9 + finderpattern[l1];
            i1 += finderpattern[l1];
        }

        l += k2 * 3;
        if (flag)
        {
            if ((j & 1) != 0 || j > 12 || j < 4)
            {
                throw NotFoundException.getNotFoundInstance();
            } else
            {
                j = (12 - j) / 2;
                int i2 = OUTSIDE_ODD_WIDEST[j];
                i1 = RSSUtils.getRSSvalue(bitarray, i2, false);
                i2 = RSSUtils.getRSSvalue(finderpattern, 9 - i2, true);
                return new DataCharacter(i1 * OUTSIDE_EVEN_TOTAL_SUBSET[j] + i2 + OUTSIDE_GSUM[j], l);
            }
        }
        if ((i1 & 1) != 0 || i1 > 10 || i1 < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            int k = (10 - i1) / 2;
            i1 = INSIDE_ODD_WIDEST[k];
            return new DataCharacter(RSSUtils.getRSSvalue(bitarray, i1, true) + RSSUtils.getRSSvalue(finderpattern, 9 - i1, false) * INSIDE_ODD_TOTAL_SUBSET[k] + INSIDE_GSUM[k], l);
        }
    }

    private Pair decodePair(BitArray bitarray, boolean flag, int i, Map map)
    {
        FinderPattern finderpattern;
        int ai[];
        try
        {
            ai = findFinderPattern(bitarray, 0, flag);
            finderpattern = parseFoundFinderPattern(bitarray, i, flag, ai);
        }
        // Misplaced declaration of an exception variable
        catch (BitArray bitarray)
        {
            return null;
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        float f;
        float f1;
        for (map = null; map == null; map = (ResultPointCallback)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
        {
            break MISSING_BLOCK_LABEL_85;
        }

        f1 = (float)(ai[0] + ai[1]) / 2.0F;
        f = f1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        f = (float)(bitarray.getSize() - 1) - f1;
        map.foundPossibleResultPoint(new ResultPoint(f, i));
        map = decodeDataCharacter(bitarray, finderpattern, true);
        bitarray = decodeDataCharacter(bitarray, finderpattern, false);
        return new Pair(map.getValue() * 1597 + bitarray.getValue(), map.getChecksumPortion() + bitarray.getChecksumPortion() * 4, finderpattern);
    }

    private int[] findFinderPattern(BitArray bitarray, int i, boolean flag)
        throws NotFoundException
    {
        int ai[] = getDecodeFinderCounters();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int i1 = bitarray.getSize();
        boolean flag1 = false;
        do
        {
label0:
            {
label1:
                {
                    int j;
                    int k;
                    if (i < i1)
                    {
                        if (!bitarray.get(i))
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag != flag1)
                        {
                            break label1;
                        }
                    }
                    k = i;
                    j = 0;
                    flag = flag1;
                    while (k < i1) 
                    {
                        int l;
                        if (bitarray.get(k) ^ flag)
                        {
                            ai[j] = ai[j] + 1;
                            l = j;
                            j = i;
                        } else
                        {
                            if (j == 3)
                            {
                                if (isFinderPattern(ai))
                                {
                                    return (new int[] {
                                        i, k
                                    });
                                }
                                l = i + (ai[0] + ai[1]);
                                ai[0] = ai[2];
                                ai[1] = ai[3];
                                ai[2] = 0;
                                ai[3] = 0;
                                i = j - 1;
                                j = l;
                            } else
                            {
                                l = j + 1;
                                j = i;
                                i = l;
                            }
                            ai[i] = 1;
                            if (!flag)
                            {
                                flag = true;
                                l = i;
                            } else
                            {
                                flag = false;
                                l = i;
                            }
                        }
                        k++;
                        i = j;
                        j = l;
                    }
                    break label0;
                }
                i++;
                continue;
            }
            throw NotFoundException.getNotFoundInstance();
        } while (true);
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitarray, int i, boolean flag, int ai[])
        throws NotFoundException
    {
        boolean flag1 = bitarray.get(ai[0]);
        int j;
        for (j = ai[0] - 1; j >= 0 && bitarray.get(j) ^ flag1; j--) { }
        int l = j + 1;
        j = ai[0];
        int ai1[] = getDecodeFinderCounters();
        System.arraycopy(ai1, 0, ai1, 1, ai1.length - 1);
        ai1[0] = j - l;
        int i1 = parseFinderValue(ai1, FINDER_PATTERNS);
        int k = ai[1];
        if (flag)
        {
            j = bitarray.getSize() - 1 - l;
            k = bitarray.getSize() - 1 - k;
        } else
        {
            j = l;
        }
        return new FinderPattern(i1, new int[] {
            l, ai[1]
        }, j, k, i);
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException
    {
        Pair pair = decodePair(bitarray, false, i, map);
        addOrTally(possibleLeftPairs, pair);
        bitarray.reverse();
        map = decodePair(bitarray, true, i, map);
        addOrTally(possibleRightPairs, map);
        bitarray.reverse();
        int k = possibleLeftPairs.size();
label0:
        for (i = 0; i < k; i++)
        {
            bitarray = (Pair)possibleLeftPairs.get(i);
            if (bitarray.getCount() <= 1)
            {
                continue;
            }
            int l = possibleRightPairs.size();
            int j = 0;
            do
            {
                if (j >= l)
                {
                    continue label0;
                }
                map = (Pair)possibleRightPairs.get(j);
                if (map.getCount() > 1 && checkChecksum(bitarray, map))
                {
                    return constructResult(bitarray, map);
                }
                j++;
            } while (true);
        }

        throw NotFoundException.getNotFoundInstance();
    }

    public void reset()
    {
        possibleLeftPairs.clear();
        possibleRightPairs.clear();
    }

    static 
    {
        int ai[] = {
            1, 5, 7, 1
        };
        FINDER_PATTERNS = (new int[][] {
            new int[] {
                3, 8, 2, 1
            }, new int[] {
                3, 5, 5, 1
            }, new int[] {
                3, 3, 7, 1
            }, new int[] {
                3, 1, 9, 1
            }, new int[] {
                2, 7, 4, 1
            }, new int[] {
                2, 5, 6, 1
            }, new int[] {
                2, 3, 8, 1
            }, ai, new int[] {
                1, 3, 9, 1
            }
        });
    }
}
