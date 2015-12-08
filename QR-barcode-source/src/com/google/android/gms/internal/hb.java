// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class hb
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public hb[] H(int i)
        {
            return new hb[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return k(parcel);
        }

        public hb k(Parcel parcel)
        {
            return new hb(parcel);
        }

        public Object[] newArray(int i)
        {
            return H(i);
        }

    };
    private String BL;
    private String BM;
    private String mValue;

    public hb()
    {
    }

    hb(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public hb(String s, String s1, String s2)
    {
        BL = s;
        BM = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        BL = parcel.readString();
        BM = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return BL;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(BL);
        parcel.writeString(BM);
        parcel.writeString(mValue);
    }

}
