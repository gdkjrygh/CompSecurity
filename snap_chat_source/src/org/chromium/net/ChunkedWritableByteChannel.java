// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

public class ChunkedWritableByteChannel
    implements WritableByteChannel
{

    private final ArrayList a = new ArrayList();
    private int b;
    private boolean c;

    public ChunkedWritableByteChannel()
    {
    }

    public void close()
    {
        c = true;
    }

    public boolean isOpen()
    {
        return !c;
    }

    public int write(ByteBuffer bytebuffer)
    {
        if (c)
        {
            throw new ClosedChannelException();
        } else
        {
            int i = bytebuffer.remaining();
            b = b + i;
            ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(i);
            bytebuffer1.put(bytebuffer).rewind();
            a.add(bytebuffer1);
            return i;
        }
    }
}
