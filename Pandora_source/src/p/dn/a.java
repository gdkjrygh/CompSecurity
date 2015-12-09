// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dn;

import java.io.UnsupportedEncodingException;
import p.dm.g;
import p.dm.m;

// Referenced classes of package p.dn:
//            b, d, e, j, 
//            k, l, o, p, 
//            q, m, n, r, 
//            s, t, u, v, 
//            w, x, y, aa, 
//            ab, ai, aj, ak, 
//            am, an, ao, ap, 
//            aq, ar, as, at, 
//            au, av, ax, ay, 
//            bf, bg, bh, bj, 
//            bk, bl, bm, bn, 
//            bo, bp, bq, br, 
//            bt, bs, bu, bv, 
//            bw, bx, by, bz, 
//            ca, cb, cc, cd, 
//            ce, cf, cg, ch, 
//            ci, ck, cl, cm, 
//            c, aw, cj, al, 
//            g, bi, ac, ad, 
//            z, ae, ag, h, 
//            az, ba, bb, bd, 
//            af, f, i, bc, 
//            ah, be

public abstract class a
    implements p.dl.a
{

    public static int a = 0;
    int b;
    byte c[];
    String d;
    public int e;
    int f;

    public a(int i1, String s1, int j1, byte abyte0[])
    {
        e = i1;
        d = s1;
        b = j1;
        c = abyte0;
        f = m.bn;
    }

    public static int a(byte abyte0[], int i1)
    {
        for (; i1 < abyte0.length; i1++)
        {
            if (abyte0[i1] == 0)
            {
                return i1;
            }
        }

        return -1;
    }

    public static String a(byte abyte0[])
    {
        return b(abyte0);
    }

    public static byte[] a(String s1, int i1)
    {
        return a(s1, i1, false);
    }

    public static byte[] a(String s1, int i1, boolean flag)
    {
        return a(s1, i1, flag, false);
    }

    public static byte[] a(String s1, int i1, boolean flag, boolean flag1)
    {
        if (s1 == null)
        {
            if (flag)
            {
                return new byte[1];
            } else
            {
                return new byte[0];
            }
        }
        Object obj;
        try
        {
            obj = s1.getBytes("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = s1.getBytes();
        }
        int k1;
        int i2;
        if (flag && s1.indexOf('\0') != -1)
        {
            s1 = new StringBuffer();
            for (int j1 = 0; j1 < obj.length; j1++)
            {
                if (obj[j1] != 0)
                {
                    s1.append((char)obj[j1]);
                }
            }

            s1 = s1.toString().getBytes();
        } else
        {
            s1 = ((String) (obj));
        }
        k1 = s1.length;
        i2 = k1;
        if (k1 >= i1)
        {
            int l1;
            if (flag)
            {
                l1 = i1 - 1;
            } else
            {
                l1 = i1;
            }
            do
            {
                i2 = l1;
                if (s1[l1 - 1] <= 127)
                {
                    break;
                }
                i2 = l1;
                if (l1 <= 0)
                {
                    break;
                }
                l1--;
            } while (true);
        }
        if (flag1)
        {
            i1 = i2 + 1;
        }
        obj = new byte[i1];
        System.arraycopy(s1, 0, obj, 0, i2);
        return ((byte []) (obj));
    }

    public static String b(byte abyte0[])
    {
        return m.d(abyte0);
    }

    public static a c(byte abyte0[])
    {
        int i1;
        if (abyte0 == null || abyte0.length == 0)
        {
            return null;
        }
        byte byte0 = abyte0[0];
        i1 = byte0;
        if (byte0 < 0)
        {
            i1 = byte0 & 0xff;
        }
        if (b.h != i1) goto _L2; else goto _L1
_L1:
        abyte0 = new b(abyte0);
        return abyte0;
        abyte0;
        m.c("Invalid Command, error parsing command ", abyte0);
_L4:
        return null;
_L2:
        if (d.h == i1)
        {
            return new d(abyte0);
        }
        if (e.h == i1)
        {
            return new e(abyte0);
        }
        if (j.h == i1)
        {
            return new j(abyte0);
        }
        if (k.h == i1)
        {
            return new k(abyte0);
        }
        if (l.h == i1)
        {
            return new l(abyte0);
        }
        if (o.h == i1)
        {
            return new o(abyte0);
        }
        if (p.h == i1)
        {
            return new p(abyte0);
        }
        if (q.h == i1)
        {
            return new q(abyte0);
        }
        if (m.h == i1)
        {
            return new p.dn.m(abyte0);
        }
        if (n.h == i1)
        {
            return new n(abyte0);
        }
        if (r.h == i1)
        {
            return new r(abyte0);
        }
        if (s.h == i1)
        {
            return new s(abyte0);
        }
        if (t.h == i1)
        {
            return new t(abyte0);
        }
        if (u.h == i1)
        {
            return new u(abyte0);
        }
        if (v.h == i1)
        {
            return new v(abyte0);
        }
        if (w.h == i1)
        {
            return new w(abyte0);
        }
        if (x.h == i1)
        {
            return new x(abyte0);
        }
        if (y.h == i1)
        {
            return new y(abyte0);
        }
        if (aa.h == i1)
        {
            return new aa(abyte0);
        }
        if (ab.h == i1)
        {
            return new ab(abyte0);
        }
        if (ai.h == i1)
        {
            return new ai(abyte0);
        }
        if (aj.h == i1)
        {
            return new aj(abyte0);
        }
        if (ak.h == i1)
        {
            return new ak(abyte0);
        }
        if (am.h == i1)
        {
            return new am(abyte0);
        }
        if (an.h == i1)
        {
            return new an(abyte0);
        }
        if (ao.h == i1)
        {
            return new ao(abyte0);
        }
        if (ap.h == i1)
        {
            return new ap(abyte0);
        }
        if (aq.h == i1)
        {
            return new aq(abyte0);
        }
        if (ar.h == i1)
        {
            return new ar(abyte0);
        }
        if (as.h == i1)
        {
            return new as(abyte0);
        }
        if (at.h == i1)
        {
            return new at(abyte0);
        }
        if (au.h == i1)
        {
            return new au(abyte0);
        }
        if (av.h == i1)
        {
            return new av(abyte0);
        }
        if (ax.h == i1)
        {
            return new ax(abyte0);
        }
        if (ay.h == i1)
        {
            return new ay(abyte0);
        }
        if (bf.h == i1)
        {
            return new bf(abyte0);
        }
        if (bg.h == i1)
        {
            return new bg(abyte0);
        }
        if (bh.h == i1)
        {
            return new bh(abyte0);
        }
        if (bj.h == i1)
        {
            return new bj(abyte0);
        }
        if (bk.h == i1)
        {
            return new bk(abyte0);
        }
        if (bl.h == i1)
        {
            return new bl(abyte0);
        }
        if (bm.h == i1)
        {
            return new bm(abyte0);
        }
        if (bn.h == i1)
        {
            return new bn(abyte0);
        }
        if (bo.h == i1)
        {
            return new bo(abyte0);
        }
        if (bp.h == i1)
        {
            return new bp(abyte0);
        }
        if (bq.h == i1)
        {
            return new bq(abyte0);
        }
        if (br.h == i1)
        {
            return new br(abyte0);
        }
        if (bt.bh == i1)
        {
            return new bt(abyte0);
        }
        if (bs.h == i1)
        {
            return new bs(abyte0);
        }
        if (bu.h == i1)
        {
            return new bu(abyte0);
        }
        if (bv.h == i1)
        {
            return new bv(abyte0);
        }
        if (bw.h == i1)
        {
            return new bw(abyte0);
        }
        if (bx.h == i1)
        {
            return new bx(abyte0);
        }
        if (by.h == i1)
        {
            return new by(abyte0);
        }
        if (bz.h == i1)
        {
            return new bz(abyte0);
        }
        if (ca.h == i1)
        {
            return new ca(abyte0);
        }
        if (cb.h == i1)
        {
            return new cb(abyte0);
        }
        if (cc.h == i1)
        {
            return new cc(abyte0);
        }
        if (cd.h == i1)
        {
            return new cd(abyte0);
        }
        if (ce.h == i1)
        {
            return new ce(abyte0);
        }
        if (cf.h == i1)
        {
            return new cf(abyte0);
        }
        if (cg.h == i1)
        {
            return new cg(abyte0);
        }
        if (ch.h == i1)
        {
            return new ch(abyte0);
        }
        if (ci.h == i1)
        {
            return new ci(abyte0);
        }
        if (ck.h == i1)
        {
            return new ck(abyte0);
        }
        if (cl.h == i1)
        {
            return new cl(abyte0);
        }
        if (cm.h == i1)
        {
            return new cm(abyte0);
        }
        if (c.h == i1)
        {
            return new c(abyte0);
        }
        if (aw.h == i1)
        {
            return new aw(abyte0);
        }
        if (cj.h == i1)
        {
            return new cj(abyte0);
        }
        if (al.h == i1)
        {
            return new al(abyte0);
        }
        if (g.h == i1)
        {
            return new p.dn.g(abyte0);
        }
        if (bi.h == i1)
        {
            return new bi(abyte0);
        }
        if (ac.h == i1)
        {
            return new ac(abyte0);
        }
        if (ad.h == i1)
        {
            return new ad(abyte0);
        }
        if (z.h == i1)
        {
            return new z(abyte0);
        }
        if (ae.h == i1)
        {
            return new ae(abyte0);
        }
        if (ag.h == i1)
        {
            return new ag(abyte0);
        }
        if (h.h == i1)
        {
            return new h(abyte0);
        }
        if (az.h == i1)
        {
            return new az(abyte0);
        }
        if (ba.h == i1)
        {
            return new ba(abyte0);
        }
        if (bb.h == i1)
        {
            return new bb(abyte0);
        }
        if (bd.h == i1)
        {
            return new bd(abyte0);
        }
        if (af.h == i1)
        {
            return new af(abyte0);
        }
        if (f.h == i1)
        {
            return new f(abyte0);
        }
        if (i.h == i1)
        {
            return new i(abyte0);
        }
        if (bc.h == i1)
        {
            return new bc(abyte0);
        }
        if (ah.h == i1)
        {
            return new ah(abyte0);
        }
        if (be.h != i1) goto _L4; else goto _L3
_L3:
        abyte0 = new be(abyte0);
        return abyte0;
    }

    public String a()
    {
        return d;
    }

    public String a(g g1)
    {
        if (g1 == g.c)
        {
            return a();
        }
        if (g1 == g.d)
        {
            return (new StringBuilder()).append("{").append(a(c)).append("}").toString();
        } else
        {
            return (new StringBuilder()).append(a()).append("[").append(a(c)).append("]").toString();
        }
    }

    protected void b(byte abyte0[], int i1)
    {
label0:
        {
            if (m.bk && m.bl == -1)
            {
                if (abyte0 == null || abyte0.length != i1)
                {
                    break label0;
                }
                f = 1;
                m.bl = 1;
                m.bn = 1;
            }
            return;
        }
        f = 3;
        m.bl = 3;
        m.bn = 3;
    }

    public byte[] b()
    {
        return c;
    }

    public String toString()
    {
        return a(g.c);
    }

}
