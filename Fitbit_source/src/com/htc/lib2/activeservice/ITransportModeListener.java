// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.activeservice:
//            TransportModeRecord

public interface ITransportModeListener
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ITransportModeListener
    {

        private static final String DESCRIPTOR = "com.htc.lib2.activeservice.ITransportModeListener";
        static final int TRANSACTION_onTransportModeChanged = 1;

        public static ITransportModeListener asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.htc.lib2.activeservice.ITransportModeListener");
            if (iinterface != null && (iinterface instanceof ITransportModeListener))
            {
                return (ITransportModeListener)iinterface;
            } else
            {
                return new Proxy(ibinder);
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
                parcel1.writeString("com.htc.lib2.activeservice.ITransportModeListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.htc.lib2.activeservice.ITransportModeListener");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (TransportModeRecord)TransportModeRecord.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onTransportModeChanged(parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.htc.lib2.activeservice.ITransportModeListener");
        }
    }

    private static class Stub.Proxy
        implements ITransportModeListener
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "com.htc.lib2.activeservice.ITransportModeListener";
        }

        public void onTransportModeChanged(TransportModeRecord transportmoderecord)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.lib2.activeservice.ITransportModeListener");
            if (transportmoderecord == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            transportmoderecord.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            transportmoderecord;
            parcel1.recycle();
            parcel.recycle();
            throw transportmoderecord;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onTransportModeChanged(TransportModeRecord transportmoderecord)
        throws RemoteException;
}
