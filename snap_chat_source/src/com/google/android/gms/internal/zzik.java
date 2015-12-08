// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class zzik
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return zzk(parcel);
        }

        public final Object[] newArray(int i)
        {
            return zzO(i);
        }

        public final zzik[] zzO(int i)
        {
            return new zzik[i];
        }

        public final zzik zzk(Parcel parcel)
        {
            return new zzik(parcel);
        }

    };
    private String mValue;
    private String zzFA;
    private String zzFB;

    public zzik()
    {
    }

    zzik(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public zzik(String s, String s1, String s2)
    {
        zzFA = s;
        zzFB = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        zzFA = parcel.readString();
        zzFB = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzFA;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(zzFA);
        parcel.writeString(zzFB);
        parcel.writeString(mValue);
    }

}
