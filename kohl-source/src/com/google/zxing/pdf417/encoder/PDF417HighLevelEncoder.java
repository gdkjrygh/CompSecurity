// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package com.google.zxing.pdf417.encoder:
//            Compaction

final class PDF417HighLevelEncoder
{

    private static final int BYTE_COMPACTION = 1;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte MIXED[];
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte PUNCTUATION[];
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte TEXT_MIXED_RAW[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 
        43, 37, 42, 61, 94, 0, 32, 0, 0, 0
    };
    private static final byte TEXT_PUNCTUATION_RAW[] = {
        59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 
        33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 
        34, 124, 42, 40, 41, 63, 123, 125, 39, 0
    };

    private PDF417HighLevelEncoder()
    {
    }

    private static int determineConsecutiveBinaryCount(CharSequence charsequence, byte abyte0[], int i)
        throws WriterException
    {
        int j1 = charsequence.length();
        int k = i;
        do
        {
            if (k >= j1)
            {
                break;
            }
            char c = charsequence.charAt(k);
            int j = 0;
label0:
            do
            {
                int l;
label1:
                {
                    l = j;
                    if (j < 13)
                    {
                        l = j;
                        if (isDigit(c))
                        {
                            j++;
                            l = k + j;
                            if (l < j1)
                            {
                                break label1;
                            }
                            l = j;
                        }
                    }
                    if (l >= 13)
                    {
                        return k - i;
                    }
                    break label0;
                }
                c = charsequence.charAt(l);
            } while (true);
            j = 0;
label2:
            do
            {
                int i1;
label3:
                {
                    i1 = j;
                    if (j < 5)
                    {
                        i1 = j;
                        if (isText(c))
                        {
                            j++;
                            i1 = k + j;
                            if (i1 < j1)
                            {
                                break label3;
                            }
                            i1 = j;
                        }
                    }
                    if (i1 >= 5)
                    {
                        return k - i;
                    }
                    break label2;
                }
                c = charsequence.charAt(i1);
            } while (true);
            c = charsequence.charAt(k);
            if (abyte0[k] == 63 && c != '?')
            {
                throw new WriterException((new StringBuilder()).append("Non-encodable character detected: ").append(c).append(" (Unicode: ").append(c).append(')').toString());
            }
            k++;
        } while (true);
        return k - i;
    }

