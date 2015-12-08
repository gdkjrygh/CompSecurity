// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class abs
{

    public aby a;
    public adZ b;
    public aeC c;
    private final abA d;
    private final List e = new ArrayList();
    private boolean f;
    private final abz g;
    private List h;
    private final List i = new ArrayList();
    private final List j = new ArrayList();

    abs(abw.b b1)
    {
        boolean flag = false;
        super();
        h = new ArrayList();
        b = adZ.a;
        new ArrayList();
        c = aeC.a;
        d = b1.a;
        int k;
        int l;
        if ((b1.b & 8) != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            g = null;
        } else
        {
            g = abz.a(this, d.a);
            h.add(g);
        }
        b1 = d.d.a;
        l = b1.length;
        for (k = ((flag) ? 1 : 0); k < l; k++)
        {
            abB abb = b1[k];
            h.add(abz.a(this, abb));
        }

        a = new aby();
        a(a);
        a.c = true;
    }

    private static abz a(abz abz1, abB abb)
    {
        if (!abz1.a.equals(abb))
        {
            throw new IllegalArgumentException((new StringBuilder("requested ")).append(abb).append(" but was ").append(abz1.a).toString());
        } else
        {
            return abz1;
        }
    }

    private static adU a(abz abz1, abz aabz[])
    {
        boolean flag = false;
        adU adu;
        int k;
        int l;
        if (abz1 != null)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        adu = new adU(aabz.length + k);
        l = ((flag) ? 1 : 0);
        if (abz1 != null)
        {
            adu.a(0, abz1.b());
            l = ((flag) ? 1 : 0);
        }
        for (; l < aabz.length; l++)
        {
            adu.a(l + k, aabz[l].b());
        }

        return adu;
    }

    private void a(aby aby1, List list)
    {
        aby aby2 = new aby();
        a(aby2);
        a.e = aby2;
        a.f = aby1;
        a.d = list;
        a = aby2;
        a.c = true;
    }

    public final abz a(int k, abB abb)
    {
        int l = k;
        if (g != null)
        {
            l = k + 1;
        }
        return a((abz)h.get(l), abb);
    }

    public final abz a(abB abb)
    {
        if (f)
        {
            throw new IllegalStateException("Cannot allocate locals after adding instructions");
        } else
        {
            abb = abz.a(this, abb);
            i.add(abb);
            return abb;
        }
    }

    final void a()
    {
        if (f)
        {
            throw new AssertionError();
        }
        f = true;
        Object obj = i.iterator();
        int k;
        for (k = 0; ((Iterator) (obj)).hasNext(); k = ((abz)((Iterator) (obj)).next()).a(k) + k) { }
        obj = new ArrayList();
        Iterator iterator = h.iterator();
        int i1;
        for (int l = k; iterator.hasNext(); l += i1)
        {
            abz abz1 = (abz)iterator.next();
            aen aen1 = aen.a(l - k);
            i1 = abz1.a(l);
            ((List) (obj)).add(new adQ(adY.a(abz1.a.l), b, abz1.b(), adU.a, aen1));
        }

        ((aby)e.get(0)).a.addAll(0, ((java.util.Collection) (obj)));
    }

    public final transient void a(abA aba, abz abz1, abz abz2, abz aabz[])
    {
        a(adY.c(aba.a()), aba, abz1, abz2, aabz);
    }

    public final void a(aby aby1)
    {
        if (aby1.b == this)
        {
            return;
        }
        if (aby1.b != null)
        {
            throw new IllegalArgumentException("Cannot adopt label; it belongs to another Code");
        } else
        {
            aby1.b = this;
            e.add(aby1);
            return;
        }
    }

    public final void a(abz abz1)
    {
        if (!abz1.a.equals(d.b))
        {
            throw new IllegalArgumentException((new StringBuilder("declared ")).append(d.b).append(" but returned ").append(abz1.a).toString());
        } else
        {
            a(((adN) (new adR(adY.e(abz1.a.l), b, null, adU.a(abz1.b())))), ((aby) (null)));
            return;
        }
    }

    public final void a(abz abz1, abz abz2)
    {
        Object obj;
        aeD aed;
        if (abz2.a.l.f())
        {
            a(((adN) (new aea(adY.bC, b, adU.a(abz2.b()), c, abz1.a.m))), ((aby) (null)));
            a(abz1, true);
            return;
        }
        obj = abz2.a.l;
        aed = abz1.a.l;
        if (((aeD) (obj)).I != 6) goto _L2; else goto _L1
_L1:
        aed.I;
        JVM INSTR lookupswitch 3: default 124
    //                   2: 171
    //                   3: 164
    //                   8: 157;
           goto _L2 _L3 _L4 _L5
_L2:
        obj = adY.a(aed, ((aeE) (obj)));
_L7:
        a(((adN) (new adR(((adW) (obj)), b, abz1.b(), abz2.b()))), ((aby) (null)));
        return;
_L5:
        obj = adY.aY;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = adY.aX;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = adY.aW;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(abz abz1, Object obj)
    {
        adW adw;
        if (obj == null)
        {
            adw = adY.p;
        } else
        {
            adw = adY.d(abz1.a.l);
        }
        if (adw.c == 1)
        {
            a(((adN) (new adQ(adw, b, abz1.b(), adU.a, abu.a(obj)))), ((aby) (null)));
            return;
        } else
        {
            a(((adN) (new aea(adw, b, adU.a, c, abu.a(obj)))), ((aby) (null)));
            a(abz1, true);
            return;
        }
    }

    public final void a(abz abz1, boolean flag)
    {
        adW adw;
        if (flag)
        {
            adw = adY.c(abz1.a.l);
        } else
        {
            adw = adY.b(abz1.a.l);
        }
        a(((adN) (new adR(adw, b, abz1.b(), adU.a))), ((aby) (null)));
    }

    public final void a(adN adn, aby aby1)
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
                    a.a.add(adn);
                    switch (adn.b.c)
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
                        if (aby1 != null)
                        {
                            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(aby1).toString());
                        }
                        break;

                    case 2: // '\002'
                        if (aby1 != null)
                        {
                            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(aby1).toString());
                        }
                        a = null;
                        break;
                    }
                    return;
                }
                if (aby1 == null)
                {
                    throw new IllegalArgumentException("branch == null");
                } else
                {
                    a.e = aby1;
                    a = null;
                    return;
                }
            }
            if (aby1 == null)
            {
                throw new IllegalArgumentException("branch == null");
            } else
            {
                a(aby1, Collections.emptyList());
                return;
            }
        }
        if (aby1 != null)
        {
            throw new IllegalArgumentException((new StringBuilder("unexpected branch: ")).append(aby1).toString());
        } else
        {
            a(((aby) (null)), ((List) (new ArrayList(j))));
            return;
        }
    }

    public final transient void a(adW adw, abA aba, abz abz1, abz abz2, abz aabz[])
    {
        a(((adN) (new aea(adw, b, a(abz2, aabz), c, aba.e))), ((aby) (null)));
        if (abz1 != null)
        {
            a(abz1, false);
        }
    }

    final int b()
    {
        Iterator iterator = h.iterator();
        int k;
        for (k = 0; iterator.hasNext(); k = ((abz)iterator.next()).a() + k) { }
        return k;
    }

    public final abz b(abB abb)
    {
        if (g == null)
        {
            throw new IllegalStateException("static methods cannot access 'this'");
        } else
        {
            return a(g, abb);
        }
    }

    public final void c()
    {
        if (!d.b.equals(abB.i))
        {
            throw new IllegalArgumentException((new StringBuilder("declared ")).append(d.b).append(" but returned void").toString());
        } else
        {
            a(new adR(adY.aZ, b, null, adU.a), ((aby) (null)));
            return;
        }
    }

    final adK d()
    {
        if (!f)
        {
            a();
        }
        Object obj = e.iterator();
        int k = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            aby aby1 = (aby)((Iterator) (obj)).next();
            if (aby1.a())
            {
                ((Iterator) (obj)).remove();
            } else
            {
                for (int l = 0; l < aby1.d.size(); l++)
                {
                    for (; ((aby)aby1.d.get(l)).a(); aby1.d.set(l, ((aby)aby1.d.get(l)).e)) { }
                }

                for (; aby1.e != null && aby1.e.a(); aby1.e = aby1.e.e) { }
                for (; aby1.f != null && aby1.f.a(); aby1.f = aby1.f.e) { }
                aby1.g = k;
                k++;
            }
        }
        obj = new adK(e.size());
        k = 0;
        while (k < e.size()) 
        {
            aby aby2 = (aby)e.get(k);
            adO ado = new adO(aby2.a.size());
            for (int i1 = 0; i1 < aby2.a.size(); i1++)
            {
                ado.a(i1, (adN)aby2.a.get(i1));
            }

            ado.L = false;
            aeP aep = new aeP();
            for (Iterator iterator = aby2.d.iterator(); iterator.hasNext(); aep.b(((aby)iterator.next()).g)) { }
            int j1;
            if (aby2.e != null)
            {
                j1 = aby2.e.g;
                aep.b(j1);
            } else
            {
                j1 = -1;
            }
            if (aby2.f != null)
            {
                aep.b(aby2.f.g);
            }
            aep.L = false;
            ((adK) (obj)).a(k, new adJ(aby2.g, ado, aep, j1));
            k++;
        }
        return ((adK) (obj));
    }
}
