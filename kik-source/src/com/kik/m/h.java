// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.util.ByteArrayBuffer;

// Referenced classes of package com.kik.m:
//            i

public final class h
{
    public static interface a
    {

        public abstract void a(ByteArrayBuffer bytearraybuffer, byte abyte0[], int j);
    }

    private static final class b
        implements a
    {

        public final void a(ByteArrayBuffer bytearraybuffer, byte abyte0[], int j)
        {
            bytearraybuffer.append(abyte0, 0, j);
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final ScheduledExecutorService a = Executors.newScheduledThreadPool(2);

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static byte[] a(HttpEntity httpentity)
    {
        return a(httpentity, ((a) (new b((byte)0))));
    }

    private static byte[] a(HttpEntity httpentity, a a1)
    {
        httpentity = a.submit(new i(httpentity, a1));
        a1 = (byte[])httpentity.get(10000L, TimeUnit.MILLISECONDS);
        return a1;
        a1;
        httpentity.cancel(true);
_L2:
        return null;
        a1;
        httpentity.cancel(true);
        continue; /* Loop/switch isn't completed */
        a1;
        httpentity.cancel(true);
        if (true) goto _L2; else goto _L1
_L1:
    }

}
