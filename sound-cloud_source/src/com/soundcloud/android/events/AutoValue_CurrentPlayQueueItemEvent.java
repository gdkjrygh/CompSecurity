// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueItem;

// Referenced classes of package com.soundcloud.android.events:
//            CurrentPlayQueueItemEvent

final class AutoValue_CurrentPlayQueueItemEvent extends CurrentPlayQueueItemEvent
{

    private final Urn collectionUrn;
    private final PlayQueueItem currentPlayQueueItem;
    private final int kind;
    private final int position;

    AutoValue_CurrentPlayQueueItemEvent(int i, PlayQueueItem playqueueitem, Urn urn, int j)
    {
        kind = i;
        if (playqueueitem == null)
        {
            throw new NullPointerException("Null currentPlayQueueItem");
        }
        currentPlayQueueItem = playqueueitem;
        if (urn == null)
        {
            throw new NullPointerException("Null collectionUrn");
        } else
        {
            collectionUrn = urn;
            position = j;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof CurrentPlayQueueItemEvent)
            {
                if (kind != ((CurrentPlayQueueItemEvent) (obj = (CurrentPlayQueueItemEvent)obj)).getKind() || !currentPlayQueueItem.equals(((CurrentPlayQueueItemEvent) (obj)).getCurrentPlayQueueItem()) || !collectionUrn.equals(((CurrentPlayQueueItemEvent) (obj)).getCollectionUrn()) || position != ((CurrentPlayQueueItemEvent) (obj)).getPosition())
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Urn getCollectionUrn()
    {
        return collectionUrn;
    }

    public final PlayQueueItem getCurrentPlayQueueItem()
    {
        return currentPlayQueueItem;
    }

    public final int getKind()
    {
        return kind;
    }

    public final int getPosition()
    {
        return position;
    }

    public final int hashCode()
    {
        return (((kind ^ 0xf4243) * 0xf4243 ^ currentPlayQueueItem.hashCode()) * 0xf4243 ^ collectionUrn.hashCode()) * 0xf4243 ^ position;
    }

    public final String toString()
    {
        return (new StringBuilder("CurrentPlayQueueItemEvent{kind=")).append(kind).append(", currentPlayQueueItem=").append(currentPlayQueueItem).append(", collectionUrn=").append(collectionUrn).append(", position=").append(position).append("}").toString();
    }
}
