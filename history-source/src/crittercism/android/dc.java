// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class dc
{

    private static SSLSocketFactory a = null;
    private URL b;
    private Map c;
    private int d;
    private boolean e;
    private boolean f;
    private String g;
    private boolean h;
    private int i;

    public dc(URL url)
    {
        c = new HashMap();
        d = 0;
        e = true;
        f = true;
        g = "POST";
        h = false;
        i = 2500;
        b = url;
        c.put("User-Agent", Arrays.asList(new String[] {
            "5.0.4"
        }));
        c.put("Content-Type", Arrays.asList(new String[] {
            "application/json"
        }));
        c.put("Accept", Arrays.asList(new String[] {
            "text/plain", "application/json"
        }));
    }

    public final HttpURLConnection a()
    {
label0:
        {
            HttpURLConnection httpurlconnection = (HttpURLConnection)b.openConnection();
            for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Iterator iterator1 = ((List)entry.getValue()).iterator();
                while (iterator1.hasNext()) 
                {
                    String s = (String)iterator1.next();
                    httpurlconnection.addRequestProperty((String)entry.getKey(), s);
                }
            }

            httpurlconnection.setConnectTimeout(i);
            httpurlconnection.setReadTimeout(i);
            httpurlconnection.setDoInput(e);
            httpurlconnection.setDoOutput(f);
            if (h)
            {
                httpurlconnection.setChunkedStreamingMode(d);
            }
            httpurlconnection.setRequestMethod(g);
            if (httpurlconnection instanceof HttpsURLConnection)
            {
                HttpsURLConnection httpsurlconnection = (HttpsURLConnection)httpurlconnection;
                if (a == null)
                {
                    break label0;
                }
                httpsurlconnection.setSSLSocketFactory(a);
            }
            return httpurlconnection;
        }
        throw new GeneralSecurityException();
    }

    static 
    {
        try
        {
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, null, null);
            a = sslcontext.getSocketFactory();
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            a = null;
        }
    }
}
