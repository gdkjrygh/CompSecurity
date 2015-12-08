// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzbl

static class zzle
    implements zzbl
{

    private IBinder zzle;

    public IBinder asBinder()
    {
        return zzle;
    }

    public long getValue()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        long l;
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
        zzle.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readLong();
        parcel1.recycle();
        parcel.recycle();
        return l;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        zzle = ibinder;
    }
}
