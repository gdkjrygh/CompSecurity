// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class ProfileChangedEvent extends MediaPlayerEvent
{

    private final long _position;
    private final long _profile;

    private ProfileChangedEvent(long l, long l1)
    {
        super(MediaPlayerEvent.Type.PROFILE_CHANGED);
        _profile = l;
        _position = l1;
    }

    public static ProfileChangedEvent createProfileChangeEvent(long l, long l1)
    {
        ProfileChangedEvent profilechangedevent = new ProfileChangedEvent(l, l1);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.BITRATE_CHANGE, "Content has changed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("BITRATE", (new StringBuilder()).append(l).append("").toString());
        metadatanode.setValue("CURRENT_MEDIA_TIME", (new StringBuilder()).append(l1).append("").toString());
        info.setMetadata(metadatanode);
        profilechangedevent.setNotification(info);
        return profilechangedevent;
    }

    public long getPosition()
    {
        return _position;
    }

    public long getProfile()
    {
        return _profile;
    }
}
