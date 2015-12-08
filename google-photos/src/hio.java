// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hio
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hip();
    final String a;
    final double b;
    public final long c;

    hio(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readDouble();
        c = parcel.readLong();
    }

    public hio(String s, double d, long l)
    {
        a = (String)p.a(s);
        b = d;
        c = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeDouble(b);
        parcel.writeLong(c);
    }

}
