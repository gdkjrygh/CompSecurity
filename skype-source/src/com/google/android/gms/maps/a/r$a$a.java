// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.a.e;

// Referenced classes of package com.google.android.gms.maps.a:
//            r

private static final class a
    implements r
{

    private IBinder a;

    public final void a()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        a.transact(1, parcel, parcel1, 0);
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

    public final void a(e e1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        e1 = e1.asBinder();
_L1:
        parcel.writeStrongBinder(e1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        e1 = null;
          goto _L1
        e1;
        parcel1.recycle();
        parcel.recycle();
        throw e1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    e(IBinder ibinder)
    {
        a = ibinder;
    }
}
