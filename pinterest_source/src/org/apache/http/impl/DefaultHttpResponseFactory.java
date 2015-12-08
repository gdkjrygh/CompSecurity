// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package org.apache.http.impl:
//            EnglishReasonPhraseCatalog

public class DefaultHttpResponseFactory
    implements HttpResponseFactory
{

    protected final ReasonPhraseCatalog reasonCatalog;

    public DefaultHttpResponseFactory()
    {
        this(((ReasonPhraseCatalog) (EnglishReasonPhraseCatalog.INSTANCE)));
    }

    public DefaultHttpResponseFactory(ReasonPhraseCatalog reasonphrasecatalog)
    {
        if (reasonphrasecatalog == null)
        {
            throw new IllegalArgumentException("Reason phrase catalog must not be null.");
        } else
        {
            reasonCatalog = reasonphrasecatalog;
            return;
        }
    }

    protected Locale determineLocale(HttpContext httpcontext)
    {
        return Locale.getDefault();
    }

    public HttpResponse newHttpResponse(ProtocolVersion protocolversion, int i, HttpContext httpcontext)
    {
        if (protocolversion == null)
        {
            throw new IllegalArgumentException("HTTP version may not be null");
        } else
        {
            httpcontext = determineLocale(httpcontext);
            return new BasicHttpResponse(new BasicStatusLine(protocolversion, i, reasonCatalog.getReason(i, httpcontext)), reasonCatalog, httpcontext);
        }
    }

    public HttpResponse newHttpResponse(StatusLine statusline, HttpContext httpcontext)
    {
        if (statusline == null)
        {
            throw new IllegalArgumentException("Status line may not be null");
        } else
        {
            httpcontext = determineLocale(httpcontext);
            return new BasicHttpResponse(statusline, reasonCatalog, httpcontext);
        }
    }
}
