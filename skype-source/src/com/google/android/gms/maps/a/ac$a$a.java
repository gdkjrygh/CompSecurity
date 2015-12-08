// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.PointOfInterest;

// Referenced classes of package com.google.android.gms.maps.a:
//            ac

private static final class a
    implements ac
{

    private IBinder a;

    public final void a(PointOfInterest pointofinterest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnPoiClickListener");
        if (pointofinterest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        pointofinterest.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pointofinterest;
        parcel1.recycle();
        parcel.recycle();
        throw pointofinterest;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    ntOfInterest(IBinder ibinder)
    {
        a = ibinder;
    }
}
