// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class fd
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public fd[] C(int i)
        {
            return new fd[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return k(parcel);
        }

        public fd k(Parcel parcel)
        {
            return new fd(parcel);
        }

        public Object[] newArray(int i)
        {
            return C(i);
        }

    };
    private String mValue;
    private String xG;
    private String xH;

    public fd()
    {
    }

    fd(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public fd(String s, String s1, String s2)
    {
        xG = s;
        xH = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        xG = parcel.readString();
        xH = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return xG;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(xG);
        parcel.writeString(xH);
        parcel.writeString(mValue);
    }

}
