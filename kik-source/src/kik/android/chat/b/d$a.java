// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import android.graphics.Color;

// Referenced classes of package kik.android.chat.b:
//            d

public static final class x extends Enum
{

    public static final v a;
    public static final v b;
    public static final v c;
    public static final v d;
    public static final v e;
    public static final v f;
    public static final v g;
    public static final v h;
    public static final v i;
    public static final v j;
    public static final v k;
    public static final v l;
    public static final v m;
    public static final v n;
    public static final v o;
    public static final v p;
    public static final v q;
    public static final v r;
    public static final v s;
    public static final v t;
    public static final v u;
    public static final v v;
    private static final v y[];
    int w;
    String x;

    public static x valueOf(String s1)
    {
        return (x)Enum.valueOf(kik/android/chat/b/d$a, s1);
    }

    public static x[] values()
    {
        return (x[])y.clone();
    }

    static 
    {
        a = new <init>("CRIMSON", 0, "#F62222", "Bright Red");
        b = new <init>("PINK", 1, "#FF69A3", "Bright Pink");
        c = new <init>("VIOLET", 2, "#B424DF", "Bright Magenta");
        d = new <init>("INDIGO", 3, "#8737F8", "Bright Violet");
        e = new <init>("COBALT", 4, "#309DFF", "Bright Blue");
        f = new <init>("FOREST", 5, "#00A650", "Bright Green");
        g = new <init>("GREEN", 6, "#91D013", "Bright Kik Green");
        h = new <init>("GOLD", 7, "#FFD200", "Bright Yellow");
        i = new <init>("ORANGE", 8, "#FF8900", "Bright Orange");
        j = new <init>("BROWN", 9, "#784834", "Bright Brown");
        k = new <init>("STEEL", 10, "#8D92A8", "Bright Grey");
        l = new <init>("SALMON", 11, "#FD6A6C", "Light Red");
        m = new <init>("BLUSH", 12, "#FEA7B9", "Light Pink");
        n = new <init>("MAUVE", 13, "#CD9AEC", "Light Magenta");
        o = new <init>("LAVENDER", 14, "#B5B8F8", "Light Violet");
        p = new <init>("BABY_BLUE", 15, "#87BEFF", "Light Blue");
        q = new <init>("MINT", 16, "#97F2C3", "Light Aqua");
        r = new <init>("LIME", 17, "#BBE061", "Light Kik Green");
        s = new <init>("LEMON", 18, "#F9E560", "Light Yellow");
        t = new <init>("TANGERINE", 19, "#FFB43F", "Light Orange");
        u = new <init>("COCONUT", 20, "#CFA075", "Light Brown");
        v = new <init>("ASH", 21, "#E5E5EA", "Light Grey");
        y = (new y[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v
        });
    }

    private (String s1, int i1, String s2, String s3)
    {
        super(s1, i1);
        w = Color.parseColor(s2);
        x = s3;
    }
}
