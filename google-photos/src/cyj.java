// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class cyj extends Enum
    implements cyo
{

    public static final cyj A;
    public static final cyj B;
    public static final cyj C;
    public static final cyj D;
    public static final cyj E;
    public static final cyj F;
    public static final cyj G;
    public static final cyj H;
    public static final cyj I;
    public static final cyj J;
    public static final cyj K;
    public static final cyj L;
    public static final cyj M;
    public static final cyj N;
    public static final cyj O;
    public static final cyj P;
    public static final cyj Q;
    public static final cyj R;
    private static final cyj Y[];
    public static final cyj a;
    public static final cyj b;
    public static final cyj c;
    public static final cyj d;
    public static final cyj e;
    public static final cyj f;
    public static final cyj g;
    public static final cyj h;
    public static final cyj i;
    public static final cyj j;
    public static final cyj k;
    public static final cyj l;
    public static final cyj m;
    public static final cyj n;
    public static final cyj o;
    public static final cyj p;
    public static final cyj q;
    public static final cyj r;
    public static final cyj s;
    public static final cyj t;
    public static final cyj u;
    public static final cyj v;
    public static final cyj w;
    public static final cyj x;
    public static final cyj y;
    public static final cyj z;
    final int S;
    public final String T;
    final List U;
    final List V;
    private final int W;
    private List X;

    private transient cyj(String s1, int i1, int j1, String s2, String s3, String s4, int k1, 
            int l1, int ai[])
    {
        super(s1, i1);
        X = new ArrayList();
        S = j1;
        T = s2;
        U = Arrays.asList(s4.split(","));
        W = k1;
        V = Arrays.asList(s3.split(","));
        j1 = ai.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            k1 = ai[i1];
            X.add(Float.valueOf((float)k1 / (float)l1));
        }

    }

    public static cyj valueOf(String s1)
    {
        return (cyj)Enum.valueOf(cyj, s1);
    }

    public static cyj[] values()
    {
        return (cyj[])Y.clone();
    }

    public final double a(int i1)
    {
        return (double)((Float)X.get(i1)).floatValue();
    }

    public final int a()
    {
        return X.size();
    }

    public final int b()
    {
        return W;
    }

    public final String toString()
    {
        String s1 = T;
        String s2 = String.valueOf(V.toString());
        return (new StringBuilder(String.valueOf(s1).length() + 2 + String.valueOf(s2).length())).append(s1).append(": ").append(s2).toString();
    }

    static 
    {
        a = new cyj("PT", 0, -1, "P", "P", "", 4, 1, new int[] {
            1
        });
        b = new cyj("VT", 1, -1, "V", "V", "", 4, 1, new int[] {
            1
        });
        c = new cyj("B8", 2, 0, "Bbbbbbbb", "B,b,b,b,b,b,b,b", "B", 4, 8, new int[] {
            1, 1, 1, 1, 1, 1, 1, 1
        });
        d = new cyj("B7", 3, 0, "Bbbbbbb", "B,b,b,b,b,b,b", "B", 4, 8, new int[] {
            1, 1, 1, 1, 1, 1, 2
        });
        e = new cyj("B6", 4, 0, "Bbbbbb", "B,b,b,b,b,b,", "B", 4, 8, new int[] {
            1, 1, 1, 1, 1, 3
        });
        f = new cyj("F8", 5, 0, "Ffffffff", "F,f,f,f,f,f,f,f,", "F", 4, 8, new int[] {
            1, 1, 1, 1, 1, 1, 1, 1
        });
        g = new cyj("F7", 6, 0, "Fffffff", "F,f,f,f,f,f,f", "F", 4, 8, new int[] {
            1, 1, 1, 1, 1, 1, 2
        });
        h = new cyj("F6", 7, 0, "Ffffff", "F,f,f,f,f,f", "F", 4, 8, new int[] {
            1, 1, 1, 1, 1, 3
        });
        i = new cyj("PPPP", 8, 1, "PPPP", "P,P,P,P", "P,S", 4, 4, new int[] {
            1, 1, 1, 1
        });
        j = new cyj("PPPZ2", 9, 1, "PPPP", "P,P,P,Z2", "P,S,Z", 4, 4, new int[] {
            1, 1, 1, 1
        });
        k = new cyj("PPK1", 10, 1, "PPP", "P,P,K1", "P,S,K", 4, 4, new int[] {
            1, 1, 2
        });
        l = new cyj("PPZ3", 11, 1, "PPP", "P,P,Z3", "P,S,Z", 4, 4, new int[] {
            1, 1, 2
        });
        m = new cyj("PK2", 12, 1, "PP", "P,K2", "P,K", 4, 4, new int[] {
            1, 3
        });
        n = new cyj("K3", 13, 1, "P", "K3", "K", 4, 1, new int[] {
            1
        });
        o = new cyj("PPB4", 14, 1, "PPBbbb", "P,P,B,b,b,b", "P,S,B", 4, 8, new int[] {
            2, 2, 1, 1, 1, 1
        });
        p = new cyj("PPB5", 15, 1, "PPBbbbb", "P,P,B,b,b,b,b", "P,S,B", 4, 20, new int[] {
            5, 5, 2, 2, 2, 2, 2
        });
        q = new cyj("PPF4", 16, 1, "PPFfff", "P,P,F,f,f,f", "P,S,F", 4, 8, new int[] {
            2, 2, 1, 1, 1, 1
        });
        r = new cyj("PPF5", 17, 1, "PPFffff", "P,P,F,f,f,f,f", "P,S,F", 4, 20, new int[] {
            5, 5, 2, 2, 2, 2, 2
        });
        s = new cyj("PPV", 18, 1, "PPV", "P,P,V", "P,S,V", 4, 4, new int[] {
            1, 1, 2
        });
        t = new cyj("K1V", 19, 1, "PV", "K1,V", "K,V", 4, 2, new int[] {
            1, 1
        });
        u = new cyj("PPZ2", 20, 2, "PPP", "P,S,Z", "P,S,Z", 4, 4, new int[] {
            1, 1, 2
        });
        v = new cyj("PPB2", 21, 2, "PPBb", "P,P,B,b", "P,S,B", 4, 4, new int[] {
            1, 1, 1, 1
        });
        w = new cyj("PPB3", 22, 2, "PPBbb", "P,P,B,b,b,", "P,S,B", 4, 12, new int[] {
            3, 3, 2, 2, 2
        });
        x = new cyj("PB4", 23, 2, "PBbbb", "P,B,b,b,b", "P,B", 4, 8, new int[] {
            2, 2, 2, 1, 1
        });
        y = new cyj("PB5", 24, 2, "PBbbbb", "P,B,b,b,b,b", "P,B", 4, 8, new int[] {
            2, 2, 1, 1, 1, 1
        });
        z = new cyj("PPF2", 25, 2, "PPFf", "P,P,F,f", "P,S,F", 4, 4, new int[] {
            1, 1, 1, 1
        });
        A = new cyj("PPF3", 26, 2, "PPFff", "P,P,F,f,f,", "P,S,F", 4, 12, new int[] {
            3, 3, 2, 2, 2
        });
        B = new cyj("PF4", 27, 2, "PFfff", "P,F,f,f,f", "P,F", 4, 8, new int[] {
            2, 2, 2, 1, 1
        });
        C = new cyj("PF5", 28, 2, "PFffff", "P,F,f,f,f,f", "P,F", 4, 8, new int[] {
            2, 2, 1, 1, 1, 1
        });
        D = new cyj("Z2K1", 29, 2, "PP", "Z2,K1", "Z,K", 4, 2, new int[] {
            1, 1
        });
        E = new cyj("Z2Z2", 30, 2, "PP", "Z2,Z2", "Z", 4, 2, new int[] {
            1, 1
        });
        F = new cyj("Z2V", 31, 2, "PV", "Z2,V", "Z,V", 4, 2, new int[] {
            1, 1
        });
        G = new cyj("FB_P", 32, 3, "P", "P", "P", 1, 1, new int[] {
            1
        });
        H = new cyj("FB_V", 33, 3, "V", "V", "V", 2, 1, new int[] {
            1
        });
        I = new cyj("FB_B2", 34, 3, "Bb", "B,b", "B", 1, 2, new int[] {
            1, 1
        });
        J = new cyj("FB_B3", 35, 3, "Bbb", "B,b,b", "B", 2, 4, new int[] {
            1, 1, 2
        });
        K = new cyj("FB_B4", 36, 3, "Bbbb", "B,b,b,b", "B", 2, 4, new int[] {
            1, 1, 1, 1
        });
        L = new cyj("FB_B5", 37, 3, "Bbbbb", "B,b,b,b,b", "B", 3, 6, new int[] {
            1, 1, 1, 1, 2
        });
        M = new cyj("FB_F2", 38, 3, "Ff", "F,f", "F", 1, 2, new int[] {
            1, 1
        });
        N = new cyj("FB_F3", 39, 3, "Fff", "F,f,f", "F", 2, 4, new int[] {
            1, 1, 2
        });
        O = new cyj("FB_F4", 40, 3, "Ffff", "F,f,f,f", "F", 2, 4, new int[] {
            1, 1, 1, 1
        });
        P = new cyj("FB_F5", 41, 3, "Fffff", "F,f,f,f,f", "F", 3, 6, new int[] {
            1, 1, 1, 1, 2
        });
        Q = new cyj("EMPTY_VIDEO", 42, 0x7fffffff, "O", "EV", "", 1, 1, new int[] {
            1
        });
        R = new cyj("END_CARD", 43, 0x7fffffff, "D", "EC", "", 4, 1, new int[] {
            1
        });
        Y = (new cyj[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R
        });
    }
}
