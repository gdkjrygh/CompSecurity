// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ISubscribeCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ISubscribeCallback
    {

        public static ISubscribeCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            if (iinterface != null && (iinterface instanceof ISubscribeCallback))
            {
                return (ISubscribeCallback)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
                onExpired();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
        }
    }

    private static final class Stub.Proxy
        implements ISubscribeCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onExpired()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
            mRemote.transact(1, parcel, null, 1);
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


    public abstract void onExpired()
        throws RemoteException;
}
