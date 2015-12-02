// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.service;

import android.os.Parcel;
import android.os.Parcelable;

public final class KillBean
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public KillBean a(Parcel parcel)
        {
            return new KillBean(parcel, null);
        }

        public KillBean[] a(int i)
        {
            return new KillBean[i];
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
    public int importance;
    public int memory;
    public int oom_adj;
    public String packageName;
    public int pids[];
    public boolean skip;

    public KillBean()
    {
        skip = false;
    }

    private KillBean(Parcel parcel)
    {
        skip = false;
        readFromParcel(parcel);
    }

    KillBean(Parcel parcel, KillBean killbean)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void readFromParcel(Parcel parcel)
    {
        packageName = parcel.readString();
        memory = parcel.readInt();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[packageName=");
        stringbuilder.append(packageName);
        stringbuilder.append(", memory=");
        stringbuilder.append(memory);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel)
    {
        parcel.writeString(packageName);
        parcel.writeInt(memory);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        writeToParcel(parcel);
    }

}
