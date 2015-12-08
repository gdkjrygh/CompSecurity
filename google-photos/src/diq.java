// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class diq extends Enum
{

    public static final diq a;
    public static final diq b;
    private static diq c;
    private static final diq d[];

    private diq(String s, int i)
    {
        super(s, i);
    }

    public static diq a(nxx nxx1)
    {
        if (nxx1.l())
        {
            if (nxx.a(nxx1.n))
            {
                return c;
            } else
            {
                return b;
            }
        } else
        {
            return a;
        }
    }

    public static diq valueOf(String s)
    {
        return (diq)Enum.valueOf(diq, s);
    }

    public static diq[] values()
    {
        return (diq[])d.clone();
    }

    static 
    {
        a = new diq("SUCCESS", 0);
        b = new diq("PERMANENT_FAILURE", 1);
        c = new diq("TRANSIENT_FAILURE", 2);
        d = (new diq[] {
            a, b, c
        });
    }
}
