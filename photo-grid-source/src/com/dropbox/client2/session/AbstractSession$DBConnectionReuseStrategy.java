// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.TokenIterator;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.protocol.HttpContext;

class <init> extends DefaultConnectionReuseStrategy
{

    public boolean keepAlive(HttpResponse httpresponse, HttpContext httpcontext)
    {
        ProtocolVersion protocolversion;
        boolean flag2;
        flag2 = true;
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HTTP response may not be null.");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
        protocolversion = httpresponse.getStatusLine().getProtocolVersion();
        httpcontext = httpresponse.getFirstHeader("Transfer-Encoding");
        if (httpcontext == null) goto _L2; else goto _L1
_L1:
        if ("chunked".equalsIgnoreCase(httpcontext.getValue())) goto _L4; else goto _L3
_L3:
        boolean flag1 = false;
_L8:
        return flag1;
_L2:
        httpcontext = httpresponse.getHeaders("Content-Length");
        if (httpcontext == null || httpcontext.length != 1)
        {
            return false;
        }
        httpcontext = httpcontext[0];
        int i;
        try
        {
            i = Integer.parseInt(httpcontext.getValue());
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        if (i < 0)
        {
            return false;
        }
_L4:
        HeaderIterator headeriterator = httpresponse.headerIterator("Connection");
        httpcontext = headeriterator;
        if (!headeriterator.hasNext())
        {
            httpcontext = httpresponse.headerIterator("Proxy-Connection");
        }
        if (!httpcontext.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            httpresponse = createTokenIterator(httpcontext);
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return false;
        }
        flag = false;
        if (!httpresponse.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        httpcontext = httpresponse.nextToken();
        if ("Close".equalsIgnoreCase(httpcontext))
        {
            return false;
        }
        flag1 = "Keep-Alive".equalsIgnoreCase(httpcontext);
        if (flag1)
        {
            flag = true;
        }
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_170;
_L5:
        flag1 = flag2;
        if (flag) goto _L8; else goto _L7
_L7:
        flag1 = flag2;
        if (protocolversion.lessEquals(HttpVersion.HTTP_1_0))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
