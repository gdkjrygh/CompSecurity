// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ivu
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ivv();
    public final long a;
    private final long b;

    public ivu(long l, long l1)
    {
        a = l;
        b = l1;
    }

    ivu(Parcel parcel)
    {
        a = parcel.readLong();
        b = parcel.readLong();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        long l = a;
        long l1 = b;
        return (new StringBuilder(105)).append("TimeMachineCollectionFeature{ startTimeMillis: ").append(l).append(", endTimeMillis: ").append(l1).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeLong(b);
    }

}
