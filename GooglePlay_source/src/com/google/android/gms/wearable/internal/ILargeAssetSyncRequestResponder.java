// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public interface ILargeAssetSyncRequestResponder
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ILargeAssetSyncRequestResponder
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                refuse(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
                break;
            }
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            accept(parcelfiledescriptor, parcel.readLong());
            parcel1.writeNoException();
            return true;
        }
    }

    private static final class Stub.Proxy
        implements ILargeAssetSyncRequestResponder
    {

        private IBinder mRemote;

        public final void accept(ParcelFileDescriptor parcelfiledescriptor, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L1:
            parcel.writeLong(l);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelfiledescriptor;
            parcel1.recycle();
            parcel.recycle();
            throw parcelfiledescriptor;
        }

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void refuse(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
            parcel.writeInt(i);
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


    public abstract void accept(ParcelFileDescriptor parcelfiledescriptor, long l)
        throws RemoteException;

    public abstract void refuse(int i)
        throws RemoteException;
}
