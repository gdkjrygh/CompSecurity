// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amb extends Enum
{

    public static final amb a;
    public static final amb b;
    public static final amb c;
    public static final amb d;
    private static final amb e[];

    private amb(String s, int i)
    {
        super(s, i);
    }

    public static amb valueOf(String s)
    {
        return (amb)Enum.valueOf(amb, s);
    }

    public static amb[] values()
    {
        return (amb[])e.clone();
    }

    static 
    {
        a = new amb("IMMEDIATE", 0);
        b = new amb("HIGH", 1);
        c = new amb("NORMAL", 2);
        d = new amb("LOW", 3);
        e = (new amb[] {
            a, b, c, d
        });
    }
}
