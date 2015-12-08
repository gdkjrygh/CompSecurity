// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;


public final class mName extends Enum
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
    private static j k;
    private static j l;
    private static j m;
    private static j n;
    private static j o;
    private static final j p[];
    final String mName;

    public static mName valueOf(String s)
    {
        return (mName)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/AdEventReporter$Event, s);
    }

    public static mName[] values()
    {
        return (mName[])p.clone();
    }

    static 
    {
        a = new <init>("CLICK", 0, "clicked");
        b = new <init>("START", 1, "started");
        c = new <init>("IMPRESSION", 2, "viewed");
        d = new <init>("FIRST_QUARTILE", 3, "first_quartile");
        e = new <init>("MIDPOINT", 4, "midpoint");
        f = new <init>("THIRD_QUARTILE", 5, "third_quartile");
        g = new <init>("COMPLETE", 6, "ended");
        h = new <init>("PAUSE", 7, "paused");
        i = new <init>("RESUME", 8, "resumed");
        k = new <init>("MUTE", 9, "muted");
        l = new <init>("UNMUTE", 10, "unmuted");
        m = new <init>("EXPAND", 11, "expanded");
        n = new <init>("COLLAPSE", 12, "collapsed");
        o = new <init>("SKIPPED", 13, "skipped");
        j = new <init>("ERROR", 14, "errored");
        p = (new p[] {
            a, b, c, d, e, f, g, h, i, k, 
            l, m, n, o, j
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        mName = s1;
    }
}
