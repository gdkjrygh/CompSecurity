// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bmr extends bto
{

    private bmq a;

    bmr(bmq bmq1, bmb bmb, Class class1)
    {
        a = bmq1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bmx)obj;
        c();
        ((bmx) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bmx)obj;
        c();
        ((bmx) (obj)).a(bmq.a(a));
    }
}
