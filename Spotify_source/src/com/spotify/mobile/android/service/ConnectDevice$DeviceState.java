// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;


public final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static f g;
    private static f h;
    private static final f i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/service/ConnectDevice$DeviceState, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        a = new <init>("CONNECTING", 0);
        b = new <init>("INCOMPATIBLE", 1);
        c = new <init>("UNAVAILABLE", 2);
        g = new <init>("LOGGED_IN", 3);
        d = new <init>("NOT_LOGGED_IN", 4);
        e = new <init>("PREMIUM_REQUIRED", 5);
        h = new <init>("NOT_INSTALLED", 6);
        f = new <init>("UNSUPPORTED_URI", 7);
        i = (new i[] {
            a, b, c, g, d, e, h, f
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
