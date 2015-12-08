// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class ha
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String CE;
    private String CF;
    private String mValue;

    public ha()
    {
    }

    ha(Parcel parcel)
    {
        readFromParcel(parcel);
    }

    public ha(String s, String s1, String s2)
    {
        CE = s;
        CF = s1;
        mValue = s2;
    }

    private void readFromParcel(Parcel parcel)
    {
        CE = parcel.readString();
        CF = parcel.readString();
        mValue = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return CE;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(CE);
        parcel.writeString(CF);
        parcel.writeString(mValue);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ha[] I(int i)
        {
            return new ha[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return k(parcel);
        }

        public final ha k(Parcel parcel)
        {
            return new ha(parcel);
        }

        public final Object[] newArray(int i)
        {
            return I(i);
        }

        _cls1()
        {
        }
    }

}
