// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class dov
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new dow();
    final int a[];

    dov(Parcel parcel)
    {
        this(parcel.createIntArray());
    }

    public dov(int ai[])
    {
        a = ai;
    }

    public final boolean a(int i)
    {
        return i >= 0 && i < a.length;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(a);
    }

}
