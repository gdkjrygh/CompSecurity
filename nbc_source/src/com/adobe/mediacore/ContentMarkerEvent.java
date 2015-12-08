// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class ContentMarkerEvent extends MediaPlayerEvent
{

    private final int _contentId;
    private final long _position;

    private ContentMarkerEvent(int i, long l)
    {
        super(MediaPlayerEvent.Type.CONTENT_MARKER);
        _contentId = i;
        _position = l;
    }

    public static ContentMarkerEvent createContentMarkerEvent(int i, long l)
    {
        ContentMarkerEvent contentmarkerevent = new ContentMarkerEvent(i, l);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.CONTENT_MARKER, "Content marker received.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("CONTENT_ID", (new StringBuilder()).append(i).append("").toString());
        metadatanode.setValue("CURRENT_MEDIA_TIME", (new StringBuilder()).append(l).append("").toString());
        info.setMetadata(metadatanode);
        contentmarkerevent.setNotification(info);
        return contentmarkerevent;
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
