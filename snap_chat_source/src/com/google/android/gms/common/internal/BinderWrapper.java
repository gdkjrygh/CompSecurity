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

        public final Object createFromParcel(Parcel parcel)
        {
            return zzD(parcel);
        }

        public final Object[] newArray(int i)
        {
            return zzaG(i);
        }

        public final BinderWrapper zzD(Parcel parcel)
        {
            return new BinderWrapper(parcel);
        }

        public final BinderWrapper[] zzaG(int i)
        {
            return new BinderWrapper[i];
        }

    };
    private IBinder zzPp;

    public BinderWrapper()
    {
        zzPp = null;
    }

    public BinderWrapper(IBinder ibinder)
    {
        zzPp = null;
        zzPp = ibinder;
    }

    private BinderWrapper(Parcel parcel)
    {
        zzPp = null;
        zzPp = parcel.readStrongBinder();
    }


    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(zzPp);
    }

}
