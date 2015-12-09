// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.common.hash:
//            Hasher

abstract class AbstractByteHasher extends Hasher
{

    private final ByteBuffer scratch;

    AbstractByteHasher()
    {
        scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private Hasher update(int i)
    {
        update(scratch.array(), 0, i);
        scratch.clear();
        return this;
        Exception exception;
        exception;
        scratch.clear();
        throw exception;
    }

    public final Hasher putChar(char c)
    {
        scratch.putChar(c);
        return update(2);
    }

    protected abstract void update(byte byte0);

    protected void update(byte abyte0[], int i, int j)
    {
        for (int k = i; k < i + j; k++)
        {
            update(abyte0[k]);
        }

    }
}
