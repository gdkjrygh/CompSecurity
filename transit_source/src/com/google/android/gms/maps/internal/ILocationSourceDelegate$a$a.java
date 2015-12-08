// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ILocationSourceDelegate, g

private static class dG
    implements ILocationSourceDelegate
{

    private IBinder dG;

    public void activate(g g1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g1 = g1.asBinder();
_L1:
        parcel.writeStrongBinder(g1);
        dG.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        g1 = null;
          goto _L1
        g1;
        parcel1.recycle();
        parcel.recycle();
        throw g1;
    }

    public IBinder asBinder()
    {
        return dG;
    }

    public void deactivate()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ILocationSourceDelegate");
        dG.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        dG = ibinder;
    }
}
