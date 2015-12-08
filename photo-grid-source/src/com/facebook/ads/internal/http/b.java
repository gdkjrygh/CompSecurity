// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.http;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.ads.internal.http:
//            c

class b
    implements Runnable
{

    private final AbstractHttpClient a;
    private final HttpContext b;
    private final HttpUriRequest c;
    private final c d;
    private int e;

    public b(AbstractHttpClient abstracthttpclient, HttpContext httpcontext, HttpUriRequest httpurirequest, c c1)
    {
        a = abstracthttpclient;
        b = httpcontext;
        c = httpurirequest;
        d = c1;
    }

    private void a()
    {
        if (!Thread.currentThread().isInterrupted())
        {
            org.apache.http.HttpResponse httpresponse = a.execute(c, b);
            if (!Thread.currentThread().isInterrupted() && d != null)
            {
                d.a(httpresponse);
            }
        }
    }

    private void b()
    {
        Object obj;
        HttpRequestRetryHandler httprequestretryhandler;
        boolean flag;
        flag = true;
        obj = null;
        httprequestretryhandler = a.getHttpRequestRetryHandler();
_L5:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        a();
_L2:
        return;
        obj;
        if (d == null) goto _L2; else goto _L1
_L1:
        d.b(((Throwable) (obj)), "can't resolve host");
        return;
        obj;
        if (d == null) goto _L2; else goto _L3
_L3:
        d.b(((Throwable) (obj)), "can't resolve host");
        return;
        obj;
        if (d != null)
        {
            d.b(((Throwable) (obj)), "socket time out");
            return;
        }
          goto _L2
        obj;
        int i = e + 1;
        e = i;
        flag = httprequestretryhandler.retryRequest(((IOException) (obj)), i, b);
        continue; /* Loop/switch isn't completed */
        obj;
        obj = new IOException((new StringBuilder("NPE in HttpClient")).append(((NullPointerException) (obj)).getMessage()).toString());
        int j = e + 1;
        e = j;
        flag = httprequestretryhandler.retryRequest(((IOException) (obj)), j, b);
        if (true) goto _L5; else goto _L4
_L4:
        ConnectException connectexception = new ConnectException();
        connectexception.initCause(((Throwable) (obj)));
        throw connectexception;
    }

    public void run()
    {
        if (d != null)
        {
            d.c();
        }
        b();
        if (d != null)
        {
            d.d();
        }
_L1:
        return;
        IOException ioexception;
        ioexception;
        if (d != null)
        {
            d.d();
            d.b(ioexception, null);
            return;
        }
          goto _L1
    }
}
