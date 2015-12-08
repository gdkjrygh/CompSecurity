// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import android.util.TimingLogger;
import android.view.WindowManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            p, b, k, o, 
//            n, ad, i, a, 
//            ac, ab

class al
{

    public static String a = "2.5-16";
    private static final String t = com/threatmetrix/TrustDefenderMobile/al.getSimpleName();
    private volatile AtomicBoolean A;
    private volatile p B;
    private b C;
    private String D;
    private String E;
    String b;
    String c;
    String d;
    String e;
    int f;
    int g;
    int h;
    int i;
    String j;
    String k;
    String l;
    String m;
    int n;
    String o;
    String p;
    Location q;
    ArrayList r;
    ac s;
    private String u;
    private String v;
    private String w;
    private Context x;
    private String y;
    private TimingLogger z;

    al()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = null;
        u = null;
        v = null;
        w = null;
        k = null;
        l = null;
        m = null;
        n = 0;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = p.b;
        C = new b();
        D = null;
        E = null;
    }

    final void a()
    {
        e = null;
        f = 0;
        g = 0;
        m = null;
        q = null;
        s = null;
    }

    final void a(Context context)
    {
        x = context;
    }

    final void a(Location location)
    {
        q = location;
    }

    final void a(ac ac1)
    {
        s = ac1;
    }

    final void a(b b1)
    {
        C = b1;
    }

    final void a(p p1)
    {
        B = p1;
    }

    final void a(String s1)
    {
        b = s1;
    }

    final void a(AtomicBoolean atomicboolean)
    {
        A = atomicboolean;
    }

    final boolean a(int i1)
    {
        if ((i1 & 1) == 0)
        {
            Log.e(t, "Synchronous is deprecated, please switch to ASYNC");
            return false;
        } else
        {
            n = i1;
            return true;
        }
    }

    final boolean a(String s1, String s2)
    {
        String s3;
label0:
        {
            if (s2 != null)
            {
                s3 = s2;
                if (!s2.isEmpty())
                {
                    break label0;
                }
            }
            s3 = "TrustDefenderMobileSDK";
        }
        k = (new StringBuilder("http://")).append(s3).toString();
        if (s1 != null && s1.length() > 0)
        {
            j = s1;
            if (s1.compareToIgnoreCase(k) == 0)
            {
                j = (new StringBuilder()).append(s1).append("mobile").toString();
            }
        } else
        {
            j = (new StringBuilder("http://")).append(s3).append("/mobile").toString();
        }
        return true;
    }

    final String b()
    {
        return b;
    }

    final boolean b(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "h.online-metrix.net";
        }
        try
        {
            new URL((new StringBuilder("https://")).append(s2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e(t, (new StringBuilder("Invalid hostname ")).append(s2).toString(), s1);
            return false;
        }
        p = s2;
        return true;
    }

    final p c()
    {
        String s1 = t;
        (new StringBuilder("getStatus returns: ")).append(B.toString());
        return B;
    }

    final boolean c(String s1)
    {
        if (s1 == null || s1.length() != 8)
        {
            Log.e(t, "Invalid org_id");
            return false;
        } else
        {
            o = s1;
            return true;
        }
    }

    final ac d()
    {
        return s;
    }

    final String e()
    {
        return p;
    }

    final String f()
    {
        return o;
    }

    final String g()
    {
        return (new StringBuilder("https://")).append(p).append("/fp/mobile/conf").toString();
    }

    final k h()
    {
        k k1 = new k();
        k1.a("org_id", o);
        k1.a("session_id", b);
        k1.a("os", "android");
        k1.a("osVersion", android.os.Build.VERSION.RELEASE);
        if (y != null && !y.isEmpty())
        {
            k1.a("api_key", y);
        }
        return k1;
    }

    final void i()
    {
        Object obj1 = null;
        String s1 = t;
        if ((n & 8) != 0)
        {
            o o1 = new o();
            if (com.threatmetrix.TrustDefenderMobile.n.a(o1))
            {
                g = o1.b;
                f = o1.a;
            }
            if (z != null)
            {
                z.addSplit("get time zone");
            }
        }
        if (e == null || c == null || d == null)
        {
            Object obj;
            boolean flag;
            if ((n & 0x200) != 0 && ad.a())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (e == null)
            {
                obj = ad.b(x);
                e = ad.b(((String) (obj)), flag);
            } else
            {
                obj = null;
            }
            if (z != null)
            {
                z.addSplit("cookie");
            }
            if (d == null)
            {
                obj1 = ad.a(x);
                if (A != null && A.get())
                {
                    throw new InterruptedException();
                }
                d = ad.a(((String) (obj1)), flag);
            }
            if (z != null)
            {
                z.addSplit("LSC");
            }
            if (u == null)
            {
                u = ad.c(x);
                if (z != null)
                {
                    z.addSplit("imei");
                }
            }
            if (c == null)
            {
                String s2 = ((String) (obj));
                if (obj == null)
                {
                    s2 = ad.b(x);
                }
                obj = obj1;
                if (obj1 == null)
                {
                    obj = ad.a(x);
                }
                if (A != null && A.get())
                {
                    throw new InterruptedException();
                }
                obj1 = x;
                c = ad.a(s2, ((String) (obj)), u, flag);
            }
            if (z != null)
            {
                z.addSplit("Flash");
            }
        }
        if (A != null && A.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if ((n & 0x10) != 0 && (i == 0 || h == 0))
        {
            obj = new i(((WindowManager)x.getSystemService("window")).getDefaultDisplay());
            h = ((i) (obj)).a();
            i = ((i) (obj)).b();
        }
        if (z != null)
        {
            z.addSplit("get screen dimensions");
        }
        if (A != null && A.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        m = com.threatmetrix.TrustDefenderMobile.n.a();
        if (z != null)
        {
            z.addSplit("get device state");
        }
        if (A != null && A.get() || Thread.currentThread().isInterrupted())
        {
            throw new InterruptedException();
        }
        if (l == null)
        {
            l = com.threatmetrix.TrustDefenderMobile.n.a(x, x);
        }
        if (z != null)
        {
            z.addSplit("get device fingerprint");
        }
        if ((n & 0x800) != 0 && E == null)
        {
            E = com.threatmetrix.TrustDefenderMobile.a.a(x);
            if (z != null)
            {
                z.addSplit("get self hash");
            }
        }
        if (w == null || v == null)
        {
            obj = new StringBuilder();
            v = com.threatmetrix.TrustDefenderMobile.n.a(((StringBuilder) (obj)));
            if (v != null)
            {
                w = ((StringBuilder) (obj)).toString();
            }
            obj = t;
            (new StringBuilder("Got ")).append(w).append(" fonts gives: ").append(v);
        }
        if (z != null)
        {
            z.addSplit("Get Fontlist");
        }
    }

    final Map j()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("User-Agent", D);
        return hashmap;
    }

    final Map k()
    {
        HashMap hashmap = new HashMap();
        if (D != null && !D.isEmpty())
        {
            String s1 = t;
            (new StringBuilder("Setting User-Agent to ")).append(D);
            hashmap.put("User-Agent", D);
        }
        if (e == null)
        {
            hashmap.put("Cookie", "thx_guid=");
        } else
        {
            hashmap.put("Cookie", (new StringBuilder("thx_guid=")).append(e).toString());
        }
        hashmap.put("Referer", k);
        hashmap.put("Content-Type", "application/x-www-form-urlencoded");
        return hashmap;
    }

    final k l()
    {
        Object obj = com.threatmetrix.TrustDefenderMobile.n.a(x, s.c);
        int l1 = ((List) (obj)).size();
        String s3 = ab.a(((List) (obj)), ";");
        if (z != null)
        {
            z.addSplit("Check URLs");
        }
        obj = "";
        if ((s.a & 0x100) != 0)
        {
            String s1 = com.threatmetrix.TrustDefenderMobile.n.a(s.d);
            obj = s1;
            if (z != null)
            {
                z.addSplit("get URLs");
                obj = s1;
            }
        }
        k k1 = new k();
        k1.a(255);
        k1.a("w", s.b);
        k1.a("c", String.valueOf(f));
        k1.a("z", String.valueOf(g));
        k1.a("f", (new StringBuilder()).append(h).append("x").append(i).toString());
        k1.a("lh", j, true);
        k1.a("dr", k, true);
        if (!C.b.equals("0"))
        {
            k1.a("p", C.a, true);
            k1.a("pl", C.b, true);
            k1.a("ph", C.d, true);
        }
        k1.a("hh", ab.b((new StringBuilder()).append(o).append(b).toString()));
        if (C.f > 0)
        {
            k1.a("mt", C.h);
            k1.a("mn", String.valueOf(C.f));
        }
        k1.a("mdf", l, true);
        k1.a("mds", m, true);
        k1.a("imei", u, true);
        if (q != null)
        {
            k1.a("tdlat", String.valueOf(q.getLatitude()));
            k1.a("tdlon", String.valueOf(q.getLongitude()));
            k1.a("tdlacc", String.valueOf(q.getAccuracy()));
        }
        if (r != null && r.size() > 0)
        {
            Iterator iterator = r.iterator();
            int i1 = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s4 = (String)iterator.next();
                StringBuilder stringbuilder = new StringBuilder("aca");
                int j1 = i1 + 1;
                k1.a(stringbuilder.append(i1).toString(), s4, true);
                if (j1 >= 5)
                {
                    break;
                }
                i1 = j1;
            } while (true);
        }
        k1.a("ah", E);
        k1.a("la", (new StringBuilder()).append(s.b).append(d).toString());
        k1.a("lq", D);
        String s2 = Integer.toString((new Random()).nextInt(10000) + 10000);
        k1.a("nu", s2.substring(s2.length() - 4));
        k1.a("fc", (new StringBuilder()).append(s.b).append(c).toString());
        k1.a("ftsn", w);
        k1.a("fts", v, true);
        k1.a("v", android.os.Build.VERSION.RELEASE, true);
        k1.a("o", Build.BRAND, true);
        k1.a("mf", Build.MODEL, true);
        k1.a("l", Locale.getDefault().getLanguage(), true);
        k1.a("fg", c);
        k1.a("ls", d);
        if (s.c.size() == 0)
        {
            s2 = "";
        } else
        {
            s2 = String.valueOf(l1);
        }
        k1.a("gr", s2);
        k1.a("grr", s3);
        k1.a("at", "agent_mobile");
        k1.a("av", a);
        k1.a("ex3", ((String) (obj)));
        obj = new k();
        ((k) (obj)).a("org_id", o);
        ((k) (obj)).a("session_id", b);
        if (z != null)
        {
            z.addSplit("params without xor");
        }
        s2 = k1.a();
        if (z != null)
        {
            z.addSplit("url encoding");
        }
        ((k) (obj)).a("ja", ab.a(s2, b));
        ((k) (obj)).a("h", "0").a("m", "2");
        if (z != null)
        {
            z.addSplit("Params xor'd");
        }
        return ((k) (obj));
    }

}
