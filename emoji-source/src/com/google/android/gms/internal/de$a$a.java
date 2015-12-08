// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            de

private static class kq
    implements de
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public IBinder b(d d1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManagerCreator");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        d1 = d1.asBinder();
_L1:
        parcel.writeStrongBinder(d1);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        d1 = parcel1.readStrongBinder();
        parcel1.recycle();
        parcel.recycle();
        return d1;
        d1 = null;
          goto _L1
        d1;
        parcel1.recycle();
        parcel.recycle();
        throw d1;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
