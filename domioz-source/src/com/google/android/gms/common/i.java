// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common:
//            j, bf, bi, au, 
//            dn, er, de, ax, 
//            fa, dk, dh, ar, 
//            ai, ba, dz, af, 
//            bc, ck, ex, bv, 
//            by, bp, eo, q, 
//            k, n, bs, cr, 
//            ei, el, ao, z, 
//            cx, ec, dw, cu, 
//            co, cg, w, bl, 
//            fd, t, ef, dq, 
//            eu, dt, ac, cb, 
//            cd, al, dc

final class i
{

    static final j a[];
    static final j b[];
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

    private static Set a(j aj[])
    {
        HashSet hashset = new HashSet(aj.length);
        int i1 = aj.length;
        for (int l = 0; l < i1; l++)
        {
            hashset.add(aj[l]);
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
        a = (new j[] {
            bf.a[0], bi.a[0], au.a[0], dn.a[0], er.a[0], de.a[0], ax.a[0], fa.a[0], dk.a[0], dh.a[0], 
            ar.a[0], ai.a[0], ba.a[0], dz.a[0], af.a[0], bc.a[0], ck.a[0], ex.a[0], bv.a[0], by.a[0], 
            bp.a[0], eo.a[0], q.a[0], k.a[0], n.a[0], bs.a[0], cr.a[0], ei.a[0], el.a[0], ao.a[0], 
            z.a[0], cx.a[0], cx.a[1], ec.a[0], dw.a[0], cu.a[0], co.a[0], cg.a[0], w.a[0], bl.a[0], 
            bl.a[1], fd.a[0], t.a[0], ef.a[0], dq.a[0], eu.a[0], dt.a[0], ac.a[0], cb.a[0], cd.a[0], 
            al.a[0]
        });
        j aj[][] = new j[50][];
        aj[0] = bf.a;
        aj[1] = bi.a;
        aj[2] = dc.a;
        aj[3] = au.a;
        aj[4] = dn.a;
        aj[5] = er.a;
        aj[6] = de.a;
        aj[7] = ax.a;
        aj[8] = fa.a;
        aj[9] = dk.a;
        aj[10] = dh.a;
        aj[11] = ar.a;
        aj[12] = ai.a;
        aj[13] = ba.a;
        aj[14] = dz.a;
        aj[15] = af.a;
        aj[16] = bc.a;
        aj[17] = ck.a;
        aj[18] = ex.a;
        aj[19] = bv.a;
        aj[20] = by.a;
        aj[21] = bp.a;
        aj[22] = eo.a;
        aj[23] = q.a;
        aj[24] = k.a;
        aj[25] = n.a;
        aj[26] = bs.a;
        aj[27] = cr.a;
        aj[28] = ei.a;
        aj[29] = el.a;
        aj[30] = ao.a;
        aj[31] = z.a;
        aj[32] = cx.a;
        aj[33] = ec.a;
        aj[34] = dw.a;
        aj[35] = cu.a;
        aj[36] = co.a;
        aj[37] = cg.a;
        aj[38] = w.a;
        aj[39] = bl.a;
        aj[40] = fd.a;
        aj[41] = t.a;
        aj[42] = ef.a;
        aj[43] = dq.a;
        aj[44] = eu.a;
        aj[45] = dt.a;
        aj[46] = ac.a;
        aj[47] = cb.a;
        aj[48] = cd.a;
        aj[49] = al.a;
        int l = 0;
        int i1 = 0;
        for (; l < 50; l++)
        {
            i1 += aj[l].length;
        }

        j aj1[] = new j[i1];
        l = 0;
        for (int j1 = 0; j1 < 50; j1++)
        {
            j aj2[] = aj[j1];
            for (int k1 = 0; k1 < aj2.length;)
            {
                aj1[l] = aj2[k1];
                k1++;
                l++;
            }

        }

        b = aj1;
    }
}
