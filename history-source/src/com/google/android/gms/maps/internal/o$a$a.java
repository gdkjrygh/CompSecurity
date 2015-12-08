// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps.internal:
//            o

private static class le
    implements o
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public void b(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    public void c(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        l1 = null;
          goto _L1
        l1;
        parcel1.recycle();
        parcel.recycle();
        throw l1;
    }

    public void d(l l1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (l1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l1 = l1.asBinder();
_L1:
        parcel.writeStrongBinder(l1);
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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
