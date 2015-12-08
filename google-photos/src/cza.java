// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cza extends Enum
{

    public static final cza a;
    public static final cza b;
    public static final cza c;
    private static final cza d[];

    private cza(String s, int i, int j)
    {
        super(s, i);
    }

    public static cza valueOf(String s)
    {
        return (cza)Enum.valueOf(cza, s);
    }

    public static cza[] values()
    {
        return (cza[])d.clone();
    }

    static 
    {
        a = new cza("NAIVE", 0, c.bP);
        b = new cza("TOP_QUALITY", 1, c.bQ);
        c = new cza("CLUSTERING", 2, c.bO);
        d = (new cza[] {
            a, b, c
        });
    }
}
