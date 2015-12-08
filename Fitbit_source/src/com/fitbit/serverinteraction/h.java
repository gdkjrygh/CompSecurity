// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;

public class h
    implements HttpResponse
{

    protected final HttpResponse a;

    h(HttpResponse httpresponse)
        throws IllegalArgumentException
    {
        if (httpresponse == null)
        {
            throw new IllegalArgumentException("HttpResponseProxy: argument \"response\" cannot be null");
        } else
        {
            a = httpresponse;
            return;
        }
    }

    public void addHeader(String s, String s1)
    {
        a.addHeader(s, s1);
    }

    public void addHeader(Header header)
    {
        a.addHeader(header);
    }

    public boolean containsHeader(String s)
    {
        return a.containsHeader(s);
    }

    public Header[] getAllHeaders()
    {
        return a.getAllHeaders();
    }

    public HttpEntity getEntity()
    {
        return a.getEntity();
    }

    public Header getFirstHeader(String s)
    {
        return a.getFirstHeader(s);
    }

    public Header[] getHeaders(String s)
    {
        return a.getHeaders(s);
    }

    public Header getLastHeader(String s)
    {
        return a.getLastHeader(s);
    }

    public Locale getLocale()
    {
        return a.getLocale();
    }

    public HttpParams getParams()
    {
        return a.getParams();
    }

    public ProtocolVersion getProtocolVersion()
    {
        return a.getProtocolVersion();
    }

    public StatusLine getStatusLine()
    {
        return a.getStatusLine();
    }

    public HeaderIterator headerIterator()
    {
        return a.headerIterator();
    }

    public HeaderIterator headerIterator(String s)
    {
        return a.headerIterator(s);
    }

    public void removeHeader(Header header)
    {
        a.removeHeader(header);
    }

    public void removeHeaders(String s)
    {
        a.removeHeaders(s);
    }

    public void setEntity(HttpEntity httpentity)
    {
        a.setEntity(httpentity);
    }

    public void setHeader(String s, String s1)
    {
        a.setHeader(s, s1);
    }

    public void setHeader(Header header)
    {
        a.setHeader(header);
    }

    public void setHeaders(Header aheader[])
    {
        a.setHeaders(aheader);
    }

    public void setLocale(Locale locale)
    {
        a.setLocale(locale);
    }

    public void setParams(HttpParams httpparams)
    {
        a.setParams(httpparams);
    }

    public void setReasonPhrase(String s)
        throws IllegalStateException
    {
        a.setReasonPhrase(s);
    }

    public void setStatusCode(int i)
        throws IllegalStateException
    {
        a.setStatusCode(i);
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i)
    {
        a.setStatusLine(protocolversion, i);
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i, String s)
    {
        a.setStatusLine(protocolversion, i, s);
    }

    public void setStatusLine(StatusLine statusline)
    {
        a.setStatusLine(statusline);
    }
}
