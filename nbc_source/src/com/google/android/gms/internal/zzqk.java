// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzql

class zzqk
    implements zzql
{

    private HttpURLConnection zzaPT;

    zzqk()
    {
    }

    private InputStream zzc(HttpURLConnection httpurlconnection)
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

    private void zzd(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
    }

    public void close()
    {
        zzd(zzaPT);
    }

    public InputStream zzfd(String s)
        throws IOException
    {
        zzaPT = zzfe(s);
        return zzc(zzaPT);
    }

    HttpURLConnection zzfe(String s)
        throws IOException
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setReadTimeout(20000);
        s.setConnectTimeout(20000);
        return s;
    }
}
