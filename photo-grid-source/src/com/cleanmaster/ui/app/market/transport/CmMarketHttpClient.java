// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.transport;

import com.cleanmaster.net.ResponseCode;
import com.cleanmaster.net.a;
import com.cleanmaster.ui.app.market.c;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.cleanmaster.ui.app.market.transport:
//            b

public class CmMarketHttpClient
{

    private static CmMarketHttpClient a = new CmMarketHttpClient();

    private CmMarketHttpClient()
    {
    }

    public static CmMarketHttpClient a()
    {
        return a;
    }

    public static String a(InputStream inputstream)
    {
        char ac[];
        StringBuilder stringbuilder;
        ac = new char[2048];
        stringbuilder = new StringBuilder();
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream, "utf-8");
        inputstream = inputstreamreader;
        int i = inputstreamreader.read(ac, 0, 2048);
_L2:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        inputstream = inputstreamreader;
        stringbuilder.append(ac, 0, i);
        inputstream = inputstreamreader;
        i = inputstreamreader.read(ac);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        Exception exception1;
        try
        {
            inputstreamreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return stringbuilder.toString();
        exception1;
        inputstreamreader = null;
_L6:
        inputstream = inputstreamreader;
        exception1.printStackTrace();
        if (inputstreamreader == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        inputstreamreader.close();
        break MISSING_BLOCK_LABEL_70;
        exception;
        inputstream = null;
_L4:
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        inputstream.close();
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        exception1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(HttpClient httpclient, String s, boolean flag)
    {
        HttpClient httpclient1;
        a a1;
        httpclient1 = httpclient;
        if (httpclient == null)
        {
            httpclient1 = b();
        }
        System.currentTimeMillis();
        a1 = new a();
        s = new HttpGet(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        s.setHeader("Accept-Encoding", "gzip");
        Object obj;
        int i;
        obj = httpclient1.execute(s);
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        a1.a(((HttpResponse) (obj)));
        if (i != 200)
        {
            if (httpclient1 != null)
            {
                httpclient1.getConnectionManager().shutdown();
            }
            System.currentTimeMillis();
            return null;
        }
        httpclient = ((HttpResponse) (obj)).getEntity().getContent();
        obj = ((HttpResponse) (obj)).getFirstHeader("Content-Encoding");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (((Header) (obj)).getValue().equalsIgnoreCase("gzip"))
        {
            httpclient = new GZIPInputStream(new BufferedInputStream(httpclient));
        }
        httpclient = a(((InputStream) (httpclient)));
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return httpclient;
        httpclient;
        a1.a(ResponseCode.ParamError);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.ParamError).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.Timeout);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.Timeout).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.NetworkError);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.NetworkError).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.NetworkError);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.NetworkError).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.ParamError);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.ParamError).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.Timeout);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.Timeout).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.Timeout);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.Timeout).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.NeedReRequst);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(").append(ResponseCode.NeedReRequst).append(")");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(NPE)");
        a1.a(ResponseCode.NeedReRequst);
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        s = null;
_L2:
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(IO)");
        s.abort();
        httpclient.printStackTrace();
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        a1.a(ResponseCode.NetworkError);
        (new StringBuilder()).append(httpclient.getLocalizedMessage()).append("(UNKNOW)");
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        return null;
        httpclient;
        if (httpclient1 != null)
        {
            httpclient1.getConnectionManager().shutdown();
        }
        System.currentTimeMillis();
        throw httpclient;
        httpclient;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static HttpClient b()
    {
        Object obj = new BasicHttpParams();
        ConnManagerParams.setMaxTotalConnections(((HttpParams) (obj)), 1);
        ConnManagerParams.setTimeout(((HttpParams) (obj)), 20000L);
        HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 20000);
        HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 20000);
        obj = new DefaultHttpClient(com.cleanmaster.ui.app.market.transport.b.a(((HttpParams) (obj))), ((HttpParams) (obj)));
        ((HttpClient) (obj)).getParams().setParameter("http.useragent", com.cleanmaster.ui.app.market.transport.b.b());
        return ((HttpClient) (obj));
    }

    public MarketResponse a(String s, URI uri)
    {
        if (uri != null)
        {
            if ((uri = a(null, uri.toASCIIString(), true)) != null)
            {
                return MarketResponse.fromJson(s, uri);
            }
        }
        return null;
    }

    public boolean a(String s)
    {
        s = a(null, (new StringBuilder()).append(b.j).append(s).toString(), true);
        if (s == null)
        {
            return false;
        } else
        {
            return c.a(s);
        }
    }

}
