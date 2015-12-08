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
//            r, al, z, i, 
//            aa, ac, ad, l, 
//            o

public final class h
    implements r
{

    private final Context mContext;
    private final String wk;
    private final HttpClient ye;
    private URL yf;
    private int yg;
    private int yh;
    private int yi;
    private String yj;
    private String yk;
    private i yl;
    private l ym;
    private Set yn;
    private boolean yo;
    private long yp;
    private long yq;
    private o yr;
    private volatile boolean ys;

    h(HttpClient httpclient, Context context, o o1)
    {
        yn = new HashSet();
        yo = false;
        ys = false;
        mContext = context.getApplicationContext();
        yr = o1;
        wk = a("GoogleAnalytics", "4.0", android.os.Build.VERSION.RELEASE, al.a(Locale.getDefault()), Build.MODEL, Build.ID);
        ye = httpclient;
    }

    private static int a(List list, int j)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L4:
        return i1;
_L2:
        int k = j;
        if (j > list.size())
        {
            k = list.size();
        }
        i1 = k - 1;
        long l1 = 0L;
        j = k;
        k = i1;
        do
        {
            i1 = j;
            if (k <= 0)
            {
                continue;
            }
            z z1 = (z)list.get(k - 1);
            z z2 = (z)list.get(k);
            long l2 = z1.eX();
            long l3 = z2.eX();
            if (l2 != 0L && l3 != 0L && l3 - l2 > l1)
            {
                l1 = l3 - l2;
                j = k;
            }
            k--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(z z1, List list, i j)
    {
        if (j == i.yv)
        {
            long l1;
            if (z1.eV() == null || z1.eV().length() == 0)
            {
                list = "";
            } else
            {
                list = z1.eV();
            }
            l1 = System.currentTimeMillis();
            if (TextUtils.isEmpty(list))
            {
                return "";
            } else
            {
                return aa.a(z1, l1);
            }
        }
        z1 = "";
        j = list.iterator();
        do
        {
            if (!j.hasNext())
            {
                break;
            }
            String s = (String)j.next();
            if (s.length() != 0)
            {
                list = z1;
                if (z1.length() != 0)
                {
                    list = (new StringBuilder()).append(z1).append("\n").toString();
                }
                z1 = (new StringBuilder()).append(list).append(s).toString();
            }
        } while (true);
        return z1;
    }

    private static String a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    private URL a(z z1)
    {
        if (yf != null)
        {
            return yf;
        }
        z1 = z1.eY();
        if ("http:".equals(z1))
        {
            z1 = "http://www.google-analytics.com/collect";
        } else
        {
            z1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            z1 = new URL(z1);
        }
        // Misplaced declaration of an exception variable
        catch (z z1)
        {
            ac.e("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return z1;
    }

    private void a(ad ad1, HttpHost httphost, i j, l l1)
    {
        ad1.h("_bs", j.toString());
        ad1.h("_cs", l1.toString());
        j = ad1.fb();
        if (TextUtils.isEmpty(j))
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
            catch (ad ad1)
            {
                return;
            }
        }
        a(((String) (j)), httphost, 1, ad1, l.yH);
    }

    private static void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int i1 = aheader.length;
        for (int j = 0; j < i1; j++)
        {
            stringbuffer.append(aheader[j].toString()).append("\n");
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
        int k = httpentityenclosingrequest.available();
        if (k > 0)
        {
            try
            {
                byte abyte0[] = new byte[k];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                ac.w("Error Writing hit to log...");
            }
        }
        ac.i(stringbuffer.toString());
        return;
    }

    private boolean a(String s, HttpHost httphost, int j, ad ad1, l l1)
    {
        boolean flag;
        if (j > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s.getBytes().length <= yi && s.getBytes().length <= yh) goto _L2; else goto _L1
_L1:
        ac.w((new StringBuilder("Request too long (> ")).append(Math.min(yh, yi)).append(" bytes)--not sent").toString());
_L4:
        return true;
_L2:
        HttpEntityEnclosingRequest httpentityenclosingrequest;
        if (ys)
        {
            ac.i("Dry run enabled. Hit not actually sent.");
            return true;
        }
        httpentityenclosingrequest = d(s, flag);
        if (httpentityenclosingrequest == null) goto _L4; else goto _L3
_L3:
        if (!httpentityenclosingrequest.getRequestLine().getMethod().equals("GET")) goto _L6; else goto _L5
_L5:
        int k;
        k = s.getBytes().length;
        j = s.getBytes().length;
_L8:
        httpentityenclosingrequest.addHeader("Host", httphost.toHostString());
        if (ac.fa())
        {
            a(httpentityenclosingrequest);
        }
        static final class _cls1
        {

            static final int yt[];
            static final int yu[];

            static 
            {
                yu = new int[i.values().length];
                try
                {
                    yu[i.yz.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    yu[i.yx.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    yu[i.yw.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    yu[i.yA.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    yu[i.yy.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                yt = new int[l.values().length];
                try
                {
                    yt[l.yI.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    yt[l.yH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        GZIPOutputStream gzipoutputstream;
        try
        {
            s = ye.execute(httphost, httpentityenclosingrequest);
            ad1.e("_td", k);
            ad1.e("_cd", j);
            j = s.getStatusLine().getStatusCode();
            httphost = s.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.w("ClientProtocolException sending hit; discarding hit...");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.w((new StringBuilder("Exception sending hit: ")).append(s.getClass().getSimpleName()).toString());
            ac.w(s.getMessage());
            return false;
        }
        if (httphost == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        httphost.consumeContent();
        if (j == 200) goto _L4; else goto _L7
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        if (!yn.contains(Integer.valueOf(j)))
        {
            break MISSING_BLOCK_LABEL_451;
        }
        ac.i("Falling back to single hit per request mode.");
        yo = true;
        yp = System.currentTimeMillis();
        return false;
_L6:
        switch (_cls1.yt[l1.ordinal()])
        {
        default:
            j = s.getBytes().length;
            httpentityenclosingrequest.setEntity(new StringEntity(s));
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_331;
        }
_L9:
        k = s.getBytes().length;
          goto _L8
        try
        {
            l1 = new ByteArrayOutputStream();
            gzipoutputstream = new GZIPOutputStream(l1);
            gzipoutputstream.write(s.getBytes());
            gzipoutputstream.close();
            l1 = l1.toByteArray();
            j = l1.length + 0;
            httpentityenclosingrequest.setEntity(new ByteArrayEntity(l1));
            httpentityenclosingrequest.addHeader("Content-Encoding", "gzip");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.e("Encoding error, hit will be discarded");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ac.e((new StringBuilder("Unexpected IOException: ")).append(s.getMessage()).toString());
            ac.e("Request will be discarded");
            return true;
        }
          goto _L9
        ac.w((new StringBuilder("Bad response: ")).append(s.getStatusLine().getStatusCode()).toString());
        return true;
    }

    private static int b(List list, int j)
    {
        if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        int i1 = j - 1;
        do
        {
            k = j;
            if (i1 <= 0)
            {
                continue;
            }
            String s = ((z)list.get(i1)).eV();
            if (!TextUtils.isEmpty(s))
            {
                if (s.contains("sc=start"))
                {
                    return i1;
                }
                if (s.contains("sc=end"))
                {
                    return i1 + 1;
                }
            }
            i1--;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HttpEntityEnclosingRequest d(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            System.out.println("Empty hit, discarding.");
            return null;
        }
        s = (new StringBuilder()).append(yj).append("?").append(s).toString();
        if (s.length() < yg && !flag)
        {
            s = new BasicHttpEntityEnclosingRequest("GET", s);
        } else
        if (flag)
        {
            s = new BasicHttpEntityEnclosingRequest("POST", yk);
        } else
        {
            s = new BasicHttpEntityEnclosingRequest("POST", yj);
        }
        s.addHeader("User-Agent", wk);
        return s;
    }

    public final int a(List list, ad ad1, boolean flag)
    {
_L14:
        for (; j1 > 1 && ((Long)((List) (obj3)).get(j1 - 1)).longValue() > (long)yi; j1--) { }
        if (l3 <= (long)yi) goto _L2; else goto _L1
_L1:
        _cls1.yu[j.ordinal()];
        JVM INSTR tableswitch 1 5: default 560
    //                   1 711
    //                   2 740
    //                   3 751
    //                   4 762
    //                   5 835;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        ac.w("Unexpected batching strategy encountered; sending a single hit.");
        obj = (String)((List) (obj2)).get(0);
        ((List) (obj2)).clear();
        ((List) (obj2)).add(obj);
        i1 = 1;
_L11:
        if (i1 >= ((List) (obj2)).size()) goto _L2; else goto _L9
_L9:
        obj = ((List) (obj2)).subList(0, i1);
          goto _L10
_L4:
        int k2 = ((List) (obj2)).size() / 2;
        i1 = k2;
        if (j1 <= k2)
        {
            i1 = j1;
        }
          goto _L11
_L5:
        i1 = a(list, j1);
          goto _L11
_L6:
        i1 = b(list, j1);
          goto _L11
_L7:
        if (l3 < (long)(yi << 1))
        {
            i1 = ((List) (obj3)).size() - 1;
            while (i1 > 0 && ((Long)((List) (obj3)).get(i1)).longValue() > l3 / 2L) 
            {
                i1--;
            }
        } else
        {
            i1 = j1;
        }
          goto _L11
_L8:
        i1 = j1;
          goto _L11
_L10:
        i1 = 0;
        HttpHost httphost = null;
        int j2 = 0;
        j1 = ((flag1) ? 1 : 0);
        while (j2 < k1) 
        {
            obj2 = (z)list.get(j2);
            obj3 = a(((z) (obj2)));
            int l2 = Math.max(1, ((List) (obj)).size());
            if (obj3 == null)
            {
                ac.w("No destination: discarding hit.");
                i1 += l2;
                j1 += l2;
            } else
            {
                httphost = new HttpHost(((URL) (obj3)).getHost(), ((URL) (obj3)).getPort(), ((URL) (obj3)).getProtocol());
                if (!a(a(((z) (obj2)), ((List) (obj)), j), httphost, l2, ad1, l1))
                {
                    ad1.e("_de", 1);
                    ad1.e("_hd", i1);
                    ad1.e("_hs", j1);
                    a(ad1, httphost, j, l1);
                    return j1;
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
                        i1++;
                    }
                } while (true);
                ad1.e("_rs", 1);
                j1 += l2;
            }
            j2++;
        }
        ad1.e("_hd", i1);
        ad1.e("_hs", j1);
        if (flag)
        {
            a(ad1, httphost, j, l1);
        }
        return j1;
_L2:
        obj = obj2;
        if (true) goto _L10; else goto _L12
_L12:
        yg = yr.dX();
        yh = yr.dY();
        yi = yr.dZ();
        int k = yr.ea();
        yj = yr.ec();
        yk = yr.ed();
        yl = yr.ee();
        ym = yr.ef();
        yn.clear();
        yn.addAll(yr.eg());
        yq = yr.eb();
        if (!yo && yn.isEmpty())
        {
            yo = true;
            yp = System.currentTimeMillis();
        }
        if (yo && System.currentTimeMillis() - yp > 1000L * yq)
        {
            yo = false;
        }
        l l1;
        i j;
        Object obj2;
        Object obj3;
        int j1;
        int k1;
        boolean flag1;
        long l3;
        long l5;
        if (yo)
        {
            j = i.yv;
            l1 = l.yH;
        } else
        {
            j = yl;
            l1 = ym;
        }
        flag1 = false;
        k1 = Math.min(list.size(), k);
        ad1.e("_hr", list.size());
        l5 = System.currentTimeMillis();
        obj2 = new ArrayList();
        obj3 = new ArrayList();
        l3 = 0L;
        if (j != i.yv)
        {
            Iterator iterator = list.iterator();
            j1 = 0;
            while (iterator.hasNext()) 
            {
                Object obj = (z)iterator.next();
                Object obj1;
                int i1;
                long l4;
                if (TextUtils.isEmpty(((z) (obj)).eV()))
                {
                    obj = "";
                } else
                {
                    obj = aa.a(((z) (obj)), l5);
                }
                obj1 = obj;
                if (((String) (obj)).getBytes().length > yh)
                {
                    obj1 = "";
                }
                ((List) (obj2)).add(obj1);
                l4 = l3;
                if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                {
                    int i2 = ((String) (obj1)).getBytes().length;
                    if (j1 == 0)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                    l4 = l3 + (long)(i1 + i2);
                }
                ((List) (obj3)).add(Long.valueOf(l4));
                if (l4 <= (long)yi)
                {
                    i1 = j1 + 1;
                } else
                {
                    i1 = j1;
                }
                if (i1 != k1)
                {
                    j1 = i1;
                    l3 = l4;
                } else
                {
                    k1 = 1;
                    j1 = i1;
                    l3 = l4;
                    continue; /* Loop/switch isn't completed */
                }
            }
            k1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        j1 = 0;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final boolean dW()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            ac.v("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    public final void overrideHostUrl(String s)
    {
        try
        {
            yf = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            yf = null;
        }
    }

    public final void setDryRun(boolean flag)
    {
        ys = flag;
    }
}
