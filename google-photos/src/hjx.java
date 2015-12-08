// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class hjx
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new hjy();
    public final double a;

    public hjx(double d)
    {
        a = d;
    }

    hjx(Parcel parcel)
    {
        a = parcel.readDouble();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(a);
    }

}
