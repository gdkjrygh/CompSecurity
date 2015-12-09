// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.a;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import org.java_websocket.e;

// Referenced classes of package org.java_websocket.a:
//            a

final class b
    implements Runnable
{

    final a a;

    private b(a a1)
    {
        a = a1;
        super();
    }

    b(a a1, byte byte0)
    {
        this(a1);
    }

    public final void run()
    {
        Thread.currentThread().setName("WebsocketWriteThread");
        try
        {
            for (; !Thread.interrupted(); org.java_websocket.a.a.b(a).flush())
            {
                ByteBuffer bytebuffer = (ByteBuffer)org.java_websocket.a.a.a(a).f.take();
                org.java_websocket.a.a.b(a).write(bytebuffer.array(), 0, bytebuffer.limit());
            }

        }
        catch (IOException ioexception)
        {
            org.java_websocket.a.a.a(a).b();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
