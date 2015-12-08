// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


// Referenced classes of package p.cx:
//            x

public static final class .String extends Enum
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

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cx/x$e, s);
    }

    public static .String[] values()
    {
        return (.String[])j.clone();
    }

    static 
    {
        a = new <init>("track_action", 0);
        b = new <init>("rec", 1);
        c = new <init>("search", 2);
        d = new <init>("auto_complete", 3);
        e = new <init>("genre", 4);
        f = new <init>("promo", 5);
        g = new <init>("smart_url", 6);
        h = new <init>("js_api", 7);
        i = new <init>("google_search_action", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private .String(String s, int k)
    {
        super(s, k);
    }
}
