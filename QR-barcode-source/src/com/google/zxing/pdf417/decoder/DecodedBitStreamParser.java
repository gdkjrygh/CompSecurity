// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.util.Arrays;

final class DecodedBitStreamParser
{
    private static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode ALPHA;
        public static final Mode ALPHA_SHIFT;
        public static final Mode LOWER;
        public static final Mode MIXED;
        public static final Mode PUNCT;
        public static final Mode PUNCT_SHIFT;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/google/zxing/pdf417/decoder/DecodedBitStreamParser$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            ALPHA = new Mode("ALPHA", 0);
            LOWER = new Mode("LOWER", 1);
            MIXED = new Mode("MIXED", 2);
            PUNCT = new Mode("PUNCT", 3);
            ALPHA_SHIFT = new Mode("ALPHA_SHIFT", 4);
            PUNCT_SHIFT = new Mode("PUNCT_SHIFT", 5);
            $VALUES = (new Mode[] {
                ALPHA, LOWER, MIXED, PUNCT, ALPHA_SHIFT, PUNCT_SHIFT
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final BigInteger EXP900[];
    private static final int LL = 27;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char MIXED_CHARS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', 
        '+', '%', '*', '=', '^'
    };
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final char PUNCT_CHARS[] = {
        ';', '<', '>', '@', '[', '\\', '}', '_', '`', '~', 
        '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', 
        '"', '|', '*', '(', ')', '?', '{', '}', '\''
    };
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    private DecodedBitStreamParser()
    {
    }

    private static int byteCompaction(int i, int ai[], int j, StringBuilder stringbuilder)
    {
label0:
        {
            {
                if (i != 901)
                {
                    break label0;
                }
                boolean flag1 = false;
                long l1 = 0L;
                char ac[] = new char[6];
                int ai1[] = new int[6];
                boolean flag = false;
                int l = ai[j];
                i = j + 1;
                j = ((flag1) ? 1 : 0);
                while (i < ai[0] && !flag) 
                {
                    int i1 = j + 1;
                    ai1[j] = l;
                    l1 = l1 * 900L + (long)l;
                    j = i + 1;
                    l = ai[i];
                    int k;
                    int j1;
                    long l2;
                    if (l == 900 || l == 901 || l == 902 || l == 924 || l == 928 || l == 923 || l == 922)
                    {
                        flag = true;
                        i = j - 1;
                        j = i1;
                    } else
                    if (i1 % 5 == 0 && i1 > 0)
                    {
                        for (i = 0; i < 6;)
                        {
                            ac[5 - i] = (char)(int)(l1 % 256L);
                            i++;
                            l1 >>= 8;
                        }

                        stringbuilder.append(ac);
                        i1 = 0;
                        i = j;
                        j = i1;
                    } else
                    {
                        i = j;
                        j = i1;
                    }
                }
                k = j;
                if (i == ai[0])
                {
                    k = j;
                    if (l < 900)
                    {
                        ai1[j] = l;
                        k = j + 1;
                    }
                }
                for (j = 0; j < k; j++)
                {
                    stringbuilder.append((char)ai1[j]);
                }

                l = i;
            }
            return l;
        }
        l = j;
        if (i != 924)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        i = 0;
        l1 = 0L;
        i1 = 0;
        k = j;
        j = i;
        do
        {
            l = k;
            if (k >= ai[0])
            {
                break MISSING_BLOCK_LABEL_279;
            }
            l = k;
            if (i1 != 0)
            {
                break MISSING_BLOCK_LABEL_279;
            }
            i = k + 1;
            k = ai[k];
            if (k < 900)
            {
                j1 = j + 1;
                l2 = l1 * 900L + (long)k;
                l = i1;
            } else
            if (k == 900 || k == 901 || k == 902 || k == 924 || k == 928 || k == 923 || k == 922)
            {
                i--;
                l = 1;
                j1 = j;
                l2 = l1;
            } else
            {
                l = i1;
                j1 = j;
                l2 = l1;
            }
            i1 = l;
            j = j1;
            l1 = l2;
            k = i;
            if (j1 % 5 == 0)
            {
                i1 = l;
                j = j1;
                l1 = l2;
                k = i;
                if (j1 > 0)
                {
                    ac = new char[6];
                    j = 0;
                    l1 = l2;
                    for (; j < 6; j++)
                    {
                        ac[5 - j] = (char)(int)(255L & l1);
                        l1 >>= 8;
                    }

                    stringbuilder.append(ac);
                    j = 0;
                    i1 = l;
                    k = i;
                }
            }
        } while (true);
    }

    static DecoderResult decode(int ai[], String s)
        throws FormatException
    {
        PDF417ResultMetadata pdf417resultmetadata;
        StringBuilder stringbuilder;
        int i;
        int j;
        stringbuilder = new StringBuilder(ai.length * 2);
        j = 2;
        i = ai[1];
        pdf417resultmetadata = new PDF417ResultMetadata();
_L9:
        if (j >= ai[0])
        {
            break MISSING_BLOCK_LABEL_231;
        }
        i;
        JVM INSTR lookupswitch 8: default 112
    //                   900: 145
    //                   901: 157
    //                   902: 171
    //                   913: 183
    //                   922: 223
    //                   923: 223
    //                   924: 197
    //                   928: 211;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6 _L7 _L8
_L1:
        i = textCompaction(ai, j - 1, stringbuilder);
_L10:
        if (i < ai.length)
        {
            j = i + 1;
            i = ai[i];
        } else
        {
            throw FormatException.getFormatInstance();
        }
        if (true) goto _L9; else goto _L2
_L2:
        i = textCompaction(ai, j, stringbuilder);
          goto _L10
_L3:
        i = byteCompaction(i, ai, j, stringbuilder);
          goto _L10
_L4:
        i = numericCompaction(ai, j, stringbuilder);
          goto _L10
_L5:
        i = byteCompaction(i, ai, j, stringbuilder);
          goto _L10
_L7:
        i = byteCompaction(i, ai, j, stringbuilder);
          goto _L10
_L8:
        i = decodeMacroBlock(ai, j, pdf417resultmetadata);
          goto _L10
_L6:
        throw FormatException.getFormatInstance();
        if (stringbuilder.length() == 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            ai = new DecoderResult(null, stringbuilder.toString(), null, s);
            ai.setOther(pdf417resultmetadata);
            return ai;
        }
    }

    private static String decodeBase900toBase10(int ai[], int i)
        throws FormatException
    {
        BigInteger biginteger = BigInteger.ZERO;
        for (int j = 0; j < i; j++)
        {
            biginteger = biginteger.add(EXP900[i - j - 1].multiply(BigInteger.valueOf(ai[j])));
        }

        ai = biginteger.toString();
        if (ai.charAt(0) != '1')
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return ai.substring(1);
        }
    }

