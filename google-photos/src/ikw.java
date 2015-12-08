// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ikw
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ikx();
    public final boolean a;
    public final boolean b;

    ikw(Parcel parcel)
    {
        a = b.c(parcel);
        b = b.c(parcel);
    }

    public ikw(boolean flag, boolean flag1)
    {
        a = flag;
        b = flag1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
        b.a(parcel, b);
    }

}
