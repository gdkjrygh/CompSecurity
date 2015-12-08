// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;

// Referenced classes of package b.a:
//            gb, nm, mu, hh, 
//            pe, hb, hi, my, 
//            nl, nh, nj, mt, 
//            nd, gz, gl, nb, 
//            ph, hc, hl, go, 
//            ox, pn, pf, ga

public final class hg
{

    public final nm a;
    public final int b = 1;
    public final gb c;
    public final hb d;
    final int e;
    public int f[];
    final int g;
    boolean h;
    private final ga i;
    private final nd j = null;
    private final hi k;

    public hg(nm nm1, int l, ga ga)
    {
        boolean flag = false;
        super();
        i = ga;
        a = nm1;
        c = new gb(nm1);
        g = l;
        f = null;
        boolean aflag[] = new boolean[1];
        aflag[0] = true;
        int i1 = nm1.a.b();
        nm1.a.a(new hh(aflag, i1, l));
        h = aflag[0];
        nm1 = nm1.a;
        i1 = ((pe) (nm1)).K.length;
        int j1 = nm1.c();
        int k1 = nm1.b();
        if (h)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = g;
        }
        e = l + k1;
        d = new hb(ga, i1 * 3 + j1, i1 * 3, e);
        k = new hi(this, d);
    }

    static nj a(my my1)
    {
        return a(my1, my1.d);
    }

    static nj a(my my1, nh nh1)
    {
        nj nj1;
        boolean flag;
        nj1 = my1.e;
        switch (my1.b.a)
        {
        case 15: // '\017'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        default:
            flag = false;
            break;

        case 14: // '\016'
        case 16: // '\020'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            break MISSING_BLOCK_LABEL_120;
        }
_L1:
        my1 = nj1;
        if (flag)
        {
            my1 = nj1;
            if (((pe) (nj1)).K.length == 2)
            {
                my1 = nj1;
                if (nh1.e() == nj1.b(1).e())
                {
                    my1 = nj.a(nj1.b(1), nj1.b(0));
                }
            }
        }
        if (nh1 == null)
        {
            return my1;
        } else
        {
            return my1.b(nh1);
        }
        flag = true;
          goto _L1
    }

    public final void a()
    {
        mu mu1;
        int ai[];
        int l;
        int i2;
        mu1 = a.a;
        ai = f;
        i2 = ai.length;
        l = 0;
_L9:
        if (l >= i2) goto _L2; else goto _L1
_L1:
        Object obj;
        mt mt1;
        int i1;
        int j2;
        i1 = l + 1;
        gh gh;
        if (i1 == ai.length)
        {
            i1 = -1;
        } else
        {
            i1 = ai[i1];
        }
        mt1 = mu1.b(ai[l]);
        gh = c.a[mt1.a];
        d.a(gh);
        if (j != null)
        {
            nd nd1 = j;
            obj = nd1.a(mt1.a);
            if (obj == null)
            {
                obj = nd1.a;
            }
            d.a(new gz(((gl) (gh)).e, ((nk) (obj))));
        }
        obj = k;
        gh = c.a(mt1);
        obj.a = mt1;
        obj.b = gh;
        mt1.b.a(k);
        d.a(c.b(mt1));
        j2 = mt1.d;
        obj = mt1.b.b();
        if (j2 < 0 || j2 == i1) goto _L4; else goto _L3
_L3:
        if (((my) (obj)).b.c != 4) goto _L6; else goto _L5
_L5:
        int k1;
        if (mt1.c.a() != 2)
        {
            throw new UnsupportedOperationException("block doesn't have exactly two successors");
        }
        int l1 = mt1.c.a(0);
        k1 = l1;
        if (l1 == mt1.d)
        {
            k1 = mt1.c.a(1);
        }
        if (k1 != i1) goto _L6; else goto _L7
_L7:
        Object obj1 = d;
        obj = c.a[j2];
        obj1 = ((hb) (obj1)).a;
        int j1 = ((hc) (obj1)).b.size() - 1 - 1;
        hl hl1;
        try
        {
            hl1 = (hl)((hc) (obj1)).b.get(j1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException("too few instructions");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException("non-reversible instruction");
        }
        ((hc) (obj1)).b.set(j1, hl1.a(((gh) (obj))));
_L4:
        l++;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new hl(go.P, ((my) (obj)).c, nj.a, c.a[j2]);
        d.a(((gl) (obj)));
        if (true) goto _L4; else goto _L2
_L2:
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void b()
    {
        mu mu1;
        int ai[];
        int ai1[];
        int ai2[];
        int l;
        int i1;
        int k2;
        mu1 = a.a;
        k2 = ((pe) (mu1)).K.length;
        l = mu1.d();
        ai = ox.a(l);
        ai1 = ox.a(l);
        for (l = 0; l < k2; l++)
        {
            ox.b(ai, mu1.a(l).a);
        }

        ai2 = new int[k2];
        i1 = a.b;
        l = 0;
_L23:
        if (i1 == -1) goto _L2; else goto _L1
_L1:
        Object obj;
        int l1;
        int i3;
        nm nm1 = a;
        if (nm1.d == null)
        {
            int l2 = nm1.a.d();
            ph aph[] = new ph[l2];
            ph ph4 = new ph(10);
            int j3 = ((pe) (nm1.a)).K.length;
            int j1 = 0;
            while (j1 < j3) 
            {
                mt mt1 = nm1.a.a(j1);
                int k3 = mt1.a;
                ph ph5 = mt1.c;
                int l3 = ph5.a();
                if (l3 == 0)
                {
                    ph4.b(k3);
                } else
                {
                    int i2 = 0;
                    while (i2 < l3) 
                    {
                        int i4 = ph5.a(i2);
                        ph ph3 = aph[i4];
                        ph ph1 = ph3;
                        if (ph3 == null)
                        {
                            ph1 = new ph(10);
                            aph[i4] = ph1;
                        }
                        ph1.b(k3);
                        i2++;
                    }
                }
                j1++;
            }
            for (int k1 = 0; k1 < l2; k1++)
            {
                ph ph2 = aph[k1];
                if (ph2 != null)
                {
                    ph2.b();
                    ph2.L = false;
                }
            }

            ph4.b();
            ph4.L = false;
            if (aph[nm1.b] == null)
            {
                aph[nm1.b] = ph.a;
            }
            nm1.c = aph;
            nm1.d = ph4;
        }
        obj = nm1.c[i1];
        if (obj == null)
        {
            throw new RuntimeException((new StringBuilder("no such block: ")).append(pf.b(i1)).toString());
        }
        i3 = ((ph) (obj)).a();
        l1 = 0;
_L6:
        if (l1 >= i3) goto _L4; else goto _L3
_L3:
        int j2 = ((ph) (obj)).a(l1);
        if (ox.a(ai1, j2)) goto _L4; else goto _L5
_L5:
label0:
        {
            if (!ox.a(ai, j2) || mu1.b(j2).d != i1)
            {
                break label0;
            }
            ox.b(ai1, j2);
            i1 = j2;
        }
          goto _L1
        l1++;
          goto _L6
_L13:
        obj = null;
_L15:
        i1 = l1;
        if (obj == null) goto _L8; else goto _L7
_L7:
        mt mt2;
        l = ((mt) (obj)).a;
        i1 = mt2.d;
        if (!ox.a(ai, l)) goto _L10; else goto _L9
_L9:
        i1 = l1;
        if (l == -1) goto _L8; else goto _L11
_L11:
        ox.c(ai, l);
        ox.c(ai1, l);
        ai2[l1] = l;
        l1++;
        mt2 = mu1.b(l);
        l = mt2.d;
        obj = mt2.c;
        ((ph) (obj)).a();
        JVM INSTR tableswitch 0 1: default 588
    //                   0 476
    //                   1 604;
           goto _L12 _L13 _L14
_L12:
        if (l != -1)
        {
            obj = mu1.b(l);
        } else
        {
            obj = mu1.b(((ph) (obj)).a(0));
        }
          goto _L15
_L14:
        obj = mu1.b(((ph) (obj)).a(0));
          goto _L15
_L10:
        if (i1 == l || i1 < 0 || !ox.a(ai, i1)) goto _L17; else goto _L16
_L16:
        l = i1;
          goto _L9
_L17:
        obj = mt2.c;
        j2 = ((ph) (obj)).a();
        l = 0;
_L22:
        if (l >= j2) goto _L19; else goto _L18
_L18:
        i1 = ((ph) (obj)).a(l);
        if (!ox.a(ai, i1)) goto _L21; else goto _L20
_L20:
        l = i1;
          goto _L9
_L21:
        l++;
          goto _L22
_L19:
        l = -1;
          goto _L9
_L8:
        l1 = ox.a(ai);
        l = i1;
        i1 = l1;
          goto _L23
_L2:
        if (l != k2)
        {
            throw new RuntimeException("shouldn't happen");
        } else
        {
            f = ai2;
            return;
        }
_L4:
        l1 = l;
        l = i1;
          goto _L9
    }
}
