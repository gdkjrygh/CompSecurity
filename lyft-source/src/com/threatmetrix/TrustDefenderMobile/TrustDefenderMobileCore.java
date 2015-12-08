// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.TimingLogger;
import android.view.WindowManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, BrowserInfo, THMStatusCode, InfoGatherer, 
//            CancelState, HttpParameterMap, TDID, DisplayWrapper, 
//            ApplicationInfoGatherer, NativeGatherer, NetworkInfo, TDConfiguration, 
//            LocationWrapper

class TrustDefenderMobileCore
{

    private static final String R = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TrustDefenderMobileCore);
    public static String a = "3.2-83";
    String A;
    String B;
    String C;
    String D;
    String E[];
    ArrayList F;
    TDConfiguration G;
    Location H;
    Context I;
    TimingLogger J;
    CancelState K;
    BrowserInfo L;
    NetworkInfo M;
    long N;
    int O;
    long P;
    volatile THMStatusCode Q;
    int b;
    int c;
    int d;
    int e;
    int f;
    long g;
    long h;
    long i;
    boolean j;
    String k;
    String l;
    String m;
    String n;
    String o;
    String p;
    String q;
    String r;
    String s;
    String t;
    String u;
    String v;
    String w;
    String x;
    String y;
    String z;

    TrustDefenderMobileCore(String s1)
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0L;
        h = 0L;
        i = 0L;
        j = false;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = "";
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
        J = null;
        K = null;
        L = new BrowserInfo();
        M = null;
        N = 0L;
        O = 0;
        P = 0L;
        Q = THMStatusCode.b;
        D = s1;
    }

    private void f(String s1)
    {
        if (J != null)
        {
            J.addSplit(s1);
        }
    }

    private String o()
    {
        if (B == null)
        {
            B = InfoGatherer.c();
        }
        return B;
    }

    private String p()
    {
        if (C == null)
        {
            C = InfoGatherer.d();
        }
        return C;
    }

    private void q()
    {
        if (K != null && K.a())
        {
            throw new InterruptedException();
        } else
        {
            return;
        }
    }

    void a()
    {
        n = null;
        b = 0;
        c = 0;
        u = null;
        H = null;
        B = null;
        C = null;
        G = null;
        h = 0L;
        i = 0L;
        M = null;
        f = 0;
        j = false;
    }

    void a(long l1)
    {
        N = l1;
    }

    void a(Context context)
    {
        I = context;
    }

    void a(Location location, boolean flag)
    {
        H = location;
        j = flag;
    }

    void a(BrowserInfo browserinfo)
    {
        L = browserinfo;
    }

    void a(CancelState cancelstate)
    {
        K = cancelstate;
    }

    void a(TDConfiguration tdconfiguration)
    {
        G = tdconfiguration;
    }

    void a(THMStatusCode thmstatuscode)
    {
        Q = thmstatuscode;
    }

    void a(String s1)
    {
        y = s1;
    }

    void a(List list)
    {
        if (list == null || list.isEmpty())
        {
            if (F != null)
            {
                F.clear();
            }
            return;
        } else
        {
            F = new ArrayList(list);
            return;
        }
    }

    void b()
    {
        O = O + 1;
    }

    void b(long l1)
    {
        g = l1;
    }

    void b(String s1)
    {
        k = s1;
    }

    String c()
    {
        return k;
    }

    boolean c(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "h.online-metrix.net";
        }
        try
        {
            new URL((new StringBuilder()).append("https://").append(s2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e(R, (new StringBuilder()).append("Invalid hostname ").append(s2).toString(), s1);
            return false;
        }
        w = s2;
        return true;
    }

    THMStatusCode d()
    {
        Log.d(R, (new StringBuilder()).append("getStatus returns: ").append(Q.toString()).toString());
        return Q;
    }

    boolean d(String s1)
    {
        if (s1 == null || s1.length() != 8)
        {
            Log.e(R, "Invalid org_id");
            return false;
        } else
        {
            v = s1;
            return true;
        }
    }

    TDConfiguration e()
    {
        return G;
    }

    boolean e(String s1)
    {
        String s2;
label0:
        {
            if (s1 != null)
            {
                s2 = s1;
                if (!s1.isEmpty())
                {
                    break label0;
                }
            }
            s2 = "TrustDefenderMobileSDK";
        }
        s = (new StringBuilder()).append("http://").append(s2).toString();
        o = (new StringBuilder()).append("http://").append(s2).append("/mobile").toString();
        return true;
    }

    String f()
    {
        return w;
    }

    String g()
    {
        return v;
    }

    String h()
    {
        return (new StringBuilder()).append("https://").append(w).append("/fp/mobile/conf").toString();
    }

    HttpParameterMap i()
    {
        HttpParameterMap httpparametermap = new HttpParameterMap();
        httpparametermap.a("org_id", v);
        httpparametermap.a("session_id", k);
        httpparametermap.a("os", "android");
        httpparametermap.a("osVersion", android.os.Build.VERSION.RELEASE);
        if (y != null && !y.isEmpty())
        {
            httpparametermap.a("api_key", y);
        }
        httpparametermap.a("sdk_version", a);
        return httpparametermap;
    }

    void j()
    {
        String s1 = null;
        long l1 = SystemClock.uptimeMillis();
        Log.d(R, "Getting timezone info");
        if ((g & 8L) != 0L)
        {
            InfoGatherer.TZInfo tzinfo = new InfoGatherer.TZInfo();
            if (InfoGatherer.a(tzinfo))
            {
                c = tzinfo.b;
                b = tzinfo.a;
            }
            f("Get time zone");
        }
        if (n == null || l == null || m == null)
        {
            Object obj;
            boolean flag;
            if ((g & 512L) != 0L && TDID.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (n == null)
            {
                obj = TDID.b(I);
                n = TDID.b(((String) (obj)), flag);
            } else
            {
                obj = null;
            }
            f("cookie");
            if (m == null)
            {
                s1 = TDID.a(I);
                q();
                m = TDID.a(s1, flag);
            }
            f("LSC");
            if (p == null)
            {
                p = TDID.c(I);
                f("imei");
            }
            if (l == null)
            {
                String s2 = ((String) (obj));
                if (obj == null)
                {
                    s2 = TDID.b(I);
                }
                obj = s1;
                if (s1 == null)
                {
                    obj = TDID.a(I);
                }
                q();
                l = TDID.a(I, s2, ((String) (obj)), p, flag);
            }
            f("Flash");
        }
        q();
        if ((g & 16L) != 0L && (e == 0 || d == 0))
        {
            obj = new DisplayWrapper(((WindowManager)I.getSystemService("window")).getDefaultDisplay());
            d = ((DisplayWrapper) (obj)).a();
            e = ((DisplayWrapper) (obj)).b();
        }
        f("Get screen dimensions");
        q();
        if (t == null)
        {
            t = InfoGatherer.a(I, I);
        }
        f("Get device fingerprint");
        if ((g & 2048L) != 0L && A == null)
        {
            A = ApplicationInfoGatherer.a(I);
            f("Get self hash");
        }
        if ((g & 12288L) != 12288L) goto _L2; else goto _L1
_L1:
        E = NativeGatherer.a().g();
_L4:
        if (r == null || q == null)
        {
            obj = new StringBuilder();
            q = InfoGatherer.a(((StringBuilder) (obj)));
            if (q != null)
            {
                r = ((StringBuilder) (obj)).toString();
            }
            Log.d(R, (new StringBuilder()).append("Got ").append(r).append(" fonts gives: ").append(q).toString());
        }
        f("Get Font list");
        q();
        if (h == 0L)
        {
            h = InfoGatherer.f();
            f("Get agent boot time");
        }
        q();
        if (x == null)
        {
            x = InfoGatherer.b(I);
            f("Get agent name, version");
        }
        q();
        if (i == 0L)
        {
            i = InfoGatherer.g();
            f("Get the freeSpace in bytes");
        }
        q();
        u = InfoGatherer.a(i, h);
        f("Get device state");
        if ((g & 32768L) != 0L)
        {
            q();
            M = new NetworkInfo(I);
            f("Get the SSID , BSSID and connection type");
        }
        P = SystemClock.uptimeMillis() - l1;
        return;
_L2:
        if ((g & 8192L) != 0L)
        {
            E = NativeGatherer.a().e();
        } else
        if ((g & 4096L) != 0L)
        {
            E = NativeGatherer.a().f();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Map k()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", z);
        hashmap.put("Accept-Langauge", o());
        return hashmap;
    }

    public String l()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(g()).append("-").append(StringUtils.c(c())).append("-mob");
        if (stringbuilder.length() >= 64)
        {
            Log.w(R, "combined session id and org id too long for host name fragment");
            return null;
        }
        Log.d(R, "Launching DNS profiling request");
        String s1 = "d";
        if (f().equals("qa2-h.online-metrix.net"))
        {
            s1 = "q";
        }
        return stringbuilder.append(".").append(s1).append(".aa.online-metrix.net").toString();
    }

    Map m()
    {
        HashMap hashmap = new HashMap();
        if (z != null && !z.isEmpty())
        {
            Log.d(R, (new StringBuilder()).append("Setting User-Agent to ").append(z).toString());
            hashmap.put("User-Agent", z);
        }
        if (n == null)
        {
            hashmap.put("Cookie", "thx_guid=");
        } else
        {
            hashmap.put("Cookie", (new StringBuilder()).append("thx_guid=").append(n).toString());
        }
        hashmap.put("Referer", s);
        hashmap.put("Content-Type", "application/x-www-form-urlencoded");
        hashmap.put("Accept-Language", o());
        return hashmap;
    }

    HttpParameterMap n()
    {
        boolean flag = false;
        if ((g & 16384L) == 0L) goto _L2; else goto _L1
_L1:
        Object obj = InfoGatherer.a(I, G.d);
        if (G.d.size() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        int i1 = ((List) (obj)).size();
        obj1 = StringUtils.a(((List) (obj)), ";", true);
        obj2 = String.valueOf(i1);
_L11:
        HttpParameterMap httpparametermap;
        f("Check URLs");
        obj = "";
        if ((G.a & 256L) != 0L)
        {
            obj = InfoGatherer.a(G.e);
            f("Get URLs");
        }
        httpparametermap = new HttpParameterMap();
        httpparametermap.a(255);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(N).append(":").append(g).append(":").append(O).append(":").append(P);
        httpparametermap.a("mex2", stringbuilder.toString());
        httpparametermap.a("w", G.c);
        httpparametermap.a("c", String.valueOf(b));
        httpparametermap.a("z", String.valueOf(c));
        httpparametermap.a("f", (new StringBuilder()).append(d).append("x").append(e).toString());
        httpparametermap.a("lh", o, true);
        httpparametermap.a("dr", s, true);
        if (!L.b().equals("0"))
        {
            httpparametermap.a("p", L.a(), true);
            httpparametermap.a("pl", L.b(), true);
            httpparametermap.a("ph", L.c(), true);
        }
        httpparametermap.a("hh", StringUtils.b((new StringBuilder()).append(v).append(k).toString()));
        if (L.e() > 0)
        {
            httpparametermap.a("mt", L.f());
            httpparametermap.a("mn", String.valueOf(L.e()));
        }
        httpparametermap.a("mdf", t, true);
        httpparametermap.a("mds", u, true);
        httpparametermap.a("imei", p, true);
        if (H != null)
        {
            httpparametermap.a("tdlat", String.valueOf(H.getLatitude()));
            httpparametermap.a("tdlon", String.valueOf(H.getLongitude()));
            httpparametermap.a("tdlacc", String.valueOf(H.getAccuracy()));
        }
        if (F == null || F.size() <= 0) goto _L5; else goto _L4
_L4:
        Iterator iterator;
        int j1;
        iterator = F.iterator();
        j1 = 0;
_L9:
        if (!iterator.hasNext()) goto _L5; else goto _L6
_L6:
        int k1;
        String s2 = (String)iterator.next();
        StringBuilder stringbuilder1 = (new StringBuilder()).append("aca");
        k1 = j1 + 1;
        httpparametermap.a(stringbuilder1.append(j1).toString(), s2, true);
        if (k1 < 5) goto _L7; else goto _L5
_L5:
        httpparametermap.a("ah", A);
        httpparametermap.a("la", (new StringBuilder()).append(G.c).append(m).toString());
        httpparametermap.a("lq", z);
        httpparametermap.a("fc", (new StringBuilder()).append(G.c).append(l).toString());
        httpparametermap.a("ftsn", r);
        httpparametermap.a("fts", q, true);
        httpparametermap.a("aov", android.os.Build.VERSION.RELEASE, true);
        httpparametermap.a("al", o(), true);
        httpparametermap.a("alo", p(), true);
        httpparametermap.a("ab", (new StringBuilder()).append(Build.BRAND).append(", ").append(Build.MANUFACTURER).toString(), true);
        httpparametermap.a("am", Build.MODEL, true);
        httpparametermap.a("aos", "Android", true);
        httpparametermap.a("fg", l);
        httpparametermap.a("ls", m);
        httpparametermap.a("gr", ((String) (obj2)));
        httpparametermap.a("grr", ((String) (obj1)), Integer.valueOf(1024));
        httpparametermap.a("at", "agent_mobile");
        obj2 = (new StringBuilder()).append(a);
        if (D.isEmpty())
        {
            obj1 = "";
        } else
        {
            obj1 = (new StringBuilder()).append(" : ").append(D).toString();
        }
        httpparametermap.a("av", ((StringBuilder) (obj2)).append(((String) (obj1))).toString());
        httpparametermap.a("mex3", ((String) (obj)));
        if (InfoGatherer.c(I))
        {
            f = f | 2;
        }
        if (H != null && (new LocationWrapper(H)).a())
        {
            f = f | 1;
        }
        if (j)
        {
            f = f | 4;
        }
        httpparametermap.a("mex4", String.valueOf(f));
        if (h == 0L)
        {
            obj = "";
        } else
        {
            obj = String.valueOf(h);
        }
        httpparametermap.a("abt", ((String) (obj)));
        httpparametermap.a("anv", x);
        if (i == 0L)
        {
            obj = "";
        } else
        {
            obj = String.valueOf(i);
        }
        httpparametermap.a("afs", ((String) (obj)));
        if (M != null)
        {
            String s1;
            if (M.b() == null)
            {
                obj = "";
            } else
            {
                obj = M.b();
            }
            httpparametermap.a("wbs", ((String) (obj)));
            if (M.a() == null)
            {
                obj = "";
            } else
            {
                obj = M.a();
            }
            httpparametermap.a("wss", ((String) (obj)));
            if (M.c() == null)
            {
                obj = "";
            } else
            {
                obj = M.c();
            }
            httpparametermap.a("wc", ((String) (obj)));
        }
        obj = new HttpParameterMap();
        ((HttpParameterMap) (obj)).a("org_id", v);
        ((HttpParameterMap) (obj)).a("session_id", k);
        if (E == null)
        {
            break MISSING_BLOCK_LABEL_1469;
        }
        obj1 = new StringBuilder();
        obj2 = E;
        k1 = obj2.length;
        for (j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            s1 = obj2[j1];
            if (((StringBuilder) (obj1)).length() > 0)
            {
                ((StringBuilder) (obj1)).append(",");
            }
            ((StringBuilder) (obj1)).append(s1);
        }

        break; /* Loop/switch isn't completed */
_L7:
        j1 = k1;
        if (true) goto _L9; else goto _L8
_L8:
        Log.d(R, (new StringBuilder()).append("Found: ").append(((StringBuilder) (obj1)).toString()).toString());
        ((HttpParameterMap) (obj)).a("ih", ((StringBuilder) (obj1)).toString());
        f("Params without xor");
        obj1 = httpparametermap.b();
        f("URL encoding");
        Log.d(R, (new StringBuilder()).append("encoded ja = ").append(httpparametermap).toString());
        ((HttpParameterMap) (obj)).a("ja", StringUtils.a(((String) (obj1)), k));
        ((HttpParameterMap) (obj)).a("h", "0").a("m", "2");
        f("Params xor'd");
        return ((HttpParameterMap) (obj));
_L2:
        obj2 = "";
        obj1 = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

}
