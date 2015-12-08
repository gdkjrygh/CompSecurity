// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InstagramDataSet
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final InstagramDataSet createFromParcel(Parcel parcel)
        {
            return new InstagramDataSet(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final InstagramDataSet[] newArray(int i)
        {
            return new InstagramDataSet[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public boolean isTokenRevoked;
    public String lastFetchTime;
    public int mediaCount;
    public List photos;
    public String profileImageUrl;
    public String username;

    public InstagramDataSet()
    {
        photos = new ArrayList(0);
    }

    protected InstagramDataSet(Parcel parcel)
    {
        boolean flag = false;
        super();
        photos = new ArrayList(0);
        lastFetchTime = parcel.readString();
        username = parcel.readString();
        profileImageUrl = parcel.readString();
        mediaCount = parcel.readInt();
        if (parcel.readByte() != 0)
        {
            flag = true;
        }
        isTokenRevoked = flag;
        photos = new ArrayList();
        parcel.readList(photos, java/util/List.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(lastFetchTime);
        parcel.writeString(username);
        parcel.writeString(profileImageUrl);
        parcel.writeInt(mediaCount);
        byte byte0;
        if (isTokenRevoked)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeList(photos);
    }

}
