// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Parcel;
import android.os.Parcelable;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.d.b;

public class ScanResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ScanResult a(Parcel parcel)
        {
            return new ScanResult(parcel);
        }

        public ScanResult[] a(int i)
        {
            return new ScanResult[i];
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
    public static final byte RID_AVEM_AVE = 97;
    public static final byte RID_AVEM_AVEX = 96;
    public static final byte RID_AVEM_HEURMOD = 99;
    public static final byte RID_AVEM_PRESCAN = 98;
    public static final byte RID_AVEM_VSIG = 1;
    public static final int STATE_ADSCAN = 11;
    public static final int STATE_AVE = 7;
    public static final int STATE_BITDEFENDER = 6;
    public static final int STATE_CLOUD = 1;
    public static final int STATE_CLOUDRULE = 2;
    public static final int STATE_CLOUD_QVM = 9;
    public static final int STATE_FIN = 127;
    public static final int STATE_INIT = 0;
    public static final int STATE_LOCAL_QVM = 8;
    public static final int STATE_POPSOFT = 3;
    public static final int STATE_QEX = 10;
    public FileInfo fileInfo;
    public String notifyMessage;
    public int notifyResult;
    public int operatinType;
    public int rescan;
    public int riskClass;
    public String riskDescription;
    public int ruleid;
    public int state;
    public String tipsInfo;
    public int trusted;
    public int type;

    public ScanResult(Parcel parcel)
    {
        riskClass = 1;
        rescan = 0;
        ruleid = 0;
        fileInfo = (FileInfo)parcel.readParcelable(getClass().getClassLoader());
        riskClass = parcel.readInt();
        riskDescription = parcel.readString();
        state = parcel.readInt();
        ruleid = parcel.readInt();
        rescan = parcel.readInt();
    }

    public ScanResult(FileInfo fileinfo)
    {
        riskClass = 1;
        rescan = 0;
        ruleid = 0;
        fileInfo = fileinfo;
        state = 0;
    }

    public ScanResult(b b1)
    {
        riskClass = 1;
        rescan = 0;
        ruleid = 0;
        fileInfo = b1.c;
        state = 0;
    }

    void a(Parcel parcel)
    {
        fileInfo = (FileInfo)parcel.readParcelable(getClass().getClassLoader());
        riskClass = parcel.readInt();
        riskDescription = parcel.readString();
        state = parcel.readInt();
        ruleid = parcel.readInt();
        rescan = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof ScanResult))
        {
            obj = (ScanResult)obj;
            if (((ScanResult) (obj)).state == state && ((ScanResult) (obj)).riskClass == riskClass && ((ScanResult) (obj)).ruleid == ruleid)
            {
                return ((ScanResult) (obj)).fileInfo.equals(fileInfo);
            }
        }
        return false;
    }

    public String toString()
    {
        return fileInfo.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(fileInfo, 1);
        parcel.writeInt(riskClass);
        parcel.writeString(riskDescription);
        parcel.writeInt(state);
        parcel.writeInt(ruleid);
        parcel.writeInt(rescan);
    }

}
