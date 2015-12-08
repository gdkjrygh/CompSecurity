// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http.message:
//            HeaderGroup

public abstract class AbstractHttpMessage
    implements HttpMessage
{

    protected HeaderGroup headergroup;
    protected HttpParams params;

    protected AbstractHttpMessage()
    {
        throw new RuntimeException("Stub!");
    }

    protected AbstractHttpMessage(HttpParams httpparams)
    {
        throw new RuntimeException("Stub!");
    }

    public void addHeader(String s, String s1)
    {
        throw new RuntimeException("Stub!");
    }

    public void addHeader(Header header)
    {
        throw new RuntimeException("Stub!");
    }

    public boolean containsHeader(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public Header[] getAllHeaders()
    {
        throw new RuntimeException("Stub!");
    }

    public Header getFirstHeader(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public Header[] getHeaders(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public Header getLastHeader(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public HttpParams getParams()
    {
        throw new RuntimeException("Stub!");
    }

    public HeaderIterator headerIterator()
    {
        throw new RuntimeException("Stub!");
    }

    public HeaderIterator headerIterator(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public void removeHeader(Header header)
    {
        throw new RuntimeException("Stub!");
    }

    public void removeHeaders(String s)
    {
        throw new RuntimeException("Stub!");
    }

    public void setHeader(String s, String s1)
    {
        throw new RuntimeException("Stub!");
    }

    public void setHeader(Header header)
    {
        throw new RuntimeException("Stub!");
    }

    public void setHeaders(Header aheader[])
    {
        throw new RuntimeException("Stub!");
    }

    public void setParams(HttpParams httpparams)
    {
        throw new RuntimeException("Stub!");
    }
}
