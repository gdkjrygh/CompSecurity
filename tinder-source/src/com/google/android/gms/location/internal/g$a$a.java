// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.location.internal:
//            g

private static final class a
    implements g
{

    private IBinder a;

    public final void a(int i, PendingIntent pendingintent)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        parcel.writeInt(1);
        pendingintent.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        pendingintent;
        parcel.recycle();
        throw pendingintent;
    }

    public final void a(int i, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        as;
        parcel.recycle();
        throw as;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(int i, String as[])
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.location.internal.IGeofencerCallbacks");
        parcel.writeInt(i);
        parcel.writeStringArray(as);
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        as;
        parcel.recycle();
        throw as;
    }

    (IBinder ibinder)
    {
        a = ibinder;
    }
}
