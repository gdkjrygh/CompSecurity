// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements gas
{

    private eni a;

    public final void a()
    {
    }

    public final void a(gfp gfp1)
    {
        eni.a(a, gfp1);
        eni.d(a).b().a(eni.a(), eni.c(a).a()).b();
        ftb ftb1 = eni.e(a);
        boolean flag;
        if ("time_added".equals(gfp1.a) || "most_played_rank".equals(gfp1.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ftb1.a = flag;
        eni.a(a);
    }

    public final void a(String s)
    {
        eni.a(a, s);
        eni.a(a);
    }

    public final void a(boolean flag)
    {
    }

    (eni eni1)
    {
        a = eni1;
        super();
    }
}
