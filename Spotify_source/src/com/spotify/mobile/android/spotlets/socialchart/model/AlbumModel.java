// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class AlbumModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AlbumModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AlbumModel[i];
        }

    };
    private final String mImageUri;
    private final String mName;
    private final String mUri;

    public AlbumModel(Parcel parcel)
    {
        mUri = parcel.readString();
        mName = parcel.readString();
        mImageUri = parcel.readString();
    }

    public AlbumModel(String s, String s1, String s2)
    {
        mUri = s;
        mName = s1;
        mImageUri = s2;
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
            obj = (AlbumModel)obj;
            if (mImageUri == null ? ((AlbumModel) (obj)).mImageUri != null : !mImageUri.equals(((AlbumModel) (obj)).mImageUri))
            {
                return false;
            }
            if (mName == null ? ((AlbumModel) (obj)).mName != null : !mName.equals(((AlbumModel) (obj)).mName))
            {
                return false;
            }
            if (mUri == null ? ((AlbumModel) (obj)).mUri != null : !mUri.equals(((AlbumModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getImageUri()
    {
        return mImageUri;
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
        if (mUri != null)
        {
            i = mUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mName != null)
        {
            j = mName.hashCode();
        } else
        {
            j = 0;
        }
        if (mImageUri != null)
        {
            k = mImageUri.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mName);
        parcel.writeString(mImageUri);
    }

}
