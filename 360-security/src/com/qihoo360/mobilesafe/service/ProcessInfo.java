// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.service;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ProcessInfo
    implements Parcelable
{

    public static final int CATE_ACCOUNT = 102;
    public static final int CATE_ADJ = 103;
    public static final int CATE_BLUETHOOTH = 104;
    public static final int CATE_COLOCK = 100;
    public static final int CATE_MUSIC = 101;
    public static final int CATE_NONE = 0;
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ProcessInfo a(Parcel parcel)
        {
            return new ProcessInfo(parcel, null);
        }

        public ProcessInfo[] a(int i)
        {
            return new ProcessInfo[i];
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
    public static final int FLAG_HIDE = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_NOT_RECOMMENDED_TO_KILL = 3;
    public static final int FLAG_SPECAIL = 4;
    public static final int FLAG_WHITE_LIST = 2;
    public static final int STATUS_KILLING = 2;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPED = 3;
    public int category;
    public String components[];
    public int flag;
    public int importance;
    public boolean isSystem;
    public String packageName;
    public int pids[];
    public String processName;
    public String services[];
    public byte status;
    public int useMemory;

    public ProcessInfo()
    {
        useMemory = 0;
        importance = 500;
        flag = 0;
        category = 0;
        status = 1;
    }

    private ProcessInfo(Parcel parcel)
    {
        useMemory = 0;
        importance = 500;
        flag = 0;
        category = 0;
        status = 1;
        readFromParcel(parcel);
    }

    ProcessInfo(Parcel parcel, ProcessInfo processinfo)
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
        useMemory = parcel.readInt();
        importance = parcel.readInt();
        flag = parcel.readInt();
        status = parcel.readByte();
        components = parcel.createStringArray();
        services = parcel.createStringArray();
        pids = parcel.createIntArray();
        boolean aflag[] = new boolean[1];
        parcel.readBooleanArray(aflag);
        isSystem = aflag[0];
    }

    public String toString()
    {
        return (new StringBuilder("ProcessInfo [packageName=")).append(packageName).append(", useMemory=").append(useMemory).append(", importance=").append(importance).append(", flag=").append(flag).append(", status=").append(status).append(", components=").append(Arrays.toString(components)).append(", services=").append(Arrays.toString(services)).append(", pid=").append(Arrays.toString(pids)).append(", isSystem=").append(isSystem).append("]").toString();
    }

    public void writeToParcel(Parcel parcel)
    {
        parcel.writeString(packageName);
        parcel.writeInt(useMemory);
        parcel.writeInt(importance);
        parcel.writeInt(flag);
        parcel.writeByte(status);
        parcel.writeStringArray(components);
        parcel.writeStringArray(services);
        parcel.writeIntArray(pids);
        parcel.writeBooleanArray(new boolean[] {
            isSystem
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        writeToParcel(parcel);
    }

}
