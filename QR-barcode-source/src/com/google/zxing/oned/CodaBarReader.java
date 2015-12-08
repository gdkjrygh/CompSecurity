// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader

public final class CodaBarReader extends OneDReader
{

    static final char ALPHABET[] = "0123456789-$:/.+ABCD".toCharArray();
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final int CHARACTER_ENCODINGS[] = {
        3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
        12, 24, 69, 81, 84, 21, 26, 41, 11, 14
    };
    private static final int MAX_ACCEPTABLE = 512;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final int PADDING = 384;
    private static final char STARTEND_ENCODING[] = {
        'A', 'B', 'C', 'D'
    };
    private int counterLength;
    private int counters[];
    private final StringBuilder decodeRowResult = new StringBuilder(20);

    public CodaBarReader()
    {
        counters = new int[80];
        counterLength = 0;
    }

    static boolean arrayContains(char ac[], char c)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ac == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = ac.length;
        i = 0;
_L7:
        flag = flag1;
        if (i >= j) goto _L2; else goto _L3
_L3:
        if (ac[i] != c) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void counterAppend(int i)
    {
        counters[counterLength] = i;
        counterLength = counterLength + 1;
        if (counterLength >= counters.length)
        {
            int ai[] = new int[counterLength * 2];
            System.arraycopy(counters, 0, ai, 0, counterLength);
            counters = ai;
        }
    }

