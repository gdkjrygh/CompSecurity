// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Beacon
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String deviceName;
    private String macAddress;
    private int major;
    private int minor;
    private String proximityUuid;
    private int rssi;

    public Beacon(Parcel parcel)
    {
        proximityUuid = parcel.readString();
        major = parcel.readInt();
        minor = parcel.readInt();
        rssi = parcel.readInt();
        deviceName = parcel.readString();
        macAddress = parcel.readString();
    }

    public Beacon(String s, int i, int j)
    {
        proximityUuid = s;
        major = i;
        minor = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDeviceName()
    {
        return deviceName;
    }

    public String getMacAddress()
    {
        return macAddress;
    }

    public int getMajor()
    {
        return major;
    }

    public int getMinor()
    {
        return minor;
    }

    public int getRssi()
    {
        return rssi;
    }

    public String getUuid()
    {
        return proximityUuid;
    }

    public void setDeviceName(String s)
    {
        deviceName = s;
    }

    public void setMacAddress(String s)
    {
        macAddress = s;
    }

    public void setRssi(int i)
    {
        rssi = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(proximityUuid);
        parcel.writeInt(major);
        parcel.writeInt(minor);
        parcel.writeInt(rssi);
        parcel.writeString(deviceName);
        parcel.writeString(macAddress);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Beacon createFromParcel(Parcel parcel)
        {
            return new Beacon(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Beacon[] newArray(int i)
        {
            return new Beacon[i];
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
