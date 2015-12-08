// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class sd
    implements afw
{

    private static boolean b;
    private final afq a;

    private sd(afq afq1)
    {
        if (!b && afq1 == null)
        {
            throw new AssertionError();
        } else
        {
            a = afq1;
            return;
        }
    }

    public static afw a(afq afq1)
    {
        return new sd(afq1);
    }

    public final Object get()
    {
        sc sc1 = new sc();
        a.a(sc1);
        return sc1;
    }

    static 
    {
        boolean flag;
        if (!sd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
