// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.entity;

import org.apache.http.HttpEntity;
import org.apache.http.HttpMessage;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.io.SessionInputBuffer;

public class EntityDeserializer
{

    private final ContentLengthStrategy lenStrategy;

    public EntityDeserializer(ContentLengthStrategy contentlengthstrategy)
    {
        if (contentlengthstrategy == null)
        {
            throw new IllegalArgumentException("Content length strategy may not be null");
        } else
        {
            lenStrategy = contentlengthstrategy;
            return;
        }
    }

    public HttpEntity deserialize(SessionInputBuffer sessioninputbuffer, HttpMessage httpmessage)
    {
        if (sessioninputbuffer == null)
        {
            throw new IllegalArgumentException("Session input buffer may not be null");
        }
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        } else
        {
            return doDeserialize(sessioninputbuffer, httpmessage);
        }
    }

    protected BasicHttpEntity doDeserialize(SessionInputBuffer sessioninputbuffer, HttpMessage httpmessage)
    {
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        long l = lenStrategy.determineLength(httpmessage);
        if (l == -2L)
        {
            basichttpentity.setChunked(true);
            basichttpentity.setContentLength(-1L);
            basichttpentity.setContent(new ChunkedInputStream(sessioninputbuffer));
        } else
        if (l == -1L)
        {
            basichttpentity.setChunked(false);
            basichttpentity.setContentLength(-1L);
            basichttpentity.setContent(new IdentityInputStream(sessioninputbuffer));
        } else
        {
            basichttpentity.setChunked(false);
            basichttpentity.setContentLength(l);
            basichttpentity.setContent(new ContentLengthInputStream(sessioninputbuffer, l));
        }
        sessioninputbuffer = httpmessage.getFirstHeader("Content-Type");
        if (sessioninputbuffer != null)
        {
            basichttpentity.setContentType(sessioninputbuffer);
        }
        sessioninputbuffer = httpmessage.getFirstHeader("Content-Encoding");
        if (sessioninputbuffer != null)
        {
            basichttpentity.setContentEncoding(sessioninputbuffer);
        }
        return basichttpentity;
    }
}
