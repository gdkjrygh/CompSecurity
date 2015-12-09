// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.internal:
//            IScanListener

private static final class mRemote
    implements IScanListener
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void onDeviceFound(Device device)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        if (device == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        device.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        device;
        parcel.recycle();
        throw device;
    }

    public final void onError(int i)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        parcel.writeInt(i);
        mRemote.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    public final void onScanStopped()
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        mRemote.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel.recycle();
        throw exception;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
