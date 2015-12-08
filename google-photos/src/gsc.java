// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class gsc
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new gsd();
    public final boolean a;

    gsc(Parcel parcel)
    {
        this(b.c(parcel));
    }

    public gsc(boolean flag)
    {
        a = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(parcel, a);
    }

}
