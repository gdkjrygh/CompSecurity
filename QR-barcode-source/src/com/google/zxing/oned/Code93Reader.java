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

public final class Code93Reader extends OneDReader
{

    private static final char ALPHABET[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    private static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final int ASTERISK_ENCODING = CHARACTER_ENCODINGS[47];
    private static final int CHARACTER_ENCODINGS[] = {
        276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 
        424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 
        282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 
        406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 
        366, 374, 430, 294, 474, 470, 306, 350
    };
    private final int counters[] = new int[6];
    private final StringBuilder decodeRowResult = new StringBuilder(20);

    public Code93Reader()
    {
    }

    private static void checkChecksums(CharSequence charsequence)
        throws ChecksumException
    {
        int i = charsequence.length();
        checkOneChecksum(charsequence, i - 2, 20);
        checkOneChecksum(charsequence, i - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charsequence, int i, int j)
        throws ChecksumException
    {
        int k = 1;
        int i1 = i - 1;
        int l = 0;
        do
        {
            int j1 = k;
            if (i1 < 0)
            {
                break;
            }
            int l1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charsequence.charAt(i1));
            int k1 = j1 + 1;
            k = k1;
            if (k1 > j)
            {
                k = 1;
            }
            i1--;
            l = l1 * j1 + l;
        } while (true);
        if (charsequence.charAt(i) != ALPHABET[l % 47])
        {
            throw ChecksumException.getChecksumInstance();
        } else
        {
            return;
        }
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
_L9:
        char c;
        char c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_277;
        }
        c = charsequence.charAt(i);
        if (c < 'a' || c > 'd')
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (i >= j - 1)
        {
            throw FormatException.getFormatInstance();
        }
        c1 = charsequence.charAt(i + 1);
        c;
        JVM INSTR tableswitch 97 100: default 100
    //                   97 147
    //                   98 175
    //                   99 227
    //                   100 119;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c = '\0';
_L6:
        stringbuilder.append(c);
        i++;
_L7:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (c1 >= 'A' && c1 <= 'Z')
        {
            c = (char)(c1 + 32);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L6
_L2:
        if (c1 >= 'A' && c1 <= 'Z')
        {
            c = (char)(c1 - 64);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L6
_L3:
        if (c1 >= 'A' && c1 <= 'E')
        {
            c = (char)(c1 - 38);
        } else
        if (c1 >= 'F' && c1 <= 'W')
        {
            c = (char)(c1 - 11);
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L6
_L4:
        if (c1 >= 'A' && c1 <= 'O')
        {
            c = (char)(c1 - 32);
        } else
        if (c1 == 'Z')
        {
            c = ':';
        } else
        {
            throw FormatException.getFormatInstance();
        }
          goto _L6
        stringbuilder.append(c);
          goto _L7
        return stringbuilder.toString();
        if (true) goto _L9; else goto _L8
_L8:
    }

    private int[] findAsteriskPattern(BitArray bitarray)
        throws NotFoundException
    {
        int i1 = bitarray.getSize();
        int i = bitarray.getNextSet(0);
        Arrays.fill(counters, 0);
        int ai[] = counters;
        int j1 = ai.length;
        int k = i;
        boolean flag = false;
        int l = 0;
        while (k < i1) 
        {
            int j;
            if (bitarray.get(k) ^ flag)
            {
                ai[l] = ai[l] + 1;
                j = ((flag) ? 1 : 0);
            } else
            {
                if (l == j1 - 1)
                {
                    if (toPattern(ai) == ASTERISK_ENCODING)
                    {
                        return (new int[] {
                            i, k
                        });
                    }
                    i += ai[0] + ai[1];
                    System.arraycopy(ai, 2, ai, 0, j1 - 2);
                    ai[j1 - 2] = 0;
                    ai[j1 - 1] = 0;
                    j = l - 1;
                } else
                {
                    j = l + 1;
                }
                ai[j] = 1;
                if (!flag)
                {
                    boolean flag1 = true;
                    l = j;
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    boolean flag2 = false;
                    l = j;
                    j = ((flag2) ? 1 : 0);
                }
            }
            k++;
            flag = j;
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

    private static int toPattern(int ai[])
    {
        int j2 = ai.length;
        int j = ai.length;
        int i = 0;
        int i1;
        int j1;
        for (i1 = 0; i < j; i1 = j1 + i1)
        {
            j1 = ai[i];
            i++;
        }

        int k1 = 0;
        i = 0;
        do
        {
            int l1;
label0:
            {
                int k = i;
                if (k1 < j2)
                {
                    k = ((ai[k1] << 8) * 9) / i1;
                    l1 = k >> 8;
                    if ((k & 0xff) > 127)
                    {
                        l1++;
                    }
                    if (l1 >= 1 && l1 <= 4)
                    {
                        break label0;
                    }
                    k = -1;
                }
                return k;
            }
            int l;
            if ((k1 & 1) == 0)
            {
                int i2 = 0;
                do
                {
                    l = i;
                    if (i2 >= l1)
                    {
                        break;
                    }
                    i2++;
                    i = i << 1 | 1;
                } while (true);
            } else
            {
                l = i << l1;
            }
            k1++;
            i = l;
        } while (true);
    }

    public Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        map = findAsteriskPattern(bitarray);
        int j = bitarray.getNextSet(map[1]);
        int j1 = bitarray.getSize();
        int ai[] = counters;
        Arrays.fill(ai, 0);
        Object obj = decodeRowResult;
        ((StringBuilder) (obj)).setLength(0);
        do
        {
            recordPattern(bitarray, j, ai);
            int k = toPattern(ai);
            if (k < 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            char c = patternToChar(k);
            ((StringBuilder) (obj)).append(c);
            int k1 = ai.length;
            k = 0;
            int l = j;
            for (; k < k1; k++)
            {
                l += ai[k];
            }

            k = bitarray.getNextSet(l);
            if (c == '*')
            {
                ((StringBuilder) (obj)).deleteCharAt(((StringBuilder) (obj)).length() - 1);
                if (k == j1 || !bitarray.get(k))
                {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (((StringBuilder) (obj)).length() < 2)
                {
                    throw NotFoundException.getNotFoundInstance();
                } else
                {
                    checkChecksums(((CharSequence) (obj)));
                    ((StringBuilder) (obj)).setLength(((StringBuilder) (obj)).length() - 2);
                    bitarray = decodeExtended(((CharSequence) (obj)));
                    int i1 = map[1];
                    float f = (float)(map[0] + i1) / 2.0F;
                    float f1 = (float)(j + k) / 2.0F;
                    map = new ResultPoint(f, i);
                    ResultPoint resultpoint = new ResultPoint(f1, i);
                    obj = BarcodeFormat.CODE_93;
                    return new Result(bitarray, null, new ResultPoint[] {
                        map, resultpoint
                    }, ((BarcodeFormat) (obj)));
                }
            }
            j = k;
        } while (true);
    }

}
