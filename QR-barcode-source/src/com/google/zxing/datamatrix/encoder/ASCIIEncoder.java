// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            Encoder, HighLevelEncoder, EncoderContext

final class ASCIIEncoder
    implements Encoder
{

    ASCIIEncoder()
    {
    }

    private static char encodeASCIIDigits(char c, char c1)
    {
        if (HighLevelEncoder.isDigit(c) && HighLevelEncoder.isDigit(c1))
        {
            return (char)((c - 48) * 10 + (c1 - 48) + 130);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("not digits: ").append(c).append(c1).toString());
        }
    }

    public void encode(EncoderContext encodercontext)
    {
        if (HighLevelEncoder.determineConsecutiveDigitCount(encodercontext.getMessage(), encodercontext.pos) >= 2)
        {
            encodercontext.writeCodeword(encodeASCIIDigits(encodercontext.getMessage().charAt(encodercontext.pos), encodercontext.getMessage().charAt(encodercontext.pos + 1)));
            encodercontext.pos = encodercontext.pos + 2;
            return;
        }
        char c = encodercontext.getCurrentChar();
        int i = HighLevelEncoder.lookAheadTest(encodercontext.getMessage(), encodercontext.pos, getEncodingMode());
        if (i != getEncodingMode())
        {
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Illegal mode: ").append(i).toString());

            case 5: // '\005'
                encodercontext.writeCodeword('\347');
                encodercontext.signalEncoderChange(5);
                return;

            case 1: // '\001'
                encodercontext.writeCodeword('\346');
                encodercontext.signalEncoderChange(1);
                return;

            case 3: // '\003'
                encodercontext.writeCodeword('\356');
                encodercontext.signalEncoderChange(3);
                return;

            case 2: // '\002'
                encodercontext.writeCodeword('\357');
                encodercontext.signalEncoderChange(2);
                return;

            case 4: // '\004'
                encodercontext.writeCodeword('\360');
                encodercontext.signalEncoderChange(4);
                return;
            }
        }
        if (HighLevelEncoder.isExtendedASCII(c))
        {
            encodercontext.writeCodeword('\353');
            encodercontext.writeCodeword((char)((c - 128) + 1));
            encodercontext.pos = encodercontext.pos + 1;
            return;
        } else
        {
            encodercontext.writeCodeword((char)(c + 1));
            encodercontext.pos = encodercontext.pos + 1;
            return;
        }
    }

    public int getEncodingMode()
    {
        return 0;
    }
}
