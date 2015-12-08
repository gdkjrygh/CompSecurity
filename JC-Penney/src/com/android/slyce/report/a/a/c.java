// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a.a;

import com.android.slyce.report.a.e;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.slyce.report.a.a:
//            a, b

class c
    implements Runnable
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super();
    }

    c(a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        Thread.currentThread().setName("WebsocketWriteThread");
        try
        {
            for (; !Thread.interrupted(); com.android.slyce.report.a.a.a.b(a).flush())
            {
                ByteBuffer bytebuffer = (ByteBuffer)com.android.slyce.report.a.a.a.a(a).f.take();
                com.android.slyce.report.a.a.a.b(a).write(bytebuffer.array(), 0, bytebuffer.limit());
            }

        }
        catch (IOException ioexception)
        {
            com.android.slyce.report.a.a.a.a(a).b();
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
