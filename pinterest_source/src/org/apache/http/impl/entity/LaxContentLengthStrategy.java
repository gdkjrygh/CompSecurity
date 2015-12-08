// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.params.HttpParams;

public class LaxContentLengthStrategy
    implements ContentLengthStrategy
{

    private final int implicitLen;

    public LaxContentLengthStrategy()
    {
        this(-1);
    }

    public LaxContentLengthStrategy(int i)
    {
        implicitLen = i;
    }

    public long determineLength(HttpMessage httpmessage)
    {
        Header header;
        boolean flag;
        if (httpmessage == null)
        {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
        flag = httpmessage.getParams().isParameterTrue("http.protocol.strict-transfer-encoding");
        header = httpmessage.getFirstHeader("Transfer-Encoding");
        if (header == null) goto _L2; else goto _L1
_L1:
        int j;
        try
        {
            httpmessage = header.getElements();
        }
        // Misplaced declaration of an exception variable
        catch (HttpMessage httpmessage)
        {
            throw new ProtocolException((new StringBuilder("Invalid Transfer-Encoding header value: ")).append(header).toString(), httpmessage);
        }
        if (flag)
        {
            for (int i = 0; i < httpmessage.length; i++)
            {
                String s = httpmessage[i].getName();
                if (s != null && s.length() > 0 && !s.equalsIgnoreCase("chunked") && !s.equalsIgnoreCase("identity"))
                {
                    throw new ProtocolException((new StringBuilder("Unsupported transfer encoding: ")).append(s).toString());
                }
            }

        }
        j = httpmessage.length;
        if (!"identity".equalsIgnoreCase(header.getValue())) goto _L4; else goto _L3
_L3:
        long l1 = -1L;
_L7:
        return l1;
_L4:
        if (j > 0 && "chunked".equalsIgnoreCase(httpmessage[j - 1].getName()))
        {
            return -2L;
        }
        if (flag)
        {
            throw new ProtocolException("Chunk-encoding must be the last one applied");
        } else
        {
            return -1L;
        }
_L2:
        if (httpmessage.getFirstHeader("Content-Length") == null) goto _L6; else goto _L5
_L5:
        httpmessage = httpmessage.getHeaders("Content-Length");
        if (flag && httpmessage.length > 1)
        {
            throw new ProtocolException("Multiple content length headers");
        }
        j = httpmessage.length - 1;
_L8:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        header = httpmessage[j];
        long l = Long.parseLong(header.getValue());
_L9:
        l1 = l;
        if (l < 0L)
        {
            return -1L;
        }
          goto _L7
        NumberFormatException numberformatexception;
        numberformatexception;
        if (flag)
        {
            throw new ProtocolException((new StringBuilder("Invalid content length: ")).append(header.getValue()).toString());
        }
        j--;
          goto _L8
_L6:
        return (long)implicitLen;
        l = -1L;
          goto _L9
    }
}
