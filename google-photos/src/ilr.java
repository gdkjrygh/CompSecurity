// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ilr
    implements emf
{

    private final elp a;

    public ilr(elp elp1)
    {
        a = elp1;
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (ils)ekp;
        return new ils(((ils) (ekp)).a, ((ils) (ekp)).b, elm);
    }

    public final elm a(ekp ekp, ekk ekk)
    {
        ekp = (ils)ekp;
        return a.a(-1, ((ils) (ekp)).a, ekk);
    }

    public final Class a()
    {
        return ils;
    }
}
