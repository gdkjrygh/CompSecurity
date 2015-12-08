// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bte extends bto
{

    private btd a;

    bte(btd btd1, bmb bmb, Class class1)
    {
        a = btd1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (btj)obj;
        c();
        ((btj) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (btj)obj;
        c();
        ((btj) (obj)).a(btd.a(a));
        btd.a(a, ((btj) (obj)).p());
        btd.b(a);
        ((btj) (obj)).a(c.b.x);
    }
}
