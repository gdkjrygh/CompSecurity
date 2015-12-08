// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRemoteAndroidKeyStoreCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IRemoteAndroidKeyStoreCallbacks
    {

        private static final String DESCRIPTOR = "org.chromium.net.IRemoteAndroidKeyStoreCallbacks";
        static final int TRANSACTION_onDisabled = 1;
        static final int TRANSACTION_onInitComplete = 2;

        public static IRemoteAndroidKeyStoreCallbacks asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            if (iinterface != null && (iinterface instanceof IRemoteAndroidKeyStoreCallbacks))
            {
                return (IRemoteAndroidKeyStoreCallbacks)iinterface;
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
                parcel1.writeString("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
                onDisabled();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
                onInitComplete();
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
        }
    }

    private static class Stub.Proxy
        implements IRemoteAndroidKeyStoreCallbacks
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "org.chromium.net.IRemoteAndroidKeyStoreCallbacks";
        }

        public void onDisabled()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            mRemote.transact(1, parcel, parcel1, 0);
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

        public void onInitComplete()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.net.IRemoteAndroidKeyStoreCallbacks");
            mRemote.transact(2, parcel, parcel1, 0);
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onDisabled()
        throws RemoteException;

    public abstract void onInitComplete()
        throws RemoteException;
}
