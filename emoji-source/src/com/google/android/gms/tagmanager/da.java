// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
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
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ab, bh, ap, bn

class da
    implements ab
{
    public static interface a
    {

        public abstract void a(ap ap1);

        public abstract void b(ap ap1);

        public abstract void c(ap ap1);
    }


    private final Context ahK;
    private final String aib;
    private final HttpClient aic;
    private a aid;

    da(HttpClient httpclient, Context context, a a1)
    {
        ahK = context.getApplicationContext();
        aib = a("GoogleTagManager", "4.00", android.os.Build.VERSION.RELEASE, c(Locale.getDefault()), Build.MODEL, Build.ID);
        aic = httpclient;
        aid = a1;
    }

    private HttpEntityEnclosingRequest a(URL url)
    {
        url = new BasicHttpEntityEnclosingRequest("GET", url.toURI().toString());
        url.addHeader("User-Agent", aib);
        return url;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        url = null;
_L2:
        bh.D((new StringBuilder()).append("Exception sending hit: ").append(urisyntaxexception.getClass().getSimpleName()).toString());
        bh.D(urisyntaxexception.getMessage());
        return url;
        urisyntaxexception;
        if (true) goto _L2; else goto _L1
_L1:
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
                bh.C("Error Writing hit to log...");
            }
        }
        bh.C(stringbuffer.toString());
        return;
    }

    static String c(Locale locale)
    {
        while (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) 
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(locale.getLanguage().toLowerCase());
        if (locale.getCountry() != null && locale.getCountry().length() != 0)
        {
            stringbuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringbuilder.toString();
    }

    String a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    public boolean cC()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)ahK.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            bh.C("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    URL d(ap ap1)
    {
        ap1 = ap1.lO();
        try
        {
            ap1 = new URL(ap1);
        }
        // Misplaced declaration of an exception variable
        catch (ap ap1)
        {
            bh.A("Error trying to parse the GTM url.");
            return null;
        }
        return ap1;
    }

    public void g(List list)
    {
        boolean flag;
        int i;
        int j;
        j = Math.min(list.size(), 40);
        flag = true;
        i = 0;
_L2:
        ap ap1;
        Object obj;
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ap1 = (ap)list.get(i);
        obj1 = d(ap1);
        if (obj1 == null)
        {
            bh.D("No destination: discarding hit.");
            aid.b(ap1);
        } else
        {
label0:
            {
                obj = a(((URL) (obj1)));
                if (obj != null)
                {
                    break label0;
                }
                aid.b(ap1);
            }
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        boolean flag1;
        boolean flag2;
        obj1 = new HttpHost(((URL) (obj1)).getHost(), ((URL) (obj1)).getPort(), ((URL) (obj1)).getProtocol());
        ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", ((HttpHost) (obj1)).toHostString());
        a(((HttpEntityEnclosingRequest) (obj)));
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        flag2 = flag;
        bn.w(ahK);
        flag1 = false;
        flag2 = flag1;
        flag = flag1;
        obj = aic.execute(((HttpHost) (obj1)), ((org.apache.http.HttpRequest) (obj)));
        flag2 = flag1;
        flag = flag1;
        int k = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        flag2 = flag1;
        flag = flag1;
        obj1 = ((HttpResponse) (obj)).getEntity();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        flag2 = flag1;
        flag = flag1;
        ((HttpEntity) (obj1)).consumeContent();
        if (k == 200)
        {
            break MISSING_BLOCK_LABEL_313;
        }
        flag2 = flag1;
        flag = flag1;
        bh.D((new StringBuilder()).append("Bad response: ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        flag2 = flag1;
        flag = flag1;
        try
        {
            aid.c(ap1);
            break MISSING_BLOCK_LABEL_408;
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            bh.D("ClientProtocolException sending hit; discarding hit...");
            aid.b(ap1);
            flag = flag2;
        }
        catch (IOException ioexception)
        {
            bh.D((new StringBuilder()).append("Exception sending hit: ").append(ioexception.getClass().getSimpleName()).toString());
            bh.D(ioexception.getMessage());
            aid.c(ap1);
        }
          goto _L3
        flag2 = flag1;
        flag = flag1;
        aid.a(ap1);
        break MISSING_BLOCK_LABEL_408;
_L1:
        return;
        flag = flag1;
          goto _L3
    }
}
