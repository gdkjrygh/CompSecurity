// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.nearby.internal.connection:
//            INearbyConnectionService, INearbyConnectionCallbacks

public static abstract class Proxy.mRemote extends Binder
    implements INearbyConnectionService
{
    private static final class Proxy
        implements INearbyConnectionService
    {

        private IBinder mRemote;

        public final void acceptConnectionRequest(INearbyConnectionCallbacks inearbyconnectioncallbacks, String s, byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            mRemote.transact(1008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbyconnectioncallbacks = null;
              goto _L1
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
        }

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void clientDisconnecting(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            mRemote.transact(1014, parcel, parcel1, 0);
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

        public final void disconnectFromEndpoint(String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeString(s);
            parcel.writeLong(l);
            mRemote.transact(1012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final String getLocalDeviceId()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            mRemote.transact(1016, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final String getLocalEndpointId(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            mRemote.transact(1015, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void rejectConnectionRequest(INearbyConnectionCallbacks inearbyconnectioncallbacks, String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeString(s);
            parcel.writeLong(l);
            mRemote.transact(1009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbyconnectioncallbacks = null;
              goto _L1
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
        }

        public final void sendConnectionRequest(INearbyConnectionCallbacks inearbyconnectioncallbacks, String s, String s1, byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            mRemote.transact(1007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbyconnectioncallbacks = null;
              goto _L1
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
        }

        public final void sendReliableMessage(String as[], byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeStringArray(as);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            mRemote.transact(1010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public final void sendUnreliableMessage(String as[], byte abyte0[], long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeStringArray(as);
            parcel.writeByteArray(abyte0);
            parcel.writeLong(l);
            mRemote.transact(1011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            as;
            parcel1.recycle();
            parcel.recycle();
            throw as;
        }

        public final void startAdvertising(INearbyConnectionCallbacks inearbyconnectioncallbacks, String s, AppMetadata appmetadata, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null) goto _L2; else goto _L1
_L1:
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeString(s);
            if (appmetadata == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L6:
            parcel.writeLong(l);
            parcel.writeLong(l1);
            mRemote.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            inearbyconnectioncallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
              goto _L5
        }

        public final void startCrossAppDiscoveryRestricted(INearbyConnectionCallbacks inearbyconnectioncallbacks, int i, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeInt(i);
            parcel.writeLong(l);
            parcel.writeLong(l1);
            mRemote.transact(1005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbyconnectioncallbacks = null;
              goto _L1
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
        }

        public final void startDiscovery(INearbyConnectionCallbacks inearbyconnectioncallbacks, String s, long l, long l1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            if (inearbyconnectioncallbacks == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            inearbyconnectioncallbacks = inearbyconnectioncallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(inearbyconnectioncallbacks);
            parcel.writeString(s);
            parcel.writeLong(l);
            parcel.writeLong(l1);
            mRemote.transact(1003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            inearbyconnectioncallbacks = null;
              goto _L1
            inearbyconnectioncallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw inearbyconnectioncallbacks;
        }

        public final void stopAdvertising(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            mRemote.transact(1002, parcel, parcel1, 0);
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

        public final void stopAllEndpoints(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            mRemote.transact(1013, parcel, parcel1, 0);
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

        public final void stopCrossAppDiscoveryRestricted(long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeLong(l);
            mRemote.transact(1006, parcel, parcel1, 0);
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

        public final void stopDiscovery(String s, long l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel.writeString(s);
            parcel.writeLong(l);
            mRemote.transact(1004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static INearbyConnectionService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (iinterface != null && (iinterface instanceof INearbyConnectionService))
        {
            return (INearbyConnectionService)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            return true;

        case 1001: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            INearbyConnectionCallbacks inearbyconnectioncallbacks = b.asInterface(parcel.readStrongBinder());
            String s = parcel.readString();
            AppMetadata appmetadata;
            if (parcel.readInt() != 0)
            {
                appmetadata = (AppMetadata)AppMetadata.CREATOR.arcel(parcel);
            } else
            {
                appmetadata = null;
            }
            startAdvertising(inearbyconnectioncallbacks, s, appmetadata, parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1002: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            stopAdvertising(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1003: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            startDiscovery(b.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1004: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            stopDiscovery(parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1005: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            startCrossAppDiscoveryRestricted(b.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1006: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            stopCrossAppDiscoveryRestricted(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1007: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            sendConnectionRequest(b.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1008: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            acceptConnectionRequest(b.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1009: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            rejectConnectionRequest(b.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1010: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            sendReliableMessage(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1011: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            sendUnreliableMessage(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1012: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            disconnectFromEndpoint(parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1013: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            stopAllEndpoints(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1014: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            clientDisconnecting(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 1015: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel = getLocalEndpointId(parcel.readLong());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 1016: 
            parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
            parcel = getLocalDeviceId();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;
        }
    }
}
