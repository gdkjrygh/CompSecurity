// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent, MediaPlayerNotification

class StateChangedEvent extends MediaPlayerEvent
{

    private final MediaPlayer.PlayerState _currentState;
    private final MediaPlayerNotification _notification;

    private StateChangedEvent(MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
    {
        super(MediaPlayerEvent.Type.STATE_CHANGED);
        _currentState = playerstate;
        _notification = mediaplayernotification;
    }

    public static StateChangedEvent createChangedEvent(MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
    {
        StateChangedEvent statechangedevent = new StateChangedEvent(playerstate, mediaplayernotification);
        MediaPlayerNotification.Info info = new MediaPlayerNotification.Info(MediaPlayerNotification.InfoCode.PLAYER_STATE_CHANGE, "Player state has changed.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("STATE", playerstate.name());
        info.setMetadata(metadatanode);
        info.setInnerNotification(mediaplayernotification);
        statechangedevent.setNotification(info);
        return statechangedevent;
    }

    public MediaPlayer.PlayerState getCurrentState()
    {
        return _currentState;
    }

    public MediaPlayerNotification getNotification()
    {
        return _notification;
    }
}
