// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class SeekEvent extends MediaPlayerEvent
{

    private final long _position;

    private SeekEvent(MediaPlayerEvent.Type type, long l)
    {
        super(type);
        _position = l;
    }

    public static SeekEvent createSeekAdjustCompleted(long l)
    {
        SeekEvent seekevent = new SeekEvent(MediaPlayerEvent.Type.SEEK_ADJUST_COMPLETED, l);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.SEEK_ADJUST_COMPLETE, "Seek adjust operation completed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("SEEK_TIME", (new StringBuilder()).append(l).append("").toString());
        info.setMetadata(metadatanode);
        seekevent.setNotification(info);
        return seekevent;
    }

    public static SeekEvent createSeekCompleted(long l)
    {
        SeekEvent seekevent = new SeekEvent(MediaPlayerEvent.Type.SEEK_COMPLETED, l);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.SEEK_COMPLETE, "Seek operation completed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("SEEK_TIME", (new StringBuilder()).append(l).append("").toString());
        info.setMetadata(metadatanode);
        seekevent.setNotification(info);
        return seekevent;
    }

    public static SeekEvent createSeekStarted(long l)
    {
        SeekEvent seekevent = new SeekEvent(MediaPlayerEvent.Type.SEEK_STARTED, l);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.SEEK_START, "Seek operation started.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("SEEK_TIME", (new StringBuilder()).append(l).append("").toString());
        info.setMetadata(metadatanode);
        seekevent.setNotification(info);
        return seekevent;
    }

    public long getPosition()
    {
        return _position;
    }
}
