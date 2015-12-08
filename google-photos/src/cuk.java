// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cuk extends Enum
{

    public static final cuk a;
    public static final cuk b;
    public static final cuk c;
    public static final cuk d;
    public static final cuk e;
    public static final cuk f;
    private static final cuk g[];

    private cuk(String s, int i)
    {
        super(s, i);
    }

    public static cuk valueOf(String s)
    {
        return (cuk)Enum.valueOf(cuk, s);
    }

    public static cuk[] values()
    {
        return (cuk[])g.clone();
    }

    static 
    {
        a = new cuk("PAUSED", 0);
        b = new cuk("PLAYING", 1);
        c = new cuk("STOPPED", 2);
        d = new cuk("SEEKING", 3);
        e = new cuk("RESYNCING", 4);
        f = new cuk("UPDATING_STORYBOARD", 5);
        g = (new cuk[] {
            a, b, c, d, e, f
        });
    }
}
