// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class acb
{

    private static hq d = new hr(20);
    public int a;
    public aba b;
    public aba c;

    private acb()
    {
    }

    public static acb a()
    {
        acb acb2 = (acb)d.a();
        acb acb1 = acb2;
        if (acb2 == null)
        {
            acb1 = new acb();
        }
        return acb1;
    }

    public static void a(acb acb1)
    {
        acb1.a = 0;
        acb1.b = null;
        acb1.c = null;
        d.a(acb1);
    }

    public static void b()
    {
        while (d.a() != null) ;
    }

}
