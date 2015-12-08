// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class haj extends eni
{

    private hae c;

    haj(hae hae1, enj enj)
    {
        c = hae1;
        super(enj);
    }

    public final void onLayoutChildren(afe afe, afl afl1)
    {
        if (hae.c(c) && afl1.i && !afl1.k)
        {
            hae.a(c, true);
        }
        if (!hae.d(c))
        {
            super.onLayoutChildren(afe, afl1);
            afe = (hqq)hae.f(c).b(hqq);
            if (afe != null)
            {
                afe.a(hae.g(c));
            }
        }
    }
}
