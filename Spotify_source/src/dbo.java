// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class dbo
{

    private static dbo a;
    private static boolean b;

    private dbo()
    {
    }

    public static void a()
    {
        if (a == null)
        {
            a = new dbo();
        }
    }

    public static dbo b()
    {
        if (!b && a == null)
        {
            throw new AssertionError();
        } else
        {
            return a;
        }
    }

    static 
    {
        boolean flag;
        if (!dbo.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
