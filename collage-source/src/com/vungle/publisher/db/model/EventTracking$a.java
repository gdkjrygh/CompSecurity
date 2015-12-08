// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.db.model;


// Referenced classes of package com.vungle.publisher.db.model:
//            EventTracking

public static final class p extends Enum
{

    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final o k;
    public static final o l;
    public static final o m;
    public static final o n;
    public static final o o;
    private static final o q[];
    public final float p;

    public static p valueOf(String s)
    {
        return (p)Enum.valueOf(com/vungle/publisher/db/model/EventTracking$a, s);
    }

    public static p[] values()
    {
        return (p[])q.clone();
    }

    static 
    {
        a = new <init>("error", 0);
        b = new <init>("mute", 1);
        c = new <init>("play_percentage_0", 2, 0.0F);
        d = new <init>("play_percentage_25", 3, 0.25F);
        e = new <init>("play_percentage_50", 4, 0.5F);
        f = new <init>("play_percentage_75", 5, 0.75F);
        g = new <init>("play_percentage_80", 6, 0.8F);
        h = new <init>("play_percentage_100", 7, 0.99F);
        i = new <init>("postroll_click", 8);
        j = new <init>("postroll_view", 9);
        k = new <init>("unmute", 10);
        l = new <init>("video_click", 11);
        m = new <init>("video_close", 12);
        n = new <init>("video_pause", 13);
        o = new <init>("video_resume", 14);
        q = (new q[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }

    private (String s, int i1)
    {
        this(s, i1, -1F);
    }

    private <init>(String s, int i1, float f1)
    {
        super(s, i1);
        p = f1;
    }
}
