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
        int l = -1;
        int j1 = PATTERNS.length;
        for (int i = 0; i < j1;)
        {
            int i1 = patternMatchVariance(ai, PATTERNS[i], 199);
            int k = j;
            if (i1 < j)
            {
                k = i1;
                l = i;
            }
            i++;
            j = k;
        }

        if (l >= 0)
        {
            return l;
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
        do
        {
label0:
            {
                if (i >= j)
                {
                    break label0;
                }
                recordPattern(bitarray, i, ai);
                for (int k = 0; k < 5; k++)
                {
                    int i1 = k << 1;
                    ai1[k] = ai[i1];
                    ai2[k] = ai[i1 + 1];
                }

                stringbuilder.append((char)(decodeDigit(ai1) + 48));
                stringbuilder.append((char)(decodeDigit(ai2) + 48));
                int k1 = ai.length;
                int l = 0;
                int j1 = i;
                do
                {
                    i = j1;
                    if (l >= k1)
                    {
                        break;
                    }
                    j1 += ai[l];
                    l++;
                } while (true);
            }
        } while (true);
    }

    private static int[] findGuardPattern(BitArray bitarray, int i, int ai[])
        throws NotFoundException
    {
        int l = ai.length;
        int ai1[] = new int[l];
        int i1 = bitarray.getSize();
        boolean flag = false;
        boolean flag1 = false;
        int j = i;
        int k = i;
        i = j;
        j = ((flag1) ? 1 : 0);
        while (k < i1) 
        {
            if (bitarray.get(k) ^ flag)
            {
                ai1[j] = ai1[j] + 1;
            } else
            {
                if (j == l - 1)
                {
                    if (patternMatchVariance(ai1, ai, 199) < 107)
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    i += ai1[0] + ai1[1];
                    System.arraycopy(ai1, 2, ai1, 0, l - 2);
                    ai1[l - 2] = 0;
                    ai1[l - 1] = 0;
                    j--;
                } else
                {
                    j++;
                }
                ai1[j] = 1;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            k++;
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
        if (j >= i)
        {
            j = i;
        }
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
        bitarray = null;
        if (map != null)
        {
            bitarray = (int[])(int[])map.get(DecodeHintType.ALLOWED_LENGTHS);
        }
        map = bitarray;
        if (bitarray == null)
        {
            map = DEFAULT_ALLOWED_LENGTHS;
        }
        int k = ((String) (obj)).length();
        boolean flag1 = false;
        int l = map.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < l)
                {
                    if (k != map[j])
                    {
                        break label0;
                    }
                    flag = true;
                }
                if (!flag)
                {
                    throw FormatException.getFormatInstance();
                } else
                {
                    bitarray = new ResultPoint(ai1[1], i);
                    map = new ResultPoint(ai[0], i);
                    BarcodeFormat barcodeformat = BarcodeFormat.ITF;
                    return new Result(((String) (obj)), null, new ResultPoint[] {
                        bitarray, map
                    }, barcodeformat);
                }
            }
            j++;
        } while (true);
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
            1, 1, 3, 3, 1
        };
        int ai1[] = {
            3, 1, 1, 1, 3
        };
        int ai2[] = {
            1, 3, 1, 1, 3
        };
        int ai3[] = {
            3, 3, 1, 1, 1
        };
        int ai4[] = {
            1, 1, 3, 1, 3
        };
        int ai5[] = {
            3, 1, 3, 1, 1
        };
        int ai6[] = {
            1, 3, 3, 1, 1
        };
        int ai7[] = {
            3, 1, 1, 3, 1
        };
        PATTERNS = (new int[][] {
            ai, ai1, ai2, ai3, ai4, ai5, ai6, new int[] {
                1, 1, 1, 3, 3
            }, ai7, new int[] {
                1, 3, 1, 3, 1
            }
        });
    }
}
