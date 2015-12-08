// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            Token

final class SimpleToken extends Token
{

    private final short bitCount;
    private final short value;

    SimpleToken(Token token, int i, int j)
    {
        super(token);
        value = (short)i;
        bitCount = (short)j;
    }

    void appendTo(BitArray bitarray, byte abyte0[])
    {
        bitarray.appendBits(value, bitCount);
    }

    public String toString()
    {
        short word0 = value;
        short word1 = bitCount;
        short word2 = bitCount;
        return (new StringBuilder()).append('<').append(Integer.toBinaryString(word0 & (1 << word1) - 1 | 1 << word2 | 1 << bitCount).substring(1)).append('>').toString();
    }
}
