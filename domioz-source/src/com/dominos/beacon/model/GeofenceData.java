// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class GeofenceData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private double mLatitude;
    private double mLongitude;
    private String mStoreId;

    private GeofenceData(double d, double d1, String s)
    {
        mLatitude = d;
        mLongitude = d1;
        mStoreId = s;
    }

    GeofenceData(double d, double d1, String s, _cls1 _pcls1)
    {
        this(d, d1, s);
    }

    protected GeofenceData(Parcel parcel)
    {
        mLatitude = parcel.readDouble();
        mLongitude = parcel.readDouble();
        mStoreId = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public double getLatitude()
    {
        return mLatitude;
    }

    public double getLongitude()
    {
        return mLongitude;
    }

    public String getStoreId()
    {
        return mStoreId;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(mLatitude);
        parcel.writeDouble(mLongitude);
        parcel.writeString(mStoreId);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final GeofenceData createFromParcel(Parcel parcel)
        {
            return new GeofenceData(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GeofenceData[] newArray(int i)
        {
            return new GeofenceData[i];
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
