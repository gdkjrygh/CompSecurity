// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;
import java.io.InputStream;

public abstract class LowLevelHttpResponse
{

    public LowLevelHttpResponse()
    {
    }

    public void disconnect()
        throws IOException
    {
    }

    public abstract InputStream getContent()
        throws IOException;

    public abstract String getContentEncoding()
        throws IOException;

    public abstract long getContentLength()
        throws IOException;

    public abstract String getContentType()
        throws IOException;

    public abstract int getHeaderCount()
        throws IOException;

    public abstract String getHeaderName(int i)
        throws IOException;

    public abstract String getHeaderValue(int i)
        throws IOException;

    public abstract String getReasonPhrase()
        throws IOException;

    public abstract int getStatusCode()
        throws IOException;

    public abstract String getStatusLine()
        throws IOException;
}
