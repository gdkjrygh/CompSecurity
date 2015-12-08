// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;


// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            f

public static final class q extends Enum
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
    private static final p r[];
    private final String q;

    public static q a(String s)
    {
        q aq[] = values();
        int j1 = aq.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            q q1 = aq[i1];
            if (q1.a().equals(s))
            {
                return q1;
            }
        }

        return a;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/cardinalblue/android/piccollage/model/f$h, s);
    }

    public static a[] values()
    {
        return (a[])r.clone();
    }

    public String a()
    {
        return q;
    }

    static 
    {
        a = new <init>("FRAME_0", 0, "free");
        b = new <init>("FRAME_2_1", 1, "1x2");
        c = new <init>("FRAME_2_2", 2, "1 small top + 1 bigger bottom");
        d = new <init>("FRAME_2_3", 3, "1 bigger top + 1 small bottom");
        e = new <init>("FRAME_2_4", 4, "2x1");
        f = new <init>("FRAME_3_1", 5, "1x3");
        g = new <init>("FRAME_3_2", 6, "1+2");
        h = new <init>("FRAME_3_3", 7, "3x1");
        i = new <init>("FRAME_4_1", 8, "2x2");
        j = new <init>("FRAME_4_2", 9, "1x4");
        k = new <init>("FRAME_4_3", 10, "1 top + 3 bottom");
        l = new <init>("FRAME_4_4", 11, "3 top + 1 bottom");
        m = new <init>("FRAME_5_1", 12, "1 + 2 + 2");
        n = new <init>("FRAME_5_2", 13, "2 + 1 + 2");
        o = new <init>("FRAME_6_1", 14, "2x3");
        p = new <init>("FRAME_9_1", 15, "3x3");
        r = (new r[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        q = s1;
    }
}
