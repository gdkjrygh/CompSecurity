// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class qN
    implements afw
{

    private static boolean b;
    private final afq a;

    private qN(afq afq1)
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
        return new qN(afq1);
    }

    public final Object get()
    {
        qM qm = new qM();
        a.a(qm);
        return qm;
    }

    static 
    {
        boolean flag;
        if (!qN.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
