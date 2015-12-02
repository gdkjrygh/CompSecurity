// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
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

// Referenced classes of package com.qihoo.antivirus.update:
//            i

public class w
{

    public static InputStream a(HttpClient httpclient, HttpPost httppost, String s, byte abyte0[])
    {
        abyte0 = new ByteArrayEntity(abyte0);
        abyte0.setContentType(s);
        httppost.setEntity(abyte0);
        return a(httpclient, ((HttpUriRequest) (httppost)));
    }

    public static InputStream a(HttpClient httpclient, HttpPost httppost, f f)
    {
        httppost.setEntity(f);
        return a(httpclient, ((HttpUriRequest) (httppost)));
    }

    private static InputStream a(HttpClient httpclient, HttpUriRequest httpurirequest)
    {
        int j;
        try
        {
            httpclient = httpclient.execute(httpurirequest);
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            httpclient = null;
        }
        if (httpclient == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        httpurirequest = httpclient.getStatusLine();
        if (httpurirequest == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        j = httpurirequest.getStatusCode();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_102;
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
        return null;
    }

    public static HttpClient a(HttpHost httphost, int j, int k)
    {
        String s = i.a();
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUserAgent(basichttpparams, s);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, j);
        HttpConnectionParams.setSoTimeout(basichttpparams, k);
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, true);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        ConnRouteParams.setDefaultProxy(basichttpparams, httphost);
        httphost = new SchemeRegistry();
        httphost.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        return new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, httphost), basichttpparams);
    }
}
