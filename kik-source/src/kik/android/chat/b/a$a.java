// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import android.graphics.Color;

// Referenced classes of package kik.android.chat.b:
//            a

public static final class r extends Enum
{

    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    private static final p s[];
    int q;
    String r;

    public static r valueOf(String s1)
    {
        return (r)Enum.valueOf(kik/android/chat/b/a$a, s1);
    }

    public static r[] values()
    {
        return (r[])s.clone();
    }

    public final String a()
    {
        return r;
    }

    static 
    {
        a = new <init>("KIK_BLUE", 0, "#42B4E6", "Kik Blue");
        b = new <init>("TURQUOISE", 1, "#42DFD8", "Turquoise");
        c = new <init>("MINT", 2, "#24D7A7", "Mint");
        d = new <init>("FOREST", 3, "#25912B", "Forest");
        e = new <init>("KIK_GREEN", 4, "#87D300", "Kik Green");
        f = new <init>("SUNSHINE", 5, "#F8CB1C", "Sunshine");
        g = new <init>("ORANGE_CREAMSICLE", 6, "#FC971B", "Orange Creamsicle");
        h = new <init>("BLOOD_ORANGE", 7, "#F9703A", "Blood Orange");
        i = new <init>("CANDY_APPLE_RED", 8, "#F7373C", "Candy Apple Red");
        j = new <init>("SALMON", 9, "#F88585", "Salmon");
        k = new <init>("CORAL", 10, "#F767C3", "Coral");
        l = new <init>("CRANBERRY", 11, "#940D65", "Cranberry");
        m = new <init>("LAVENDER", 12, "#CB94FF", "Lavender");
        n = new <init>("ROYAL_PURPLE", 13, "#8737F8", "Royal Purple");
        o = new <init>("MARINE", 14, "#353CD4", "Marine");
        p = new <init>("STEEL_BLUE", 15, "#5D7687", "Steel Blue");
        s = (new s[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p
        });
    }

    private (String s1, int i1, String s2, String s3)
    {
        super(s1, i1);
        q = Color.parseColor(s2);
        r = s3;
    }
}
