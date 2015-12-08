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
//            m, GoogleAnalytics, aj, aa, 
//            z, p, w, x

class ag
    implements m
{

    private final HttpClient Bj;
    private URL Bk;
    private final Context mContext;
    private final String vW;
    private GoogleAnalytics yu;

    ag(HttpClient httpclient, Context context)
    {
        this(httpclient, GoogleAnalytics.getInstance(context), context);
    }

    ag(HttpClient httpclient, GoogleAnalytics googleanalytics, Context context)
    {
        mContext = context.getApplicationContext();
        vW = a("GoogleAnalytics", "3.0", android.os.Build.VERSION.RELEASE, aj.a(Locale.getDefault()), Build.MODEL, Build.ID);
        Bj = httpclient;
        yu = googleanalytics;
    }

    private void a(aa aa1, URL url, boolean flag)
    {
        if (!TextUtils.isEmpty(aa1.eL()) && eS()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (url != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (Bk == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        url = Bk;
_L5:
        HttpHost httphost = new HttpHost(url.getHost(), url.getPort(), url.getProtocol());
        aa1 = h(aa1.eL(), url.getPath());
        if (aa1 == null) goto _L1; else goto _L3
_L3:
        aa1.addHeader("Host", httphost.toHostString());
        if (z.eK())
        {
            a(((HttpEntityEnclosingRequest) (aa1)));
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        p.A(mContext);
        int i;
        aa1 = Bj.execute(httphost, aa1);
        i = aa1.getStatusLine().getStatusCode();
        url = aa1.getEntity();
        if (url == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        url.consumeContent();
        if (i == 200) goto _L1; else goto _L4
_L4:
        try
        {
            z.W((new StringBuilder()).append("Bad response: ").append(aa1.getStatusLine().getStatusCode()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            z.W("ClientProtocolException sending monitoring hit.");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            z.W((new StringBuilder()).append("Exception sending monitoring hit: ").append(aa1.getClass().getSimpleName()).toString());
        }
        break MISSING_BLOCK_LABEL_242;
        try
        {
            url = new URL("https://ssl.google-analytics.com/collect");
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            return;
        }
          goto _L5
        z.W(aa1.getMessage());
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
                z.V("Error Writing hit to log...");
            }
        }
        z.V(stringbuffer.toString());
        return;
    }

    private HttpEntityEnclosingRequest h(String s, String s1)
    {
        String s2;
        if (TextUtils.isEmpty(s))
        {
            z.W("Empty hit, discarding.");
            return null;
        }
        s2 = (new StringBuilder()).append(s1).append("?").append(s).toString();
        if (s2.length() >= 2036) goto _L2; else goto _L1
_L1:
        s = new BasicHttpEntityEnclosingRequest("GET", s2);
_L4:
        s.addHeader("User-Agent", vW);
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
            z.W("Encoding error, discarding hit");
            return null;
        }
        s = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int a(List list, aa aa1, boolean flag)
    {
        Object obj;
        int i;
        int k;
        int l;
        int i1;
        boolean flag1;
        l = 0;
        i1 = Math.min(list.size(), 40);
        aa1.e("_hr", list.size());
        i = 0;
        obj = null;
        flag1 = true;
        k = 0;
_L2:
        URL url;
        w w1;
        int j;
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_617;
        }
        w1 = (w)list.get(k);
        url = a(w1);
        if (url != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (z.eK())
        {
            z.W((new StringBuilder()).append("No destination: discarding hit: ").append(w1.eF()).toString());
        } else
        {
            z.W("No destination: discarding hit.");
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
            if (TextUtils.isEmpty(w1.eF()))
            {
                obj = "";
            } else
            {
                obj = x.a(w1, System.currentTimeMillis());
            }
            obj2 = h(((String) (obj)), ((String) (obj2)));
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
        if (z.eK())
        {
            a(((HttpEntityEnclosingRequest) (obj2)));
        }
        if (((String) (obj)).length() > 8192)
        {
            z.W("Hit too long (> 8192 bytes)--not sent");
            j = i + 1;
        } else
        {
label1:
            {
                if (!yu.isDryRunEnabled())
                {
                    break label1;
                }
                z.U("Dry run enabled. Hit not actually sent.");
                j = i;
            }
        }
_L5:
        aa1.e("_td", ((String) (obj)).getBytes().length);
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
        p.A(mContext);
        flag2 = false;
        flag3 = flag2;
        flag1 = flag2;
        obj1 = Bj.execute(((HttpHost) (obj1)), ((org.apache.http.HttpRequest) (obj2)));
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
        z.W((new StringBuilder()).append("Bad response: ").append(((HttpResponse) (obj1)).getStatusLine().getStatusCode()).toString());
        flag1 = flag2;
        j = i;
          goto _L5
        ClientProtocolException clientprotocolexception;
        clientprotocolexception;
        z.W("ClientProtocolException sending hit; discarding hit...");
        aa1.e("_hd", i);
        flag1 = flag3;
        j = i;
          goto _L5
        list;
        z.W((new StringBuilder()).append("Exception sending hit: ").append(list.getClass().getSimpleName()).toString());
        z.W(list.getMessage());
        aa1.e("_de", 1);
        aa1.e("_hd", i);
        aa1.e("_hs", l);
        a(aa1, url, flag1);
        return l;
        aa1.e("_hd", i);
        aa1.e("_hs", l);
        if (flag)
        {
            a(aa1, ((URL) (obj)), flag1);
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

    URL a(w w1)
    {
        if (Bk != null)
        {
            return Bk;
        }
        w1 = w1.eI();
        if ("http:".equals(w1))
        {
            w1 = "http://www.google-analytics.com/collect";
        } else
        {
            w1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            w1 = new URL(w1);
        }
        // Misplaced declaration of an exception variable
        catch (w w1)
        {
            z.T("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return w1;
    }

    public void af(String s)
    {
        try
        {
            Bk = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Bk = null;
        }
    }

    public boolean dX()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            z.V("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    boolean eS()
    {
        return Math.random() * 100D <= 1.0D;
    }
}
