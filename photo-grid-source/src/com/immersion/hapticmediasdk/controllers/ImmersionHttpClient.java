// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import com.immersion.hapticmediasdk.utils.Log;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class ImmersionHttpClient
{

    private static final String a = "ImmersionHttpClient";
    public static int b044604460446044604460446 = 0;
    public static int b044604460446044604460446 = 1;
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 3;
    private DefaultHttpClient b;

    private ImmersionHttpClient()
    {
        if (((b044604460446044604460446() + b044604460446044604460446) * b044604460446044604460446()) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
        }
        b = null;
    }

    private HttpResponse a(HttpUriRequest httpurirequest, Map map, int i)
    {
        Object obj = httpurirequest.getURI();
        if (((URI) (obj)).getHost() != null)
        {
            obj = ((URI) (obj)).getHost().trim();
        } else
        {
            obj = "";
        }
        if (((String) (obj)).length() > 0)
        {
            httpurirequest.setHeader("Host", ((String) (obj)));
            if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
            {
                b044604460446044604460446 = 43;
                b044604460446044604460446 = 98;
            }
        }
        if (map != null)
        {
            for (map = map.entrySet().iterator(); map.hasNext(); httpurirequest.setHeader((String)((java.util.Map.Entry) (obj)).getKey(), (String)((java.util.Map.Entry) (obj)).getValue()))
            {
                obj = (java.util.Map.Entry)map.next();
            }

        }
        break MISSING_BLOCK_LABEL_237;
        map = httpurirequest.getAllHeaders();
        Log.d("ImmersionHttpClient", (new StringBuilder("request URI [")).append(httpurirequest.getURI()).append("]").toString());
        k = map.length;
        j = 0;
        while (j < k) 
        {
            stringbuilder = map[j];
            stringbuilder = (new StringBuilder("request header [")).append(stringbuilder.toString());
            Log.d("ImmersionHttpClient", stringbuilder.append("]").toString());
            j++;
        }
        HttpConnectionParams.setSoTimeout(b.getParams(), i);
        httpurirequest = b.execute(httpurirequest);
        if (httpurirequest == null)
        {
            throw new RuntimeException("Null response returned.");
        } else
        {
            return httpurirequest;
        }
    }

    private void a()
    {
        if (b == null)
        {
            int i = b044604460446044604460446;
            BasicHttpParams basichttpparams;
            switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
            {
            default:
                b044604460446044604460446 = 66;
                b044604460446044604460446 = 39;
                // fall through

            case 0: // '\0'
                basichttpparams = new BasicHttpParams();
                break;
            }
            ConnManagerParams.setMaxTotalConnections(basichttpparams, 5);
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 5000);
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
            b = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
    }

    public static int b044604460446044604460446()
    {
        return 1;
    }

    public static int b044604460446044604460446()
    {
        return 26;
    }

    public static ImmersionHttpClient getHttpClient()
    {
        ImmersionHttpClient immersionhttpclient = new ImmersionHttpClient();
        immersionhttpclient.a();
        int i = b044604460446044604460446();
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 31;
            // fall through

        case 0: // '\0'
            return immersionhttpclient;
        }
    }

    public HttpResponse executeDelete(String s, Map map, int i)
    {
        s = new HttpDelete(s);
        if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446)
        {
            b044604460446044604460446 = 82;
            b044604460446044604460446 = b044604460446044604460446();
        }
        return a(s, map, i);
    }

    public HttpResponse executeGet(String s, Map map, int i)
    {
        int j = b044604460446044604460446;
        switch ((j * (b044604460446044604460446() + j)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            s = new HttpGet(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            s = a(s, map, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
    }

    public HttpResponse executePost(String s, Map map, int i)
    {
        return a(new HttpPost(s), map, i);
    }

    public HttpResponse executePostWithBody(String s, String s1, Map map, int i)
    {
        s = new HttpPost(s);
        s1 = new StringEntity(s1, "UTF-8");
        int j = b044604460446044604460446;
        switch ((j * (b044604460446044604460446 + j)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 81;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            s.setEntity(s1);
            return a(s, map, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s;
        throw s;
        s;
        throw s;
    }

    public HttpParams getParams()
    {
        int i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446 + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = 18;
            b044604460446044604460446 = b044604460446044604460446();
            break;

        case 0: // '\0'
            break;
        }
        Object obj;
        try
        {
            obj = b;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            obj = ((DefaultHttpClient) (obj)).getParams();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return ((HttpParams) (obj));
    }
}
