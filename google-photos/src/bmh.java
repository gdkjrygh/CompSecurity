// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bmh extends bto
{

    final bmg a;

    bmh(bmg bmg, bmb bmb, Class class1)
    {
        a = bmg;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bmk)obj;
        c();
        ((bmk) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bmk)obj;
        c();
        ((bmk) (obj)).a(new bmi(this));
    }
}
