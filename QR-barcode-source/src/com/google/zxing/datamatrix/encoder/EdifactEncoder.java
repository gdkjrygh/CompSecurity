// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            Encoder, HighLevelEncoder, EncoderContext, SymbolInfo

final class EdifactEncoder
    implements Encoder
{

    EdifactEncoder()
    {
    }

    private static void encodeChar(char c, StringBuilder stringbuilder)
    {
        if (c >= ' ' && c <= '?')
        {
            stringbuilder.append(c);
            return;
        }
        if (c >= '@' && c <= '^')
        {
            stringbuilder.append((char)(c - 64));
            return;
        } else
        {
            HighLevelEncoder.illegalCharacter(c);
            return;
        }
    }

    private static String encodeToCodewords(CharSequence charsequence, int i)
    {
        char c5 = '\0';
        int j = charsequence.length() - i;
        if (j == 0)
        {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        char c6 = charsequence.charAt(i);
        char c;
        char c1;
        char c2;
        char c3;
        char c4;
        if (j >= 2)
        {
            c3 = charsequence.charAt(i + 1);
        } else
        {
            c3 = '\0';
        }
        if (j >= 3)
        {
            c4 = charsequence.charAt(i + 2);
        } else
        {
            c4 = '\0';
        }
        if (j >= 4)
        {
            c5 = charsequence.charAt(i + 3);
        }
        i = c5 + ((c4 << 6) + ((c3 << 12) + (c6 << 18)));
        c = (char)(i >> 16 & 0xff);
        c1 = (char)(i >> 8 & 0xff);
        c2 = (char)(i & 0xff);
        charsequence = new StringBuilder(3);
        charsequence.append(c);
        if (j >= 2)
        {
            charsequence.append(c1);
        }
        if (j >= 3)
        {
            charsequence.append(c2);
        }
        return charsequence.toString();
    }

    private static void handleEOD(EncoderContext encodercontext, CharSequence charsequence)
    {
        boolean flag = true;
        int i = charsequence.length();
        if (i == 0)
        {
            encodercontext.signalEncoderChange(0);
            return;
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        int j;
        int k;
        int l;
        encodercontext.updateSymbolInfo();
        j = encodercontext.getSymbolInfo().getDataCapacity();
        k = encodercontext.getCodewordCount();
        l = encodercontext.getRemainingCharacters();
        if (l == 0 && j - k <= 2)
        {
            encodercontext.signalEncoderChange(0);
            return;
        }
        if (i <= 4)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        throw new IllegalStateException("Count must not exceed 4");
        charsequence;
        encodercontext.signalEncoderChange(0);
        throw charsequence;
        j = i - 1;
        charsequence = encodeToCodewords(charsequence, 0);
        if (!encodercontext.hasMoreCharacters())
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L1
_L8:
        flag = i;
        if (j > 2)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        encodercontext.updateSymbolInfo(encodercontext.getCodewordCount() + j);
        flag = i;
        if (encodercontext.getSymbolInfo().getDataCapacity() - encodercontext.getCodewordCount() < 3)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        encodercontext.updateSymbolInfo(encodercontext.getCodewordCount() + charsequence.length());
        flag = false;
        if (!flag) goto _L3; else goto _L2
_L2:
        encodercontext.resetSymbolInfo();
        encodercontext.pos = encodercontext.pos - j;
_L4:
        encodercontext.signalEncoderChange(0);
        return;
_L6:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        encodercontext.writeCodewords(charsequence);
          goto _L4
_L1:
        if (!i || j > 2) goto _L6; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void encode(EncoderContext encodercontext)
    {
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            if (!encodercontext.hasMoreCharacters())
            {
                break;
            }
            encodeChar(encodercontext.getCurrentChar(), stringbuilder);
            encodercontext.pos = encodercontext.pos + 1;
            if (stringbuilder.length() < 4)
            {
                continue;
            }
            encodercontext.writeCodewords(encodeToCodewords(stringbuilder, 0));
            stringbuilder.delete(0, 4);
            if (HighLevelEncoder.lookAheadTest(encodercontext.getMessage(), encodercontext.pos, getEncodingMode()) == getEncodingMode())
            {
                continue;
            }
            encodercontext.signalEncoderChange(0);
            break;
        } while (true);
        stringbuilder.append('\037');
        handleEOD(encodercontext, stringbuilder);
    }

    public int getEncodingMode()
    {
        return 4;
    }
}
