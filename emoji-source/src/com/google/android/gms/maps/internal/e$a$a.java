// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps.internal:
//            e

private static class kq
    implements e
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public void onCameraChange(CameraPosition cameraposition)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        if (cameraposition == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        cameraposition.writeToParcel(parcel, 0);
_L1:
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        cameraposition;
        parcel1.recycle();
        parcel.recycle();
        throw cameraposition;
    }

    ition(IBinder ibinder)
    {
        kq = ibinder;
    }
}
