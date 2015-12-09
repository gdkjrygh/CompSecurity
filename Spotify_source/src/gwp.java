// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gwp
    implements hez
{

    private static hez a = new gwp();

    private gwp()
    {
    }

    static hez a()
    {
        return a;
    }

    public final Object call(Object obj)
    {
        obj = (hff)obj;
        gwq gwq1 = new gwq(((hff) (obj)));
        ((hff) (obj)).add(gwq1);
        ((hff) (obj)).setProducer(gwq1.a);
        return gwq1;
    }

}
