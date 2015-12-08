// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.internal.f;

// Referenced classes of package com.google.android.gms.maps.internal:
//            d

private static class kq
    implements com.google.android.gms.maps.internal.d
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public d f(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        f1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return f1;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    public d g(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = com.google.android.gms.dynamic.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return f1;
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
