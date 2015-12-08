// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
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

public interface crn
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

    public abstract void a(GetCloudSyncOptInStatusResponse getcloudsyncoptinstatusresponse);

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
