// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http.javanet;

import com.google.api.client.util.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MockHttpURLConnection extends HttpURLConnection
{

    public static final byte ERROR_BUF[] = new byte[5];
    public static final byte INPUT_BUF[] = new byte[1];
    private boolean doOutputCalled;
    private InputStream errorStream;
    private InputStream inputStream;
    private OutputStream outputStream;

    public MockHttpURLConnection(URL url)
    {
        super(url);
        outputStream = new ByteArrayOutputStream(0);
        inputStream = new ByteArrayInputStream(INPUT_BUF);
        errorStream = new ByteArrayInputStream(ERROR_BUF);
    }

    public void connect()
        throws IOException
    {
    }

    public void disconnect()
    {
    }

    public final boolean doOutputCalled()
    {
        return doOutputCalled;
    }

    public InputStream getErrorStream()
    {
        return errorStream;
    }

    public InputStream getInputStream()
        throws IOException
    {
        if (responseCode < 400)
        {
            return inputStream;
        } else
        {
            throw new IOException();
        }
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        if (outputStream != null)
        {
            return outputStream;
        } else
        {
            return super.getOutputStream();
        }
    }

    public int getResponseCode()
        throws IOException
    {
        return responseCode;
    }

    public void setDoOutput(boolean flag)
    {
        doOutputCalled = true;
    }

    public MockHttpURLConnection setOutputStream(OutputStream outputstream)
    {
        outputStream = outputstream;
        return this;
    }

    public MockHttpURLConnection setResponseCode(int i)
    {
        boolean flag;
        if (i >= -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        responseCode = i;
        return this;
    }

    public boolean usingProxy()
    {
        return false;
    }

}
