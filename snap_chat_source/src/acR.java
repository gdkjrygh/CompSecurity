// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public final class acR extends ado
{

    private final aev a;
    private final abK b;
    private acN c;
    private final boolean d;
    private acT e;

    public acR(aev aev1, abK abk, boolean flag, aeF aef)
    {
        super(4, -1);
        if (aev1 == null)
        {
            throw new NullPointerException("ref == null");
        }
        if (abk == null)
        {
            throw new NullPointerException("code == null");
        }
        if (aef == null)
        {
            throw new NullPointerException("throwsList == null");
        } else
        {
            a = aev1;
            b = abk;
            d = flag;
            c = null;
            e = null;
            return;
        }
    }

    public final adh a()
    {
        return adh.l;
    }

    public final void a(acU acu)
    {
        Object obj1 = acu.m;
        Object obj = acu.g;
        if (b.a.c)
        {
            e = new acT(b, d, a);
            ((adn) (obj1)).a(e);
        }
        if (b.b.b())
        {
            for (obj1 = b.b.c().iterator(); ((Iterator) (obj1)).hasNext(); ((adx) (obj)).a((aeD)((Iterator) (obj1)).next())) { }
            c = new acN(b);
        }
        obj1 = b.a;
        obj = new HashSet(20);
        for (obj1 = ((abY) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); abY.a(((HashSet) (obj)), (abL)((Iterator) (obj1)).next())) { }
        for (obj = ((HashSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); acu.a((aec)((Iterator) (obj)).next())) { }
    }

    protected final void a(adr adr1, int i)
    {
        adr1 = adr1.b;
        Object obj = b;
        abK.a a1 = new abK.a(adr1) {

            private acU a;

            public final int a(aec aec2)
            {
                acU acu = a;
                if (aec2 instanceof aey)
                {
                    aec2 = acu.f.a(aec2);
                } else
                if (aec2 instanceof aez)
                {
                    aec2 = acu.g.a(aec2);
                } else
                if (aec2 instanceof aef)
                {
                    aec2 = acu.j.a(aec2);
                } else
                if (aec2 instanceof ael)
                {
                    aec2 = acu.i.a(aec2);
                } else
                {
                    aec2 = null;
                }
                if (aec2 == null)
                {
                    return -1;
                } else
                {
                    return aec2.c();
                }
            }

            
            {
                a = acu;
                super();
            }
        };
        obj = ((abK) (obj)).a.b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (abL)((Iterator) (obj)).next();
            if (obj1 instanceof abJ)
            {
                obj1 = (abJ)obj1;
                aec aec1 = ((abJ) (obj1)).a;
                i = a1.a(aec1);
                if (i >= 0)
                {
                    ((abJ) (obj1)).a(i);
                }
                if (aec1 instanceof aet)
                {
                    i = a1.a(((aet)aec1).b);
                    if (i >= 0)
                    {
                        ((abJ) (obj1)).b(i);
                    }
                }
            }
        } while (true);
        int l;
        int i1;
        if (c != null)
        {
            acN acn = c;
            acn.a();
            adr1 = ((acU) (adr1)).g;
            int j = ((aeN) (acn.a)).K.length;
            acn.c = new TreeMap();
            for (i = 0; i < j; i++)
            {
                acn.c.put(acn.a.a(i).c, null);
            }

            if (acn.c.size() > 65535)
            {
                throw new UnsupportedOperationException("too many catch handlers");
            }
            aeJ aej = new aeJ();
            aej.e(acn.c.size());
            Iterator iterator = acn.c.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                abG abg = (abG)entry.getKey();
                i = ((aeN) (abg)).K.length;
                boolean flag = abg.b();
                entry.setValue(Integer.valueOf(aej.b));
                int k;
                if (flag)
                {
                    aej.f(-(i - 1));
                    i--;
                } else
                {
                    aej.f(i);
                }
                for (k = 0; k < i; k++)
                {
                    abG.a a2 = abg.a(k);
                    aej.e(adr1.b(a2.a));
                    aej.e(a2.b);
                }

                if (flag)
                {
                    aej.e(abg.a(i).b);
                }
            } while (true);
            acn.b = aej.a();
            adr1 = c;
            i = adr1.b();
            i = ((acN) (adr1)).b.length + (i << 3);
        } else
        {
            i = 0;
        }
        i1 = b.b().b();
        l = i1;
        if ((i1 & 1) != 0)
        {
            l = i1 + 1;
        }
        a(i + ((l << 1) + 16));
    }

    protected final void a_(acU acu, aeG aeg)
    {
        int k = b.b().a;
        int l = b.b().c();
        int i1 = a.a(d);
        int j1 = b.b().b();
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
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.b();
        }
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.d();
        }
        aeg.c(k);
        aeg.c(i1);
        aeg.c(l);
        aeg.c(i);
        aeg.d(j);
        aeg.d(j1);
        acu = b.b();
        try
        {
            acu.a(aeg);
        }
        // Misplaced declaration of an exception variable
        catch (acU acu)
        {
            throw aeM.a(acu, (new StringBuilder("...while writing instructions for ")).append(a.ag_()).toString());
        }
        if (c != null)
        {
            if (flag)
            {
                aeg.c(0);
            }
            c.a(aeg);
        }
    }

    public final String toString()
    {
        return (new StringBuilder("CodeItem{")).append(a.ag_()).append("}").toString();
    }
}
