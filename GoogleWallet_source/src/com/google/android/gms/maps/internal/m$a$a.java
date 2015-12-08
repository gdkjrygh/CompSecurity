// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.maps.internal:
//            m, IGoogleMapDelegate

static final class ld
    implements m
{

    private IBinder ld;

    public final void a(IGoogleMapDelegate igooglemapdelegate)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnMapReadyCallback");
        if (igooglemapdelegate == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        igooglemapdelegate = igooglemapdelegate.asBinder();
_L1:
        parcel.writeStrongBinder(igooglemapdelegate);
        ld.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igooglemapdelegate = null;
          goto _L1
        igooglemapdelegate;
        parcel1.recycle();
        parcel.recycle();
        throw igooglemapdelegate;
    }

    public final IBinder asBinder()
    {
        return ld;
    }

    eMapDelegate(IBinder ibinder)
    {
        ld = ibinder;
    }
}
