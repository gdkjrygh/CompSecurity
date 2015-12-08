// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMessengerCompat
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IMessengerCompat
    {

        public static IMessengerCompat asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (iinterface != null && (iinterface instanceof IMessengerCompat))
            {
                return (IMessengerCompat)iinterface;
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
                parcel1.writeString("com.google.android.gms.iid.IMessengerCompat");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Message)Message.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            send(parcel);
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IMessengerCompat
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void send(Message message)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            if (message == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            message.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            message;
            parcel.recycle();
            throw message;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void send(Message message)
        throws RemoteException;
}
