// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class InfluencerModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new InfluencerModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new InfluencerModel[i];
        }

    };
    private final String mImageUrl;
    private final String mName;
    private final int mPlays;
    private final String mUri;
    private final String mUsername;

    public InfluencerModel(Parcel parcel)
    {
        mUri = parcel.readString();
        mName = parcel.readString();
        mImageUrl = parcel.readString();
        mPlays = parcel.readInt();
        mUsername = parcel.readString();
    }

    public InfluencerModel(String s, String s1, String s2, int i, String s3)
    {
        mUri = s;
        if (TextUtils.isEmpty(s1))
        {
            mName = s3;
        } else
        {
            mName = s1;
        }
        mImageUrl = s2;
        mPlays = i;
        mUsername = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (InfluencerModel)obj;
            if (!mImageUrl.equals(((InfluencerModel) (obj)).mImageUrl))
            {
                return false;
            }
            if (!mName.equals(((InfluencerModel) (obj)).mName))
            {
                return false;
            }
            if (!mUri.equals(((InfluencerModel) (obj)).mUri))
            {
                return false;
            }
            if (!mUsername.equals(((InfluencerModel) (obj)).mUsername))
            {
                return false;
            }
        }
        return true;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public CharSequence getName()
    {
        return mName;
    }

    public int getPlays()
    {
        return mPlays;
    }

    public String getUri()
    {
        return mUri;
    }

    public String getUsername()
    {
        return mUsername;
    }

    public int hashCode()
    {
        return ((mUri.hashCode() * 31 + mName.hashCode()) * 31 + mImageUrl.hashCode()) * 31 + mUsername.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mName);
        parcel.writeString(mImageUrl);
        parcel.writeInt(mPlays);
        parcel.writeString(mUsername);
    }

}
