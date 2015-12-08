// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps.internal:
//            m

private static class kq
    implements m
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public void b(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    public void c(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        kq.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    public void d(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    f(IBinder ibinder)
    {
        kq = ibinder;
    }
}
