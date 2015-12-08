// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class VideoSizeChangedEvent extends MediaPlayerEvent
{

    private final int _height;
    private final int _width;

    private VideoSizeChangedEvent(int i, int j)
    {
        super(MediaPlayerEvent.Type.SIZE_CHANGED);
        _height = i;
        _width = j;
    }

    public static VideoSizeChangedEvent createChangedEvent(int i, int j)
    {
        VideoSizeChangedEvent videosizechangedevent = new VideoSizeChangedEvent(i, j);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.VIDEO_SIZE_CHANGED, "The size of the video has changed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("HEIGHT", (new StringBuilder()).append(i).append("").toString());
        metadatanode.setValue("WIDTH", (new StringBuilder()).append(j).append("").toString());
        info.setMetadata(metadatanode);
        videosizechangedevent.setNotification(info);
        return videosizechangedevent;
    }

    public int getHeight()
    {
        return _height;
    }

    public int getWidth()
    {
        return _width;
    }
}
