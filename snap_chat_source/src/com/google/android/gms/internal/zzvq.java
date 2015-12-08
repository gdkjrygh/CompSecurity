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
//            zzvr

class zzvq
    implements zzvr
{

    private HttpURLConnection zzaCF;

    zzvq()
    {
    }

    private InputStream zza(HttpURLConnection httpurlconnection)
    {
        int i = httpurlconnection.getResponseCode();
        if (i == 200)
        {
            return httpurlconnection.getInputStream();
        }
        httpurlconnection = (new StringBuilder("Bad response: ")).append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(httpurlconnection);
        } else
        {
            throw new IOException(httpurlconnection);
        }
    }

    private void zzb(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
    }

    public void close()
    {
        zzb(zzaCF);
    }

    public InputStream zzdG(String s)
    {
        zzaCF = zzdH(s);
        return zza(zzaCF);
    }

    HttpURLConnection zzdH(String s)
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setReadTimeout(20000);
        s.setConnectTimeout(20000);
        return s;
    }
}
