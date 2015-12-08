// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class ang.String extends Enum
{

    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    private static final i j[];

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(cn$ac, s);
    }

    public static ang.String[] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("px", 0);
        b = new <init>("em", 1);
        c = new <init>("ex", 2);
        d = new <init>("in", 3);
        e = new <init>("cm", 4);
        f = new <init>("mm", 5);
        g = new <init>("pt", 6);
        h = new <init>("pc", 7);
        i = new <init>("percent", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
