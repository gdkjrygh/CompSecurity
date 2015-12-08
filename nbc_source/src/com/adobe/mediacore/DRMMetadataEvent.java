// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent, DRMMetadataInfo

class DRMMetadataEvent extends MediaPlayerEvent
{

    private final DRMMetadataInfo _drmMetadataInfo;

    private DRMMetadataEvent(DRMMetadataInfo drmmetadatainfo)
    {
        super(MediaPlayerEvent.Type.DRM_METADATA);
        _drmMetadataInfo = drmmetadatainfo;
    }

    public static DRMMetadataEvent createDRMMetadataEvent(DRMMetadataInfo drmmetadatainfo)
    {
        DRMMetadataEvent drmmetadataevent = new DRMMetadataEvent(drmmetadatainfo);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.DRM_METADATA_AVAILABLE, "DRM metadata is available.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("PREFETCH_TIMESTAMP", (new StringBuilder()).append(drmmetadatainfo.getPrefetchTimestamp()).append("").toString());
        info.setMetadata(metadatanode);
        drmmetadataevent.setNotification(info);
        return drmmetadataevent;
    }

    public DRMMetadataInfo getDrmMetadataInfo()
    {
        return _drmMetadataInfo;
    }
}
