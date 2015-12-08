// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            k, fi, fm, el, 
//            kk, bb, jy, eo, 
//            bt, kh, kb, ef, 
//            db, ex, aa, cy, 
//            fc, id, bq, hg, 
//            hj, gx, ay, cf, 
//            bz, cc, hd, iw, 
//            as, av, dt, cp, 
//            jf, ag, x, iz, 
//            im, ia, cm, gf, 
//            bw, ci, ap, ks, 
//            bn, o, cv, hp, 
//            hx, dq, ff, ig, 
//            fx, eu, dn, kq, 
//            bh, fu, jk, l, 
//            bk, dz, ga, jn, 
//            am, cs, ha, r, 
//            ir, gs, jc, dh, 
//            gj, jv, ke, js, 
//            kv, dw, kn, fr, 
//            ec, de, fp, gp, 
//            aj, hm, ij, u, 
//            gc, be, er, gm, 
//            hu, ip, ad, ei, 
//            gu, dk, hr, iu, 
//            ez, jq

final class j
{

    static final k a[];
    static final k b[];
    private static Set c;
    private static Set d;

    static Set a()
    {
        if (c == null)
        {
            c = a(b);
        }
        return c;
    }

    private static Set a(k ak[])
    {
        HashSet hashset = new HashSet(ak.length);
        int i1 = ak.length;
        for (int i = 0; i < i1; i++)
        {
            hashset.add(ak[i]);
        }

        return hashset;
    }

    static Set b()
    {
        if (d == null)
        {
            d = a(a);
        }
        return d;
    }

    static 
    {
        a = (new k[] {
            fi.a[0], fm.a[0], el.a[0], kk.a[0], bb.a[0], jy.a[0], eo.a[0], bt.a[0], kh.a[0], kb.a[0], 
            ef.a[0], db.a[0], ex.a[0], aa.a[0], cy.a[0], fc.a[0], id.a[0], bq.a[0], hg.a[0], hj.a[0], 
            gx.a[0], ay.a[0], cf.a[0], bz.a[0], cc.a[0], hd.a[0], iw.a[0], as.a[0], av.a[0], dt.a[0], 
            cp.a[0], jf.a[0], jf.a[1], ag.a[0], x.a[0], iz.a[0], im.a[0], ia.a[0], cm.a[0], gf.a[0], 
            gf.a[1], bw.a[0], ci.a[0], ap.a[0], ks.a[0], bn.a[0], o.a[0], cv.a[0], hp.a[0], hx.a[0], 
            dq.a[0], ff.a[0], ig.a[0], fx.a[0], eu.a[0], dn.a[0], kq.a[0], bh.a[0], fu.a[0], jk.a[0], 
            l.a[0], bk.a[0], dz.a[0], ga.a[0], jn.a[0], am.a[0], cs.a[0], ha.a[0], r.a[0], ir.a[0], 
            gs.a[0], jc.a[0], dh.a[0], gj.a[0], jv.a[0], ke.a[0], js.a[0], kv.a[0], dw.a[0], kn.a[0], 
            fr.a[0], ec.a[0], de.a[0], fp.a[0], gp.a[0], aj.a[0], hm.a[0], ij.a[0], u.a[0], gc.a[0], 
            be.a[0], er.a[0], gm.a[0], hu.a[0], ip.a[0], ad.a[0], ei.a[0], gu.a[0], dk.a[0], hr.a[0], 
            iu.a[0], ez.a[0]
        });
        k ak[][] = new k[101][];
        ak[0] = fi.a;
        ak[1] = fm.a;
        ak[2] = jq.a;
        ak[3] = el.a;
        ak[4] = kk.a;
        ak[5] = bb.a;
        ak[6] = jy.a;
        ak[7] = eo.a;
        ak[8] = bt.a;
        ak[9] = kh.a;
        ak[10] = kb.a;
        ak[11] = ef.a;
        ak[12] = db.a;
        ak[13] = ex.a;
        ak[14] = aa.a;
        ak[15] = cy.a;
        ak[16] = fc.a;
        ak[17] = id.a;
        ak[18] = bq.a;
        ak[19] = hg.a;
        ak[20] = hj.a;
        ak[21] = gx.a;
        ak[22] = ay.a;
        ak[23] = cf.a;
        ak[24] = bz.a;
        ak[25] = cc.a;
        ak[26] = hd.a;
        ak[27] = iw.a;
        ak[28] = as.a;
        ak[29] = av.a;
        ak[30] = dt.a;
        ak[31] = cp.a;
        ak[32] = jf.a;
        ak[33] = ag.a;
        ak[34] = x.a;
        ak[35] = iz.a;
        ak[36] = im.a;
        ak[37] = ia.a;
        ak[38] = cm.a;
        ak[39] = gf.a;
        ak[40] = bw.a;
        ak[41] = ci.a;
        ak[42] = ap.a;
        ak[43] = ks.a;
        ak[44] = bn.a;
        ak[45] = o.a;
        ak[46] = cv.a;
        ak[47] = hp.a;
        ak[48] = hx.a;
        ak[49] = dq.a;
        ak[50] = ff.a;
        ak[51] = ig.a;
        ak[52] = fx.a;
        ak[53] = eu.a;
        ak[54] = dn.a;
        ak[55] = kq.a;
        ak[56] = bh.a;
        ak[57] = fu.a;
        ak[58] = jk.a;
        ak[59] = l.a;
        ak[60] = bk.a;
        ak[61] = dz.a;
        ak[62] = ga.a;
        ak[63] = jn.a;
        ak[64] = am.a;
        ak[65] = cs.a;
        ak[66] = ha.a;
        ak[67] = r.a;
        ak[68] = ir.a;
        ak[69] = gs.a;
        ak[70] = jc.a;
        ak[71] = dh.a;
        ak[72] = gj.a;
        ak[73] = jv.a;
        ak[74] = ke.a;
        ak[75] = js.a;
        ak[76] = kv.a;
        ak[77] = dw.a;
        ak[78] = kn.a;
        ak[79] = fr.a;
        ak[80] = ec.a;
        ak[81] = de.a;
        ak[82] = fp.a;
        ak[83] = gp.a;
        ak[84] = aj.a;
        ak[85] = hm.a;
        ak[86] = ij.a;
        ak[87] = u.a;
        ak[88] = gc.a;
        ak[89] = be.a;
        ak[90] = er.a;
        ak[91] = gm.a;
        ak[92] = hu.a;
        ak[93] = ip.a;
        ak[94] = ad.a;
        ak[95] = ei.a;
        ak[96] = gu.a;
        ak[97] = dk.a;
        ak[98] = hr.a;
        ak[99] = iu.a;
        ak[100] = ez.a;
        int i = 0;
        int i1 = 0;
        for (; i < 101; i++)
        {
            i1 += ak[i].length;
        }

        k ak1[] = new k[i1];
        i = 0;
        for (int j1 = 0; j1 < 101; j1++)
        {
            k ak2[] = ak[j1];
            for (int k1 = 0; k1 < ak2.length;)
            {
                ak1[i] = ak2[k1];
                k1++;
                i++;
            }

        }

        b = ak1;
    }
}
