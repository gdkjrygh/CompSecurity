// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import android.net.Uri;
import com.facebook.http.b.m;
import java.net.URI;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.client.CookieStore;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.zero.rewrite:
//            f

public class a
    implements m
{

    private final Class a = com/facebook/zero/rewrite/a;
    private final m b;
    private final javax.inject.a c;
    private final f d;

    public a(m m1, javax.inject.a a1, f f1)
    {
        b = m1;
        c = a1;
        d = f1;
    }

    private HttpHost a(HttpHost httphost)
    {
        Object obj = (new android.net.Uri.Builder()).authority(httphost.getHostName()).scheme(httphost.getSchemeName()).toString();
        obj = Uri.parse(d.a(((String) (obj))));
        return new HttpHost(((Uri) (obj)).getHost(), httphost.getPort(), ((Uri) (obj)).getScheme());
    }

    private HttpRequest a(HttpRequest httprequest)
    {
        Object obj;
        if (!(httprequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httprequest);
_L1:
        ((RequestWrapper) (obj)).setURI(URI.create(d.a(httprequest.getRequestLine().getUri())));
        return ((HttpRequest) (obj));
        try
        {
            obj = new RequestWrapper(httprequest);
        }
        catch (ProtocolException protocolexception)
        {
            return httprequest;
        }
          goto _L1
    }

    private HttpUriRequest a(HttpUriRequest httpurirequest)
    {
        Object obj;
        if (!(httpurirequest instanceof HttpEntityEnclosingRequest))
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest)httpurirequest);
_L1:
        ((RequestWrapper) (obj)).setURI(d.a(httpurirequest.getURI()));
        return ((HttpUriRequest) (obj));
        try
        {
            obj = new RequestWrapper(httpurirequest);
        }
        catch (ProtocolException protocolexception)
        {
            return httpurirequest;
        }
          goto _L1
    }

    public CookieStore a()
    {
        return b.a();
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httphost), a(httprequest), responsehandler);
        } else
        {
            return b.execute(httphost, httprequest, responsehandler);
        }
    }

    public Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httphost), a(httprequest), responsehandler, httpcontext);
        } else
        {
            return b.execute(httphost, httprequest, responsehandler, httpcontext);
        }
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httpurirequest), responsehandler);
        } else
        {
            return b.execute(httpurirequest, responsehandler);
        }
    }

    public Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httpurirequest), responsehandler, httpcontext);
        } else
        {
            return b.execute(httpurirequest, responsehandler, httpcontext);
        }
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httphost), a(httprequest));
        } else
        {
            return b.execute(httphost, httprequest);
        }
    }

    public HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httphost), a(httprequest), httpcontext);
        } else
        {
            return b.execute(httphost, httprequest, httpcontext);
        }
    }

    public HttpResponse execute(HttpUriRequest httpurirequest)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httpurirequest));
        } else
        {
            return b.execute(httpurirequest);
        }
    }

    public HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        if (((Boolean)c.b()).booleanValue())
        {
            return b.execute(a(httpurirequest), httpcontext);
        } else
        {
            return b.execute(httpurirequest, httpcontext);
        }
    }

    public ClientConnectionManager getConnectionManager()
    {
        return b.getConnectionManager();
    }

    public HttpParams getParams()
    {
        return b.getParams();
    }
}
