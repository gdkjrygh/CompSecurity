// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

// Referenced classes of package b.a:
//            nn, go, my, gn, 
//            nl, nh, np, mw, 
//            ob, op, oo

public final class hf
{

    private static final HashMap a;

    public static gn a(my my1)
    {
        nl nl1;
        nl1 = my1.b;
        gn gn1 = (gn)a.get(nl1);
        if (gn1 != null)
        {
            return gn1;
        }
        nl1.a;
        JVM INSTR lookupswitch 15: default 156
    //                   4: 181
    //                   5: 643
    //                   41: 205
    //                   42: 209
    //                   45: 307
    //                   46: 475
    //                   47: 391
    //                   48: 559
    //                   49: 185
    //                   50: 189
    //                   51: 193
    //                   52: 197
    //                   53: 201
    //                   55: 217
    //                   57: 213;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        throw new RuntimeException((new StringBuilder("unknown rop: ")).append(nl1).toString());
_L2:
        return go.o;
_L10:
        return go.be;
_L11:
        return go.bb;
_L12:
        return go.bc;
_L13:
        return go.bd;
_L14:
        return go.bf;
_L4:
        return go.K;
_L5:
        return go.L;
_L16:
        return go.N;
_L15:
        my1 = my1.d;
        if (my1 == null)
        {
            return go.b;
        }
        switch (my1.c())
        {
        default:
            throw new RuntimeException("Unexpected basic type");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
            return go.l;

        case 4: // '\004'
        case 7: // '\007'
            return go.m;

        case 9: // '\t'
            return go.n;
        }
_L6:
        switch (((ob)((mw) ((np)my1)).a).c())
        {
        case 1: // '\001'
            return go.aC;

        case 2: // '\002'
            return go.aD;

        case 3: // '\003'
            return go.aE;

        case 8: // '\b'
            return go.aF;

        case 6: // '\006'
            return go.az;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        switch (((ob)((mw) ((np)my1)).a).c())
        {
        case 1: // '\001'
            return go.aJ;

        case 2: // '\002'
            return go.aK;

        case 3: // '\003'
            return go.aL;

        case 8: // '\b'
            return go.aM;

        case 6: // '\006'
            return go.aG;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        switch (((ob)((mw) ((np)my1)).a).c())
        {
        case 1: // '\001'
            return go.aQ;

        case 2: // '\002'
            return go.aR;

        case 3: // '\003'
            return go.aS;

        case 8: // '\b'
            return go.aT;

        case 6: // '\006'
            return go.aN;
        }
        if (true) goto _L1; else goto _L9
_L9:
        switch (((ob)((mw) ((np)my1)).a).c())
        {
        case 1: // '\001'
            return go.aX;

        case 2: // '\002'
            return go.aY;

        case 3: // '\003'
            return go.aZ;

        case 8: // '\b'
            return go.ba;

        case 6: // '\006'
            return go.aU;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        my1 = ((mw) ((np)my1)).a;
        if (my1 instanceof op)
        {
            return go.D;
        }
        if (my1 instanceof oo)
        {
            return go.B;
        }
        if (true) goto _L1; else goto _L17
_L17:
    }

    static 
    {
        HashMap hashmap = new HashMap(400);
        a = hashmap;
        hashmap.put(nn.a, go.b);
        a.put(nn.b, go.c);
        a.put(nn.c, go.f);
        a.put(nn.d, go.c);
        a.put(nn.e, go.f);
        a.put(nn.f, go.i);
        a.put(nn.h, go.c);
        a.put(nn.i, go.f);
        a.put(nn.j, go.c);
        a.put(nn.k, go.f);
        a.put(nn.l, go.i);
        a.put(nn.m, go.t);
        a.put(nn.n, go.x);
        a.put(nn.o, go.t);
        a.put(nn.p, go.x);
        a.put(nn.r, go.t);
        a.put(nn.s, go.P);
        a.put(nn.t, go.af);
        a.put(nn.u, go.ag);
        a.put(nn.v, go.ah);
        a.put(nn.w, go.ai);
        a.put(nn.x, go.ak);
        a.put(nn.y, go.aj);
        a.put(nn.z, go.af);
        a.put(nn.A, go.ag);
        a.put(nn.B, go.Z);
        a.put(nn.C, go.aa);
        a.put(nn.D, go.ab);
        a.put(nn.E, go.ac);
        a.put(nn.F, go.ae);
        a.put(nn.G, go.ad);
        a.put(nn.H, go.Z);
        a.put(nn.I, go.aa);
        a.put(nn.J, go.T);
        a.put(nn.K, go.cm);
        a.put(nn.L, go.cx);
        a.put(nn.M, go.cI);
        a.put(nn.N, go.cN);
        a.put(nn.O, go.cn);
        a.put(nn.P, go.cy);
        a.put(nn.Q, go.cJ);
        a.put(nn.R, go.cO);
        a.put(nn.S, go.co);
        a.put(nn.T, go.cz);
        a.put(nn.U, go.cK);
        a.put(nn.V, go.cP);
        a.put(nn.W, go.cp);
        a.put(nn.X, go.cA);
        a.put(nn.Y, go.cL);
        a.put(nn.Z, go.cQ);
        a.put(nn.aa, go.cq);
        a.put(nn.ab, go.cB);
        a.put(nn.ac, go.cM);
        a.put(nn.ad, go.cR);
        a.put(nn.ae, go.bl);
        a.put(nn.af, go.bn);
        a.put(nn.ag, go.bp);
        a.put(nn.ah, go.bq);
        a.put(nn.ai, go.cr);
        a.put(nn.aj, go.cC);
        a.put(nn.ak, go.cs);
        a.put(nn.al, go.cD);
        a.put(nn.am, go.ct);
        a.put(nn.an, go.cE);
        a.put(nn.ao, go.cu);
        a.put(nn.ap, go.cF);
        a.put(nn.aq, go.cv);
        a.put(nn.ar, go.cG);
        a.put(nn.as, go.cw);
        a.put(nn.at, go.cH);
        a.put(nn.au, go.bm);
        a.put(nn.av, go.bo);
        a.put(nn.aw, go.da);
        a.put(nn.aA, go.db);
        a.put(nn.aE, go.dc);
        a.put(nn.aI, go.dd);
        a.put(nn.aM, go.de);
        a.put(nn.aQ, go.df);
        a.put(nn.aS, go.dg);
        a.put(nn.aU, go.dh);
        a.put(nn.aW, go.di);
        a.put(nn.aY, go.dj);
        a.put(nn.ba, go.dk);
        a.put(nn.bc, go.Y);
        a.put(nn.bd, go.U);
        a.put(nn.be, go.W);
        a.put(nn.bf, go.V);
        a.put(nn.bg, go.X);
        a.put(nn.bh, go.bu);
        a.put(nn.bi, go.bx);
        a.put(nn.bj, go.bA);
        a.put(nn.bk, go.br);
        a.put(nn.bl, go.by);
        a.put(nn.bm, go.bB);
        a.put(nn.bn, go.bs);
        a.put(nn.bo, go.bv);
        a.put(nn.bp, go.bC);
        a.put(nn.bq, go.bt);
        a.put(nn.br, go.bw);
        a.put(nn.bs, go.bz);
        a.put(nn.bt, go.bD);
        a.put(nn.bu, go.bE);
        a.put(nn.bv, go.bF);
        a.put(nn.bw, go.p);
        a.put(nn.bx, go.q);
        a.put(nn.by, go.r);
        a.put(nn.bz, go.q);
        a.put(nn.bA, go.r);
        a.put(nn.bB, go.s);
        a.put(nn.bC, go.I);
        a.put(nn.bD, go.O);
        a.put(nn.bE, go.E);
        a.put(nn.bF, go.F);
        a.put(nn.bG, go.al);
        a.put(nn.bH, go.am);
        a.put(nn.bI, go.al);
        a.put(nn.bJ, go.am);
        a.put(nn.bK, go.an);
        a.put(nn.bL, go.ao);
        a.put(nn.bM, go.ap);
        a.put(nn.bN, go.aq);
        a.put(nn.bO, go.ar);
        a.put(nn.bP, go.as);
        a.put(nn.bQ, go.at);
        a.put(nn.bR, go.as);
        a.put(nn.bS, go.at);
        a.put(nn.bT, go.au);
        a.put(nn.bU, go.av);
        a.put(nn.bV, go.aw);
        a.put(nn.bW, go.ax);
        a.put(nn.bX, go.ay);
        a.put(nn.bY, go.J);
        a.put(nn.ch, go.G);
        a.put(nn.ci, go.H);
        a.put(nn.ck, go.aA);
        a.put(nn.cl, go.az);
        a.put(nn.cm, go.aA);
        a.put(nn.cn, go.aB);
        a.put(nn.ct, go.aO);
        a.put(nn.cu, go.aN);
        a.put(nn.cv, go.aO);
        a.put(nn.cw, go.aP);
        a.put(nn.cC, go.aH);
        a.put(nn.cD, go.aG);
        a.put(nn.cE, go.aH);
        a.put(nn.cF, go.aI);
        a.put(nn.cL, go.aV);
        a.put(nn.cM, go.aU);
        a.put(nn.cN, go.aV);
        a.put(nn.cO, go.aW);
    }
}
