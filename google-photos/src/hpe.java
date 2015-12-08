// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class hpe
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hpf();
    public final hpc a;

    hpe(Parcel parcel)
    {
        a = (hpc)parcel.readParcelable(hpc.getClassLoader());
    }

    public hpe(hpc hpc1)
    {
        a = hpc1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
