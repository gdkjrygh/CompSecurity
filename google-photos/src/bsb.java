// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bsb extends bto
{

    private bsa a;

    bsb(bsa bsa1, bmb bmb, Class class1)
    {
        a = bsa1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bsi)obj;
        bsa.b(a, ((bsi) (obj)));
    }

    protected final void b(Object obj)
    {
        obj = (bsi)obj;
        bsa.a(a, ((bsi) (obj)));
    }
}
