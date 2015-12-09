// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderWrapper
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new BinderWrapper(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new BinderWrapper[i];
        }

    };
    private IBinder mBinder;

    public BinderWrapper()
    {
        mBinder = null;
    }

    public BinderWrapper(IBinder ibinder)
    {
        mBinder = null;
        mBinder = ibinder;
    }

    private BinderWrapper(Parcel parcel)
    {
        mBinder = null;
        mBinder = parcel.readStrongBinder();
    }

    BinderWrapper(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(mBinder);
    }

}
