// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            no, os, fs, fx, 
//            fz, fw, fv, fy, 
//            nj, od, nf, nn, 
//            ng, ot, np, nl, 
//            fp, my, mu, nb, 
//            pn, ph, mt

public final class fh
{

    public fv a;
    final List b = new ArrayList();
    public no c;
    public os d;
    private final fx e;
    private final List f = new ArrayList();
    private boolean g;
    private final fw h;
    private final List i = new ArrayList();
    private final List j = new ArrayList();
    private final List k = new ArrayList();

    fh(fs fs1)
    {
        boolean flag = false;
        super();
        c = no.a;
        d = os.a;
        e = fs1.a;
        int l;
        int i1;
        if ((fs1.b & 8) != 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            h = null;
        } else
        {
            h = fw.a(this, e.a);
            b.add(h);
        }
        fs1 = e.d.a;
        i1 = fs1.length;
        for (l = ((flag) ? 1 : 0); l < i1; l++)
        {
            fy fy1 = fs1[l];
            b.add(fw.a(this, fy1));
        }

        a = new fv();
        a(a);
        a.c = true;
    }

    private static fw a(fw fw1, fy fy1)
    {
        if (!fw1.a.equals(fy1))
        {
            throw new IllegalArgumentException((new StringBuilder("requested ")).append(fy1).append(" but was ").append(fw1.a).toString());
        } else
        {
            return fw1;
        }
    }

    private static nj a(fw fw1, fw afw[])
    {
        boolean flag = false;
        nj nj1;
        int l;
        int i1;
        if (fw1 != null)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        nj1 = new nj(afw.length + l);
        i1 = ((flag) ? 1 : 0);
        if (fw1 != null)
        {
            nj1.a(0, fw1.b());
            i1 = ((flag) ? 1 : 0);
        }
        for (; i1 < afw.length; i1++)
        {
            nj1.a(i1 + l, afw[i1].b());
        }

        return nj1;
    }

    private void a(fv fv1, List list)
    {
        fv fv2 = new fv();
        a(fv2);
        a.e = fv2;
        a.f = fv1;
        a.d = list;
        a = fv2;
        a.c = true;
    }

    public final fw a(int l, fy fy1)
    {
        int i1 = l;
        if (h != null)
        {
            i1 = l + 1;
        }
        return a((fw)b.get(i1), fy1);
    }

    public final fw a(fy fy1)
    {
        if (g)
        {
            throw new IllegalStateException("Cannot allocate locals after adding instructions");
        } else
        {
            fy1 = fw.a(this, fy1);
            i.add(fy1);
            return fy1;
        }
    }

    final void a()
    {
        if (g)
        {
            throw new AssertionError();
        }
        g = true;
        Object obj = i.iterator();
        int l;
        for (l = 0; ((Iterator) (obj)).hasNext(); l = ((fw)((Iterator) (obj)).next()).a(l) + l) { }
        obj = new ArrayList();
        Iterator iterator = b.iterator();
        int j1;
        for (int i1 = l; iterator.hasNext(); i1 += j1)
        {
            fw fw1 = (fw)iterator.next();
            od od1 = od.a(i1 - l);
            j1 = fw1.a(i1);
            ((List) (obj)).add(new nf(nn.a(fw1.a.m), c, fw1.b(), nj.a, od1));
        }

        ((fv)f.get(0)).a.addAll(0, ((java.util.Collection) (obj)));
    }

    public final void a(fv fv1)
    {
        if (fv1.b == this)
        {
            return;
        }
        if (fv1.b != null)
        {
            throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
        } else
        {
            fv1.b = this;
            f.add(fv1);
            return;
        }
    }

    public final void a(fw fw1)
    {
        if (!fw1.a.equals(e.b))
        {
            throw new IllegalArgumentException((new StringBuilder("declared ")).append(e.b).append(" but returned ").append(fw1.a).toString());
        } else
        {
            a(((my) (new ng(nn.e(fw1.a.m), c, null, nj.a(fw1.b())))), ((fv) (null)));
            return;
        }
    }

