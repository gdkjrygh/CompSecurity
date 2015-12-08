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
//            h, u, ak, ap

final class cc
    implements h
{
    public static interface a
    {

        public abstract void a(u u1);

        public abstract void b(u u1);

        public abstract void c(u u1);
    }


    private final String a;
    private final HttpClient b;
    private final Context c;
    private a d;

    cc(HttpClient httpclient, Context context, a a1)
    {
        Object obj;
        String s;
        Locale locale;
        obj = null;
        super();
        c = context.getApplicationContext();
        s = android.os.Build.VERSION.RELEASE;
        locale = Locale.getDefault();
        if (locale != null) goto _L2; else goto _L1
_L1:
        context = obj;
_L4:
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleTagManager", "4.00", s, context, Build.MODEL, Build.ID
        });
        b = httpclient;
        d = a1;
        return;
_L2:
        context = obj;
        if (locale.getLanguage() != null)
        {
            context = obj;
            if (locale.getLanguage().length() != 0)
            {
                context = new StringBuilder();
                context.append(locale.getLanguage().toLowerCase());
                if (locale.getCountry() != null && locale.getCountry().length() != 0)
                {
                    context.append("-").append(locale.getCountry().toLowerCase());
                }
                context = context.toString();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static URL a(u u1)
    {
        u1 = u1.c();
        try
        {
            u1 = new URL(u1);
        }
        // Misplaced declaration of an exception variable
        catch (u u1)
        {
            ak.a("Error trying to parse the GTM url.");
            return null;
        }
        return u1;
    }

    private HttpEntityEnclosingRequest a(URL url)
    {
        url = new BasicHttpEntityEnclosingRequest("GET", url.toURI().toString());
        url.addHeader("User-Agent", a);
        return url;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        url = null;
_L2:
        ak.b((new StringBuilder("Exception sending hit: ")).append(urisyntaxexception.getClass().getSimpleName()).toString());
        ak.b(urisyntaxexception.getMessage());
        return url;
        urisyntaxexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
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
            break MISSING_BLOCK_LABEL_138;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_138;
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
                ak.b();
            }
        }
        ak.b();
        return;
    }

    public final void a(List list)
    {
        boolean flag;
        int i;
        int j;
        j = Math.min(list.size(), 40);
        flag = true;
        i = 0;
_L2:
        u u1;
        Object obj2;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        u1 = (u)list.get(i);
        obj2 = a(u1);
        if (obj2 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        ak.b("No destination: discarding hit.");
        d.b(u1);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj;
label0:
        {
            obj = a(((URL) (obj2)));
            if (obj != null)
            {
                break label0;
            }
            d.b(u1);
        }
          goto _L3
        boolean flag1;
        boolean flag2;
        obj2 = new HttpHost(((URL) (obj2)).getHost(), ((URL) (obj2)).getPort(), ((URL) (obj2)).getProtocol());
        ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", ((HttpHost) (obj2)).toHostString());
        a(((HttpEntityEnclosingRequest) (obj)));
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        flag2 = flag;
        ap.a(c);
        flag1 = false;
        flag2 = flag1;
        flag = flag1;
        obj = b.execute(((HttpHost) (obj2)), ((org.apache.http.HttpRequest) (obj)));
        flag2 = flag1;
        flag = flag1;
        int k = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        flag2 = flag1;
        flag = flag1;
        obj2 = ((HttpResponse) (obj)).getEntity();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        flag2 = flag1;
        flag = flag1;
        ((HttpEntity) (obj2)).consumeContent();
        if (k == 200)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        flag2 = flag1;
        flag = flag1;
        ak.b((new StringBuilder("Bad response: ")).append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        flag2 = flag1;
        flag = flag1;
        d.c(u1);
        flag = flag1;
          goto _L3
        flag2 = flag1;
        flag = flag1;
        d.a(u1);
        flag = flag1;
          goto _L3
        Object obj1;
        obj1;
        ak.b("ClientProtocolException sending hit; discarding hit...");
        d.b(u1);
        flag = flag2;
          goto _L3
        obj1;
        ak.b((new StringBuilder("Exception sending hit: ")).append(obj1.getClass().getSimpleName()).toString());
        ak.b(((IOException) (obj1)).getMessage());
        d.c(u1);
          goto _L3
    }

    public final boolean a()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            ak.b();
            return false;
        } else
        {
            return true;
        }
    }
}
