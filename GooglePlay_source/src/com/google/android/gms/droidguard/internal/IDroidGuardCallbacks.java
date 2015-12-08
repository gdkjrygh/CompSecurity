// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.droidguard.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDroidGuardCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IDroidGuardCallbacks
    {

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
                parcel1.writeString("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                onDroidGuardResults(parcel.createByteArray());
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
        }
    }

    private static final class Stub.Proxy
        implements IDroidGuardCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onDroidGuardResults(byte abyte0[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            parcel.writeByteArray(abyte0);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            abyte0;
            parcel.recycle();
            throw abyte0;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onDroidGuardResults(byte abyte0[])
        throws RemoteException;
}
