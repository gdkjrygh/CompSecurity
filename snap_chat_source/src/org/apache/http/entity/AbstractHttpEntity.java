// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

public abstract class AbstractHttpEntity
    implements HttpEntity
{

    protected boolean chunked;
    protected Header contentEncoding;
    protected Header contentType;

    public AbstractHttpEntity()
    {
    }

    public void consumeContent()
    {
    }

    public Header getContentEncoding()
    {
        return contentEncoding;
    }

    public Header getContentType()
    {
        return contentType;
    }

    public boolean isChunked()
    {
        return chunked;
    }

    public void setContentEncoding(String s)
    {
        BasicHeader basicheader = null;
        if (s != null)
        {
            basicheader = new BasicHeader("Content-Encoding", s);
        }
        setContentEncoding(((Header) (basicheader)));
    }

    public void setContentEncoding(Header header)
    {
        contentEncoding = header;
    }

    public void setContentType(String s)
    {
        BasicHeader basicheader = null;
        if (s != null)
        {
            basicheader = new BasicHeader("Content-Type", s);
        }
        setContentType(((Header) (basicheader)));
    }

    public void setContentType(Header header)
    {
        contentType = header;
    }
}
