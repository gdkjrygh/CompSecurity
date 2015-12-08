// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            C40Encoder, HighLevelEncoder

final class TextEncoder extends C40Encoder
{

    TextEncoder()
    {
    }

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
        if (c >= 'a' && c <= 'z')
        {
            stringbuilder.append((char)((c - 97) + 14));
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
        if (c == '`')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)(c - 96));
            return 2;
        }
        if (c >= 'A' && c <= 'Z')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)((c - 65) + 1));
            return 2;
        }
        if (c >= '{' && c <= '\177')
        {
            stringbuilder.append('\002');
            stringbuilder.append((char)((c - 123) + 27));
            return 2;
        }
        if (c >= '\200')
        {
            stringbuilder.append("\001\036");
            return encodeChar((char)(c - 128), stringbuilder) + 2;
        } else
        {
            HighLevelEncoder.illegalCharacter(c);
            return -1;
        }
    }

    public int getEncodingMode()
    {
        return 2;
    }
}
