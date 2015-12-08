// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            RecommendedTracksCollection, PlayQueue, PlayQueueOperations

class val.seedTrack
    implements f
{

    final PlayQueueOperations this$0;
    final Urn val$seedTrack;

    public PlayQueue call(RecommendedTracksCollection recommendedtrackscollection)
    {
        if (recommendedtrackscollection.getCollection().isEmpty())
        {
            return PlayQueue.empty();
        } else
        {
            return PlayQueue.fromRecommendationsWithPrependedSeed(val$seedTrack, recommendedtrackscollection);
        }
    }

    public volatile Object call(Object obj)
    {
        return call((RecommendedTracksCollection)obj);
    }

    ction()
    {
        this$0 = final_playqueueoperations;
        val$seedTrack = Urn.this;
        super();
    }
}
