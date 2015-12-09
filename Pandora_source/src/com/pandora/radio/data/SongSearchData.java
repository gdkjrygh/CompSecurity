// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;
import android.os.Parcelable;

public class SongSearchData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public SongSearchData a(Parcel parcel)
        {
            return new SongSearchData(parcel);
        }

        public SongSearchData[] a(int i)
        {
            return new SongSearchData[i];
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
    private final String d;

    public SongSearchData(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readInt();
        d = parcel.readString();
    }

    public SongSearchData(String s, String s1, String s2, int i)
    {
        a = s;
        b = s2;
        c = i;
        d = s1;
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

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append(d()).append(" by ").append(b()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(c);
        parcel.writeString(d);
    }

}
