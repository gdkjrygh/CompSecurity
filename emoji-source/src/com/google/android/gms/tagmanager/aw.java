// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bl

class aw
    implements bl
{

    private HttpURLConnection afP;

    aw()
    {
    }

    private InputStream a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        int i = httpurlconnection.getResponseCode();
        if (i == 200)
        {
            return httpurlconnection.getInputStream();
        }
        httpurlconnection = (new StringBuilder()).append("Bad response: ").append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(httpurlconnection);
        } else
        {
            throw new IOException(httpurlconnection);
        }
    }

    private void b(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
    }

    public InputStream bV(String s)
        throws IOException
    {
        afP = bW(s);
        return a(afP);
    }

    HttpURLConnection bW(String s)
        throws IOException
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setReadTimeout(20000);
        s.setConnectTimeout(20000);
        return s;
    }

    public void close()
    {
        b(afP);
    }
}
