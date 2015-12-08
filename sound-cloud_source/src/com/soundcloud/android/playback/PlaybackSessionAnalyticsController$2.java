// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackSessionAnalyticsController, PlaybackProgress, PlayQueueManager, PlayQueueItem, 
//            PlaySessionSource

class val.stateTransition
    implements f
{

    final PlaybackSessionAnalyticsController this$0;
    final call val$stateTransition;

    public PlaybackSessionEvent call(PropertySet propertyset)
    {
        Urn urn = PlaybackSessionAnalyticsController.access$100(PlaybackSessionAnalyticsController.this).getLoggedInUserUrn();
        long l = val$stateTransition.stateTransition().getPosition();
        String s = PlaybackSessionAnalyticsController.access$200(PlaybackSessionAnalyticsController.this, val$stateTransition);
        String s1 = PlaybackSessionAnalyticsController.access$300(PlaybackSessionAnalyticsController.this, val$stateTransition);
        String s2 = PlaybackSessionAnalyticsController.access$400(PlaybackSessionAnalyticsController.this, val$stateTransition);
        boolean flag = PlaybackSessionAnalyticsController.access$500(PlaybackSessionAnalyticsController.this, val$stateTransition);
        PlaybackSessionAnalyticsController.access$002(PlaybackSessionAnalyticsController.this, PlaybackSessionEvent.forPlay(propertyset, urn, PlaybackSessionAnalyticsController.access$600(PlaybackSessionAnalyticsController.this), l, s, s1, s2, flag));
        if (PlaybackSessionAnalyticsController.access$700(PlaybackSessionAnalyticsController.this).isCurrentItemAudioAd())
        {
            PlaybackSessionAnalyticsController.access$802(PlaybackSessionAnalyticsController.this, PlaybackSessionAnalyticsController.access$900(PlaybackSessionAnalyticsController.this).getCurrentPlayQueueItem().getMetaData());
            PlaybackSessionAnalyticsController.access$002(PlaybackSessionAnalyticsController.this, PlaybackSessionAnalyticsController.access$000(PlaybackSessionAnalyticsController.this).withAudioAd(PlaybackSessionAnalyticsController.access$800(PlaybackSessionAnalyticsController.this)));
        } else
        {
            PlayQueueItem playqueueitem = PlaybackSessionAnalyticsController.access$900(PlaybackSessionAnalyticsController.this).getCurrentPlayQueueItem();
            propertyset = PlaybackSessionAnalyticsController.access$900(PlaybackSessionAnalyticsController.this).getCurrentPlaySessionSource();
            if (playqueueitem.isTrack() && PlaybackSessionAnalyticsController.access$900(PlaybackSessionAnalyticsController.this).isTrackFromCurrentPromotedItem(playqueueitem.getUrn()) && propertyset.getPromotedSourceInfo().isFirstPlay())
            {
                PromotedSourceInfo promotedsourceinfo = propertyset.getPromotedSourceInfo();
                PlaybackSessionAnalyticsController.access$002(PlaybackSessionAnalyticsController.this, PlaybackSessionAnalyticsController.access$000(PlaybackSessionAnalyticsController.this).withPromotedTrack(promotedsourceinfo));
                if (!propertyset.getCollectionUrn().isPlaylist())
                {
                    promotedsourceinfo.setAsPlayed();
                }
            }
            PlaybackSessionAnalyticsController.access$802(PlaybackSessionAnalyticsController.this, null);
        }
        return PlaybackSessionAnalyticsController.access$000(PlaybackSessionAnalyticsController.this);
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_playbacksessionanalyticscontroller;
        val$stateTransition = val.stateTransition.this;
        super();
    }
}
