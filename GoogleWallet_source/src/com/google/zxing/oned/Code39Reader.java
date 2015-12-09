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
    private static final int ASTERISK_ENCODING;
    static final int CHARACTER_ENCODINGS[];
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

    private Code39Reader(boolean flag, boolean flag1)
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

    public final Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        int ai[] = counters;
        Arrays.fill(ai, 0);
        Object obj = decodeRowResult;
        ((StringBuilder) (obj)).setLength(0);
        map = findAsteriskPattern(bitarray, ai);
        int j = bitarray.getNextSet(map[1]);
        int j2 = bitarray.getSize();
        char c;
        int i1;
        int i2;
        do
        {
            i1 = j;
            recordPattern(bitarray, i1, ai);
            j = toNarrowWidePattern(ai);
            if (j < 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            c = patternToChar(j);
            ((StringBuilder) (obj)).append(c);
            i2 = ai.length;
            int j1 = 0;
            j = i1;
            for (; j1 < i2; j1++)
            {
                j += ai[j1];
            }

            i2 = bitarray.getNextSet(j);
            j = i2;
        } while (c != '*');
        ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 1);
        int k1 = 0;
        int l2 = ai.length;
        for (int k = 0; k < l2; k++)
        {
            k1 += ai[k];
        }

        if (i2 != j2 && i2 - i1 - k1 >> 1 < k1)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        if (usingCheckDigit)
        {
            int k2 = ((StringBuilder) (obj)).length() - 1;
            int l1 = 0;
            for (int l = 0; l < k2; l++)
            {
                l1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(decodeRowResult.charAt(l));
            }

            if (((StringBuilder) (obj)).charAt(k2) != ALPHABET[l1 % 43])
            {
                throw ChecksumException.getChecksumInstance();
            }
            ((StringBuilder) (obj)).setLength(k2);
        }
        if (((StringBuilder) (obj)).length() == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        float f;
        float f1;
        ResultPoint resultpoint;
        if (extendedMode)
        {
            bitarray = decodeExtended(((CharSequence) (obj)));
        } else
        {
            bitarray = ((StringBuilder) (obj)).toString();
        }
        f = (float)(map[1] + map[0]) / 2.0F;
        f1 = (float)(i2 + i1) / 2.0F;
        map = new ResultPoint(f, i);
        resultpoint = new ResultPoint(f1, i);
        obj = BarcodeFormat.CODE_39;
        return new Result(bitarray, null, new ResultPoint[] {
            map, resultpoint
        }, ((BarcodeFormat) (obj)));
    }

    static 
    {
        int ai[] = new int[44];
        int[] _tmp = ai;
        ai[0] = 52;
        ai[1] = 289;
        ai[2] = 97;
        ai[3] = 352;
        ai[4] = 49;
        ai[5] = 304;
        ai[6] = 112;
        ai[7] = 37;
        ai[8] = 292;
        ai[9] = 100;
        ai[10] = 265;
        ai[11] = 73;
        ai[12] = 328;
        ai[13] = 25;
        ai[14] = 280;
        ai[15] = 88;
        ai[16] = 13;
        ai[17] = 268;
        ai[18] = 76;
        ai[19] = 28;
        ai[20] = 259;
        ai[21] = 67;
        ai[22] = 322;
        ai[23] = 19;
        ai[24] = 274;
        ai[25] = 82;
        ai[26] = 7;
        ai[27] = 262;
        ai[28] = 70;
        ai[29] = 22;
        ai[30] = 385;
        ai[31] = 193;
        ai[32] = 448;
        ai[33] = 145;
        ai[34] = 400;
        ai[35] = 208;
        ai[36] = 133;
        ai[37] = 388;
        ai[38] = 196;
        ai[39] = 148;
        ai[40] = 168;
        ai[41] = 162;
        ai[42] = 138;
        ai[43] = 42;
        CHARACTER_ENCODINGS = ai;
        ASTERISK_ENCODING = ai[39];
    }
}
