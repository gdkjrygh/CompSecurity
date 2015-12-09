// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            INearbySharingService, ProvideContentRequest, StopProvidingContentRequest, TrustedDevicesRequest, 
//            ReceiveContentRequest, INearbySharingCallback

public static abstract class Proxy.mRemote extends Binder
    implements INearbySharingService
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static INearbySharingService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (iinterface != null && (iinterface instanceof INearbySharingService))
        {
            return (INearbySharingService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if (parcel.readInt() != 0)
            {
                parcel = (ProvideContentRequest)ProvideContentRequest.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            provideContent(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if (parcel.readInt() != 0)
            {
                parcel = (StopProvidingContentRequest)StopProvidingContentRequest.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            stopProvidingContent(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if (parcel.readInt() != 0)
            {
                parcel = (TrustedDevicesRequest)TrustedDevicesRequest.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            addTrustedDevice(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            if (parcel.readInt() != 0)
            {
                parcel = (ReceiveContentRequest)ReceiveContentRequest.CREATOR.omParcel(parcel);
            } else
            {
                parcel = null;
            }
            registerContentReceiver(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            resetKeysAndForgetTrustedDevices(.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
