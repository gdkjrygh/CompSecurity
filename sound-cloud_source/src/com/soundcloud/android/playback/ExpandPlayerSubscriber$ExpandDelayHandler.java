// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlayerUICommand;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback:
//            ExpandPlayerSubscriber

private static class <init> extends Handler
{

    private EventBus eventBus;

    public void handleMessage(Message message)
    {
        eventBus.publish(EventQueue.PLAYER_COMMAND, PlayerUICommand.expandPlayer());
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromPlayerOpen("track_play"));
    }

    private (EventBus eventbus)
    {
        eventBus = eventbus;
    }

    eventBus(EventBus eventbus, eventBus eventbus1)
    {
        this(eventbus);
    }
}
