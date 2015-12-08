// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            Encoder, EncoderContext, HighLevelEncoder, SymbolInfo

final class Base256Encoder
    implements Encoder
{

    Base256Encoder()
    {
    }

    private static char randomize255State(char c, int i)
    {
        c = (i * 149) % 255 + 1 + c;
        if (c <= '\377')
        {
            return (char)c;
        } else
        {
            return (char)(c - 256);
        }
    }

    public void encode(EncoderContext encodercontext)
    {
        boolean flag = false;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('\0');
        do
        {
            if (!encodercontext.hasMoreCharacters())
            {
                break;
            }
            stringbuilder.append(encodercontext.getCurrentChar());
            encodercontext.pos = encodercontext.pos + 1;
            int i = HighLevelEncoder.lookAheadTest(encodercontext.getMessage(), encodercontext.pos, getEncodingMode());
            if (i == getEncodingMode())
            {
                continue;
            }
            encodercontext.signalEncoderChange(i);
            break;
        } while (true);
        int k = stringbuilder.length() - 1;
        int j = encodercontext.getCodewordCount() + k + 1;
        encodercontext.updateSymbolInfo(j);
        if (encodercontext.getSymbolInfo().getDataCapacity() - j > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (encodercontext.hasMoreCharacters() || j != 0)
        {
            if (k <= 249)
            {
                stringbuilder.setCharAt(0, (char)k);
            } else
            if (k > 249 && k <= 1555)
            {
                stringbuilder.setCharAt(0, (char)(k / 250 + 249));
                stringbuilder.insert(1, (char)(k % 250));
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Message length not in valid ranges: ").append(k).toString());
            }
        }
        k = stringbuilder.length();
        for (j = ((flag) ? 1 : 0); j < k; j++)
        {
            encodercontext.writeCodeword(randomize255State(stringbuilder.charAt(j), encodercontext.getCodewordCount() + 1));
        }

    }

    public int getEncodingMode()
    {
        return 5;
    }
}
