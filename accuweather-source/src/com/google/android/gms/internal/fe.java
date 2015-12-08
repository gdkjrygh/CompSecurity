// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class fe
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public fe[] C(int i)
        {
            return new fe[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return k(parcel);
        }

        public fe k(Parcel parcel)
        {
            return new fe(parcel);
        }

        public Object[] newArray(int i)
        {
            return C(i);
        }

    };
    private String mValue;
    private String xD;
    private String xE;

    public fe()
    {
    }

    fe(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public fe(String s, String s1, String s2)
    {
        xD = s;
        xE = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        xD = parcel.readString();
        xE = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return xD;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(xD);
        parcel.writeString(xE);
        parcel.writeString(mValue);
    }

}
