// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.socialchart.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ArtistModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ArtistModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ArtistModel[i];
        }

    };
    private final String mName;
    private final String mUri;

    public ArtistModel(Parcel parcel)
    {
        mUri = parcel.readString();
        mName = parcel.readString();
    }

    public ArtistModel(String s, String s1)
    {
        mUri = s;
        mName = s1;
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
            obj = (ArtistModel)obj;
            if (mName == null ? ((ArtistModel) (obj)).mName != null : !mName.equals(((ArtistModel) (obj)).mName))
            {
                return false;
            }
            if (mUri == null ? ((ArtistModel) (obj)).mUri != null : !mUri.equals(((ArtistModel) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
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
        int j = 0;
        int i;
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
        }
        return i * 31 + j;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUri);
        parcel.writeString(mName);
    }

}
