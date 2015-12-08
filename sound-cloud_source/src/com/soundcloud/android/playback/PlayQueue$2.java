// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueItem, PlayQueue

class val.urn
    implements Predicate
{

    final PlayQueue this$0;
    final Urn val$urn;

    public boolean apply(PlayQueueItem playqueueitem)
    {
        return playqueueitem.isTrack() && playqueueitem.getUrn().equals(val$urn);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((PlayQueueItem)obj);
    }

    m()
    {
        this$0 = final_playqueue;
        val$urn = Urn.this;
        super();
    }
}
