// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;


public final class  extends Enum
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
        return ()Enum.valueOf(com/spotify/mobile/android/spotlets/videoplayer/VideoPresenter$Action, s);
    }

    public static [] values()
    {
        return ([])j.clone();
    }

    static 
    {
        a = new <init>("COLLAPSE", 0);
        b = new <init>("SKIP_15_BACKWARD", 1);
        c = new <init>("PLAY_PREVIOUS", 2);
        d = new <init>("PLAY_PAUSE", 3);
        e = new <init>("PLAY_NEXT", 4);
        f = new <init>("SKIP_15_FORWARD", 5);
        g = new <init>("CONTEXT_MENU", 6);
        h = new <init>("TAP_VIDEO", 7);
        i = new <init>("TAP_VIDEO_OUTSIDE", 8);
        j = (new j[] {
            a, b, c, d, e, f, g, h, i
        });
    }

    private (String s, int k)
    {
        super(s, k);
    }
}
