// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.metadata.TimedMetadata;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class TimedMetadataAddedEvent extends MediaPlayerEvent
{

    private static final int DEFAULT_ID = 0;
    private static final String DEFAULT_NAME = "";
    private final TimedMetadata _timedMetadata;

    private TimedMetadataAddedEvent(TimedMetadata timedmetadata, MediaPlayerEvent.Type type)
    {
        super(type);
        _timedMetadata = timedmetadata;
    }

    public static TimedMetadataAddedEvent createAddedEvent(TimedMetadata timedmetadata)
    {
        TimedMetadataAddedEvent timedmetadataaddedevent = new TimedMetadataAddedEvent(timedmetadata, MediaPlayerEvent.Type.TIMED_METADATA_ADDED);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.TIMED_METADATA_ADD, "A new timed metadata was discovered in the manifest.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("TYPE", String.valueOf(timedmetadata.getType()));
        metadatanode.setValue("ID", String.valueOf(timedmetadata.getId()));
        metadatanode.setValue("NAME", timedmetadata.getName());
        metadatanode.setValue("TIME", String.valueOf(timedmetadata.getTime()));
        info.setMetadata(metadatanode);
        timedmetadataaddedevent.setNotification(info);
        return timedmetadataaddedevent;
    }

    public static TimedMetadataAddedEvent createAddedID3Event(Metadata metadata, long l)
    {
        metadata = new TimedMetadata(com.adobe.mediacore.metadata.TimedMetadata.Type.ID3, l, 0L, "", metadata);
        TimedMetadataAddedEvent timedmetadataaddedevent = new TimedMetadataAddedEvent(metadata, MediaPlayerEvent.Type.TIMED_METADATA_ADDED);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.TIMED_METADATA_ADD, "A new id3 timed metadata was discovered in the transport segment.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("TYPE", String.valueOf(metadata.getType()));
        metadatanode.setValue("ID", String.valueOf(metadata.getId()));
        metadatanode.setValue("NAME", metadata.getName());
        metadatanode.setValue("TIME", String.valueOf(metadata.getTime()));
        info.setMetadata(metadatanode);
        timedmetadataaddedevent.setNotification(info);
        return timedmetadataaddedevent;
    }

    public static TimedMetadataAddedEvent createBackgroundAddedEvent(TimedMetadata timedmetadata)
    {
        TimedMetadataAddedEvent timedmetadataaddedevent = new TimedMetadataAddedEvent(timedmetadata, MediaPlayerEvent.Type.TIMED_METADATA_ADDED_IN_BACKGROUND);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.TIMED_METADATA_ADD_IN_BACKGROUND, "A new timed metadata was discovered in the background manifest.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("TYPE", String.valueOf(timedmetadata.getType()));
        metadatanode.setValue("ID", String.valueOf(timedmetadata.getId()));
        metadatanode.setValue("NAME", timedmetadata.getName());
        metadatanode.setValue("TIME", String.valueOf(timedmetadata.getTime()));
        info.setMetadata(metadatanode);
        timedmetadataaddedevent.setNotification(info);
        return timedmetadataaddedevent;
    }

    public TimedMetadata getTimedMetadata()
    {
        return _timedMetadata;
    }
}
