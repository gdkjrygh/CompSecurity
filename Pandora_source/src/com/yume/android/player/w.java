// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.yume.android.player:
//            ag, t, B

final class w extends DefaultRedirectHandler
{

    private t a;

    w(t t1)
    {
        a = t1;
        super();
    }

    public final URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
        throws ProtocolException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP Response is NULL.");
        }
        Object obj = httpresponse.getFirstHeader("location");
        if (obj == null)
        {
            throw new ProtocolException((new StringBuilder("Received Redirect Response ")).append(httpresponse.getStatusLine()).append(" with no Location header.").toString());
        }
        String s = ag.d(((Header) (obj)).getValue());
        try
        {
            obj = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new ProtocolException((new StringBuilder("Invalid Redirect URI: ")).append(s).toString(), httpresponse);
        }
        if (!((URI) (obj)).isAbsolute())
        {
            if (httpresponse.getParams().isParameterTrue("http.protocol.reject-relative-redirect"))
            {
                throw new ProtocolException((new StringBuilder("Relative Redirect Location '")).append(obj).append("' not allowed.").toString());
            }
            httpresponse = (HttpHost)httpcontext.getAttribute("http.target_host");
            if (httpresponse == null)
            {
                throw new IllegalStateException("Target Host Not Available in HTTP context.");
            }
            httpcontext = (HttpRequest)httpcontext.getAttribute("http.request");
            try
            {
                httpresponse = URIUtils.resolve(URIUtils.rewriteURI(new URI(httpcontext.getRequestLine().getUri()), httpresponse, true), ((URI) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                throw new ProtocolException(httpresponse.getMessage(), httpresponse);
            }
        } else
        {
            httpresponse = ((HttpResponse) (obj));
        }
        a.a.b((new StringBuilder("Redirect URL: ")).append(httpresponse.toString()).toString());
        return httpresponse;
    }

    public final boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (httpresponse == null) goto _L2; else goto _L1
_L1:
        httpresponse.getStatusLine().getStatusCode();
        JVM INSTR tableswitch 301 307: default 56
    //                   301 58
    //                   302 58
    //                   303 58
    //                   304 56
    //                   305 56
    //                   306 56
    //                   307 58;
           goto _L2 _L3 _L3 _L3 _L2 _L2 _L2 _L3
_L2:
        return false;
_L3:
        return true;
    }
}
