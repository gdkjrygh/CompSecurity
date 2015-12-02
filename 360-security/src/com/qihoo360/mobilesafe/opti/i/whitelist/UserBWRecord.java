// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.whitelist;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class UserBWRecord
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public UserBWRecord a(Parcel parcel)
        {
            return new UserBWRecord(parcel);
        }

        public UserBWRecord[] a(int i)
        {
            return new UserBWRecord[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public Bundle bundle;
    public String desc;
    public int flag;
    public String packageName;
    public int type;
    public String value;

    public UserBWRecord()
    {
    }

    public UserBWRecord(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void readFromParcel(Parcel parcel)
    {
        packageName = parcel.readString();
        value = parcel.readString();
        flag = parcel.readInt();
        desc = parcel.readString();
        type = parcel.readInt();
        bundle = parcel.readBundle();
    }

    public String toString()
    {
        return super.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(packageName);
        parcel.writeString(value);
        parcel.writeInt(flag);
        parcel.writeString(desc);
        parcel.writeInt(type);
        parcel.writeBundle(bundle);
    }

}
