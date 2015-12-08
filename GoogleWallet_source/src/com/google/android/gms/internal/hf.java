// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class hf
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static hf[] E(int i)
        {
            return new hf[i];
        }

        private static hf k(Parcel parcel)
        {
            return new hf(parcel);
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return k(parcel);
        }

        public final Object[] newArray(int i)
        {
            return E(i);
        }

    };
    private String CB;
    private String CC;
    private String mValue;

    public hf()
    {
    }

    hf(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public hf(String s, String s1, String s2)
    {
        CB = s;
        CC = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        CB = parcel.readString();
        CC = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getId()
    {
        return CB;
    }

    public final String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(CB);
        parcel.writeString(CC);
        parcel.writeString(mValue);
    }

}
