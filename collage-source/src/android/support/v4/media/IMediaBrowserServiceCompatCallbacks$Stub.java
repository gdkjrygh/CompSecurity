// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            IMediaBrowserServiceCompatCallbacks

public static abstract class attachInterface extends Binder
    implements IMediaBrowserServiceCompatCallbacks
{
    private static class Proxy
        implements IMediaBrowserServiceCompatCallbacks
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public String getInterfaceDescriptor()
        {
            return "android.support.v4.media.IMediaBrowserServiceCompatCallbacks";
        }

        public void onConnect(String s, android.support.v4.media.session.MediaSessionCompat.Token token, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            parcel.writeString(s);
            if (token == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            token.writeToParcel(parcel, 0);
_L3:
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        public void onConnectFailed()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public void onLoadChildren(String s, List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            parcel.writeString(s);
            parcel.writeList(list);
            mRemote.transact(3, parcel, null, 1);
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


    private static final String DESCRIPTOR = "android.support.v4.media.IMediaBrowserServiceCompatCallbacks";
    static final int TRANSACTION_onConnect = 1;
    static final int TRANSACTION_onConnectFailed = 2;
    static final int TRANSACTION_onLoadChildren = 3;

    public static IMediaBrowserServiceCompatCallbacks asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
        if (iinterface != null && (iinterface instanceof IMediaBrowserServiceCompatCallbacks))
        {
            return (IMediaBrowserServiceCompatCallbacks)iinterface;
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
            parcel1.writeString("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel1 = (android.support.v4.media.session.nit>)android.support.v4.media.session.nit>.CREATOR(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.CREATOR(parcel);
            } else
            {
                parcel = null;
            }
            onConnect(s, parcel1, parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            onConnectFailed();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
            onLoadChildren(parcel.readString(), parcel.readArrayList(getClass().getClassLoader()));
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
    }
}
