// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.services;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.qihoo.security.services:
//            ScanResult

public class ScanProgress
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ScanProgress a(Parcel parcel)
        {
            return new ScanProgress(parcel);
        }

        public ScanProgress[] a(int i)
        {
            return new ScanProgress[i];
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
    public final int percent;
    public final int progress;
    public final ScanResult result;
    public final int total;

    public ScanProgress(Parcel parcel)
    {
        result = (ScanResult)parcel.readParcelable(getClass().getClassLoader());
        percent = parcel.readInt();
        progress = parcel.readInt();
        total = parcel.readInt();
    }

    public ScanProgress(ScanResult scanresult, int i, int j, int k)
    {
        result = scanresult;
        percent = i;
        progress = j;
        total = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(result, 0);
        parcel.writeInt(percent);
        parcel.writeInt(progress);
        parcel.writeInt(total);
    }

}
