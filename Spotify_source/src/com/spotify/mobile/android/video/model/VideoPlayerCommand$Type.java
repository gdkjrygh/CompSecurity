// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;


public final class  extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static g h;
    private static final g i[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/video/model/VideoPlayerCommand$Type, s);
    }

    public static [] values()
    {
        return ([])i.clone();
    }

    static 
    {
        h = new <init>("SUBSCRIBED", 0);
        a = new <init>("START", 1);
        b = new <init>("STOP", 2);
        c = new <init>("PAUSE", 3);
        d = new <init>("RESUME", 4);
        e = new <init>("SEEK_TO", 5);
        f = new <init>("PREFETCH_TRACKS", 6);
        g = new <init>("UNKNOWN", 7);
        i = (new i[] {
            h, a, b, c, d, e, f, g
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
