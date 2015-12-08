// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            IWearableListener, MessageEventParcelable, NodeParcelable, AncsNotificationParcelable, 
//            ChannelEventParcelable, CapabilityInfoParcelable, AmsEntityUpdateParcelable, LargeAssetQueueStateChangeParcelable, 
//            IFileDescriptorReceiver, LargeAssetSyncRequestPayload, ILargeAssetSyncRequestResponder

public static abstract class Proxy.mRemote extends Binder
    implements IWearableListener
{
    private static final class Proxy
        implements IWearableListener
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onChannelEvent(ChannelEventParcelable channeleventparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (channeleventparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            channeleventparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            channeleventparcelable;
            parcel.recycle();
            throw channeleventparcelable;
        }

        public final void onConnectedCapabilityChanged(CapabilityInfoParcelable capabilityinfoparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (capabilityinfoparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            capabilityinfoparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            capabilityinfoparcelable;
            parcel.recycle();
            throw capabilityinfoparcelable;
        }

        public final void onConnectedNodes(List list)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            parcel.writeTypedList(list);
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            list;
            parcel.recycle();
            throw list;
        }

        public final void onDataChanged(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public final void onEntityUpdate(AmsEntityUpdateParcelable amsentityupdateparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (amsentityupdateparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            amsentityupdateparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            amsentityupdateparcelable;
            parcel.recycle();
            throw amsentityupdateparcelable;
        }

        public final void onLargeAssetStateChanged(LargeAssetQueueStateChangeParcelable largeassetqueuestatechangeparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (largeassetqueuestatechangeparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            largeassetqueuestatechangeparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(10, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            largeassetqueuestatechangeparcelable;
            parcel.recycle();
            throw largeassetqueuestatechangeparcelable;
        }

        public final void onLargeAssetSyncRequest(LargeAssetSyncRequestPayload largeassetsyncrequestpayload, ILargeAssetSyncRequestResponder ilargeassetsyncrequestresponder)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (largeassetsyncrequestpayload == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            largeassetsyncrequestpayload.writeToParcel(parcel, 0);
_L4:
            largeassetsyncrequestpayload = obj;
            if (ilargeassetsyncrequestresponder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            largeassetsyncrequestpayload = ilargeassetsyncrequestresponder.asBinder();
            parcel.writeStrongBinder(largeassetsyncrequestpayload);
            mRemote.transact(12, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            largeassetsyncrequestpayload;
            parcel.recycle();
            throw largeassetsyncrequestpayload;
        }

        public final void onMessageReceived(MessageEventParcelable messageeventparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (messageeventparcelable == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            messageeventparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            messageeventparcelable;
            parcel.recycle();
            throw messageeventparcelable;
        }

        public final void onNotificationReceived(AncsNotificationParcelable ancsnotificationparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (ancsnotificationparcelable == null)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            parcel.writeInt(1);
            ancsnotificationparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ancsnotificationparcelable;
            parcel.recycle();
            throw ancsnotificationparcelable;
        }

        public final void onPeerConnected(NodeParcelable nodeparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (nodeparcelable == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            nodeparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nodeparcelable;
            parcel.recycle();
            throw nodeparcelable;
        }

        public final void onPeerDisconnected(NodeParcelable nodeparcelable)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (nodeparcelable == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            nodeparcelable.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nodeparcelable;
            parcel.recycle();
            throw nodeparcelable;
        }

        public final void openFileDescriptor(IFileDescriptorReceiver ifiledescriptorreceiver, String s, int i)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (ifiledescriptorreceiver == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = ifiledescriptorreceiver.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            parcel.writeInt(i);
            mRemote.transact(11, parcel, null, 1);
            parcel.recycle();
            return;
            ifiledescriptorreceiver;
            parcel.recycle();
            throw ifiledescriptorreceiver;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IWearableListener asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        if (iinterface != null && (iinterface instanceof IWearableListener))
        {
            return (IWearableListener)iinterface;
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
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel1 = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDataChanged(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (MessageEventParcelable)MessageEventParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onMessageReceived(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (NodeParcelable)NodeParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onPeerConnected(parcel);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (NodeParcelable)NodeParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onPeerDisconnected(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            onConnectedNodes(parcel.createTypedArrayList(NodeParcelable.CREATOR));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onNotificationReceived(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onChannelEvent(parcel);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onConnectedCapabilityChanged(parcel);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (AmsEntityUpdateParcelable)AmsEntityUpdateParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onEntityUpdate(parcel);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (parcel.readInt() != 0)
            {
                parcel = (LargeAssetQueueStateChangeParcelable)LargeAssetQueueStateChangeParcelable.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onLargeAssetStateChanged(parcel);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = parcel.readStrongBinder();
            if (parcel1 == null)
            {
                parcel1 = null;
            } else
            {
                android.os.IInterface iinterface = parcel1.queryLocalInterface("com.google.android.gms.wearable.internal.IFileDescriptorReceiver");
                if (iinterface != null && (iinterface instanceof IFileDescriptorReceiver))
                {
                    parcel1 = (IFileDescriptorReceiver)iinterface;
                } else
                {
                    parcel1 = new .Stub.Proxy(parcel1);
                }
            }
            openFileDescriptor(parcel1, parcel.readString(), parcel.readInt());
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (LargeAssetSyncRequestPayload)LargeAssetSyncRequestPayload.CREATOR.teFromParcel(parcel);
        } else
        {
            parcel1 = null;
        }
        parcel = parcel.readStrongBinder();
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            android.os.IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.wearable.internal.ILargeAssetSyncRequestResponder");
            if (iinterface1 != null && (iinterface1 instanceof ILargeAssetSyncRequestResponder))
            {
                parcel = (ILargeAssetSyncRequestResponder)iinterface1;
            } else
            {
                parcel = new esponder.Stub.Proxy(parcel);
            }
        }
        onLargeAssetSyncRequest(parcel1, parcel);
        return true;
    }
}
