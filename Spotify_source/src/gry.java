// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.InetSocketAddress;
import java.net.Proxy;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public final class gry
    implements HttpClient
{

    private final HttpParams a;
    private final gro b;

    public gry()
    {
        this(new gro());
    }

    public gry(gro gro1)
    {
        a = new AbstractHttpParams() {

            private gry a;

            public final HttpParams copy()
            {
                throw new UnsupportedOperationException();
            }

            public final Object getParameter(String s)
            {
                if (s.equals("http.route.default-proxy"))
                {
                    s = gry.a(a).c;
                    if (s == null)
                    {
                        return null;
                    } else
                    {
                        s = (InetSocketAddress)s.address();
                        return new HttpHost(s.getHostName(), s.getPort());
                    }
                } else
                {
                    throw new IllegalArgumentException(s);
                }
            }

            public final boolean removeParameter(String s)
            {
                throw new UnsupportedOperationException();
            }

            public final HttpParams setParameter(String s, Object obj)
            {
                if (s.equals("http.route.default-proxy"))
                {
                    obj = (HttpHost)obj;
                    s = null;
                    if (obj != null)
                    {
                        s = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(((HttpHost) (obj)).getHostName(), ((HttpHost) (obj)).getPort()));
                    }
                    gry.a(a).c = s;
                    return this;
                } else
                {
                    throw new IllegalArgumentException(s);
                }
            }

            
            {
                a = gry.this;
                super();
            }
        };
        b = gro1;
    }

    static gro a(gry gry1)
    {
        return gry1.b;
    }

    private static void a(HttpResponse httpresponse)
    {
        try
        {
            httpresponse.getEntity().consumeContent();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return;
        }
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler)
    {
        return execute(httphost, httprequest, responsehandler, null);
    }

    public final Object execute(HttpHost httphost, HttpRequest httprequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        httphost = execute(httphost, httprequest, httpcontext);
        httprequest = ((HttpRequest) (responsehandler.handleResponse(httphost)));
        a(httphost);
        return httprequest;
        httprequest;
        a(httphost);
        throw httprequest;
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler)
    {
        return execute(null, ((HttpRequest) (httpurirequest)), responsehandler, null);
    }

    public final Object execute(HttpUriRequest httpurirequest, ResponseHandler responsehandler, HttpContext httpcontext)
    {
        return execute(null, ((HttpRequest) (httpurirequest)), responsehandler, httpcontext);
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest)
    {
        return execute(httphost, httprequest, ((HttpContext) (null)));
    }

    public final HttpResponse execute(HttpHost httphost, HttpRequest httprequest, HttpContext httpcontext)
    {
        httpcontext = new grr();
        httphost = httprequest.getRequestLine();
        String s = httphost.getMethod();
        httpcontext.a(httphost.getUri());
        Header aheader[] = httprequest.getAllHeaders();
        int k = aheader.length;
        int i = 0;
        httphost = null;
        while (i < k) 
        {
            Header header = aheader[i];
            String s3 = header.getName();
            if ("Content-Type".equalsIgnoreCase(s3))
            {
                httphost = header.getValue();
            } else
            {
                httpcontext.a(s3, header.getValue());
            }
            i++;
        }
        if (httprequest instanceof HttpEntityEnclosingRequest)
        {
            httprequest = ((HttpEntityEnclosingRequest)httprequest).getEntity();
            int j;
            int l;
            if (httprequest != null)
            {
                httphost = new grx(httprequest, httphost);
                httprequest = httprequest.getContentEncoding();
                if (httprequest != null)
                {
                    httpcontext.a(httprequest.getName(), httprequest.getValue());
                }
            } else
            {
                httphost = grs.a(null, new byte[0]);
            }
        } else
        {
            httphost = null;
        }
        httpcontext.a(s, httphost);
        httphost = httpcontext.b();
        httpcontext = b.a(httphost).a();
        j = ((grt) (httpcontext)).c;
        httphost = ((grt) (httpcontext)).d;
        httphost = new BasicHttpResponse(HttpVersion.HTTP_1_1, j, httphost);
        httprequest = ((grt) (httpcontext)).g;
        httprequest = new InputStreamEntity(httprequest.d(), httprequest.b());
        httphost.setEntity(httprequest);
        httpcontext = ((grt) (httpcontext)).f;
        l = ((grh) (httpcontext)).a.length / 2;
        j = 0;
        while (j < l) 
        {
            String s1 = httpcontext.a(j);
            String s2 = httpcontext.b(j);
            httphost.addHeader(s1, s2);
            if ("Content-Type".equalsIgnoreCase(s1))
            {
                httprequest.setContentType(s2);
            } else
            if ("Content-Encoding".equalsIgnoreCase(s1))
            {
                httprequest.setContentEncoding(s2);
            }
            j++;
        }
        return httphost;
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest)
    {
        return execute(((HttpHost) (null)), ((HttpRequest) (httpurirequest)), ((HttpContext) (null)));
    }

    public final HttpResponse execute(HttpUriRequest httpurirequest, HttpContext httpcontext)
    {
        return execute(((HttpHost) (null)), ((HttpRequest) (httpurirequest)), httpcontext);
    }

    public final ClientConnectionManager getConnectionManager()
    {
        throw new UnsupportedOperationException();
    }

    public final HttpParams getParams()
    {
        return a;
    }
}
