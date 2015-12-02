// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.internal.Point;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

final class auq
    implements auo
{

    private IBinder a;

    auq(IBinder ibinder)
    {
        a = ibinder;
    }

    public final aaf a(LatLng latlng)
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
        latlng = aag.a(parcel1.readStrongBinder());
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

    public final LatLng a(aaf aaf1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (aaf1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        aaf1 = aaf1.asBinder();
_L1:
        parcel.writeStrongBinder(aaf1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        aaf1 = obj;
        if (parcel1.readInt() != 0)
        {
            aaf1 = LatLng.CREATOR;
            aaf1 = azn.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return aaf1;
        aaf1 = null;
          goto _L1
        aaf1;
        parcel1.recycle();
        parcel.recycle();
        throw aaf1;
    }

    public final LatLng a(Point point)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (point == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        point.writeToParcel(parcel, 0);
_L3:
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        point = LatLng.CREATOR;
        point = azn.a(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return point;
_L2:
        parcel.writeInt(0);
          goto _L3
        point;
        parcel1.recycle();
        parcel.recycle();
        throw point;
        point = null;
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
        obj = azx.a(parcel1);
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

    public final Point b(LatLng latlng)
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
        latlng = Point.CREATOR;
        latlng = axv.a(parcel1);
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
