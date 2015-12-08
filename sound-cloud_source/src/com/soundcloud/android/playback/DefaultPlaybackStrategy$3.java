// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflinePlaybackOperations;
import com.soundcloud.java.collections.PropertySet;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback:
//            DefaultPlaybackStrategy, AudioPlaybackItem

class val.urn
    implements b
{

    final DefaultPlaybackStrategy this$0;
    final Urn val$urn;

    public void call(PropertySet propertyset)
    {
        if (DefaultPlaybackStrategy.access$100(DefaultPlaybackStrategy.this).isCurrentItemAudioAd())
        {
            DefaultPlaybackStrategy.access$000(DefaultPlaybackStrategy.this).play(AudioPlaybackItem.forAudioAd(propertyset));
            return;
        }
        if (DefaultPlaybackStrategy.access$200(DefaultPlaybackStrategy.this).shouldPlayOffline(propertyset))
        {
            DefaultPlaybackStrategy.access$000(DefaultPlaybackStrategy.this).play(AudioPlaybackItem.forOffline(propertyset, DefaultPlaybackStrategy.access$300(DefaultPlaybackStrategy.this, val$urn)));
            return;
        } else
        {
            DefaultPlaybackStrategy.access$000(DefaultPlaybackStrategy.this).play(AudioPlaybackItem.create(propertyset, DefaultPlaybackStrategy.access$300(DefaultPlaybackStrategy.this, val$urn)));
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_defaultplaybackstrategy;
        val$urn = Urn.this;
        super();
    }
}
