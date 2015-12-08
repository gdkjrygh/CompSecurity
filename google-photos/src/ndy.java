// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class ndy
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new ndz();
    public final String a;
    public final String b;

    ndy(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    private ndy(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public static ndy a(String s, String s1)
    {
        return new ndy(s, s1);
    }

    public final int compareTo(Object obj)
    {
        obj = (ndy)obj;
        return a.compareToIgnoreCase(((ndy) (obj)).a);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
