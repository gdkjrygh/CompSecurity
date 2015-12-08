// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            OneDReader

public final class Code39Reader extends OneDReader
{

    private static final char ALPHABET[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
    private static final int ASTERISK_ENCODING = CHARACTER_ENCODINGS[39];
    static final int CHARACTER_ENCODINGS[] = {
        52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 
        265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 
        259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 
        385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 
        168, 162, 138, 42
    };
    private final int counters[];
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader()
    {
        this(false);
    }

    public Code39Reader(boolean flag)
    {
        this(flag, false);
    }

    public Code39Reader(boolean flag, boolean flag1)
    {
        usingCheckDigit = flag;
        extendedMode = flag1;
        decodeRowResult = new StringBuilder(20);
        counters = new int[9];
    }

    private static String decodeExtended(CharSequence charsequence)
        throws FormatException
    {
        StringBuilder stringbuilder;
        int i;
        int j;
        j = charsequence.length();
        stringbuilder = new StringBuilder(j);
        i = 0;
_L8:
        char c;
        char c1;
        char c2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        c1 = charsequence.charAt(i);
        if (c1 != '+' && c1 != '$' && c1 != '%' && c1 != '/')
        {
            break MISSING_BLOCK_LABEL_290;
        }
        c2 = charsequence.charAt(i + 1);
        c = '\0';
        c1;
        JVM INSTR lookupswitch 4: default 120
    //                   36: 169
    //                   37: 197
    //                   43: 141
    //                   47: 249;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        stringbuilder.append(c);
        i++;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c = (char)(c2 + 32);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L1
_L2:
        if (c2 >= 'A' && c2 <= 'Z')
        {
            c = (char)(c2 - 64);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L1
_L3:
        if (c2 >= 'A' && c2 <= 'E')
        {
            c = (char)(c2 - 38);
        } else
        if (c2 >= 'F' && c2 <= 'W')
        {
            c = (char)(c2 - 11);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L1
_L5:
        if (c2 >= 'A' && c2 <= 'O')
        {
            c = (char)(c2 - 32);
        } else
        if (c2 == 'Z')
        {
            c = ':';
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L1
        stringbuilder.append(c1);
          goto _L6
        return stringbuilder.toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static int[] findAsteriskPattern(BitArray bitarray, int ai[])
        throws NotFoundException
    {
        int l = bitarray.getSize();
        int k = bitarray.getNextSet(0);
        int j = 0;
        int i = k;
        boolean flag = false;
        int i1 = ai.length;
        while (k < l) 
        {
            if (bitarray.get(k) ^ flag)
            {
                ai[j] = ai[j] + 1;
            } else
            {
                if (j == i1 - 1)
                {
                    if (toNarrowWidePattern(ai) == ASTERISK_ENCODING && bitarray.isRange(Math.max(0, i - (k - i >> 1)), i, false))
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    i += ai[0] + ai[1];
                    System.arraycopy(ai, 2, ai, 0, i1 - 2);
                    ai[i1 - 2] = 0;
                    ai[i1 - 1] = 0;
                    j--;
                } else
                {
                    j++;
                }
                ai[j] = 1;
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

    private static char patternToChar(int i)
        throws NotFoundException
    {
        for (int j = 0; j < CHARACTER_ENCODINGS.length; j++)
        {
            if (CHARACTER_ENCODINGS[j] == i)
            {
                return ALPHABET[j];
            }
        }

        throw NotFoundException.getNotFoundInstance();
    }

    private static int toNarrowWidePattern(int ai[])
    {
        int k3 = ai.length;
        int l = 0;
        int k;
        do
        {
            int i = 0x7fffffff;
            int j2 = ai.length;
            for (int j = 0; j < j2;)
            {
                int k1 = ai[j];
                int i1 = i;
                if (k1 < i)
                {
                    i1 = i;
                    if (k1 > l)
                    {
                        i1 = k1;
                    }
                }
                j++;
                i = i1;
            }

            l = i;
            k = 0;
            int j1 = 0;
            i = 0;
            for (int l1 = 0; l1 < k3;)
            {
                int l3 = ai[l1];
                int j3 = i;
                int l2 = j1;
                j2 = k;
                if (l3 > l)
                {
                    j3 = i | 1 << k3 - 1 - l1;
                    j2 = k + 1;
                    l2 = j1 + l3;
                }
                l1++;
                i = j3;
                j1 = l2;
                k = j2;
            }

            if (k != 3)
            {
                continue;
            }
            j2 = 0;
            int i2 = k;
            k = j2;
            do
            {
                int k2;
label0:
                {
                    k2 = i;
                    if (k < k3)
                    {
                        k2 = i;
                        if (i2 > 0)
                        {
                            int i3 = ai[k];
                            k2 = i2;
                            if (i3 <= l)
                            {
                                break label0;
                            }
                            k2 = i2 - 1;
                            if (i3 << 1 < j1)
                            {
                                break label0;
                            }
                            k2 = -1;
                        }
                    }
                    return k2;
                }
                k++;
                i2 = k2;
            } while (true);
        } while (k > 3);
        return -1;
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        int ai[] = counters;
        Arrays.fill(ai, 0);
        Object obj = decodeRowResult;
        ((StringBuilder) (obj)).setLength(0);
        map = findAsteriskPattern(bitarray, ai);
        int j = bitarray.getNextSet(map[1]);
        int i2 = bitarray.getSize();
        char c;
        int k;
        int k1;
        do
        {
            k = j;
            recordPattern(bitarray, k, ai);
            j = toNarrowWidePattern(ai);
            if (j < 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            c = patternToChar(j);
            ((StringBuilder) (obj)).append(c);
            k1 = ai.length;
            int l = 0;
            j = k;
            for (; l < k1; l++)
            {
                j += ai[l];
            }

            k1 = bitarray.getNextSet(j);
            j = k1;
        } while (c != '*');
        ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
        j = 0;
        int k2 = ai.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            j += ai[i1];
        }

        if (k1 != i2 && k1 - k - j >> 1 < j)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (usingCheckDigit)
        {
            int j2 = ((StringBuilder) (obj)).length() - 1;
            int l1 = 0;
            for (int j1 = 0; j1 < j2; j1++)
            {
                l1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(decodeRowResult.charAt(j1));
            }

            if (((StringBuilder) (obj)).charAt(j2) != ALPHABET[l1 % 43])
            {
                throw ChecksumException.getChecksumInstance();
            }
            ((StringBuilder) (obj)).setLength(j2);
        }
        if (((StringBuilder) (obj)).length() == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f;
        float f1;
        float f2;
        ResultPoint resultpoint;
        if (extendedMode)
        {
            bitarray = decodeExtended(((CharSequence) (obj)));
        } else
        {
            bitarray = ((StringBuilder) (obj)).toString();
        }
        f = (float)(map[1] + map[0]) / 2.0F;
        f1 = k;
        f2 = (float)j / 2.0F;
        map = new ResultPoint(f, i);
        resultpoint = new ResultPoint(f1 + f2, i);
        obj = BarcodeFormat.CODE_39;
        return new Result(bitarray, null, new ResultPoint[] {
            map, resultpoint
        }, ((BarcodeFormat) (obj)));
    }

}
