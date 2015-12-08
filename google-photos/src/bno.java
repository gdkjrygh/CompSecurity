// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bno extends bsq
{

    private bnm a;

    bno(bnm bnm1)
    {
        a = bnm1;
        super();
    }

    public final void a()
    {
        bnm.a(a);
    }

    public final void a(String s, boolean flag)
    {
        bnm.b(a).b = false;
        if (!flag)
        {
            bnm.c(a);
        }
    }
}
