// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flj extends Enum
{

    public static final flj a;
    public static final flj b;
    public static final flj c;
    private static flj d;
    private static final flj e[];

    private flj(String s, int i)
    {
        super(s, i);
    }

    public static flj valueOf(String s)
    {
        return (flj)Enum.valueOf(flj, s);
    }

    public static flj[] values()
    {
        return (flj[])e.clone();
    }

    static 
    {
        d = new flj("FULL", 0);
        a = new flj("SCREEN", 1);
        b = new flj("THUMB", 2);
        c = new flj("MINI_THUMB", 3);
        e = (new flj[] {
            d, a, b, c
        });
    }
}
