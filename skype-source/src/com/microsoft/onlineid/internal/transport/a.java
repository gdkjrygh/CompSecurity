// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.transport;

import com.microsoft.onlineid.internal.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class a
{

    private URL a;
    private HttpsURLConnection b;

    public a(URL url)
    {
        if (url == null)
        {
            throw new IllegalArgumentException("URL cannot be null");
        } else
        {
            a = url;
            return;
        }
    }

    private void k()
    {
        if (b == null)
        {
            throw new IllegalStateException("openConnection should have been called first");
        } else
        {
            return;
        }
    }

    public final void a()
        throws IOException
    {
        b = (HttpsURLConnection)a.openConnection();
    }

    public final void a(int l)
    {
        k();
        b.setConnectTimeout(l);
    }

    public final void a(String s)
        throws ProtocolException
    {
        k();
        b.setRequestMethod(s);
    }

    public final void a(String s, String s1)
    {
        k();
        b.addRequestProperty(s, s1);
    }

    public final void a(URL url)
    {
        try
        {
            j();
        }
        catch (IllegalStateException illegalstateexception)
        {
            com.microsoft.onlineid.internal.e.a(false);
        }
        a = url;
    }

    public final void a(boolean flag)
    {
        k();
        b.setUseCaches(flag);
    }

    public final void b()
    {
        k();
        b.setDoInput(true);
    }

    public final void b(int l)
    {
        k();
        b.setReadTimeout(l);
    }

    public final String c()
    {
        k();
        return b.getRequestMethod();
    }

    public final void d()
    {
        k();
        b.setDoOutput(true);
    }

    public final OutputStream e()
        throws IOException
    {
        k();
        return b.getOutputStream();
    }

    public final int f()
        throws IOException
    {
        k();
        return b.getResponseCode();
    }

    public final InputStream g()
        throws IOException
    {
        k();
        return b.getInputStream();
    }

    public final InputStream h()
    {
        k();
        return b.getErrorStream();
    }

    public final long i()
    {
        k();
        return b.getDate();
    }

    public final void j()
    {
        k();
        b.disconnect();
    }
}
