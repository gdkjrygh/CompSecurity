// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ila
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ilb();
    public final boolean a;

    ila(Parcel parcel)
    {
        a = b.c(parcel);
    }

    public ila(boolean flag)
    {
        a = true;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        boolean flag = a;
        return (new StringBuilder(25)).append("SharedMediaFeature{").append(flag).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
    }

}
