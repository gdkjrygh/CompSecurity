// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            ByteArrayWrapper

public interface IUploadServiceCallback
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IUploadServiceCallback
    {

        public static IUploadServiceCallback asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
            if (iinterface != null && (iinterface instanceof IUploadServiceCallback))
            {
                return (IUploadServiceCallback)iinterface;
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
                parcel1.writeString("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
                String s = parcel.readString();
                ByteArrayWrapper bytearraywrapper = new ByteArrayWrapper();
                onResponseReceived(s, bytearraywrapper, parcel.readInt());
                parcel1.writeNoException();
                parcel1.writeInt(1);
                bytearraywrapper.writeToParcel(parcel1, 1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
                onUploadFailed(parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
        }
    }

    static final class Stub.Proxy
        implements IUploadServiceCallback
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onResponseReceived(String s, ByteArrayWrapper bytearraywrapper, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
            parcel.writeString(s);
            parcel.writeInt(i);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() != 0)
            {
                bytearraywrapper.readFromParcel(parcel1);
            }
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onUploadFailed(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadServiceCallback");
            parcel.writeString(s);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onResponseReceived(String s, ByteArrayWrapper bytearraywrapper, int i)
        throws RemoteException;

    public abstract void onUploadFailed(String s)
        throws RemoteException;
}
