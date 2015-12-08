// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.playback.PlayQueueManager;
import rx.Y;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations

class this._cls0
    implements b
{

    final AdsController this$0;

    public void call(com.soundcloud.android.playback.sition sition)
    {
        if (sition.isPlayerPlaying() || sition.isPaused())
        {
            AdsController.access$300(AdsController.this).unsubscribe();
        } else
        if (sition.wasError() && AdsController.access$100(AdsController.this).isCurrentItemAudioAd())
        {
            AdsController.access$300(AdsController.this).unsubscribe();
            AdsController.access$000(AdsController.this).autoNextItem();
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((com.soundcloud.android.playback.sition)obj);
    }

    eTransition()
    {
        this$0 = AdsController.this;
        super();
    }
}
