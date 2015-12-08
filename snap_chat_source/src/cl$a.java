// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(cl$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])k.clone();
    }

    static 
    {
        a = new <init>("None", 0);
        b = new <init>("XMinYMin", 1);
        c = new <init>("XMidYMin", 2);
        d = new <init>("XMaxYMin", 3);
        e = new <init>("XMinYMid", 4);
        f = new <init>("XMidYMid", 5);
        g = new <init>("XMaxYMid", 6);
        h = new <init>("XMinYMax", 7);
        i = new <init>("XMidYMax", 8);
        j = new <init>("XMaxYMax", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private >(String s, int l)
    {
        super(s, l);
    }
}
