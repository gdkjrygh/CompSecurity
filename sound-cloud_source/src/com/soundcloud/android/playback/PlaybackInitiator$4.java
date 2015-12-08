// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlaybackInitiator, PlaySessionSource

class val.playSessionSource
    implements f
{

    final PlaybackInitiator this$0;
    final boolean val$loadRelated;
    final PlaySessionSource val$playSessionSource;
    final int val$startPosition;

    public volatile Object call(Object obj)
    {
        return call((PlayQueue)obj);
    }

    public b call(PlayQueue playqueue)
    {
        return PlaybackInitiator.access$000(PlaybackInitiator.this, playqueue, playqueue.getUrn(val$startPosition), val$startPosition, val$loadRelated, val$playSessionSource);
    }

    _cls9()
    {
        this$0 = final_playbackinitiator;
        val$startPosition = i;
        val$loadRelated = flag;
        val$playSessionSource = PlaySessionSource.this;
        super();
    }
}
