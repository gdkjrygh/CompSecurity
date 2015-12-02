// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class ResidualFileInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ResidualFileInfo a(Parcel parcel)
        {
            return new ResidualFileInfo(parcel);
        }

        public ResidualFileInfo[] a(int i)
        {
            return new ResidualFileInfo[i];
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
    public long fileSize;
    public List rootPathList;

    public ResidualFileInfo()
    {
    }

    private ResidualFileInfo(Parcel parcel)
    {
        appName = parcel.readString();
        fileSize = parcel.readLong();
        try
        {
            rootPathList = parcel.readArrayList(java/lang/String.getClassLoader());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return;
        }
    }


    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ResidualFileInfo [appName: ");
        stringbuilder.append(appName);
        stringbuilder.append(", fileSize: ");
        stringbuilder.append(fileSize);
        stringbuilder.append(", rootPathList: ");
        stringbuilder.append(rootPathList);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(appName);
        parcel.writeLong(fileSize);
        parcel.writeList(rootPathList);
    }

}
