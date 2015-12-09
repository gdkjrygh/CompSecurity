// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package b.a:
//            kg, jv, ji, gj, 
//            hc, jg, kc, gc, 
//            ot, kq, ix, gl, 
//            nr, kk, jc, gi, 
//            gk, ok, pe, gf, 
//            gg, oz, gd, ge, 
//            gm, ow, ol, pf, 
//            ov, os, pd

public final class jb extends kg
{

    private final ol a;
    private final gj c;
    private ix d;
    private final boolean e;
    private final ov f;
    private jg g;

    public jb(ol ol1, gj gj1, boolean flag, ov ov1)
    {
        super(4, -1);
        if (ol1 == null)
        {
            throw new NullPointerException("ref == null");
        }
        if (gj1 == null)
        {
            throw new NullPointerException("code == null");
        }
        if (ov1 == null)
        {
            throw new NullPointerException("throwsList == null");
        } else
        {
            a = ol1;
            c = gj1;
            e = flag;
            f = ov1;
            d = null;
            g = null;
            return;
        }
    }

    public final jv a()
    {
        return jv.m;
    }

    public final void a(ji ji1)
    {
        boolean flag = true;
        Object obj1 = ji1.m;
        Object obj = ji1.g;
        gj gj1 = c;
        if (gj1.a == 1 || !gj1.b.c)
        {
            flag = false;
        }
        if (flag || c.b.d)
        {
            g = new jg(c, e, a);
            ((kc) (obj1)).a(g);
        }
        if (c.c.b())
        {
            for (obj1 = c.c.c().iterator(); ((Iterator) (obj1)).hasNext(); ((kq) (obj)).a((ot)((Iterator) (obj1)).next())) { }
            d = new ix(c);
        }
        obj1 = c.b;
        obj = new HashSet(20);
        for (obj1 = ((hc) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); hc.a(((HashSet) (obj)), (gl)((Iterator) (obj1)).next())) { }
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ji1.a((nr)((Iterator) (obj)).next())) { }
    }

    protected final void a(kk kk1, int i)
    {
        kk1 = kk1.a;
        Object obj = c;
        jc jc1 = new jc(this, kk1);
        obj = ((gj) (obj)).b.b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (gl)((Iterator) (obj)).next();
            if (obj1 instanceof gi)
            {
                obj1 = (gi)obj1;
                nr nr1 = ((gi) (obj1)).a;
                i = jc1.a(nr1);
                if (i >= 0)
                {
                    ((gi) (obj1)).a(i);
                }
                if (nr1 instanceof ok)
                {
                    i = jc1.a(((ok)nr1).a);
                    if (i >= 0)
                    {
                        ((gi) (obj1)).b(i);
                    }
                }
            }
        } while (true);
        int l;
        int i1;
        if (d != null)
        {
            ix ix1 = d;
            ix1.a();
            kk1 = ((ji) (kk1)).g;
            int j = ((pe) (ix1.a)).K.length;
            ix1.d = new TreeMap();
            for (i = 0; i < j; i++)
            {
                ix1.d.put(ix1.a.a(i).a, null);
            }

            if (ix1.d.size() > 65535)
            {
                throw new UnsupportedOperationException("too many catch handlers");
            }
            oz oz1 = new oz();
            ix1.c = oz1.e(ix1.d.size());
            Iterator iterator = ix1.d.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                gd gd1 = (gd)entry.getKey();
                i = ((pe) (gd1)).K.length;
                boolean flag = gd1.b();
                entry.setValue(Integer.valueOf(oz1.b));
                int k;
                if (flag)
                {
                    oz1.f(-(i - 1));
                    i--;
                } else
                {
                    oz1.f(i);
                }
                for (k = 0; k < i; k++)
                {
                    ge ge1 = gd1.a(k);
                    oz1.e(kk1.b(ge1.a));
                    oz1.e(ge1.b);
                }

                if (flag)
                {
                    oz1.e(gd1.a(i).b);
                }
            } while (true);
            ix1.b = oz1.e();
            kk1 = d;
            i = kk1.b();
            i = ((ix) (kk1)).b.length + i * 8;
        } else
        {
            i = 0;
        }
        i1 = c.b().b();
        l = i1;
        if ((i1 & 1) != 0)
        {
            l = i1 + 1;
        }
        a(i + (l * 2 + 16));
    }

    protected final void a_(ji ji1, ow ow1)
    {
        boolean flag1 = ow1.a();
        int k = c.b().a;
        int l = c.b().c();
        int i1 = a.a(e);
        int j1 = c.b().b();
        gm gm1;
        boolean flag;
        int i;
        int j;
        if ((j1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.b();
        }
        if (g == null)
        {
            j = 0;
        } else
        {
            j = g.d();
        }
        if (flag1)
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(' ').append(a.h_()).toString());
            ow1.a(2, (new StringBuilder("  registers_size: ")).append(pf.b(k)).toString());
            ow1.a(2, (new StringBuilder("  ins_size:       ")).append(pf.b(i1)).toString());
            ow1.a(2, (new StringBuilder("  outs_size:      ")).append(pf.b(l)).toString());
            ow1.a(2, (new StringBuilder("  tries_size:     ")).append(pf.b(i)).toString());
            ow1.a(4, (new StringBuilder("  debug_off:      ")).append(pf.a(j)).toString());
            ow1.a(4, (new StringBuilder("  insns_size:     ")).append(pf.a(j1)).toString());
            if (f.a() != 0)
            {
                ow1.a(0, (new StringBuilder("  throws ")).append(os.a(f)).toString());
            }
        }
        ow1.c(k);
        ow1.c(i1);
        ow1.c(l);
        ow1.c(i);
        ow1.d(j);
        ow1.d(j1);
        gm1 = c.b();
        try
        {
            gm1.a(ow1);
        }
        // Misplaced declaration of an exception variable
        catch (ji ji1)
        {
            throw pd.a(ji1, (new StringBuilder("...while writing instructions for ")).append(a.h_()).toString());
        }
        if (d != null)
        {
            if (flag)
            {
                if (flag1)
                {
                    ow1.a(2, "  padding: 0");
                }
                ow1.c(0);
            }
            d.a(ow1);
        }
        if (flag1 && g != null)
        {
            ow1.a(0, "  debug info");
            g.a(ji1, "    ", ow1, false);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("CodeItem{")).append(a.h_()).append("}").toString();
    }
}
