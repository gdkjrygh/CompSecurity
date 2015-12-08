// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gag
    implements gaf
{

    public static final android.os.Parcelable.Creator CREATOR = new gah();
    private final int a;
    private final int b;

    public gag(int i, int j)
    {
        a = i;
        b = j;
    }

    public gag(long l1, long l2)
    {
        this((int)l1, (int)l2);
    }

    gag(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int k()
    {
        return a;
    }

    public final int l()
    {
        return b;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
    }

}
