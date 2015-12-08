// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;

// Referenced classes of package com.google.android.gms.fitness.request:
//            l

public static abstract class attachInterface extends Binder
    implements l
{
    private static class a
        implements l
    {

        private IBinder le;

        public IBinder asBinder()
        {
            return le;
        }

        public void onDeviceFound(BleDevice bledevice)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
            if (bledevice == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            bledevice.writeToParcel(parcel, 0);
_L1:
            le.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bledevice;
            parcel.recycle();
            throw bledevice;
        }

        public void onScanStopped()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
            le.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public static l aB(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
        if (iinterface != null && (iinterface instanceof l))
        {
            return (l)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            if (parcel.readInt() != 0)
            {
                parcel = (BleDevice)BleDevice.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDeviceFound(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
            onScanStopped();
            return true;
        }
    }

    public a.le()
    {
        attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
    }
}
