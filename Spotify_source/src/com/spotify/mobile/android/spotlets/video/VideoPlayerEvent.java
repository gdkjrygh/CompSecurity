// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.os.Parcel;

public final class VideoPlayerEvent extends Enum
{

    public static final VideoPlayerEvent a;
    public static final VideoPlayerEvent b;
    public static final VideoPlayerEvent c;
    private static final VideoPlayerEvent d[];

    private VideoPlayerEvent(String s, int i)
    {
        super(s, i);
    }

    public static VideoPlayerEvent valueOf(String s)
    {
        return (VideoPlayerEvent)Enum.valueOf(com/spotify/mobile/android/spotlets/video/VideoPlayerEvent, s);
    }

    public static VideoPlayerEvent[] values()
    {
        return (VideoPlayerEvent[])d.clone();
    }

    static 
    {
        a = new VideoPlayerEvent("ACTIVATED", 0);
        b = new VideoPlayerEvent("STATE_CHANGE", 1);
        c = new VideoPlayerEvent("CLOSED", 2);
        d = (new VideoPlayerEvent[] {
            a, b, c
        });
        new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return VideoPlayerEvent.valueOf(parcel.readString());
            }

            public final volatile Object[] newArray(int i)
            {
                return new VideoPlayerEvent[i];
            }

        };
    }
}
