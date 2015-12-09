// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class TopArtistModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new TopArtistModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new TopArtistModel[i];
        }

    };
    private final int mFollowersCount;
    private final String mImageUrl;
    private final String mName;
    private final String mUri;

    private TopArtistModel(Parcel parcel)
    {
        mName = parcel.readString();
        mImageUrl = parcel.readString();
        mUri = parcel.readString();
        mFollowersCount = parcel.readInt();
    }


    public TopArtistModel(String s, String s1, String s2, int i)
    {
        mName = s;
        mImageUrl = s1;
        mUri = s2;
        mFollowersCount = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TopArtistModel)
        {
            if (this == obj)
            {
                return true;
            }
            obj = (TopArtistModel)obj;
            if (TextUtils.equals(mName, ((TopArtistModel) (obj)).mName) && TextUtils.equals(mImageUrl, ((TopArtistModel) (obj)).mImageUrl) && TextUtils.equals(mUri, ((TopArtistModel) (obj)).mUri) && mFollowersCount == ((TopArtistModel) (obj)).mFollowersCount)
            {
                return true;
            }
        }
        return false;
    }

    public int getFollowersCount()
    {
        return mFollowersCount;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public String getName()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (mImageUrl != null)
        {
            j = mImageUrl.hashCode();
        } else
        {
            j = 0;
        }
        if (mUri != null)
        {
            k = mUri.hashCode();
        }
        return ((j + i * 31) * 31 + k) * 31 + mFollowersCount;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mName);
        parcel.writeString(mImageUrl);
        parcel.writeString(mUri);
        parcel.writeInt(mFollowersCount);
    }

}
