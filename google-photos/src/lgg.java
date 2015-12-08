// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

final class lgg
    implements lgh
{

    private HttpURLConnection a;

    lgg()
    {
    }

    public final InputStream a(String s)
    {
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s.setReadTimeout(20000);
        s.setConnectTimeout(20000);
        a = s;
        s = a;
        int i = s.getResponseCode();
        if (i == 200)
        {
            return s.getInputStream();
        }
        s = (new StringBuilder("Bad response: ")).append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(s);
        } else
        {
            throw new IOException(s);
        }
    }

    public final void a()
    {
        HttpURLConnection httpurlconnection = a;
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
    }
}
