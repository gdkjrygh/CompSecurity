// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;
import android.os.Parcelable;

public class GenreStationSearchData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public GenreStationSearchData a(Parcel parcel)
        {
            return new GenreStationSearchData(parcel);
        }

        public GenreStationSearchData[] a(int i)
        {
            return new GenreStationSearchData[i];
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
    private final String a;
    private final String b;
    private final int c;

    public GenreStationSearchData(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
    }

    public GenreStationSearchData(String s, String s1, int i)
    {
        a = s;
        b = s1;
        c = i;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return b();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c);
    }

}
