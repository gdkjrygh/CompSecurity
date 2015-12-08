// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            Encoder, EncoderContext, SymbolInfo, HighLevelEncoder

class C40Encoder
    implements Encoder
{

    C40Encoder()
    {
    }

    private int backtrackOneCharacter(EncoderContext encodercontext, StringBuilder stringbuilder, StringBuilder stringbuilder1, int i)
    {
        int j = stringbuilder.length();
        stringbuilder.delete(j - i, j);
        encodercontext.pos = encodercontext.pos - 1;
        i = encodeChar(encodercontext.getCurrentChar(), stringbuilder1);
        encodercontext.resetSymbolInfo();
        return i;
    }

    private static String encodeToCodewords(CharSequence charsequence, int i)
    {
        i = charsequence.charAt(i) * 1600 + charsequence.charAt(i + 1) * 40 + charsequence.charAt(i + 2) + 1;
        return new String(new char[] {
            (char)(i / 256), (char)(i % 256)
        });
    }

    static void writeNextTriplet(EncoderContext encodercontext, StringBuilder stringbuilder)
    {
        encodercontext.writeCodewords(encodeToCodewords(stringbuilder, 0));
        stringbuilder.delete(0, 3);
    }


// JavaClassFileOutputException: Prev chain is broken

    int encodeChar(char c, StringBuilder stringbuilder)
    {
        if (c == ' ')
        {
            stringbuilder.append('\003');
            return 1;
        }
        if (c >= '0' && c <= '9')
        {
            stringbuilder.append((char)((c - 48) + 4));
            return 1;
        }
        if (c >= 'A' && c <= 'Z')
        {
            stringbuilder.append((char)((c - 65) + 14));
            return 1;
        }
        if (c >= 0 && c <= '\037')
        {
            stringbuilder.append('\0');
            stringbuilder.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)(c - 33));
            return 2;
        }
        if (c >= ':' && c <= '@')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)((c - 58) + 15));
            return 2;
        }
        if (c >= '[' && c <= '_')
        {
            stringbuilder.append('\001');
            stringbuilder.append((char)((c - 91) + 22));
            return 2;
        }
        if (c >= '`' && c <= '\177')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)(c - 96));
            return 2;
        }
        if (c >= '\200')
        {
            stringbuilder.append("\001\036");
            return encodeChar((char)(c - 128), stringbuilder) + 2;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal character: ").append(c).toString());
        }
    }

    public int getEncodingMode()
    {
        return 1;
    }

    void handleEOD(EncoderContext encodercontext, StringBuilder stringbuilder)
    {
        int i;
        int j;
        j = stringbuilder.length() / 3;
        i = stringbuilder.length() % 3;
        j = j * 2 + encodercontext.getCodewordCount();
        encodercontext.updateSymbolInfo(j);
        j = encodercontext.getSymbolInfo().getDataCapacity() - j;
        if (i != 2) goto _L2; else goto _L1
_L1:
        stringbuilder.append('\0');
        for (; stringbuilder.length() >= 3; writeNextTriplet(encodercontext, stringbuilder)) { }
        if (encodercontext.hasMoreCharacters())
        {
            encodercontext.writeCodeword('\376');
        }
_L4:
        encodercontext.signalEncoderChange(0);
        return;
_L2:
        if (j == 1 && i == 1)
        {
            for (; stringbuilder.length() >= 3; writeNextTriplet(encodercontext, stringbuilder)) { }
            if (encodercontext.hasMoreCharacters())
            {
                encodercontext.writeCodeword('\376');
            }
            encodercontext.pos = encodercontext.pos - 1;
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; stringbuilder.length() >= 3; writeNextTriplet(encodercontext, stringbuilder)) { }
        if (j > 0 || encodercontext.hasMoreCharacters())
        {
            encodercontext.writeCodeword('\376');
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalStateException("Unexpected case. Please report!");
    }
}
