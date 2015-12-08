// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public final class aca
{

    private static final HashMap a;

    public static abN a(adN adn)
    {
        adW adw;
        adw = adn.b;
        abN abn = (abN)a.get(adw);
        if (abn != null)
        {
            return abn;
        }
        adw.a;
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
        throw new RuntimeException((new StringBuilder("unknown rop: ")).append(adw).toString());
_L2:
        return abO.o;
_L10:
        return abO.aT;
_L11:
        return abO.aQ;
_L12:
        return abO.aR;
_L13:
        return abO.aS;
_L14:
        return abO.aU;
_L4:
        return abO.D;
_L5:
        return abO.E;
_L16:
        return abO.F;
_L15:
        adn = adn.d;
        if (adn == null)
        {
            return abO.b;
        }
        switch (adn.c())
        {
        default:
            throw new RuntimeException("Unexpected basic type");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
            return abO.l;

        case 4: // '\004'
        case 7: // '\007'
            return abO.m;

        case 9: // '\t'
            return abO.n;
        }
_L6:
        switch (((ael)((adL) ((aea)adn)).a).b().I)
        {
        case 1: // '\001'
            return abO.ar;

        case 2: // '\002'
            return abO.as;

        case 3: // '\003'
            return abO.at;

        case 8: // '\b'
            return abO.au;

        case 6: // '\006'
            return abO.ao;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        switch (((ael)((adL) ((aea)adn)).a).b().I)
        {
        case 1: // '\001'
            return abO.ay;

        case 2: // '\002'
            return abO.az;

        case 3: // '\003'
            return abO.aA;

        case 8: // '\b'
            return abO.aB;

        case 6: // '\006'
            return abO.av;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        switch (((ael)((adL) ((aea)adn)).a).b().I)
        {
        case 1: // '\001'
            return abO.aF;

        case 2: // '\002'
            return abO.aG;

        case 3: // '\003'
            return abO.aH;

        case 8: // '\b'
            return abO.aI;

        case 6: // '\006'
            return abO.aC;
        }
        if (true) goto _L1; else goto _L9
_L9:
        switch (((ael)((adL) ((aea)adn)).a).b().I)
        {
        case 1: // '\001'
            return abO.aM;

        case 2: // '\002'
            return abO.aN;

        case 3: // '\003'
            return abO.aO;

        case 8: // '\b'
            return abO.aP;

        case 6: // '\006'
            return abO.aJ;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        adn = ((adL) ((aea)adn)).a;
        if (adn instanceof aez)
        {
            return abO.w;
        }
        if (adn instanceof aey)
        {
            return abO.v;
        }
        if (true) goto _L1; else goto _L17
_L17:
    }

    static 
    {
        HashMap hashmap = new HashMap(400);
        a = hashmap;
        hashmap.put(adY.a, abO.b);
        a.put(adY.b, abO.c);
        a.put(adY.c, abO.f);
        a.put(adY.d, abO.c);
        a.put(adY.e, abO.f);
        a.put(adY.f, abO.i);
        a.put(adY.g, abO.c);
        a.put(adY.h, abO.f);
        a.put(adY.i, abO.c);
        a.put(adY.j, abO.f);
        a.put(adY.k, abO.i);
        a.put(adY.l, abO.t);
        a.put(adY.m, abO.u);
        a.put(adY.n, abO.t);
        a.put(adY.o, abO.u);
        a.put(adY.p, abO.t);
        a.put(adY.q, abO.H);
        a.put(adY.r, abO.U);
        a.put(adY.s, abO.V);
        a.put(adY.t, abO.W);
        a.put(adY.u, abO.X);
        a.put(adY.v, abO.Z);
        a.put(adY.w, abO.Y);
        a.put(adY.x, abO.U);
        a.put(adY.y, abO.V);
        a.put(adY.z, abO.O);
        a.put(adY.A, abO.P);
        a.put(adY.B, abO.Q);
        a.put(adY.C, abO.R);
        a.put(adY.D, abO.T);
        a.put(adY.E, abO.S);
        a.put(adY.F, abO.O);
        a.put(adY.G, abO.P);
        a.put(adY.H, abO.I);
        a.put(adY.I, abO.bq);
        a.put(adY.J, abO.bB);
        a.put(adY.K, abO.bM);
        a.put(adY.L, abO.bR);
        a.put(adY.M, abO.br);
        a.put(adY.N, abO.bC);
        a.put(adY.O, abO.bN);
        a.put(adY.P, abO.bS);
        a.put(adY.Q, abO.bs);
        a.put(adY.R, abO.bD);
        a.put(adY.S, abO.bO);
        a.put(adY.T, abO.bT);
        a.put(adY.U, abO.bt);
        a.put(adY.V, abO.bE);
        a.put(adY.W, abO.bP);
        a.put(adY.X, abO.bU);
        a.put(adY.Y, abO.bu);
        a.put(adY.Z, abO.bF);
        a.put(adY.aa, abO.bQ);
        a.put(adY.ab, abO.bV);
        a.put(adY.ac, abO.aV);
        a.put(adY.ad, abO.aX);
        a.put(adY.ae, abO.aZ);
        a.put(adY.af, abO.ba);
        a.put(adY.ag, abO.bv);
        a.put(adY.ah, abO.bG);
        a.put(adY.ai, abO.bw);
        a.put(adY.aj, abO.bH);
        a.put(adY.ak, abO.bx);
        a.put(adY.al, abO.bI);
        a.put(adY.am, abO.by);
        a.put(adY.an, abO.bJ);
        a.put(adY.ao, abO.bz);
        a.put(adY.ap, abO.bK);
        a.put(adY.aq, abO.bA);
        a.put(adY.ar, abO.bL);
        a.put(adY.as, abO.aW);
        a.put(adY.at, abO.aY);
        a.put(adY.au, abO.bW);
        a.put(adY.av, abO.bX);
        a.put(adY.aw, abO.bY);
        a.put(adY.ax, abO.bZ);
        a.put(adY.ay, abO.ca);
        a.put(adY.az, abO.cb);
        a.put(adY.aA, abO.cc);
        a.put(adY.aB, abO.cd);
        a.put(adY.aC, abO.ce);
        a.put(adY.aD, abO.cf);
        a.put(adY.aE, abO.cg);
        a.put(adY.aF, abO.N);
        a.put(adY.aG, abO.J);
        a.put(adY.aH, abO.L);
        a.put(adY.aI, abO.K);
        a.put(adY.aJ, abO.M);
        a.put(adY.aK, abO.be);
        a.put(adY.aL, abO.bh);
        a.put(adY.aM, abO.bk);
        a.put(adY.aN, abO.bb);
        a.put(adY.aO, abO.bi);
        a.put(adY.aP, abO.bl);
        a.put(adY.aQ, abO.bc);
        a.put(adY.aR, abO.bf);
        a.put(adY.aS, abO.bm);
        a.put(adY.aT, abO.bd);
        a.put(adY.aU, abO.bg);
        a.put(adY.aV, abO.bj);
        a.put(adY.aW, abO.bn);
        a.put(adY.aX, abO.bo);
        a.put(adY.aY, abO.bp);
        a.put(adY.aZ, abO.p);
        a.put(adY.ba, abO.q);
        a.put(adY.bb, abO.r);
        a.put(adY.bc, abO.q);
        a.put(adY.bd, abO.r);
        a.put(adY.be, abO.s);
        a.put(adY.bf, abO.B);
        a.put(adY.bg, abO.G);
        a.put(adY.bh, abO.x);
        a.put(adY.bi, abO.y);
        a.put(adY.bj, abO.aa);
        a.put(adY.bk, abO.ab);
        a.put(adY.bl, abO.aa);
        a.put(adY.bm, abO.ab);
        a.put(adY.bn, abO.ac);
        a.put(adY.bo, abO.ad);
        a.put(adY.bp, abO.ae);
        a.put(adY.bq, abO.af);
        a.put(adY.br, abO.ag);
        a.put(adY.bs, abO.ah);
        a.put(adY.bt, abO.ai);
        a.put(adY.bu, abO.ah);
        a.put(adY.bv, abO.ai);
        a.put(adY.bw, abO.aj);
        a.put(adY.bx, abO.ak);
        a.put(adY.by, abO.al);
        a.put(adY.bz, abO.am);
        a.put(adY.bA, abO.an);
        a.put(adY.bB, abO.C);
        a.put(adY.bC, abO.z);
        a.put(adY.bD, abO.A);
        a.put(adY.bE, abO.ap);
        a.put(adY.bF, abO.ao);
        a.put(adY.bG, abO.ap);
        a.put(adY.bH, abO.aq);
        a.put(adY.bI, abO.aD);
        a.put(adY.bJ, abO.aC);
        a.put(adY.bK, abO.aD);
        a.put(adY.bL, abO.aE);
        a.put(adY.bM, abO.aw);
        a.put(adY.bN, abO.av);
        a.put(adY.bO, abO.aw);
        a.put(adY.bP, abO.ax);
        a.put(adY.bQ, abO.aK);
        a.put(adY.bR, abO.aJ);
        a.put(adY.bS, abO.aK);
        a.put(adY.bT, abO.aL);
    }
}
