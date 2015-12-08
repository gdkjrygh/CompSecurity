// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.Deque;

final class ola
    implements WritableByteChannel
{

    private boolean a;
    private okx b;

    ola(okx okx1)
    {
        b = okx1;
        super();
        a = true;
    }

    public final void close()
    {
        a = false;
        synchronized (b.a)
        {
            b.b = true;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean isOpen()
    {
        return a;
    }

    public final int write(ByteBuffer bytebuffer)
    {
        if (!a)
        {
            throw new ClosedChannelException();
        }
        if (bytebuffer.hasRemaining())
        {
            int i = bytebuffer.remaining();
            ByteBuffer bytebuffer1 = ByteBuffer.allocate(i);
            bytebuffer1.put(bytebuffer);
            bytebuffer1.rewind();
            synchronized (b.a)
            {
                b.d.addLast(bytebuffer1);
                b.c = b.c + i;
            }
            return i;
        } else
        {
            return 0;
        }
        exception;
        bytebuffer;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
