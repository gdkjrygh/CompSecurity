// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.stats;


public final class Reason extends Enum
{

    public static final Reason a;
    public static final Reason b;
    public static final Reason c;
    private static Reason d;
    private static Reason e;
    private static Reason f;
    private static final Reason g[];
    public String mReason;

    private Reason(String s, int i, String s1)
    {
        super(s, i);
        mReason = s1;
    }

    public static Reason a(String s)
    {
        Reason reason = f;
        reason.mReason = s;
        return reason;
    }

    public static Reason valueOf(String s)
    {
        return (Reason)Enum.valueOf(com/spotify/mobile/android/video/stats/Reason, s);
    }

    public static Reason[] values()
    {
        return (Reason[])g.clone();
    }

    static 
    {
        a = new Reason("END_TRACKERROR", 0, "trackerror");
        d = new Reason("END_INTERRUPTED", 1, "interupted");
        b = new Reason("END_TRACKDONE", 2, "trackdone");
        e = new Reason("END_UNKNOWN", 3, "unknown");
        c = new Reason("END_ENDPLAY", 4, "endplay");
        f = new Reason("UNMAPPED_STRING", 5, "");
        g = (new Reason[] {
            a, d, b, e, c, f
        });
    }
}
