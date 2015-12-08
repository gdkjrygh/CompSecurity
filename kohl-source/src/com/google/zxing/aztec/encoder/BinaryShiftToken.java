// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            Token

final class BinaryShiftToken extends Token
{

    private final short binaryShiftByteCount;
    private final short binaryShiftStart;

    BinaryShiftToken(Token token, int i, int j)
    {
        super(token);
        binaryShiftStart = (short)i;
        binaryShiftByteCount = (short)j;
    }

    public void appendTo(BitArray bitarray, byte abyte0[])
    {
        int i = 0;
        while (i < binaryShiftByteCount) 
        {
            if (i == 0 || i == 31 && binaryShiftByteCount <= 62)
            {
                bitarray.appendBits(31, 5);
                if (binaryShiftByteCount > 62)
                {
                    bitarray.appendBits(binaryShiftByteCount - 31, 16);
                } else
                if (i == 0)
                {
                    bitarray.appendBits(Math.min(binaryShiftByteCount, 31), 5);
                } else
                {
                    bitarray.appendBits(binaryShiftByteCount - 31, 5);
                }
            }
            bitarray.appendBits(abyte0[binaryShiftStart + i], 8);
            i++;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("<").append(binaryShiftStart).append("::").append((binaryShiftStart + binaryShiftByteCount) - 1).append('>').toString();
    }
}
