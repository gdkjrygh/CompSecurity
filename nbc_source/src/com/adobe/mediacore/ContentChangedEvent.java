// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class ContentChangedEvent extends MediaPlayerEvent
{

    private final int _contentId;
    private final long _position;

    private ContentChangedEvent(int i, long l)
    {
        super(MediaPlayerEvent.Type.CONTENT_CHANGED);
        _contentId = i;
        _position = l;
    }

    public static ContentChangedEvent createChangeEvent(int i, long l)
    {
        ContentChangedEvent contentchangedevent = new ContentChangedEvent(i, l);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.CONTENT_CHANGE, "Content has changed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("CONTENT_ID", (new StringBuilder()).append(i).append("").toString());
        metadatanode.setValue("CURRENT_MEDIA_TIME", (new StringBuilder()).append(l).append("").toString());
        info.setMetadata(metadatanode);
        contentchangedevent.setNotification(info);
        return contentchangedevent;
    }

    public int getContentId()
    {
        return _contentId;
    }

    public long getPosition()
    {
        return _position;
    }
}
