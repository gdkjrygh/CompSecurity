// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader

public final class ITFReader extends OneDReader
{

    private static final int DEFAULT_ALLOWED_LENGTHS[] = {
        48, 44, 24, 20, 18, 16, 14, 12, 10, 8, 
        6
    };
    private static final int END_PATTERN_REVERSED[] = {
        1, 1, 3
    };
    private static final int MAX_AVG_VARIANCE = 107;
    private static final int MAX_INDIVIDUAL_VARIANCE = 199;
    private static final int N = 1;
    static final int PATTERNS[][];
    private static final int START_PATTERN[] = {
        1, 1, 1, 1
    };
    private static final int W = 3;
    private int narrowLineWidth;

    public ITFReader()
    {
        narrowLineWidth = -1;
    }

    private static int decodeDigit(int ai[])
        throws NotFoundException
    {
        int j = 107;
        int k = -1;
        int i1 = PATTERNS.length;
        for (int i = 0; i < i1; i++)
        {
            int l = patternMatchVariance(ai, PATTERNS[i], 199);
            if (l < j)
            {
                k = i;
                j = l;
            }
        }

        if (k >= 0)
        {
            return k;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private static void decodeMiddle(BitArray bitarray, int i, int j, StringBuilder stringbuilder)
        throws NotFoundException
    {
        int ai[] = new int[10];
        int ai1[] = new int[5];
        int ai2[] = new int[5];
        while (i < j) 
        {
            recordPattern(bitarray, i, ai);
            for (int k = 0; k < 5; k++)
            {
                int i1 = k << 1;
                ai1[k] = ai[i1];
                ai2[k] = ai[i1 + 1];
            }

            stringbuilder.append((char)(decodeDigit(ai1) + 48));
            stringbuilder.append((char)(decodeDigit(ai2) + 48));
            int j1 = ai.length;
            int l = 0;
            while (l < j1) 
            {
                i += ai[l];
                l++;
            }
        }
    }

    private static int[] findGuardPattern(BitArray bitarray, int i, int ai[])
        throws NotFoundException
    {
        int k1 = ai.length;
        int ai1[] = new int[k1];
        int l1 = bitarray.getSize();
        int j = i;
        int j1 = 0;
        int i1 = 0;
        int l = i;
        i = j;
        while (l < l1) 
        {
            int k;
            if ((bitarray.get(l) ^ i1) != 0)
            {
                ai1[j1] = ai1[j1] + 1;
                k = i1;
                i1 = i;
            } else
            {
                if (j1 == k1 - 1)
                {
                    if (patternMatchVariance(ai1, ai, 199) < 107)
                    {
                        return (new int[] {
                            i, l
                        });
                    }
                    k = i + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, k1 - 2);
                    ai1[k1 - 2] = 0;
                    ai1[k1 - 1] = 0;
                    i = j1 - 1;
                } else
                {
                    j1++;
                    k = i;
                    i = j1;
                }
                ai1[i] = 1;
                if (i1 == 0)
                {
                    boolean flag = true;
                    i1 = k;
                    j1 = i;
                    k = ((flag) ? 1 : 0);
                } else
                {
                    boolean flag1 = false;
                    i1 = k;
                    j1 = i;
                    k = ((flag1) ? 1 : 0);
                }
            }
            l++;
            i = i1;
            i1 = k;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int skipWhiteSpace(BitArray bitarray)
        throws NotFoundException
    {
        int i = bitarray.getSize();
        int j = bitarray.getNextSet(0);
        if (j == i)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return j;
        }
    }

    private void validateQuietZone(BitArray bitarray, int i)
        throws NotFoundException
    {
        int j = narrowLineWidth * 10;
        i--;
        do
        {
            if (j <= 0 || i < 0 || bitarray.get(i))
            {
                if (j != 0)
                {
                    throw NotFoundException.getNotFoundInstance();
                } else
                {
                    return;
                }
            }
            j--;
            i--;
        } while (true);
    }

    int[] decodeEnd(BitArray bitarray)
        throws NotFoundException
    {
        bitarray.reverse();
        int ai[];
        ai = findGuardPattern(bitarray, skipWhiteSpace(bitarray), END_PATTERN_REVERSED);
        validateQuietZone(bitarray, ai[0]);
        int i = ai[0];
        ai[0] = bitarray.getSize() - ai[1];
        ai[1] = bitarray.getSize() - i;
        bitarray.reverse();
        return ai;
        Exception exception;
        exception;
        bitarray.reverse();
        throw exception;
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws FormatException, NotFoundException
    {
        int ai1[] = decodeStart(bitarray);
        int ai[] = decodeEnd(bitarray);
        Object obj = new StringBuilder(20);
        decodeMiddle(bitarray, ai1[1], ai[0], ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        BarcodeFormat barcodeformat;
        int j;
        int k;
        int l;
        if (map != null)
        {
            bitarray = (int[])(int[])map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else
        {
            bitarray = null;
        }
        map = bitarray;
        if (bitarray == null)
        {
            map = DEFAULT_ALLOWED_LENGTHS;
        }
        k = ((String) (obj)).length();
        l = map.length;
        j = 0;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (k != map[j]) goto _L2; else goto _L1
_L1:
        j = 1;
_L4:
        if (j == 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            bitarray = new ResultPoint(ai1[1], i);
            map = new ResultPoint(ai[0], i);
            barcodeformat = BarcodeFormat.ITF;
            return new Result(((String) (obj)), null, new ResultPoint[] {
                bitarray, map
            }, barcodeformat);
        }
_L2:
        j++;
        break MISSING_BLOCK_LABEL_90;
        j = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    int[] decodeStart(BitArray bitarray)
        throws NotFoundException
    {
        int ai[] = findGuardPattern(bitarray, skipWhiteSpace(bitarray), START_PATTERN);
        narrowLineWidth = ai[1] - ai[0] >> 2;
        validateQuietZone(bitarray, ai[0]);
        return ai;
    }

    static 
    {
        int ai[] = {
            3, 1, 1, 1, 3
        };
        int ai1[] = {
            3, 3, 1, 1, 1
        };
        int ai2[] = {
            3, 1, 3, 1, 1
        };
        int ai3[] = {
            3, 1, 1, 3, 1
        };
        int ai4[] = {
            1, 3, 1, 3, 1
        };
        PATTERNS = (new int[][] {
            new int[] {
                1, 1, 3, 3, 1
            }, ai, new int[] {
                1, 3, 1, 1, 3
            }, ai1, new int[] {
                1, 1, 3, 1, 3
            }, ai2, new int[] {
                1, 3, 3, 1, 1
            }, new int[] {
                1, 1, 1, 3, 3
            }, ai3, ai4
        });
    }
}
