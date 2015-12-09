// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            IDeviceManagerService, IDeviceManagerCallbacks

public static abstract class Proxy.mRemote extends Binder
    implements IDeviceManagerService
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IDeviceManagerService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerService");
        if (iinterface != null && (iinterface instanceof IDeviceManagerService))
        {
            return (IDeviceManagerService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.mdm.internal.IDeviceManagerService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.IDeviceManagerService");
            getDeviceName(b.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.IDeviceManagerService");
            setDeviceName(b.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.mdm.internal.IDeviceManagerService");
            clearDeviceName(b.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
