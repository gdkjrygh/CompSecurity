// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

public class ResultModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ResultModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ResultModel[i];
        }

    };
    private final String mImage;
    private boolean mIsFollowing;
    private final String mTitle;
    private final String mUri;

    public ResultModel(Parcel parcel)
    {
        mUri = parcel.readString();
        mTitle = parcel.readString();
        mImage = parcel.readString();
        mIsFollowing = gen.a(parcel);
    }

    public ResultModel(String s, String s1, String s2, boolean flag)
    {
        mUri = s;
        mTitle = s1;
        s = s2;
        if (s2 == null)
        {
            s = "";
        }
        mImage = s;
        mIsFollowing = flag;
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
            obj = (ResultModel)obj;
            if (mIsFollowing != ((ResultModel) (obj)).mIsFollowing)
            {
                return false;
            }
            if (!mImage.equals(((ResultModel) (obj)).mImage))
            {
                return false;
            }
            if (!mTitle.equals(((ResultModel) (obj)).mTitle))
            {
                return false;
            }
            if (!mUri.equals(((ResultModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getImage()
    {
        return mImage;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int j = mUri.hashCode();
        int k = mTitle.hashCode();
        int l = mImage.hashCode();
        int i;
        if (mIsFollowing)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + ((j * 31 + k) * 31 + l) * 31;
    }

    public boolean isFollowing()
    {
        return mIsFollowing;
    }

    public String toString()
    {
        return mTitle;
    }

    public void toggleFollowing()
    {
        boolean flag;
        if (!mIsFollowing)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsFollowing = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mTitle);
        parcel.writeString(mImage);
        gen.a(parcel, mIsFollowing);
    }

}