    private int findStartPattern()
        throws NotFoundException
    {
        for (int i = 1; i < counterLength; i += 2)
        {
            int j = toNarrowWidePattern(i);
            if (j == -1 || !arrayContains(STARTEND_ENCODING, ALPHABET[j]))
            {
                continue;
            }
            int l = 0;
            for (int k = i; k < i + 7; k++)
            {
                l += counters[k];
            }

            if (i == 1 || counters[i - 1] >= l / 2)
            {
                return i;
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitarray)
        throws NotFoundException
    {
        counterLength = 0;
        int j = bitarray.getNextUnset(0);
        int i1 = bitarray.getSize();
        if (j >= i1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = 1;
        int l = 0;
        while (j < i1) 
        {
            int k;
            if ((bitarray.get(j) ^ i) != 0)
            {
                l++;
                k = i;
                i = l;
            } else
            {
                counterAppend(l);
                if (i == 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                k = i;
                i = 1;
            }
            j++;
            l = i;
            i = k;
        }
        counterAppend(l);
    }

    private int toNarrowWidePattern(int i)
    {
        int i3;
        int j3;
        i3 = 0x7fffffff;
        j3 = i + 7;
        if (j3 < counterLength) goto _L2; else goto _L1
_L1:
        int k = -1;
_L4:
        return k;
_L2:
        int ai[] = counters;
        k = i;
        int k1 = 0x7fffffff;
        int j = 0;
        while (k < j3) 
        {
            int i2 = ai[k];
            int l = k1;
            if (i2 < k1)
            {
                l = i2;
            }
            if (i2 > j)
            {
                j = i2;
            }
            k += 2;
            k1 = l;
        }
        int l2 = (k1 + j) / 2;
        k = i + 1;
        j = 0;
        int i1;
        for (k1 = i3; k < j3; k1 = i1)
        {
            int j2 = ai[k];
            i1 = k1;
            if (j2 < k1)
            {
                i1 = j2;
            }
            if (j2 > j)
            {
                j = j2;
            }
            k += 2;
        }

        int k2 = (k1 + j) / 2;
        k = 0;
        j = 0;
        int j1 = 128;
        while (k < 7) 
        {
            int l1;
            if ((k & 1) == 0)
            {
                l1 = l2;
            } else
            {
                l1 = k2;
            }
            j1 >>= 1;
            if (ai[i + k] > l1)
            {
                j |= j1;
            }
            k++;
        }
        i = 0;
label0:
        do
        {
label1:
            {
                if (i >= CHARACTER_ENCODINGS.length)
                {
                    break label1;
                }
                k = i;
                if (CHARACTER_ENCODINGS[i] == j)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException
    {
        int j;
        int k;
        Arrays.fill(counters, 0);
        setCounters(bitarray);
        k = findStartPattern();
        decodeRowResult.setLength(0);
        j = k;
_L3:
        int l;
        int j1;
        l = toNarrowWidePattern(j);
        if (l == -1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        decodeRowResult.append((char)l);
        j1 = j + 8;
        if (decodeRowResult.length() <= 1 || !arrayContains(STARTEND_ENCODING, ALPHABET[l])) goto _L2; else goto _L1
_L2:
        j = j1;
        if (j1 < counterLength) goto _L3; else goto _L1
_L1:
        int k1 = counters[j1 - 1];
        j = -8;
        int i1 = 0;
        for (; j < -1; j++)
        {
            i1 += counters[j1 + j];
        }

        if (j1 < counterLength && k1 < i1 / 2)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        validatePattern(k);
        for (j = 0; j < decodeRowResult.length(); j++)
        {
            decodeRowResult.setCharAt(j, ALPHABET[decodeRowResult.charAt(j)]);
        }

        char c = decodeRowResult.charAt(0);
        if (!arrayContains(STARTEND_ENCODING, c))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        c = decodeRowResult.charAt(decodeRowResult.length() - 1);
        if (!arrayContains(STARTEND_ENCODING, c))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (decodeRowResult.length() <= 3)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END))
        {
            decodeRowResult.deleteCharAt(decodeRowResult.length() - 1);
            decodeRowResult.deleteCharAt(0);
        }
        i1 = 0;
        int l1;
        for (j = 0; i1 < k; j = l1 + j)
        {
            l1 = counters[i1];
            i1++;
        }

        float f = j;
        for (; k < j1 - 1; k++)
        {
            j += counters[k];
        }

        float f1 = j;
        bitarray = decodeRowResult.toString();
        map = new ResultPoint(f, i);
        ResultPoint resultpoint = new ResultPoint(f1, i);
        BarcodeFormat barcodeformat = BarcodeFormat.CODABAR;
        return new Result(bitarray, null, new ResultPoint[] {
            map, resultpoint
        }, barcodeformat);
    }

    void validatePattern(int i)
        throws NotFoundException
    {
        boolean flag = false;
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        ai[3] = 0;
        int ai1[] = new int[4];
        int[] _tmp1 = ai1;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j2 = decodeRowResult.length() - 1;
        int j = 0;
        int k = i;
        int ai2[];
        int ai3[];
        do
        {
            int k1 = CHARACTER_ENCODINGS[decodeRowResult.charAt(j)];
            for (int l = 6; l >= 0; l--)
            {
                int k2 = (l & 1) + (k1 & 1) * 2;
                ai[k2] = ai[k2] + counters[k + l];
                ai1[k2] = ai1[k2] + 1;
                k1 >>= 1;
            }

            if (j >= j2)
            {
                ai2 = new int[4];
                ai3 = new int[4];
                int i1 = 0;
                do
                {
                    j = ((flag) ? 1 : 0);
                    k = i;
                    if (i1 >= 2)
                    {
                        break;
                    }
                    ai3[i1] = 0;
                    ai3[i1 + 2] = (ai[i1] << 8) / ai1[i1] + (ai[i1 + 2] << 8) / ai1[i1 + 2] >> 1;
                    ai2[i1] = ai3[i1 + 2];
                    ai2[i1 + 2] = (ai[i1 + 2] * 512 + 384) / ai1[i1 + 2];
                    i1++;
                } while (true);
                break;
            }
            k += 8;
            j++;
        } while (true);
        do
        {
            int j1 = CHARACTER_ENCODINGS[decodeRowResult.charAt(j)];
            for (i = 6; i >= 0; i--)
            {
                int l1 = (i & 1) + (j1 & 1) * 2;
                int i2 = counters[k + i] << 8;
                if (i2 < ai3[l1] || i2 > ai2[l1])
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                j1 >>= 1;
            }

            if (j < j2)
            {
                k += 8;
                j++;
            } else
            {
                return;
            }
        } while (true);
    }

}
