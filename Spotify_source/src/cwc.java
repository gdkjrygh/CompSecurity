// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

final class cwc
    implements Runnable
{

    private cwb a;

    private cwc(cwb cwb1)
    {
        a = cwb1;
        super();
    }

    cwc(cwb cwb1, byte byte0)
    {
        this(cwb1);
    }

    public final void run()
    {
        Thread.currentThread().setName("WebsocketWriteThread");
        try
        {
            for (; !Thread.interrupted(); cwb.b(a).flush())
            {
                ByteBuffer bytebuffer = (ByteBuffer)cwb.a(a).b.take();
                cwb.b(a).write(bytebuffer.array(), 0, bytebuffer.limit());
            }

        }
        catch (IOException ioexception)
        {
            cwb.a(a).b();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
