// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.chromium.net:
//            HttpUrlRequest, ChromiumUrlRequestContext, ChunkedWritableByteChannel, HttpUrlRequestListener, 
//            ResponseTooLargeException

public class ChromiumUrlRequest
    implements HttpUrlRequest
{

    private int A;
    private String B;
    private String C;
    private long D;
    private int E;
    private String F;
    private final Object G;
    private long a;
    private final ChromiumUrlRequestContext b;
    private final String c;
    private final int d;
    private final Map e;
    private final WritableByteChannel f;
    private Map g;
    private String h;
    private String i;
    private byte j[];
    private ReadableByteChannel k;
    private boolean l;
    private IOException m;
    private volatile boolean n;
    private volatile boolean o;
    private volatile boolean p;
    private boolean q;
    private long r;
    private final HttpUrlRequestListener s;
    private boolean t;
    private long u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private long z;

    public ChromiumUrlRequest(ChromiumUrlRequestContext chromiumurlrequestcontext, String s1, int i1, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        int j1;
        j1 = 0;
        super();
        A = 0;
        E = 0;
        G = new Object();
        if (chromiumurlrequestcontext == null)
        {
            throw new NullPointerException("Context is required");
        }
        if (s1 == null)
        {
            throw new NullPointerException("URL is required");
        }
        b = chromiumurlrequestcontext;
        c = s1;
        i1;
        JVM INSTR tableswitch 0 4: default 100
    //                   0 103
    //                   1 151
    //                   2 157
    //                   3 163
    //                   4 169;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j1 = 3;
_L8:
        d = j1;
        e = map;
        f = writablebytechannel;
        a = nativeCreateRequestAdapter(b.a, c, d);
        s = httpurlrequestlistener;
        return;
_L3:
        j1 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        j1 = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        j1 = 4;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public ChromiumUrlRequest(ChromiumUrlRequestContext chromiumurlrequestcontext, String s1, int i1, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        this(chromiumurlrequestcontext, s1, i1, map, ((WritableByteChannel) (new ChunkedWritableByteChannel())), httpurlrequestlistener);
        t = true;
    }

    private void a(Exception exception)
    {
        m = new IOException("CalledByNative method has thrown an exception", exception);
        Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
        try
        {
            h();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.e("ChromiumNetwork", "Exception trying to cancel request", exception);
        }
    }

    private static void c(String s1)
    {
        if (s1 == null)
        {
            throw new NullPointerException("contentType is required");
        } else
        {
            return;
        }
    }

    private void finish()
    {
label0:
        {
            synchronized (G)
            {
                p = true;
                if (a != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        Exception exception;
        try
        {
            f.close();
        }
        catch (IOException ioexception1) { }
        try
        {
            if (k != null && k.isOpen())
            {
                k.close();
            }
        }
        catch (IOException ioexception) { }
        E = nativeGetErrorCode(a);
        F = nativeGetErrorString(a);
        if (E != 0)
        {
            A = nativeGetHttpStatusCode(a);
            B = nativeGetHttpStatusText(a);
        }
        s.b(this);
        nativeDestroyRequestAdapter(a);
        a = 0L;
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
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            m = new IOException("Exception in finish", exception);
        }
        return;
    }

    private void n()
    {
        x = true;
        h();
    }

    private native void nativeAddHeader(long l1, String s1, String s2);

    private native void nativeAppendChunk(long l1, ByteBuffer bytebuffer, int i1, boolean flag);

    private native void nativeCancel(long l1);

    private native long nativeCreateRequestAdapter(long l1, String s1, int i1);

    private native void nativeDestroyRequestAdapter(long l1);

    private native void nativeDisableRedirects(long l1);

    private native void nativeEnableChunkedUpload(long l1, String s1);

    private native void nativeGetAllHeaders(long l1, ResponseHeadersMap responseheadersmap);

    private native long nativeGetContentLength(long l1);

    private native String nativeGetContentType(long l1);

    private native int nativeGetErrorCode(long l1);

    private native String nativeGetErrorString(long l1);

    private native String nativeGetHeader(long l1, String s1);

    private native int nativeGetHttpStatusCode(long l1);

    private native String nativeGetHttpStatusText(long l1);

    private native String nativeGetNegotiatedProtocol(long l1);

    private native boolean nativeGetWasCached(long l1);

    private native void nativeSetMethod(long l1, String s1);

    private native void nativeSetUploadChannel(long l1, String s1, long l2);

    private native void nativeSetUploadData(long l1, String s1, byte abyte0[]);

    private native void nativeStart(long l1);

    private void o()
    {
        if (a == 0L)
        {
            throw new IllegalStateException("Adapter has been destroyed");
        } else
        {
            return;
        }
    }

    private void onAppendResponseHeader(ResponseHeadersMap responseheadersmap, String s1, String s2)
    {
        try
        {
            if (!responseheadersmap.containsKey(s1))
            {
                responseheadersmap.put(s1, new ArrayList());
            }
            ((List)responseheadersmap.get(s1)).add(s2);
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
        boolean flag1 = false;
        int i1;
        try
        {
            if (x)
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
        i1 = bytebuffer.remaining();
        z = z + (long)i1;
        if (y)
        {
            if (z <= u)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            y = false;
            bytebuffer.position((int)(u - (z - (long)i1)));
        }
        flag = flag1;
        if (v == 0L)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        flag = flag1;
        if (z > v)
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        bytebuffer.limit(i1 - (int)(z - v));
        for (; bytebuffer.hasRemaining(); f.write(bytebuffer)) { }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        n();
    }

    private void onResponseStarted()
    {
        Object obj;
        int i1;
        try
        {
            A = nativeGetHttpStatusCode(a);
            B = nativeGetHttpStatusText(a);
            C = nativeGetContentType(a);
            D = nativeGetContentLength(a);
            q = true;
            if (v > 0L && D > v && w)
            {
                n();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Exception) (obj)));
            return;
        }
        if (!t || D == -1L || x)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj = (ChunkedWritableByteChannel)f;
        i1 = (int)D;
        if (!((ChunkedWritableByteChannel) (obj)).a.isEmpty() || ((ChunkedWritableByteChannel) (obj)).b != null)
        {
            throw new IllegalStateException();
        }
        obj.b = ByteBuffer.allocateDirect(i1);
        if (u != 0L)
        {
            if (A != 200)
            {
                break MISSING_BLOCK_LABEL_224;
            }
            if (D != -1L)
            {
                D = D - u;
            }
            y = true;
        }
_L2:
        s.a(this);
        return;
        z = u;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void p()
    {
        if (n)
        {
            throw new IllegalStateException("Request already started");
        } else
        {
            return;
        }
    }

    private void q()
    {
        if (!q)
        {
            throw new IllegalStateException("Response headers not available");
        } else
        {
            return;
        }
    }

    private int readFromUploadChannel(ByteBuffer bytebuffer)
    {
        int i1;
        if (k == null || !k.isOpen())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        int j1;
        try
        {
            j1 = k.read(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            a(bytebuffer);
            return -1;
        }
        i1 = j1;
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        k.close();
        return 0;
        i1 = -1;
        return i1;
    }

    public final long a()
    {
        return D;
    }

    public final void a(long l1)
    {
        u = l1;
        if (l1 != 0L)
        {
            String s1 = (new StringBuilder("bytes=")).append(l1).append("-").toString();
            synchronized (G)
            {
                p();
                if (g == null)
                {
                    g = new HashMap();
                }
                g.put("Range", s1);
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l1, boolean flag)
    {
        v = l1;
        w = flag;
    }

    public final void a(String s1)
    {
        p();
        i = s1;
    }

    public final void a(String s1, ReadableByteChannel readablebytechannel, long l1)
    {
        synchronized (G)
        {
            p();
            c(s1);
            h = s1;
            k = readablebytechannel;
            r = l1;
            j = null;
            l = false;
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a(String s1, byte abyte0[])
    {
        synchronized (G)
        {
            p();
            c(s1);
            h = s1;
            j = abyte0;
            k = null;
            l = false;
        }
        return;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final int b()
    {
        if (A == 206)
        {
            return 200;
        } else
        {
            return A;
        }
    }

    public final String b(String s1)
    {
        synchronized (G)
        {
            o();
            q();
            s1 = nativeGetHeader(a, s1);
        }
        return s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final String c()
    {
        return B;
    }

    public final IOException d()
    {
        if (m != null)
        {
            return m;
        }
        switch (E)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unrecognized error code: ")).append(E).toString());

        case 0: // '\0'
            if (x)
            {
                return new ResponseTooLargeException();
            } else
            {
                return null;
            }

        case 1: // '\001'
            return new IOException(F);

        case 2: // '\002'
            return new MalformedURLException((new StringBuilder("Malformed URL: ")).append(c).toString());

        case 3: // '\003'
            return new SocketTimeoutException("Connection timed out");

        case 4: // '\004'
            String s1;
            try
            {
                s1 = (new URL(c)).getHost();
            }
            catch (MalformedURLException malformedurlexception)
            {
                malformedurlexception = c;
            }
            return new UnknownHostException((new StringBuilder("Unknown host: ")).append(s1).toString());

        case 5: // '\005'
            return new IOException("Request failed because there were too many redirects or redirects have been disabled");
        }
    }

    public final ByteBuffer e()
    {
        return ((ChunkedWritableByteChannel)f).a();
    }

    public final byte[] f()
    {
        return ((ChunkedWritableByteChannel)f).b();
    }

    public final void g()
    {
label0:
        {
            synchronized (G)
            {
                if (!o)
                {
                    break label0;
                }
            }
            return;
        }
        p();
        o();
        n = true;
        if (e != null && !e.isEmpty())
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); nativeAddHeader(a, (String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        break MISSING_BLOCK_LABEL_117;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (g != null)
        {
            java.util.Map.Entry entry1;
            for (Iterator iterator1 = g.entrySet().iterator(); iterator1.hasNext(); nativeAddHeader(a, (String)entry1.getKey(), (String)entry1.getValue()))
            {
                entry1 = (java.util.Map.Entry)iterator1.next();
            }

        }
        if (j == null || j.length <= 0) goto _L2; else goto _L1
_L1:
        nativeSetUploadData(a, h, j);
_L4:
        if (i != null)
        {
            nativeSetMethod(a, i);
        }
        nativeStart(a);
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (k != null)
        {
            nativeSetUploadChannel(a, h, r);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void h()
    {
label0:
        {
            synchronized (G)
            {
                if (!o)
                {
                    break label0;
                }
            }
            return;
        }
        o = true;
        if (a != 0L)
        {
            nativeCancel(a);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean i()
    {
        boolean flag;
        synchronized (G)
        {
            flag = o;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String j()
    {
        String s1;
        synchronized (G)
        {
            o();
            q();
            s1 = nativeGetNegotiatedProtocol(a);
        }
        return s1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String k()
    {
        return C;
    }

    public final Map l()
    {
        ResponseHeadersMap responseheadersmap;
        synchronized (G)
        {
            o();
            q();
            responseheadersmap = new ResponseHeadersMap();
            nativeGetAllHeaders(a, responseheadersmap);
        }
        return responseheadersmap;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String m()
    {
        return c;
    }

    private class ResponseHeadersMap extends HashMap
    {

        ResponseHeadersMap()
        {
        }
    }

}
