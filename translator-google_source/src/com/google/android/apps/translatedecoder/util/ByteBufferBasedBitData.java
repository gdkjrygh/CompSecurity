// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            BitData, d, DecoderRuntimeException

public class ByteBufferBasedBitData extends BitData
{

    public static final int CLASS_ID = 1;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x884028502bd656a5L;
    private final LongBuffer lb;
    private final int size;

    public ByteBufferBasedBitData(LongBuffer longbuffer)
    {
        lb = longbuffer;
        size = longbuffer.limit() << 6;
    }

    public static BitData readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        LongBuffer longbuffer = d.a(bytebuffer, i).asLongBuffer();
        bytebuffer.position(i + bytebuffer.position());
        return new ByteBufferBasedBitData(longbuffer);
    }

    public void clear()
    {
        System.exit(1);
    }

    public boolean get(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(25)).append("bitIndex < 0: ").append(i).toString());
        }
        return (lb.get(i / 64) & 1L << i % 64) != 0L;
    }

    public int length()
    {
        return size;
    }

    public int nextSetBit(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder(26)).append("fromIndex < 0: ").append(i).toString());
        }
        int k = i / 64;
        boolean flag = true;
        int l = i % 64;
        long l1 = 0L;
        int j = i;
        i = l;
        do
        {
            if (j >= size)
            {
                break;
            }
            long l2 = l1;
            boolean flag1 = flag;
            if (flag)
            {
                l2 = lb.get(k);
                flag1 = false;
            }
            if ((1L << i & l2) != 0L)
            {
                return j;
            }
            int i1 = j + 1;
            int j1 = i + 1;
            l1 = l2;
            flag = flag1;
            i = j1;
            j = i1;
            if (j1 == 64)
            {
                k++;
                flag = true;
                i = 0;
                l1 = l2;
                j = i1;
            }
        } while (true);
        return -1;
    }

    public void set(int i, boolean flag)
    {
        throw new DecoderRuntimeException("calling unimplemented function");
    }

    public int size()
    {
        return size;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        bytebuffer.putInt((lb.limit() << 6) / 8);
        for (int i = 0; i < lb.limit(); i++)
        {
            bytebuffer.putLong(lb.get());
        }

    }

}
