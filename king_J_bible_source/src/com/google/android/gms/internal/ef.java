// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class ef
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return i(parcel);
        }

        public ef i(Parcel parcel)
        {
            return new ef(parcel);
        }

        public Object[] newArray(int j)
        {
            return u(j);
        }

        public ef[] u(int j)
        {
            return new ef[j];
        }

    };
    private String mValue;
    private String wp;
    private String wq;

    public ef()
    {
    }

    ef(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public ef(String s, String s1, String s2)
    {
        wp = s;
        wq = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        wp = parcel.readString();
        wq = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return wp;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(wp);
        parcel.writeString(wq);
        parcel.writeString(mValue);
    }

}
