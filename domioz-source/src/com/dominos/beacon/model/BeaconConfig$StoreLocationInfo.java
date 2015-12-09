// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class longitude
    implements Parcelable
{

    public static final android.os.eLocationInfo._cls1 CREATOR = new _cls1();
    private double latitude;
    private double longitude;

    public int describeContents()
    {
        return 0;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLatitude(double d)
    {
        latitude = d;
    }

    public void setLongitude(double d)
    {
        longitude = d;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(latitude);
        parcel.writeDouble(longitude);
    }


    protected _cls1(Parcel parcel)
    {
        latitude = parcel.readDouble();
        longitude = parcel.readDouble();
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BeaconConfig.StoreLocationInfo createFromParcel(Parcel parcel)
        {
            return new BeaconConfig.StoreLocationInfo(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BeaconConfig.StoreLocationInfo[] newArray(int i)
        {
            return new BeaconConfig.StoreLocationInfo[i];
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
