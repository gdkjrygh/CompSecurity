// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

public class m extends HttpURLConnection
{
    private static class a extends FilterInputStream
    {

        private final ByteArrayOutputStream a = new ByteArrayOutputStream();
        private boolean b;

        static boolean a(a a1)
        {
            return a1.b;
        }

        public boolean a()
        {
            return b;
        }

        public InputStream b()
        {
            return new ByteArrayInputStream(a.toByteArray());
        }

        public int read()
            throws IOException
        {
            int i = super.read();
            if (i != -1)
            {
                a.write(i);
                return i;
            } else
            {
                b = true;
                return i;
            }
        }

        public int read(byte abyte0[])
            throws IOException
        {
            return read(abyte0, 0, abyte0.length);
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            j = super.read(abyte0, i, j);
            if (j != -1)
            {
                a.write(abyte0, i, j);
                return j;
            } else
            {
                b = true;
                return j;
            }
        }

        protected a(InputStream inputstream)
        {
            super(inputstream);
            b = false;
        }
    }


    protected final HttpURLConnection a;
    protected a b;
    protected a c;

    public m(HttpURLConnection httpurlconnection)
    {
        super(httpurlconnection.getURL());
        a = httpurlconnection;
    }

    public final HttpURLConnection a()
    {
        return a;
    }

    public void addRequestProperty(String s, String s1)
    {
        a.addRequestProperty(s, s1);
    }

    public void connect()
        throws IOException
    {
        a.connect();
    }

    public void disconnect()
    {
        a.disconnect();
    }

    public boolean getAllowUserInteraction()
    {
        return a.getAllowUserInteraction();
    }

    public int getConnectTimeout()
    {
        return a.getConnectTimeout();
    }

    public Object getContent()
        throws IOException
    {
        return a.getContent();
    }

    public Object getContent(Class aclass[])
        throws IOException
    {
        return a.getContent(aclass);
    }

    public String getContentEncoding()
    {
        return a.getContentEncoding();
    }

    public int getContentLength()
    {
        return a.getContentLength();
    }

    public String getContentType()
    {
        return a.getContentType();
    }

    public long getDate()
    {
        return a.getDate();
    }

    public boolean getDefaultUseCaches()
    {
        return a.getDefaultUseCaches();
    }

    public boolean getDoInput()
    {
        return a.getDoInput();
    }

    public boolean getDoOutput()
    {
        return a.getDoOutput();
    }

    public InputStream getErrorStream()
    {
        if (c == null)
        {
            InputStream inputstream = a.getErrorStream();
            if (inputstream != null)
            {
                c = new a(inputstream);
            }
        }
        if (c != null && a.a(c))
        {
            return c.b();
        } else
        {
            return c;
        }
    }

    public long getExpiration()
    {
        return a.getExpiration();
    }

    public String getHeaderField(int i)
    {
        return a.getHeaderField(i);
    }

    public String getHeaderField(String s)
    {
        return a.getHeaderField(s);
    }

    public long getHeaderFieldDate(String s, long l)
    {
        return a.getHeaderFieldDate(s, l);
    }

    public int getHeaderFieldInt(String s, int i)
    {
        return a.getHeaderFieldInt(s, i);
    }

    public String getHeaderFieldKey(int i)
    {
        return a.getHeaderFieldKey(i);
    }

    public Map getHeaderFields()
    {
        return a.getHeaderFields();
    }

    public long getIfModifiedSince()
    {
        return a.getIfModifiedSince();
    }

    public InputStream getInputStream()
        throws IOException
    {
        if (b == null)
        {
            InputStream inputstream = a.getInputStream();
            if (inputstream != null)
            {
                b = new a(inputstream);
            }
        }
        if (b != null && b.a())
        {
            return b.b();
        } else
        {
            return b;
        }
    }

    public boolean getInstanceFollowRedirects()
    {
        return a.getInstanceFollowRedirects();
    }

    public long getLastModified()
    {
        return a.getLastModified();
    }

    public OutputStream getOutputStream()
        throws IOException
    {
        return a.getOutputStream();
    }

    public Permission getPermission()
        throws IOException
    {
        return a.getPermission();
    }

    public int getReadTimeout()
    {
        return a.getReadTimeout();
    }

    public String getRequestMethod()
    {
        return a.getRequestMethod();
    }

    public Map getRequestProperties()
    {
        return a.getRequestProperties();
    }

    public String getRequestProperty(String s)
    {
        return a.getRequestProperty(s);
    }

    public int getResponseCode()
        throws IOException
    {
        return a.getResponseCode();
    }

    public String getResponseMessage()
        throws IOException
    {
        return a.getResponseMessage();
    }

    public URL getURL()
    {
        return a.getURL();
    }

    public boolean getUseCaches()
    {
        return a.getUseCaches();
    }

    public void setAllowUserInteraction(boolean flag)
    {
        a.setAllowUserInteraction(flag);
    }

    public void setChunkedStreamingMode(int i)
    {
        a.setChunkedStreamingMode(i);
    }

    public void setConnectTimeout(int i)
    {
        a.setConnectTimeout(i);
    }

    public void setDefaultUseCaches(boolean flag)
    {
        a.setDefaultUseCaches(flag);
    }

    public void setDoInput(boolean flag)
    {
        a.setDoInput(flag);
    }

    public void setDoOutput(boolean flag)
    {
        a.setDoOutput(flag);
    }

    public void setFixedLengthStreamingMode(int i)
    {
        a.setFixedLengthStreamingMode(i);
    }

    public void setFixedLengthStreamingMode(long l)
    {
        a.setFixedLengthStreamingMode(l);
    }

    public void setIfModifiedSince(long l)
    {
        a.setIfModifiedSince(l);
    }

    public void setInstanceFollowRedirects(boolean flag)
    {
        a.setInstanceFollowRedirects(flag);
    }

    public void setReadTimeout(int i)
    {
        a.setReadTimeout(i);
    }

    public void setRequestMethod(String s)
        throws ProtocolException
    {
        a.setRequestMethod(s);
    }

    public void setRequestProperty(String s, String s1)
    {
        a.setRequestProperty(s, s1);
    }

    public void setUseCaches(boolean flag)
    {
        a.setUseCaches(flag);
    }

    public String toString()
    {
        return a.toString();
    }

    public boolean usingProxy()
    {
        return a.usingProxy();
    }
}
