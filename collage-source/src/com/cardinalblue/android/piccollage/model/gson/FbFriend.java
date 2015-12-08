// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;

public class FbFriend
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FbFriend createFromParcel(Parcel parcel)
        {
            return new FbFriend(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FbFriend[] newArray(int i)
        {
            return new FbFriend[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String EXTRA_FB_FRIEND = "extra_fb_friend";
    private String id;
    private String name;

    public FbFriend()
    {
    }

    private FbFriend(Parcel parcel)
    {
        id = parcel.readString();
        name = parcel.readString();
    }


    public FbFriend copy()
    {
        FbFriend fbfriend = new FbFriend();
        fbfriend.id = id;
        fbfriend.name = name;
        return fbfriend;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(name);
    }

}
