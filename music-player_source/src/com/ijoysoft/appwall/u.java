// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public final class u
{

    public static long a = -1L;

    public static InputStream a(String s)
    {
        s = c(s);
        if (s != null)
        {
            return s.getContent();
        } else
        {
            return null;
        }
    }

    public static byte[] b(String s)
    {
        s = c(s);
        if (s != null)
        {
            return EntityUtils.toByteArray(s);
        } else
        {
            return null;
        }
    }

    private static HttpEntity c(String s)
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.getParams().setParameter("http.connection.timeout", Integer.valueOf(3000));
        s = defaulthttpclient.execute(new HttpGet((new StringBuilder(s)).toString()));
        if (s.getStatusLine().getStatusCode() == 200)
        {
            return s.getEntity();
        } else
        {
            return null;
        }
    }

}
