// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy;


public final class q extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(com/spotify/music/spotlets/networkoperatorpremiumactivation/legacy/NetworkOperatorConnectivityChecker$State, s);
    }

    public static q[] values()
    {
        return (q[])h.clone();
    }

    static 
    {
        a = new <init>("INITIALIZED", 0);
        b = new <init>("WAITING_FOR_OPERATOR", 1);
        c = new <init>("WAITING_FOR_MOBILE_CONNECTION", 2);
        d = new <init>("RESULT_CONNECTED_TO_OPERATOR", 3);
        e = new <init>("RESULT_NO_MOBILE", 4);
        f = new <init>("RESULT_WRONG_OPERATOR", 5);
        g = new <init>("STOPPED", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private q(String s, int i)
    {
        super(s, i);
    }
}
