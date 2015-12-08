// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.m;
import com.google.android.gms.maps.model.w;

// Referenced classes of package com.google.android.gms.maps.internal:
//            p, zzy, cu

final class r
    implements p
{

    private IBinder a;

    r(IBinder ibinder)
    {
        a = ibinder;
    }

    public final j a(LatLng latlng)
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
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = k.a(parcel1.readStrongBinder());
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

    public final LatLng a(j j1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        j1 = j1.asBinder();
_L1:
        parcel.writeStrongBinder(j1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        j1 = obj;
        if (parcel1.readInt() != 0)
        {
            j1 = LatLng.CREATOR;
            j1 = m.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return j1;
        j1 = null;
          goto _L1
        j1;
        parcel1.recycle();
        parcel.recycle();
        throw j1;
    }

    public final LatLng a(zzy zzy1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (zzy1 == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        zzy1.writeToParcel(parcel, 0);
_L3:
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        zzy1 = LatLng.CREATOR;
        zzy1 = m.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return zzy1;
_L2:
        parcel.writeInt(0);
          goto _L3
        zzy1;
        parcel1.recycle();
        parcel.recycle();
        throw zzy1;
        zzy1 = null;
          goto _L4
    }

    public final VisibleRegion a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = VisibleRegion.CREATOR;
        obj = w.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return ((VisibleRegion) (obj));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final zzy b(LatLng latlng)
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
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        latlng = zzy.CREATOR;
        latlng = cu.a(parcel1);
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
}
