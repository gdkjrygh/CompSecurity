// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            IDeviceManagerService, IDeviceManagerCallbacks

private static final class mRemote
    implements IDeviceManagerService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void clearDeviceName(IDeviceManagerCallbacks idevicemanagercallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.IDeviceManagerService");
        if (idevicemanagercallbacks == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        idevicemanagercallbacks = idevicemanagercallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(idevicemanagercallbacks);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        idevicemanagercallbacks = null;
          goto _L1
        idevicemanagercallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw idevicemanagercallbacks;
    }

    public final void getDeviceName(IDeviceManagerCallbacks idevicemanagercallbacks)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.IDeviceManagerService");
        if (idevicemanagercallbacks == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        idevicemanagercallbacks = idevicemanagercallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(idevicemanagercallbacks);
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        idevicemanagercallbacks = null;
          goto _L1
        idevicemanagercallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw idevicemanagercallbacks;
    }

    public final void setDeviceName(IDeviceManagerCallbacks idevicemanagercallbacks, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.mdm.internal.IDeviceManagerService");
        if (idevicemanagercallbacks == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        idevicemanagercallbacks = idevicemanagercallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(idevicemanagercallbacks);
        parcel.writeString(s);
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        idevicemanagercallbacks = null;
          goto _L1
        idevicemanagercallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw idevicemanagercallbacks;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
