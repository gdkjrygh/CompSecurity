// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ikk
    implements emf
{

    private final est a;
    private final elp b;

    public ikk(est est1, elp elp1)
    {
        a = est1;
        b = elp1;
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (ikb)ekp;
        return new ikb(((ikb) (ekp)).a, ((ikb) (ekp)).b, ((ikb) (ekp)).c, ((ikb) (ekp)).d, ((ikb) (ekp)).e, elm);
    }

    public final elm a(ekp ekp, ekk ekk)
    {
        ekp = (ikb)ekp;
        qgg qgg = a.c(((ikb) (ekp)).a, ((ikb) (ekp)).b);
        if (qgg == null)
        {
            ekp = String.valueOf(((ikb) (ekp)).b);
            if (ekp.length() != 0)
            {
                ekp = "unable to get proto for media: ".concat(ekp);
            } else
            {
                ekp = new String("unable to get proto for media: ");
            }
            throw new eke(ekp);
        } else
        {
            return b.a(((ikb) (ekp)).a, qgg, ekk);
        }
    }

    public final Class a()
    {
        return ikb;
    }
}
