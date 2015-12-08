// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.VisibleRegion;
import com.google.android.m4b.maps.model.g;
import com.google.android.m4b.maps.model.v;

// Referenced classes of package com.google.android.m4b.maps.df:
//            g

static final class a
    implements com.google.android.m4b.maps.df.g
{

    private IBinder a;

    public final b a(LatLng latlng)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        latlng = com.google.android.m4b.maps.da.a(parcel1.readStrongBinder());
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

    public final LatLng a(b b1)
    {
        Object obj;
        Parcel parcel;
        Parcel parcel1;
        obj = null;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        b1 = b1.asBinder();
_L1:
        parcel.writeStrongBinder(b1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        b1 = obj;
        if (parcel1.readInt() != 0)
        {
            b1 = LatLng.CREATOR;
            b1 = g.a(parcel1);
        }
        parcel1.recycle();
        parcel.recycle();
        return b1;
        b1 = null;
          goto _L1
        b1;
        parcel1.recycle();
        parcel.recycle();
        throw b1;
    }

    public final VisibleRegion a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.m4b.maps.internal.IProjectionDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = VisibleRegion.CREATOR;
        obj = v.a(parcel1);
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

    ibleRegion(IBinder ibinder)
    {
        a = ibinder;
    }
}
