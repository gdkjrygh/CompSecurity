// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

// Referenced classes of package com.amobee.pulse3d:
//            BufferView

class BufferViewIterator
{

    private BufferView buffer_;
    private int byteOffset_;

    BufferViewIterator(BufferView bufferview)
    {
        byteOffset_ = 0;
        buffer_ = bufferview;
    }

    int getPosition()
    {
        return byteOffset_;
    }

    String parseAlignedASCIIStringWithLength()
    {
        buffer_.asInt.position(byteOffset_ >> 2);
        int i = buffer_.asInt.get();
        byteOffset_ = byteOffset_ + 4;
        byte abyte0[] = new byte[i];
        System.arraycopy(buffer_.byteArray, byteOffset_, abyte0, 0, i);
        byteOffset_ = byteOffset_ + i;
        if (i % 4 > 0)
        {
            byteOffset_ = byteOffset_ + (4 - i % 4);
        }
        return new String(abyte0);
    }

    float parseFloat()
    {
        buffer_.asFloat.position(byteOffset_ >> 2);
        byteOffset_ = byteOffset_ + 4;
        return buffer_.asFloat.get();
    }

    float[] parseFloatArray(int i)
    {
        float af[] = new float[i];
        buffer_.asFloat.position(byteOffset_ >> 2);
        buffer_.asFloat.get(af, 0, i);
        byteOffset_ = byteOffset_ + i * 4;
        return af;
    }

    float[] parseFloatBufferWithByteLength()
    {
        int i = parseInt();
        float af[] = new float[i / 4];
        buffer_.asFloat.position(byteOffset_ >> 2);
        buffer_.asFloat.get(af, 0, i / 4);
        byteOffset_ = byteOffset_ + i;
        return af;
    }

    int parseInt()
    {
        buffer_.asInt.position(byteOffset_ >> 2);
        byteOffset_ = byteOffset_ + 4;
        return buffer_.asInt.get();
    }

    short parseInt16()
    {
        buffer_.asShort.position(byteOffset_ >> 1);
        byteOffset_ = byteOffset_ + 2;
        return buffer_.asShort.get();
    }

    short[] parseInt16BufferWithByteLength()
    {
        int i = parseInt();
        short aword0[] = new short[i / 2];
        buffer_.asShort.position(byteOffset_ >> 1);
        buffer_.asShort.get(aword0, 0, i / 2);
        byteOffset_ = byteOffset_ + i;
        if (i % 4 > 0)
        {
            byteOffset_ = byteOffset_ + (4 - i % 4);
        }
        return aword0;
    }

    byte[] parseInt8BufferWithByteLength()
    {
        int i = parseInt();
        byte abyte0[] = new byte[i];
        System.arraycopy(buffer_.byteArray, byteOffset_, abyte0, 0, i);
        byteOffset_ = byteOffset_ + i;
        if (i % 4 > 0)
        {
            byteOffset_ = byteOffset_ + (4 - i % 4);
        }
        return abyte0;
    }

    int[] parseIntArray(int i)
    {
        int ai[] = new int[i];
        buffer_.asInt.position(byteOffset_ >> 2);
        buffer_.asInt.get(ai, 0, i);
        byteOffset_ = byteOffset_ + i * 4;
        return ai;
    }

    int[] parseIntBufferWithByteLength()
    {
        int i = parseInt();
        int ai[] = new int[i / 4];
        buffer_.asInt.position(byteOffset_ >> 2);
        buffer_.asInt.get(ai, 0, i / 4);
        byteOffset_ = byteOffset_ + i;
        return ai;
    }

    String parseUnalignedASCIIStringWithLength()
    {
        buffer_.asInt.position(byteOffset_ >> 2);
        int i = buffer_.asInt.get();
        byteOffset_ = byteOffset_ + 4;
        byte abyte0[] = new byte[i];
        System.arraycopy(buffer_.byteArray, byteOffset_, abyte0, 0, i);
        byteOffset_ = byteOffset_ + i;
        return new String(abyte0);
    }
}
