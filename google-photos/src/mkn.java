// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mkn extends mkl
{

    private mkm a;

    mkn(mkm mkm1)
    {
        a = mkm1;
        super();
    }

    public final void a(mkk mkk)
    {
        if (((Boolean)a.c.get(mkk)).booleanValue())
        {
            return;
        } else
        {
            a.c.put(mkk, Boolean.valueOf(true));
            mkk = a;
            mkk.d = ((mkm) (mkk)).d + 1;
            a.a();
            return;
        }
    }
}
