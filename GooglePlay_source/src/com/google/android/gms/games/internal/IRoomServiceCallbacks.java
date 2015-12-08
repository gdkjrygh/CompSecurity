// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.games.internal:
//            ConnectionInfo, ConnectionInfoCreator

public interface IRoomServiceCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IRoomServiceCallbacks
    {

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
                parcel1.writeString("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onSentReliableMessage(parcel.readInt(), parcel.readInt(), parcel.readString());
                return true;

            case 1002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRealTimeMessageReceived(parcel.readString(), parcel.createByteArray(), parcel.readInt());
                return true;

            case 1003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomConnecting(parcel.readString());
                return true;

            case 1004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomAutoMatching(parcel.readString());
                return true;

            case 1005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomConnected(parcel.readString());
                return true;

            case 1006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onConnectedToRoom(parcel.readString());
                return true;

            case 1007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onDisconnectedFromRoom(parcel.readString());
                return true;

            case 1008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerInvitedToRoom(parcel.readString(), parcel.createStringArray());
                return true;

            case 1009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerJoinedRoom(parcel.readString(), parcel.createStringArray());
                return true;

            case 1010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerLeftRoom(parcel.readString(), parcel.createStringArray());
                return true;

            case 1011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerDeclined(parcel.readString(), parcel.createStringArray());
                return true;

            case 1012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerConnected(parcel.readString(), parcel.createStringArray());
                return true;

            case 1013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onPeerDisconnected(parcel.readString(), parcel.createStringArray());
                return true;

            case 1014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onP2PConnected(parcel.readString());
                return true;

            case 1015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onP2PDisconnected(parcel.readString());
                return true;

            case 1016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomTornDown();
                return true;

            case 1017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onReportP2pStatus(parcel.readString(), parcel.createStringArray());
                return true;

            case 1018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomLeaveDiagnostics(parcel.readString(), parcel.createByteArray());
                return true;

            case 1019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onRoomUpdated(parcel.readString());
                return true;

            case 1020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onLibrariesLoaded(parcel.readInt());
                return true;

            case 1021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onSetupDone(parcel.readStrongBinder());
                return true;

            case 1022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel1 = ConnectionInfo.CREATOR;
                    parcel = ConnectionInfoCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onNetworkConnected(parcel);
                return true;

            case 1023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onNetworkDisconnected();
                return true;

            case 1024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                onCreateNativeLibjingleSocket(parcel1, parcel.readInt());
                return true;

            case 1025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                onCreateSocketConnection(parcel.readString(), parcel.readInt());
                return true;

            case 1026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IRoomServiceCallbacks");
                parcel1 = parcel.readString();
                break;
            }
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onEnterRoomResult(parcel1, flag);
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IRoomServiceCallbacks");
        }
    }

    private static final class Stub.Proxy
        implements IRoomServiceCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onConnectedToRoom(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1006, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onCreateNativeLibjingleSocket(ParcelFileDescriptor parcelfiledescriptor, int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            mRemote.transact(1024, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            parcelfiledescriptor;
            parcel.recycle();
            throw parcelfiledescriptor;
        }

        public final void onCreateSocketConnection(String s, int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeInt(i);
            mRemote.transact(1025, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onDisconnectedFromRoom(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1007, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onEnterRoomResult(String s, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            mRemote.transact(1026, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onLibrariesLoaded(int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeInt(i);
            mRemote.transact(1020, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void onNetworkConnected(ConnectionInfo connectioninfo)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            if (connectioninfo == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            parcel.writeInt(1);
            connectioninfo.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1022, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            connectioninfo;
            parcel.recycle();
            throw connectioninfo;
        }

        public final void onNetworkDisconnected()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            mRemote.transact(1023, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void onP2PConnected(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1014, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onP2PDisconnected(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1015, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerConnected(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1012, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerDeclined(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1011, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerDisconnected(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1013, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerInvitedToRoom(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1008, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerJoinedRoom(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1009, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onPeerLeftRoom(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1010, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRealTimeMessageReceived(String s, byte abyte0[], int i)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            parcel.writeInt(i);
            mRemote.transact(1002, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onReportP2pStatus(String s, String as[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeStringArray(as);
            mRemote.transact(1017, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRoomAutoMatching(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1004, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRoomConnected(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1005, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRoomConnecting(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1003, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRoomLeaveDiagnostics(String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            mRemote.transact(1018, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onRoomTornDown()
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            mRemote.transact(1016, parcel, null, 1);
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel.recycle();
            throw exception;
        }

        public final void onRoomUpdated(String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeString(s);
            mRemote.transact(1019, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onSentReliableMessage(int i, int j, String s)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeString(s);
            mRemote.transact(1001, parcel, null, 1);
            parcel.recycle();
            return;
            s;
            parcel.recycle();
            throw s;
        }

        public final void onSetupDone(IBinder ibinder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IRoomServiceCallbacks");
            parcel.writeStrongBinder(ibinder);
            mRemote.transact(1021, parcel, null, 1);
            parcel.recycle();
            return;
            ibinder;
            parcel.recycle();
            throw ibinder;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onConnectedToRoom(String s)
        throws RemoteException;

    public abstract void onCreateNativeLibjingleSocket(ParcelFileDescriptor parcelfiledescriptor, int i)
        throws RemoteException;

    public abstract void onCreateSocketConnection(String s, int i)
        throws RemoteException;

    public abstract void onDisconnectedFromRoom(String s)
        throws RemoteException;

    public abstract void onEnterRoomResult(String s, boolean flag)
        throws RemoteException;

    public abstract void onLibrariesLoaded(int i)
        throws RemoteException;

    public abstract void onNetworkConnected(ConnectionInfo connectioninfo)
        throws RemoteException;

    public abstract void onNetworkDisconnected()
        throws RemoteException;

    public abstract void onP2PConnected(String s)
        throws RemoteException;

    public abstract void onP2PDisconnected(String s)
        throws RemoteException;

    public abstract void onPeerConnected(String s, String as[])
        throws RemoteException;

    public abstract void onPeerDeclined(String s, String as[])
        throws RemoteException;

    public abstract void onPeerDisconnected(String s, String as[])
        throws RemoteException;

    public abstract void onPeerInvitedToRoom(String s, String as[])
        throws RemoteException;

    public abstract void onPeerJoinedRoom(String s, String as[])
        throws RemoteException;

    public abstract void onPeerLeftRoom(String s, String as[])
        throws RemoteException;

    public abstract void onRealTimeMessageReceived(String s, byte abyte0[], int i)
        throws RemoteException;

    public abstract void onReportP2pStatus(String s, String as[])
        throws RemoteException;

    public abstract void onRoomAutoMatching(String s)
        throws RemoteException;

    public abstract void onRoomConnected(String s)
        throws RemoteException;

    public abstract void onRoomConnecting(String s)
        throws RemoteException;

    public abstract void onRoomLeaveDiagnostics(String s, byte abyte0[])
        throws RemoteException;

    public abstract void onRoomTornDown()
        throws RemoteException;

    public abstract void onRoomUpdated(String s)
        throws RemoteException;

    public abstract void onSentReliableMessage(int i, int j, String s)
        throws RemoteException;

    public abstract void onSetupDone(IBinder ibinder)
        throws RemoteException;
}
