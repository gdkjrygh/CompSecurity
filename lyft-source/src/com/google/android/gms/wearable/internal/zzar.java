// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddLocalCapabilityResponse, ChannelReceiveFileResponse, ChannelSendFileResponse, CloseChannelResponse, 
//            DeleteDataItemsResponse, GetAllCapabilitiesResponse, GetCapabilityResponse, GetChannelInputStreamResponse, 
//            GetChannelOutputStreamResponse, GetCloudSyncOptInOutDoneResponse, GetCloudSyncSettingResponse, GetConfigResponse, 
//            GetConfigsResponse, GetConnectedNodesResponse, GetDataItemResponse, GetFdForAssetResponse, 
//            GetLocalNodeResponse, OpenChannelResponse, PutDataResponse, RemoveLocalCapabilityResponse, 
//            SendMessageResponse, StorageInfoResponse

public interface zzar
    extends IInterface
{

    public abstract void a(Status status);

    public abstract void a(DataHolder dataholder);

    public abstract void a(AddLocalCapabilityResponse addlocalcapabilityresponse);

    public abstract void a(ChannelReceiveFileResponse channelreceivefileresponse);

    public abstract void a(ChannelSendFileResponse channelsendfileresponse);

    public abstract void a(CloseChannelResponse closechannelresponse);

    public abstract void a(DeleteDataItemsResponse deletedataitemsresponse);

    public abstract void a(GetAllCapabilitiesResponse getallcapabilitiesresponse);

    public abstract void a(GetCapabilityResponse getcapabilityresponse);

    public abstract void a(GetChannelInputStreamResponse getchannelinputstreamresponse);

    public abstract void a(GetChannelOutputStreamResponse getchanneloutputstreamresponse);

    public abstract void a(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse);

    public abstract void a(GetCloudSyncSettingResponse getcloudsyncsettingresponse);

    public abstract void a(GetConfigResponse getconfigresponse);

    public abstract void a(GetConfigsResponse getconfigsresponse);

    public abstract void a(GetConnectedNodesResponse getconnectednodesresponse);

    public abstract void a(GetDataItemResponse getdataitemresponse);

    public abstract void a(GetFdForAssetResponse getfdforassetresponse);

    public abstract void a(GetLocalNodeResponse getlocalnoderesponse);

    public abstract void a(OpenChannelResponse openchannelresponse);

    public abstract void a(PutDataResponse putdataresponse);

    public abstract void a(RemoveLocalCapabilityResponse removelocalcapabilityresponse);

    public abstract void a(SendMessageResponse sendmessageresponse);

    public abstract void a(StorageInfoResponse storageinforesponse);

    public abstract void b(CloseChannelResponse closechannelresponse);
}
