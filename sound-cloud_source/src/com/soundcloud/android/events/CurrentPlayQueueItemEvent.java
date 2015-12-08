// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;

// Referenced classes of package com.soundcloud.android.events:
//            AutoValue_CurrentPlayQueueItemEvent

public abstract class CurrentPlayQueueItemEvent
{

    private static final int NEW_QUEUE = 0;
    private static final int POSITION_CHANGED = 1;

    public CurrentPlayQueueItemEvent()
    {
    }

    public static CurrentPlayQueueItemEvent fromNewQueue(PlayQueueItem playqueueitem, Urn urn, int i)
    {
        return new AutoValue_CurrentPlayQueueItemEvent(0, playqueueitem, urn, i);
    }

    public static CurrentPlayQueueItemEvent fromPositionChanged(PlayQueueItem playqueueitem, Urn urn, int i)
    {
        return new AutoValue_CurrentPlayQueueItemEvent(1, playqueueitem, urn, i);
    }

    public abstract Urn getCollectionUrn();

    public abstract PlayQueueItem getCurrentPlayQueueItem();

    public abstract int getKind();

    public abstract int getPosition();
}
