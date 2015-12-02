// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.processclear;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class AppPackageInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AppPackageInfo a(Parcel parcel)
        {
            return new AppPackageInfo(parcel, null);
        }

        public AppPackageInfo[] a(int i)
        {
            return new AppPackageInfo[i];
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
    public String appName;
    public Bundle bundle;
    public int clearMemory;
    public int clearablePids[];
    public String componentsToForbit[];
    public int flag;
    public int importance;
    public byte isDefaultChoosen;
    public String packageName;
    public int pids[];
    public String services[];
    public byte status;
    public int type;
    public int uid;
    public int usedMemory;
    public int userSelection;

    public AppPackageInfo()
    {
        usedMemory = 0;
        importance = 500;
        flag = 0;
        isDefaultChoosen = 1;
        userSelection = -1;
        status = 1;
        type = 1;
        bundle = new Bundle();
    }

    private AppPackageInfo(Parcel parcel)
    {
        usedMemory = 0;
        importance = 500;
        flag = 0;
        isDefaultChoosen = 1;
        userSelection = -1;
        status = 1;
        type = 1;
        bundle = new Bundle();
        readFromParcel(parcel);
    }

    AppPackageInfo(Parcel parcel, AppPackageInfo apppackageinfo)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public int getClearType()
    {
        if (1 != userSelection)
        {
            if (userSelection == 0)
            {
                return 1 != flag ? 2 : 3;
            }
            if (-1 == userSelection)
            {
                if (1 == flag)
                {
                    return 3;
                }
                if (!shouldSelect())
                {
                    return 2;
                }
            } else
            {
                return 2;
            }
        }
        return 1;
    }

    public void initSelected()
    {
        if (isWhiteList())
        {
            isDefaultChoosen = 0;
            return;
        } else
        {
            isDefaultChoosen = 1;
            return;
        }
    }

    public boolean isInternalWhiteList()
    {
        return flag != 0 && 4 != flag;
    }

    public boolean isWhiteList()
    {
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = flag2;
        userSelection;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 51
    //                   1 53;
           goto _L1 _L2 _L3
_L2:
        break MISSING_BLOCK_LABEL_51;
_L1:
        if (flag != 0)
        {
            flag1 = flag2;
            if (4 != flag)
            {
                break MISSING_BLOCK_LABEL_51;
            }
        }
        flag1 = false;
        return flag1;
_L3:
        return false;
    }

    public void readFromParcel(Parcel parcel)
    {
        packageName = parcel.readString();
        appName = parcel.readString();
        usedMemory = parcel.readInt();
        importance = parcel.readInt();
        flag = parcel.readInt();
        isDefaultChoosen = parcel.readByte();
        userSelection = parcel.readInt();
        status = parcel.readByte();
        componentsToForbit = parcel.createStringArray();
        services = parcel.createStringArray();
        pids = parcel.createIntArray();
        clearablePids = parcel.createIntArray();
        uid = parcel.readInt();
        type = parcel.readInt();
        clearMemory = parcel.readInt();
        bundle = parcel.readBundle();
    }

    public boolean shouldSelect()
    {
        return isDefaultChoosen == 1;
    }

    public void writeToParcel(Parcel parcel)
    {
        parcel.writeString(packageName);
        parcel.writeString(appName);
        parcel.writeInt(usedMemory);
        parcel.writeInt(importance);
        parcel.writeInt(flag);
        parcel.writeByte(isDefaultChoosen);
        parcel.writeInt(userSelection);
        parcel.writeByte(status);
        parcel.writeStringArray(componentsToForbit);
        parcel.writeStringArray(services);
        parcel.writeIntArray(pids);
        parcel.writeIntArray(clearablePids);
        parcel.writeInt(uid);
        parcel.writeInt(type);
        parcel.writeInt(clearMemory);
        parcel.writeBundle(bundle);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        writeToParcel(parcel);
    }

}