    public final void a(fw fw1, fw fw2)
    {
        Object obj;
        ot ot1;
        if (fw2.a.m.i())
        {
            a(((my) (new np(nn.ch, c, nj.a(fw2.b()), d, fw1.a.n))), ((fv) (null)));
            a(fw1, true);
            return;
        }
        obj = fw2.a.m;
        ot1 = fw1.a.m;
        if (((ot) (obj)).c() != 6) goto _L2; else goto _L1
_L1:
        ot1.c();
        JVM INSTR lookupswitch 3: default 124
    //                   2: 171
    //                   3: 164
    //                   8: 157;
           goto _L2 _L3 _L4 _L5
_L2:
        obj = nn.a(ot1, ((ou) (obj)));
_L7:
        a(((my) (new ng(((nl) (obj)), c, fw1.b(), fw2.b()))), ((fv) (null)));
        return;
_L5:
        obj = nn.bv;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = nn.bu;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = nn.bt;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(fw fw1, Object obj)
    {
        nl nl1;
        if (obj == null)
        {
            nl1 = nn.r;
        } else
        {
            nl1 = nn.d(fw1.a.m);
        }
        if (nl1.c == 1)
        {
            a(((my) (new nf(nl1, c, fw1.b(), nj.a, fp.a(obj)))), ((fv) (null)));
            return;
        } else
        {
            a(((my) (new np(nl1, c, nj.a, d, fp.a(obj)))), ((fv) (null)));
            a(fw1, true);
            return;
        }
    }

    public final void a(fw fw1, boolean flag)
    {
        nl nl1;
        if (flag)
        {
            nl1 = nn.c(fw1.a.m);
        } else
        {
            nl1 = nn.b(fw1.a.m);
        }
        a(((my) (new ng(nl1, c, fw1.b(), nj.a))), ((fv) (null)));
    }

    public final transient void a(fx fx1, fw fw1, fw fw2, fw afw[])
    {
        a(nn.c(fx1.a()), fx1, fw1, fw2, afw);
    }

    public final void a(my my1, fv fv1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (a == null || !a.c)
                    {
                        throw new IllegalStateException("no current label");
                    }
                    a.a.add(my1);
                    switch (my1.b.c)
                    {
                    case 5: // '\005'
                    default:
                        throw new IllegalArgumentException();

                    case 3: // '\003'
                        break label2;

                    case 4: // '\004'
                        break label1;

                    case 6: // '\006'
                        break label0;

                    case 1: // '\001'
                        if (fv1 != null)
                        {
                            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(fv1).toString());
                        }
                        break;

                    case 2: // '\002'
                        if (fv1 != null)
                        {
                            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(fv1).toString());
                        }
                        a = null;
                        break;
                    }
                    return;
                }
                if (fv1 == null)
                {
                    throw new IllegalArgumentException("branch == null");
                } else
                {
                    a.e = fv1;
                    a = null;
                    return;
                }
            }
            if (fv1 == null)
            {
                throw new IllegalArgumentException("branch == null");
            } else
            {
                a(fv1, Collections.emptyList());
                return;
            }
        }
        if (fv1 != null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(fv1).toString());
        } else
        {
            a(((fv) (null)), ((List) (new ArrayList(k))));
            return;
        }
    }

    public final transient void a(nl nl1, fx fx1, fw fw1, fw fw2, fw afw[])
    {
        a(((my) (new np(nl1, c, a(fw2, afw), d, fx1.f))), ((fv) (null)));
        if (fw1 != null)
        {
            a(fw1, false);
        }
    }

    final int b()
    {
        Iterator iterator = b.iterator();
        int l;
        for (l = 0; iterator.hasNext(); l = ((fw)iterator.next()).a() + l) { }
        return l;
    }

    public final fw b(fy fy1)
    {
        if (h == null)
        {
            throw new IllegalStateException("static methods cannot access 'this'");
        } else
        {
            return a(h, fy1);
        }
    }

    public final void c()
    {
        if (!e.b.equals(fy.i))
        {
            throw new IllegalArgumentException((new StringBuilder("declared ")).append(e.b).append(" but returned void").toString());
        } else
        {
            a(new ng(nn.bw, c, null, nj.a), ((fv) (null)));
            return;
        }
    }

    final mu d()
    {
        if (!g)
        {
            a();
        }
        Object obj = f.iterator();
        int l = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            fv fv1 = (fv)((Iterator) (obj)).next();
            if (fv1.a())
            {
                ((Iterator) (obj)).remove();
            } else
            {
                for (int i1 = 0; i1 < fv1.d.size(); i1++)
                {
                    for (; ((fv)fv1.d.get(i1)).a(); fv1.d.set(i1, ((fv)fv1.d.get(i1)).e)) { }
                }

                for (; fv1.e != null && fv1.e.a(); fv1.e = fv1.e.e) { }
                for (; fv1.f != null && fv1.f.a(); fv1.f = fv1.f.e) { }
                fv1.g = l;
                l++;
            }
        }
        obj = new mu(f.size());
        l = 0;
        while (l < f.size()) 
        {
            fv fv2 = (fv)f.get(l);
            nb nb1 = new nb(fv2.a.size());
            for (int j1 = 0; j1 < fv2.a.size(); j1++)
            {
                nb1.a(j1, (my)fv2.a.get(j1));
            }

            nb1.L = false;
            ph ph1 = new ph();
            for (Iterator iterator = fv2.d.iterator(); iterator.hasNext(); ph1.b(((fv)iterator.next()).g)) { }
            int k1;
            if (fv2.e != null)
            {
                k1 = fv2.e.g;
                ph1.b(k1);
            } else
            {
                k1 = -1;
            }
            if (fv2.f != null)
            {
                ph1.b(fv2.f.g);
            }
            ph1.L = false;
            ((mu) (obj)).a(l, new mt(fv2.g, nb1, ph1, k1));
            l++;
        }
        return ((mu) (obj));
    }
}
