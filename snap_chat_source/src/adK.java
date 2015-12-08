// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class adK extends aeR
{
    static final class a
        implements adN.b
    {

        int a;

        private void a(adN adn)
        {
            adS ads = adn.d;
            if (ads != null)
            {
                a(ads);
            }
            adn = adn.e;
            int j = ((aeN) (adn)).K.length;
            for (int i = 0; i < j; i++)
            {
                a(adn.b(i));
            }

        }

        private void a(adS ads)
        {
            int i = ads.a + ads.e();
            if (i > a)
            {
                a = i;
            }
        }

        public final void a(adQ adq)
        {
            a(((adN) (adq)));
        }

        public final void a(adR adr)
        {
            a(((adN) (adr)));
        }

        public final void a(aea aea)
        {
            a(((adN) (aea)));
        }

        public final void a(aeb aeb)
        {
            a(((adN) (aeb)));
        }

        public a()
        {
            a = 0;
        }
    }


    private int b;

    public adK(int i)
    {
        super(i);
        b = -1;
    }

    public final adJ a(int i)
    {
        return (adJ)d(i);
    }

    public final void a(int i, adJ adj)
    {
        super.a(i, adj);
        b = -1;
    }

    public final void a(adN.b b1)
    {
        int j = super.K.length;
        for (int i = 0; i < j; i++)
        {
            a(i).b.a(b1);
        }

    }

    public final int b()
    {
        if (b == -1)
        {
            a a1 = new a();
            a(a1);
            b = a1.a;
        }
        return b;
    }

    public final adJ b(int i)
    {
        int j;
        if (i >= super.a.b)
        {
            j = -1;
        } else
        {
            j = super.a.a(i);
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("no such label: ")).append(aeO.b(i)).toString());
        } else
        {
            return a(j);
        }
    }

    public final int c()
    {
        int k = super.K.length;
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            adJ adj = (adJ)super.K[j];
            if (adj != null)
            {
                i = ((aeN) (adj.b)).K.length + i;
            }
        }

        return i;
    }
}
