// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps.internal:
//            d

private static class le
    implements com.google.android.gms.maps.internal.d
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public d f(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        l1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return l1;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    public d g(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        l1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return l1;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    l(IBinder ibinder)
    {
        le = ibinder;
    }
}
