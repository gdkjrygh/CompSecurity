// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.UUID;

public final class gmb
{

    static final HashMap T;
    boolean A;
    long B;
    long C;
    int D;
    long E;
    String F;
    String G;
    boolean H;
    long I;
    public long J;
    public long K;
    long L;
    long M;
    long N;
    long O;
    long P;
    long Q;
    public UUID R;
    public long S;
    public boolean U;
    public boolean V;
    public boolean W;
    private final String X;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    boolean o;
    String p;
    String q;
    long r;
    public long s;
    public long t;
    int u;
    long v;
    int w;
    long x;
    public long y;
    public long z;

    public gmb(String s1)
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "unknown";
        t = -1L;
        y = -1L;
        z = -1L;
        F = "";
        G = "";
        J = -1L;
        ctz.a(s1);
        X = s1;
    }

    static int A(gmb gmb1)
    {
        return gmb1.D;
    }

    static long B(gmb gmb1)
    {
        return gmb1.E;
    }

    static String C(gmb gmb1)
    {
        return gmb1.F;
    }

    static String D(gmb gmb1)
    {
        return gmb1.G;
    }

    static boolean E(gmb gmb1)
    {
        return gmb1.H;
    }

    static long F(gmb gmb1)
    {
        return gmb1.I;
    }

    static long G(gmb gmb1)
    {
        return gmb1.J;
    }

    static long H(gmb gmb1)
    {
        return gmb1.K;
    }

    static long I(gmb gmb1)
    {
        return gmb1.L;
    }

    static long J(gmb gmb1)
    {
        return gmb1.M;
    }

    static long K(gmb gmb1)
    {
        return gmb1.N;
    }

    static long L(gmb gmb1)
    {
        return gmb1.O;
    }

    static boolean M(gmb gmb1)
    {
        return gmb1.o;
    }

    static String N(gmb gmb1)
    {
        return gmb1.n;
    }

    static String O(gmb gmb1)
    {
        return gmb1.p;
    }

    static String P(gmb gmb1)
    {
        return gmb1.q;
    }

    static long Q(gmb gmb1)
    {
        return gmb1.P;
    }

    static long R(gmb gmb1)
    {
        return gmb1.Q;
    }

    static UUID S(gmb gmb1)
    {
        return gmb1.R;
    }

    static long T(gmb gmb1)
    {
        return gmb1.S;
    }

    static String a(gmb gmb1)
    {
        return gmb1.a;
    }

    static String b(gmb gmb1)
    {
        return gmb1.X;
    }

    static boolean b()
    {
        return false;
    }

    static String c(gmb gmb1)
    {
        return gmb1.b;
    }

    static String d(gmb gmb1)
    {
        return gmb1.c;
    }

    static String e(gmb gmb1)
    {
        return gmb1.d;
    }

    static String f(gmb gmb1)
    {
        return gmb1.e;
    }

    static String g(gmb gmb1)
    {
        return gmb1.f;
    }

    static String h(gmb gmb1)
    {
        return gmb1.g;
    }

    static String i(gmb gmb1)
    {
        return gmb1.h;
    }

    static String j(gmb gmb1)
    {
        return gmb1.i;
    }

    static String k(gmb gmb1)
    {
        return gmb1.j;
    }

    static String l(gmb gmb1)
    {
        return gmb1.k;
    }

    static String m(gmb gmb1)
    {
        return gmb1.l;
    }

    static String n(gmb gmb1)
    {
        return gmb1.m;
    }

    static long o(gmb gmb1)
    {
        return gmb1.r;
    }

    static long p(gmb gmb1)
    {
        return gmb1.s;
    }

    static long q(gmb gmb1)
    {
        return gmb1.t;
    }

    static int r(gmb gmb1)
    {
        return gmb1.u;
    }

    static long s(gmb gmb1)
    {
        return gmb1.v;
    }

    static int t(gmb gmb1)
    {
        return gmb1.w;
    }

    static long u(gmb gmb1)
    {
        return gmb1.x;
    }

    static long v(gmb gmb1)
    {
        return gmb1.y;
    }

    static long w(gmb gmb1)
    {
        return gmb1.z;
    }

    static boolean x(gmb gmb1)
    {
        return gmb1.A;
    }

    static long y(gmb gmb1)
    {
        return gmb1.B;
    }

    static long z(gmb gmb1)
    {
        return gmb1.C;
    }

    public final gma a()
    {
        return new gma(this, (byte)0);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        T = hashmap;
        hashmap.put(Integer.valueOf(-1), "unknown");
        T.put(Integer.valueOf(0), "none");
        T.put(Integer.valueOf(1), "gprs");
        T.put(Integer.valueOf(2), "edge");
        T.put(Integer.valueOf(3), "3g");
        T.put(Integer.valueOf(4), "4g");
        T.put(Integer.valueOf(5), "wlan");
        T.put(Integer.valueOf(6), "ethernet");
    }
}
