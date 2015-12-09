// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.j;

// Referenced classes of package com.google.android.gms.maps.internal:
//            g

static final class ld
    implements g
{

    private IBinder ld;

    public final void a(j j1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        ld.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final IBinder asBinder()
    {
        return ld;
    }

    public final void onIndoorBuildingFocused()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        ld.transact(1, parcel, parcel1, 0);
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

    j(IBinder ibinder)
    {
        ld = ibinder;
    }
}
