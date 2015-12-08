// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import rx.b.g;

final class llectionPlayState
    implements g
{

    public final llectionPlayState call(CurrentPlayQueueItemEvent currentplayqueueitemevent, com.soundcloud.android.playback.n n)
    {
        return new llectionPlayState(currentplayqueueitemevent.getCollectionUrn(), currentplayqueueitemevent.getPosition(), n.getNewState());
    }

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((CurrentPlayQueueItemEvent)obj, (com.soundcloud.android.playback.n)obj1);
    }

    llectionPlayState()
    {
    }
}
