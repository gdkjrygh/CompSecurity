// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fjx
    implements emf
{

    private final elp a;

    public fjx(elp elp1)
    {
        a = elp1;
    }

    public final ekp a(ekp ekp, elm elm)
    {
        ekp = (fjq)ekp;
        return new fjq(((fjq) (ekp)).a, ((fjq) (ekp)).b, ((fjq) (ekp)).c, elm);
    }

    public final elm a(ekp ekp, ekk ekk)
    {
        ekp = (fjq)ekp;
        return a.a(((fjq) (ekp)).a, ((fjq) (ekp)).b, ekk);
    }

    public final Class a()
    {
        return fjq;
    }
}
