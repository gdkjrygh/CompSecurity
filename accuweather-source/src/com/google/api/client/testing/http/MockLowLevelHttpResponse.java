// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.util.TestableByteArrayInputStream;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MockLowLevelHttpResponse extends LowLevelHttpResponse
{

    private InputStream content;
    private String contentEncoding;
    private long contentLength;
    private String contentType;
    private List headerNames;
    private List headerValues;
    private boolean isDisconnected;
    private String reasonPhrase;
    private int statusCode;

    public MockLowLevelHttpResponse()
    {
        statusCode = 200;
        headerNames = new ArrayList();
        headerValues = new ArrayList();
        contentLength = -1L;
    }

    public MockLowLevelHttpResponse addHeader(String s, String s1)
    {
        headerNames.add(Preconditions.checkNotNull(s));
        headerValues.add(Preconditions.checkNotNull(s1));
        return this;
    }

    public void disconnect()
        throws IOException
    {
        isDisconnected = true;
        super.disconnect();
    }

    public InputStream getContent()
        throws IOException
    {
        return content;
    }

    public String getContentEncoding()
    {
        return contentEncoding;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public final String getContentType()
    {
        return contentType;
    }

    public int getHeaderCount()
    {
        return headerNames.size();
    }

    public String getHeaderName(int i)
    {
        return (String)headerNames.get(i);
    }

    public final List getHeaderNames()
    {
        return headerNames;
    }

    public String getHeaderValue(int i)
    {
        return (String)headerValues.get(i);
    }

    public final List getHeaderValues()
    {
        return headerValues;
    }

    public String getReasonPhrase()
    {
        return reasonPhrase;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String getStatusLine()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(statusCode);
        if (reasonPhrase != null)
        {
            stringbuilder.append(reasonPhrase);
        }
        return stringbuilder.toString();
    }

    public boolean isDisconnected()
    {
        return isDisconnected;
    }

    public MockLowLevelHttpResponse setContent(InputStream inputstream)
    {
        content = inputstream;
        return this;
    }

    public MockLowLevelHttpResponse setContent(String s)
    {
        if (s == null)
        {
            return setZeroContent();
        } else
        {
            return setContent(StringUtils.getBytesUtf8(s));
        }
    }

    public MockLowLevelHttpResponse setContent(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return setZeroContent();
        } else
        {
            content = new TestableByteArrayInputStream(abyte0);
            setContentLength(abyte0.length);
            return this;
        }
    }

    public MockLowLevelHttpResponse setContentEncoding(String s)
    {
        contentEncoding = s;
        return this;
    }

    public MockLowLevelHttpResponse setContentLength(long l)
    {
        contentLength = l;
        boolean flag;
        if (l >= -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return this;
    }

    public MockLowLevelHttpResponse setContentType(String s)
    {
        contentType = s;
        return this;
    }

    public MockLowLevelHttpResponse setHeaderNames(List list)
    {
        headerNames = (List)Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setHeaderValues(List list)
    {
        headerValues = (List)Preconditions.checkNotNull(list);
        return this;
    }

    public MockLowLevelHttpResponse setReasonPhrase(String s)
    {
        reasonPhrase = s;
        return this;
    }

    public MockLowLevelHttpResponse setStatusCode(int i)
    {
        statusCode = i;
        return this;
    }

    public MockLowLevelHttpResponse setZeroContent()
    {
        content = null;
        setContentLength(0L);
        return this;
    }
}
