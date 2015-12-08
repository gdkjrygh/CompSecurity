// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            IMediaBrowserServiceCompatCallbacks

private static class mRemote
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

    public void onConnect(String s, android.support.v4.media.session. , Bundle bundle)
        throws RemoteException
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("android.support.v4.media.IMediaBrowserServiceCompatCallbacks");
        parcel.writeString(s);
        if ( == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        .(parcel, 0);
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
