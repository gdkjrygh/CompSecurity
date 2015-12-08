// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class jdw
    implements jdv
{

    public static final android.os.Parcelable.Creator CREATOR = new jdx();
    private final long a;

    public jdw(long l)
    {
        a = l;
    }

    jdw(Parcel parcel)
    {
        a = parcel.readLong();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long p()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
    }

}
