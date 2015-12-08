// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.adapter;


public final class mPosition extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];
    private final int mPosition;

    public static mPosition valueOf(String s)
    {
        return (mPosition)Enum.valueOf(com/spotify/mobile/android/spotlets/activityfeed/adapter/ActivityFeedStoryAdapter$ViewType, s);
    }

    public static mPosition[] values()
    {
        return (mPosition[])f.clone();
    }

    static 
    {
        a = new <init>("AUTHOR", 0, 0);
        b = new <init>("CAPTION", 1, 1);
        c = new <init>("HAIRLINE", 2, 2);
        d = new <init>("LIST_ITEM_VIEW", 3, 3);
        e = new <init>("REPLAYS", 4, 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mPosition = j;
    }
}
