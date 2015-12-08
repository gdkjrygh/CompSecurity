// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class bj
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bk();
    bm a[];
    int b[];
    ah c[];

    public bj()
    {
    }

    public bj(Parcel parcel)
    {
        a = (bm[])parcel.createTypedArray(bm.CREATOR);
        b = parcel.createIntArray();
        c = (ah[])parcel.createTypedArray(ah.CREATOR);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(a, i);
        parcel.writeIntArray(b);
        parcel.writeTypedArray(c, i);
    }

}
