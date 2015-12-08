// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddLocalCapabilityResponse, ChannelReceiveFileResponse, ChannelSendFileResponse, CloseChannelResponse, 
//            DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, GetChannelInputStreamResponse, 
//            GetChannelOutputStreamResponse, GetCloudSyncOptInOutDoneResponse, GetCloudSyncOptInStatusResponse, GetCloudSyncSettingResponse, 
//            GetConfigResponse, GetConfigsResponse, GetConnectedNodesResponse, GetDataItemResponse, 
//            GetFdForAssetResponse, GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, 
//            RemoveLocalCapabilityResponse, SendMessageResponse, StorageInfoResponse

public interface w
    extends IInterface
{
    public static abstract class a extends Binder
        implements w
    {

        public static w a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (iinterface != null && (iinterface instanceof w))
            {
                return (w)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = (GetConfigResponse)GetConfigResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetConfigResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (GetConfigsResponse)GetConfigsResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetConfigsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncOptInOutDoneResponse)GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetCloudSyncOptInOutDoneResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncSettingResponse)GetCloudSyncSettingResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetCloudSyncSettingResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCloudSyncOptInStatusResponse)GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetCloudSyncOptInStatusResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (PutDataResponse)PutDataResponse.CREATOR.createFromParcel(parcel);
                }
                a(((PutDataResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (GetDataItemResponse)GetDataItemResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetDataItemResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = g.a(parcel);
                }
                a(((DataHolder) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (DeleteDataItemsResponse)DeleteDataItemsResponse.CREATOR.createFromParcel(parcel);
                }
                a(((DeleteDataItemsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (SendMessageResponse)SendMessageResponse.CREATOR.createFromParcel(parcel);
                }
                a(((SendMessageResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (GetFdForAssetResponse)GetFdForAssetResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetFdForAssetResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (GetLocalNodeResponse)GetLocalNodeResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetLocalNodeResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (GetConnectedNodesResponse)GetConnectedNodesResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetConnectedNodesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (OpenChannelResponse)OpenChannelResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OpenChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj14;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                a(((CloseChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj15;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(parcel);
                }
                b(((CloseChannelResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj16;
                if (parcel.readInt() != 0)
                {
                    obj = (GetChannelInputStreamResponse)GetChannelInputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetChannelInputStreamResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj17;
                if (parcel.readInt() != 0)
                {
                    obj = (GetChannelOutputStreamResponse)GetChannelOutputStreamResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetChannelOutputStreamResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj18;
                if (parcel.readInt() != 0)
                {
                    obj = (ChannelReceiveFileResponse)ChannelReceiveFileResponse.CREATOR.createFromParcel(parcel);
                }
                a(((ChannelReceiveFileResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj19;
                if (parcel.readInt() != 0)
                {
                    obj = (ChannelSendFileResponse)ChannelSendFileResponse.CREATOR.createFromParcel(parcel);
                }
                a(((ChannelSendFileResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj20;
                if (parcel.readInt() != 0)
                {
                    obj = (Status)Status.CREATOR.createFromParcel(parcel);
                }
                a(((Status) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj21;
                if (parcel.readInt() != 0)
                {
                    obj = (StorageInfoResponse)StorageInfoResponse.CREATOR.createFromParcel(parcel);
                }
                a(((StorageInfoResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj22;
                if (parcel.readInt() != 0)
                {
                    obj = (GetCapabilityResponse)GetCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetCapabilityResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj23;
                if (parcel.readInt() != 0)
                {
                    obj = (GetAllCapabilitiesResponse)GetAllCapabilitiesResponse.CREATOR.createFromParcel(parcel);
                }
                a(((GetAllCapabilitiesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj24;
                if (parcel.readInt() != 0)
                {
                    obj = (AddLocalCapabilityResponse)AddLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
                }
                a(((AddLocalCapabilityResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj25;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (RemoveLocalCapabilityResponse)RemoveLocalCapabilityResponse.CREATOR.createFromParcel(parcel);
            }
            a(((RemoveLocalCapabilityResponse) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }
    }

    private static final class a.a
        implements w
    {

        private IBinder a;

        public final void a(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            a.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        public final void a(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void a(AddLocalCapabilityResponse addlocalcapabilityresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (addlocalcapabilityresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            addlocalcapabilityresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            addlocalcapabilityresponse;
            parcel1.recycle();
            parcel.recycle();
            throw addlocalcapabilityresponse;
        }

        public final void a(ChannelReceiveFileResponse channelreceivefileresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelreceivefileresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            channelreceivefileresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            channelreceivefileresponse;
            parcel1.recycle();
            parcel.recycle();
            throw channelreceivefileresponse;
        }

        public final void a(ChannelSendFileResponse channelsendfileresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (channelsendfileresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            channelsendfileresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            channelsendfileresponse;
            parcel1.recycle();
            parcel.recycle();
            throw channelsendfileresponse;
        }

        public final void a(CloseChannelResponse closechannelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closechannelresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            closechannelresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            closechannelresponse;
            parcel1.recycle();
            parcel.recycle();
            throw closechannelresponse;
        }

        public final void a(DeleteDataItemsResponse deletedataitemsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (deletedataitemsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            deletedataitemsresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            deletedataitemsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw deletedataitemsresponse;
        }

        public final void a(GetAllCapabilitiesResponse getallcapabilitiesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getallcapabilitiesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getallcapabilitiesresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getallcapabilitiesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getallcapabilitiesresponse;
        }

        public final void a(GetCapabilityResponse getcapabilityresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getcapabilityresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getcapabilityresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getcapabilityresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getcapabilityresponse;
        }

        public final void a(GetChannelInputStreamResponse getchannelinputstreamresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getchannelinputstreamresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getchannelinputstreamresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getchannelinputstreamresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getchannelinputstreamresponse;
        }

        public final void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getchanneloutputstreamresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getchanneloutputstreamresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getchanneloutputstreamresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getchanneloutputstreamresponse;
        }

        public final void a(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getcloudsyncoptinoutdoneresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getcloudsyncoptinoutdoneresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getcloudsyncoptinoutdoneresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getcloudsyncoptinoutdoneresponse;
        }

        public final void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getcloudsyncoptinstatusresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getcloudsyncoptinstatusresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getcloudsyncoptinstatusresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getcloudsyncoptinstatusresponse;
        }

        public final void a(GetCloudSyncSettingResponse getcloudsyncsettingresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getcloudsyncsettingresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getcloudsyncsettingresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getcloudsyncsettingresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getcloudsyncsettingresponse;
        }

        public final void a(GetConfigResponse getconfigresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getconfigresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            getconfigresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getconfigresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getconfigresponse;
        }

        public final void a(GetConfigsResponse getconfigsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getconfigsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getconfigsresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getconfigsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getconfigsresponse;
        }

        public final void a(GetConnectedNodesResponse getconnectednodesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getconnectednodesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getconnectednodesresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getconnectednodesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getconnectednodesresponse;
        }

        public final void a(GetDataItemResponse getdataitemresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getdataitemresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            getdataitemresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getdataitemresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getdataitemresponse;
        }

        public final void a(GetFdForAssetResponse getfdforassetresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getfdforassetresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getfdforassetresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getfdforassetresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getfdforassetresponse;
        }

        public final void a(GetLocalNodeResponse getlocalnoderesponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (getlocalnoderesponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getlocalnoderesponse.writeToParcel(parcel, 0);
_L1:
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getlocalnoderesponse;
            parcel1.recycle();
            parcel.recycle();
            throw getlocalnoderesponse;
        }

        public final void a(OpenChannelResponse openchannelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (openchannelresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            openchannelresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            openchannelresponse;
            parcel1.recycle();
            parcel.recycle();
            throw openchannelresponse;
        }

        public final void a(PutDataResponse putdataresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (putdataresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            putdataresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            putdataresponse;
            parcel1.recycle();
            parcel.recycle();
            throw putdataresponse;
        }

        public final void a(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (removelocalcapabilityresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            removelocalcapabilityresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            removelocalcapabilityresponse;
            parcel1.recycle();
            parcel.recycle();
            throw removelocalcapabilityresponse;
        }

        public final void a(SendMessageResponse sendmessageresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (sendmessageresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            sendmessageresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sendmessageresponse;
            parcel1.recycle();
            parcel.recycle();
            throw sendmessageresponse;
        }

        public final void a(StorageInfoResponse storageinforesponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (storageinforesponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            storageinforesponse.writeToParcel(parcel, 0);
_L1:
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            storageinforesponse;
            parcel1.recycle();
            parcel.recycle();
            throw storageinforesponse;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(CloseChannelResponse closechannelresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (closechannelresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            closechannelresponse.writeToParcel(parcel, 0);
_L1:
            a.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            closechannelresponse;
            parcel1.recycle();
            parcel.recycle();
            throw closechannelresponse;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(Status status)
        throws RemoteException;

    public abstract void a(DataHolder dataholder)
        throws RemoteException;

    public abstract void a(AddLocalCapabilityResponse addlocalcapabilityresponse)
        throws RemoteException;

    public abstract void a(ChannelReceiveFileResponse channelreceivefileresponse)
        throws RemoteException;

    public abstract void a(ChannelSendFileResponse channelsendfileresponse)
        throws RemoteException;

    public abstract void a(CloseChannelResponse closechannelresponse)
        throws RemoteException;

    public abstract void a(DeleteDataItemsResponse deletedataitemsresponse)
        throws RemoteException;

    public abstract void a(GetAllCapabilitiesResponse getallcapabilitiesresponse)
        throws RemoteException;

    public abstract void a(GetCapabilityResponse getcapabilityresponse)
        throws RemoteException;

    public abstract void a(GetChannelInputStreamResponse getchannelinputstreamresponse)
        throws RemoteException;

    public abstract void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse)
        throws RemoteException;

    public abstract void a(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse)
        throws RemoteException;

    public abstract void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse)
        throws RemoteException;

    public abstract void a(GetCloudSyncSettingResponse getcloudsyncsettingresponse)
        throws RemoteException;

    public abstract void a(GetConfigResponse getconfigresponse)
        throws RemoteException;

    public abstract void a(GetConfigsResponse getconfigsresponse)
        throws RemoteException;

    public abstract void a(GetConnectedNodesResponse getconnectednodesresponse)
        throws RemoteException;

    public abstract void a(GetDataItemResponse getdataitemresponse)
        throws RemoteException;

    public abstract void a(GetFdForAssetResponse getfdforassetresponse)
        throws RemoteException;

    public abstract void a(GetLocalNodeResponse getlocalnoderesponse)
        throws RemoteException;

    public abstract void a(OpenChannelResponse openchannelresponse)
        throws RemoteException;

    public abstract void a(PutDataResponse putdataresponse)
        throws RemoteException;

    public abstract void a(RemoveLocalCapabilityResponse removelocalcapabilityresponse)
        throws RemoteException;

    public abstract void a(SendMessageResponse sendmessageresponse)
        throws RemoteException;

    public abstract void a(StorageInfoResponse storageinforesponse)
        throws RemoteException;

    public abstract void b(CloseChannelResponse closechannelresponse)
        throws RemoteException;
}
