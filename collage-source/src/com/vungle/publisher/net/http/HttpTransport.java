// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import android.os.Bundle;
import android.text.TextUtils;
import com.vungle.log.Logger;
import com.vungle.publisher.dc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.net.http:
//            HttpRequest, HttpURLConnectionFactory, HttpRequestChainElement, HttpResponse

public class HttpTransport
{

    HttpURLConnectionFactory a;
    HttpResponse.Factory b;
    HttpRequestChainElement.Factory c;

    HttpTransport()
    {
    }

    private static String a(HttpRequest.a a1, int i, int j, String s, String s1, String s2, String s3)
    {
        StringBuilder stringbuilder = new StringBuilder("HTTP");
        boolean flag = a(i, j);
        if (flag)
        {
            stringbuilder.append(" redirect count ").append(i).append(',');
        }
        stringbuilder.append(" response code ").append(j).append(", content-type ").append(s).append(" for ").append(a1).append(" to");
        if (i > 0)
        {
            stringbuilder.append(" original URL ").append(s1).append(',');
        }
        stringbuilder.append(" requested URL ").append(s2);
        if (flag)
        {
            stringbuilder.append(", next URL ").append(s3);
        }
        return stringbuilder.toString();
    }

    private static void a(HttpURLConnection httpurlconnection, HttpRequest httprequest)
    {
        httprequest = httprequest.c;
        if (httprequest != null)
        {
            for (Iterator iterator = httprequest.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                Object obj = httprequest.getString(s);
                if (obj == null)
                {
                    obj = httprequest.getStringArray(s);
                    int j = obj.length;
                    int i = 0;
                    while (i < j) 
                    {
                        String s1 = obj[i];
                        Logger.v("VungleNetwork", (new StringBuilder("request header: ")).append(s).append(": ").append(s1).toString());
                        httpurlconnection.addRequestProperty(s, s1);
                        i++;
                    }
                } else
                {
                    Logger.v("VungleNetwork", (new StringBuilder("request header: ")).append(s).append(": ").append(((String) (obj))).toString());
                    httpurlconnection.addRequestProperty(s, ((String) (obj)));
                }
            }

        }
    }

