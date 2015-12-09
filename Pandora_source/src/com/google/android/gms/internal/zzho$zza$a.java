// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzho, zzhn

private static class a
    implements zzho
{

    private IBinder a;

    public IBinder asBinder()
    {
        return a;
    }

    public void zza(zzhn zzhn1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
        if (zzhn1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = zzhn1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        zzhn1;
        parcel.recycle();
        throw zzhn1;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
