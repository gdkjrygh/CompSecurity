// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class lang.String extends Enum
{

    public static final j a;
    public static final j b;
    private static j c;
    private static j d;
    private static j e;
    private static j f;
    private static j g;
    private static j h;
    private static j i;
    private static j j;
    private static final j k[];

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(ci$d, s);
    }

    public static lang.String[] values()
    {
        return (s[])k.clone();
    }

    static 
    {
        a = new <init>("all", 0);
        c = new <init>("aural", 1);
        d = new <init>("braille", 2);
        e = new <init>("embossed", 3);
        f = new <init>("handheld", 4);
        g = new <init>("print", 5);
        h = new <init>("projection", 6);
        b = new <init>("screen", 7);
        i = new <init>("tty", 8);
        j = new <init>("tv", 9);
        k = (new k[] {
            a, c, d, e, f, g, h, b, i, j
        });
    }

    private >(String s, int l)
    {
        super(s, l);
    }
}
