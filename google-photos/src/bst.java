// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bst extends bto
{

    private bss a;

    bst(bss bss1, bmb bmb, Class class1)
    {
        a = bss1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bsx)obj;
        c();
        ((bsx) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bsx)obj;
        c();
        bss bss1 = a;
        bss1.a(((bsx) (obj)));
        ((bsx) (obj)).a(bss1.b);
        ((bsx) (obj)).f(bss1.c.b.t.y);
    }
}
