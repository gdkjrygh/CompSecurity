// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueueManager, PlayQueueOperations

class this._cls0
    implements a
{

    final PlayQueueManager this$0;

    public void call()
    {
        PlayQueueManager.access$300(PlayQueueManager.this, Urn.forTrack(PlayQueueManager.access$100(PlayQueueManager.this).getLastStoredPlayingTrackId()), PlayQueueManager.access$100(PlayQueueManager.this).getLastStoredSeekPosition());
    }

    ()
    {
        this$0 = PlayQueueManager.this;
        super();
    }
}
