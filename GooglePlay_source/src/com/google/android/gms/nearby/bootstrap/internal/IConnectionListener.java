// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.bootstrap.Device;

public interface IConnectionListener
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IConnectionListener
    {

        public static IConnectionListener asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            if (iinterface != null && (iinterface instanceof IConnectionListener))
            {
                return (IConnectionListener)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Device)Device.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                onConnected(parcel1, parcel.createByteArray());
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onDisconnected();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onError(parcel.readInt());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onTokenFailure(parcel.readString());
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onTokenNeeded();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
                onConfirmationRequired(parcel.readString());
                return true;
            }
        }
    }

    private static final class Stub.Proxy
        implements IConnectionListener
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onConfirmationRequired(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            parcel.writeString(s);
            mRemote.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onConnected(Device device, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            if (device == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            parcel.writeInt(1);
            device.writeToParcel(parcel, 0);
_L1:
            parcel.writeByteArray(abyte0);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            device;
            parcel.recycle();
            throw device;
        }

        public final void onDisconnected()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void onError(int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            parcel.writeInt(i);
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void onTokenFailure(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            parcel.writeString(s);
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onTokenNeeded()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.IConnectionListener");
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onConfirmationRequired(String s)
        throws RemoteException;

    public abstract void onConnected(Device device, byte abyte0[])
        throws RemoteException;

    public abstract void onDisconnected()
        throws RemoteException;

    public abstract void onError(int i)
        throws RemoteException;

    public abstract void onTokenFailure(String s)
        throws RemoteException;

    public abstract void onTokenNeeded()
        throws RemoteException;
}
