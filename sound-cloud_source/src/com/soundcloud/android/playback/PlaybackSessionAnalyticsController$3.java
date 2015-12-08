// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.PlaybackSessionEvent;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackProgress, PlaybackSessionAnalyticsController

class val.stopReason
    implements f
{

    final PlaybackSessionAnalyticsController this$0;
    final PlaybackSessionEvent val$lastPlayEventData;
    final call val$stateTransition;
    final int val$stopReason;

    public PlaybackSessionEvent call(PropertySet propertyset)
    {
        long l = val$stateTransition.stateTransition().getPosition();
        Object obj = PlaybackSessionAnalyticsController.access$200(PlaybackSessionAnalyticsController.this, val$stateTransition);
        String s = PlaybackSessionAnalyticsController.access$300(PlaybackSessionAnalyticsController.this, val$stateTransition);
        String s1 = PlaybackSessionAnalyticsController.access$400(PlaybackSessionAnalyticsController.this, val$stateTransition);
        boolean flag = PlaybackSessionAnalyticsController.access$500(PlaybackSessionAnalyticsController.this, val$stateTransition);
        obj = PlaybackSessionEvent.forStop(propertyset, PlaybackSessionAnalyticsController.access$100(PlaybackSessionAnalyticsController.this).getLoggedInUserUrn(), PlaybackSessionAnalyticsController.access$600(PlaybackSessionAnalyticsController.this), val$lastPlayEventData, l, ((String) (obj)), s, s1, val$stopReason, flag);
        propertyset = ((PropertySet) (obj));
        if (PlaybackSessionAnalyticsController.access$800(PlaybackSessionAnalyticsController.this) != null)
        {
            propertyset = ((PlaybackSessionEvent) (obj)).withAudioAd(PlaybackSessionAnalyticsController.access$800(PlaybackSessionAnalyticsController.this));
        }
        return propertyset;
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = final_playbacksessionanalyticscontroller;
        val$stateTransition = ;
        val$lastPlayEventData = playbacksessionevent;
        val$stopReason = I.this;
        super();
    }
}
