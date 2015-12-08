// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

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
    private final String mUrl;

    protected Image(Parcel parcel)
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
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (Image)obj;
        if (mUrl == null) goto _L4; else goto _L3
_L3:
        if (mUrl.equals(((Image) (obj)).mUrl)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((Image) (obj)).mUrl == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getImageUrl()
    {
        return mUrl;
    }

    public int hashCode()
    {
        if (mUrl != null)
        {
            return mUrl.hashCode();
        } else
        {
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mUrl);
    }

}
