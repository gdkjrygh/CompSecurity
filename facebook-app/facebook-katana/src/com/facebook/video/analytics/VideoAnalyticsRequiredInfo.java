// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoAnalyticsRequiredInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String a;

    public VideoAnalyticsRequiredInfo()
    {
    }

    private VideoAnalyticsRequiredInfo(Parcel parcel)
    {
        a = parcel.readString();
    }

    VideoAnalyticsRequiredInfo(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public VideoAnalyticsRequiredInfo(Builder builder)
    {
        a = builder.a;
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        a = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }


    private class Builder
    {

        public final String a;

        public final VideoAnalyticsRequiredInfo a()
        {
            return new VideoAnalyticsRequiredInfo(this);
        }

        public Builder(String s)
        {
            a = s;
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoAnalyticsRequiredInfo a(Parcel parcel)
        {
            return new VideoAnalyticsRequiredInfo(parcel, (byte)0);
        }

        private static VideoAnalyticsRequiredInfo[] a(int i)
        {
            return new VideoAnalyticsRequiredInfo[i];
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
