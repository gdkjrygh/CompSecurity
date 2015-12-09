// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            IWearableListener, ChannelEventParcelable, CapabilityInfoParcelable, AmsEntityUpdateParcelable, 
//            LargeAssetQueueStateChangeParcelable, LargeAssetSyncRequestPayload, ILargeAssetSyncRequestResponder, MessageEventParcelable, 
//            AncsNotificationParcelable, NodeParcelable, IFileDescriptorReceiver

private static final class mRemote
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

    er(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
