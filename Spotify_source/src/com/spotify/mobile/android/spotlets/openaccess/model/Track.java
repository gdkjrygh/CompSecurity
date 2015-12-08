// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.openaccess.model:
//            SimpleArtist

public class Track
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Track(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Track[i];
        }

    };
    private String mArtistString;
    private final SimpleArtist mArtists[];
    private final String mId;
    private boolean mIsCurrentTrack;
    private boolean mIsPlaying;
    private final String mName;
    private final String mPreviewUrl;
    private float mProgress;
    private final String mType;
    private final String mUri;

    protected Track(Parcel parcel)
    {
        mArtistString = "";
        mId = parcel.readString();
        mName = parcel.readString();
        mType = parcel.readString();
        mArtists = new SimpleArtist[0];
        parcel.readTypedArray(mArtists, SimpleArtist.CREATOR);
        buildArtistString();
        mUri = parcel.readString();
        mPreviewUrl = parcel.readString();
    }

    private Track(String s, String s1, String s2, SimpleArtist asimpleartist[], String s3, String s4)
    {
        mArtistString = "";
        mId = s;
        mName = s1;
        mType = s2;
        mArtists = asimpleartist;
        mUri = s3;
        mPreviewUrl = s4;
        buildArtistString();
    }

    private void buildArtistString()
    {
        if (mArtists == null || mArtists.length == 0)
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(mArtists[0].getName());
        for (int i = 1; i < mArtists.length; i++)
        {
            stringbuilder.append(", ");
            stringbuilder.append(mArtists[i].getName());
        }

        mArtistString = stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getArtistString()
    {
        return mArtistString;
    }

    public SimpleArtist[] getArtists()
    {
        return mArtists;
    }

    public String getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public String getPreviewUrl()
    {
        return mPreviewUrl;
    }

    public float getProgress()
    {
        return mProgress;
    }

    public String getType()
    {
        return mType;
    }

    public String getUri()
    {
        return mUri;
    }

    public boolean isCurrentTrack()
    {
        return mIsCurrentTrack;
    }

    public boolean isPlaying()
    {
        return mIsPlaying;
    }

    public void setIsCurrentTrack(boolean flag)
    {
        mIsCurrentTrack = flag;
    }

    public void setIsPlaying(boolean flag)
    {
        mIsPlaying = flag;
    }

    public void setProgress(float f)
    {
        mProgress = f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mName);
        parcel.writeString(mType);
        parcel.writeArray(mArtists);
        parcel.writeString(mUri);
        parcel.writeString(mPreviewUrl);
    }

}
