// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public class ChannelHelper
{

    private static ByteBuffer empty = ByteBuffer.allocate(0).asReadOnlyBuffer();

    public ChannelHelper()
    {
    }

    public static int readFully(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer, int i)
    {
        int j = 0;
_L5:
        int l = readablebytechannel.read(bytebuffer);
        if (-1 != l) goto _L2; else goto _L1
_L1:
        int k;
        if (l == -1)
        {
            throw new EOFException("End of file. No more boxes.");
        } else
        {
            return j;
        }
_L2:
        k = j + l;
        j = k;
        if (k == i) goto _L1; else goto _L3
_L3:
        j = k;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void readFully(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer)
    {
        readFully(readablebytechannel, bytebuffer, bytebuffer.remaining());
    }

}
