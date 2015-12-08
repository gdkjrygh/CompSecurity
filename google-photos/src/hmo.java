// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hmo
    implements hgc
{

    private hmn a;

    hmo(hmn hmn1)
    {
        a = hmn1;
        super();
    }

    public final void a()
    {
        boolean flag = true;
        if (hmn.a(a).a() <= 1)
        {
            flag = false;
        }
        if (flag && hmn.a(a).a(hmn.a(a).a() - 1) == ag.E)
        {
            hmn.a(a).g(hmn.a(a).a() - 1);
        }
        hmn.a(a, flag);
    }
}
