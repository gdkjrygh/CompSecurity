// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            SymbolShapeHint, ASCIIEncoder, C40Encoder, TextEncoder, 
//            X12Encoder, EdifactEncoder, Base256Encoder, EncoderContext, 
//            Encoder, SymbolInfo

public final class HighLevelEncoder
{

    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\03605\035";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\03606\035";
    private static final String MACRO_TRAILER = "\036\004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    private HighLevelEncoder()
    {
    }

    public static int determineConsecutiveDigitCount(CharSequence charsequence, int i)
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

    public static String encodeHighLevel(String s)
    {
        return encodeHighLevel(s, SymbolShapeHint.FORCE_NONE, null, null);
    }

    public static String encodeHighLevel(String s, SymbolShapeHint symbolshapehint, Dimension dimension, Dimension dimension1)
    {
        EncoderContext encodercontext;
        ASCIIEncoder asciiencoder;
        C40Encoder c40encoder;
        TextEncoder textencoder;
        X12Encoder x12encoder;
        EdifactEncoder edifactencoder;
        Base256Encoder base256encoder;
        asciiencoder = new ASCIIEncoder();
        c40encoder = new C40Encoder();
        textencoder = new TextEncoder();
        x12encoder = new X12Encoder();
        edifactencoder = new EdifactEncoder();
        base256encoder = new Base256Encoder();
        encodercontext = new EncoderContext(s);
        encodercontext.setSymbolShape(symbolshapehint);
        encodercontext.setSizeConstraints(dimension, dimension1);
        if (!s.startsWith("[)>\03605\035") || !s.endsWith("\036\004")) goto _L2; else goto _L1
_L1:
        encodercontext.writeCodeword('\354');
        encodercontext.setSkipAtEnd(2);
        encodercontext.pos = encodercontext.pos + "[)>\03605\035".length();
_L4:
        int i;
        i = 0;
        do
        {
            if (!encodercontext.hasMoreCharacters())
            {
                break;
            }
            (new Encoder[] {
                asciiencoder, c40encoder, textencoder, x12encoder, edifactencoder, base256encoder
            })[i].encode(encodercontext);
            if (encodercontext.getNewEncoding() >= 0)
            {
                i = encodercontext.getNewEncoding();
                encodercontext.resetEncoderSignal();
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        if (s.startsWith("[)>\03606\035") && s.endsWith("\036\004"))
        {
            encodercontext.writeCodeword('\355');
            encodercontext.setSkipAtEnd(2);
            encodercontext.pos = encodercontext.pos + "[)>\03606\035".length();
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j = encodercontext.getCodewordCount();
        encodercontext.updateSymbolInfo();
        int k = encodercontext.getSymbolInfo().getDataCapacity();
        if (j < k && i != 0 && i != 5)
        {
            encodercontext.writeCodeword('\376');
        }
        s = encodercontext.getCodewords();
        if (s.length() < k)
        {
            s.append('\201');
        }
        for (; s.length() < k; s.append(randomize253State('\201', s.length() + 1))) { }
        return encodercontext.getCodewords().toString();
    }

    private static int findMinimums(float af[], int ai[], int i, byte abyte0[])
    {
        Arrays.fill(abyte0, (byte)0);
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); i < 6;)
        {
            ai[i] = (int)Math.ceil(af[i]);
            int l = ai[i];
            int k = j;
            if (j > l)
            {
                k = l;
                Arrays.fill(abyte0, (byte)0);
            }
            if (k == l)
            {
                abyte0[i] = (byte)(abyte0[i] + 1);
            }
            i++;
            j = k;
        }

        return j;
    }

    private static int getMinimumCount(byte abyte0[])
    {
        int j = 0;
        for (int i = 0; i < 6; i++)
        {
            j += abyte0[i];
        }

        return j;
    }

    static void illegalCharacter(char c)
    {
        String s = Integer.toHexString(c);
        s = (new StringBuilder()).append("0000".substring(0, 4 - s.length())).append(s).toString();
        throw new IllegalArgumentException((new StringBuilder()).append("Illegal character: ").append(c).append(" (0x").append(s).append(')').toString());
    }

    static boolean isDigit(char c)
    {
        return c >= '0' && c <= '9';
    }

    static boolean isExtendedASCII(char c)
    {
        return c >= '\200' && c <= '\377';
    }

    private static boolean isNativeC40(char c)
    {
        return c == ' ' || c >= '0' && c <= '9' || c >= 'A' && c <= 'Z';
    }

    private static boolean isNativeEDIFACT(char c)
    {
        return c >= ' ' && c <= '^';
    }

    private static boolean isNativeText(char c)
    {
        return c == ' ' || c >= '0' && c <= '9' || c >= 'a' && c <= 'z';
    }

    private static boolean isNativeX12(char c)
    {
        return isX12TermSep(c) || c == ' ' || c >= '0' && c <= '9' || c >= 'A' && c <= 'Z';
    }

    private static boolean isSpecialB256(char c)
    {
        return false;
    }

    private static boolean isX12TermSep(char c)
    {
        return c == '\r' || c == '*' || c == '>';
    }

    static int lookAheadTest(CharSequence charsequence, int i, int j)
    {
        if (i >= charsequence.length())
        {
            return j;
        }
        float af[];
        if (j == 0)
        {
            af = new float[6];
            float[] _tmp = af;
            af[0] = 0.0F;
            af[1] = 1.0F;
            af[2] = 1.0F;
            af[3] = 1.0F;
            af[4] = 1.0F;
            af[5] = 1.25F;
        } else
        {
            af = new float[6];
            float[] _tmp1 = af;
            af[0] = 1.0F;
            af[1] = 2.0F;
            af[2] = 2.0F;
            af[3] = 2.0F;
            af[4] = 2.0F;
            af[5] = 2.25F;
            af[j] = 0.0F;
        }
        j = 0;
        int ai1[];
        int k;
        do
        {
            do
            {
                do
                {
                    do
                    {
                        do
                        {
                            byte abyte0[];
                            do
                            {
                                if (i + j == charsequence.length())
                                {
                                    charsequence = new byte[6];
                                    int ai[] = new int[6];
                                    i = findMinimums(af, ai, 0x7fffffff, charsequence);
                                    j = getMinimumCount(charsequence);
                                    if (ai[0] == i)
                                    {
                                        return 0;
                                    }
                                    if (j == 1 && charsequence[5] > 0)
                                    {
                                        return 5;
                                    }
                                    if (j == 1 && charsequence[4] > 0)
                                    {
                                        return 4;
                                    }
                                    if (j == 1 && charsequence[2] > 0)
                                    {
                                        return 2;
                                    }
                                    return j != 1 || charsequence[3] <= 0 ? 1 : 3;
                                }
                                char c = charsequence.charAt(i + j);
                                k = j + 1;
                                if (isDigit(c))
                                {
                                    af[0] = (float)((double)af[0] + 0.5D);
                                } else
                                if (isExtendedASCII(c))
                                {
                                    af[0] = (int)Math.ceil(af[0]);
                                    af[0] = af[0] + 2.0F;
                                } else
                                {
                                    af[0] = (int)Math.ceil(af[0]);
                                    af[0] = af[0] + 1.0F;
                                }
                                if (isNativeC40(c))
                                {
                                    af[1] = af[1] + 0.6666667F;
                                } else
                                if (isExtendedASCII(c))
                                {
                                    af[1] = af[1] + 2.666667F;
                                } else
                                {
                                    af[1] = af[1] + 1.333333F;
                                }
                                if (isNativeText(c))
                                {
                                    af[2] = af[2] + 0.6666667F;
                                } else
                                if (isExtendedASCII(c))
                                {
                                    af[2] = af[2] + 2.666667F;
                                } else
                                {
                                    af[2] = af[2] + 1.333333F;
                                }
                                if (isNativeX12(c))
                                {
                                    af[3] = af[3] + 0.6666667F;
                                } else
                                if (isExtendedASCII(c))
                                {
                                    af[3] = af[3] + 4.333333F;
                                } else
                                {
                                    af[3] = af[3] + 3.333333F;
                                }
                                if (isNativeEDIFACT(c))
                                {
                                    af[4] = af[4] + 0.75F;
                                } else
                                if (isExtendedASCII(c))
                                {
                                    af[4] = af[4] + 4.25F;
                                } else
                                {
                                    af[4] = af[4] + 3.25F;
                                }
                                if (isSpecialB256(c))
                                {
                                    af[5] = af[5] + 4F;
                                } else
                                {
                                    af[5] = af[5] + 1.0F;
                                }
                                j = k;
                            } while (k < 4);
                            ai1 = new int[6];
                            abyte0 = new byte[6];
                            findMinimums(af, ai1, 0x7fffffff, abyte0);
                            j = getMinimumCount(abyte0);
                            if (ai1[0] < ai1[5] && ai1[0] < ai1[1] && ai1[0] < ai1[2] && ai1[0] < ai1[3] && ai1[0] < ai1[4])
                            {
                                return 0;
                            }
                            if (ai1[5] < ai1[0] || abyte0[1] + abyte0[2] + abyte0[3] + abyte0[4] == 0)
                            {
                                return 5;
                            }
                            if (j == 1 && abyte0[4] > 0)
                            {
                                return 4;
                            }
                            if (j == 1 && abyte0[2] > 0)
                            {
                                return 2;
                            }
                            if (j == 1 && abyte0[3] > 0)
                            {
                                return 3;
                            }
                            j = k;
                        } while (ai1[1] + 1 >= ai1[0]);
                        j = k;
                    } while (ai1[1] + 1 >= ai1[5]);
                    j = k;
                } while (ai1[1] + 1 >= ai1[4]);
                j = k;
            } while (ai1[1] + 1 >= ai1[2]);
            if (ai1[1] < ai1[3])
            {
                return 1;
            }
            j = k;
        } while (ai1[1] != ai1[3]);
        i = i + k + 1;
        do
        {
label0:
            {
                if (i < charsequence.length())
                {
                    char c1 = charsequence.charAt(i);
                    if (isX12TermSep(c1))
                    {
                        return 3;
                    }
                    if (isNativeX12(c1))
                    {
                        break label0;
                    }
                }
                return 1;
            }
            i++;
        } while (true);
    }

    private static char randomize253State(char c, int i)
    {
        c += (i * 149) % 253 + 1;
        if (c <= '\376')
        {
            return (char)c;
        } else
        {
            return (char)(c - 254);
        }
    }
}