    private static int determineConsecutiveDigitCount(CharSequence charsequence, int i)
    {
        int k = 0;
        boolean flag = false;
        int i1 = charsequence.length();
        if (i < i1)
        {
            char c = charsequence.charAt(i);
            int j = i;
            i = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (!isDigit(c))
                {
                    break;
                }
                k = i;
                if (j >= i1)
                {
                    break;
                }
                k = i + 1;
                int l = j + 1;
                i = k;
                j = l;
                if (l < i1)
                {
                    c = charsequence.charAt(l);
                    i = k;
                    j = l;
                }
            } while (true);
        }
        return k;
    }

    private static int determineConsecutiveTextCount(CharSequence charsequence, int i)
    {
        int j1 = charsequence.length();
        int j = i;
        do
        {
            int k;
label0:
            {
                k = j;
                if (j < j1)
                {
                    char c = charsequence.charAt(j);
                    int l = 0;
                    k = j;
                    do
                    {
                        if (l >= 13 || !isDigit(c) || k >= j1)
                        {
                            break;
                        }
                        j = l + 1;
                        int i1 = k + 1;
                        k = i1;
                        l = j;
                        if (i1 < j1)
                        {
                            c = charsequence.charAt(i1);
                            k = i1;
                            l = j;
                        }
                    } while (true);
                    if (l >= 13)
                    {
                        return k - i - l;
                    }
                    j = k;
                    if (l > 0)
                    {
                        continue;
                    }
                    if (isText(charsequence.charAt(k)))
                    {
                        break label0;
                    }
                }
                return k - i;
            }
            j = k + 1;
        } while (true);
    }

    private static void encodeBinary(byte abyte0[], int i, int j, int k, StringBuilder stringbuilder)
    {
        int l;
        if (j == 1 && k == 0)
        {
            stringbuilder.append('\u0391');
        } else
        {
            if (j % 6 == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k != 0)
            {
                stringbuilder.append('\u039C');
            } else
            {
                stringbuilder.append('\u0385');
            }
        }
        k = i;
        l = k;
        if (j >= 6)
        {
            char ac[] = new char[5];
            do
            {
                l = k;
                if ((i + j) - k < 6)
                {
                    break;
                }
                long l1 = 0L;
                for (l = 0; l < 6; l++)
                {
                    l1 = (l1 << 8) + (long)(abyte0[k + l] & 0xff);
                }

                for (l = 0; l < 5; l++)
                {
                    ac[l] = (char)(int)(l1 % 900L);
                    l1 /= 900L;
                }

                for (l = ac.length - 1; l >= 0; l--)
                {
                    stringbuilder.append(ac[l]);
                }

                k += 6;
            } while (true);
        }
        for (; l < i + j; l++)
        {
            stringbuilder.append((char)(abyte0[l] & 0xff));
        }

    }

    static String encodeHighLevel(String s, Compaction compaction)
        throws WriterException
    {
        Object obj;
        StringBuilder stringbuilder;
        int i;
        int j;
        int k1;
        obj = null;
        stringbuilder = new StringBuilder(s.length());
        k1 = s.length();
        j = 0;
        i = 0;
        if (compaction != Compaction.TEXT) goto _L2; else goto _L1
_L1:
        encodeText(s, 0, k1, stringbuilder, 0);
_L4:
        return stringbuilder.toString();
_L2:
        if (compaction == Compaction.BYTE)
        {
            s = getBytesForMessage(s);
            encodeBinary(s, 0, s.length, 1, stringbuilder);
            continue; /* Loop/switch isn't completed */
        }
        if (compaction != Compaction.NUMERIC)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append('\u0386');
        encodeNumeric(s, 0, k1, stringbuilder);
        if (true) goto _L4; else goto _L3
_L3:
        byte byte0 = 0;
        compaction = obj;
        while (j < k1) 
        {
            int k = determineConsecutiveDigitCount(s, j);
            if (k >= 13)
            {
                stringbuilder.append('\u0386');
                byte0 = 2;
                i = 0;
                encodeNumeric(s, j, k, stringbuilder);
                j += k;
            } else
            {
                int i1 = determineConsecutiveTextCount(s, j);
                if (i1 >= 5 || k == k1)
                {
                    byte byte1 = byte0;
                    if (byte0 != 0)
                    {
                        stringbuilder.append('\u0384');
                        byte1 = 0;
                        i = 0;
                    }
                    i = encodeText(s, j, i1, stringbuilder, i);
                    j += i1;
                    byte0 = byte1;
                } else
                {
                    byte abyte0[] = compaction;
                    if (compaction == null)
                    {
                        abyte0 = getBytesForMessage(s);
                    }
                    int j1 = determineConsecutiveBinaryCount(s, abyte0, j);
                    int l = j1;
                    if (j1 == 0)
                    {
                        l = 1;
                    }
                    if (l == 1 && byte0 == 0)
                    {
                        encodeBinary(abyte0, j, 1, 0, stringbuilder);
                    } else
                    {
                        encodeBinary(abyte0, j, l, byte0, stringbuilder);
                        byte0 = 1;
                        i = 0;
                    }
                    j += l;
                    compaction = abyte0;
                }
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static void encodeNumeric(String s, int i, int j, StringBuilder stringbuilder)
    {
        int k = 0;
        StringBuilder stringbuilder1 = new StringBuilder(j / 3 + 1);
        BigInteger biginteger2 = BigInteger.valueOf(900L);
        BigInteger biginteger3 = BigInteger.valueOf(0L);
        int i1;
        for (; k < j - 1; k += i1)
        {
            stringbuilder1.setLength(0);
            i1 = Math.min(44, j - k);
            BigInteger biginteger = new BigInteger((new StringBuilder()).append('1').append(s.substring(i + k, i + k + i1)).toString());
            BigInteger biginteger1;
            do
            {
                stringbuilder1.append((char)biginteger.mod(biginteger2).intValue());
                biginteger1 = biginteger.divide(biginteger2);
                biginteger = biginteger1;
            } while (!biginteger1.equals(biginteger3));
            for (int l = stringbuilder1.length() - 1; l >= 0; l--)
            {
                stringbuilder.append(stringbuilder1.charAt(l));
            }

        }

    }

    private static int encodeText(CharSequence charsequence, int i, int j, StringBuilder stringbuilder, int k)
    {
        StringBuilder stringbuilder1;
        int l;
        stringbuilder1 = new StringBuilder(j);
        l = 0;
_L8:
        char c = charsequence.charAt(i + l);
        k;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 151
    //                   1 260
    //                   2 378;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!isPunctuation(c))
        {
            break MISSING_BLOCK_LABEL_512;
        }
        stringbuilder1.append((char)PUNCTUATION[c]);
_L6:
        int i1;
        i1 = l + 1;
        l = i1;
        if (i1 >= j)
        {
            j = 0;
            i1 = stringbuilder1.length();
            i = 0;
            while (i < i1) 
            {
                if (i % 2 != 0)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                if (l != 0)
                {
                    c = (char)(j * 30 + stringbuilder1.charAt(i));
                    stringbuilder.append(c);
                    j = c;
                } else
                {
                    j = stringbuilder1.charAt(i);
                }
                i++;
            }
            break; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (isAlphaUpper(c))
        {
            if (c == ' ')
            {
                stringbuilder1.append('\032');
            } else
            {
                stringbuilder1.append((char)(c - 65));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (isAlphaLower(c))
        {
            k = 1;
            stringbuilder1.append('\033');
        } else
        if (isMixed(c))
        {
            k = 2;
            stringbuilder1.append('\034');
        } else
        {
            stringbuilder1.append('\035');
            stringbuilder1.append((char)PUNCTUATION[c]);
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (isAlphaLower(c))
        {
            if (c == ' ')
            {
                stringbuilder1.append('\032');
            } else
            {
                stringbuilder1.append((char)(c - 97));
            }
            continue; /* Loop/switch isn't completed */
        }
        if (isAlphaUpper(c))
        {
            stringbuilder1.append('\033');
            stringbuilder1.append((char)(c - 65));
            continue; /* Loop/switch isn't completed */
        }
        if (isMixed(c))
        {
            k = 2;
            stringbuilder1.append('\034');
        } else
        {
            stringbuilder1.append('\035');
            stringbuilder1.append((char)PUNCTUATION[c]);
            continue; /* Loop/switch isn't completed */
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (isMixed(c))
        {
            stringbuilder1.append((char)MIXED[c]);
            continue; /* Loop/switch isn't completed */
        }
        if (isAlphaUpper(c))
        {
            k = 0;
            stringbuilder1.append('\034');
            continue; /* Loop/switch isn't completed */
        }
        if (isAlphaLower(c))
        {
            k = 1;
            stringbuilder1.append('\033');
            continue; /* Loop/switch isn't completed */
        }
        if (i + l + 1 < j && isPunctuation(charsequence.charAt(i + l + 1)))
        {
            k = 3;
            stringbuilder1.append('\031');
            continue; /* Loop/switch isn't completed */
        }
        stringbuilder1.append('\035');
        stringbuilder1.append((char)PUNCTUATION[c]);
        if (true) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        k = 0;
        stringbuilder1.append('\035');
        if (true) goto _L8; else goto _L7
_L7:
        if (i1 % 2 != 0)
        {
            stringbuilder.append((char)(j * 30 + 29));
        }
        return k;
    }

    private static byte[] getBytesForMessage(String s)
    {
        return s.getBytes();
    }

    private static boolean isAlphaLower(char c)
    {
        return c == ' ' || c >= 'a' && c <= 'z';
    }

    private static boolean isAlphaUpper(char c)
    {
        return c == ' ' || c >= 'A' && c <= 'Z';
    }

    private static boolean isDigit(char c)
    {
        return c >= '0' && c <= '9';
    }

    private static boolean isMixed(char c)
    {
        return MIXED[c] != -1;
    }

    private static boolean isPunctuation(char c)
    {
        return PUNCTUATION[c] != -1;
    }

    private static boolean isText(char c)
    {
        return c == '\t' || c == '\n' || c == '\r' || c >= ' ' && c <= '~';
    }

    static 
    {
        MIXED = new byte[128];
        PUNCTUATION = new byte[128];
        Arrays.fill(MIXED, (byte)-1);
        for (byte byte0 = 0; byte0 < TEXT_MIXED_RAW.length; byte0++)
        {
            byte byte2 = TEXT_MIXED_RAW[byte0];
            if (byte2 > 0)
            {
                MIXED[byte2] = byte0;
            }
        }

        Arrays.fill(PUNCTUATION, (byte)-1);
        for (byte byte1 = 0; byte1 < TEXT_PUNCTUATION_RAW.length; byte1++)
        {
            byte byte3 = TEXT_PUNCTUATION_RAW[byte1];
            if (byte3 > 0)
            {
                PUNCTUATION[byte3] = byte1;
            }
        }

    }
}
