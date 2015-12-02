// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.appclear;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class AppInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AppInfo a(Parcel parcel)
        {
            return new AppInfo(parcel);
        }

        public AppInfo[] a(int i)
        {
            return new AppInfo[i];
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
    public int appType;
    public Bundle bundle;
    public String packageName;

    public AppInfo()
    {
        bundle = new Bundle();
    }

    public AppInfo(Parcel parcel)
    {
        bundle = new Bundle();
        readFromParcel(parcel);
    }

    public AppInfo clone()
    {
        AppInfo appinfo = new AppInfo();
        appinfo.appType = appType;
        appinfo.packageName = packageName;
        Bundle bundle1;
        if (bundle == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = (Bundle)bundle.clone();
        }
        appinfo.bundle = bundle1;
        return appinfo;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int describeContents()
    {
        return 0;
    }

    public void readFromParcel(Parcel parcel)
    {
        appType = parcel.readInt();
        packageName = parcel.readString();
        bundle = parcel.readBundle();
    }

    public String toString()
    {
        return super.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(appType);
        parcel.writeString(packageName);
        parcel.writeBundle(bundle);
    }

}
