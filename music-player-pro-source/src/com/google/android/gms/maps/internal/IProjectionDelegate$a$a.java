// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.y;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IProjectionDelegate, y, z

private static class le
    implements IProjectionDelegate
{

    private IBinder le;

    public IBinder asBinder()
    {
        return le;
    }

    public LatLng fromScreenLocation(d d1)
        throws RemoteException
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        d1 = d1.asBinder();
_L1:
        parcel.writeStrongBinder(d1);
        le.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        d1 = obj;
        if (parcel1.readInt() != 0)
        {
            d1 = LatLng.CREATOR.de(parcel1);
        }
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

    public LatLng fromScreenLocation2(com.google.android.gms.maps.internal.y y1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        y1.writeToParcel(parcel, 0);
_L3:
        le.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        y1 = LatLng.CREATOR.de(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return y1;
_L2:
        parcel.writeInt(0);
          goto _L3
        y1;
        parcel1.recycle();
        parcel.recycle();
        throw y1;
        y1 = null;
          goto _L4
    }

    public VisibleRegion getVisibleRegion()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        le.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        VisibleRegion visibleregion = VisibleRegion.CREATOR._mthdo(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return visibleregion;
_L2:
        visibleregion = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d toScreenLocation(LatLng latlng)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        le.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = com.google.android.gms.dynamic.e.a.a.le(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return latlng;
        parcel.writeInt(0);
          goto _L1
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
    }

    public com.google.android.gms.maps.internal.y toScreenLocation2(LatLng latlng)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (latlng == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L3:
        le.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        latlng = y.CREATOR.cZ(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return latlng;
_L2:
        parcel.writeInt(0);
          goto _L3
        latlng;
        parcel1.recycle();
        parcel.recycle();
        throw latlng;
        latlng = null;
          goto _L4
    }

    (IBinder ibinder)
    {
        le = ibinder;
    }
}
