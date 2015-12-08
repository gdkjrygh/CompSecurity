// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent, MediaPlayerState, MediaPlayerNotification

class VideoStateChangedEvent extends MediaPlayerEvent
{

    private final MediaPlayerState _playerState;

    private VideoStateChangedEvent(MediaPlayerState mediaplayerstate)
    {
        super(MediaPlayerEvent.Type.VIDEO_STATE_CHANGED);
        _playerState = mediaplayerstate;
    }

    public static VideoStateChangedEvent createChangedEvent(MediaPlayerState mediaplayerstate, MediaPlayerNotification mediaplayernotification)
    {
        VideoStateChangedEvent videostatechangedevent = new VideoStateChangedEvent(mediaplayerstate);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.PLAYER_STATE_CHANGE, "Player state has changed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("STATE", mediaplayerstate.name());
        info.setMetadata(metadatanode);
        info.setInnerNotification(mediaplayernotification);
        videostatechangedevent.setNotification(info);
        return videostatechangedevent;
    }

    public MediaPlayerState getPlayerState()
    {
        return _playerState;
    }
}
