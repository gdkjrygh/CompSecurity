// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import qxd;
import qxe;
import qxf;
import qxg;
import qxh;
import qxi;
import qxj;
import qxk;
import qxl;

// Referenced classes of package org.chromium.net:
//            UrlRequest, UrlRequestException, UrlRequestListener, CronetUrlRequestContext, 
//            CronetUploadDataStream, UploadDataProvider

public final class CronetUrlRequest
    implements UrlRequest
{

    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private final Object g;
    private final CronetUrlRequestContext h;
    private final Executor i;
    private final List j;
    private final UrlRequestListener k;
    private final String l;
    private final int m;
    private String n;
    private final HeadersList o;
    private CronetUploadDataStream p;
    private qxk q;
    private qxl r;

    CronetUrlRequest(CronetUrlRequestContext croneturlrequestcontext, String s, int i1, UrlRequestListener urlrequestlistener, Executor executor)
    {
        i1 = 0;
        super();
        b = false;
        c = false;
        d = false;
        e = false;
        f = false;
        g = new Object();
        j = new ArrayList();
        o = new HeadersList();
        if (s == null)
        {
            throw new NullPointerException("URL is required");
        }
        if (urlrequestlistener == null)
        {
            throw new NullPointerException("Listener is required");
        }
        if (executor == null)
        {
            throw new NullPointerException("Executor is required");
        }
        h = croneturlrequestcontext;
        l = s;
        j.add(s);
        3;
        JVM INSTR tableswitch 0 4: default 164
    //                   0 166
    //                   1 184
    //                   2 189
    //                   3 194
    //                   4 199;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = 3;
_L8:
        m = i1;
        k = urlrequestlistener;
        i = executor;
        return;
_L3:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 2;
        continue; /* Loop/switch isn't completed */
_L5:
        i1 = 3;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 4;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Object a(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.g;
    }

    private qxk a(int i1)
    {
label0:
        {
            synchronized (g)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return null;
        }
        long l1 = a;
        obj;
        JVM INSTR monitorexit ;
        obj = new qxk((String[])j.toArray(new String[j.size()]), i1, nativeGetHttpStatusText(l1), nativeGetWasCached(l1), nativeGetNegotiatedProtocol(l1), nativeGetProxyServer(l1));
        nativePopulateResponseHeaders(l1, qxk.a(((qxk) (obj))));
        return ((qxk) (obj));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Runnable runnable)
    {
        try
        {
            i.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            Log.e("ChromiumNetwork", "Exception posting task to executor", runnable);
        }
        c();
    }

    public static void a(CronetUrlRequest croneturlrequest, Exception exception)
    {
        UrlRequestException urlrequestexception;
label0:
        {
            urlrequestexception = new UrlRequestException("CalledByNative method has thrown an exception", exception);
            Log.e("ChromiumNetwork", "Exception in CalledByNative method", exception);
            synchronized (croneturlrequest.g)
            {
                if (!croneturlrequest.d())
                {
                    break label0;
                }
            }
            return;
        }
        croneturlrequest.f();
        exception;
        JVM INSTR monitorexit ;
        try
        {
            croneturlrequest.k.a(croneturlrequest, urlrequestexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CronetUrlRequest croneturlrequest)
        {
            Log.e("ChromiumNetwork", "Exception notifying of failed request", croneturlrequest);
        }
        return;
        croneturlrequest;
        exception;
        JVM INSTR monitorexit ;
        throw croneturlrequest;
    }

    private void a(UrlRequestException urlrequestexception)
    {
        a(((Runnable) (new qxe(this, urlrequestexception))));
    }

    public static boolean a(CronetUrlRequest croneturlrequest, boolean flag)
    {
        croneturlrequest.e = true;
        return true;
    }

    public static long b(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.a;
    }

    public static boolean b(CronetUrlRequest croneturlrequest, boolean flag)
    {
        croneturlrequest.d = true;
        return true;
    }

    public static qxk c(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.q;
    }

    public static UrlRequestListener d(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.k;
    }

    private void e()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (b || d())
        {
            throw new IllegalStateException("Request is already started.");
        }
        break MISSING_BLOCK_LABEL_36;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    public static void e(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.f();
    }

    private void f()
    {
label0:
        {
            synchronized (g)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        nativeDestroy(a);
        h.a.decrementAndGet();
        a = 0L;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native boolean nativeAddRequestHeader(long l1, String s, String s1);

    private native long nativeCreateRequestAdapter(long l1, String s, int i1);

    private native void nativeDestroy(long l1);

    private native void nativeDisableCache(long l1);

    private native void nativeFollowDeferredRedirect(long l1);

    private native String nativeGetHttpStatusText(long l1);

    private native String nativeGetNegotiatedProtocol(long l1);

    private native String nativeGetProxyServer(long l1);

    private native void nativeGetStatus(long l1, UrlRequest.StatusListener statuslistener);

    private native boolean nativeGetWasCached(long l1);

    private native void nativePopulateResponseHeaders(long l1, HeadersList headerslist);

    private native boolean nativeReadData(long l1, ByteBuffer bytebuffer, int i1, int j1);

    private native boolean nativeSetHttpMethod(long l1, String s);

    private native void nativeStart(long l1);

    private void onAppendResponseHeader(HeadersList headerslist, String s, String s1)
    {
        headerslist.add(Pair.create(s, s1));
    }

    private void onError(int i1, String s)
    {
        a(new UrlRequestException((new StringBuilder("Exception in CronetUrlRequest: ")).append(s).toString(), i1));
    }

    private void onReadCompleted(ByteBuffer bytebuffer, int i1, int j1)
    {
        if (bytebuffer.position() != j1)
        {
            a(new UrlRequestException("ByteBuffer modified externally during read", null));
            return;
        }
        if (r == null)
        {
            r = new qxl(this);
        }
        if (f)
        {
            bytebuffer.limit(j1 + i1);
        } else
        {
            bytebuffer.position(j1 + i1);
        }
        r.a = bytebuffer;
        a(r);
    }

    private void onReceivedRedirect(String s, int i1)
    {
        qxk qxk1 = a(i1);
        j.add(s);
        a(new qxf(this, qxk1, s));
    }

    private void onResponseStarted(int i1)
    {
        q = a(i1);
        a(new qxg(this));
    }

    private void onStatus(UrlRequest.StatusListener statuslistener, int i1)
    {
        a(new qxi(this, statuslistener, i1));
    }

    private void onSucceeded(long l1)
    {
        a(new qxh(this, new qxj(q, l1)));
    }

    public final void a()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        e();
        a = nativeCreateRequestAdapter(h.c(), l, m);
        h.a.incrementAndGet();
        if (n != null && !nativeSetHttpMethod(a, n))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid http method ")).append(n).toString());
        }
        break MISSING_BLOCK_LABEL_107;
        Object obj1;
        obj1;
        f();
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        boolean flag = false;
        Iterator iterator = o.iterator();
_L2:
        Pair pair;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_245;
        }
        pair = (Pair)iterator.next();
        if (((String)pair.first).equalsIgnoreCase("Content-Type") && !((String)pair.second).isEmpty())
        {
            flag = true;
        }
        if (nativeAddRequestHeader(a, (String)pair.first, (String)pair.second)) goto _L2; else goto _L1
_L1:
        f();
        throw new IllegalArgumentException((new StringBuilder("Invalid header ")).append((String)pair.first).append("=").append((String)pair.second).toString());
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        p.a(this, a);
        b = true;
        nativeStart(a);
        obj;
        JVM INSTR monitorexit ;
    }

    final void a(Exception exception)
    {
        UrlRequestException urlrequestexception = new UrlRequestException("Exception received from UploadDataProvider", exception);
        Log.e("ChromiumNetwork", "Exception in upload method", exception);
        a(urlrequestexception);
    }

    public final void a(String s)
    {
        e();
        n = s;
    }

    public final void a(String s, String s1)
    {
        e();
        if (s == null)
        {
            throw new NullPointerException("Invalid header name.");
        }
        if (s1 == null)
        {
            throw new NullPointerException("Invalid header value.");
        } else
        {
            o.add(Pair.create(s, s1));
            return;
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (bytebuffer.position() >= bytebuffer.capacity())
        {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        break MISSING_BLOCK_LABEL_34;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
        if (!e)
        {
            throw new IllegalStateException("Unexpected read attempt.");
        }
        e = false;
        f = true;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        bytebuffer.limit(bytebuffer.position());
        if (!nativeReadData(a, bytebuffer, bytebuffer.position(), bytebuffer.capacity()))
        {
            e = true;
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(UploadDataProvider uploaddataprovider, Executor executor)
    {
        if (n == null)
        {
            n = "POST";
        }
        p = new CronetUploadDataStream(uploaddataprovider, executor);
    }

    public final void a(UrlRequest.StatusListener statuslistener)
    {
label0:
        {
            synchronized (g)
            {
                if (a == 0L)
                {
                    break label0;
                }
                nativeGetStatus(a, statuslistener);
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        a(((Runnable) (new qxd(this, statuslistener))));
        return;
        statuslistener;
        obj;
        JVM INSTR monitorexit ;
        throw statuslistener;
    }

    public final void b()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!d)
        {
            throw new IllegalStateException("No redirect to follow.");
        }
        break MISSING_BLOCK_LABEL_30;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        d = false;
        if (!d())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        nativeFollowDeferredRedirect(a);
        obj;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
label0:
        {
            synchronized (g)
            {
                if (!d() && b)
                {
                    break label0;
                }
            }
            return;
        }
        f();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (b && a == 0L)
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

    private class HeadersList extends ArrayList
    {

        public HeadersList()
        {
        }
    }

}
