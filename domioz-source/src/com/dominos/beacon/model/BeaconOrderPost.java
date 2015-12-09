// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class BeaconOrderPost
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String minorId;
    private String phoneNumber;
    private String storeId;

    protected BeaconOrderPost(Parcel parcel)
    {
        storeId = parcel.readString();
        minorId = parcel.readString();
        phoneNumber = parcel.readString();
    }

    public BeaconOrderPost(String s, String s1)
    {
        storeId = s;
        minorId = s1;
    }

    public BeaconOrderPost(String s, String s1, String s2)
    {
        storeId = s;
        minorId = s1;
        phoneNumber = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getMinorId()
    {
        return minorId;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public void setMinorId(String s)
    {
        minorId = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public void setStoreId(String s)
    {
        storeId = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(storeId);
        parcel.writeString(minorId);
        parcel.writeString(phoneNumber);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BeaconOrderPost createFromParcel(Parcel parcel)
        {
            return new BeaconOrderPost(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BeaconOrderPost[] newArray(int i)
        {
            return new BeaconOrderPost[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
