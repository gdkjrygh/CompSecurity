// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class but
    implements ded
{

    private static final String b = but.getSimpleName();
    final MediaMuxer a;
    private final Object c = new Object();
    private final CountDownLatch d;
    private boolean e;
    private volatile boolean f;

    public but(MediaMuxer mediamuxer, int i)
    {
        a = (MediaMuxer)b.a(mediamuxer, "mediaMuxer", null);
        d = new CountDownLatch(b.a(i, "trackCount"));
    }

    public final int a(MediaFormat mediaformat)
    {
        int i = a.addTrack(mediaformat);
        d.countDown();
        return i;
    }

    public final void a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        b();
        if (!e)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        e = false;
        a.stop();
_L2:
        obj;
        JVM INSTR monitorexit ;
        a.release();
        return;
        Object obj3;
        obj3;
        throw new buu(((Throwable) (obj3)));
        obj3;
        obj1;
        JVM INSTR monitorexit ;
        throw obj3;
        Object obj2;
        obj2;
        Log.e(b, "await() failed", ((Throwable) (obj2)));
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
    }

    public final void a(int i, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        d.await();
        if (f)
        {
            throw new InterruptedException();
        }
        synchronized (c)
        {
            if (!e)
            {
                e = true;
                a.start();
            }
        }
        a.writeSampleData(i, bytebuffer, bufferinfo);
        return;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
    }

    public final void b()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (!e)
        {
            f = true;
            for (; d.getCount() > 0L; d.countDown()) { }
        }
        break MISSING_BLOCK_LABEL_46;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

}
