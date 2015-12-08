// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class q
    implements w
{

    public static final int A = 0x7f0901eb;
    public static final int B = 0x7f0901ec;
    public static final int C = 0x7f0901ef;
    public static final int D = 0x7f0900ae;
    public static final int E = 0x7f0900b7;
    public static final int F = 0x7f0901da;
    public static final int G = 0x7f0901db;
    public static final int H = 0x7f090171;
    public static final int I = 0x7f090270;
    public static final int J = 0x7f0901de;
    public static final int K = 0x7f0900af;
    public static final int L = 0x7f0900b0;
    public static final int M = 0x7f0900b1;
    public static final int N = 0x7f0900b2;
    public static final int O = 0x7f0900b3;
    public static final int P = 0x7f0900b4;
    public static final int Q = 0x7f0900b5;
    public static final int R = 0x7f0900ad;
    public static final int S = 0x7f0900b6;
    public static final int T = 0x7f0b02a5;
    public static final int U = 0x7f0b05c9;
    public static final int V = 0x7f0b02a4;
    public static final int W = 0x7f09019d;
    public static final int X = 0x7f09019f;
    public static final int Y = 0x7f0900a2;
    public static final int Z = 0x7f0900a3;
    public static final int aA = 0x7f0b0021;
    public static final int aB = 0x7f0b003a;
    public static final int aC = 0x7f0b0034;
    public static final int aD = 0x7f0b0030;
    public static final int aE = 0x7f0b002f;
    public static final int aF = 0x7f0b002e;
    public static final int aG = 0x7f0b002d;
    public static final int aH = 0x7f0b05c6;
    public static final int aI = 0x7f0b0032;
    public static final int aJ = 0x7f0b0033;
    public static final int aK = 0x7f0b0022;
    public static final int aL = 0x7f0b0086;
    public static final int aM = 0x7f0b008a;
    public static final int aN = 0x7f0b0085;
    public static final int aO = 0x7f0b0089;
    public static final int aP = 0x7f0b0088;
    public static final int aQ = 0x7f0b0087;
    public static final int aR = 0x7f0b004e;
    public static final int aS = 0x7f0b0051;
    public static final int aT = 0x7f0b002b;
    public static final int aU = 0x7f0b0052;
    public static final int aV = 0x7f0b002c;
    public static final int aW = 0x7f0b001e;
    public static final int aX = 0x7f0b001f;
    public static final int aY = 0x7f0b0020;
    public static final int aZ = 0x7f0b0028;
    public static final int aa = 0x7f0903a2;
    public static final int ab = 0x7f09044d;
    public static final int ac = 0x7f09044b;
    public static final int ad = 0x7f09044c;
    public static final int ae = 0x7f09044e;
    public static final int af = 0x7f0901bf;
    public static final int ag = 0x7f09022d;
    public static final int ah = 0x7f09022e;
    public static final int ai = 0x7f09027a;
    public static final int aj = 0x7f090296;
    public static final int ak = 0x7f090170;
    public static final int al = 0x7f090278;
    public static final int am = 0x7f0900e5;
    public static final int an = 0x7f0900e2;
    public static final int ao = 0x7f0900e3;
    public static final int ap = 0x7f0900e1;
    public static final int aq = 0x7f0900e4;
    public static final int ar = 0x7f0901bc;
    public static final int as = 0x7f090279;
    public static final int at = 0x7f0c0199;
    public static final int au = 0x7f0c0210;
    public static final int av = 0x7f050021;
    public static final int aw = 0x7f0b05c1;
    public static final int ax = 0x7f0b0050;
    public static final int ay = 0x7f0b004f;
    public static final int az = 0x7f0b0038;
    public static final int ba = 0x7f0b0031;
    public static final int bb = 0x7f0b0042;
    public static final int bc = 0x7f0b0024;
    public static final int bd = 0x7f0b0041;
    public static final int be = 0x7f0b0044;
    public static final int bf = 0x7f0b0043;
    public static final int bg = 0x7f0b0040;
    public static final int bh = 0x7f0b0049;
    public static final int bi = 0x7f0b0048;
    public static final int bj = 0x7f0b0025;
    public static final int bk = 0x7f0b0035;
    public static final int bl = 0x7f0b001d;
    public static final int bm = 0x7f0b0023;
    public static final int bn = 0x7f0b002a;
    public static final int bo = 0x7f0901d8;
    public static final int bp = 0x7f090245;
    public static final int bq = 0x7f090244;
    public static final int br = 0x7f0901d6;
    public static final int bs = 0x7f090243;
    public static final int bt = 0x7f0901d7;
    public static final int bu = 0x7f0901d4;
    public static final int bv = 0x7f090373;
    public static final int bw = 0x7f0901d5;
    public static final int bx = 0x7f0c017e;
    public static final int by = 0x7f0202dc;
    public static final int g = 0x7f090269;
    public static final int h = 0x7f09026a;
    public static final int i = 0x7f09026b;
    public static final int j = 0x7f090268;
    public static final int k = 0x7f09026c;
    public static final int l = 0x7f09026e;
    public static final int m = 0x7f09026d;
    public static final int n = 0x7f0901d9;
    public static final int o = 0x7f0901dc;
    public static final int p = 0x7f0901e5;
    public static final int q = 0x7f0901dd;
    public static final int r = 0x7f09026f;
    public static final int s = 0x7f0901ee;
    public static final int t = 0x7f0901e8;
    public static final int u = 0x7f0901ed;
    public static final int v = 0x7f0901e7;
    public static final int w = 0x7f0901e6;
    public static final int x = 0x7f0901e3;
    public static final int y = 0x7f0901e9;
    public static final int z = 0x7f0901ea;
    List a;
    View b;
    private boolean bA;
    private boolean bB;
    private List bz;
    long c;
    long d;
    float e;
    Runnable f;

    public q()
    {
        bz = new ArrayList();
        a = new ArrayList();
        d = 200L;
        e = 0.0F;
        bA = false;
        bB = false;
        f = new r(this);
    }

    public static Object a(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public final void a(long l1)
    {
        if (!bA)
        {
            d = l1;
        }
    }

    public final void a(View view)
    {
        b = view;
    }

    public final void a(m m1)
    {
        bz.add(m1);
    }

    public final void a(o o1)
    {
        a.add(o1);
    }

    void b()
    {
        for (int i1 = bz.size() - 1; i1 >= 0; i1--)
        {
            ((m)bz.get(i1)).a(this);
        }

    }

    public final void b_()
    {
        if (bA)
        {
            return;
        }
        bA = true;
        for (int i1 = bz.size() - 1; i1 >= 0; i1--)
        {
            bz.get(i1);
        }

        e = 0.0F;
        c = b.getDrawingTime();
        b.postDelayed(f, 16L);
    }

    public final void c()
    {
        if (bB)
        {
            return;
        }
        bB = true;
        if (bA)
        {
            for (int i1 = bz.size() - 1; i1 >= 0; i1--)
            {
                ((m)bz.get(i1)).a();
            }

        }
        b();
    }

    public final float d()
    {
        return e;
    }
}
