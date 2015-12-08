// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.eventshub.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import gen;

public class Artist
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Artist(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Artist[i];
        }

    };
    private boolean mHasAffinity;
    private String mImageUri;
    private String mName;
    private String mUri;

    public Artist(Parcel parcel)
    {
        mUri = parcel.readString();
        mName = parcel.readString();
        mHasAffinity = gen.a(parcel);
        mImageUri = parcel.readString();
    }

    public Artist(String s, String s1, String s2, boolean flag)
    {
        mUri = s;
        mName = s1;
        mHasAffinity = flag;
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
            obj = (Artist)obj;
            if (mHasAffinity != ((Artist) (obj)).mHasAffinity)
            {
                return false;
            }
            if (mImageUri == null ? ((Artist) (obj)).mImageUri != null : !mImageUri.equals(((Artist) (obj)).mImageUri))
            {
                return false;
            }
            if (mName == null ? ((Artist) (obj)).mName != null : !mName.equals(((Artist) (obj)).mName))
            {
                return false;
            }
            if (mUri == null ? ((Artist) (obj)).mUri != null : !mUri.equals(((Artist) (obj)).mUri))
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

    public boolean hasAffinity()
    {
        return mHasAffinity;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
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
        if (mHasAffinity)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (mImageUri != null)
        {
            l = mImageUri.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public String toString()
    {
        return (new StringBuilder("Artist{mUri='")).append(mUri).append('\'').append(", mName='").append(mName).append('\'').append(", mHasAffinity=").append(mHasAffinity).append(", mImageUri='").append(mImageUri).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mName);
        gen.a(parcel, mHasAffinity);
        parcel.writeString(mImageUri);
    }

}
