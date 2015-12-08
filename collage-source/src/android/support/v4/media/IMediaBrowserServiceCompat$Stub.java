// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//            IMediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

public static abstract class attachInterface extends Binder
    implements IMediaBrowserServiceCompat
{
    private static class Proxy
        implements IMediaBrowserServiceCompat
    {

        private IBinder mRemote;

        public void addSubscription(String s, IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompat");
            parcel.writeString(s);
            s = obj;
            if (imediabrowserservicecompatcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            s = imediabrowserservicecompatcallbacks.asBinder();
            parcel.writeStrongBinder(s);
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void connect(String s, Bundle bundle, IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompat");
            parcel.writeString(s);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            s = obj;
            if (imediabrowserservicecompatcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_52;
            }
            s = imediabrowserservicecompatcallbacks.asBinder();
            parcel.writeStrongBinder(s);
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            s;
            parcel.recycle();
            throw s;
        }

        public void disconnect(IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompat");
            if (imediabrowserservicecompatcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = imediabrowserservicecompatcallbacks.asBinder();
            parcel.writeStrongBinder(ibinder);
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            imediabrowserservicecompatcallbacks;
            parcel.recycle();
            throw imediabrowserservicecompatcallbacks;
        }

        public String getInterfaceDescriptor()
        {
            return "android.support.v4.media.IMediaBrowserServiceCompat";
        }

        public void getMediaItem(String s, ResultReceiver resultreceiver)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompat");
            parcel.writeString(s);
            if (resultreceiver == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            parcel.writeInt(1);
            resultreceiver.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel.recycle();
            throw s;
        }

        public void removeSubscription(String s, IMediaBrowserServiceCompatCallbacks imediabrowserservicecompatcallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompat");
            parcel.writeString(s);
            s = obj;
            if (imediabrowserservicecompatcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_33;
            }
            s = imediabrowserservicecompatcallbacks.asBinder();
            parcel.writeStrongBinder(s);
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "android.support.v4.media.IMediaBrowserServiceCompat";
    static final int TRANSACTION_addSubscription = 3;
    static final int TRANSACTION_connect = 1;
    static final int TRANSACTION_disconnect = 2;
    static final int TRANSACTION_getMediaItem = 5;
    static final int TRANSACTION_removeSubscription = 4;

    public static IMediaBrowserServiceCompat asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.IMediaBrowserServiceCompat");
        if (iinterface != null && (iinterface instanceof IMediaBrowserServiceCompat))
        {
            return (IMediaBrowserServiceCompat)iinterface;
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
        String s1 = null;
        String s = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("android.support.v4.media.IMediaBrowserServiceCompat");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompat");
            s1 = parcel.readString();
            parcel1 = s;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.cel(parcel);
            }
            connect(s1, parcel1, cks.Stub.asInterface(parcel.readStrongBinder()));
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompat");
            disconnect(cks.Stub.asInterface(parcel.readStrongBinder()));
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompat");
            addSubscription(parcel.readString(), cks.Stub.asInterface(parcel.readStrongBinder()));
            return true;

        case 4: // '\004'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompat");
            removeSubscription(parcel.readString(), cks.Stub.asInterface(parcel.readStrongBinder()));
            return true;

        case 5: // '\005'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompat");
            s = parcel.readString();
            parcel1 = s1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (ResultReceiver)ResultReceiver.CREATOR.cel(parcel);
        }
        getMediaItem(s, parcel1);
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "android.support.v4.media.IMediaBrowserServiceCompat");
    }
}
