// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.net.URI;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
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
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.c.c.i;
import org.c.d.a;

// Referenced classes of package org.c.c.a:
//            g, l, j, e

public final class k
    implements g
{

    private HttpClient a;

    public k()
    {
        Object obj = new SchemeRegistry();
        ((SchemeRegistry) (obj)).register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        ((SchemeRegistry) (obj)).register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
        BasicHttpParams basichttpparams = new BasicHttpParams();
        obj = new ThreadSafeClientConnManager(basichttpparams, ((SchemeRegistry) (obj)));
        ConnManagerParams.setMaxTotalConnections(basichttpparams, 100);
        ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(5));
        a = new DefaultHttpClient(((ClientConnectionManager) (obj)), null);
        setReadTimeout(60000);
    }

    public k(HttpClient httpclient)
    {
        org.c.d.a.notNull(httpclient, "HttpClient must not be null");
        a = httpclient;
    }

    public final e createRequest(URI uri, i i1)
    {
        org.c.c.a.l.a[i1.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 76
    //                   2 108
    //                   3 120
    //                   4 132
    //                   5 144
    //                   6 156
    //                   7 168;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid HTTP method: ")).append(i1).toString());
_L2:
        uri = new HttpGet(uri);
_L10:
        HttpProtocolParams.setUseExpectContinue(uri.getParams(), false);
        return new j(getHttpClient(), uri);
_L3:
        uri = new HttpDelete(uri);
        continue; /* Loop/switch isn't completed */
_L4:
        uri = new HttpHead(uri);
        continue; /* Loop/switch isn't completed */
_L5:
        uri = new HttpOptions(uri);
        continue; /* Loop/switch isn't completed */
_L6:
        uri = new HttpPost(uri);
        continue; /* Loop/switch isn't completed */
_L7:
        uri = new HttpPut(uri);
        continue; /* Loop/switch isn't completed */
_L8:
        uri = new HttpTrace(uri);
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void destroy()
    {
        getHttpClient().getConnectionManager().shutdown();
    }

    public final HttpClient getHttpClient()
    {
        return a;
    }

    public final void setConnectTimeout(int i1)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, "Timeout must be a non-negative value");
        getHttpClient().getParams().setIntParameter("http.connection.timeout", i1);
    }

    public final void setHttpClient(HttpClient httpclient)
    {
        a = httpclient;
    }

    public final void setReadTimeout(int i1)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        org.c.d.a.isTrue(flag, "Timeout must be a non-negative value");
        getHttpClient().getParams().setIntParameter("http.socket.timeout", i1);
    }
}
