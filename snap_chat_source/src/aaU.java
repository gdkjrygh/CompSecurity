// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class aaU
{

    private static SSLSocketFactory a = null;
    private URL b;
    private Map c;
    private boolean d;
    private boolean e;
    private String f;
    private int g;

    public aaU(URL url)
    {
        c = new HashMap();
        d = true;
        e = true;
        f = "POST";
        g = 2500;
        b = url;
        c.put("User-Agent", Arrays.asList(new String[] {
            "5.2.0"
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

            httpurlconnection.setConnectTimeout(g);
            httpurlconnection.setReadTimeout(g);
            httpurlconnection.setDoInput(d);
            httpurlconnection.setDoOutput(e);
            httpurlconnection.setRequestMethod(f);
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
        Object obj;
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, null, null);
        obj = ((SSLContext) (obj)).getSocketFactory();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (obj instanceof afd)
        {
            a = ((afd)obj).a;
            break MISSING_BLOCK_LABEL_54;
        }
        try
        {
            a = ((SSLSocketFactory) (obj));
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            a = null;
        }
    }
}
