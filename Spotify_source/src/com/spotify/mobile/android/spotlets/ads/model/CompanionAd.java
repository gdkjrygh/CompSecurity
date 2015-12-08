// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

public class CompanionAd
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new CompanionAd(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new CompanionAd[i];
        }

    };
    private final int mBitrate;
    private final boolean mHasDisplay;
    private final int mHeight;
    private final boolean mLockedRatio;
    private final String mMimeType;
    private final boolean mScalable;
    private final String mUrl;
    private final int mWidth;

    private CompanionAd(Parcel parcel)
    {
        mMimeType = parcel.readString();
        mWidth = parcel.readInt();
        mHeight = parcel.readInt();
        mScalable = gen.a(parcel);
        mLockedRatio = gen.a(parcel);
        mHasDisplay = gen.a(parcel);
        mBitrate = parcel.readInt();
        mUrl = parcel.readString();
    }


    public CompanionAd(String s, int i, int j, boolean flag, boolean flag1, boolean flag2, int k, 
            String s1)
    {
        mMimeType = s;
        mWidth = i;
        mHeight = j;
        mScalable = flag;
        mLockedRatio = flag1;
        mHasDisplay = flag2;
        mBitrate = k;
        mUrl = s1;
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
            obj = (CompanionAd)obj;
            if (mBitrate != ((CompanionAd) (obj)).mBitrate)
            {
                return false;
            }
            if (mHasDisplay != ((CompanionAd) (obj)).mHasDisplay)
            {
                return false;
            }
            if (mHeight != ((CompanionAd) (obj)).mHeight)
            {
                return false;
            }
            if (mLockedRatio != ((CompanionAd) (obj)).mLockedRatio)
            {
                return false;
            }
            if (mScalable != ((CompanionAd) (obj)).mScalable)
            {
                return false;
            }
            if (mWidth != ((CompanionAd) (obj)).mWidth)
            {
                return false;
            }
            if (mMimeType == null ? ((CompanionAd) (obj)).mMimeType != null : !mMimeType.equals(((CompanionAd) (obj)).mMimeType))
            {
                return false;
            }
            if (mUrl == null ? ((CompanionAd) (obj)).mUrl != null : !mUrl.equals(((CompanionAd) (obj)).mUrl))
            {
                return false;
            }
        }
        return true;
    }

    public int getBitrate()
    {
        return mBitrate;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public String getMimeType()
    {
        return mMimeType;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int hashCode()
    {
        int l = 1;
        int i1 = 0;
        int i;
        int j;
        int k;
        int j1;
        int k1;
        int l1;
        if (mMimeType != null)
        {
            i = mMimeType.hashCode();
        } else
        {
            i = 0;
        }
        j1 = mWidth;
        k1 = mHeight;
        if (mScalable)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (mLockedRatio)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!mHasDisplay)
        {
            l = 0;
        }
        l1 = mBitrate;
        if (mUrl != null)
        {
            i1 = mUrl.hashCode();
        }
        return (((k + (j + ((i * 31 + j1) * 31 + k1) * 31) * 31) * 31 + l) * 31 + l1) * 31 + i1;
    }

    public boolean isHasDisplay()
    {
        return mHasDisplay;
    }

    public boolean isLockedRatio()
    {
        return mLockedRatio;
    }

    public boolean isScalable()
    {
        return mScalable;
    }

    public String toString()
    {
        return (new StringBuilder("CompanionAd{mMimeType='")).append(mMimeType).append('\'').append(", mWidth=").append(mWidth).append(", mHeight=").append(mHeight).append(", mScalable=").append(mScalable).append(", mLockedRatio=").append(mLockedRatio).append(", mHasDisplay=").append(mHasDisplay).append(", mBitrate=").append(mBitrate).append(", mUrl='").append(mUrl).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mMimeType);
        parcel.writeInt(mWidth);
        parcel.writeInt(mHeight);
        gen.a(parcel, mScalable);
        gen.a(parcel, mLockedRatio);
        gen.a(parcel, mHasDisplay);
        parcel.writeInt(mBitrate);
        parcel.writeString(mUrl);
    }

}
