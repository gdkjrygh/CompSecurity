// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hkf
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hkg();
    public final esm a;

    hkf(Parcel parcel)
    {
        a = esm.a(parcel.readInt());
    }

    public hkf(esm esm1)
    {
        a = esm1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.f);
    }

}
