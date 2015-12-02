// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.plugins;

import android.os.Parcel;
import android.os.Parcelable;

public class ApkInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ApkInfo a(Parcel parcel)
        {
            return new ApkInfo(parcel);
        }

        public ApkInfo[] a(int i)
        {
            return new ApkInfo[i];
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
    public int apkIconID;
    public int apkVersionCode;
    public String apkVersionName;
    public int clearType;
    public int dataType;
    public String desc;
    public long modifyTime;
    public String packageName;
    public String path;
    public long size;

    public ApkInfo()
    {
    }

    public ApkInfo(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void readFromParcel(Parcel parcel)
    {
        desc = parcel.readString();
        path = parcel.readString();
        size = parcel.readLong();
        dataType = parcel.readInt();
        clearType = parcel.readInt();
        apkVersionName = parcel.readString();
        apkVersionCode = parcel.readInt();
        apkIconID = parcel.readInt();
        packageName = parcel.readString();
        modifyTime = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(desc);
        parcel.writeString(path);
        parcel.writeLong(size);
        parcel.writeInt(dataType);
        parcel.writeInt(clearType);
        parcel.writeString(apkVersionName);
        parcel.writeInt(apkVersionCode);
        parcel.writeInt(apkIconID);
        parcel.writeString(packageName);
        parcel.writeLong(modifyTime);
    }

}
