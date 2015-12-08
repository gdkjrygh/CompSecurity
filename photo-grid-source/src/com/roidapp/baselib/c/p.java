// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import com.roidapp.baselib.e;

public final class p
{

    private static p k;
    public final int a[];
    public final int b[];
    public final int c[];
    public final int d[];
    public final int e[];
    public final int f[];
    public final int g[][];
    public final int h[][];
    public final int i[] = {
        0xff000000, -1, 0xff757575, 0xfffa0029, -59471, 0xff7619ff, 0xff0068ff, 0xff12f0ff, 0xff00fd0a, 0xffe5fe00, 
        -768, -24217, 0xff8f6c27, 0xff57000e, 0xff890016, 0xffbc001f, -29319, -14660, 0xffcb4f00, 0xffea5200, 
        0xfffe7819, -16507, -9037, 0xff77004f, 0xffad0074, 0xffda0092, -33062, -17169, 0xff270060, 0xff39008c, 
        0xff5000c9, 0xffbb83ff, 0xffdcc0ff, 0xff000585, 0xff000dc6, 0xff0016ff, 0xff7fb4ff, 0xffb1dfff, 0xff00596a, 0xff007e8b, 
        0xff00b0bd, 0xff67f3ff, 0xffa2f8ff, 0xff004c0a, 0xff008b0a, 0xff00b30a, 0xff6aff7a, 0xffb7ffc3, 0xff667f00, 0xff8fb200, 
        0xffc5f400, 0xfff3ff6a, 0xfffaffb8, 0xfffda900, -16896, -11520, -374, -72, 0xff372503, 0xff574018, 
        0xff755209, 0xffb39255, 0xffdebc7d, 0xff2c2c2c, 0xff515151, 0xffc4c4c4
    };
    public final int j[][];

