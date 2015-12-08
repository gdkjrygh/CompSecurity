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
    static final int CHARACTER_ENCODINGS[] = {
        3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
        12, 24, 69, 81, 84, 21, 26, 41, 11, 14
    };
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
        if (ac != null)
        {
            int j = ac.length;
            for (int i = 0; i < j; i++)
            {
                if (ac[i] == c)
                {
                    return true;
                }
            }

        }
        return false;
    }

    private void counterAppend(int i)
    {
        counters[counterLength] = i;
        counterLength = counterLength + 1;
        if (counterLength >= counters.length)
        {
            int ai[] = new int[counterLength << 1];
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
        int k = bitarray.getNextUnset(0);
        int i1 = bitarray.getSize();
        if (k >= i1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i = 1;
        int l = 0;
        while (k < i1) 
        {
            int j;
            if ((bitarray.get(k) ^ i) != 0)
            {
                l++;
                j = i;
                i = l;
            } else
            {
                counterAppend(l);
                l = 1;
                if (i == 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                i = l;
            }
            k++;
            l = i;
            i = j;
        }
        counterAppend(l);
    }

    private int toNarrowWidePattern(int i)
    {
        int k3 = i + 7;
        if (k3 < counterLength) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int ai[] = counters;
        i1 = 0;
        int i2 = 0x7fffffff;
        for (int j = i; j < k3;)
        {
            int k2 = ai[j];
            int j1 = i2;
            if (k2 < i2)
            {
                j1 = k2;
            }
            i2 = i1;
            if (k2 > i1)
            {
                i2 = k2;
            }
            j += 2;
            i1 = i2;
            i2 = j1;
        }

        int j3 = (i2 + i1) / 2;
        i1 = 0;
        i2 = 0x7fffffff;
        for (int k = i + 1; k < k3;)
        {
            int l2 = ai[k];
            int k1 = i2;
            if (l2 < i2)
            {
                k1 = l2;
            }
            i2 = i1;
            if (l2 > i1)
            {
                i2 = l2;
            }
            k += 2;
            i1 = i2;
            i2 = k1;
        }

        k3 = (i2 + i1) / 2;
        int l1 = 128;
        int l = 0;
        i1 = 0;
        while (i1 < 7) 
        {
            int j2;
            int i3;
            if ((i1 & 1) == 0)
            {
                i3 = j3;
            } else
            {
                i3 = k3;
            }
            l1 >>= 1;
            j2 = l;
            if (ai[i + i1] > i3)
            {
                j2 = l | l1;
            }
            i1++;
            l = j2;
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
                i1 = i;
                if (CHARACTER_ENCODINGS[i] == l)
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

    private void validatePattern(int i)
        throws NotFoundException
    {
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
        int i2 = decodeRowResult.length() - 1;
        int k = i;
        int j = 0;
        do
        {
            int k1 = CHARACTER_ENCODINGS[decodeRowResult.charAt(j)];
            for (int i1 = 6; i1 >= 0; i1--)
            {
                int j2 = (i1 & 1) + ((k1 & 1) << 1);
                ai[j2] = ai[j2] + counters[k + i1];
                ai1[j2] = ai1[j2] + 1;
                k1 >>= 1;
            }

            if (j >= i2)
            {
                break;
            }
            k += 8;
            j++;
        } while (true);
        int ai2[] = new int[4];
        int ai3[] = new int[4];
        for (j = 0; j < 2; j++)
        {
            ai3[j] = 0;
            ai3[j + 2] = (ai[j] << 8) / ai1[j] + (ai[j + 2] << 8) / ai1[j + 2] >> 1;
            ai2[j] = ai3[j + 2];
            ai2[j + 2] = ((ai[j + 2] << 9) + 384) / ai1[j + 2];
        }

        k = 0;
        j = i;
        i = k;
        do
        {
            int j1 = CHARACTER_ENCODINGS[decodeRowResult.charAt(i)];
            for (int l = 6; l >= 0; l--)
            {
                int l1 = (l & 1) + ((j1 & 1) << 1);
                int k2 = counters[j + l] << 8;
                if (k2 < ai3[l1] || k2 > ai2[l1])
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                j1 >>= 1;
            }

            if (i < i2)
            {
                j += 8;
                i++;
            } else
            {
                return;
            }
        } while (true);
    }

    public final Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException
    {
        Arrays.fill(counters, 0);
        setCounters(bitarray);
        int k = findStartPattern();
        int j = k;
        decodeRowResult.setLength(0);
        int k1;
        do
        {
            int l = toNarrowWidePattern(j);
            if (l == -1)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            decodeRowResult.append((char)l);
            k1 = j + 8;
            if (decodeRowResult.length() > 1 && arrayContains(STARTEND_ENCODING, ALPHABET[l]))
            {
                break;
            }
            j = k1;
        } while (k1 < counterLength);
        int l1 = counters[k1 - 1];
        int i1 = 0;
        for (j = -8; j < -1; j++)
        {
            i1 += counters[k1 + j];
        }

        if (k1 < counterLength && l1 < i1 / 2)
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
        j = 0;
        for (int j1 = 0; j1 < k; j1++)
        {
            j += counters[j1];
        }

        float f = j;
        for (; k < k1 - 1; k++)
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

}
