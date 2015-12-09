// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
{

    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    public static final y f;
    public static final y g;
    public static final y h;
    public static final y i;
    public static final y j;
    public static final y k;
    public static final y l;
    public static final y m;
    public static final y n;
    public static final y o;
    public static final y p;
    public static final y q;
    public static final y r;
    public static final y s;
    public static final y t;
    public static final y u;
    public static final y v;
    public static final y w;
    public static final y x;
    public static final y y;
    private static final y z[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$p, s1);
    }

    public static [] values()
    {
        return ([])z.clone();
    }

    static 
    {
        a = new <init>("initiate", 0);
        b = new <init>("start", 1);
        c = new <init>("first_quartile", 2);
        d = new <init>("second_quartile", 3);
        e = new <init>("third_quartile", 4);
        f = new <init>("more_info", 5);
        g = new <init>("complete", 6);
        h = new <init>("resume", 7);
        i = new <init>("error", 8);
        j = new <init>("skip", 9);
        k = new <init>("pause", 10);
        l = new <init>("unpause", 11);
        m = new <init>("background", 12);
        n = new <init>("screen_locked", 13);
        o = new <init>("mute", 14);
        p = new <init>("unmute", 15);
        q = new <init>("banner_render", 16);
        r = new <init>("banner_render_dark", 17);
        s = new <init>("banner_display_after_dark", 18);
        t = new <init>("skip_prompt_shown", 19);
        u = new <init>("skip_prompt_resume_touched", 20);
        v = new <init>("buffer_error", 21);
        w = new <init>("resume_from_coachmark", 22);
        x = new <init>("resume_coachmark_displayed", 23);
        y = new <init>("skip_from_coachmark", 24);
        z = (new z[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
