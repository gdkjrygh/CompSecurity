// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlayQueueManager;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.ads:
//            AdsController, AdsOperations, ApiAdsForTrack

private final class monetizableTrack extends DefaultSubscriber
{

    private final int intendedPosition;
    private final Urn monetizableTrack;
    final AdsController this$0;

    public final void onNext(ApiAdsForTrack apiadsfortrack)
    {
        if (AdsController.access$000(AdsController.this).getCurrentPosition() == intendedPosition)
        {
            AdsController.access$1202(AdsController.this, Optional.of(apiadsfortrack));
            AdsController.access$100(AdsController.this).applyAdToTrack(monetizableTrack, apiadsfortrack);
        }
    }

    public final volatile void onNext(Object obj)
    {
        onNext((ApiAdsForTrack)obj);
    }

    (int i, Urn urn)
    {
        this$0 = AdsController.this;
        super();
        intendedPosition = i;
        monetizableTrack = urn;
    }
}
