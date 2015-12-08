// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.Deque;

final class okz
    implements oky
{

    private boolean a;
    private okx b;

    okz(okx okx1)
    {
        b = okx1;
        super();
        a = true;
    }

    public final boolean a(int i)
    {
        Object obj = b.a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (b.c >= i || b.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void close()
    {
        a = false;
    }

    public final boolean isOpen()
    {
        return a;
    }

    public final int read(ByteBuffer bytebuffer)
    {
        if (!a)
        {
            throw new ClosedChannelException();
        }
        Object obj = b.a;
        obj;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer1 = (ByteBuffer)b.d.pollFirst();
        if (bytebuffer1 == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        int i;
        i = Math.min(bytebuffer.remaining(), bytebuffer1.remaining());
        int j = bytebuffer1.limit();
        bytebuffer1.limit(bytebuffer1.position() + i);
        bytebuffer.put(bytebuffer1);
        bytebuffer1.limit(j);
        if (bytebuffer1.hasRemaining())
        {
            b.d.addFirst(bytebuffer1);
        }
        b.c = b.c - i;
        obj;
        JVM INSTR monitorexit ;
        return i;
        if (b.f.isOpen())
        {
            i = 0;
        } else
        {
            i = -1;
        }
        obj;
        JVM INSTR monitorexit ;
        return i;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
    }
}
