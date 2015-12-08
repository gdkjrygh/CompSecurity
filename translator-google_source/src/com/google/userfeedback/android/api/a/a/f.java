// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a;

import android.content.ContentResolver;
import android.os.Build;
import android.os.SystemClock;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.google.userfeedback.android.api.a.a:
//            a

public final class f
    implements HttpClient
{

    private final a a;
    private final ContentResolver b;
    private final String c;

    public f(ContentResolver contentresolver, String s)
    {
        String s1 = String.valueOf(Build.DEVICE);
        String s2 = String.valueOf(Build.ID);
        s = (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" (").append(s1).append(" ").append(s2).append(")").toString();
        a = com.google.userfeedback.android.api.a.a.a.a(s);
        b = contentresolver;
        c = s;
    }

    private HttpResponse a(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        SystemClock.elapsedRealtime();
        try
        {
            httpurirequest = a.execute(httpurirequest, httpcontext);
            Integer.toString(httpurirequest.getStatusLine().getStatusCode());
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw httpurirequest;
        }
        return httpurirequest;
    }

    private static RequestWrapper a(HttpUriRequest httpurirequest)
    {
        if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        httpurirequest = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httpurirequest);
_L1:
        httpurirequest.resetHeaders();
        return httpurirequest;
        try
        {
            httpurirequest = new RequestWrapper(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpUriRequest httpurirequest)
        {
            throw new ClientProtocolException(httpurirequest);
        }
          goto _L1
    }

    public final void a()
    {
        a a1 = a;
        if (a1.a != null)
        {
            a1.getConnectionManager().shutdown();
            a1.a = null;
        }
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return a.execute(httphost, httprequest, responsehandler);
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return a.execute(httphost, httprequest, responsehandler, httpcontext);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return a.execute(httpurirequest, responsehandler);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return a.execute(httpurirequest, responsehandler, httpcontext);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return a.execute(httphost, httprequest);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        return a.execute(httphost, httprequest, httpcontext);
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(httpurirequest, ((HttpContext) (null)));
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        String s = httpurirequest.getURI().toString();
        URI uri;
        try
        {
            uri = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (HttpContext httpcontext)
        {
            httpurirequest = String.valueOf(s);
            if (httpurirequest.length() != 0)
            {
                httpurirequest = "Bad URL from: ".concat(httpurirequest);
            } else
            {
                httpurirequest = new String("Bad URL from: ");
            }
            throw new RuntimeException(httpurirequest, httpcontext);
        }
        httpurirequest = a(httpurirequest);
        httpurirequest.setURI(uri);
        return a(httpurirequest, httpcontext);
    }

    public final ClientConnectionManager getConnectionManager()
    {
        return a.getConnectionManager();
    }

    public final HttpParams getParams()
    {
        return a.getParams();
    }
}