    private static boolean a(int i, int j)
    {
label0:
        {
            boolean flag = false;
            if (i <= 0)
            {
                if (j == 301 || j == 302)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final HttpResponse a(HttpRequest httprequest)
    {
        ArrayList arraylist;
        int i;
        i = -1;
        arraylist = new ArrayList();
        String s;
        HttpRequest.a a1;
        a1 = httprequest.b();
        s = httprequest.b;
        Object obj1;
        int j;
        j = 0;
        obj1 = null;
_L25:
        if (j >= 5) goto _L2; else goto _L1
_L1:
        Object obj;
        Logger.d("VungleNetwork", (new StringBuilder()).append(a1).append(" ").append(s).toString());
        obj = HttpURLConnectionFactory.a(s);
        ((HttpURLConnection) (obj)).setConnectTimeout(10000);
        ((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
        ((HttpURLConnection) (obj)).setReadTimeout(10000);
        ((HttpURLConnection) (obj)).setUseCaches(false);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        ((HttpURLConnection) (obj)).setRequestMethod(a1.toString());
        a(((HttpURLConnection) (obj)), httprequest);
        obj1 = httprequest.d;
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        Logger.d("VungleNetwork", (new StringBuilder("request body: ")).append(((String) (obj1))).toString());
        abyte1 = ((String) (obj1)).getBytes();
        if (httprequest.c != null) goto _L6; else goto _L5
_L5:
        obj1 = null;
_L11:
        byte abyte0[] = abyte1;
        if ("gzip".equals(obj1))
        {
            i = abyte1.length;
            obj1 = new ByteArrayOutputStream();
            abyte0 = new GZIPOutputStream(((OutputStream) (obj1)));
            abyte0.write(abyte1);
            abyte0.close();
            abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
            Logger.v("VungleNetwork", (new StringBuilder("gzipped request from ")).append(i).append(" bytes down to ").append(abyte0.length).append(" bytes").toString());
        }
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(abyte0.length);
        ((HttpURLConnection) (obj)).getOutputStream().write(abyte0);
_L4:
        i = ((HttpURLConnection) (obj)).getResponseCode();
        if (!a(j, i)) goto _L8; else goto _L7
_L7:
        String s1;
        s1 = ((HttpURLConnection) (obj)).getHeaderField("Location");
        Logger.i("VungleNetwork", a(a1, j, i, ((HttpURLConnection) (obj)).getContentType(), httprequest.b, s, s1));
        if (((HttpURLConnection) (obj)).getHeaderFieldDate("Date", -1L) != -1L) goto _L10; else goto _L9
_L9:
        obj1 = null;
_L12:
        HttpRequestChainElement httprequestchainelement = (HttpRequestChainElement)c.a.get();
        HttpRequestChainElement.a(httprequestchainelement, s);
        HttpRequestChainElement.a(httprequestchainelement, i);
        HttpRequestChainElement.b(httprequestchainelement, s1);
        HttpRequestChainElement.a(httprequestchainelement, ((Long) (obj1)));
        arraylist.add(httprequestchainelement);
        j++;
        s = s1;
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
_L6:
        obj1 = httprequest.c.getString("Content-Encoding");
          goto _L11
_L10:
        obj1 = Long.valueOf(((HttpURLConnection) (obj)).getHeaderFieldDate("Date", -1L));
          goto _L12
_L23:
        boolean flag;
        if (!flag) goto _L14; else goto _L13
_L13:
        Logger.d("VungleNetwork", a(a1, j, i, ((HttpURLConnection) (obj)).getContentType(), httprequest.b, s, null));
        httprequest = ((HttpRequest) (obj));
_L15:
        obj = (HttpResponse)b.a.get();
        HttpResponse.a(((HttpResponse) (obj)), httprequest);
        HttpResponse.a(((HttpResponse) (obj)), arraylist);
        HttpResponse.a(((HttpResponse) (obj)), i);
        if (httprequest == null)
        {
            httprequest = null;
        } else
        {
            httprequest = String.valueOf(httprequest.getURL());
        }
        HttpResponse.a(((HttpResponse) (obj)), httprequest);
        return ((HttpResponse) (obj));
_L21:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L14:
        Logger.i("VungleNetwork", a(a1, j, i, ((HttpURLConnection) (obj)).getContentType(), httprequest.b, s, null));
        httprequest = ((HttpRequest) (obj));
          goto _L15
_L2:
        httprequest = ((HttpRequest) (obj1));
          goto _L15
        obj;
        httprequest = null;
_L19:
        Logger.w("VungleNetwork", dc.a(((Throwable) (obj))));
        i = 601;
          goto _L15
        obj;
        httprequest = null;
_L18:
        Logger.d("VungleNetwork", dc.a(((Throwable) (obj))));
        i = 602;
          goto _L15
        obj;
        httprequest = null;
_L17:
        Logger.d("VungleNetwork", dc.a(((Throwable) (obj))));
        i = 603;
          goto _L15
        obj;
        httprequest = null;
_L16:
        Logger.w("VungleNetwork", dc.a(((Throwable) (obj))));
        i = 600;
          goto _L15
        obj1;
        httprequest = ((HttpRequest) (obj));
        obj = obj1;
          goto _L16
        obj;
        httprequest = ((HttpRequest) (obj1));
          goto _L16
        obj1;
        httprequest = ((HttpRequest) (obj));
        obj = obj1;
          goto _L17
        obj;
        httprequest = ((HttpRequest) (obj1));
          goto _L17
        obj1;
        httprequest = ((HttpRequest) (obj));
        obj = obj1;
          goto _L18
        obj;
        httprequest = ((HttpRequest) (obj1));
          goto _L18
        obj1;
        httprequest = ((HttpRequest) (obj));
        obj = obj1;
          goto _L19
        obj;
        httprequest = ((HttpRequest) (obj1));
          goto _L19
_L8:
        if (i != 200) goto _L21; else goto _L20
_L20:
        flag = true;
        if (true) goto _L23; else goto _L22
_L22:
        if (true) goto _L25; else goto _L24
_L24:
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            System.setProperty("http.keepAlive", "false");
        }
    }
}
