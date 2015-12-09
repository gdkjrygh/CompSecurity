// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.ChannelReceiveFileResponse;
import com.google.android.gms.wearable.internal.ChannelSendFileResponse;
import com.google.android.gms.wearable.internal.CloseChannelResponse;
import com.google.android.gms.wearable.internal.DeleteDataItemsResponse;
import com.google.android.gms.wearable.internal.GetAllCapabilitiesResponse;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import com.google.android.gms.wearable.internal.GetChannelInputStreamResponse;
import com.google.android.gms.wearable.internal.GetChannelOutputStreamResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
import com.google.android.gms.wearable.internal.GetConfigResponse;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
import com.google.android.gms.wearable.internal.GetConnectedNodesResponse;
import com.google.android.gms.wearable.internal.GetDataItemResponse;
import com.google.android.gms.wearable.internal.GetFdForAssetResponse;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.OpenChannelResponse;
import com.google.android.gms.wearable.internal.PutDataResponse;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import com.google.android.gms.wearable.internal.SendMessageResponse;
import com.google.android.gms.wearable.internal.StorageInfoResponse;

public abstract class cro extends Binder
    implements crn
{

    public cro()
    {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static crn a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        if (iinterface != null && (iinterface instanceof crn))
        {
            return (crn)iinterface;
        } else
        {
            return new crp(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
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
                obj = brm.a(parcel);
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
}
