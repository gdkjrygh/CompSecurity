// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;


public final class  extends Enum
{

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    private static final j k[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService$PlayerState, s);
    }

    public static [] values()
    {
        return ([])k.clone();
    }

    static 
    {
        a = new <init>("NULL", 0);
        b = new <init>("INITIALISING", 1);
        c = new <init>("CREATED", 2);
        d = new <init>("PREPARING", 3);
        e = new <init>("BUFFERING", 4);
        f = new <init>("PREPARED", 5);
        g = new <init>("COMPLETED", 6);
        h = new <init>("STOPPING", 7);
        i = new <init>("RELEASING", 8);
        j = new <init>("ERROR", 9);
        k = (new k[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }

    private (String s, int l)
    {
        super(s, l);
    }
}
