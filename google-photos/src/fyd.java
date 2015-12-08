// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fyd extends Enum
{

    public static final fyd a;
    public static final fyd b;
    public static final fyd c;
    private static final fyd d[];

    private fyd(String s, int i)
    {
        super(s, i);
    }

    public static fyd valueOf(String s)
    {
        return (fyd)Enum.valueOf(fyd, s);
    }

    public static fyd[] values()
    {
        return (fyd[])d.clone();
    }

    static 
    {
        a = new fyd("ALLOWED", 0);
        b = new fyd("DASHER_RESTRICTED", 1);
        c = new fyd("UNKNOWN", 2);
        d = (new fyd[] {
            a, b, c
        });
    }
}
