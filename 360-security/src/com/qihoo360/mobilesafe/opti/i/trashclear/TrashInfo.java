// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.opti.i.trashclear;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class TrashInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TrashInfo a(Parcel parcel)
        {
            return new TrashInfo(parcel);
        }

        public TrashInfo[] a(int i)
        {
            return new TrashInfo[i];
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
    public String clearAdvice;
    public int clearType;
    public long count;
    public int dataType;
    public String desc;
    public boolean isInWhiteList;
    public boolean isSelected;
    public String packageName;
    public String path;
    public long size;
    public int type;

    public TrashInfo()
    {
        bundle = new Bundle();
    }

    public TrashInfo(Parcel parcel)
    {
        bundle = new Bundle();
        readFromParcel(parcel);
    }

    public TrashInfo clone()
    {
        TrashInfo trashinfo = new TrashInfo();
        trashinfo.desc = desc;
        trashinfo.path = path;
        trashinfo.size = size;
        trashinfo.count = count;
        trashinfo.isSelected = isSelected;
        trashinfo.isInWhiteList = isInWhiteList;
        trashinfo.type = type;
        trashinfo.dataType = dataType;
        trashinfo.clearType = clearType;
        trashinfo.clearAdvice = clearAdvice;
        trashinfo.packageName = packageName;
        Bundle bundle1;
        if (bundle == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = (Bundle)bundle.clone();
        }
        trashinfo.bundle = bundle1;
        return trashinfo;
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
        boolean flag1 = true;
        desc = parcel.readString();
        path = parcel.readString();
        size = parcel.readLong();
        count = parcel.readLong();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSelected = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        isInWhiteList = flag;
        type = parcel.readInt();
        dataType = parcel.readInt();
        clearType = parcel.readInt();
        clearAdvice = parcel.readString();
        packageName = parcel.readString();
        bundle = parcel.readBundle();
    }

    public String toString()
    {
        return super.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(desc);
        parcel.writeString(path);
        parcel.writeLong(size);
        parcel.writeLong(count);
        if (isSelected)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isInWhiteList)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(type);
        parcel.writeInt(dataType);
        parcel.writeInt(clearType);
        parcel.writeString(clearAdvice);
        parcel.writeString(packageName);
        parcel.writeBundle(bundle);
    }

}
