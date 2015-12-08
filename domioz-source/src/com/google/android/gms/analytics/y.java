// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.gms.analytics:
//            ak, o, f, aa, 
//            g, h, i, ae, 
//            z, ai

public final class y
    implements ak
{

    private final String a;
    private final HttpClient b;
    private final Context c;
    private URL d;
    private int e;
    private int f;
    private int g;
    private String h;
    private String i;
    private aa j;
    private ae k;
    private Set l;
    private boolean m;
    private long n;
    private long o;
    private ai p;
    private volatile boolean q;

    y(HttpClient httpclient, Context context, ai ai1)
    {
        l = new HashSet();
        m = false;
        q = false;
        c = context.getApplicationContext();
        p = ai1;
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", "4.0.6", android.os.Build.VERSION.RELEASE, com.google.android.gms.analytics.o.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = httpclient;
    }

    private static int a(List list, int i1)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int k1 = 0;
_L4:
        return k1;
_L2:
        int j1 = i1;
        if (i1 > list.size())
        {
            j1 = list.size();
        }
        k1 = j1 - 1;
        long l1 = 0L;
        i1 = j1;
        j1 = k1;
        do
        {
            k1 = i1;
            if (j1 <= 0)
            {
                continue;
            }
            f f1 = (f)list.get(j1 - 1);
            f f2 = (f)list.get(j1);
            long l2 = f1.c();
            long l3 = f2.c();
            if (l2 != 0L && l3 != 0L && l3 - l2 > l1)
            {
                l1 = l3 - l2;
                i1 = j1;
            }
            j1--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(f f1, List list, aa aa1)
    {
        if (aa1 == aa.a)
        {
            long l1;
            if (f1.a() == null || f1.a().length() == 0)
            {
                list = "";
            } else
            {
                list = f1.a();
            }
            l1 = System.currentTimeMillis();
            if (TextUtils.isEmpty(list))
            {
                return "";
            } else
            {
                return com.google.android.gms.analytics.g.a(f1, l1);
            }
        }
        f1 = "";
        aa1 = list.iterator();
        do
        {
            if (!aa1.hasNext())
            {
                break;
            }
            String s = (String)aa1.next();
            if (s.length() != 0)
            {
                list = f1;
                if (f1.length() != 0)
                {
                    list = (new StringBuilder()).append(f1).append("\n").toString();
                }
                f1 = (new StringBuilder()).append(list).append(s).toString();
            }
        } while (true);
        return f1;
    }

    private URL a(f f1)
    {
        if (d != null)
        {
            return d;
        }
        f1 = f1.d();
        if ("http:".equals(f1))
        {
            f1 = "http://www.google-analytics.com/collect";
        } else
        {
            f1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            f1 = new URL(f1);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            com.google.android.gms.analytics.h.a("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return f1;
    }

    private void a(i i1, HttpHost httphost, aa aa1, ae ae1)
    {
        i1.a("_bs", aa1.toString());
        i1.a("_cs", ae1.toString());
        aa1 = i1.a();
        if (TextUtils.isEmpty(aa1))
        {
            return;
        }
        if (httphost == null)
        {
            try
            {
                httphost = new URL("https://ssl.google-analytics.com");
                httphost = new HttpHost(httphost.getHost(), httphost.getPort(), httphost.getProtocol());
            }
            // Misplaced declaration of an exception variable
            catch (i i1)
            {
                return;
            }
        }
        a(((String) (aa1)), httphost, 1, i1, ae.a);
    }

    private static void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int k1 = aheader.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            stringbuffer.append(aheader[i1].toString()).append("\n");
        }

        stringbuffer.append(httpentityenclosingrequest.getRequestLine().toString()).append("\n");
        if (httpentityenclosingrequest.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        int j1 = httpentityenclosingrequest.available();
        if (j1 > 0)
        {
            try
            {
                byte abyte0[] = new byte[j1];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                com.google.android.gms.analytics.h.d("Error Writing hit to log...");
            }
        }
        com.google.android.gms.analytics.h.b(stringbuffer.toString());
        return;
    }

    private boolean a(String s, HttpHost httphost, int i1, i j1, ae ae1)
    {
        boolean flag;
        if (i1 > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s.getBytes().length <= g && s.getBytes().length <= f) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.h.d((new StringBuilder("Request too long (> ")).append(Math.min(f, g)).append(" bytes)--not sent").toString());
_L4:
        return true;
_L2:
        Object obj;
        int k1;
        if (q)
        {
            com.google.android.gms.analytics.h.b("Dry run enabled. Hit not actually sent.");
            return true;
        }
        if (TextUtils.isEmpty(s))
        {
            System.out.println("Empty hit, discarding.");
            obj = null;
        } else
        {
            obj = (new StringBuilder()).append(h).append("?").append(s).toString();
            if (((String) (obj)).length() < e && !flag)
            {
                obj = new BasicHttpEntityEnclosingRequest("GET", ((String) (obj)));
            } else
            if (flag)
            {
                obj = new BasicHttpEntityEnclosingRequest("POST", i);
            } else
            {
                obj = new BasicHttpEntityEnclosingRequest("POST", h);
            }
            ((HttpEntityEnclosingRequest) (obj)).addHeader("User-Agent", a);
        }
_L10:
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (!((HttpEntityEnclosingRequest) (obj)).getRequestLine().getMethod().equals("GET")) goto _L6; else goto _L5
_L5:
        k1 = s.getBytes().length;
        i1 = s.getBytes().length;
_L8:
        ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", httphost.toHostString());
        if (com.google.android.gms.analytics.h.a())
        {
            a(((HttpEntityEnclosingRequest) (obj)));
        }
        s = b.execute(httphost, ((org.apache.http.HttpRequest) (obj)));
        j1.a("_td", k1);
        j1.a("_cd", i1);
        i1 = s.getStatusLine().getStatusCode();
        httphost = s.getEntity();
        if (httphost == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        httphost.consumeContent();
        if (i1 == 200) goto _L4; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_583;
        }
        if (!l.contains(Integer.valueOf(i1)))
        {
            break MISSING_BLOCK_LABEL_583;
        }
        com.google.android.gms.analytics.h.b("Falling back to single hit per request mode.");
        m = true;
        n = System.currentTimeMillis();
        return false;
_L6:
        switch (z.a[ae1.ordinal()])
        {
        default:
            i1 = s.getBytes().length;
            ((HttpEntityEnclosingRequest) (obj)).setEntity(new StringEntity(s));
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_463;
        }
_L9:
        k1 = s.getBytes().length;
          goto _L8
        try
        {
            ae1 = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(ae1);
            gzipoutputstream.write(s.getBytes());
            gzipoutputstream.close();
            ae1 = ae1.toByteArray();
            i1 = ae1.length + 0;
            ((HttpEntityEnclosingRequest) (obj)).setEntity(new ByteArrayEntity(ae1));
            ((HttpEntityEnclosingRequest) (obj)).addHeader("Content-Encoding", "gzip");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.h.a("Encoding error, hit will be discarded");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.analytics.h.a((new StringBuilder("Unexpected IOException: ")).append(s.getMessage()).toString());
            com.google.android.gms.analytics.h.a("Request will be discarded");
            return true;
        }
          goto _L9
        com.google.android.gms.analytics.h.d((new StringBuilder("Bad response: ")).append(s.getStatusLine().getStatusCode()).toString());
        return true;
        s;
        com.google.android.gms.analytics.h.d("ClientProtocolException sending hit; discarding hit...");
        return true;
        s;
        com.google.android.gms.analytics.h.d((new StringBuilder("Exception sending hit: ")).append(s.getClass().getSimpleName()).toString());
        com.google.android.gms.analytics.h.d(s.getMessage());
        return false;
          goto _L10
    }

    private static int b(List list, int i1)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int j1 = 0;
_L4:
        return j1;
_L2:
        int k1 = i1 - 1;
        do
        {
            j1 = i1;
            if (k1 <= 0)
            {
                continue;
            }
            String s = ((f)list.get(k1)).a();
            if (!TextUtils.isEmpty(s))
            {
                if (s.contains("sc=start"))
                {
                    return k1;
                }
                if (s.contains("sc=end"))
                {
                    return k1 + 1;
                }
            }
            k1--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int a(List list, i i1, boolean flag)
    {
        ae ae1;
        aa aa1;
        Object obj2;
        Object obj3;
        int k1;
        int l1;
        int k2;
        long l2;
        long l4;
        e = 2036;
        f = 8192;
        g = 8192;
        h = p.a();
        i = p.b();
        j = p.c();
        k = p.d();
        l.clear();
        l.addAll(p.e());
        o = 3600L;
        if (!m && l.isEmpty())
        {
            m = true;
            n = System.currentTimeMillis();
        }
        if (m && System.currentTimeMillis() - n > 1000L * o)
        {
            m = false;
        }
        Object obj1;
        Iterator iterator;
        int i2;
        if (m)
        {
            aa1 = aa.a;
            ae1 = ae.a;
        } else
        {
            aa1 = j;
            ae1 = k;
        }
        k2 = 0;
        l1 = Math.min(list.size(), 20);
        i1.a("_hr", list.size());
        l4 = System.currentTimeMillis();
        obj2 = new ArrayList();
        obj3 = new ArrayList();
        l2 = 0L;
        if (aa1 == aa.a) goto _L2; else goto _L1
_L1:
        iterator = list.iterator();
        k1 = 0;
_L18:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (f)iterator.next();
        int j1;
        long l3;
        if (TextUtils.isEmpty(((f) (obj)).a()))
        {
            obj = "";
        } else
        {
            obj = com.google.android.gms.analytics.g.a(((f) (obj)), l4);
        }
        obj1 = obj;
        if (((String) (obj)).getBytes().length > f)
        {
            obj1 = "";
        }
        ((List) (obj2)).add(obj1);
        l3 = l2;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i2 = ((String) (obj1)).getBytes().length;
            if (k1 == 0)
            {
                j1 = 0;
            } else
            {
                j1 = 1;
            }
            l3 = l2 + (long)(j1 + i2);
        }
        ((List) (obj3)).add(Long.valueOf(l3));
        HttpHost httphost;
        int j2;
        if (l3 <= (long)g)
        {
            j1 = k1 + 1;
        } else
        {
            j1 = k1;
        }
        if (j1 != l1) goto _L6; else goto _L5
_L5:
        l1 = 1;
        l2 = l3;
_L19:
        for (k1 = j1; k1 > 1 && ((Long)((List) (obj3)).get(k1 - 1)).longValue() > (long)g; k1--) { }
        if (l2 <= (long)g) goto _L8; else goto _L7
_L7:
        z.b[aa1.ordinal()];
        JVM INSTR tableswitch 1 5: default 544
    //                   1 695
    //                   2 724
    //                   3 735
    //                   4 746
    //                   5 819;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L9:
        com.google.android.gms.analytics.h.d("Unexpected batching strategy encountered; sending a single hit.");
        obj = (String)((List) (obj2)).get(0);
        ((List) (obj2)).clear();
        ((List) (obj2)).add(obj);
        j1 = 1;
_L17:
        if (j1 >= ((List) (obj2)).size()) goto _L8; else goto _L15
_L15:
        obj = ((List) (obj2)).subList(0, j1);
          goto _L16
_L10:
        j2 = ((List) (obj2)).size() / 2;
        j1 = j2;
        if (k1 <= j2)
        {
            j1 = k1;
        }
          goto _L17
_L11:
        j1 = a(list, k1);
          goto _L17
_L12:
        j1 = b(list, k1);
          goto _L17
_L13:
        if (l2 < (long)(g * 2))
        {
            j1 = ((List) (obj3)).size() - 1;
            while (j1 > 0 && ((Long)((List) (obj3)).get(j1)).longValue() > l2 / 2L) 
            {
                j1--;
            }
        } else
        {
            j1 = k1;
        }
          goto _L17
_L14:
        j1 = k1;
          goto _L17
_L16:
        j1 = 0;
        httphost = null;
        j2 = 0;
        k1 = k2;
        while (j2 < l1) 
        {
            obj2 = (f)list.get(j2);
            obj3 = a(((f) (obj2)));
            k2 = Math.max(1, ((List) (obj)).size());
            if (obj3 == null)
            {
                com.google.android.gms.analytics.h.d("No destination: discarding hit.");
                j1 += k2;
                k1 += k2;
            } else
            {
                httphost = new HttpHost(((URL) (obj3)).getHost(), ((URL) (obj3)).getPort(), ((URL) (obj3)).getProtocol());
                if (!a(a(((f) (obj2)), ((List) (obj)), aa1), httphost, k2, i1, ae1))
                {
                    i1.a("_de", 1);
                    i1.a("_hd", j1);
                    i1.a("_hs", k1);
                    a(i1, httphost, aa1, ae1);
                    return k1;
                }
                obj2 = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj2)).hasNext())
                    {
                        break;
                    }
                    if (TextUtils.isEmpty((String)((Iterator) (obj2)).next()))
                    {
                        j1++;
                    }
                } while (true);
                i1.a("_rs", 1);
                k1 += k2;
            }
            j2++;
        }
        i1.a("_hd", j1);
        i1.a("_hs", k1);
        if (flag)
        {
            a(i1, httphost, aa1, ae1);
        }
        return k1;
_L8:
        obj = obj2;
        if (true) goto _L16; else goto _L6
_L6:
        k1 = j1;
        l2 = l3;
          goto _L18
_L4:
        l1 = 1;
          goto _L19
_L2:
        k1 = 0;
          goto _L19
    }

    public final void a(String s)
    {
        try
        {
            d = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            d = null;
        }
    }

    public final void a(boolean flag)
    {
        q = flag;
    }

    public final boolean a()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            com.google.android.gms.analytics.h.c("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }
}
