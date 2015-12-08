// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;


// Referenced classes of package com.tinder.adapters:
//            ActivityMainPagerAdapter

public static final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/tinder/adapters/ActivityMainPagerAdapter$ModalType, s);
    }

    public static [] values()
    {
        return ([])h.clone();
    }

    static 
    {
        a = new <init>("NONE", 0);
        b = new <init>("MATCH", 1);
        c = new <init>("MATCHES", 2);
        d = new <init>("MY_PROFILE", 3);
        e = new <init>("APP_SETTINGS", 4);
        f = new <init>("DISCOVER_SETTINGS", 5);
        g = new <init>("MOMENTS_SUNSET", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
