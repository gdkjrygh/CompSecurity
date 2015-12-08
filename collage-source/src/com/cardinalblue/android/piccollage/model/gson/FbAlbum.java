// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;

public class FbAlbum
    implements Parcelable
{
    public class Picture
    {

        private PictureData mData;
        final FbAlbum this$0;

        public PictureData getData()
        {
            return mData;
        }

        public Picture()
        {
            this$0 = FbAlbum.this;
            super();
        }
    }

    public class Picture.PictureData
    {

        private String mURL;
        final Picture this$1;

        public String getURL()
        {
            return mURL;
        }

        public void setURL(String s)
        {
            mURL = s;
        }

        public Picture.PictureData()
        {
            this$1 = Picture.this;
            super();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FbAlbum createFromParcel(Parcel parcel)
        {
            return new FbAlbum(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FbAlbum[] newArray(int i)
        {
            return new FbAlbum[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String EXTRA_ALBUM = "extra_album";
    private int mCount;
    private String mCoverPhotoUrl;
    private String mId;
    private String mName;
    private Picture mPicture;

    public FbAlbum()
    {
        mPicture = new Picture();
    }

    private FbAlbum(Parcel parcel)
    {
        mPicture = new Picture();
        mId = parcel.readString();
        mName = parcel.readString();
        mCount = parcel.readInt();
        mCoverPhotoUrl = parcel.readString();
    }


    public int describeContents()
    {
        return 0;
    }

    public int getCount()
    {
        return mCount;
    }

    public String getCoverPhotoUrl()
    {
        if (mCoverPhotoUrl == null && mPicture.getData() != null)
        {
            mCoverPhotoUrl = mPicture.getData().getURL();
        }
        return mCoverPhotoUrl;
    }

    public String getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public void setCount(int i)
    {
        mCount = i;
    }

    public void setCoverPhotoUrl(String s)
    {
        mCoverPhotoUrl = s;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mName);
        parcel.writeInt(mCount);
        parcel.writeString(getCoverPhotoUrl());
    }

}
