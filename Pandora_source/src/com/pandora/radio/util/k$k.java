// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
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
    private static final o p[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$k, s);
    }

    public static [] values()
    {
        return ([])p.clone();
    }

    static 
    {
        a = new <init>("app_install", 0);
        b = new <init>("initial_app_load", 1);
        c = new <init>("login_screen_shown", 2);
        d = new <init>("login_button_tapped", 3);
        e = new <init>("login_failed", 4);
        f = new <init>("login_succeeded", 5);
        g = new <init>("forget_password_tapped", 6);
        h = new <init>("go_back_button_tapped_from_forgot_password", 7);
        i = new <init>("registration_screen_shown", 8);
        j = new <init>("register_button_tapped", 9);
        k = new <init>("registration_failed", 10);
        l = new <init>("go_back_button_tapped_from_registration", 11);
        m = new <init>("registration_succeeded", 12);
        n = new <init>("welcome_screen_dismissed", 13);
        o = new <init>("initial_station_created", 14);
        p = (new p[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