    private p()
    {
        a = (new int[] {
            e.bk, e.dG, e.br, e.bJ, e.bM, e.dJ, e.c, e.bo, e.dM, e.bG
        });
        b = (new int[] {
            e.bi, e.dF, e.bq, e.bI, e.bL, e.dI, e.b, e.bn, e.dL, e.bF
        });
        c = (new int[] {
            e.bg, e.dE, e.bp, e.bH, e.bK, e.dH, e.a, e.bm, e.dK, e.bE
        });
        d = (new int[] {
            e.bN, e.bT, e.bU, e.bV, e.bW, e.bX, e.bY, e.bZ, e.ca, e.bO, 
            e.bP, e.bQ, e.bR, e.bS, e.cb, e.cg, e.ch, e.ci, e.cj, e.ck, 
            e.cl, e.cm, e.cn, e.cc, e.cd, e.ce, e.cf, e.co, e.cr, e.cs, 
            e.ct, e.cu, e.cv, e.cw, e.cx, e.cy, e.cp, e.cq, e.cz, e.cD, 
            e.cE, e.cF, e.cG, e.cH, e.cI, e.cJ, e.cK, e.cA, e.cB, e.cC, 
            e.cL, e.cO, e.cP, e.cQ, e.cR, e.cS, e.cT, e.cU, e.cV, e.cM, 
            e.cN, e.cW, e.cY, e.cZ, e.da, e.db, e.dc, e.dd, e.de, e.df, 
            e.cX, e.dg, e.dh, e.di, e.dj, e.dk, e.dl, e.dm, e.dn, e._flddo, 
            e.dp, e.dq, e.dr, e.ds, e.dt, e.du, e.dv
        });
        e = (new int[] {
            e.i, e.j, e.k, e.l, e.m, e.n, e.o, e.p, e.q, e.d, 
            e.e, e.f, e.g, e.v, e.w, e.x, e.y, e.z, e.A, e.B, 
            e.C, e.D, e.r, e.s, e.t, e.G, e.H, e.I, e.J, e.K, 
            e.L, e.M, e.N, e.O, e.E, e.F, e.S, e.T, e.U, e.V, 
            e.W, e.X, e.Y, e.Z, e.aa, e.P, e.Q, e.R, e.ad, e.ae, 
            e.af, e.ag, e.ah, e.ai, e.aj, e.ak, e.al, e.ab, e.ac, e.an, 
            e.ao, e.ap, e.aq, e.ar, e.as, e.at, e.au, e.av, e.am, e.aw, 
            e.ax, e.ay, e.az, e.aA, e.aB, e.aC, e.aD, e.aE, e.aF, e.aG, 
            e.aH, e.aI, e.aJ, e.aK, e.aL
        });
        f = (new int[] {
            e.j, e.bs, e.bv, e.bu, e.bt, e.bx, e.bz, e.by, e.bw, e.bA, 
            e.bB
        });
        int ai[] = {
            e.aV, e.aW, e.aX, e.bd, e.bc, e.aU, e.aY, e.aZ, e.ba, e.bb
        };
        int ai1[] = {
            e.bs
        };
        int ai2[] = {
            e.G, e.H, e.K, e.N, e.I, e.J, e.M, e.E, e.O, e.F, 
            e.L
        };
        int ai3[] = {
            e.B, e.v, e.s, e.w, e.D, e.y, e.C, e.t, e.x, e.z, 
            e.u, e.r, e.A
        };
        int l = e.k;
        int i1 = e.j;
        int j1 = e.o;
        int k1 = e.m;
        int l1 = e.i;
        int i2 = e.d;
        int j2 = e.l;
        int k2 = e.p;
        int l2 = e.g;
        int i3 = e.f;
        int j3 = e.e;
        int k3 = e.q;
        int l3 = e.n;
        int i4 = e.h;
        int ai4[] = {
            e.aj, e.ae, e.ad, e.af, e.ah, e.ab, e.ac, e.ak, e.ag, e.al, 
            e.ai
        };
        int j4 = e.aw;
        int k4 = e.ax;
        int l4 = e.az;
        int i5 = e.aD;
        int j5 = e.ay;
        int k5 = e.aA;
        int l5 = e.aC;
        int i6 = e.aB;
        int ai5[] = {
            e.ar, e.au, e.an, e.ao, e.aq, e.as, e.am, e.av, e.at, e.ap
        };
        int j6 = e.V;
        int k6 = e.aa;
        int l6 = e.R;
        int i7 = e.S;
        int j7 = e.T;
        int k7 = e.Q;
        int l7 = e.Y;
        int i8 = e.U;
        int j8 = e.W;
        int k8 = e.P;
        int l8 = e.Z;
        int i9 = e.X;
        int j9 = e.aE;
        int k9 = e.aF;
        int l9 = e.aG;
        int i10 = e.aH;
        int j10 = e.aI;
        int k10 = e.aJ;
        int l10 = e.aK;
        int i11 = e.aL;
        int ai6[] = {
            e.aM, e.aN, e.aO, e.aP, e.aQ, e.aR, e.aS, e.aT
        };
        g = (new int[][] {
            ai, ai1, ai2, ai3, new int[] {
                l, i1, j1, k1, l1, i2, j2, k2, l2, i3, 
                j3, k3, l3, i4
            }, ai4, new int[] {
                j4, k4, l4, i5, j5, k5, l5, i6
            }, ai5, new int[] {
                j6, k6, l6, i7, j7, k7, l7, i8, j8, k8, 
                l8, i9
            }, new int[] {
                j9, k9, l9, i10, j10, k10, l10, i11
            }, 
            ai6
        });
        ai = (new int[] {
            0xff000000, 0xff2c2c2c, 0xff515151, 0xff757575, 0xffc4c4c4, -1, 0
        });
        ai1 = (new int[] {
            0xff57000e, 0xff890016, 0xffbc001f, 0xfffa0029, -29319, -14660, 0
        });
        ai2 = (new int[] {
            0xff270060, 0xff39008c, 0xff5000c9, 0xff7619ff, 0xffbb83ff, 0xffdcc0ff, 0
        });
        ai3 = (new int[] {
            0xff000585, 0xff000dc6, 0xff0016ff, 0xff0068ff, 0xff7fb4ff, 0xffb1dfff, 0
        });
        ai4 = (new int[] {
            0xff004c0a, 0xff008b0a, 0xff00b30a, 0xff00fd0a, 0xff6aff7a, 0xffb7ffc3, 0
        });
        ai5 = (new int[] {
            0xff667f00, 0xff8fb200, 0xffc5f400, 0xffe5fe00, 0xfff3ff6a, 0xfffaffb8, 0
        });
        ai6 = (new int[] {
            0xffcb4f00, 0xffea5200, 0xfffe7819, -24217, -16507, -9037, 0
        });
        int ai7[] = {
            0xff372503, 0xff574018, 0xff755209, 0xff8f6c27, 0xffb39255, 0xffdebc7d, 0
        };
        h = (new int[][] {
            ai, ai1, new int[] {
                0xff77004f, 0xffad0074, 0xffda0092, -59471, -33062, -17169, 0
            }, ai2, ai3, new int[] {
                0xff00596a, 0xff007e8b, 0xff00b0bd, 0xff12f0ff, 0xff67f3ff, 0xffa2f8ff, 0
            }, ai4, ai5, new int[] {
                0xfffda900, -16896, -11520, -768, -374, -72, 0
            }, ai6, 
            ai7
        });
        ai = new int[0];
        ai1 = new int[0];
        l = e.co;
        i1 = e.cr;
        j1 = e.cu;
        k1 = e.cx;
        l1 = e.cs;
        i2 = e.ct;
        j2 = e.cw;
        k2 = e.cp;
        l2 = e.cy;
        i3 = e.cq;
        j3 = e.cv;
        ai2 = (new int[] {
            e.cl, e.cb, e.cd, e.cg, e.cn, e.ci, e.cm, e.ce, e.ch, e.cj, 
            e.cf, e.cc, e.ck
        });
        ai3 = (new int[] {
            e.bU, e.bT, e.bY, e.bW, e.bN, e.bO, e.bV, e.bZ, e.bR, e.bQ, 
            e.bP, e.ca, e.bX, e.bS
        });
        k3 = e.cT;
        l3 = e.cO;
        i4 = e.cL;
        j4 = e.cP;
        k4 = e.cR;
        l4 = e.cM;
        i5 = e.cN;
        j5 = e.cU;
        k5 = e.cQ;
        l5 = e.cV;
        i6 = e.cS;
        j6 = e.dg;
        k6 = e.dh;
        l6 = e.dj;
        i7 = e.dn;
        j7 = e.di;
        k7 = e.dk;
        l7 = e.dm;
        i8 = e.dl;
        j8 = e.db;
        k8 = e.de;
        l8 = e.cW;
        i9 = e.cY;
        j9 = e.da;
        k9 = e.dc;
        l9 = e.cX;
        i10 = e.df;
        j10 = e.dd;
        k10 = e.cZ;
        l10 = e.cF;
        i11 = e.cK;
        int j11 = e.cC;
        int k11 = e.cz;
        int l11 = e.cD;
        int i12 = e.cB;
        int j12 = e.cI;
        int k12 = e.cE;
        int l12 = e.cG;
        int i13 = e.cA;
        int j13 = e.cJ;
        int k13 = e.cH;
        ai4 = (new int[] {
            e._flddo, e.dp, e.dq, e.dr, e.ds, e.dt, e.du, e.dv
        });
        ai5 = (new int[] {
            e.dw, e.dx, e.dy, e.dz, e.dA, e.dB, e.dC, e.dD
        });
        j = (new int[][] {
            ai, ai1, new int[] {
                l, i1, j1, k1, l1, i2, j2, k2, l2, i3, 
                j3
            }, ai2, ai3, new int[] {
                k3, l3, i4, j4, k4, l4, i5, j5, k5, l5, 
                i6
            }, new int[] {
                j6, k6, l6, i7, j7, k7, l7, i8
            }, new int[] {
                j8, k8, l8, i9, j9, k9, l9, i10, j10, k10
            }, new int[] {
                l10, i11, j11, k11, l11, i12, j12, k12, l12, i13, 
                j13, k13
            }, ai4, 
            ai5
        });
    }

    public static p a()
    {
        com/roidapp/baselib/c/p;
        JVM INSTR monitorenter ;
        p p1;
        if (k == null)
        {
            k = new p();
        }
        p1 = k;
        com/roidapp/baselib/c/p;
        JVM INSTR monitorexit ;
        return p1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        com/roidapp/baselib/c/p;
        JVM INSTR monitorenter ;
        k = null;
        com/roidapp/baselib/c/p;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
