// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class izm
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new izn();
    public final long a;

    public izm(long l)
    {
        a = l;
    }

    izm(Parcel parcel)
    {
        a = parcel.readLong();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
    }

}
