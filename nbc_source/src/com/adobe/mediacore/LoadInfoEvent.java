// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.qos.LoadInfo;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class LoadInfoEvent extends MediaPlayerEvent
{

    private final LoadInfo _loadInfo;

    private LoadInfoEvent(LoadInfo loadinfo)
    {
        super(MediaPlayerEvent.Type.LOAD_INFO);
        _loadInfo = loadinfo;
    }

    public static LoadInfoEvent createLoadInfoEvent(LoadInfo loadinfo)
    {
        LoadInfoEvent loadinfoevent = new LoadInfoEvent(loadinfo);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.LOAD_INFO_AVAILABLE, "Fragment load information is available.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("FRAGMENT_URL", loadinfo.getFragmentUrl());
        metadatanode.setValue("FRAGMENT_SIZE", (new StringBuilder()).append(loadinfo.getFragmentSize()).append("").toString());
        metadatanode.setValue("FRAGMENT_DOWNLOAD_DURATION", (new StringBuilder()).append(loadinfo.getDownloadDuration()).append("").toString());
        metadatanode.setValue("PERIOD_INDEX", (new StringBuilder()).append(loadinfo.getPeriodIndex()).append("").toString());
        info.setMetadata(metadatanode);
        loadinfoevent.setNotification(info);
        return loadinfoevent;
    }

    public LoadInfo getLoadInfo()
    {
        return _loadInfo;
    }
}
