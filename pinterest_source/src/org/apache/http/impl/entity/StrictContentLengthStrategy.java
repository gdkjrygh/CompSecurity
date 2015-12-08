// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.ContentLengthStrategy;

public class StrictContentLengthStrategy
    implements ContentLengthStrategy
{

    private final int implicitLen;

    public StrictContentLengthStrategy()
    {
        this(-1);
    }

    public StrictContentLengthStrategy(int i)
    {
        implicitLen = i;
    }

    public long determineLength(HttpMessage httpmessage)
    {
        Object obj;
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        obj = httpmessage.getFirstHeader("Transfer-Encoding");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Header) (obj)).getValue();
        if (!"chunked".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
_L3:
        long l;
        if (httpmessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0))
        {
            throw new ProtocolException((new StringBuilder("Chunked transfer encoding not allowed for ")).append(httpmessage.getProtocolVersion()).toString());
        }
        l = -2L;
_L6:
        return l;
_L4:
        if ("identity".equalsIgnoreCase(((String) (obj))))
        {
            return -1L;
        } else
        {
            throw new ProtocolException((new StringBuilder("Unsupported transfer encoding: ")).append(((String) (obj))).toString());
        }
_L2:
        httpmessage = httpmessage.getFirstHeader("Content-Length");
        if (httpmessage == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        httpmessage = httpmessage.getValue();
        long l1;
        try
        {
            l1 = Long.parseLong(httpmessage);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new ProtocolException((new StringBuilder("Invalid content length: ")).append(httpmessage).toString());
        }
        l = l1;
        if (l1 >= 0L) goto _L6; else goto _L5
_L5:
        throw new ProtocolException((new StringBuilder("Negative content length: ")).append(httpmessage).toString());
        return (long)implicitLen;
    }
}
