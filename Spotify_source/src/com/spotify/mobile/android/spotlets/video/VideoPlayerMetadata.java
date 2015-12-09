// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.os.Parcel;
import android.os.Parcelable;
import gen;

public class VideoPlayerMetadata
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new VideoPlayerMetadata(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new VideoPlayerMetadata[i];
        }

    };
    public String a;
    public String b;
    public long c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;

    private VideoPlayerMetadata(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readLong();
        d = parcel.readString();
        e = parcel.readString();
        f = gen.a(parcel);
        g = gen.a(parcel);
        h = gen.a(parcel);
    }

    VideoPlayerMetadata(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public VideoPlayerMetadata(String s, String s1, long l, String s2, String s3, boolean flag)
    {
        a = s;
        b = s1;
        c = l;
        d = s2;
        e = s3;
        f = flag;
        g = false;
        h = true;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(com/spotify/mobile/android/spotlets/video/VideoPlayerMetadata.getSimpleName()).append("{, mTitle=").append(a).append(", mArtist=").append(b).append(", mDuration=").append(c).append(", mImageUrl=").append(d).append(", mClickUrl=").append(e).append(", mNextEnabled=").append(f).append(", mNextEnabled=").append(g).append(", mIsPaused=").append(h).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeLong(c);
        parcel.writeString(d);
        parcel.writeString(e);
        gen.a(parcel, f);
        gen.a(parcel, g);
        gen.a(parcel, h);
    }

}
