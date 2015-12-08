// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class brb extends bto
{

    private bra a;

    brb(bra bra1, bmb bmb, Class class1)
    {
        a = bra1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bre)obj;
        c();
        ((bre) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bre)obj;
        c();
        ((bre) (obj)).a(bra.a(a));
    }
}
