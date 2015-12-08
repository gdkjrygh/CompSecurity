// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            ac

public final class u extends Enum
{

    public static final u A;
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u E;
    public static final u F;
    public static final u G;
    public static final u H;
    public static final u I;
    public static final u J;
    public static final u K;
    public static final u L;
    private static Map S;
    private static final u T[];
    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    public static final u g;
    public static final u h;
    public static final u i;
    public static final u j;
    public static final u k;
    public static final u l;
    public static final u m;
    public static final u n;
    public static final u o;
    public static final u p;
    public static final u q;
    public static final u r;
    public static final u s;
    public static final u t;
    public static final u u;
    public static final u v;
    public static final u w;
    public static final u x;
    public static final u y;
    public static final u z;
    private final String M;
    private final int N;
    private final String O;
    private final String P;
    private final Integer Q;
    private final Integer R;

    private u(String s1, int i1, String s2, int j1, String s3)
    {
        this(s1, i1, s2, j1, s3, null);
    }

    private u(String s1, int i1, String s2, int j1, String s3, String s4)
    {
        this(s1, i1, s2, j1, s3, s4, null);
    }

    private u(String s1, int i1, String s2, int j1, String s3, String s4, Integer integer)
    {
        this(s1, i1, s2, j1, s3, s4, integer, null);
    }

    private u(String s1, int i1, String s2, int j1, String s3, String s4, Integer integer, 
            Integer integer1)
    {
        super(s1, i1);
        M = s2;
        N = j1;
        O = s3;
        P = s4;
        Q = integer;
        R = integer1;
    }

    public static boolean a(String s1)
    {
        s1 = (u)S.get(s1);
        if (s1 != null)
        {
            return s1.f();
        } else
        {
            return false;
        }
    }

    public static u valueOf(String s1)
    {
        return (u)Enum.valueOf(com/microsoft/advertising/android/u, s1);
    }

    public static u[] values()
    {
        u au[] = T;
        int i1 = au.length;
        u au1[] = new u[i1];
        System.arraycopy(au, 0, au1, 0, i1);
        return au1;
    }

    public final String a()
    {
        return M;
    }

    public final String b()
    {
        return O;
    }

    public final Integer c()
    {
        return Q;
    }

    public final Integer d()
    {
        return R;
    }

    public final String e()
    {
        return P;
    }

    public final boolean f()
    {
        return N == ac.a;
    }

    public final boolean g()
    {
        return N == ac.b;
    }

    static 
    {
        a = new u("CFMT", 0, "cfmt", ac.a, "creative format", "text,image,html5richmedia,polyad");
        b = new u("SFT", 1, "sft", ac.a, "supported file type", "jpeg,png,gif");
        c = new u("FMT", 2, "fmt", ac.a, "response format", "json");
        d = new u("CLTP", 3, "cltp", ac.a, "client type", "app");
        e = new u("DIM", 4, "dim", ac.a, "how arc does size matching (le is less than equal)", "le");
        f = new u("RAD", 5, "rad", ac.a, "?", "7");
        g = new u("LOPTIN", 6, "loptin", ac.a, "location opt-in", "1");
        h = new u("LC", 7, "lc", ac.a, "locale");
        i = new u("IDTP", 8, "idtp", ac.a, "id type", "muid");
        j = new u("DEV_OS_ID", 9, "devosid", ac.a, "devic OS id?", "204");
        k = new u("UID", 10, "uid", ac.a, "user id");
        l = new u("DEV_MAKE", 11, "devmake", ac.a, "device make");
        m = new u("DEV_MODEL", 12, "devmodel", ac.a, "device model");
        n = new u("DEV_OS", 13, "devos", ac.a, "device operating system", "Android");
        o = new u("DEV_OS_VER", 14, "devosver", ac.a, "dev operating system version");
        p = new u("ADM", 15, "adm", ac.a, "ad model", "2");
        q = new u("APP_ID", 16, "pubid", ac.a, "application id");
        r = new u("AD_UNIT_ID", 17, "pid", ac.a, "ad unit id");
        s = new u("ADVERTISING_ID", 18, "adid", ac.a, "advertising id");
        t = new u("ADOPTOUT_ID", 19, "topt", ac.a, "targetting opt out");
        u = new u("UA", 20, "ua", ac.a, "user agent");
        v = new u("COUNTRY_OR_REGION", 21, "ctry", ac.a, "country or region", null, null, Integer.valueOf(2));
        w = new u("LAT", 22, "lat", ac.a, "lattitude");
        x = new u("LONG", 23, "long", ac.a, "longitude");
        y = new u("KEYWORDS", 24, "kwh", ac.a, "keywords", null, Integer.valueOf(256));
        z = new u("POSTAL_CODE", 25, "zip", ac.a, "zip", null, Integer.valueOf(15));
        A = new u("WIDTH", 26, "w", ac.a, "width in dp");
        B = new u("HEIGHT", 27, "h", ac.a, "height in dp");
        C = new u("PREFETCH", 28, "prefetch", ac.a, "1 for a below-the-fold/prefetch request that needs to be server side counted b/c it might not be shown");
        D = new u("WIDTHPX", 29, "wpx", ac.a, "width in pixels");
        E = new u("HEIGHTPX", 30, "hpx", ac.a, "height in pixels");
        F = new u("RAFB", 31, "rafb", ac.a, "rapid ad BOOTSTRAP (not bool) - setting to 0 disables extra HTML bootstrap code that only works on the web", "0");
        G = new u("NOCOUNT", 32, "nct", ac.a, "NOCOUNT - tells the server not to coutn the impression / client-side impression counting", "1");
        H = new u("ACCEPT", 33, "Accept", ac.b, "", "application/json");
        I = new u("UA_PIXELS", 34, "UA-Pixels", ac.b, "WIDTHxHEIGHT of ad slot");
        J = new u("USER_AGENT", 35, "User-Agent", ac.b, "this is the sdk user agent (browser UA + sdk version info)");
        K = new u("ACCEPT_ENCODING", 36, "Accept-Encoding", ac.b, "", "gzip");
        L = new u("X_ADS_USERAUTH_TICKET", 37, "X-ADS-USERAUTH-TICKET", ac.b, "m$ internal authentication token to be passed to Arc.");
        T = (new u[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L
        });
        S = new TreeMap();
        u au[] = values();
        int j1 = au.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return;
            }
            u u1 = au[i1];
            S.put(u1.M, u1);
            i1++;
        } while (true);
    }
}
