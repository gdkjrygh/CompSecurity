// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.nearby.internal.connection:
//            INearbyConnectionService, INearbyConnectionCallbacks

private static final class mRemote
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
