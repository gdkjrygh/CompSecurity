// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video;


public final class mType extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];
    final int mType;

    public static mType valueOf(String s)
    {
        return (mType)Enum.valueOf(com/spotify/mobile/android/video/VideoSurfaceView$ScaleType, s);
    }

    public static mType[] values()
    {
        return (mType[])d.clone();
    }

    static 
    {
        a = new <init>("ASPECT_FIT", 0, 16);
        b = new <init>("ASPECT_FILL", 1, 32);
        c = new <init>("STRETCH", 2, 64);
        d = (new d[] {
            a, b, c
        });
    }

    private A(String s, int i, int j)
    {
        super(s, i);
        mType = j;
    }
}
