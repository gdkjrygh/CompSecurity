// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package org.chromium.net:
//            HttpUrlRequest

public class ChromiumUrlRequest
    implements HttpUrlRequest
{
    static class ResponseHeadersMap extends HashMap
    {

        private ResponseHeadersMap()
        {
        }
    }


    private final WritableByteChannel a;
    private volatile boolean b;
    private volatile boolean c;
    private boolean d;
    private boolean e;
    private long f;
    private int g;
    private long h;
    private int i;
    private final Object j;

    private void a()
    {
label0:
        {
            synchronized (j)
            {
                if (!b)
                {
                    break label0;
                }
            }
            return;
        }
        b = true;
        if (0L == 0L)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        nativeCancel(0L);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Exception exception)
    {
        new IOException("CalledByNative method has thrown an exception", exception);
        try
        {
            a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return;
        }
    }

    private void finish()
    {
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        c = true;
        if (0L != 0L)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        try
        {
            a.close();
        }
        catch (IOException ioexception) { }
        i = nativeGetErrorCode(0L);
        nativeGetErrorString(0L);
        if (i != 0)
        {
            g = nativeGetHttpStatusCode(0L);
            nativeGetHttpStatusText(0L);
        }
        nativeDestroyRequestAdapter(0L);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            new IOException("Exception in finish", exception);
        }
        return;
    }

    private native void nativeAddHeader(long l, String s, String s1);

    private native void nativeAppendChunk(long l, ByteBuffer bytebuffer, int k, boolean flag);

    private native void nativeCancel(long l);

    private native long nativeCreateRequestAdapter(long l, String s, int k);

    private native void nativeDestroyRequestAdapter(long l);

    private native void nativeDisableRedirects(long l);

    private native void nativeEnableChunkedUpload(long l, String s);

    private native void nativeGetAllHeaders(long l, ResponseHeadersMap responseheadersmap);

    private native long nativeGetContentLength(long l);

    private native String nativeGetContentType(long l);

    private native int nativeGetErrorCode(long l);

    private native String nativeGetErrorString(long l);

    private native String nativeGetHeader(long l, String s);

    private native int nativeGetHttpStatusCode(long l);

    private native String nativeGetHttpStatusText(long l);

    private native String nativeGetNegotiatedProtocol(long l);

    private native boolean nativeGetWasCached(long l);

    private native void nativeSetMethod(long l, String s);

    private native void nativeSetUploadChannel(long l, String s, long l1);

    private native void nativeSetUploadData(long l, String s, byte abyte0[]);

    private native void nativeStart(long l);

    private void onAppendResponseHeader(ResponseHeadersMap responseheadersmap, String s, String s1)
    {
        try
        {
            if (!responseheadersmap.containsKey(s))
            {
                responseheadersmap.put(s, new ArrayList());
            }
            ((List)responseheadersmap.get(s)).add(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ResponseHeadersMap responseheadersmap)
        {
            a(responseheadersmap);
        }
    }

    private void onBytesRead(ByteBuffer bytebuffer)
    {
        boolean flag;
        flag = true;
        int k;
        try
        {
            if (d)
            {
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            a(bytebuffer);
            return;
        }
        k = bytebuffer.remaining();
        f = f + (long)k;
        if (e)
        {
            if (f <= 0L)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            e = false;
            bytebuffer.position((int)(0L - (f - (long)k)));
        }
        if (0L == 0L) goto _L2; else goto _L1
_L1:
        if (f <= 0L) goto _L2; else goto _L3
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        bytebuffer.limit(k - (int)f);
        for (; bytebuffer.hasRemaining(); a.write(bytebuffer)) { }
        break; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        d = true;
        a();
    }

    private void onResponseStarted()
    {
        g = nativeGetHttpStatusCode(0L);
        nativeGetHttpStatusText(0L);
        nativeGetContentType(0L);
        h = nativeGetContentLength(0L);
        if (0L == 0L)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (g == 200)
        {
            if (h != -1L)
            {
                h = h;
            }
            e = true;
            return;
        }
        try
        {
            f = 0L;
            return;
        }
        catch (Exception exception)
        {
            a(exception);
        }
    }

    private int readFromUploadChannel(ByteBuffer bytebuffer)
    {
        return -1;
    }
}
