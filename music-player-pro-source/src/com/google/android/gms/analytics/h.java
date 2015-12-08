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
//            r, an, i, ab, 
//            ac, ae, af, l, 
//            o

public class h
    implements r
{

    private final Context mContext;
    private final String wl;
    private final HttpClient yf;
    private URL yg;
    private int yh;
    private int yi;
    private int yj;
    private String yk;
    private String yl;
    private i ym;
    private l yn;
    private Set yo;
    private boolean yp;
    private long yq;
    private long yr;
    private o ys;
    private volatile boolean yt;

    h(HttpClient httpclient, Context context, o o1)
    {
        yo = new HashSet();
        yp = false;
        yt = false;
        mContext = context.getApplicationContext();
        ys = o1;
        wl = a("GoogleAnalytics", "4.0", android.os.Build.VERSION.RELEASE, an.a(Locale.getDefault()), Build.MODEL, Build.ID);
        yf = httpclient;
    }

    private String a(ab ab1, List list, i j)
    {
        if (j == i.yw)
        {
            long l1;
            if (ab1.fa() == null || ab1.fa().length() == 0)
            {
                list = "";
            } else
            {
                list = ab1.fa();
            }
            l1 = System.currentTimeMillis();
            if (TextUtils.isEmpty(list))
            {
                return "";
            } else
            {
                return ac.a(ab1, l1);
            }
        }
        ab1 = "";
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
                list = ab1;
                if (ab1.length() != 0)
                {
                    list = (new StringBuilder()).append(ab1).append("\n").toString();
                }
                ab1 = (new StringBuilder()).append(list).append(s).toString();
            }
        } while (true);
        return ab1;
    }

    private URL a(ab ab1)
    {
        if (yg != null)
        {
            return yg;
        }
        ab1 = ab1.fd();
        if ("http:".equals(ab1))
        {
            ab1 = "http://www.google-analytics.com/collect";
        } else
        {
            ab1 = "https://ssl.google-analytics.com/collect";
        }
        try
        {
            ab1 = new URL(ab1);
        }
        // Misplaced declaration of an exception variable
        catch (ab ab1)
        {
            ae.T("Error trying to parse the hardcoded host url. This really shouldn't happen.");
            return null;
        }
        return ab1;
    }

    private void a(af af1, HttpHost httphost, i j, l l1)
    {
        af1.g("_bs", j.toString());
        af1.g("_cs", l1.toString());
        j = af1.fg();
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
            catch (af af1)
            {
                return;
            }
        }
        a(((String) (j)), httphost, 1, af1, l.yI);
    }

    private void a(HttpEntityEnclosingRequest httpentityenclosingrequest)
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
            break MISSING_BLOCK_LABEL_147;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_147;
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
                ae.W("Error Writing hit to log...");
            }
        }
        ae.U(stringbuffer.toString());
        return;
    }

    private boolean a(String s, HttpHost httphost, int j, af af1, l l1)
    {
        boolean flag;
        if (j > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s.getBytes().length <= yj && s.getBytes().length <= yi) goto _L2; else goto _L1
_L1:
        ae.W((new StringBuilder()).append("Request too long (> ").append(Math.min(yi, yj)).append(" bytes)--not sent").toString());
_L4:
        return true;
_L2:
        HttpEntityEnclosingRequest httpentityenclosingrequest;
        if (yt)
        {
            ae.U("Dry run enabled. Hit not actually sent.");
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
        if (ae.ff())
        {
            a(httpentityenclosingrequest);
        }
        static class _cls1
        {

            static final int yu[];
            static final int yv[];

            static 
            {
                yv = new int[i.values().length];
                try
                {
                    yv[i.yA.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    yv[i.yy.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    yv[i.yx.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    yv[i.yB.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    yv[i.yz.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                yu = new int[l.values().length];
                try
                {
                    yu[l.yJ.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    yu[l.yI.ordinal()] = 2;
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
            s = yf.execute(httphost, httpentityenclosingrequest);
            af1.e("_td", k);
            af1.e("_cd", j);
            j = s.getStatusLine().getStatusCode();
            httphost = s.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.W("ClientProtocolException sending hit; discarding hit...");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.W((new StringBuilder()).append("Exception sending hit: ").append(s.getClass().getSimpleName()).toString());
            ae.W(s.getMessage());
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
            break MISSING_BLOCK_LABEL_458;
        }
        if (!yo.contains(Integer.valueOf(j)))
        {
            break MISSING_BLOCK_LABEL_458;
        }
        ae.U("Falling back to single hit per request mode.");
        yp = true;
        yq = System.currentTimeMillis();
        return false;
_L6:
        switch (_cls1.yu[l1.ordinal()])
        {
        default:
            j = s.getBytes().length;
            httpentityenclosingrequest.setEntity(new StringEntity(s));
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_335;
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
            ae.T("Encoding error, hit will be discarded");
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.T((new StringBuilder()).append("Unexpected IOException: ").append(s.getMessage()).toString());
            ae.T("Request will be discarded");
            return true;
        }
          goto _L9
        ae.W((new StringBuilder()).append("Bad response: ").append(s.getStatusLine().getStatusCode()).toString());
        return true;
    }

    private HttpEntityEnclosingRequest d(String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            System.out.println("Empty hit, discarding.");
            return null;
        }
        s = (new StringBuilder()).append(yk).append("?").append(s).toString();
        if (s.length() < yh && !flag)
        {
            s = new BasicHttpEntityEnclosingRequest("GET", s);
        } else
        if (flag)
        {
            s = new BasicHttpEntityEnclosingRequest("POST", yl);
        } else
        {
            s = new BasicHttpEntityEnclosingRequest("POST", yk);
        }
        s.addHeader("User-Agent", wl);
        return s;
    }

    int a(List list, int j)
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
            ab ab1 = (ab)list.get(k - 1);
            ab ab2 = (ab)list.get(k);
            long l2 = ab1.fc();
            long l3 = ab2.fc();
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

    public int a(List list, af af1, boolean flag)
    {
        l l1;
        i j;
        Object obj2;
        Object obj3;
        int j1;
        int k1;
        int k2;
        long l2;
        long l4;
        yh = ys.eb();
        yi = ys.ec();
        yj = ys.ed();
        int k = ys.ee();
        yk = ys.eg();
        yl = ys.eh();
        ym = ys.ei();
        yn = ys.ej();
        yo.clear();
        yo.addAll(ys.ek());
        yr = ys.ef();
        if (!yp && yo.isEmpty())
        {
            yp = true;
            yq = System.currentTimeMillis();
        }
        if (yp && System.currentTimeMillis() - yq > 1000L * yr)
        {
            yp = false;
        }
        Object obj1;
        Iterator iterator;
        int i2;
        if (yp)
        {
            j = i.yw;
            l1 = l.yI;
        } else
        {
            j = ym;
            l1 = yn;
        }
        k2 = 0;
        k1 = Math.min(list.size(), k);
        af1.e("_hr", list.size());
        l4 = System.currentTimeMillis();
        obj2 = new ArrayList();
        obj3 = new ArrayList();
        l2 = 0L;
        if (j == i.yw) goto _L2; else goto _L1
_L1:
        iterator = list.iterator();
        j1 = 0;
_L8:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (ab)iterator.next();
        int i1;
        long l3;
        if (TextUtils.isEmpty(((ab) (obj)).fa()))
        {
            obj = "";
        } else
        {
            obj = ac.a(((ab) (obj)), l4);
        }
        obj1 = obj;
        if (((String) (obj)).getBytes().length > yi)
        {
            obj1 = "";
        }
        ((List) (obj2)).add(obj1);
        l3 = l2;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            i2 = ((String) (obj1)).getBytes().length;
            if (j1 == 0)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            l3 = l2 + (long)(i1 + i2);
        }
        ((List) (obj3)).add(Long.valueOf(l3));
        HttpHost httphost;
        int j2;
        if (l3 <= (long)yj)
        {
            i1 = j1 + 1;
        } else
        {
            i1 = j1;
        }
        if (i1 != k1) goto _L6; else goto _L5
_L5:
        k1 = 1;
        l2 = l3;
_L20:
        for (j1 = i1; j1 > 1 && ((Long)((List) (obj3)).get(j1 - 1)).longValue() > (long)yj; j1--) { }
          goto _L7
_L6:
        j1 = i1;
        l2 = l3;
          goto _L8
_L7:
        if (l2 <= (long)yj) goto _L10; else goto _L9
_L9:
        _cls1.yv[j.ordinal()];
        JVM INSTR tableswitch 1 5: default 592
    //                   1 743
    //                   2 772
    //                   3 784
    //                   4 796
    //                   5 869;
           goto _L11 _L12 _L13 _L14 _L15 _L16
_L11:
        ae.W("Unexpected batching strategy encountered; sending a single hit.");
        obj = (String)((List) (obj2)).get(0);
        ((List) (obj2)).clear();
        ((List) (obj2)).add(obj);
        i1 = 1;
_L19:
        if (i1 >= ((List) (obj2)).size()) goto _L10; else goto _L17
_L17:
        obj = ((List) (obj2)).subList(0, i1);
          goto _L18
_L12:
        j2 = ((List) (obj2)).size() / 2;
        i1 = j2;
        if (j1 <= j2)
        {
            i1 = j1;
        }
          goto _L19
_L13:
        i1 = a(list, j1);
          goto _L19
_L14:
        i1 = b(list, j1);
          goto _L19
_L15:
        if (l2 < (long)(yj * 2))
        {
            i1 = ((List) (obj3)).size() - 1;
            while (i1 > 0 && ((Long)((List) (obj3)).get(i1)).longValue() > l2 / 2L) 
            {
                i1--;
            }
        } else
        {
            i1 = j1;
        }
          goto _L19
_L16:
        i1 = j1;
          goto _L19
_L18:
        i1 = 0;
        httphost = null;
        j2 = 0;
        j1 = k2;
        while (j2 < k1) 
        {
            obj2 = (ab)list.get(j2);
            obj3 = a(((ab) (obj2)));
            k2 = Math.max(1, ((List) (obj)).size());
            if (obj3 == null)
            {
                ae.W("No destination: discarding hit.");
                i1 += k2;
                j1 += k2;
            } else
            {
                httphost = new HttpHost(((URL) (obj3)).getHost(), ((URL) (obj3)).getPort(), ((URL) (obj3)).getProtocol());
                if (!a(a(((ab) (obj2)), ((List) (obj)), j), httphost, k2, af1, l1))
                {
                    af1.e("_de", 1);
                    af1.e("_hd", i1);
                    af1.e("_hs", j1);
                    a(af1, httphost, j, l1);
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
                af1.e("_rs", 1);
                j1 += k2;
            }
            j2++;
        }
        af1.e("_hd", i1);
        af1.e("_hs", j1);
        if (flag)
        {
            a(af1, httphost, j, l1);
        }
        return j1;
_L10:
        obj = obj2;
        if (true) goto _L18; else goto _L4
_L4:
        k1 = 1;
          goto _L20
_L2:
        j1 = 0;
          goto _L20
    }

    String a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    public void ad(String s)
    {
        try
        {
            yg = new URL(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            yg = null;
        }
    }

    int b(List list, int j)
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
            String s = ((ab)list.get(i1)).fa();
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

    public boolean ea()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            ae.V("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    public void setDryRun(boolean flag)
    {
        yt = flag;
    }
}
