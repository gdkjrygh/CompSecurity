// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dip extends Enum
{

    public static final dip a;
    public static final dip b;
    private static final dip c[];

    private dip(String s, int i)
    {
        super(s, i);
    }

    public static dip valueOf(String s)
    {
        return (dip)Enum.valueOf(dip, s);
    }

    public static dip[] values()
    {
        return (dip[])c.clone();
    }

    static 
    {
        a = new dip("COMPLETE", 0);
        b = new dip("LOST_CONNECTION", 1);
        c = (new dip[] {
            a, b
        });
    }
}
