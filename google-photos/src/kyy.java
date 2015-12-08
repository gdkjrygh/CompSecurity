// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyy extends Enum
{

    public static final kyy a;
    private static kyy b;
    private static kyy c;
    private static kyy d;
    private static final kyy e[];

    private kyy(String s, int i)
    {
        super(s, i);
    }

    public static kyy valueOf(String s)
    {
        return (kyy)Enum.valueOf(kyy, s);
    }

    public static kyy[] values()
    {
        return (kyy[])e.clone();
    }

    static 
    {
        b = new kyy("LOW", 0);
        a = new kyy("NORMAL", 1);
        c = new kyy("HIGH", 2);
        d = new kyy("IMMEDIATE", 3);
        e = (new kyy[] {
            b, a, c, d
        });
    }
}
