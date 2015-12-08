// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gnt extends Enum
{

    public static final gnt a;
    public static final gnt b;
    private static final gnt c[];

    private gnt(String s, int i)
    {
        super(s, i);
    }

    public static gnt valueOf(String s)
    {
        return (gnt)Enum.valueOf(gnt, s);
    }

    public static gnt[] values()
    {
        return (gnt[])c.clone();
    }

    static 
    {
        a = new gnt("INSERT", 0);
        b = new gnt("REMOVE", 1);
        c = (new gnt[] {
            a, b
        });
    }
}
