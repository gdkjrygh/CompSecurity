// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ki, kh

private static class le
    implements ki
{

    private IBinder le;

    public void a(kh kh1)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
        if (kh1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = kh1.asBinder();
        parcel.writeStrongBinder(ibinder);
        le.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        kh1;
        parcel.recycle();
        throw kh1;
    }

    public IBinder asBinder()
    {
        return le;
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
