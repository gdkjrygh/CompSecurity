// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.TokenIterator;
import org.apache.http.message.BasicTokenIterator;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.facebook.http.b:
//            at

public class k
    implements ConnectionReuseStrategy
{

    public k()
    {
    }

    protected TokenIterator a(HeaderIterator headeriterator)
    {
        return new BasicTokenIterator(headeriterator);
    }

    public boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext)
    {
        boolean flag1;
        flag1 = true;
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
        httpcontext = (HttpConnection)httpcontext.getAttribute("http.connection");
        if (httpcontext == null || httpcontext.isOpen()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        ProtocolVersion protocolversion;
        httpcontext = httpresponse.getEntity();
        protocolversion = httpresponse.getStatusLine().getProtocolVersion();
        if (httpcontext == null)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; httpcontext instanceof at; httpcontext = ((at)httpcontext).a()) { }
        if (httpcontext.getContentLength() < 0L && (!httpcontext.isChunked() || protocolversion.lessEquals(HttpVersion.HTTP_1_0))) goto _L1; else goto _L3
_L3:
        HeaderIterator headeriterator = httpresponse.headerIterator("Connection");
        httpcontext = headeriterator;
        if (!headeriterator.hasNext())
        {
            httpcontext = httpresponse.headerIterator("Proxy-Connection");
        }
        if (!httpcontext.hasNext())
        {
            break MISSING_BLOCK_LABEL_231;
        }
        boolean flag;
        boolean flag2;
        try
        {
            httpresponse = a(httpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        flag = false;
        if (!httpresponse.hasNext())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        httpcontext = httpresponse.nextToken();
        if ("Close".equalsIgnoreCase(httpcontext)) goto _L1; else goto _L4
_L4:
        flag2 = "Keep-Alive".equalsIgnoreCase(httpcontext);
        if (flag2)
        {
            flag = true;
        }
        break MISSING_BLOCK_LABEL_180;
        if (flag)
        {
            return true;
        }
        if (protocolversion.lessEquals(HttpVersion.HTTP_1_0))
        {
            flag1 = false;
        }
        return flag1;
    }
}
