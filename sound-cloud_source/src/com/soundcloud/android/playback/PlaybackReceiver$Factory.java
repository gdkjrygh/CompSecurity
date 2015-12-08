// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackReceiver, PlayQueueManager, PlaybackService

static class playQueueManager
{

    private final PlayQueueManager playQueueManager;

    PlaybackReceiver create(PlaybackService playbackservice, AccountOperations accountoperations, EventBus eventbus)
    {
        return new PlaybackReceiver(playbackservice, accountoperations, playQueueManager, eventbus, null);
    }

    (PlayQueueManager playqueuemanager)
    {
        playQueueManager = playqueuemanager;
    }
}
