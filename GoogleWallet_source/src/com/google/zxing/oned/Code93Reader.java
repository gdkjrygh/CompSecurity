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
    private static final int ASTERISK_ENCODING;
    private static final int CHARACTER_ENCODINGS[];
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
        int i1 = 0;
        for (int l = i - 1; l >= 0; l--)
        {
            i1 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charsequence.charAt(l)) * k;
            int j1 = k + 1;
            k = j1;
            if (j1 > j)
            {
                k = 1;
            }
        }

        if (charsequence.charAt(i) != ALPHABET[i1 % 47])
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
_L8:
        char c;
        char c1;
        char c2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = charsequence.charAt(i);
        if (c1 < 'a' || c1 > 'd')
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (i >= j - 1)
        {
            throw FormatException.getFormatInstance();
        }
        c2 = charsequence.charAt(i + 1);
        c = '\0';
        c1;
        JVM INSTR tableswitch 97 100: default 108
    //                   97 157
    //                   98 185
    //                   99 237
    //                   100 129;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        stringbuilder.append(c);
        i++;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
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
_L4:
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

    private int[] findAsteriskPattern(BitArray bitarray)
        throws NotFoundException
    {
        int l = bitarray.getSize();
        int k = bitarray.getNextSet(0);
        Arrays.fill(counters, 0);
        int ai[] = counters;
        int i = k;
        boolean flag = false;
        int i1 = ai.length;
        int j = 0;
        while (k < l) 
        {
            if (bitarray.get(k) ^ flag)
            {
                ai[j] = ai[j] + 1;
            } else
            {
                if (j == i1 - 1)
                {
                    if (toPattern(ai) == ASTERISK_ENCODING)
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

    private static int toPattern(int ai[])
    {
        int k2 = ai.length;
        int j1 = 0;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            j1 += ai[i];
        }

        int j = 0;
        int k1 = 0;
        do
        {
            int l1;
label0:
            {
                int l = j;
                if (k1 < k2)
                {
                    int i2 = ((ai[k1] << 8) * 9) / j1;
                    l = i2 >> 8;
                    l1 = l;
                    if ((i2 & 0xff) > 127)
                    {
                        l1 = l + 1;
                    }
                    if (l1 > 0 && l1 <= 4)
                    {
                        break label0;
                    }
                    l = -1;
                }
                return l;
            }
            int i1;
            if ((k1 & 1) == 0)
            {
                int j2 = 0;
                do
                {
                    i1 = j;
                    if (j2 >= l1)
                    {
                        break;
                    }
                    j = j << 1 | 1;
                    j2++;
                } while (true);
            } else
            {
                i1 = j << l1;
            }
            k1++;
            j = i1;
        } while (true);
    }

    public final Result decodeRow(int i, BitArray bitarray, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        map = findAsteriskPattern(bitarray);
        int j = bitarray.getNextSet(map[1]);
        int i1 = bitarray.getSize();
        int ai[] = counters;
        Arrays.fill(ai, 0);
        Object obj = decodeRowResult;
        ((StringBuilder) (obj)).setLength(0);
        char c;
        int k;
        int l;
        do
        {
            k = j;
            recordPattern(bitarray, k, ai);
            j = toPattern(ai);
            if (j < 0)
            {
                throw NotFoundException.getNotFoundInstance();
            }
            c = patternToChar(j);
            ((StringBuilder) (obj)).append(c);
            int j1 = ai.length;
            l = 0;
            j = k;
            for (; l < j1; l++)
            {
                j += ai[l];
            }

            l = bitarray.getNextSet(j);
            j = l;
        } while (c != '*');
        ((StringBuilder) (obj)).deleteCharAt(((StringBuilder) (obj)).length() - 1);
        if (l == i1 || !bitarray.get(l))
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
            float f = (float)(map[1] + map[0]) / 2.0F;
            float f1 = (float)(l + k) / 2.0F;
            map = new ResultPoint(f, i);
            ResultPoint resultpoint = new ResultPoint(f1, i);
            obj = BarcodeFormat.CODE_93;
            return new Result(bitarray, null, new ResultPoint[] {
                map, resultpoint
            }, ((BarcodeFormat) (obj)));
        }
    }

    static 
    {
        int ai[] = new int[48];
        int[] _tmp = ai;
        ai[0] = 276;
        ai[1] = 328;
        ai[2] = 324;
        ai[3] = 322;
        ai[4] = 296;
        ai[5] = 292;
        ai[6] = 290;
        ai[7] = 336;
        ai[8] = 274;
        ai[9] = 266;
        ai[10] = 424;
        ai[11] = 420;
        ai[12] = 418;
        ai[13] = 404;
        ai[14] = 402;
        ai[15] = 394;
        ai[16] = 360;
        ai[17] = 356;
        ai[18] = 354;
        ai[19] = 308;
        ai[20] = 282;
        ai[21] = 344;
        ai[22] = 332;
        ai[23] = 326;
        ai[24] = 300;
        ai[25] = 278;
        ai[26] = 436;
        ai[27] = 434;
        ai[28] = 428;
        ai[29] = 422;
        ai[30] = 406;
        ai[31] = 410;
        ai[32] = 364;
        ai[33] = 358;
        ai[34] = 310;
        ai[35] = 314;
        ai[36] = 302;
        ai[37] = 468;
        ai[38] = 466;
        ai[39] = 458;
        ai[40] = 366;
        ai[41] = 374;
        ai[42] = 430;
        ai[43] = 294;
        ai[44] = 474;
        ai[45] = 470;
        ai[46] = 306;
        ai[47] = 350;
        CHARACTER_ENCODINGS = ai;
        ASTERISK_ENCODING = ai[47];
    }
}
