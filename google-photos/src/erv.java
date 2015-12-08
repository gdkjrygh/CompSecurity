// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class erv extends Enum
{

    public static final erv a;
    public static final erv b;
    public static final erv c;
    private static final erv d[];

    private erv(String s, int i)
    {
        super(s, i);
    }

    public static erv valueOf(String s)
    {
        return (erv)Enum.valueOf(erv, s);
    }

    public static erv[] values()
    {
        return (erv[])d.clone();
    }

    static 
    {
        a = new erv("ADD", 0);
        b = new erv("REMOVE", 1);
        c = new erv("CHANGED", 2);
        d = (new erv[] {
            a, b, c
        });
    }
}
