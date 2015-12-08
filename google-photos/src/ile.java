// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ile
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new ilf();
    public final String a;

    ile(Parcel parcel)
    {
        a = parcel.readString();
    }

    public ile(String s)
    {
        a = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
