// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            GetPermissionStatusRequest, PublishRequest, RegisterStatusCallbackRequest, SubscribeRequest, 
//            UnpublishRequest, UnsubscribeRequest

public interface INearbyMessagesService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements INearbyMessagesService
    {

        public static INearbyMessagesService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            if (iinterface != null && (iinterface instanceof INearbyMessagesService))
            {
                return (INearbyMessagesService)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (PublishRequest)PublishRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                publish(parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                unpublish(parcel);
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                subscribe(parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                unsubscribe(parcel);
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                setAppOptedIn(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                if (parcel.readInt() != 0)
                {
                    parcel = (GetPermissionStatusRequest)GetPermissionStatusRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                getPermissionStatus(parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (RegisterStatusCallbackRequest)RegisterStatusCallbackRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            registerStatusCallback(parcel);
            parcel1.writeNoException();
            return true;
        }
    }

    private static final class Stub.Proxy
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void getPermissionStatus(GetPermissionStatusRequest getpermissionstatusrequest)
        throws RemoteException;

    public abstract void publish(PublishRequest publishrequest)
        throws RemoteException;

    public abstract void registerStatusCallback(RegisterStatusCallbackRequest registerstatuscallbackrequest)
        throws RemoteException;

    public abstract void setAppOptedIn(String s)
        throws RemoteException;

    public abstract void subscribe(SubscribeRequest subscriberequest)
        throws RemoteException;

    public abstract void unpublish(UnpublishRequest unpublishrequest)
        throws RemoteException;

    public abstract void unsubscribe(UnsubscribeRequest unsubscriberequest)
        throws RemoteException;
}
