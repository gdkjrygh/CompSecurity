// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.internal:
//            IScanListener

public static abstract class Proxy.mRemote extends Binder
    implements IScanListener
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IScanListener asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
        if (iinterface != null && (iinterface instanceof IScanListener))
        {
            return (IScanListener)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            if (parcel.readInt() != 0)
            {
                parcel = (Device)Device.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDeviceFound(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            onScanStopped();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IScanListener");
            onError(parcel.readInt());
            return true;
        }
    }
}
