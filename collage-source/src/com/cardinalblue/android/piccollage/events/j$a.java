// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.events;


// Referenced classes of package com.cardinalblue.android.piccollage.events:
//            j

public static final class f extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e g[];
    private int f;

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/cardinalblue/android/piccollage/events/j$a, s);
    }

    public static f[] values()
    {
        return (f[])g.clone();
    }

    public int a()
    {
        return f;
    }

    static 
    {
        a = new <init>("PICCOLLAGE", 0, 0x7f07012a);
        b = new <init>("FACEBOOK", 1, 0x7f070128);
        c = new <init>("TWITTER", 2, 0x7f07012c);
        d = new <init>("TUMBLR", 3, 0x7f07012b);
        e = new <init>("KDDI", 4, 0x7f070129);
        g = (new g[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, int k)
    {
        super(s, i);
        f = k;
    }
}
