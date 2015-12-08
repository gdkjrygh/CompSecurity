// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package org.chromium.net:
//            UploadDataSink, UploadDataProvider, CronetUrlRequest

final class CronetUploadDataStream
    implements UploadDataSink
{

    final long a;
    CronetUrlRequest b;
    long c;
    private final Executor d;
    private final UploadDataProvider e;
    private final Runnable f = new Runnable() {

        private CronetUploadDataStream a;

        public final void run()
        {
label0:
            {
                synchronized (CronetUploadDataStream.a(a))
                {
                    if (CronetUploadDataStream.b(a) != 0L)
                    {
                        break label0;
                    }
                }
                return;
            }
            if (CronetUploadDataStream.c(a))
            {
                throw new IllegalStateException("Unexpected readData call. Already reading.");
            }
            break MISSING_BLOCK_LABEL_50;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            throw exception1;
            if (CronetUploadDataStream.d(a))
            {
                throw new IllegalStateException("Unexpected readData call. Already rewinding.");
            }
            if (CronetUploadDataStream.e(a) == null)
            {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            CronetUploadDataStream.f(a);
            obj;
            JVM INSTR monitorexit ;
            try
            {
                CronetUploadDataStream.g(a).a(a, CronetUploadDataStream.e(a));
                return;
            }
            catch (Exception exception)
            {
                CronetUploadDataStream.a(a, exception);
            }
            return;
        }

            
            {
                a = CronetUploadDataStream.this;
                super();
            }
    };
    private ByteBuffer g;
    private final Object h = new Object();
    private boolean i;
    private boolean j;
    private boolean k;

    public CronetUploadDataStream(UploadDataProvider uploaddataprovider, Executor executor)
    {
        g = null;
        c = 0L;
        i = false;
        j = false;
        k = false;
        d = executor;
        e = uploaddataprovider;
        a = e.a();
    }

    static Object a(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.h;
    }

    private void a(Runnable runnable)
    {
        try
        {
            d.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            b.a(runnable);
        }
    }

    static void a(CronetUploadDataStream cronetuploaddatastream, Exception exception)
    {
        Object obj = cronetuploaddatastream.h;
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
        cronetuploaddatastream.g = null;
        cronetuploaddatastream.d();
        obj;
        JVM INSTR monitorexit ;
        cronetuploaddatastream.b.a(exception);
        return;
    }

    static long b(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.c;
    }

    private void c()
    {
label0:
        {
            synchronized (h)
            {
                if (!i)
                {
                    break label0;
                }
                k = true;
            }
            return;
        }
        if (c != 0L)
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
        nativeDestroyAdapter(c);
        c = 0L;
        obj;
        JVM INSTR monitorexit ;
    }

    static boolean c(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.i;
    }

    private void d()
    {
        Object obj = h;
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
            c();
        }
        obj;
        JVM INSTR monitorexit ;
    }

    static boolean d(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.j;
    }

    static ByteBuffer e(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.g;
    }

    static boolean f(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.i = true;
        return true;
    }

    static UploadDataProvider g(CronetUploadDataStream cronetuploaddatastream)
    {
        return cronetuploaddatastream.e;
    }

    static boolean h(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.j = true;
        return true;
    }

    static void i(CronetUploadDataStream cronetuploaddatastream)
    {
        cronetuploaddatastream.c();
    }

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long l, long l1);

    private static native void nativeDestroyAdapter(long l);

    private native void nativeOnReadSucceeded(long l, int i1, boolean flag);

    private native void nativeOnRewindSucceeded(long l);

    public final void a()
    {
        Object obj = h;
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
        l = g.position();
        g = null;
        i = false;
        d();
        if (c != 0L)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnReadSucceeded(c, l, false);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void b()
    {
        Object obj = h;
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
        if (c != 0L)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeOnRewindSucceeded(c);
        obj;
        JVM INSTR monitorexit ;
    }

    final native long nativeAttachUploadDataToRequest(long l, long l1);

    final void onUploadDataStreamDestroyed()
    {
        a(new Runnable() {

            private CronetUploadDataStream a;

            public final void run()
            {
                CronetUploadDataStream.i(a);
            }

            
            {
                a = CronetUploadDataStream.this;
                super();
            }
        });
    }

    final void readData(ByteBuffer bytebuffer)
    {
        g = bytebuffer;
        a(f);
    }

    final void rewind()
    {
        a(new Runnable() {

            private CronetUploadDataStream a;

            public final void run()
            {
label0:
                {
                    synchronized (CronetUploadDataStream.a(a))
                    {
                        if (CronetUploadDataStream.b(a) != 0L)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                if (CronetUploadDataStream.c(a))
                {
                    throw new IllegalStateException("Unexpected rewind call. Already reading");
                }
                break MISSING_BLOCK_LABEL_50;
                exception1;
                obj;
                JVM INSTR monitorexit ;
                throw exception1;
                if (CronetUploadDataStream.d(a))
                {
                    throw new IllegalStateException("Unexpected rewind call. Already rewinding");
                }
                CronetUploadDataStream.h(a);
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    CronetUploadDataStream.g(a).a(a);
                    return;
                }
                catch (Exception exception)
                {
                    CronetUploadDataStream.a(a, exception);
                }
                return;
            }

            
            {
                a = CronetUploadDataStream.this;
                super();
            }
        });
    }
}
