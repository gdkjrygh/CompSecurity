// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned.rss.expanded:
//            ExpandedPair, ExpandedRow, BitArrayBuilder

public final class RSSExpandedReader extends AbstractRSSReader
{

    private static final int EVEN_TOTAL_SUBSET[] = {
        4, 20, 52, 104, 204
    };
    private static final int FINDER_PATTERNS[][];
    private static final int FINDER_PATTERN_SEQUENCES[][];
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int GSUM[] = {
        0, 348, 1388, 2948, 3988
    };
    private static final int MAX_PAIRS = 11;
    private static final int SYMBOL_WIDEST[] = {
        7, 5, 4, 3, 1
    };
    private static final int WEIGHTS[][];
    private final List pairs = new ArrayList(11);
    private final List rows = new ArrayList();
    private final int startEnd[] = new int[2];
    private boolean startFromEven;

    public RSSExpandedReader()
    {
        startFromEven = false;
    }

    private void adjustOddEvenCounts(int i)
        throws NotFoundException
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        int j;
        int k;
        int l;
        flag3 = false;
        j = count(getOddCounts());
        k = count(getEvenCounts());
        l = (j + k) - i;
        if ((j & 1) == 1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if ((k & 1) == 0)
        {
            flag3 = true;
        }
        i = 0;
        flag1 = false;
        if (j <= 13) goto _L2; else goto _L1
_L1:
        flag = true;
_L6:
        flag2 = false;
        boolean flag5 = false;
        if (k > 13)
        {
            flag1 = true;
        } else
        {
            flag1 = flag5;
            if (k < 4)
            {
                flag2 = true;
                flag1 = flag5;
            }
        }
        if (l == 1)
        {
            if (flag4)
            {
                if (flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag = true;
            } else
            {
                if (!flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag1 = true;
            }
        } else
        if (l == -1)
        {
            if (flag4)
            {
                if (flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                i = 1;
            } else
            {
                if (!flag3)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                flag2 = true;
            }
        } else
        if (l == 0)
        {
            if (!flag4)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!flag3)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            if (j < k)
            {
                i = 1;
                flag1 = true;
            } else
            {
                flag = true;
                flag2 = true;
            }
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
          goto _L3
_L2:
        flag = flag1;
        if (j < 4)
        {
            i = 1;
            flag = flag1;
        }
        continue; /* Loop/switch isn't completed */
        if (!flag3) goto _L3; else goto _L4
_L4:
        throw NotFoundException.getNotFoundInstance();
_L3:
        if (i != 0)
        {
            if (flag)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            increment(getOddCounts(), getOddRoundingErrors());
        }
        if (flag)
        {
            decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (flag2)
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
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean checkChecksum()
    {
        Object obj = (ExpandedPair)pairs.get(0);
        DataCharacter datacharacter = ((ExpandedPair) (obj)).getLeftChar();
        obj = ((ExpandedPair) (obj)).getRightChar();
        if (obj != null)
        {
            int j = ((DataCharacter) (obj)).getChecksumPortion();
            int i = 2;
            for (int k = 1; k < pairs.size(); k++)
            {
                Object obj1 = (ExpandedPair)pairs.get(k);
                int l = j + ((ExpandedPair) (obj1)).getLeftChar().getChecksumPortion();
                int i1 = i + 1;
                obj1 = ((ExpandedPair) (obj1)).getRightChar();
                j = l;
                i = i1;
                if (obj1 != null)
                {
                    j = l + ((DataCharacter) (obj1)).getChecksumPortion();
                    i = i1 + 1;
                }
            }

            if ((i - 4) * 211 + j % 211 == datacharacter.getValue())
            {
                return true;
            }
        }
        return false;
    }

    private List checkRows(List list, int i)
        throws NotFoundException
    {
_L5:
        if (i >= rows.size()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (ExpandedRow)rows.get(i);
        pairs.clear();
        int k = list.size();
        for (int j = 0; j < k; j++)
        {
            pairs.addAll(((ExpandedRow)list.get(j)).getPairs());
        }

        pairs.addAll(((ExpandedRow) (obj)).getPairs());
        if (isValidSequence(pairs)) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        ArrayList arraylist;
        if (checkChecksum())
        {
            return pairs;
        }
        arraylist = new ArrayList();
        arraylist.addAll(list);
        arraylist.add(obj);
        obj = checkRows(((List) (arraylist)), i + 1);
        return ((List) (obj));
_L2:
        throw NotFoundException.getNotFoundInstance();
        NotFoundException notfoundexception;
        notfoundexception;
          goto _L3
    }

    private List checkRows(boolean flag)
    {
        if (rows.size() <= 25) goto _L2; else goto _L1
_L1:
        List list1;
        rows.clear();
        list1 = null;
_L4:
        return list1;
_L2:
        List list;
        pairs.clear();
        if (flag)
        {
            Collections.reverse(rows);
        }
        list = null;
        list1 = checkRows(((List) (new ArrayList())), 0);
        list = list1;
_L5:
        list1 = list;
        if (flag)
        {
            Collections.reverse(rows);
            return list;
        }
        if (true) goto _L4; else goto _L3
_L3:
        NotFoundException notfoundexception;
        notfoundexception;
          goto _L5
    }

    static Result constructResult(List list)
        throws NotFoundException, FormatException
    {
        String s = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint aresultpoint[] = ((ExpandedPair)list.get(0)).getFinderPattern().getResultPoints();
        ResultPoint aresultpoint1[] = ((ExpandedPair)list.get(list.size() - 1)).getFinderPattern().getResultPoints();
        list = aresultpoint[0];
        ResultPoint resultpoint = aresultpoint[1];
        ResultPoint resultpoint1 = aresultpoint1[0];
        ResultPoint resultpoint2 = aresultpoint1[1];
        BarcodeFormat barcodeformat = BarcodeFormat.RSS_EXPANDED;
        return new Result(s, null, new ResultPoint[] {
            list, resultpoint, resultpoint1, resultpoint2
        }, barcodeformat);
    }

    private void findNextPair(BitArray bitarray, List list, int i)
        throws NotFoundException
    {
        int ai[] = getDecodeFinderCounters();
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int i1 = bitarray.getSize();
        int j;
        boolean flag;
        if (i < 0)
        {
            if (list.isEmpty())
            {
                i = 0;
            } else
            {
                i = ((ExpandedPair)list.get(list.size() - 1)).getFinderPattern().getStartEnd()[1];
            }
        }
        if (list.size() % 2 != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag = j;
        if (startFromEven)
        {
            if (j == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        j = 0;
        do
        {
label0:
            {
label1:
                {
                    boolean flag1;
                    int l;
                    if (i < i1)
                    {
                        int k;
                        boolean flag2;
                        if (!bitarray.get(i))
                        {
                            j = 1;
                        } else
                        {
                            j = 0;
                        }
                        if (j != 0)
                        {
                            break label1;
                        }
                    }
                    flag2 = false;
                    k = i;
                    l = i;
                    i = k;
                    flag1 = j;
                    j = ((flag2) ? 1 : 0);
                    while (l < i1) 
                    {
                        if (bitarray.get(l) ^ flag1)
                        {
                            ai[j] = ai[j] + 1;
                        } else
                        {
                            if (j == 3)
                            {
                                if (flag)
                                {
                                    reverseCounters(ai);
                                }
                                if (isFinderPattern(ai))
                                {
                                    startEnd[0] = i;
                                    startEnd[1] = l;
                                    return;
                                }
                                if (flag)
                                {
                                    reverseCounters(ai);
                                }
                                i += ai[0] + ai[1];
                                ai[0] = ai[2];
                                ai[1] = ai[3];
                                ai[2] = 0;
                                ai[3] = 0;
                                j--;
                            } else
                            {
                                j++;
                            }
                            ai[j] = 1;
                            if (!flag1)
                            {
                                flag1 = true;
                            } else
                            {
                                flag1 = false;
                            }
                        }
                        l++;
                    }
                    break label0;
                }
                i++;
                continue;
            }
            throw NotFoundException.getNotFoundInstance();
        } while (true);
    }

    private static int getNextSecondBar(BitArray bitarray, int i)
    {
        if (bitarray.get(i))
        {
            return bitarray.getNextSet(bitarray.getNextUnset(i));
        } else
        {
            return bitarray.getNextUnset(bitarray.getNextSet(i));
        }
    }

    private static boolean isNotA1left(FinderPattern finderpattern, boolean flag, boolean flag1)
    {
        return finderpattern.getValue() != 0 || !flag || !flag1;
    }

    private static boolean isPartialRow(Iterable iterable, Iterable iterable1)
    {
label0:
        {
            iterable1 = iterable1.iterator();
            boolean flag;
label1:
            do
            {
                if (!iterable1.hasNext())
                {
                    break label0;
                }
                ExpandedRow expandedrow = (ExpandedRow)iterable1.next();
                boolean flag1 = true;
                Iterator iterator = iterable.iterator();
label2:
                do
                {
                    flag = flag1;
                    if (!iterator.hasNext())
                    {
                        continue label1;
                    }
                    ExpandedPair expandedpair = (ExpandedPair)iterator.next();
                    boolean flag2 = false;
                    Iterator iterator1 = expandedrow.getPairs().iterator();
                    do
                    {
                        flag = flag2;
                        if (!iterator1.hasNext())
                        {
                            continue label2;
                        }
                    } while (!expandedpair.equals((ExpandedPair)iterator1.next()));
                    flag = true;
                } while (flag);
                flag = false;
            } while (!flag);
            return true;
        }
        return false;
    }

    private static boolean isValidSequence(List list)
    {
        int ai[][];
        int i;
        int k;
        ai = FINDER_PATTERN_SEQUENCES;
        k = ai.length;
        i = 0;
_L2:
        int ai1[];
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        ai1 = ai[i];
        if (list.size() <= ai1.length)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        int j;
        boolean flag1;
        flag1 = true;
        j = 0;
_L5:
        boolean flag;
        flag = flag1;
        if (j >= list.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ExpandedPair)list.get(j)).getFinderPattern().getValue() == ai1[j])
        {
            break MISSING_BLOCK_LABEL_93;
        }
        flag = false;
        if (!flag) goto _L4; else goto _L3
_L3:
        return true;
        j++;
          goto _L5
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitarray, int i, boolean flag)
    {
        int j;
        int k;
        int l;
        if (flag)
        {
            for (j = startEnd[0] - 1; j >= 0 && !bitarray.get(j); j--) { }
            j++;
            l = startEnd[0] - j;
            k = startEnd[1];
        } else
        {
            j = startEnd[0];
            k = bitarray.getNextUnset(startEnd[1] + 1);
            l = k - startEnd[1];
        }
        bitarray = getDecodeFinderCounters();
        System.arraycopy(bitarray, 0, bitarray, 1, bitarray.length - 1);
        bitarray[0] = l;
        try
        {
            l = parseFinderValue(bitarray, FINDER_PATTERNS);
        }
        // Misplaced declaration of an exception variable
        catch (BitArray bitarray)
        {
            return null;
        }
        return new FinderPattern(l, new int[] {
            j, k
        }, j, k, i);
    }

    private static void removePartialRows(List list, List list1)
    {
        list1 = list1.iterator();
label0:
        do
        {
            boolean flag;
label1:
            {
                if (!list1.hasNext())
                {
                    break label0;
                }
                Object obj = (ExpandedRow)list1.next();
                if (((ExpandedRow) (obj)).getPairs().size() == list.size())
                {
                    continue;
                }
                boolean flag1 = true;
                obj = ((ExpandedRow) (obj)).getPairs().iterator();
label2:
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break label1;
                    }
                    ExpandedPair expandedpair = (ExpandedPair)((Iterator) (obj)).next();
                    boolean flag2 = false;
                    Iterator iterator = list.iterator();
                    do
                    {
                        flag = flag2;
                        if (!iterator.hasNext())
                        {
                            continue label2;
                        }
                    } while (!expandedpair.equals((ExpandedPair)iterator.next()));
                    flag = true;
                } while (flag);
                flag = false;
            }
            if (flag)
            {
                list1.remove();
            }
        } while (true);
    }

    private static void reverseCounters(int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j / 2; i++)
        {
            int k = ai[i];
            ai[i] = ai[j - i - 1];
            ai[j - i - 1] = k;
        }

    }

    private void storeRow(int i, boolean flag)
    {
        int j;
        boolean flag1;
        boolean flag3;
        j = 0;
        flag1 = false;
        flag3 = false;
_L2:
        ExpandedRow expandedrow;
        boolean flag2;
label0:
        {
            flag2 = flag3;
            if (j < rows.size())
            {
                expandedrow = (ExpandedRow)rows.get(j);
                if (expandedrow.getRowNumber() <= i)
                {
                    break label0;
                }
                flag2 = expandedrow.isEquivalent(pairs);
            }
        }
        break MISSING_BLOCK_LABEL_60;
_L1:
        flag1 = expandedrow.isEquivalent(pairs);
        j++;
        continue; /* Loop/switch isn't completed */
        if (flag2 || flag1 || isPartialRow(pairs, rows))
        {
            return;
        }
        rows.add(j, new ExpandedRow(pairs, i, flag));
        removePartialRows(pairs, rows);
        return;
        if (true) goto _L2; else goto _L1
    }

    DataCharacter decodeDataCharacter(BitArray bitarray, FinderPattern finderpattern, boolean flag, boolean flag1)
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
        float f1;
        if (flag1)
        {
            recordPatternInReverse(bitarray, finderpattern.getStartEnd()[0], ai);
        } else
        {
            recordPattern(bitarray, finderpattern.getStartEnd()[1], ai);
            int l = 0;
            int i = ai.length - 1;
            while (l < i) 
            {
                int j1 = ai[l];
                ai[l] = ai[i];
                ai[i] = j1;
                l++;
                i--;
            }
        }
        f = (float)count(ai) / (float)17;
        f1 = (float)(finderpattern.getStartEnd()[1] - finderpattern.getStartEnd()[0]) / 15F;
        if (Math.abs(f - f1) / f1 > 0.3F)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        bitarray = getOddCounts();
        int ai1[] = getEvenCounts();
        float af[] = getOddRoundingErrors();
        float af1[] = getEvenRoundingErrors();
        int i1 = 0;
        while (i1 < ai.length) 
        {
            float f2 = (1.0F * (float)ai[i1]) / f;
            int k1 = (int)(0.5F + f2);
            int j;
            if (k1 < 1)
            {
                if (f2 < 0.3F)
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                j = 1;
            } else
            {
                j = k1;
                if (k1 > 8)
                {
                    if (f2 > 8.7F)
                    {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    j = 8;
                }
            }
            k1 = i1 >> 1;
            if ((i1 & 1) == 0)
            {
                bitarray[k1] = j;
                af[k1] = f2 - (float)j;
            } else
            {
                ai1[k1] = j;
                af1[k1] = f2 - (float)j;
            }
            i1++;
        }
        adjustOddEvenCounts(17);
        int l1 = finderpattern.getValue();
        int k;
        int j3;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 2;
        }
        if (flag1)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        j3 = (i1 + (l1 * 4 + k)) - 1;
        i1 = 0;
        k = 0;
        for (l1 = bitarray.length - 1; l1 >= 0;)
        {
            int i2 = k;
            if (isNotA1left(finderpattern, flag, flag1))
            {
                i2 = WEIGHTS[j3][l1 * 2];
                i2 = k + bitarray[l1] * i2;
            }
            i1 += bitarray[l1];
            l1--;
            k = i2;
        }

        l1 = 0;
        for (int j2 = ai1.length - 1; j2 >= 0;)
        {
            int l2 = l1;
            if (isNotA1left(finderpattern, flag, flag1))
            {
                l2 = WEIGHTS[j3][j2 * 2 + 1];
                l2 = l1 + ai1[j2] * l2;
            }
            j2--;
            l1 = l2;
        }

        if ((i1 & 1) != 0 || i1 > 13 || i1 < 4)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            i1 = (13 - i1) / 2;
            int i3 = SYMBOL_WIDEST[i1];
            int k2 = RSSUtils.getRSSvalue(bitarray, i3, true);
            i3 = RSSUtils.getRSSvalue(ai1, 9 - i3, false);
            return new DataCharacter(k2 * EVEN_TOTAL_SUBSET[i1] + i3 + GSUM[i1], k + l1);
        }
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, FormatException
    {
        pairs.clear();
        startFromEven = false;
        try
        {
            map = constructResult(decodeRow2pairs(i, bitarray));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            pairs.clear();
            startFromEven = true;
            return constructResult(decodeRow2pairs(i, bitarray));
        }
        return map;
    }

    List decodeRow2pairs(int i, BitArray bitarray)
        throws NotFoundException
    {
        try
        {
            do
            {
                ExpandedPair expandedpair = retrieveNextPair(bitarray, pairs, i);
                pairs.add(expandedpair);
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (BitArray bitarray) { }
        if (pairs.isEmpty())
        {
            throw bitarray;
        }
        if (!checkChecksum()) goto _L2; else goto _L1
_L1:
        bitarray = pairs;
_L4:
        return bitarray;
_L2:
        List list;
        boolean flag;
        if (!rows.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        storeRow(i, false);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        list = checkRows(false);
        bitarray = list;
        if (list != null) goto _L4; else goto _L3
_L3:
        list = checkRows(true);
        bitarray = list;
        if (list != null) goto _L4; else goto _L5
_L5:
        throw NotFoundException.getNotFoundInstance();
    }

    List getRows()
    {
        return rows;
    }

    public void reset()
    {
        pairs.clear();
        rows.clear();
    }

    ExpandedPair retrieveNextPair(BitArray bitarray, List list, int i)
        throws NotFoundException
    {
        FinderPattern finderpattern;
        DataCharacter datacharacter;
        boolean flag;
        int j;
        boolean flag2;
        boolean flag3;
        if (list.size() % 2 == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag3 = flag2;
        if (startFromEven)
        {
            if (!flag2)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
        }
        flag = true;
        j = -1;
        do
        {
            findNextPair(bitarray, list, j);
            finderpattern = parseFoundFinderPattern(bitarray, i, flag3);
            boolean flag1;
            if (finderpattern == null)
            {
                j = getNextSecondBar(bitarray, startEnd[0]);
                flag1 = flag;
            } else
            {
                flag1 = false;
            }
            flag = flag1;
        } while (flag1);
        datacharacter = decodeDataCharacter(bitarray, finderpattern, flag3, true);
        if (!list.isEmpty() && ((ExpandedPair)list.get(list.size() - 1)).mustBeLast())
        {
            throw NotFoundException.getNotFoundInstance();
        }
        try
        {
            bitarray = decodeDataCharacter(bitarray, finderpattern, flag3, false);
        }
        // Misplaced declaration of an exception variable
        catch (BitArray bitarray)
        {
            bitarray = null;
        }
        return new ExpandedPair(datacharacter, bitarray, finderpattern, true);
    }

    static 
    {
        int ai[] = {
            1, 8, 4, 1
        };
        int ai1[] = {
            3, 6, 4, 1
        };
        int ai2[] = {
            3, 4, 6, 1
        };
        int ai3[] = {
            2, 6, 5, 1
        };
        int ai4[] = {
            2, 2, 9, 1
        };
        FINDER_PATTERNS = (new int[][] {
            ai, ai1, ai2, new int[] {
                3, 2, 8, 1
            }, ai3, ai4
        });
        ai = (new int[] {
            62, 186, 136, 197, 169, 85, 44, 132
        });
        ai1 = (new int[] {
            70, 210, 208, 202, 184, 130, 179, 115
        });
        ai2 = (new int[] {
            134, 191, 151, 31, 93, 68, 204, 190
        });
        ai3 = (new int[] {
            6, 18, 54, 162, 64, 192, 154, 40
        });
        ai4 = (new int[] {
            120, 149, 25, 75, 14, 42, 126, 167
        });
        int ai5[] = {
            103, 98, 83, 38, 114, 131, 182, 124
        };
        WEIGHTS = (new int[][] {
            new int[] {
                1, 3, 9, 27, 81, 32, 96, 77
            }, new int[] {
                20, 60, 180, 118, 143, 7, 21, 63
            }, new int[] {
                189, 145, 13, 39, 117, 140, 209, 205
            }, new int[] {
                193, 157, 49, 147, 19, 57, 171, 91
            }, ai, new int[] {
                185, 133, 188, 142, 4, 12, 36, 108
            }, new int[] {
                113, 128, 173, 97, 80, 29, 87, 50
            }, new int[] {
                150, 28, 84, 41, 123, 158, 52, 156
            }, new int[] {
                46, 138, 203, 187, 139, 206, 196, 166
            }, new int[] {
                76, 17, 51, 153, 37, 111, 122, 155
            }, new int[] {
                43, 129, 176, 106, 107, 110, 119, 146
            }, new int[] {
                16, 48, 144, 10, 30, 90, 59, 177
            }, new int[] {
                109, 116, 137, 200, 178, 112, 125, 164
            }, ai1, ai2, new int[] {
                148, 22, 66, 198, 172, 94, 71, 2
            }, ai3, ai4, new int[] {
                79, 26, 78, 23, 69, 207, 199, 175
            }, ai5, new int[] {
                161, 61, 183, 127, 170, 88, 53, 159
            }, new int[] {
                55, 165, 73, 8, 24, 72, 5, 15
            }, new int[] {
                45, 135, 194, 160, 58, 174, 100, 89
            }
        });
        ai = (new int[] {
            0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 
            5
        });
        FINDER_PATTERN_SEQUENCES = (new int[][] {
            new int[] {
                0, 0
            }, new int[] {
                0, 1, 1
            }, new int[] {
                0, 2, 1, 3
            }, new int[] {
                0, 4, 1, 3, 2
            }, new int[] {
                0, 4, 1, 3, 3, 5
            }, new int[] {
                0, 4, 1, 3, 4, 5, 5
            }, new int[] {
                0, 0, 1, 1, 2, 2, 3, 3
            }, new int[] {
                0, 0, 1, 1, 2, 2, 3, 4, 4
            }, new int[] {
                0, 0, 1, 1, 2, 2, 3, 4, 5, 5
            }, ai
        });
    }
}
