// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public interface IErrorCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IErrorCallback
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onError(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IErrorCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onError(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IErrorCallback");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onError(Status status)
        throws RemoteException;
}
