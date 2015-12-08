// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class Image
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Image(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Image[i];
        }

    };
    private String mUrl;

    private Image(Parcel parcel)
    {
        mUrl = parcel.readString();
    }


    public Image(String s)
    {
        mUrl = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (Image)obj;
            return mUrl.equals(((Image) (obj)).mUrl);
        }
    }

    public String getUrl()
    {
        return mUrl;
    }

    public int hashCode()
    {
        return mUrl.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Image{url='")).append(mUrl).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUrl);
    }

}
