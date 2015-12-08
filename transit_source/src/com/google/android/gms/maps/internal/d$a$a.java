// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.internal.d;

// Referenced classes of package com.google.android.gms.maps.internal:
//            d

private static class dG
    implements com.google.android.gms.maps.internal.d
{

    private IBinder dG;

    public IBinder asBinder()
    {
        return dG;
    }

    public b f(d d1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d1 = d1.asBinder();
_L1:
        parcel.writeStrongBinder(d1);
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        d1 = com.google.android.gms.dynamic.d.a.a.dG(parcel1.readStrongBinder());
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

    public b g(d d1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        d1 = d1.asBinder();
_L1:
        parcel.writeStrongBinder(d1);
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        d1 = com.google.android.gms.dynamic.d.a.a.dG(parcel1.readStrongBinder());
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

    d(IBinder ibinder)
    {
        dG = ibinder;
    }
}
