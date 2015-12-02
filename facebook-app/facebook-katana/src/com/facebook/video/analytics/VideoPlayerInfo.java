// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoPlayerInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private VideoAnalytics.PlayerType a;
    private VideoAnalytics.PlayerOrigin b;

    private VideoPlayerInfo(Parcel parcel)
    {
        b = VideoAnalytics.PlayerOrigin.UNKNOWN;
        a = VideoAnalytics.PlayerType.asPlayerType(parcel.readString());
        b = VideoAnalytics.PlayerOrigin.asPlayerOrigin(parcel.readString());
    }

    VideoPlayerInfo(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public VideoPlayerInfo(VideoAnalytics.PlayerType playertype)
    {
        b = VideoAnalytics.PlayerOrigin.UNKNOWN;
        a = playertype;
    }

    public final VideoAnalytics.PlayerOrigin a()
    {
        return b;
    }

    public final void a(VideoAnalytics.PlayerOrigin playerorigin)
    {
        b = playerorigin;
    }

    public final VideoAnalytics.PlayerType b()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.value);
        parcel.writeString(b.asString());
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoPlayerInfo a(Parcel parcel)
        {
            return new VideoPlayerInfo(parcel, (byte)0);
        }

        private static VideoPlayerInfo[] a(int i)
        {
            return new VideoPlayerInfo[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

        _cls1()
        {
        }
    }

}
