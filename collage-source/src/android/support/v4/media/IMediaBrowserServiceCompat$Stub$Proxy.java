// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;

// Referenced classes of package android.support.v4.media:
//            IMediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

private static class mRemote
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
