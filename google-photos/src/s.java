// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class s
    implements n
{

    public static final int A = 0x7f0b029a;
    public static final int B = 0x7f0b0297;
    public static final int C = 0x7f0b029e;
    public static final int D = 0x7f0b029d;
    public static final int E = 0x7f0b02a4;
    public static final int F = 0x7f090355;
    public static final int G = 0x7f090358;
    public static final int H = 0x7f09019c;
    public static final int I = 0x7f09005b;
    public static final int J = 0x7f0901a4;
    public static final int K = 0x7f09019d;
    public static final int L = 0x7f090359;
    public static final int M = 0x7f0901a2;
    public static final int N = 0x7f09035c;
    public static final int O = 0x7f09035a;
    public static final int P = 0x7f090408;
    public static final int Q = 0x7f09019b;
    public static final int R = 0x7f0903e2;
    public static final int S = 0x7f09035e;
    public static final int T = 0x7f09035d;
    public static final int U = 0x7f0901a9;
    public static final int V = 0x7f0901aa;
    public static final int W = 0x7f09005d;
    public static final int X = 0x7f09035b;
    public static final int Y = 0x7f090059;
    public static final int Z = 0x7f09019f;
    public static final int a = 0x7f0900ec;
    public static final int aA = 0x7f0901a3;
    public static final int aB = 0x7f0c0199;
    public static final int aC = 0x7f0c0210;
    public static final int aD = 0x7f05000a;
    public static final int aE = 0x7f05000d;
    public static final int aF = 0x7f05000f;
    public static final int aG = 0x7f050010;
    public static final int aH = 0x7f050021;
    public static final int aI = 0x7f050022;
    public static final int aJ = 0x7f050023;
    public static final int aK = 0x7f050024;
    public static final int aL = 0x7f050025;
    public static final int aM = 0x7f090029;
    public static final int aN = 0x7f0903f0;
    public static final int aO = 0x7f0903f3;
    public static final int aP = 0x7f0903f1;
    public static final int aQ = 0x7f0903f2;
    public static final int aR = 0x7f0903ef;
    public static final int aS = 0x7f0903f4;
    public static final int aT = 0x7f0903f6;
    public static final int aU = 0x7f0903f7;
    public static final int aV = 0x7f0903f8;
    public static final int aW = 0x7f090261;
    public static final int aX = 0x7f090260;
    public static final int aY = 0x7f0902a3;
    public static final int aZ = 0x7f0902a1;
    public static final int aa = 0x7f0903c0;
    public static final int ab = 0x7f090354;
    public static final int ac = 0x7f090361;
    public static final int ad = 0x7f0903e3;
    public static final int ae = 0x7f0901ad;
    public static final int af = 0x7f0901ae;
    public static final int ag = 0x7f0901af;
    public static final int ah = 0x7f090409;
    public static final int ai = 0x7f090407;
    public static final int aj = 0x7f09035f;
    public static final int ak = 0x7f09005e;
    public static final int al = 0x7f09005f;
    public static final int am = 0x7f090060;
    public static final int an = 0x7f090061;
    public static final int ao = 0x7f090062;
    public static final int ap = 0x7f090360;
    public static final int aq = 0x7f09005c;
    public static final int ar = 0x7f090356;
    public static final int as = 0x7f090357;
    public static final int at = 0x7f09039f;
    public static final int au = 0x7f0903e1;
    public static final int av = 0x7f09005a;
    public static final int aw = 0x7f0901b1;
    public static final int ax = 0x7f0901a6;
    public static final int ay = 0x7f0901a5;
    public static final int az = 0x7f0901a7;
    public static final int b = 0x7f0902ce;
    public static final int bA = 0x7f0903f5;
    public static final int bB = 0x7f090025;
    public static final int bC = 0x7f09029f;
    public static final int bD = 0x7f090039;
    public static final int bE = 0x7f090033;
    public static final int bF = 0x7f090042;
    public static final int bG = 0x7f090040;
    public static final int bH = 0x7f090041;
    public static final int bI = 0x7f090043;
    public static final int bJ = 0x7f09003f;
    public static final int bK = 0x7f090032;
    public static final int bL = 0x7f090037;
    public static final int bM = 0x7f09002c;
    public static final int bN = 0x7f090034;
    public static final int bO = 0x7f090036;
    public static final int bP = 0x7f090045;
    public static final int bQ = 0x7f090046;
    public static final int bR = 0x7f09003c;
    public static final int bS = 0x7f09003b;
    public static final int bT = 0x7f090044;
    public static final int bU = 0x7f09002f;
    public static final int bV = 0x7f090031;
    public static final int bW = 0x7f090030;
    public static final int bX = 0x7f090035;
    public static final int bY = 0x7f090038;
    public static final int bZ = 0x7f09003a;
    public static final int ba = 0x7f090256;
    public static final int bb = 0x7f090255;
    public static final int bc = 0x7f090447;
    public static final int bd = 0x7f090426;
    public static final int be = 0x7f09043c;
    public static final int bf = 0x7f090425;
    public static final int bg = 0x7f090423;
    public static final int bh = 0x7f090428;
    public static final int bi = 0x7f090429;
    public static final int bj = 0x7f090424;
    public static final int bk = 0x7f090427;
    public static final int bl = 0x7f090027;
    public static final int bm = 0x7f090028;
    public static final int bn = 0x7f090252;
    public static final int bo = 0x7f090253;
    public static final int bp = 0x7f0903d2;
    public static final int bq = 0x7f0903d5;
    public static final int br = 0x7f0903ec;
    public static final int bs = 0x7f0902a0;
    public static final int bt = 0x7f0903ed;
    public static final int bu = 0x7f0902a2;
    public static final int bv = 0x7f0903ee;
    public static final int bw = 0x7f0903f9;
    public static final int bx = 0x7f09029d;
    public static final int by = 0x7f09029e;
    public static final int bz = 0x7f09002a;
    public static final int c = 0x7f090228;
    public static final int ca = 0x7f0901bc;
    public static final int cb = 0x7f0903fb;
    public static final int cc = 0x7f090400;
    public static final int cd = 0x7f0903fc;
    public static final int ce = 0x7f0903ff;
    public static final int cf = 0x7f090401;
    public static final int cg = 0x7f090402;
    public static final int ch = 0x7f090403;
    public static final int ci = 0x7f0903fe;
    public static final int cj = 0x7f0903fd;
    public static final int ck = 0x7f090404;
    public static final int cl = 0x7f090405;
    public static final int cm = 0x7f0903fa;
    public static final int cn = 0x7f0b02b6;
    public static final int co = 0x7f0b05c1;
    public static final int cp = 0x7f0b05c6;
    public static final int d = 0x7f0901bf;
    public static final int e = 0x7f090170;
    public static final int f = 0x7f09016d;
    public static final int g = 0x7f0900e9;
    public static final int h = 0x7f0900ef;
    public static final int i = 0x7f0900ed;
    public static final int j = 0x7f0900f1;
    public static final int k = 0x7f0900eb;
    public static final int l = 0x7f0900ea;
    public static final int m = 0x7f090275;
    public static final int n = 0x7f0902cd;
    public static final int o = 0x7f090171;
    public static final int p = 0x7f0900e7;
    public static final int q = 0x7f0900e6;
    public static final int r = 0x7f0900e8;
    public static final int s = 0x7f0b0298;
    public static final int t = 0x7f0b0299;
    public static final int u = 0x7f0b0296;
    public static final int v = 0x7f0b029c;
    public static final int w = 0x7f0b029b;
    public static final int x = 0x7f0b0295;
    public static final int y = 0x7f0b0294;
    public static final int z = 0x7f0b02a5;
    private TimeInterpolator cq;

    s()
    {
    }

    public static String a(String s1)
    {
        String s2 = String.valueOf("remote_media.");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s2.concat(s1);
        } else
        {
            return new String(s2);
        }
    }

    public static String b(String s1)
    {
        String s2 = String.valueOf("collections.");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s2.concat(s1);
        } else
        {
            return new String(s2);
        }
    }

    public final w a()
    {
        return new u(ValueAnimator.ofFloat(new float[] {
            0.0F, 1.0F
        }));
    }

    public final void a(View view)
    {
        if (cq == null)
        {
            cq = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(cq);
    }
}
