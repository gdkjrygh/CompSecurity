// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.a.e;
import com.google.b.j;
import com.google.b.k;
import com.google.b.l;
import com.google.b.o;
import com.google.b.p;
import java.lang.reflect.Type;

public class CBYoutubeData
    implements Parcelable
{
    public static class CBYoutubeDataDeserializer
        implements k
    {

        private static final String FIELD_CHANNEL_TITLE = "channel_title";
        private static final String FIELD_SOURCE_URL = "source_url";
        private static final String FIELD_TITLE = "title";
        private static final String FIELD_VIDEO_THUMB = "video_thumb";
        private static final String FIELD_VIDEO_THUMB_URL_DEFAULT = "default_url";
        private static final String FIELD_VIDEO_THUMB_URL_HIGH = "high_url";
        private static final String FIELD_VIDEO_THUMB_URL_MEDIUM = "medium_url";

        public CBYoutubeData deserialize(l l1, Type type, j j)
            throws p
        {
            type = new CBYoutubeData();
            l1 = l1.m();
            if (l1.b("title"))
            {
                type.setTitle(e.a(l1, "title", ""));
            }
            if (l1.b("source_url"))
            {
                type.setSourceUrl(e.a(l1, "source_url", ""));
            }
            if (l1.b("channel_title"))
            {
                type.setChannelTitle(e.a(l1, "channel_title", ""));
            }
            if (l1.b("video_thumb"))
            {
                l1 = l1.e("video_thumb");
                type.setVideoThumbUrlDefault(e.a(l1, "default_url", ""));
                type.setmVideoThumbUrlMedium(e.a(l1, "medium_url", ""));
                type.setmVideoThumbUrlHigh(e.a(l1, "high_url", ""));
            }
            return type;
        }

        public volatile Object deserialize(l l1, Type type, j j)
            throws p
        {
            return deserialize(l1, type, j);
        }

        public CBYoutubeDataDeserializer()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public CBYoutubeData createFromParcel(Parcel parcel)
        {
            return new CBYoutubeData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CBYoutubeData[] newArray(int i)
        {
            return new CBYoutubeData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    String mChannelTitle;
    String mSourceUrl;
    String mTitle;
    String mVideoThumbUrlDefault;
    String mVideoThumbUrlHigh;
    String mVideoThumbUrlMedium;

    CBYoutubeData()
    {
        mTitle = "";
        mSourceUrl = "";
        mChannelTitle = "";
        mVideoThumbUrlDefault = "";
        mVideoThumbUrlMedium = "";
        mVideoThumbUrlHigh = "";
    }

    CBYoutubeData(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel)
    {
        mTitle = parcel.readString();
        mSourceUrl = parcel.readString();
        mChannelTitle = parcel.readString();
        mVideoThumbUrlDefault = parcel.readString();
        mVideoThumbUrlMedium = parcel.readString();
        mVideoThumbUrlHigh = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getChannelTitle()
    {
        return mChannelTitle;
    }

    public String getSourceUrl()
    {
        return mSourceUrl;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getVideoThumbUrlDefault()
    {
        return mVideoThumbUrlDefault;
    }

    public String getVideoThumbUrlHigh()
    {
        return mVideoThumbUrlHigh;
    }

    public String getVideoThumbUrlMedium()
    {
        return mVideoThumbUrlMedium;
    }

    void setChannelTitle(String s)
    {
        mChannelTitle = s;
    }

    void setSourceUrl(String s)
    {
        mSourceUrl = s;
    }

    void setTitle(String s)
    {
        mTitle = s;
    }

    void setVideoThumbUrlDefault(String s)
    {
        mVideoThumbUrlDefault = s;
    }

    void setmVideoThumbUrlHigh(String s)
    {
        mVideoThumbUrlHigh = s;
    }

    void setmVideoThumbUrlMedium(String s)
    {
        mVideoThumbUrlMedium = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mTitle);
        parcel.writeString(mSourceUrl);
        parcel.writeString(mChannelTitle);
        parcel.writeString(mVideoThumbUrlDefault);
        parcel.writeString(mVideoThumbUrlMedium);
        parcel.writeString(mVideoThumbUrlHigh);
    }

}
