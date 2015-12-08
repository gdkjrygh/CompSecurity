// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Yo extends Enum
{

    public static final Yo a;
    public static final Yo b;
    public static final Yo c;
    public static final Yo d;
    private static final Yo e[];

    private Yo(String s, int i)
    {
        super(s, i);
    }

    public static Yo valueOf(String s)
    {
        return (Yo)Enum.valueOf(Yo, s);
    }

    public static Yo[] values()
    {
        return (Yo[])e.clone();
    }

    static 
    {
        a = new Yo("SPDY_SYN_STREAM", 0);
        b = new Yo("SPDY_REPLY", 1);
        c = new Yo("SPDY_HEADERS", 2);
        d = new Yo("HTTP_20_HEADERS", 3);
        e = (new Yo[] {
            a, b, c, d
        });
    }
}
