// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.Serializable;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            ByteBufferBasedBitData, DecoderRuntimeException

public abstract class BitData
    implements Serializable
{

    private static final long serialVersionUID = 0x3ae176ad111e5747L;

    public BitData()
    {
    }

    public static BitData readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ByteBufferBasedBitData.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(28)).append("unknown class id ").append(i).toString());
        }
    }

    public abstract void clear();

    public abstract boolean get(int i);

    public abstract int length();

    public abstract int nextSetBit(int i);

    public void set(int i)
    {
        set(i, true);
    }

    public abstract void set(int i, boolean flag);

    public abstract int size();

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);
}
