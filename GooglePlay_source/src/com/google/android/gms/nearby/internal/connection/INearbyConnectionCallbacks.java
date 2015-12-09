// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.internal.connection;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.connection.AppMetadata;

public interface INearbyConnectionCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements INearbyConnectionCallbacks
    {

        public static INearbyConnectionCallbacks asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            if (iinterface != null && (iinterface instanceof INearbyConnectionCallbacks))
            {
                return (INearbyConnectionCallbacks)iinterface;
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
                parcel1.writeString("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onConnectionRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 1002: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onEndpointFound(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 1003: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onEndpointLost(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 1004: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                String s = parcel.readString();
                String s2 = parcel.readString();
                String s3 = parcel.readString();
                String s4 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (AppMetadata)AppMetadata.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onCrossAppEndpointFound(s, s2, s3, s4, parcel);
                parcel1.writeNoException();
                return true;

            case 1005: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onCrossAppEndpointLost(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 1006: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onConnectionResponse(parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel1.writeNoException();
                return true;

            case 1007: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                String s1 = parcel.readString();
                byte abyte0[] = parcel.createByteArray();
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                onMessageReceived(s1, abyte0, flag);
                parcel1.writeNoException();
                return true;

            case 1008: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onDisconnected(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 1009: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onStartAdvertisingResult(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 1010: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onStartDiscoveryResult(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 1011: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onStartCrossAppDiscoveryRestrictedResult(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 1012: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onSendConnectionRequestResult(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 1013: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onAcceptConnectionRequestResult(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 1014: 
                parcel.enforceInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                onRejectConnectionRequestResult(parcel.readInt());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class Stub.Proxy
        implements INearbyConnectionCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onAcceptConnectionRequestResult(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
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

        public final void onConnectionRequest(String s, String s1, String s2, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeByteArray(abyte0);
            mRemote.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onConnectionResponse(String s, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            mRemote.transact(1006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onCrossAppEndpointFound(String s, String s1, String s2, String s3, AppMetadata appmetadata)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            if (appmetadata == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            appmetadata.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onCrossAppEndpointLost(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            mRemote.transact(1005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onDisconnected(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            mRemote.transact(1008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onEndpointFound(String s, String s1, String s2, String s3)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            mRemote.transact(1002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onEndpointLost(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            mRemote.transact(1003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onMessageReceived(String s, byte abyte0[], boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(1007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onRejectConnectionRequestResult(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
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

        public final void onSendConnectionRequestResult(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
            mRemote.transact(1012, parcel, parcel1, 0);
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

        public final void onStartAdvertisingResult(int i, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
            parcel.writeString(s);
            mRemote.transact(1009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onStartCrossAppDiscoveryRestrictedResult(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
            mRemote.transact(1011, parcel, parcel1, 0);
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

        public final void onStartDiscoveryResult(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
            parcel.writeInt(i);
            mRemote.transact(1010, parcel, parcel1, 0);
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

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onAcceptConnectionRequestResult(int i)
        throws RemoteException;

    public abstract void onConnectionRequest(String s, String s1, String s2, byte abyte0[])
        throws RemoteException;

    public abstract void onConnectionResponse(String s, int i, byte abyte0[])
        throws RemoteException;

    public abstract void onCrossAppEndpointFound(String s, String s1, String s2, String s3, AppMetadata appmetadata)
        throws RemoteException;

    public abstract void onCrossAppEndpointLost(String s)
        throws RemoteException;

    public abstract void onDisconnected(String s)
        throws RemoteException;

    public abstract void onEndpointFound(String s, String s1, String s2, String s3)
        throws RemoteException;

    public abstract void onEndpointLost(String s)
        throws RemoteException;

    public abstract void onMessageReceived(String s, byte abyte0[], boolean flag)
        throws RemoteException;

    public abstract void onRejectConnectionRequestResult(int i)
        throws RemoteException;

    public abstract void onSendConnectionRequestResult(int i)
        throws RemoteException;

    public abstract void onStartAdvertisingResult(int i, String s)
        throws RemoteException;

    public abstract void onStartCrossAppDiscoveryRestrictedResult(int i)
        throws RemoteException;

    public abstract void onStartDiscoveryResult(int i)
        throws RemoteException;
}
