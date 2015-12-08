// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.http;

import android.content.Context;
import com.facebook.ads.internal.dto.f;
import com.facebook.ads.internal.e;
import com.facebook.ads.internal.util.g;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.p;
import com.facebook.ads.internal.util.q;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

// Referenced classes of package com.facebook.ads.internal.http:
//            d, b, c

public class com.facebook.ads.internal.http.a
{
    private static class a extends HttpEntityWrapper
    {

        public InputStream getContent()
        {
            return new GZIPInputStream(wrappedEntity.getContent());
        }

        public long getContentLength()
        {
            return -1L;
        }

        public a(HttpEntity httpentity)
        {
            super(httpentity);
        }
    }


    private static final p a;
    private static final ThreadPoolExecutor b;
    private final DefaultHttpClient c;
    private final Map d = new WeakHashMap();
    private final Map e = new HashMap();
    private Context f;

    public com.facebook.ads.internal.http.a(Context context, e e1)
    {
        f = context;
        BasicHttpParams basichttpparams = new BasicHttpParams();
        basichttpparams.setParameter("http.protocol.cookie-policy", "compatibility");
        ConnManagerParams.setTimeout(basichttpparams, 10000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(100));
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 100);
        HttpConnectionParams.setSoTimeout(basichttpparams, 10000);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 10000);
        HttpConnectionParams.setTcpNoDelay(basichttpparams, true);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpProtocolParams.setUserAgent(basichttpparams, (new StringBuilder()).append(h.a(context, e1)).append(" [").append("FBAN/AudienceNetworkForAndroid;").append("FBSN/").append("Android").append(";").append("FBSV/").append(f.a).append(";").append("FBAB/").append(f.d).append(";").append("FBAV/").append(f.f).append(";").append("FBBV/").append(f.g).append(";").append("FBLC/").append(Locale.getDefault().toString()).append("]").toString());
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        context = new SchemeRegistry();
        context.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        if (g.a())
        {
            a(basichttpparams, context);
        } else
        {
            context.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        }
        c = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, context), basichttpparams);
        c.addRequestInterceptor(new HttpRequestInterceptor() {

            final com.facebook.ads.internal.http.a a;

            public void process(HttpRequest httprequest, HttpContext httpcontext)
            {
                if (!httprequest.containsHeader("Accept-Encoding"))
                {
                    httprequest.addHeader("Accept-Encoding", "gzip");
                }
                String s;
                for (httpcontext = com.facebook.ads.internal.http.a.a(a).keySet().iterator(); httpcontext.hasNext(); httprequest.addHeader(s, (String)com.facebook.ads.internal.http.a.a(a).get(s)))
                {
                    s = (String)httpcontext.next();
                }

            }

            
            {
                a = com.facebook.ads.internal.http.a.this;
                super();
            }
        });
        c.addResponseInterceptor(new HttpResponseInterceptor() {

            final com.facebook.ads.internal.http.a a;

            public void process(HttpResponse httpresponse, HttpContext httpcontext)
            {
                httpcontext = httpresponse.getEntity();
                if (httpcontext != null) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if ((httpcontext = httpcontext.getContentEncoding()) != null)
                {
                    httpcontext = httpcontext.getElements();
                    int j = httpcontext.length;
                    int i = 0;
                    while (i < j) 
                    {
                        if (httpcontext[i].getName().equalsIgnoreCase("gzip"))
                        {
                            httpresponse.setEntity(new a(httpresponse.getEntity()));
                            return;
                        }
                        i++;
                    }
                }
                if (true) goto _L1; else goto _L3
_L3:
            }

            
            {
                a = com.facebook.ads.internal.http.a.this;
                super();
            }
        });
    }

    static Map a(com.facebook.ads.internal.http.a a1)
    {
        return a1.e;
    }

    private HttpEntity a(d d1)
    {
        HttpEntity httpentity = null;
        if (d1 != null)
        {
            httpentity = d1.a();
        }
        return httpentity;
    }

    private HttpEntityEnclosingRequestBase a(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, HttpEntity httpentity)
    {
        if (httpentity != null)
        {
            httpentityenclosingrequestbase.setEntity(httpentity);
        }
        return httpentityenclosingrequestbase;
    }

    private void a(BasicHttpParams basichttpparams, SchemeRegistry schemeregistry)
    {
        try
        {
            Object obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            obj = new q(((KeyStore) (obj)));
            ((SSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            HttpProtocolParams.setContentCharset(basichttpparams, "UTF-8");
            schemeregistry.register(new Scheme("https", ((org.apache.http.conn.scheme.SocketFactory) (obj)), 443));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BasicHttpParams basichttpparams)
        {
            return;
        }
    }

    public void a(String s, d d1, c c1)
    {
        a(s, a(d1), null, c1);
    }

    public void a(String s, HttpEntity httpentity, String s1, c c1)
    {
        a(c, ((HttpUriRequest) (a(((HttpEntityEnclosingRequestBase) (new HttpPost(s))), httpentity))), s1, c1);
    }

    protected void a(DefaultHttpClient defaulthttpclient, HttpUriRequest httpurirequest, String s, c c1)
    {
        if (s != null)
        {
            httpurirequest.addHeader("Content-Type", s);
        }
        s = new SyncBasicHttpContext(new BasicHttpContext());
        s = b.submit(new b(defaulthttpclient, s, httpurirequest, c1));
        httpurirequest = (List)d.get(f);
        defaulthttpclient = httpurirequest;
        if (httpurirequest == null)
        {
            defaulthttpclient = new LinkedList();
            d.put(f, defaulthttpclient);
        }
        defaulthttpclient.add(new WeakReference(s));
    }

    public void a(boolean flag)
    {
        Object obj = (List)d.get(f);
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Future future = (Future)((WeakReference)((Iterator) (obj)).next()).get();
                if (future != null)
                {
                    future.cancel(flag);
                }
            } while (true);
        }
        d.remove(f);
    }

    static 
    {
        a = new p();
        b = (ThreadPoolExecutor)Executors.newCachedThreadPool(a);
    }
}
