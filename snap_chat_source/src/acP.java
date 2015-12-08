// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acP extends adf
{

    final aez a;
    final aez b;
    ady c;
    public final acO d;
    private final int f;
    private final aey g;
    private acV h;
    private acM i;

    public acP(aez aez, int j, aez aez1, aeF aef, aey aey)
    {
        if (aez == null)
        {
            throw new NullPointerException("thisClass == null");
        }
        if (aef == null)
        {
            throw new NullPointerException("interfaces == null");
        }
        a = aez;
        f = j;
        b = aez1;
        if (aef.a() == 0)
        {
            aez1 = null;
        } else
        {
            aez1 = new ady(aef);
        }
        c = aez1;
        g = aey;
        d = new acO(aez);
        h = null;
        i = new acM();
    }

    public final adh a()
    {
        return adh.g;
    }

    public final void a(acU acu)
    {
        adn adn2;
label0:
        {
            adx adx1 = acu.g;
            adn adn1 = acu.m;
            adn2 = acu.b;
            adn adn3 = acu.c;
            adu adu1 = acu.f;
            adx1.a(a);
            if (!d.b())
            {
                acu.l.a(d);
                acu = d.c();
                if (acu != null)
                {
                    h = (acV)adn1.b(new acV(acu));
                }
            }
            if (b != null)
            {
                adx1.a(b);
            }
            if (c != null)
            {
                c = (ady)adn3.b(c);
            }
            if (g != null)
            {
                adu1.a(g);
            }
            if (!i.b())
            {
                if (!i.c())
                {
                    break label0;
                }
                i = (acM)adn2.b(i);
            }
            return;
        }
        adn2.a(i);
    }

    public final void a(acU acu, aeG aeg)
    {
        int i1 = 0;
        int l = -1;
        adx adx1 = acu.g;
        int j1 = adx1.b(a);
        int j;
        int k;
        int k1;
        int l1;
        if (b == null)
        {
            j = -1;
        } else
        {
            j = adx1.b(b);
        }
        k1 = ado.b(c);
        if (i.b())
        {
            k = 0;
        } else
        {
            k = i.d();
        }
        if (g != null)
        {
            l = acu.f.b(g);
        }
        if (!d.b())
        {
            i1 = d.d();
        }
        l1 = ado.b(h);
        aeg.d(j1);
        aeg.d(f);
        aeg.d(j);
        aeg.d(k1);
        aeg.d(l);
        aeg.d(k);
        aeg.d(i1);
        aeg.d(l1);
    }

    public final int ah_()
    {
        return 32;
    }
}
