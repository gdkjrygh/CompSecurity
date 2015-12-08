// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.presentation;

import com.soundcloud.android.tracks.TrackItemRenderer;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.presentation:
//            PlayableListUpdater, ItemAdapter

public static class eventBus
{

    private final EventBus eventBus;

    public PlayableListUpdater create(ItemAdapter itemadapter, TrackItemRenderer trackitemrenderer)
    {
        return new PlayableListUpdater(eventBus, itemadapter, trackitemrenderer);
    }

    public (EventBus eventbus)
    {
        eventBus = eventbus;
    }
}
