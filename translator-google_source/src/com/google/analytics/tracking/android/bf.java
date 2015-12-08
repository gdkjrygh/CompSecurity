// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.analytics.tracking.android:
//            m, bk, an, aq, 
//            ap

final class bf
    implements m
{

    private final String a;
    private final ap b;
    private final Context c;

    bf(ap ap1, Context context)
    {
        this(ap1, context, (byte)0);
    }

    private bf(ap ap1, Context context, byte byte0)
    {
        c = context.getApplicationContext();
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", "2.0", android.os.Build.VERSION.RELEASE, bk.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = ap1;
    }

    private static URL a(an an1)
    {
        if (TextUtils.isEmpty(an1.d))
        {
            return null;
        }
        try
        {
            an1 = new URL(an1.d);
        }
        // Misplaced declaration of an exception variable
        catch (an an1)
        {
            try
            {
                an1 = new URL("http://www.google-analytics.com/collect");
            }
            // Misplaced declaration of an exception variable
            catch (an an1)
            {
                return null;
            }
            return an1;
        }
        return an1;
    }

    private HttpEntityEnclosingRequest a(String s, String s1)
    {
        String s2;
        if (TextUtils.isEmpty(s))
        {
            aq.f("Empty hit, discarding.");
            return null;
        }
        s2 = (new StringBuilder()).append(s1).append("?").append(s).toString();
        if (s2.length() >= 2036) goto _L2; else goto _L1
_L1:
        s = new BasicHttpEntityEnclosingRequest("GET", s2);
_L4:
        s.addHeader("User-Agent", a);
        return s;
_L2:
        s1 = new BasicHttpEntityEnclosingRequest("POST", s1);
        try
        {
            s1.setEntity(new StringEntity(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            aq.f("Encoding error, discarding hit");
            return null;
        }
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(boolean flag, HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            stringbuffer.append(aheader[i].toString()).append("\n");
        }

        stringbuffer.append(httpentityenclosingrequest.getRequestLine().toString()).append("\n");
        if (httpentityenclosingrequest.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        int j = httpentityenclosingrequest.available();
        if (j > 0)
        {
            try
            {
                byte abyte0[] = new byte[j];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                aq.f("Error Writing hit to log...");
            }
        }
        aq.c(stringbuffer.toString());
    }

    public final int a(List list)
    {
        int i;
        int j;
        int k;
        k = Math.min(list.size(), 40);
        j = 0;
        i = 0;
_L2:
        Object obj;
        HttpClient httpclient;
        Object obj1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        httpclient = b.a();
        obj = (an)list.get(j);
        obj1 = a(((an) (obj)));
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aq.a)
        {
            aq.f((new StringBuilder("No destination: discarding hit: ")).append(((an) (obj)).a).toString());
        } else
        {
            aq.f("No destination: discarding hit.");
        }
        i++;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        HttpHost httphost;
label0:
        {
            httphost = new HttpHost(((URL) (obj1)).getHost(), ((URL) (obj1)).getPort(), ((URL) (obj1)).getProtocol());
            obj1 = ((URL) (obj1)).getPath();
            if (TextUtils.isEmpty(((an) (obj)).a))
            {
                obj = "";
            } else
            {
                long l = System.currentTimeMillis();
                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(((an) (obj)).a);
                if (((an) (obj)).c > 0L)
                {
                    l -= ((an) (obj)).c;
                    if (l >= 0L)
                    {
                        stringbuilder.append("&qt=").append(l);
                    }
                }
                stringbuilder.append("&z=").append(((an) (obj)).b);
                obj = stringbuilder.toString();
            }
            obj1 = a(((String) (obj)), ((String) (obj1)));
            if (obj1 != null)
            {
                break label0;
            }
            i++;
        }
          goto _L3
        ((HttpEntityEnclosingRequest) (obj1)).addHeader("Host", httphost.toHostString());
        a(aq.a, ((HttpEntityEnclosingRequest) (obj1)));
        if (((String) (obj)).length() <= 8192) goto _L5; else goto _L4
_L4:
        aq.f("Hit too long (> 8192 bytes)--not sent");
_L7:
        i++;
          goto _L3
_L5:
        obj = httpclient.execute(httphost, ((org.apache.http.HttpRequest) (obj1)));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200) goto _L7; else goto _L6
_L6:
        aq.f((new StringBuilder("Bad response: ")).append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        return i;
        ClientProtocolException clientprotocolexception;
        clientprotocolexception;
        aq.f("ClientProtocolException sending hit; discarding hit...");
          goto _L7
        list;
        aq.f((new StringBuilder("Exception sending hit: ")).append(list.getClass().getSimpleName()).toString());
        aq.f(list.getMessage());
        return i;
        return i;
    }

    public final boolean a()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            aq.e("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }
}
