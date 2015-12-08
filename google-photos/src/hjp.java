// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hjp
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new hjq();
    public final erw a;

    public hjp(int i)
    {
        a = erw.a(i);
    }

    hjp(Parcel parcel)
    {
        a = erw.a(parcel.readInt());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.d);
    }

}
