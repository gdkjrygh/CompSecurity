// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.google.common.a.ik;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            ax, m, v

public class ap
{

    private static Class a = com/facebook/http/b/ap;
    private static String b = "OrcaHttpRequestProcessor";
    private static final Logger c = Logger.getLogger(com/facebook/http/b/ap.getName());
    private final m d;
    private final v e;
    private final ConcurrentMap f = ik.c();
    private volatile boolean g;

    public ap(m m1, v v1)
    {
        d = m1;
        e = v1;
    }

    private Object a(String s, ResponseHandler responsehandler, HttpResponse httpresponse)
    {
        try
        {
            responsehandler = ((ResponseHandler) (responsehandler.handleResponse(httpresponse)));
        }
        // Misplaced declaration of an exception variable
        catch (ResponseHandler responsehandler)
        {
            httpresponse = httpresponse.getEntity();
            if (httpresponse != null)
            {
                try
                {
                    httpresponse.consumeContent();
                }
                // Misplaced declaration of an exception variable
                catch (HttpResponse httpresponse)
                {
                    c.log(Level.WARNING, "Error consuming content after an exception.", httpresponse);
                }
            }
            if (responsehandler instanceof Error)
            {
                com.facebook.debug.log.b.b((new StringBuilder()).append(b).append("[").append(s).append("]").toString(), "Error", responsehandler);
                throw (Error)responsehandler;
            }
            if (responsehandler instanceof RuntimeException)
            {
                com.facebook.debug.log.b.b((new StringBuilder()).append(b).append("[").append(s).append("]").toString(), "RuntimeException", responsehandler);
                throw (RuntimeException)responsehandler;
            }
            if (responsehandler instanceof IOException)
            {
                com.facebook.debug.log.b.b((new StringBuilder()).append(b).append("[").append(s).append("]").toString(), "IOException", responsehandler);
                throw (IOException)responsehandler;
            } else
            {
                com.facebook.debug.log.b.b((new StringBuilder()).append(b).append("[").append(s).append("]").toString(), "Throwable", responsehandler);
                throw new UndeclaredThrowableException(responsehandler);
            }
        }
        return responsehandler;
    }

    private RuntimeException a(Throwable throwable)
    {
        if (ax.a(throwable))
        {
            d.a().clear();
        }
        Throwables.propagateIfPossible(throwable);
        Throwables.propagateIfPossible(throwable, java/io/IOException);
        throw new UndeclaredThrowableException(throwable);
    }

    private HttpHost a(HttpUriRequest httpurirequest)
    {
        Object obj = null;
        URI uri = httpurirequest.getURI();
        httpurirequest = obj;
        if (uri.isAbsolute())
        {
            httpurirequest = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
        }
        return httpurirequest;
    }

    private void a(String s, boolean flag, HttpResponse httpresponse, Throwable throwable, long l)
    {
        if (httpresponse != null)
        {
            httpresponse.getStatusLine().getStatusCode();
        }
    }

    private void a(HttpResponse httpresponse)
    {
    }

    private void d()
    {
        if (g)
        {
            throw new IOException("In lame duck mode");
        } else
        {
            return;
        }
    }

    public Object a(String s, HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        Object obj;
        e e1;
        long l;
        obj = null;
        if (responsehandler == null)
        {
            throw new IllegalArgumentException("Response handler must not be null.");
        }
        d();
        l = System.currentTimeMillis();
        e1 = com.facebook.debug.d.e.a((new StringBuilder()).append(b).append("[").append(s).append("]").toString());
        f.put(httpurirequest, httpurirequest);
        HttpResponse httpresponse;
        e.a(httpurirequest);
        httpresponse = d.execute(a(httpurirequest), httpurirequest, (HttpContext)null);
        HttpEntity httpentity;
        a(httpresponse);
        responsehandler = ((ResponseHandler) (a(s, responsehandler, httpresponse)));
        e.a(httpresponse, responsehandler);
        httpentity = httpresponse.getEntity();
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        httpentity.consumeContent();
        f.remove(httpurirequest);
        e1.a();
        a(s, true, httpresponse, null, System.currentTimeMillis() - l);
        return responsehandler;
        responsehandler;
        httpresponse = null;
_L4:
        throw a(((Throwable) (responsehandler)));
        obj;
        ResponseHandler responsehandler1 = responsehandler;
        responsehandler = ((ResponseHandler) (obj));
        obj = responsehandler1;
_L2:
        f.remove(httpurirequest);
        e1.a();
        a(s, false, httpresponse, ((Throwable) (obj)), System.currentTimeMillis() - l);
        throw responsehandler;
        responsehandler;
        httpresponse = null;
        continue; /* Loop/switch isn't completed */
        responsehandler;
        if (true) goto _L2; else goto _L1
_L1:
        responsehandler;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public HttpResponse a(String s, HttpUriRequest httpurirequest)
    {
        return a(s, httpurirequest, (String)null);
    }

    public HttpResponse a(String s, HttpUriRequest httpurirequest, String s1)
    {
        Object obj;
        Object obj2;
        e e1;
        long l;
        obj2 = null;
        obj = null;
        d();
        l = System.currentTimeMillis();
        e1 = com.facebook.debug.d.e.a((new StringBuilder()).append(b).append("[").append(s).append("]").toString());
        f.put(httpurirequest, httpurirequest);
        e.a(httpurirequest);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        BasicHttpContext basichttpcontext;
        basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("fb_http_data_category", (new StringBuilder()).append(s1).append(":").append(s).toString());
        s1 = basichttpcontext;
_L7:
        s1 = d.execute(a(httpurirequest), httpurirequest, s1);
        e.a(s1, null);
        a(((HttpResponse) (s1)));
        f.remove(httpurirequest);
        e1.a();
        a(s, true, ((HttpResponse) (s1)), null, System.currentTimeMillis() - l);
        return s1;
        s1;
_L5:
        throw a(((Throwable) (s1)));
        obj2;
        Object obj1 = obj;
        obj = obj2;
        obj2 = s1;
        s1 = ((String) (obj1));
_L4:
        Exception exception;
        f.remove(httpurirequest);
        e1.a();
        a(s, false, ((HttpResponse) (s1)), ((Throwable) (obj2)), System.currentTimeMillis() - l);
        throw exception;
        exception;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        exception = s1;
        s1 = throwable;
        if (true) goto _L5; else goto _L2
_L2:
        s1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a()
    {
        g = true;
    }

    public void b()
    {
        g = false;
    }

    public void c()
    {
        for (Iterator iterator = f.values().iterator(); iterator.hasNext(); ((HttpUriRequest)iterator.next()).abort()) { }
    }

}
