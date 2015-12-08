// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;


// Referenced classes of package com.aviary.android.feather.library.filters:
//            a

public static final class  extends Enum
{

    public static final t a;
    public static final t b;
    public static final t c;
    public static final t d;
    public static final t e;
    public static final t f;
    public static final t g;
    public static final t h;
    public static final t i;
    public static final t j;
    public static final t k;
    public static final t l;
    public static final t m;
    public static final t n;
    public static final t o;
    public static final t p;
    public static final t q;
    public static final t r;
    public static final t s;
    public static final t t;
    private static final t u[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/aviary/android/feather/library/filters/a$a, s1);
    }

    public static [] values()
    {
        return ([])u.clone();
    }

    static 
    {
        a = new <init>("SHARPNESS", 0);
        b = new <init>("BRIGHTNESS", 1);
        c = new <init>("CONTRAST", 2);
        d = new <init>("SATURATION", 3);
        e = new <init>("EFFECTS", 4);
        f = new <init>("REDEYE", 5);
        g = new <init>("CROP", 6);
        h = new <init>("WHITEN", 7);
        i = new <init>("DRAW", 8);
        j = new <init>("STICKERS", 9);
        k = new <init>("TEXT", 10);
        l = new <init>("BLEMISH", 11);
        m = new <init>("MEME", 12);
        n = new <init>("ORIENTATION", 13);
        o = new <init>("ENHANCE", 14);
        p = new <init>("WARMTH", 15);
        q = new <init>("FRAMES", 16);
        r = new <init>("SPLASH", 17);
        s = new <init>("FOCUS", 18);
        t = new <init>("BLUR", 19);
        u = (new u[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
