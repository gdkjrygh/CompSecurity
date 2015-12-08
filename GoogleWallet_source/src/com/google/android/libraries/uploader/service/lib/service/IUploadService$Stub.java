// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            IUploadService, IUploadServiceCallback

public static abstract class attachInterface extends Binder
    implements IUploadService
{
    static final class Proxy
        implements IUploadService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final boolean associateCallback(String s, IUploadServiceCallback iuploadservicecallback)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            parcel.writeString(s);
            if (iuploadservicecallback == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            s = iuploadservicecallback.asBinder();
_L1:
            int i;
            parcel.writeStrongBinder(s);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s = null;
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void cancelUpload(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
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

        public final double getUpdate(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            double d;
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            parcel.writeString(s);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            d = parcel1.readDouble();
            parcel1.recycle();
            parcel.recycle();
            return d;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final boolean hasUploadFailed(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            parcel.writeString(s);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onConnect()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            mRemote.transact(7, parcel, parcel1, 0);
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

        public final void onDisconnect()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            mRemote.transact(8, parcel, parcel1, 0);
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

        public final boolean sessionExists(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            parcel.writeString(s);
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i != 0)
            {
                flag = true;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final boolean startUpload(String s, String s1, Uri uri, long l, String s2, IUploadServiceCallback iuploadservicecallback, 
                String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            parcel.writeString(s);
            parcel.writeString(s1);
            if (uri == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L3:
            parcel.writeLong(l);
            parcel.writeString(s2);
            if (iuploadservicecallback == null)
            {
                break MISSING_BLOCK_LABEL_157;
            }
            s = iuploadservicecallback.asBinder();
_L4:
            int i;
            parcel.writeStrongBinder(s);
            parcel.writeString(s3);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            s = null;
              goto _L4
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IUploadService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
        if (iinterface != null && (iinterface instanceof IUploadService))
        {
            return (IUploadService)iinterface;
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
            parcel1.writeString("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            String s = parcel.readString();
            String s1 = parcel.readString();
            Uri uri;
            boolean flag;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.reateFromParcel(parcel);
            } else
            {
                uri = null;
            }
            flag = startUpload(s, s1, uri, parcel.readLong(), parcel.readString(), ck.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            cancelUpload(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            boolean flag1 = associateCallback(parcel.readString(), ck.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            double d = getUpdate(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeDouble(d);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            boolean flag2 = hasUploadFailed(parcel.readString());
            parcel1.writeNoException();
            if (flag2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            boolean flag3 = sessionExists(parcel.readString());
            parcel1.writeNoException();
            if (flag3)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel1.writeInt(i);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            onConnect();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.libraries.uploader.service.lib.service.IUploadService");
            onDisconnect();
            parcel1.writeNoException();
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.libraries.uploader.service.lib.service.IUploadService");
    }
}
