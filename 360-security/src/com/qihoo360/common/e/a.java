// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.e;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.mime.f;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.qihoo360.common.e:
//            d

public class a
{

    public static InputStream a(HttpClient httpclient, HttpPost httppost, String s, byte abyte0[], int ai[])
    {
        abyte0 = new ByteArrayEntity(abyte0);
        abyte0.setContentType(s);
        httppost.setEntity(abyte0);
        return a(httpclient, ((HttpUriRequest) (httppost)), ai);
    }

    public static InputStream a(HttpClient httpclient, HttpPost httppost, f f, int ai[])
    {
        httppost.setEntity(f);
        return a(httpclient, ((HttpUriRequest) (httppost)), ai);
    }

    private static InputStream a(HttpClient httpclient, HttpUriRequest httpurirequest, int ai[])
    {
        int i = -2;
        httpclient = httpclient.execute(httpurirequest);
        i = 0;
_L3:
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (ai != null)
        {
            ai[0] = i;
        }
_L4:
        return null;
        httpclient;
        i = -1;
        httpclient = null;
          goto _L3
        httpclient;
        httpclient = null;
          goto _L3
        httpclient;
        httpclient = null;
          goto _L3
        httpclient;
        i = -3;
        httpclient = null;
          goto _L3
        httpclient;
        i = -4;
        httpclient = null;
          goto _L3
        httpclient;
        i = -5;
        httpclient = null;
          goto _L3
        httpclient;
        httpclient = null;
        i = -99;
          goto _L3
_L2:
        byte byte0 = i;
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        httpurirequest = httpclient.getStatusLine();
        byte0 = i;
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        i = httpurirequest.getStatusCode();
        if (i < 200 || i >= 300)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        httpurirequest = httpclient.getEntity();
        httpclient = httpurirequest.getContentEncoding();
        if (httpclient != null)
        {
            httpclient = httpclient.getValue();
        } else
        {
            httpclient = null;
        }
        if ("gzip".equals(httpclient))
        {
            return new GZIPInputStream(httpurirequest.getContent());
        }
        httpclient = httpurirequest.getContent();
        return httpclient;
        httpclient;
        byte0 = -11;
_L5:
        i = byte0;
        if (byte0 == 0)
        {
            i = -99;
        }
        if (ai != null)
        {
            ai[0] = i;
            return null;
        }
          goto _L4
        byte0 = -8;
          goto _L5
    }

    public static HttpClient a(HttpHost httphost, int i, int j)
    {
        String s = d.a();
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basichttpparams, s);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, i);
        HttpConnectionParams.setSoTimeout(basichttpparams, j);
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, true);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        ConnRouteParams.setDefaultProxy(basichttpparams, httphost);
        httphost = new SchemeRegistry();
        httphost.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, httphost), basichttpparams);
    }
}
