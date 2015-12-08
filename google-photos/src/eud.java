// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eud extends Enum
{

    public static final eud a;
    public static final eud b;
    private static final eud c[];

    private eud(String s, int i)
    {
        super(s, i);
    }

    public static eud valueOf(String s)
    {
        return (eud)Enum.valueOf(eud, s);
    }

    public static eud[] values()
    {
        return (eud[])c.clone();
    }

    static 
    {
        a = new eud("ADD", 0);
        b = new eud("REMOVE", 1);
        c = (new eud[] {
            a, b
        });
    }
}
