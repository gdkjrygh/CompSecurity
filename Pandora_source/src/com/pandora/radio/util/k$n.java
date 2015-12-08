// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
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

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$n, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("skipped", 0);
        b = new <init>("thumbed_down", 1);
        c = new <init>("station_changed", 2);
        d = new <init>("completed", 3);
        e = new <init>("discarded", 4);
        f = new <init>("error", 5);
        g = new <init>("expired", 6);
        h = new <init>("test_ad", 7);
        i = new <init>("premature_end_of_play", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int l)
    {
        super(s, l);
    }
}
