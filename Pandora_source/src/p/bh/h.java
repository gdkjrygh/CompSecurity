// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    private h(String s, int j)
    {
        super(s, j);
    }

    public static h a(String s)
    {
        return valueOf(s);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(p/bh/h, s);
    }

    public static h[] values()
    {
        return (h[])i.clone();
    }

    static 
    {
        a = new h("GRAPHIC_BMP", 0);
        b = new h("GRAPHIC_JPEG", 1);
        c = new h("GRAPHIC_PNG", 2);
        d = new h("AUDIO_WAVE", 3);
        e = new h("AUDIO_AAC", 4);
        f = new h("AUDIO_MP3", 5);
        g = new h("BINARY", 6);
        h = new h("JSON", 7);
        i = (new h[] {
            a, b, c, d, e, f, g, h
        });
    }
}
