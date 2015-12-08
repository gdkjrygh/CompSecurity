// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video;


public final class VideoSurfacePriority extends Enum
{

    public static final VideoSurfacePriority a;
    public static final VideoSurfacePriority b;
    public static final VideoSurfacePriority c;
    private static final VideoSurfacePriority d[];

    private VideoSurfacePriority(String s, int i)
    {
        super(s, i);
    }

    public static VideoSurfacePriority valueOf(String s)
    {
        return (VideoSurfacePriority)Enum.valueOf(com/spotify/mobile/android/video/VideoSurfacePriority, s);
    }

    public static VideoSurfacePriority[] values()
    {
        return (VideoSurfacePriority[])d.clone();
    }

    static 
    {
        a = new VideoSurfacePriority("LOW", 0);
        b = new VideoSurfacePriority("MEDIUM", 1);
        c = new VideoSurfacePriority("HIGH", 2);
        d = (new VideoSurfacePriority[] {
            a, b, c
        });
    }
}
