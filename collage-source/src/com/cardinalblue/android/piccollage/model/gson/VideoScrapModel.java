// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.view.o;
import com.google.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ImageScrapModel

public class VideoScrapModel extends ImageScrapModel
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public VideoScrapModel createFromParcel(Parcel parcel)
        {
            return new VideoScrapModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoScrapModel[] newArray(int i)
        {
            return new VideoScrapModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }

    public static class VideoModel
        implements Parcelable, h
    {

        public static final android.os.Parcelable.Creator CREATOR = new Creator();
        private String sourceUrl;
        private String title;
        private String videoThumbDefault;
        private String videoThumbHigh;
        private String videoThumbMedium;

        public VideoModel createInstance(Type type)
        {
            return new VideoModel();
        }

        public volatile Object createInstance(Type type)
        {
            return createInstance(type);
        }

        public int describeContents()
        {
            return 0;
        }

        public String getSourceUrl()
        {
            return sourceUrl;
        }

        public String getTitle()
        {
            return title;
        }

        public String getVideoThumbDefault()
        {
            return videoThumbDefault;
        }

        public String getVideoThumbHigh()
        {
            return videoThumbHigh;
        }

        public String getVideoThumbMedium()
        {
            return videoThumbMedium;
        }

        public void readFromParcel(Parcel parcel)
        {
            title = parcel.readString();
            sourceUrl = parcel.readString();
            videoThumbDefault = parcel.readString();
            videoThumbMedium = parcel.readString();
            videoThumbHigh = parcel.readString();
        }

        protected void setSourceUrl(String s)
        {
            sourceUrl = s;
        }

        public void setTitle(String s)
        {
            title = s;
        }

        public void setVideoThumbDefault(String s)
        {
            videoThumbDefault = s;
        }

        public void setVideoThumbHigh(String s)
        {
            videoThumbHigh = s;
        }

        public void setVideoThumbMedium(String s)
        {
            videoThumbMedium = s;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(getTitle());
            parcel.writeString(getSourceUrl());
            parcel.writeString(getVideoThumbDefault());
            parcel.writeString(getVideoThumbMedium());
            parcel.writeString(getVideoThumbHigh());
        }


        VideoModel()
        {
        }

        VideoModel(Parcel parcel)
        {
            readFromParcel(parcel);
        }
    }

    public static class VideoModel.Creator
        implements android.os.Parcelable.Creator
    {

        public VideoModel createFromParcel(Parcel parcel)
        {
            return new VideoModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoModel[] newArray(int i)
        {
            return new VideoModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public VideoModel.Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    public static String TYPE_VIDEO_SCRAP = "video";
    private VideoModel mVideo;

    VideoScrapModel(Parcel parcel)
    {
        super(parcel);
        mVideo = (VideoModel)parcel.readParcelable(VideoModel.CREATOR.getClass().getClassLoader());
    }

    VideoScrapModel(o o1)
    {
        super(o1);
        mVideo = new VideoModel();
        mVideo.setTitle(o1.ah());
        mVideo.setSourceUrl(o1.ag());
        mVideo.setVideoThumbDefault(o1.ai());
        mVideo.setVideoThumbMedium(o1.aj());
        mVideo.setVideoThumbHigh(o1.ak());
        setScrapType(TYPE_VIDEO_SCRAP);
    }

    public static VideoScrapModel newInstance(o o1)
    {
        return new VideoScrapModel(o1);
    }

    public int describeContents()
    {
        return 0;
    }

    public VideoModel getVideoModel()
    {
        return mVideo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getVideoModel(), i);
    }

}
