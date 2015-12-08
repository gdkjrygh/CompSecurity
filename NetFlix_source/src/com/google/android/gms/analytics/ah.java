// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

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

// Referenced classes of package com.google.android.gms.analytics:
//            n, GoogleAnalytics, ak, ab, 
//            aa, q, x, y

class ah
    implements n
{

    private final Context mContext;
    private GoogleAnalytics sX;
    private final String vI;
    private final HttpClient vJ;
    private URL vK;

    ah(HttpClient httpclient, Context context)
    {
        this(httpclient, GoogleAnalytics.getInstance(context), context);
    }

    ah(HttpClient httpclient, GoogleAnalytics googleanalytics, Context context)
    {
        mContext = context.getApplicationContext();
        vI = a("GoogleAnalytics", "3.0", android.os.Build.VERSION.RELEASE, ak.a(Locale.getDefault()), Build.MODEL, Build.ID);
        vJ = httpclient;
        sX = googleanalytics;
    }

    private void a(ab ab1, URL url, boolean flag)
    {
        if (!TextUtils.isEmpty(ab1.cU()) && db()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (vK == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        url = vK;
_L5:
        HttpHost httphost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
        ab1 = c(ab1.cU(), url.getPath());
        if (ab1 == null) goto _L1; else goto _L3
_L3:
        ab1.addHeader("Host", httphost.toHostString());
        if (aa.cT())
        {
            a(((HttpEntityEnclosingRequest) (ab1)));
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        q.p(mContext);
        int i;
        ab1 = vJ.execute(httphost, ab1);
        i = ab1.getStatusLine().getStatusCode();
        url = ab1.getEntity();
        if (url == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        url.consumeContent();
        if (i == 200) goto _L1; else goto _L4
_L4:
        try
        {
            aa.z((new StringBuilder()).append("Bad response: ").append(ab1.getStatusLine().getStatusCode()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab1)
        {
            aa.z("ClientProtocolException sending monitoring hit.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab1)
        {
            aa.z((new StringBuilder()).append("Exception sending monitoring hit: ").append(ab1.getClass().getSimpleName()).toString());
        }
        break MISSING_BLOCK_LABEL_242;
        try
        {
            url = new URL("https://ssl.google-analytics.com/collect");
        }
        // Misplaced declaration of an exception variable
        catch (ab ab1)
        {
            return;
        }
          goto _L5
        aa.z(ab1.getMessage());
        return;
    }

    private void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
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
            break MISSING_BLOCK_LABEL_146;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_146;
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
                aa.y("Error Writing hit to log...");
            }
        }
        aa.y(stringbuffer.toString());
        return;
    }

    private HttpEntityEnclosingRequest c(String s, String s1)
    {
        String s2;
        if (TextUtils.isEmpty(s))
        {
            aa.z("Empty hit, discarding.");
            return null;
        }
        s2 = (new StringBuilder()).append(s1).append("?").append(s).toString();
        if (s2.length() >= 2036) goto _L2; else goto _L1
_L1:
        s = new BasicHttpEntityEnclosingRequest("GET", s2);
_L4:
        s.addHeader("User-Agent", vI);
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
            aa.z("Encoding error, discarding hit");
            return null;
        }
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void F(String s)
    {
        try
        {
            vK = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            vK = null;
        }
    }

    public int a(List list, ab ab1, boolean flag)
    {
        Object obj;
        int i;
        int k;
        int l;
        int i1;
        boolean flag1;
        l = 0;
        i1 = Math.min(list.size(), 40);
        ab1.c("_hr", list.size());
        i = 0;
        obj = null;
        flag1 = true;
        k = 0;
_L2:
        URL url;
        x x1;
        int j;
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_617;
        }
        x1 = (x)list.get(k);
        url = a(x1);
        if (url != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aa.cT())
        {
            aa.z((new StringBuilder()).append("No destination: discarding hit: ").append(x1.cO()).toString());
        } else
        {
            aa.z("No destination: discarding hit.");
        }
        i++;
        j = l + 1;
_L3:
        k++;
        l = j;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
label0:
        {
            obj1 = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
            obj2 = url.getPath();
            if (TextUtils.isEmpty(x1.cO()))
            {
                obj = "";
            } else
            {
                obj = y.a(x1, System.currentTimeMillis());
            }
            obj2 = c(((String) (obj)), ((String) (obj2)));
            if (obj2 != null)
            {
                break label0;
            }
            i++;
            j = l + 1;
            obj = url;
        }
          goto _L3
        ((HttpEntityEnclosingRequest) (obj2)).addHeader("Host", ((HttpHost) (obj1)).toHostString());
        if (aa.cT())
        {
            a(((HttpEntityEnclosingRequest) (obj2)));
        }
        if (((String) (obj)).length() > 8192)
        {
            aa.z("Hit too long (> 8192 bytes)--not sent");
            j = i + 1;
        } else
        {
label1:
            {
                if (!sX.isDryRunEnabled())
                {
                    break label1;
                }
                aa.x("Dry run enabled. Hit not actually sent.");
                j = i;
            }
        }
_L5:
        ab1.c("_td", ((String) (obj)).getBytes().length);
        l++;
        obj = url;
        i = j;
        j = l;
          goto _L3
        boolean flag2;
        boolean flag3;
        flag2 = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        flag3 = flag1;
        q.p(mContext);
        flag2 = false;
        flag3 = flag2;
        flag1 = flag2;
        obj1 = vJ.execute(((HttpHost) (obj1)), ((org.apache.http.HttpRequest) (obj2)));
        flag3 = flag2;
        flag1 = flag2;
        int j1 = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        flag3 = flag2;
        flag1 = flag2;
        obj2 = ((HttpResponse) (obj1)).getEntity();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        flag3 = flag2;
        flag1 = flag2;
        ((HttpEntity) (obj2)).consumeContent();
        flag1 = flag2;
        j = i;
        if (j1 == 200) goto _L5; else goto _L4
_L4:
        flag3 = flag2;
        flag1 = flag2;
        aa.z((new StringBuilder()).append("Bad response: ").append(((HttpResponse) (obj1)).getStatusLine().getStatusCode()).toString());
        flag1 = flag2;
        j = i;
          goto _L5
        ClientProtocolException clientprotocolexception;
        clientprotocolexception;
        aa.z("ClientProtocolException sending hit; discarding hit...");
        ab1.c("_hd", i);
        flag1 = flag3;
        j = i;
          goto _L5
        list;
        aa.z((new StringBuilder()).append("Exception sending hit: ").append(list.getClass().getSimpleName()).toString());
        aa.z(list.getMessage());
        ab1.c("_de", 1);
        ab1.c("_hd", i);
        ab1.c("_hs", l);
        a(ab1, url, flag1);
        return l;
        ab1.c("_hd", i);
        ab1.c("_hs", l);
        if (flag)
        {
            a(ab1, ((URL) (obj)), flag1);
        }
        return l;
          goto _L3
    }

    String a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    URL a(x x1)
    {
        if (vK != null)
        {
            return vK;
        }
        x1 = x1.cR();
        if ("http:".equals(x1))
        {
            x1 = "http://www.google-analytics.com/collect";
        } else
        {
            x1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            x1 = new URL(x1);
        }
        // Misplaced declaration of an exception variable
        catch (x x1)
        {
            aa.w("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return x1;
    }

    public boolean ch()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            aa.y("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    boolean db()
    {
        return Math.random() * 100D <= 1.0D;
    }
}
