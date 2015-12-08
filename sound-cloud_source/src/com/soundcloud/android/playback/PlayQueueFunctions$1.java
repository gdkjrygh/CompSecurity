// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem

final class nt
    implements f
{

    public final Boolean call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        return Boolean.valueOf(currentplayqueueitemevent.getCurrentPlayQueueItem().isTrack());
    }

    public final volatile Object call(Object obj)
    {
        return call((CurrentPlayQueueItemEvent)obj);
    }

    nt()
    {
    }
}