    private static int decodeMacroBlock(int ai[], int i, PDF417ResultMetadata pdf417resultmetadata)
        throws FormatException
    {
        if (i + 2 > ai[0])
        {
            throw FormatException.getFormatInstance();
        }
        int ai1[] = new int[2];
        for (int j = 0; j < 2;)
        {
            ai1[j] = ai[i];
            j++;
            i++;
        }

        pdf417resultmetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(ai1, 2)));
        StringBuilder stringbuilder = new StringBuilder();
        int k = textCompaction(ai, i, stringbuilder);
        pdf417resultmetadata.setFileId(stringbuilder.toString());
        if (ai[k] == 923)
        {
            i = k + 1;
            int ai2[] = new int[ai[0] - i];
            k = 0;
            for (boolean flag = false; i < ai[0] && !flag;)
            {
                int l = i + 1;
                i = ai[i];
                if (i < 900)
                {
                    ai2[k] = i;
                    k++;
                    i = l;
                } else
                {
                    switch (i)
                    {
                    default:
                        throw FormatException.getFormatInstance();

                    case 922: 
                        pdf417resultmetadata.setLastSegment(true);
                        break;
                    }
                    i = l + 1;
                    flag = true;
                }
            }

            pdf417resultmetadata.setOptionalData(Arrays.copyOf(ai2, k));
        } else
        {
            i = k;
            if (ai[k] == 922)
            {
                pdf417resultmetadata.setLastSegment(true);
                return k + 1;
            }
        }
        return i;
    }

    private static void decodeTextCompaction(int ai[], int ai1[], int i, StringBuilder stringbuilder)
    {
        Mode mode;
        Mode mode1;
        int j;
        mode = Mode.ALPHA;
        mode1 = Mode.ALPHA;
        j = 0;
_L10:
        if (j >= i) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k;
        k = ai[j];
        flag = false;
        static class _cls1
        {

            static final int $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[];

            static 
            {
                $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = new int[Mode.values().length];
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.zxing.pdf417.decoder.DecodedBitStreamParser.Mode[mode.ordinal()];
        JVM INSTR tableswitch 1 6: default 76
    //                   1 109
    //                   2 283
    //                   3 461
    //                   4 658
    //                   5 764
    //                   6 836;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        char c;
        Mode mode2;
        mode2 = mode1;
        c = flag;
_L11:
        if (c != 0)
        {
            stringbuilder.append(c);
        }
        j++;
        mode1 = mode2;
          goto _L10
_L4:
        if (k < 26)
        {
            c = (char)(k + 65);
            mode2 = mode1;
        } else
        if (k == 26)
        {
            c = ' ';
            mode2 = mode1;
        } else
        if (k == 27)
        {
            mode = Mode.LOWER;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 28)
        {
            mode = Mode.MIXED;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 29)
        {
            mode1 = Mode.PUNCT_SHIFT;
            c = flag;
            mode2 = mode;
            mode = mode1;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c = flag;
            mode2 = mode1;
        } else
        {
            c = flag;
            mode2 = mode1;
            if (k == 900)
            {
                mode = Mode.ALPHA;
                c = flag;
                mode2 = mode1;
            }
        }
          goto _L11
_L5:
        if (k < 26)
        {
            c = (char)(k + 97);
            mode2 = mode1;
        } else
        if (k == 26)
        {
            c = ' ';
            mode2 = mode1;
        } else
        if (k == 27)
        {
            mode1 = Mode.ALPHA_SHIFT;
            c = flag;
            mode2 = mode;
            mode = mode1;
        } else
        if (k == 28)
        {
            mode = Mode.MIXED;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 29)
        {
            mode1 = Mode.PUNCT_SHIFT;
            c = flag;
            mode2 = mode;
            mode = mode1;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c = flag;
            mode2 = mode1;
        } else
        {
            c = flag;
            mode2 = mode1;
            if (k == 900)
            {
                mode = Mode.ALPHA;
                c = flag;
                mode2 = mode1;
            }
        }
          goto _L11
_L6:
        if (k < 25)
        {
            c = MIXED_CHARS[k];
            mode2 = mode1;
        } else
        if (k == 25)
        {
            mode = Mode.PUNCT;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 26)
        {
            c = ' ';
            mode2 = mode1;
        } else
        if (k == 27)
        {
            mode = Mode.LOWER;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 28)
        {
            mode = Mode.ALPHA;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 29)
        {
            mode1 = Mode.PUNCT_SHIFT;
            c = flag;
            mode2 = mode;
            mode = mode1;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c = flag;
            mode2 = mode1;
        } else
        {
            c = flag;
            mode2 = mode1;
            if (k == 900)
            {
                mode = Mode.ALPHA;
                c = flag;
                mode2 = mode1;
            }
        }
          goto _L11
_L7:
        if (k < 29)
        {
            c = PUNCT_CHARS[k];
            mode2 = mode1;
        } else
        if (k == 29)
        {
            mode = Mode.ALPHA;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            c = flag;
            mode2 = mode1;
        } else
        {
            c = flag;
            mode2 = mode1;
            if (k == 900)
            {
                mode = Mode.ALPHA;
                c = flag;
                mode2 = mode1;
            }
        }
          goto _L11
_L8:
        if (k < 26)
        {
            c = (char)(k + 65);
            mode = mode1;
            mode2 = mode1;
        } else
        if (k == 26)
        {
            c = ' ';
            mode = mode1;
            mode2 = mode1;
        } else
        {
            if (k != 900)
            {
                break MISSING_BLOCK_LABEL_943;
            }
            mode = Mode.ALPHA;
            c = flag;
            mode2 = mode1;
        }
          goto _L11
_L9:
        if (k < 29)
        {
            c = PUNCT_CHARS[k];
            mode = mode1;
            mode2 = mode1;
        } else
        if (k == 29)
        {
            mode = Mode.ALPHA;
            c = flag;
            mode2 = mode1;
        } else
        if (k == 913)
        {
            stringbuilder.append((char)ai1[j]);
            mode = mode1;
            c = flag;
            mode2 = mode1;
        } else
        {
            if (k != 900)
            {
                break MISSING_BLOCK_LABEL_943;
            }
            mode = Mode.ALPHA;
            c = flag;
            mode2 = mode1;
        }
          goto _L11
_L2:
        return;
        mode = mode1;
        c = flag;
        mode2 = mode1;
          goto _L11
    }

    private static int numericCompaction(int ai[], int i, StringBuilder stringbuilder)
        throws FormatException
    {
        int ai1[] = new int[15];
        boolean flag1 = false;
        int j = 0;
        int l = i;
        do
        {
            if (l >= ai[0] || flag1)
            {
                break;
            }
            i = l + 1;
            l = ai[l];
            boolean flag = flag1;
            if (i == ai[0])
            {
                flag = true;
            }
            int k;
            if (l < 900)
            {
                ai1[j] = l;
                k = j + 1;
            } else
            if (l == 900 || l == 901 || l == 924 || l == 928 || l == 923 || l == 922)
            {
                i--;
                flag = true;
                k = j;
            } else
            {
                k = j;
            }
            if (k % 15 != 0 && l != 902)
            {
                flag1 = flag;
                j = k;
                l = i;
                if (!flag)
                {
                    continue;
                }
            }
            stringbuilder.append(decodeBase900toBase10(ai1, k));
            j = 0;
            flag1 = flag;
            l = i;
        } while (true);
        return l;
    }

    private static int textCompaction(int ai[], int i, StringBuilder stringbuilder)
    {
        int ai1[] = new int[ai[0] - i << 1];
        int ai2[] = new int[ai[0] - i << 1];
        boolean flag = false;
        int j = 0;
label0:
        do
        {
            while (i < ai[0] && !flag) 
            {
                int k = i + 1;
                i = ai[i];
                if (i < 900)
                {
                    ai1[j] = i / 30;
                    ai1[j + 1] = i % 30;
                    j += 2;
                    i = k;
                } else
                {
                    switch (i)
                    {
                    default:
                        i = k;
                        break;

                    case 900: 
                        ai1[j] = 900;
                        j++;
                        i = k;
                        break;

                    case 901: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 902: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 928: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 923: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 922: 
                        i = k - 1;
                        flag = true;
                        break;

                    case 913: 
                        ai1[j] = 913;
                        i = k + 1;
                        ai2[j] = ai[k];
                        j++;
                        break;

                    case 924: 
                        i = k - 1;
                        flag = true;
                        break;
                    }
                    continue label0;
                }
            }
            decodeTextCompaction(ai1, ai2, j, stringbuilder);
            return i;
        } while (true);
    }

    static 
    {
        EXP900 = new BigInteger[16];
        EXP900[0] = BigInteger.ONE;
        BigInteger biginteger = BigInteger.valueOf(900L);
        EXP900[1] = biginteger;
        for (int i = 2; i < EXP900.length; i++)
        {
            EXP900[i] = EXP900[i - 1].multiply(biginteger);
        }

    }
}
