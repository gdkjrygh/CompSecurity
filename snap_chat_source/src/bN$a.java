// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class i extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h j[];
    int i;

    public static lang.String valueOf(String s)
    {
        return (Of)Enum.valueOf(bN$a, s);
    }

    public static lang.String[] values()
    {
        return (s[])j.clone();
    }

    static 
    {
        a = new <init>("USER", 0, 0);
        b = new <init>("PIXEL_L", 1, 7);
        c = new <init>("PIXEL_A", 2, 8);
        d = new <init>("PIXEL_LA", 3, 9);
        e = new <init>("PIXEL_RGB", 4, 10);
        f = new <init>("PIXEL_RGBA", 5, 11);
        g = new <init>("PIXEL_DEPTH", 6, 12);
        h = new <init>("PIXEL_YUV", 7, 13);
        j = (new j[] {
            a, b, c, d, e, f, g, h
        });
    }

    private >(String s, int k, int l)
    {
        super(s, k);
        i = l;
    }
}
