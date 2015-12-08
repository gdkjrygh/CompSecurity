// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            jd

private static class kq
    implements jd
{

    private IBinder kq;

    public IBinder asBinder()
    {
        return kq;
    }

    public void onAddGeofencesResult(int i, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        kq.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        kq.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pendingintent;
        parcel1.recycle();
        parcel.recycle();
        throw pendingintent;
    }

    public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        kq.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        as;
        parcel1.recycle();
        parcel.recycle();
        throw as;
    }

    (IBinder ibinder)
    {
        kq = ibinder;
    }
}
