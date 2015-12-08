// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackResult;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.cast:
//            LocalPlayQueue, CastPlayer

class val.initialTrackUrnCandidate
    implements f
{

    final CastPlayer this$0;
    final Urn val$initialTrackUrnCandidate;
    final PlaySessionSource val$playSessionSource;

    private boolean isInitialTrackDifferent(LocalPlayQueue localplayqueue)
    {
        return val$initialTrackUrnCandidate != Urn.NOT_SET && !val$initialTrackUrnCandidate.equals(localplayqueue.currentTrackUrn);
    }

    public volatile Object call(Object obj)
    {
        return call((LocalPlayQueue)obj);
    }

    public b call(LocalPlayQueue localplayqueue)
    {
        if (localplayqueue.isEmpty() || isInitialTrackDifferent(localplayqueue))
        {
            return b.just(PlaybackResult.error(com.soundcloud.android.playback.t.ErrorReason.TRACK_UNAVAILABLE_CAST));
        } else
        {
            CastPlayer.access$000(CastPlayer.this, new com.soundcloud.android.playback.ransition(com.soundcloud.android.playback.State.BUFFERING, com.soundcloud.android.playback..NONE, localplayqueue.currentTrackUrn));
            CastPlayer.access$100(CastPlayer.this, localplayqueue, val$playSessionSource);
            return b.just(PlaybackResult.success());
        }
    }

    onSource()
    {
        this$0 = final_castplayer;
        val$playSessionSource = playsessionsource;
        val$initialTrackUrnCandidate = Urn.this;
        super();
    }
}
