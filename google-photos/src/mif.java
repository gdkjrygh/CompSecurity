// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mif extends mhn
{

    private lnu a;

    public mif(lnu lnu1)
    {
        a = lnu1;
    }

    public final mhm a()
    {
        if (a.b() == null)
        {
            return null;
        } else
        {
            return new mie(a.b());
        }
    }

    public final maa r()
    {
        return new maq(a.a_());
    }
}
