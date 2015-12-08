// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class a
    implements ang.Object
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

    public ()
    {
        a = 0;
    }
}
