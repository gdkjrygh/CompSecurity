// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.java.optional.Optional;
import java.util.Arrays;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiAdsForTrack, ApiAudioAd, AdsOperations

class this._cls0
    implements b
{

    final AdsOperations this$0;

    public void call(ApiAdsForTrack apiadsfortrack)
    {
        apiadsfortrack = apiadsfortrack.audioAd();
        if (apiadsfortrack.isPresent())
        {
            apiadsfortrack = ((ApiAudioAd)apiadsfortrack.get()).getApiTrack();
            AdsOperations.access$000(AdsOperations.this).toAction().call(Arrays.asList(new ApiTrack[] {
                apiadsfortrack
            }));
        }
    }

    public volatile void call(Object obj)
    {
        call((ApiAdsForTrack)obj);
    }

    Command()
    {
        this$0 = AdsOperations.this;
        super();
    }
}
