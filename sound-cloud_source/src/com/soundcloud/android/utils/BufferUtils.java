// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BufferUtils
{

    private BufferUtils()
    {
    }

    public static ByteBuffer allocateAudioBuffer(int i)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(i);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bytebuffer;
    }

    public static ByteBuffer clone(ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocate(bytebuffer.capacity());
        bytebuffer.rewind();
        bytebuffer1.put(bytebuffer);
        bytebuffer.rewind();
        bytebuffer1.flip();
        return bytebuffer1;
    }
}
