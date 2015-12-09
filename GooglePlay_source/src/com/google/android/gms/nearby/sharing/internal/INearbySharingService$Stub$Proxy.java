// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            INearbySharingService, TrustedDevicesRequest, ProvideContentRequest, ReceiveContentRequest, 
//            INearbySharingCallback, StopProvidingContentRequest

private static final class mRemote
    implements INearbySharingService
{

    private IBinder mRemote;

    public final void addTrustedDevice(TrustedDevicesRequest trusteddevicesrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (trusteddevicesrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        trusteddevicesrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        trusteddevicesrequest;
        parcel1.recycle();
        parcel.recycle();
        throw trusteddevicesrequest;
    }

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void provideContent(ProvideContentRequest providecontentrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (providecontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        providecontentrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        providecontentrequest;
        parcel1.recycle();
        parcel.recycle();
        throw providecontentrequest;
    }

    public final void registerContentReceiver(ReceiveContentRequest receivecontentrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (receivecontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        receivecontentrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        receivecontentrequest;
        parcel1.recycle();
        parcel.recycle();
        throw receivecontentrequest;
    }

    public final void resetKeysAndForgetTrustedDevices(INearbySharingCallback inearbysharingcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (inearbysharingcallback == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        inearbysharingcallback = inearbysharingcallback.asBinder();
_L1:
        parcel.writeStrongBinder(inearbysharingcallback);
        mRemote.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        inearbysharingcallback = null;
          goto _L1
        inearbysharingcallback;
        parcel1.recycle();
        parcel.recycle();
        throw inearbysharingcallback;
    }

    public final void stopProvidingContent(StopProvidingContentRequest stopprovidingcontentrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (stopprovidingcontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        stopprovidingcontentrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        stopprovidingcontentrequest;
        parcel1.recycle();
        parcel.recycle();
        throw stopprovidingcontentrequest;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
