// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Parcel;
import android.os.Parcelable;

public class DeepScanItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public DeepScanItem a(Parcel parcel)
        {
            return new DeepScanItem(parcel);
        }

        public DeepScanItem[] a(int i)
        {
            return new DeepScanItem[i];
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
    public static final int ENUM_AUTORUN = 1;
    public static final int ENUM_DUMMY = 99;
    public static final int ENUM_FILEPATH = 4;
    public static final int ENUM_INSTALLED_APK = 3;
    public static final int ENUM_MEMORY = 2;
    public final String content;
    public final int enumeratorId;

    public DeepScanItem(int i, String s)
    {
        enumeratorId = i;
        content = s;
    }

    public DeepScanItem(Parcel parcel)
    {
        enumeratorId = parcel.readInt();
        content = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(enumeratorId);
        parcel.writeString(content);
    }

}
