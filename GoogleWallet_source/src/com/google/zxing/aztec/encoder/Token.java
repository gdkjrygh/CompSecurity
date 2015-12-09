// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            SimpleToken, BinaryShiftToken

abstract class Token
{

    static final Token EMPTY = new SimpleToken(null, 0, 0);
    private final Token previous;

    Token(Token token)
    {
        previous = token;
    }

    final Token add(int i, int j)
    {
        return new SimpleToken(this, i, j);
    }

    final Token addBinaryShift(int i, int j)
    {
        return new BinaryShiftToken(this, i, j);
    }

    abstract void appendTo(BitArray bitarray, byte abyte0[]);

    final Token getPrevious()
    {
        return previous;
    }

}
