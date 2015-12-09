// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class SimpleArtist
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SimpleArtist(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SimpleArtist[i];
        }

    };
    private final String mId;
    private final String mName;
    private final String mType;

    protected SimpleArtist(Parcel parcel)
    {
        mId = parcel.readString();
        mName = parcel.readString();
        mType = parcel.readString();
    }

    private SimpleArtist(String s, String s1, String s2)
    {
        mId = s;
        mName = s1;
        mType = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return mId;
    }

    public String getName()
    {
        return mName;
    }

    public String getType()
    {
        return mType;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mName);
        parcel.writeString(mType);
    }

}
