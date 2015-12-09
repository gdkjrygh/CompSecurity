// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            INearbyMessagesService, GetPermissionStatusRequest, PublishRequest, RegisterStatusCallbackRequest, 
//            SubscribeRequest, UnpublishRequest, UnsubscribeRequest

private static final class mRemote
    implements INearbyMessagesService
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void getPermissionStatus(GetPermissionStatusRequest getpermissionstatusrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (getpermissionstatusrequest == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        getpermissionstatusrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getpermissionstatusrequest;
        parcel1.recycle();
        parcel.recycle();
        throw getpermissionstatusrequest;
    }

    public final void publish(PublishRequest publishrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (publishrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        publishrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        publishrequest;
        parcel1.recycle();
        parcel.recycle();
        throw publishrequest;
    }

    public final void registerStatusCallback(RegisterStatusCallbackRequest registerstatuscallbackrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (registerstatuscallbackrequest == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        parcel.writeInt(1);
        registerstatuscallbackrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        registerstatuscallbackrequest;
        parcel1.recycle();
        parcel.recycle();
        throw registerstatuscallbackrequest;
    }

    public final void setAppOptedIn(String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        parcel.writeString(s);
        mRemote.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void subscribe(SubscribeRequest subscriberequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (subscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        subscriberequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        subscriberequest;
        parcel1.recycle();
        parcel.recycle();
        throw subscriberequest;
    }

    public final void unpublish(UnpublishRequest unpublishrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unpublishrequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        unpublishrequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unpublishrequest;
        parcel1.recycle();
        parcel.recycle();
        throw unpublishrequest;
    }

    public final void unsubscribe(UnsubscribeRequest unsubscriberequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unsubscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcel.writeInt(1);
        unsubscriberequest.writeToParcel(parcel, 0);
_L1:
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unsubscriberequest;
        parcel1.recycle();
        parcel.recycle();
        throw unsubscriberequest;
    }

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
