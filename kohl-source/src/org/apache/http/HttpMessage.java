// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import org.apache.http.params.HttpParams;

// Referenced classes of package org.apache.http:
//            Header, ProtocolVersion, HeaderIterator

public interface HttpMessage
{

    public abstract void addHeader(String s, String s1);

    public abstract void addHeader(Header header);

    public abstract boolean containsHeader(String s);

    public abstract Header[] getAllHeaders();

    public abstract Header getFirstHeader(String s);

    public abstract Header[] getHeaders(String s);

    public abstract Header getLastHeader(String s);

    public abstract HttpParams getParams();

    public abstract ProtocolVersion getProtocolVersion();

    public abstract HeaderIterator headerIterator();

    public abstract HeaderIterator headerIterator(String s);

    public abstract void removeHeader(Header header);

    public abstract void removeHeaders(String s);

    public abstract void setHeader(String s, String s1);

    public abstract void setHeader(Header header);

    public abstract void setHeaders(Header aheader[]);

    public abstract void setParams(HttpParams httpparams);
}
