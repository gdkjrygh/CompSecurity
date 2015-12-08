// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.SyncBasicHttpContext;

// Referenced classes of package com.paypal.android.sdk:
//            aH, aI, aP, aK, 
//            aL, aO

public final class aG
{

    private static int a = 10;
    private static int b = 10000;
    private final DefaultHttpClient c;
    private final HttpContext d = new SyncBasicHttpContext(new BasicHttpContext());
    private ThreadPoolExecutor e;
    private final Map f = new WeakHashMap();
    private final Map g = new HashMap();

    public aG()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        ConnManagerParams.setTimeout(basichttpparams, b);
        ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(a));
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 10);
        HttpConnectionParams.setSoTimeout(basichttpparams, b);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, b);
        HttpConnectionParams.setTcpNoDelay(basichttpparams, true);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basichttpparams, String.format("android-async-http/%s (http://loopj.com/android-async-http)", new Object[] {
            "1.4.3"
        }));
        Object obj = new SchemeRegistry();
        ((SchemeRegistry) (obj)).register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        ((SchemeRegistry) (obj)).register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        obj = new ThreadSafeClientConnManager(basichttpparams, ((SchemeRegistry) (obj)));
        c = new DefaultHttpClient(((ClientConnectionManager) (obj)), basichttpparams);
        c.addRequestInterceptor(new aH(this));
        c.addResponseInterceptor(new aI(this));
        c.setHttpRequestRetryHandler(new aP(5));
        e = (ThreadPoolExecutor)Executors.newCachedThreadPool();
    }

    static Map a(aG ag)
    {
        return ag.g;
    }

    private void a(DefaultHttpClient defaulthttpclient, HttpContext httpcontext, HttpUriRequest httpurirequest, String s, aL al, Context context)
    {
        if (s != null)
        {
            httpurirequest.addHeader("Content-Type", s);
        }
        httpurirequest = e.submit(new aK(defaulthttpclient, httpcontext, httpurirequest, al));
        if (context != null)
        {
            httpcontext = (List)f.get(context);
            defaulthttpclient = httpcontext;
            if (httpcontext == null)
            {
                defaulthttpclient = new LinkedList();
                f.put(context, defaulthttpclient);
            }
            defaulthttpclient.add(new WeakReference(httpurirequest));
        }
    }

    public final HttpClient a()
    {
        return c;
    }

    public final void a(int i)
    {
        org.apache.http.params.HttpParams httpparams = c.getParams();
        ConnManagerParams.setTimeout(httpparams, i);
        HttpConnectionParams.setSoTimeout(httpparams, i);
        HttpConnectionParams.setConnectionTimeout(httpparams, i);
    }

    public final void a(Context context, String s, Header aheader[], aL al)
    {
        s = new HttpDelete(s);
        if (aheader != null)
        {
            s.setHeaders(aheader);
        }
        a(c, d, ((HttpUriRequest) (s)), ((String) (null)), al, context);
    }

    public final void a(Context context, String s, Header aheader[], aO ao, aL al)
    {
        if (false)
        {
            throw new NullPointerException();
        }
        s = new HttpGet(s);
        if (aheader != null)
        {
            s.setHeaders(aheader);
        }
        a(c, d, ((HttpUriRequest) (s)), ((String) (null)), al, context);
    }

    public final void a(Context context, String s, Header aheader[], HttpEntity httpentity, String s1, aL al)
    {
        s = new HttpPost(s);
        if (httpentity != null)
        {
            s.setEntity(httpentity);
        }
        if (aheader != null)
        {
            s.setHeaders(aheader);
        }
        a(c, d, ((HttpUriRequest) (s)), ((String) (null)), al, context);
    }

    public final void a(Context context, boolean flag)
    {
        Object obj = (List)f.get(context);
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
                    future.cancel(true);
                }
            } while (true);
        }
        f.remove(context);
    }

    public final void a(String s)
    {
        HttpProtocolParams.setUserAgent(c.getParams(), s);
    }

    public final void a(ThreadPoolExecutor threadpoolexecutor)
    {
        e = threadpoolexecutor;
    }

    public final void a(SSLSocketFactory sslsocketfactory)
    {
        c.getConnectionManager().getSchemeRegistry().register(new Scheme("https", sslsocketfactory, 443));
    }

}
