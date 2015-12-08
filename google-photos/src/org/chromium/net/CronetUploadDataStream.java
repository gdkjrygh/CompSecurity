// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import qxa;
import qxb;
import qxc;

// Referenced classes of package org.chromium.net:
//            UploadDataSink, UploadDataProvider, CronetUrlRequest

public final class CronetUploadDataStream
    implements UploadDataSink
{

    private final Executor a;
    private final UploadDataProvider b;
    private final long c;
    private CronetUrlRequest d;
    private final Runnable e = new qxa(this);
    private ByteBuffer f;
    private final Object g = new Object();
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;

    public CronetUploadDataStream(UploadDataProvider uploaddataprovider, Executor executor)
    {
        f = null;
        h = 0L;
        i = false;
        j = false;
        k = false;
        a = executor;
        b = uploaddataprovider;
        c = b.a();
    }

    public static Object a(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.g;
    }

    private void a(Runnable runnable)
    {
        try
        {
            a.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            d.a(runnable);
        }
    }

    public static void a(CronetUploadDataStream cronetuploaddatastream, Exception exception)
    {
        Object obj = cronetuploaddatastream.g;
        obj;
        JVM INSTR monitorenter ;
        if (!cronetuploaddatastream.i && !cronetuploaddatastream.j)
        {
            throw new IllegalStateException("There is no read or rewind in progress.");
        }
        break MISSING_BLOCK_LABEL_36;
        cronetuploaddatastream;
        obj;
        JVM INSTR monitorexit ;
        throw cronetuploaddatastream;
        cronetuploaddatastream.i = false;
        cronetuploaddatastream.j = false;
        cronetuploaddatastream.f = null;
        cronetuploaddatastream.c();
        obj;
        JVM INSTR monitorexit ;
        cronetuploaddatastream.d.a(exception);
        return;
    }

    public static boolean a(CronetUploadDataStream cronetuploaddatastream, boolean flag)
    {
        cronetuploaddatastream.i = true;
        return true;
    }

    public static long b(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.h;
    }

    private void b()
    {
label0:
        {
            synchronized (g)
            {
                if (!i)
                {
                    break label0;
                }
                k = true;
            }
            return;
        }
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        nativeDestroyAdapter(h);
        h = 0L;
        obj;
        JVM INSTR monitorexit ;
    }

    public static boolean b(CronetUploadDataStream cronetuploaddatastream, boolean flag)
    {
        cronetuploaddatastream.j = true;
        return true;
    }

    private void c()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (i)
        {
            throw new IllegalStateException("Method should not be called when read has not completed.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (k)
        {
            b();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public static boolean c(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.i;
    }

    public static boolean d(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.j;
    }

    public static ByteBuffer e(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.f;
    }

    public static UploadDataProvider f(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.b;
    }

    public static void g(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.b();
    }

    private native long nativeAttachUploadDataToRequest(long l, long l1);

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long l, long l1);

    private static native void nativeDestroyAdapter(long l);

    private native void nativeOnReadSucceeded(long l, int i1, boolean flag);

    private native void nativeOnRewindSucceeded(long l);

    public final void a()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Non-existent rewind succeeded.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        j = false;
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnRewindSucceeded(h);
        obj;
        JVM INSTR monitorexit ;
    }

    final void a(CronetUrlRequest croneturlrequest, long l)
    {
        d = croneturlrequest;
        h = nativeAttachUploadDataToRequest(l, c);
    }

    public final void a(boolean flag)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!i)
        {
            throw new IllegalStateException("Non-existent read succeeded.");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int l;
        l = f.position();
        f = null;
        i = false;
        c();
        if (h != 0L)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnReadSucceeded(h, l, false);
        obj;
        JVM INSTR monitorexit ;
    }

    final void onUploadDataStreamDestroyed()
    {
        a(new qxc(this));
    }

    final void readData(ByteBuffer bytebuffer)
    {
        f = bytebuffer;
        a(e);
    }

    final void rewind()
    {
        a(new qxb(this));
    }
}
