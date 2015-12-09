// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ak, ao, w

class an
{

    private static final String f = com/threatmetrix/TrustDefenderMobile/an.toString();
    private final AndroidHttpClient a;
    private final ArrayList b = new ArrayList();
    private HttpResponse c;
    private HttpRequestBase d;
    private ak e;

    an(AndroidHttpClient androidhttpclient)
    {
        a = androidhttpclient;
        e = ak.a;
        d = null;
    }

    public static void a(Context context, HttpClient httpclient, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            context = SSLCertificateSocketFactory.getHttpSocketFactory(i, new SSLSessionCache(context));
            httpclient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", context, 443));
            return;
        } else
        {
            context = new ao(i, context);
            httpclient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", context, 443));
            return;
        }
    }

    private void a(HttpRequestBase httprequestbase)
    {
        this;
        JVM INSTR monitorenter ;
        d = httprequestbase;
        this;
        JVM INSTR monitorexit ;
        BasicHeader basicheader;
        for (httprequestbase = b.iterator(); httprequestbase.hasNext(); d.addHeader(basicheader))
        {
            basicheader = (BasicHeader)httprequestbase.next();
        }

        break MISSING_BLOCK_LABEL_52;
        httprequestbase;
        throw httprequestbase;
        HttpClientParams.setRedirecting(d.getParams(), true);
        httprequestbase = new w();
        if (httprequestbase.a() != null && !httprequestbase.a().isEmpty())
        {
            httprequestbase = new HttpHost(httprequestbase.a(), httprequestbase.b());
            a.getParams().setParameter("http.route.default-proxy", httprequestbase);
        } else
        {
            a.getParams().setParameter("http.route.default-proxy", null);
        }
        try
        {
            c = a.execute(d);
            e = ak.b;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            String s;
            if (httprequestbase.getCause() instanceof CertificateException)
            {
                e = ak.g;
            } else
            if (httprequestbase instanceof SSLPeerUnverifiedException)
            {
                e = ak.g;
            } else
            if (httprequestbase instanceof UnknownHostException)
            {
                e = ak.d;
            } else
            if (httprequestbase instanceof SocketTimeoutException)
            {
                e = ak.e;
            } else
            if (e == ak.a)
            {
                e = ak.c;
            } else
            {
                s = f;
            }
            Log.e(f, "Failed to retrieve URI", httprequestbase);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            Log.e(f, "Caught runtime exception:", httprequestbase);
        }
        e = ak.c;
        return;
    }

    final long a(String s)
    {
        a(((HttpRequestBase) (new HttpGet(s))));
        if (c == null || e != ak.b)
        {
            return -1L;
        } else
        {
            return (long)c.getStatusLine().getStatusCode();
        }
    }

    final long a(String s, HttpEntity httpentity)
    {
        s = new HttpPost(s);
        s.setEntity(httpentity);
        a(((HttpRequestBase) (s)));
        if (c == null || e != ak.b)
        {
            return -1L;
        } else
        {
            return (long)c.getStatusLine().getStatusCode();
        }
    }

    public final String a()
    {
        if (d != null)
        {
            return (new StringBuilder()).append(d.getURI().getScheme()).append("://").append(d.getURI().getHost()).append(d.getURI().getPath()).toString();
        } else
        {
            return "";
        }
    }

    final void a(Map map)
    {
        if (map != null)
        {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                String s1 = (String)map.get(s);
                b.add(new BasicHeader(s, s1));
            }
        }
    }

    public final String b()
    {
        if (d != null)
        {
            return d.getURI().getHost();
        } else
        {
            return "";
        }
    }

    public final void c()
    {
        String s = f;
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.abort();
        }
        this;
        JVM INSTR monitorexit ;
        e = ak.h;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final HttpResponse d()
    {
        return c;
    }

    public final void e()
    {
        Object obj;
        if (c != null)
        {
            if ((obj = c.getEntity()) != null)
            {
                try
                {
                    ((HttpEntity) (obj)).consumeContent();
                    return;
                }
                catch (IOException ioexception)
                {
                    ioexception = f;
                }
                return;
            }
        }
    }

    public final ak f()
    {
        return e;
    }

}
