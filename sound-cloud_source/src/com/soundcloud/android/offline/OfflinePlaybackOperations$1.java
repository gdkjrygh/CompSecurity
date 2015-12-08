// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.PlaybackUtils;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflinePlaybackOperations

class val.sessionSource
    implements f
{

    final OfflinePlaybackOperations this$0;
    final int val$position;
    final PlaySessionSource val$sessionSource;
    final Urn val$trackUrn;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        int i = PlaybackUtils.correctInitialPositionLegacy(list, val$position, val$trackUrn);
        if (i < 0)
        {
            return b.just(PlaybackResult.error(com.soundcloud.android.playback.RACK_UNAVAILABLE_OFFLINE));
        } else
        {
            return OfflinePlaybackOperations.access$000(OfflinePlaybackOperations.this).playTracks(list, val$trackUrn, i, val$sessionSource);
        }
    }

    ()
    {
        this$0 = final_offlineplaybackoperations;
        val$position = i;
        val$trackUrn = urn;
        val$sessionSource = PlaySessionSource.this;
        super();
    }
}
