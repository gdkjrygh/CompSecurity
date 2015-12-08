// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class d
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new d(parcel, (byte)0);
        }

        public final Object[] newArray(int i)
        {
            return new d[i];
        }

    };
    private IBinder a;

    public d()
    {
        a = null;
    }

    public d(IBinder ibinder)
    {
        a = null;
        a = ibinder;
    }

    private d(Parcel parcel)
    {
        a = null;
        a = parcel.readStrongBinder();
    }

    d(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(a);
    }

}
