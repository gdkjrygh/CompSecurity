// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dc, db

private static class kq
    implements dc
{

    private IBinder kq;

    public void a(db db1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (db1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        db1 = db1.asBinder();
_L1:
        parcel.writeStrongBinder(db1);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        db1 = null;
          goto _L1
        db1;
        parcel1.recycle();
        parcel.recycle();
        throw db1;
    }

    public IBinder asBinder()
    {
        return kq;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
