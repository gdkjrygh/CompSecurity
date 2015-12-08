// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package org.chromium.net:
//            UrlRequest, UrlResponseInfo, UrlRequestException, UrlRequestListener, 
//            CronetUrlRequestContext, CronetUploadDataStream, UploadDataProvider

final class CronetUrlRequest
    implements UrlRequest
{
    static final class HeadersList extends ArrayList
    {

        private HeadersList()
        {
        }

        HeadersList(byte byte0)
        {
            this();
        }
    }

    final class a
        implements Runnable
    {

        ByteBuffer a;
        private CronetUrlRequest b;

        public final void run()
        {
            if (b.d())
            {
                return;
            }
            synchronized (CronetUrlRequest.a(b))
            {
                if (CronetUrlRequest.b(b) != 0L)
                {
                    break MISSING_BLOCK_LABEL_51;
                }
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                CronetUrlRequest.a(b, ((Exception) (obj)));
            }
            return;
            CronetUrlRequest.c(b);
            obj;
            JVM INSTR monitorexit ;
            ByteBuffer bytebuffer = a;
            a = null;
            CronetUrlRequest.e(b).a(b, bytebuffer);
            return;
        }

        private a()
        {
            b = CronetUrlRequest.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private long a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final Object f;
    private final CronetUrlRequestContext g;
    private final Executor h;
    private final List i;
    private long j;
    private final UrlRequestListener k;
    private final String l;
    private final int m;
    private String n;
    private final HeadersList o;
    private CronetUploadDataStream p;
    private UrlResponseInfo q;
    private a r;

    CronetUrlRequest(CronetUrlRequestContext croneturlrequestcontext, String s, int i1, UrlRequestListener urlrequestlistener, Executor executor)
    {
        int j1;
        j1 = 0;
        super();
        b = false;
        c = false;
        d = false;
        e = false;
        f = new Object();
        i = new ArrayList();
        o = new HeadersList((byte)0);
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
        g = croneturlrequestcontext;
        l = s;
        i.add(s);
        i1;
        JVM INSTR tableswitch 0 4: default 160
    //                   0 163
    //                   1 182
    //                   2 188
    //                   3 194
    //                   4 200;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        j1 = 3;
_L8:
        m = j1;
        k = urlrequestlistener;
        h = executor;
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

    static Object a(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.f;
    }

    private UrlResponseInfo a(int i1)
    {
label0:
        {
            synchronized (f)
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
        obj = new HeadersList((byte)0);
        nativePopulateResponseHeaders(l1, ((HeadersList) (obj)));
        return new UrlResponseInfo(new ArrayList(i), i1, nativeGetHttpStatusText(l1), ((List) (obj)), nativeGetWasCached(l1), nativeGetNegotiatedProtocol(l1), nativeGetProxyServer(l1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Runnable runnable)
    {
        try
        {
            h.execute(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            c();
        }
    }

    static void a(CronetUrlRequest croneturlrequest, Exception exception)
    {
        UrlRequestException urlrequestexception;
label0:
        {
            urlrequestexception = new UrlRequestException("CalledByNative method has thrown an exception", exception);
            synchronized (croneturlrequest.f)
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
            croneturlrequest.k.a(croneturlrequest.q, urlrequestexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CronetUrlRequest croneturlrequest)
        {
            return;
        }
        croneturlrequest;
        exception;
        JVM INSTR monitorexit ;
        throw croneturlrequest;
    }

    private void a(UrlRequestException urlrequestexception)
    {
        a(new Runnable(urlrequestexception) {

            private UrlRequestException a;
            private CronetUrlRequest b;

            public final void run()
            {
label0:
                {
                    synchronized (CronetUrlRequest.a(b))
                    {
                        if (!b.d())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                CronetUrlRequest.f(b);
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    CronetUrlRequest.e(b).a(CronetUrlRequest.d(b), a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = CronetUrlRequest.this;
                a = urlrequestexception;
                super();
            }
        });
    }

    static long b(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.a;
    }

    static boolean c(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.d = true;
        return true;
    }

    static UrlResponseInfo d(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.q;
    }

    static UrlRequestListener e(CronetUrlRequest croneturlrequest)
    {
        return croneturlrequest.k;
    }

    private void e()
    {
        Object obj = f;
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

    private void f()
    {
label0:
        {
            synchronized (f)
            {
                if (a != 0L)
                {
                    break label0;
                }
            }
            return;
        }
        nativeDestroy(a);
        g.a.decrementAndGet();
        a = 0L;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void f(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.f();
    }

    static boolean g(CronetUrlRequest croneturlrequest)
    {
        croneturlrequest.c = true;
        return true;
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
        headerslist.add(new java.util.AbstractMap.SimpleImmutableEntry(s, s1));
    }

    private void onError(int i1, String s, long l1)
    {
        if (q != null)
        {
            q.a(j + l1);
        }
        a(new UrlRequestException((new StringBuilder("Exception in CronetUrlRequest: ")).append(s).toString()));
    }

    private void onReadCompleted(ByteBuffer bytebuffer, int i1, int j1, long l1)
    {
        q.a(j + l1);
        if (bytebuffer.position() != j1)
        {
            a(new UrlRequestException("ByteBuffer modified externally during read", null));
            return;
        }
        if (r == null)
        {
            r = new a((byte)0);
        }
        if (e)
        {
            bytebuffer.limit(j1 + i1);
        } else
        {
            bytebuffer.position(j1 + i1);
        }
        r.a = bytebuffer;
        a(r);
    }

    private void onReceivedRedirect(String s, int i1, long l1)
    {
        UrlResponseInfo urlresponseinfo = a(i1);
        j = j + l1;
        urlresponseinfo.a(j);
        i.add(s);
        a(new Runnable(s) {

            private String a;
            private CronetUrlRequest b;

            public final void run()
            {
label0:
                {
                    synchronized (CronetUrlRequest.a(b))
                    {
                        if (!b.d())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                CronetUrlRequest.g(b);
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    CronetUrlRequest.e(b).a(b, a);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    CronetUrlRequest.a(b, ((Exception) (obj)));
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                b = CronetUrlRequest.this;
                a = s;
                super();
            }
        });
    }

    private void onResponseStarted(int i1)
    {
        q = a(i1);
        a(new Runnable() {

            private CronetUrlRequest a;

            public final void run()
            {
label0:
                {
                    synchronized (CronetUrlRequest.a(a))
                    {
                        if (!a.d())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                CronetUrlRequest.c(a);
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    CronetUrlRequest.e(a).a(a, CronetUrlRequest.d(a));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    CronetUrlRequest.a(a, ((Exception) (obj)));
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = CronetUrlRequest.this;
                super();
            }
        });
    }

    private void onStatus(UrlRequest.StatusListener statuslistener, int i1)
    {
        a(new Runnable(i1) {

            private int a;

            public final void run()
            {
                UrlRequest.Status.a(a);
            }

            
            {
                a = i1;
                super();
            }
        });
    }

    private void onSucceeded(long l1)
    {
        q.a(j + l1);
        a(new Runnable() {

            private CronetUrlRequest a;

            public final void run()
            {
label0:
                {
                    synchronized (CronetUrlRequest.a(a))
                    {
                        if (!a.d())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                CronetUrlRequest.f(a);
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    CronetUrlRequest.e(a).a();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = CronetUrlRequest.this;
                super();
            }
        });
    }

    public final void a()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        e();
        a = nativeCreateRequestAdapter(g.c(), l, m);
        g.a.incrementAndGet();
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
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_257;
        }
        entry = (java.util.Map.Entry)iterator.next();
        if (((String)entry.getKey()).equalsIgnoreCase("Content-Type") && !((String)entry.getValue()).isEmpty())
        {
            flag = true;
        }
        if (nativeAddRequestHeader(a, (String)entry.getKey(), (String)entry.getValue())) goto _L2; else goto _L1
_L1:
        f();
        throw new IllegalArgumentException((new StringBuilder("Invalid header ")).append((String)entry.getKey()).append("=").append((String)entry.getValue()).toString());
        if (p == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        CronetUploadDataStream cronetuploaddatastream = p;
        long l1 = a;
        cronetuploaddatastream.b = this;
        cronetuploaddatastream.c = cronetuploaddatastream.nativeAttachUploadDataToRequest(l1, cronetuploaddatastream.a);
        b = true;
        nativeStart(a);
        obj;
        JVM INSTR monitorexit ;
    }

    final void a(Exception exception)
    {
        a(new UrlRequestException("Exception received from UploadDataProvider", exception));
    }

    public final void a(String s)
    {
        e();
        if (s == null)
        {
            throw new NullPointerException("Method is required.");
        } else
        {
            n = s;
            return;
        }
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
            o.add(new java.util.AbstractMap.SimpleImmutableEntry(s, s1));
            return;
        }
    }

    public final void a(ByteBuffer bytebuffer)
    {
        Object obj = f;
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
        if (!d)
        {
            throw new IllegalStateException("Unexpected read attempt.");
        }
        d = false;
        e = true;
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
            d = true;
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(UploadDataProvider uploaddataprovider, Executor executor)
    {
        if (uploaddataprovider == null)
        {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (n == null)
        {
            n = "POST";
        }
        p = new CronetUploadDataStream(uploaddataprovider, executor);
    }

    public final void b()
    {
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        if (!c)
        {
            throw new IllegalStateException("No redirect to follow.");
        }
        break MISSING_BLOCK_LABEL_30;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c = false;
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
            synchronized (f)
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
        Object obj = f;
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
}
