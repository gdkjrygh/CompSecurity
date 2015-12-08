// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eqd extends Enum
{

    public static final eqd a;
    public static final eqd b;
    private static final eqd c[];

    private eqd(String s, int i)
    {
        super(s, i);
    }

    public static eqd valueOf(String s)
    {
        return (eqd)Enum.valueOf(eqd, s);
    }

    public static eqd[] values()
    {
        return (eqd[])c.clone();
    }

    static 
    {
        a = new eqd("PROMO", 0);
        b = new eqd("MANUAL_AWESOME", 1);
        c = (new eqd[] {
            a, b
        });
    }
}
