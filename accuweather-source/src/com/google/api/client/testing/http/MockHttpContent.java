// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.http.HttpContent;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.OutputStream;

public class MockHttpContent
    implements HttpContent
{

    private byte content[];
    private long length;
    private String type;

    public MockHttpContent()
    {
        length = -1L;
        content = new byte[0];
    }

    public final byte[] getContent()
    {
        return content;
    }

    public long getLength()
        throws IOException
    {
        return length;
    }

    public String getType()
    {
        return type;
    }

    public boolean retrySupported()
    {
        return true;
    }

    public MockHttpContent setContent(byte abyte0[])
    {
        content = (byte[])Preconditions.checkNotNull(abyte0);
        return this;
    }

    public MockHttpContent setLength(long l)
    {
        boolean flag;
        if (l >= -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        length = l;
        return this;
    }

    public MockHttpContent setType(String s)
    {
        type = s;
        return this;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(content);
        outputstream.flush();
    }
}
